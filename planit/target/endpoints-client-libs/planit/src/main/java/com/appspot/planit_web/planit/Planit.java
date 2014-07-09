/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-06-30 15:48:57 UTC)
 * on 2014-07-08 at 17:51:21 UTC 
 * Modify at your own risk.
 */

package com.appspot.planit_web.planit;

/**
 * Service definition for Planit (v1).
 *
 * <p>
 * API for the Conference Central Backend application.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link PlanitRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Planit extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the planit library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://planit-web.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "planit/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Planit(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Planit(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "createEvent".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link CreateEvent#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.appspot.planit_web.planit.model.EventForm}
   * @return the request
   */
  public CreateEvent createEvent(com.appspot.planit_web.planit.model.EventForm content) throws java.io.IOException {
    CreateEvent result = new CreateEvent(content);
    initialize(result);
    return result;
  }

  public class CreateEvent extends PlanitRequest<com.appspot.planit_web.planit.model.Event> {

    private static final String REST_PATH = "event";

    /**
     * Create a request for the method "createEvent".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link CreateEvent#execute()} method to invoke the remote operation. <p>
     * {@link
     * CreateEvent#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.planit_web.planit.model.EventForm}
     * @since 1.13
     */
    protected CreateEvent(com.appspot.planit_web.planit.model.EventForm content) {
      super(Planit.this, "POST", REST_PATH, content, com.appspot.planit_web.planit.model.Event.class);
    }

    @Override
    public CreateEvent setAlt(java.lang.String alt) {
      return (CreateEvent) super.setAlt(alt);
    }

    @Override
    public CreateEvent setFields(java.lang.String fields) {
      return (CreateEvent) super.setFields(fields);
    }

    @Override
    public CreateEvent setKey(java.lang.String key) {
      return (CreateEvent) super.setKey(key);
    }

    @Override
    public CreateEvent setOauthToken(java.lang.String oauthToken) {
      return (CreateEvent) super.setOauthToken(oauthToken);
    }

    @Override
    public CreateEvent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (CreateEvent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public CreateEvent setQuotaUser(java.lang.String quotaUser) {
      return (CreateEvent) super.setQuotaUser(quotaUser);
    }

    @Override
    public CreateEvent setUserIp(java.lang.String userIp) {
      return (CreateEvent) super.setUserIp(userIp);
    }

    @Override
    public CreateEvent set(String parameterName, Object value) {
      return (CreateEvent) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getAnnouncement".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link GetAnnouncement#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetAnnouncement getAnnouncement() throws java.io.IOException {
    GetAnnouncement result = new GetAnnouncement();
    initialize(result);
    return result;
  }

  public class GetAnnouncement extends PlanitRequest<com.appspot.planit_web.planit.model.Announcement> {

    private static final String REST_PATH = "announcement";

    /**
     * Create a request for the method "getAnnouncement".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link GetAnnouncement#execute()} method to invoke the remote operation.
     * <p> {@link GetAnnouncement#initialize(com.google.api.client.googleapis.services.AbstractGoogleC
     * lientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @since 1.13
     */
    protected GetAnnouncement() {
      super(Planit.this, "GET", REST_PATH, null, com.appspot.planit_web.planit.model.Announcement.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetAnnouncement setAlt(java.lang.String alt) {
      return (GetAnnouncement) super.setAlt(alt);
    }

    @Override
    public GetAnnouncement setFields(java.lang.String fields) {
      return (GetAnnouncement) super.setFields(fields);
    }

    @Override
    public GetAnnouncement setKey(java.lang.String key) {
      return (GetAnnouncement) super.setKey(key);
    }

    @Override
    public GetAnnouncement setOauthToken(java.lang.String oauthToken) {
      return (GetAnnouncement) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAnnouncement setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAnnouncement) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAnnouncement setQuotaUser(java.lang.String quotaUser) {
      return (GetAnnouncement) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAnnouncement setUserIp(java.lang.String userIp) {
      return (GetAnnouncement) super.setUserIp(userIp);
    }

    @Override
    public GetAnnouncement set(String parameterName, Object value) {
      return (GetAnnouncement) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getEventsCreated".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link GetEventsCreated#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetEventsCreated getEventsCreated() throws java.io.IOException {
    GetEventsCreated result = new GetEventsCreated();
    initialize(result);
    return result;
  }

  public class GetEventsCreated extends PlanitRequest<com.appspot.planit_web.planit.model.EventCollection> {

    private static final String REST_PATH = "getEventsCreated";

    /**
     * Create a request for the method "getEventsCreated".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link GetEventsCreated#execute()} method to invoke the remote operation.
     * <p> {@link GetEventsCreated#initialize(com.google.api.client.googleapis.services.AbstractGoogle
     * ClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @since 1.13
     */
    protected GetEventsCreated() {
      super(Planit.this, "POST", REST_PATH, null, com.appspot.planit_web.planit.model.EventCollection.class);
    }

    @Override
    public GetEventsCreated setAlt(java.lang.String alt) {
      return (GetEventsCreated) super.setAlt(alt);
    }

    @Override
    public GetEventsCreated setFields(java.lang.String fields) {
      return (GetEventsCreated) super.setFields(fields);
    }

    @Override
    public GetEventsCreated setKey(java.lang.String key) {
      return (GetEventsCreated) super.setKey(key);
    }

    @Override
    public GetEventsCreated setOauthToken(java.lang.String oauthToken) {
      return (GetEventsCreated) super.setOauthToken(oauthToken);
    }

    @Override
    public GetEventsCreated setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetEventsCreated) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetEventsCreated setQuotaUser(java.lang.String quotaUser) {
      return (GetEventsCreated) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetEventsCreated setUserIp(java.lang.String userIp) {
      return (GetEventsCreated) super.setUserIp(userIp);
    }

    @Override
    public GetEventsCreated set(String parameterName, Object value) {
      return (GetEventsCreated) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getEventsToAttend".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link GetEventsToAttend#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetEventsToAttend getEventsToAttend() throws java.io.IOException {
    GetEventsToAttend result = new GetEventsToAttend();
    initialize(result);
    return result;
  }

  public class GetEventsToAttend extends PlanitRequest<com.appspot.planit_web.planit.model.EventCollection> {

    private static final String REST_PATH = "getEventsToAttend";

    /**
     * Create a request for the method "getEventsToAttend".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link GetEventsToAttend#execute()} method to invoke the remote operation.
     * <p> {@link GetEventsToAttend#initialize(com.google.api.client.googleapis.services.AbstractGoogl
     * eClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @since 1.13
     */
    protected GetEventsToAttend() {
      super(Planit.this, "GET", REST_PATH, null, com.appspot.planit_web.planit.model.EventCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetEventsToAttend setAlt(java.lang.String alt) {
      return (GetEventsToAttend) super.setAlt(alt);
    }

    @Override
    public GetEventsToAttend setFields(java.lang.String fields) {
      return (GetEventsToAttend) super.setFields(fields);
    }

    @Override
    public GetEventsToAttend setKey(java.lang.String key) {
      return (GetEventsToAttend) super.setKey(key);
    }

    @Override
    public GetEventsToAttend setOauthToken(java.lang.String oauthToken) {
      return (GetEventsToAttend) super.setOauthToken(oauthToken);
    }

    @Override
    public GetEventsToAttend setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetEventsToAttend) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetEventsToAttend setQuotaUser(java.lang.String quotaUser) {
      return (GetEventsToAttend) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetEventsToAttend setUserIp(java.lang.String userIp) {
      return (GetEventsToAttend) super.setUserIp(userIp);
    }

    @Override
    public GetEventsToAttend set(String parameterName, Object value) {
      return (GetEventsToAttend) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getProfile".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link GetProfile#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetProfile getProfile() throws java.io.IOException {
    GetProfile result = new GetProfile();
    initialize(result);
    return result;
  }

  public class GetProfile extends PlanitRequest<com.appspot.planit_web.planit.model.Profile> {

    private static final String REST_PATH = "profile";

    /**
     * Create a request for the method "getProfile".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link GetProfile#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetProfile#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetProfile() {
      super(Planit.this, "GET", REST_PATH, null, com.appspot.planit_web.planit.model.Profile.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetProfile setAlt(java.lang.String alt) {
      return (GetProfile) super.setAlt(alt);
    }

    @Override
    public GetProfile setFields(java.lang.String fields) {
      return (GetProfile) super.setFields(fields);
    }

    @Override
    public GetProfile setKey(java.lang.String key) {
      return (GetProfile) super.setKey(key);
    }

    @Override
    public GetProfile setOauthToken(java.lang.String oauthToken) {
      return (GetProfile) super.setOauthToken(oauthToken);
    }

    @Override
    public GetProfile setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetProfile) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetProfile setQuotaUser(java.lang.String quotaUser) {
      return (GetProfile) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetProfile setUserIp(java.lang.String userIp) {
      return (GetProfile) super.setUserIp(userIp);
    }

    @Override
    public GetProfile set(String parameterName, Object value) {
      return (GetProfile) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "queryEvents".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link QueryEvents#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.appspot.planit_web.planit.model.EventQueryForm}
   * @return the request
   */
  public QueryEvents queryEvents(com.appspot.planit_web.planit.model.EventQueryForm content) throws java.io.IOException {
    QueryEvents result = new QueryEvents(content);
    initialize(result);
    return result;
  }

  public class QueryEvents extends PlanitRequest<com.appspot.planit_web.planit.model.EventCollection> {

    private static final String REST_PATH = "queryEvents";

    /**
     * Create a request for the method "queryEvents".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link QueryEvents#execute()} method to invoke the remote operation. <p>
     * {@link
     * QueryEvents#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.planit_web.planit.model.EventQueryForm}
     * @since 1.13
     */
    protected QueryEvents(com.appspot.planit_web.planit.model.EventQueryForm content) {
      super(Planit.this, "POST", REST_PATH, content, com.appspot.planit_web.planit.model.EventCollection.class);
    }

    @Override
    public QueryEvents setAlt(java.lang.String alt) {
      return (QueryEvents) super.setAlt(alt);
    }

    @Override
    public QueryEvents setFields(java.lang.String fields) {
      return (QueryEvents) super.setFields(fields);
    }

    @Override
    public QueryEvents setKey(java.lang.String key) {
      return (QueryEvents) super.setKey(key);
    }

    @Override
    public QueryEvents setOauthToken(java.lang.String oauthToken) {
      return (QueryEvents) super.setOauthToken(oauthToken);
    }

    @Override
    public QueryEvents setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (QueryEvents) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public QueryEvents setQuotaUser(java.lang.String quotaUser) {
      return (QueryEvents) super.setQuotaUser(quotaUser);
    }

    @Override
    public QueryEvents setUserIp(java.lang.String userIp) {
      return (QueryEvents) super.setUserIp(userIp);
    }

    @Override
    public QueryEvents set(String parameterName, Object value) {
      return (QueryEvents) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "queryEventsCustomFilter".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link QueryEventsCustomFilter#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public QueryEventsCustomFilter queryEventsCustomFilter() throws java.io.IOException {
    QueryEventsCustomFilter result = new QueryEventsCustomFilter();
    initialize(result);
    return result;
  }

  public class QueryEventsCustomFilter extends PlanitRequest<com.appspot.planit_web.planit.model.EventCollection> {

    private static final String REST_PATH = "queryEventsCustomFilter";

    /**
     * Create a request for the method "queryEventsCustomFilter".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link QueryEventsCustomFilter#execute()} method to invoke the remote
     * operation. <p> {@link QueryEventsCustomFilter#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected QueryEventsCustomFilter() {
      super(Planit.this, "POST", REST_PATH, null, com.appspot.planit_web.planit.model.EventCollection.class);
    }

    @Override
    public QueryEventsCustomFilter setAlt(java.lang.String alt) {
      return (QueryEventsCustomFilter) super.setAlt(alt);
    }

    @Override
    public QueryEventsCustomFilter setFields(java.lang.String fields) {
      return (QueryEventsCustomFilter) super.setFields(fields);
    }

    @Override
    public QueryEventsCustomFilter setKey(java.lang.String key) {
      return (QueryEventsCustomFilter) super.setKey(key);
    }

    @Override
    public QueryEventsCustomFilter setOauthToken(java.lang.String oauthToken) {
      return (QueryEventsCustomFilter) super.setOauthToken(oauthToken);
    }

    @Override
    public QueryEventsCustomFilter setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (QueryEventsCustomFilter) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public QueryEventsCustomFilter setQuotaUser(java.lang.String quotaUser) {
      return (QueryEventsCustomFilter) super.setQuotaUser(quotaUser);
    }

    @Override
    public QueryEventsCustomFilter setUserIp(java.lang.String userIp) {
      return (QueryEventsCustomFilter) super.setUserIp(userIp);
    }

    @Override
    public QueryEventsCustomFilter set(String parameterName, Object value) {
      return (QueryEventsCustomFilter) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "registerForEvent".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link RegisterForEvent#execute()} method to invoke the remote operation.
   *
   * @param websafeEventKey
   * @return the request
   */
  public RegisterForEvent registerForEvent(java.lang.String websafeEventKey) throws java.io.IOException {
    RegisterForEvent result = new RegisterForEvent(websafeEventKey);
    initialize(result);
    return result;
  }

  public class RegisterForEvent extends PlanitRequest<com.appspot.planit_web.planit.model.WrappedBoolean> {

    private static final String REST_PATH = "event/{websafeEventKey}/registration";

    /**
     * Create a request for the method "registerForEvent".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link RegisterForEvent#execute()} method to invoke the remote operation.
     * <p> {@link RegisterForEvent#initialize(com.google.api.client.googleapis.services.AbstractGoogle
     * ClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param websafeEventKey
     * @since 1.13
     */
    protected RegisterForEvent(java.lang.String websafeEventKey) {
      super(Planit.this, "POST", REST_PATH, null, com.appspot.planit_web.planit.model.WrappedBoolean.class);
      this.websafeEventKey = com.google.api.client.util.Preconditions.checkNotNull(websafeEventKey, "Required parameter websafeEventKey must be specified.");
    }

    @Override
    public RegisterForEvent setAlt(java.lang.String alt) {
      return (RegisterForEvent) super.setAlt(alt);
    }

    @Override
    public RegisterForEvent setFields(java.lang.String fields) {
      return (RegisterForEvent) super.setFields(fields);
    }

    @Override
    public RegisterForEvent setKey(java.lang.String key) {
      return (RegisterForEvent) super.setKey(key);
    }

    @Override
    public RegisterForEvent setOauthToken(java.lang.String oauthToken) {
      return (RegisterForEvent) super.setOauthToken(oauthToken);
    }

    @Override
    public RegisterForEvent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RegisterForEvent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RegisterForEvent setQuotaUser(java.lang.String quotaUser) {
      return (RegisterForEvent) super.setQuotaUser(quotaUser);
    }

    @Override
    public RegisterForEvent setUserIp(java.lang.String userIp) {
      return (RegisterForEvent) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String websafeEventKey;

    /**

     */
    public java.lang.String getWebsafeEventKey() {
      return websafeEventKey;
    }

    public RegisterForEvent setWebsafeEventKey(java.lang.String websafeEventKey) {
      this.websafeEventKey = websafeEventKey;
      return this;
    }

    @Override
    public RegisterForEvent set(String parameterName, Object value) {
      return (RegisterForEvent) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "saveProfile".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link SaveProfile#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.appspot.planit_web.planit.model.ProfileForm}
   * @return the request
   */
  public SaveProfile saveProfile(com.appspot.planit_web.planit.model.ProfileForm content) throws java.io.IOException {
    SaveProfile result = new SaveProfile(content);
    initialize(result);
    return result;
  }

  public class SaveProfile extends PlanitRequest<com.appspot.planit_web.planit.model.Profile> {

    private static final String REST_PATH = "profile";

    /**
     * Create a request for the method "saveProfile".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link SaveProfile#execute()} method to invoke the remote operation. <p>
     * {@link
     * SaveProfile#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.planit_web.planit.model.ProfileForm}
     * @since 1.13
     */
    protected SaveProfile(com.appspot.planit_web.planit.model.ProfileForm content) {
      super(Planit.this, "POST", REST_PATH, content, com.appspot.planit_web.planit.model.Profile.class);
    }

    @Override
    public SaveProfile setAlt(java.lang.String alt) {
      return (SaveProfile) super.setAlt(alt);
    }

    @Override
    public SaveProfile setFields(java.lang.String fields) {
      return (SaveProfile) super.setFields(fields);
    }

    @Override
    public SaveProfile setKey(java.lang.String key) {
      return (SaveProfile) super.setKey(key);
    }

    @Override
    public SaveProfile setOauthToken(java.lang.String oauthToken) {
      return (SaveProfile) super.setOauthToken(oauthToken);
    }

    @Override
    public SaveProfile setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SaveProfile) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SaveProfile setQuotaUser(java.lang.String quotaUser) {
      return (SaveProfile) super.setQuotaUser(quotaUser);
    }

    @Override
    public SaveProfile setUserIp(java.lang.String userIp) {
      return (SaveProfile) super.setUserIp(userIp);
    }

    @Override
    public SaveProfile set(String parameterName, Object value) {
      return (SaveProfile) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "unregisterFromEvent".
   *
   * This request holds the parameters needed by the planit server.  After setting any optional
   * parameters, call the {@link UnregisterFromEvent#execute()} method to invoke the remote operation.
   *
   * @param websafeEventKey
   * @return the request
   */
  public UnregisterFromEvent unregisterFromEvent(java.lang.String websafeEventKey) throws java.io.IOException {
    UnregisterFromEvent result = new UnregisterFromEvent(websafeEventKey);
    initialize(result);
    return result;
  }

  public class UnregisterFromEvent extends PlanitRequest<com.appspot.planit_web.planit.model.WrappedBoolean> {

    private static final String REST_PATH = "event/{websafeEventKey}/registration";

    /**
     * Create a request for the method "unregisterFromEvent".
     *
     * This request holds the parameters needed by the the planit server.  After setting any optional
     * parameters, call the {@link UnregisterFromEvent#execute()} method to invoke the remote
     * operation. <p> {@link UnregisterFromEvent#initialize(com.google.api.client.googleapis.services.
     * AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param websafeEventKey
     * @since 1.13
     */
    protected UnregisterFromEvent(java.lang.String websafeEventKey) {
      super(Planit.this, "DELETE", REST_PATH, null, com.appspot.planit_web.planit.model.WrappedBoolean.class);
      this.websafeEventKey = com.google.api.client.util.Preconditions.checkNotNull(websafeEventKey, "Required parameter websafeEventKey must be specified.");
    }

    @Override
    public UnregisterFromEvent setAlt(java.lang.String alt) {
      return (UnregisterFromEvent) super.setAlt(alt);
    }

    @Override
    public UnregisterFromEvent setFields(java.lang.String fields) {
      return (UnregisterFromEvent) super.setFields(fields);
    }

    @Override
    public UnregisterFromEvent setKey(java.lang.String key) {
      return (UnregisterFromEvent) super.setKey(key);
    }

    @Override
    public UnregisterFromEvent setOauthToken(java.lang.String oauthToken) {
      return (UnregisterFromEvent) super.setOauthToken(oauthToken);
    }

    @Override
    public UnregisterFromEvent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UnregisterFromEvent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UnregisterFromEvent setQuotaUser(java.lang.String quotaUser) {
      return (UnregisterFromEvent) super.setQuotaUser(quotaUser);
    }

    @Override
    public UnregisterFromEvent setUserIp(java.lang.String userIp) {
      return (UnregisterFromEvent) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String websafeEventKey;

    /**

     */
    public java.lang.String getWebsafeEventKey() {
      return websafeEventKey;
    }

    public UnregisterFromEvent setWebsafeEventKey(java.lang.String websafeEventKey) {
      this.websafeEventKey = websafeEventKey;
      return this;
    }

    @Override
    public UnregisterFromEvent set(String parameterName, Object value) {
      return (UnregisterFromEvent) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Planit}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Planit}. */
    @Override
    public Planit build() {
      return new Planit(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link PlanitRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setPlanitRequestInitializer(
        PlanitRequestInitializer planitRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(planitRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
