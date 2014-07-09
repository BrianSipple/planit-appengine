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
 * Model definition for WrappedBoolean.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the planit. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WrappedBoolean extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean result;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * @param reason reason or {@code null} for none
   */
  public WrappedBoolean setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getResult() {
    return result;
  }

  /**
   * @param result result or {@code null} for none
   */
  public WrappedBoolean setResult(java.lang.Boolean result) {
    this.result = result;
    return this;
  }

  @Override
  public WrappedBoolean set(String fieldName, Object value) {
    return (WrappedBoolean) super.set(fieldName, value);
  }

  @Override
  public WrappedBoolean clone() {
    return (WrappedBoolean) super.clone();
  }

}