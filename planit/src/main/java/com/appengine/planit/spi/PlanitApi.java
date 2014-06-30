package com.appengine.planit.spi;

import static com.appengine.planit.service.OfyService.ofy;

import java.util.Date;
import java.util.List;

import com.appengine.planit.Constants;
import com.appengine.planit.domain.Event;
import com.appengine.planit.domain.Profile;
import com.appengine.planit.form.EventForm;
import com.appengine.planit.form.ProfileForm;
import com.appengine.planit.form.ProfileForm.TeeShirtSize;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.response.UnauthorizedException;
import com.google.appengine.api.users.User;
import com.googlecode.objectify.Key;

/**
 * Defines planit APIs
 */
@Api(name = "planit",
version = "v1",
scopes = { Constants.EMAIL_SCOPE }, 
clientIds = {
		Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID		// specifies what clientIds we want to respond to (i.e., allow to use our application)
},
description = "API for the Conference Central Backend application.")

public class PlanitApi {

	/*
	 * Get the display name from the user's email. For example, if the email is
	 * lemoncake@example.com, then the display name becomes "lemoncake."
	 */
	private static String extractDefaultDisplayNameFromEmail(String email) {
		return email == null ? null : email.substring(0, email.indexOf("@"));
	}

	/**
	 * Creates or updates a Profile object associated with the given user
	 * object.
	 *
	 * @param user
	 *            A User object injected by the cloud endpoints.
	 * @param profileForm
	 *            A ProfileForm object sent from the client form.
	 * @return Profile object just created.
	 * @throws UnauthorizedException
	 *             when the User object is null.
	 */

	// Declare this method as a method available externally though Endpoints
	@ApiMethod(name = "saveProfile", path = "profile", httpMethod = HttpMethod.POST)

	// The request that invokes this method should provide data that 
	// conforms to the fields defined in ProfileForm
	public Profile saveProfile(final User user, ProfileForm profileForm) throws UnauthorizedException {

		String userId = null;
		String displayName = "Your name will go here";
		String mainEmail = null;
		int age = 0;
		TeeShirtSize teeShirtSize = TeeShirtSize.NOT_SPECIFIED;

		// If the user is not logged in, throw an UnauthorizedException
		if (user == null) {
			throw new UnauthorizedException("Authorization required");
		}

		// Get the userId and mainEmail
		mainEmail = user.getEmail();
		userId = user.getUserId();

		// Get the profile attributes from the profile form
		teeShirtSize = profileForm.getTeeShirtSize();
		displayName = profileForm.getDisplayName();
		age = profileForm.getAge();


		// Attempt to load in the users profile from their userId to determine whether they are 
		// creating a new profile or just updating their existing one. 
		Profile profile = ofy().load().key(Key.create(Profile.class, userId)).now();

		// If the profile didn't already exist, we then create a new one... null chekcing the properties as well
		if (profile == null) {

			// Set the teeShirtSize to the value sent by the ProfileForm, if sent
			// otherwise leave it as the default value
			if (teeShirtSize == null) {
				teeShirtSize = TeeShirtSize.NOT_SPECIFIED;
			}


			if (displayName == null) {
				displayName = extractDefaultDisplayNameFromEmail(user.getEmail());
			}

			// Create a new Profile entity from the
			// userId, displayName, mainEmail, age, and teeShirtSize
			profile = new Profile(userId, displayName, mainEmail, age, teeShirtSize);

		} else {

			// If the profile already existed, we update the original one instead
			profile.update(displayName, age, teeShirtSize);
		}

		// Save the Profile entity in the datastore
		ofy().save().entity(profile).now();

		// Return the profile
		return profile;
	}

	/**
	 * Returns a Profile object associated with the given user object. The cloud
	 * endpoints system automatically inject the User object.
	 *
	 * @param user
	 *            A User object injected by the cloud endpoints.
	 * @return Profile object.
	 * @throws UnauthorizedException
	 *             when the User object is null.
	 */
	@ApiMethod(name = "getProfile", path = "profile", httpMethod = HttpMethod.GET)
	public Profile getProfile(final User user) throws UnauthorizedException {
		if (user == null) {
			throw new UnauthorizedException("Authorization required");
		}

		/// load the Profile Entitiy
		String userId = user.getUserId();
		Key key = Key.create(Profile.class, userId);
		Profile profile = (Profile) ofy().load().key(key).now();
		return profile;
	}

	/*
	@ApiMethod(name = "saveEvent", path = "event", httpMethod= HttpMethod.POST)
	public Event saveEvent(final User user, EventForm eventForm) throws UnauthorizedException {
		if (user == null) {
			throw new UnauthorizedException("Authentication required");
		}

		String userId = null;
		String title = null;
		Date startDate = null;
		Date endDate = null;
		String description = null;
		List<String> categories = null;
		User organizer = null;
		List<User> attendees = null;
		int maxAttendees = 0;
		int registrationsAvailable = 0;
		String address1 = null;
		String address2 = null;
		String city =  null;
		String state = null;
		String zipCode = null;

	}
	
	*/
	
	 /**
     * Gets the Profile entity for the current user
     * or creates it if it doesn't exist
     * @param user
     * @return user's Profile
     */
    private static Profile getProfileFromUser(User user) {
        // First fetch the user's Profile from the datastore.
        Profile profile = ofy().load().key(
                Key.create(Profile.class, user.getUserId())).now();
        if (profile == null) {
            // Create a new Profile if it doesn't exist.
            // Use default displayName and teeShirtSize
            String email = user.getEmail();
            profile = new Profile(user.getUserId(),
                    extractDefaultDisplayNameFromEmail(email), email, 0, TeeShirtSize.NOT_SPECIFIED);
        }
        return profile;
    }

/**
     * Creates a new Event object and stores it to the datastore.
     *
     * @param user A user who invokes this method, null when the user is not signed in.
     * @param eventForm A EventForm object representing user's inputs.
     * @return A newly created Even Object.
     * @throws UnauthorizedException when the user is not signed in.
     */
    @ApiMethod(name = "createEvent", path = "event", httpMethod = HttpMethod.POST)
    public Event createEvent(final User user, final EventForm eventForm)
        throws UnauthorizedException {
        if (user == null) {
            throw new UnauthorizedException("Authorization required");
        }

        // TODO (Lesson 4)
        // Get the userId of the logged in User
        String userId = user.getUserId();

        // TODO (Lesson 4)
        // Get the key for the User's Profile
        Key<Profile> profileKey = Key.create(Profile.class, userId);

        // TODO (Lesson 4)
        // Allocate a key for the event -- let App Engine allocate the ID
        // Don't forget to include the parent Profile in the allocated ID
        final Key<Event> eventKey = ofy().factory().allocateId(profileKey, Event.class);

        // TODO (Lesson 4)
        // Get the Event Id from the Key
        final long eventId = eventKey.getId();

        // TODO (Lesson 4)
        // Get the existing Profile entity for the current user if there is one
        // Otherwise create a new Profile entity with default values
        Profile profile = getProfileFromUser(user);

        // TODO (Lesson 4)
        // Create a new Event Entity, specifying the user's Profile entity
        // as the parent of the event
        Event event = new Event(eventId, eventKey.toString(), eventForm);

        // TODO (Lesson 4)
        // Save Event and Profile Entities
        ofy().save().entities(profile, event).now();
         

         return event;
         }

	
}





