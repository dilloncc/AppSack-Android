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
 * (build: 2014-02-14 18:40:25 UTC)
 * on 2014-02-27 at 04:32:48 UTC 
 * Modify at your own risk.
 */

package com.appsack.androidappsack.model.appideachangelogendpoint;

/**
 * Service definition for Appideachangelogendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AppideachangelogendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Appideachangelogendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the appideachangelogendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://amiable-reducer-470.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "appideachangelogendpoint/v1/";

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
  public Appideachangelogendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Appideachangelogendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getAppIdeaChangeLog".
   *
   * This request holds the parameters needed by the the appideachangelogendpoint server.  After
   * setting any optional parameters, call the {@link GetAppIdeaChangeLog#execute()} method to invoke
   * the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetAppIdeaChangeLog getAppIdeaChangeLog(java.lang.Long id) throws java.io.IOException {
    GetAppIdeaChangeLog result = new GetAppIdeaChangeLog(id);
    initialize(result);
    return result;
  }

  public class GetAppIdeaChangeLog extends AppideachangelogendpointRequest<com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog> {

    private static final String REST_PATH = "appideachangelog/{id}";

    /**
     * Create a request for the method "getAppIdeaChangeLog".
     *
     * This request holds the parameters needed by the the appideachangelogendpoint server.  After
     * setting any optional parameters, call the {@link GetAppIdeaChangeLog#execute()} method to
     * invoke the remote operation. <p> {@link GetAppIdeaChangeLog#initialize(com.google.api.client.go
     * ogleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetAppIdeaChangeLog(java.lang.Long id) {
      super(Appideachangelogendpoint.this, "GET", REST_PATH, null, com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
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
    public GetAppIdeaChangeLog setAlt(java.lang.String alt) {
      return (GetAppIdeaChangeLog) super.setAlt(alt);
    }

    @Override
    public GetAppIdeaChangeLog setFields(java.lang.String fields) {
      return (GetAppIdeaChangeLog) super.setFields(fields);
    }

    @Override
    public GetAppIdeaChangeLog setKey(java.lang.String key) {
      return (GetAppIdeaChangeLog) super.setKey(key);
    }

    @Override
    public GetAppIdeaChangeLog setOauthToken(java.lang.String oauthToken) {
      return (GetAppIdeaChangeLog) super.setOauthToken(oauthToken);
    }

    @Override
    public GetAppIdeaChangeLog setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetAppIdeaChangeLog) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetAppIdeaChangeLog setQuotaUser(java.lang.String quotaUser) {
      return (GetAppIdeaChangeLog) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetAppIdeaChangeLog setUserIp(java.lang.String userIp) {
      return (GetAppIdeaChangeLog) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetAppIdeaChangeLog setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetAppIdeaChangeLog set(String parameterName, Object value) {
      return (GetAppIdeaChangeLog) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertAppIdeaChangeLog".
   *
   * This request holds the parameters needed by the the appideachangelogendpoint server.  After
   * setting any optional parameters, call the {@link InsertAppIdeaChangeLog#execute()} method to
   * invoke the remote operation.
   *
   * @param content the {@link com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog}
   * @return the request
   */
  public InsertAppIdeaChangeLog insertAppIdeaChangeLog(com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog content) throws java.io.IOException {
    InsertAppIdeaChangeLog result = new InsertAppIdeaChangeLog(content);
    initialize(result);
    return result;
  }

  public class InsertAppIdeaChangeLog extends AppideachangelogendpointRequest<com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog> {

    private static final String REST_PATH = "appideachangelog";

    /**
     * Create a request for the method "insertAppIdeaChangeLog".
     *
     * This request holds the parameters needed by the the appideachangelogendpoint server.  After
     * setting any optional parameters, call the {@link InsertAppIdeaChangeLog#execute()} method to
     * invoke the remote operation. <p> {@link InsertAppIdeaChangeLog#initialize(com.google.api.client
     * .googleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog}
     * @since 1.13
     */
    protected InsertAppIdeaChangeLog(com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog content) {
      super(Appideachangelogendpoint.this, "POST", REST_PATH, content, com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog.class);
    }

    @Override
    public InsertAppIdeaChangeLog setAlt(java.lang.String alt) {
      return (InsertAppIdeaChangeLog) super.setAlt(alt);
    }

    @Override
    public InsertAppIdeaChangeLog setFields(java.lang.String fields) {
      return (InsertAppIdeaChangeLog) super.setFields(fields);
    }

    @Override
    public InsertAppIdeaChangeLog setKey(java.lang.String key) {
      return (InsertAppIdeaChangeLog) super.setKey(key);
    }

    @Override
    public InsertAppIdeaChangeLog setOauthToken(java.lang.String oauthToken) {
      return (InsertAppIdeaChangeLog) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertAppIdeaChangeLog setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertAppIdeaChangeLog) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertAppIdeaChangeLog setQuotaUser(java.lang.String quotaUser) {
      return (InsertAppIdeaChangeLog) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertAppIdeaChangeLog setUserIp(java.lang.String userIp) {
      return (InsertAppIdeaChangeLog) super.setUserIp(userIp);
    }

    @Override
    public InsertAppIdeaChangeLog set(String parameterName, Object value) {
      return (InsertAppIdeaChangeLog) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listAppIdeaChangeLog".
   *
   * This request holds the parameters needed by the the appideachangelogendpoint server.  After
   * setting any optional parameters, call the {@link ListAppIdeaChangeLog#execute()} method to invoke
   * the remote operation.
   *
   * @return the request
   */
  public ListAppIdeaChangeLog listAppIdeaChangeLog() throws java.io.IOException {
    ListAppIdeaChangeLog result = new ListAppIdeaChangeLog();
    initialize(result);
    return result;
  }

  public class ListAppIdeaChangeLog extends AppideachangelogendpointRequest<com.appsack.androidappsack.model.appideachangelogendpoint.model.CollectionResponseAppIdeaChangeLog> {

    private static final String REST_PATH = "appideachangelog";

    /**
     * Create a request for the method "listAppIdeaChangeLog".
     *
     * This request holds the parameters needed by the the appideachangelogendpoint server.  After
     * setting any optional parameters, call the {@link ListAppIdeaChangeLog#execute()} method to
     * invoke the remote operation. <p> {@link ListAppIdeaChangeLog#initialize(com.google.api.client.g
     * oogleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListAppIdeaChangeLog() {
      super(Appideachangelogendpoint.this, "GET", REST_PATH, null, com.appsack.androidappsack.model.appideachangelogendpoint.model.CollectionResponseAppIdeaChangeLog.class);
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
    public ListAppIdeaChangeLog setAlt(java.lang.String alt) {
      return (ListAppIdeaChangeLog) super.setAlt(alt);
    }

    @Override
    public ListAppIdeaChangeLog setFields(java.lang.String fields) {
      return (ListAppIdeaChangeLog) super.setFields(fields);
    }

    @Override
    public ListAppIdeaChangeLog setKey(java.lang.String key) {
      return (ListAppIdeaChangeLog) super.setKey(key);
    }

    @Override
    public ListAppIdeaChangeLog setOauthToken(java.lang.String oauthToken) {
      return (ListAppIdeaChangeLog) super.setOauthToken(oauthToken);
    }

    @Override
    public ListAppIdeaChangeLog setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListAppIdeaChangeLog) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListAppIdeaChangeLog setQuotaUser(java.lang.String quotaUser) {
      return (ListAppIdeaChangeLog) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListAppIdeaChangeLog setUserIp(java.lang.String userIp) {
      return (ListAppIdeaChangeLog) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListAppIdeaChangeLog setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListAppIdeaChangeLog setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListAppIdeaChangeLog set(String parameterName, Object value) {
      return (ListAppIdeaChangeLog) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeAppIdeaChangeLog".
   *
   * This request holds the parameters needed by the the appideachangelogendpoint server.  After
   * setting any optional parameters, call the {@link RemoveAppIdeaChangeLog#execute()} method to
   * invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveAppIdeaChangeLog removeAppIdeaChangeLog(java.lang.Long id) throws java.io.IOException {
    RemoveAppIdeaChangeLog result = new RemoveAppIdeaChangeLog(id);
    initialize(result);
    return result;
  }

  public class RemoveAppIdeaChangeLog extends AppideachangelogendpointRequest<Void> {

    private static final String REST_PATH = "appideachangelog/{id}";

    /**
     * Create a request for the method "removeAppIdeaChangeLog".
     *
     * This request holds the parameters needed by the the appideachangelogendpoint server.  After
     * setting any optional parameters, call the {@link RemoveAppIdeaChangeLog#execute()} method to
     * invoke the remote operation. <p> {@link RemoveAppIdeaChangeLog#initialize(com.google.api.client
     * .googleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveAppIdeaChangeLog(java.lang.Long id) {
      super(Appideachangelogendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveAppIdeaChangeLog setAlt(java.lang.String alt) {
      return (RemoveAppIdeaChangeLog) super.setAlt(alt);
    }

    @Override
    public RemoveAppIdeaChangeLog setFields(java.lang.String fields) {
      return (RemoveAppIdeaChangeLog) super.setFields(fields);
    }

    @Override
    public RemoveAppIdeaChangeLog setKey(java.lang.String key) {
      return (RemoveAppIdeaChangeLog) super.setKey(key);
    }

    @Override
    public RemoveAppIdeaChangeLog setOauthToken(java.lang.String oauthToken) {
      return (RemoveAppIdeaChangeLog) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveAppIdeaChangeLog setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveAppIdeaChangeLog) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveAppIdeaChangeLog setQuotaUser(java.lang.String quotaUser) {
      return (RemoveAppIdeaChangeLog) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveAppIdeaChangeLog setUserIp(java.lang.String userIp) {
      return (RemoveAppIdeaChangeLog) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveAppIdeaChangeLog setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveAppIdeaChangeLog set(String parameterName, Object value) {
      return (RemoveAppIdeaChangeLog) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateAppIdeaChangeLog".
   *
   * This request holds the parameters needed by the the appideachangelogendpoint server.  After
   * setting any optional parameters, call the {@link UpdateAppIdeaChangeLog#execute()} method to
   * invoke the remote operation.
   *
   * @param content the {@link com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog}
   * @return the request
   */
  public UpdateAppIdeaChangeLog updateAppIdeaChangeLog(com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog content) throws java.io.IOException {
    UpdateAppIdeaChangeLog result = new UpdateAppIdeaChangeLog(content);
    initialize(result);
    return result;
  }

  public class UpdateAppIdeaChangeLog extends AppideachangelogendpointRequest<com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog> {

    private static final String REST_PATH = "appideachangelog";

    /**
     * Create a request for the method "updateAppIdeaChangeLog".
     *
     * This request holds the parameters needed by the the appideachangelogendpoint server.  After
     * setting any optional parameters, call the {@link UpdateAppIdeaChangeLog#execute()} method to
     * invoke the remote operation. <p> {@link UpdateAppIdeaChangeLog#initialize(com.google.api.client
     * .googleapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
     * immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog}
     * @since 1.13
     */
    protected UpdateAppIdeaChangeLog(com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog content) {
      super(Appideachangelogendpoint.this, "PUT", REST_PATH, content, com.appsack.androidappsack.model.appideachangelogendpoint.model.AppIdeaChangeLog.class);
    }

    @Override
    public UpdateAppIdeaChangeLog setAlt(java.lang.String alt) {
      return (UpdateAppIdeaChangeLog) super.setAlt(alt);
    }

    @Override
    public UpdateAppIdeaChangeLog setFields(java.lang.String fields) {
      return (UpdateAppIdeaChangeLog) super.setFields(fields);
    }

    @Override
    public UpdateAppIdeaChangeLog setKey(java.lang.String key) {
      return (UpdateAppIdeaChangeLog) super.setKey(key);
    }

    @Override
    public UpdateAppIdeaChangeLog setOauthToken(java.lang.String oauthToken) {
      return (UpdateAppIdeaChangeLog) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateAppIdeaChangeLog setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateAppIdeaChangeLog) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateAppIdeaChangeLog setQuotaUser(java.lang.String quotaUser) {
      return (UpdateAppIdeaChangeLog) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateAppIdeaChangeLog setUserIp(java.lang.String userIp) {
      return (UpdateAppIdeaChangeLog) super.setUserIp(userIp);
    }

    @Override
    public UpdateAppIdeaChangeLog set(String parameterName, Object value) {
      return (UpdateAppIdeaChangeLog) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Appideachangelogendpoint}.
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

    /** Builds a new instance of {@link Appideachangelogendpoint}. */
    @Override
    public Appideachangelogendpoint build() {
      return new Appideachangelogendpoint(this);
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
     * Set the {@link AppideachangelogendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAppideachangelogendpointRequestInitializer(
        AppideachangelogendpointRequestInitializer appideachangelogendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(appideachangelogendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
