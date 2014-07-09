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

package com.appspot.planit_web.planit.model;

/**
 * Model definition for EventForm.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the planit. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EventForm extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address1;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address2;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer attendees;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> categories;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String city;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxAttendees;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organizerUserId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zip;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress1() {
    return address1;
  }

  /**
   * @param address1 address1 or {@code null} for none
   */
  public EventForm setAddress1(java.lang.String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress2() {
    return address2;
  }

  /**
   * @param address2 address2 or {@code null} for none
   */
  public EventForm setAddress2(java.lang.String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAttendees() {
    return attendees;
  }

  /**
   * @param attendees attendees or {@code null} for none
   */
  public EventForm setAttendees(java.lang.Integer attendees) {
    this.attendees = attendees;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCategories() {
    return categories;
  }

  /**
   * @param categories categories or {@code null} for none
   */
  public EventForm setCategories(java.util.List<java.lang.String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * @param city city or {@code null} for none
   */
  public EventForm setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public EventForm setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public EventForm setEndDate(com.google.api.client.util.DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxAttendees() {
    return maxAttendees;
  }

  /**
   * @param maxAttendees maxAttendees or {@code null} for none
   */
  public EventForm setMaxAttendees(java.lang.Integer maxAttendees) {
    this.maxAttendees = maxAttendees;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganizerUserId() {
    return organizerUserId;
  }

  /**
   * @param organizerUserId organizerUserId or {@code null} for none
   */
  public EventForm setOrganizerUserId(java.lang.String organizerUserId) {
    this.organizerUserId = organizerUserId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public EventForm setStartDate(com.google.api.client.util.DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * @param state state or {@code null} for none
   */
  public EventForm setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public EventForm setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getZip() {
    return zip;
  }

  /**
   * @param zip zip or {@code null} for none
   */
  public EventForm setZip(java.lang.String zip) {
    this.zip = zip;
    return this;
  }

  @Override
  public EventForm set(String fieldName, Object value) {
    return (EventForm) super.set(fieldName, value);
  }

  @Override
  public EventForm clone() {
    return (EventForm) super.clone();
  }

}
