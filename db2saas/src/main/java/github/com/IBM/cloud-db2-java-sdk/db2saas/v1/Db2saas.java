/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

/*
 * IBM OpenAPI SDK Code Generator Version: 3.96.0-d6dec9d7-20241008-212902
 */

package github.com/IBM/cloud-db2-java-sdk.db2saas.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import github.com/IBM/cloud-db2-java-sdk.common.SdkCommon;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.DeleteDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasAutoscaleOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasConnectionInfoOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasWhitelistOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetbyidDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PostDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PostDb2SaasWhitelistOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PutDb2SaasAutoscaleOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PutDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessAutoScaling;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessConnectionInfo;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserByID;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfo;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetWhitelistIPs;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessPostWhitelistIPs;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUpdateAutoScale;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUserResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Manage lifecycle of your Db2 on Cloud resources using the  APIs.
 *
 * API Version: 1.0.0
 */
public class Db2saas extends BaseService {

  /**
   * Default service name used when configuring the `Db2saas` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "db2saas";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://us-south.db2.saas.ibm.com/dbapi/v4";

  /**
   * The parameterized service endpoint URL.
   */
  public static final String PARAMETERIZED_SERVICE_URL = "https://{region}.db2.saas.ibm.com/dbapi/v4";

  private static final Map<String, String> defaultUrlVariables = createDefaultUrlVariables();

  private static Map<String, String> createDefaultUrlVariables() {
    Map<String, String> map = new HashMap<>();
    map.put("region", "us-south");
    return map;
  }

 /**
   * Class method which constructs an instance of the `Db2saas` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Db2saas` client using external configuration
   */
  public static Db2saas newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Db2saas` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Db2saas` client using external configuration
   */
  public static Db2saas newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Db2saas service = new Db2saas(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Db2saas` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Db2saas(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Constructs a service URL by formatting the parameterized service URL.
   *
   * The parameterized service URL is:
   * 'https://{region}.db2.saas.ibm.com/dbapi/v4'
   *
   * The default variable values are:
   * - 'region': 'us-south'
   *
   * @param providedUrlVariables map from variable names to desired values.
   *   If a variable is not provided in this map,
   *   the default variable value will be used instead.
   * @return the formatted URL with all variable placeholders replaced by values.
   */
  public static String constructServiceUrl(Map<String, String> providedUrlVariables) {
    return BaseService.constructServiceUrl(PARAMETERIZED_SERVICE_URL, defaultUrlVariables, providedUrlVariables);
  }

  /**
   * Get Db2 connection information.
   *
   * @param getDb2SaasConnectionInfoOptions the {@link GetDb2SaasConnectionInfoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessConnectionInfo}
   */
  public ServiceCall<SuccessConnectionInfo> getDb2SaasConnectionInfo(GetDb2SaasConnectionInfoOptions getDb2SaasConnectionInfoOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDb2SaasConnectionInfoOptions,
      "getDb2SaasConnectionInfoOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("deployment_id", getDb2SaasConnectionInfoOptions.deploymentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/connectioninfo/{deployment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getDb2SaasConnectionInfo");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", getDb2SaasConnectionInfoOptions.xDeploymentId());
    ResponseConverter<SuccessConnectionInfo> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessConnectionInfo>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Whitelisting of new IPs.
   *
   * @param postDb2SaasWhitelistOptions the {@link PostDb2SaasWhitelistOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessPostWhitelistIPs}
   */
  public ServiceCall<SuccessPostWhitelistIPs> postDb2SaasWhitelist(PostDb2SaasWhitelistOptions postDb2SaasWhitelistOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postDb2SaasWhitelistOptions,
      "postDb2SaasWhitelistOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dbsettings/whitelistips"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "postDb2SaasWhitelist");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", postDb2SaasWhitelistOptions.xDeploymentId());
    final JsonObject contentJson = new JsonObject();
    contentJson.add("ip_addresses", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDb2SaasWhitelistOptions.ipAddresses()));
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessPostWhitelistIPs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessPostWhitelistIPs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get whitelisted IPs.
   *
   * @param getDb2SaasWhitelistOptions the {@link GetDb2SaasWhitelistOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessGetWhitelistIPs}
   */
  public ServiceCall<SuccessGetWhitelistIPs> getDb2SaasWhitelist(GetDb2SaasWhitelistOptions getDb2SaasWhitelistOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDb2SaasWhitelistOptions,
      "getDb2SaasWhitelistOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dbsettings/whitelistips"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getDb2SaasWhitelist");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", getDb2SaasWhitelistOptions.xDeploymentId());
    ResponseConverter<SuccessGetWhitelistIPs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessGetWhitelistIPs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create new user ( available only for platform users).
   *
   * @param postDb2SaasUserOptions the {@link PostDb2SaasUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessUserResponse}
   */
  public ServiceCall<SuccessUserResponse> postDb2SaasUser(PostDb2SaasUserOptions postDb2SaasUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postDb2SaasUserOptions,
      "postDb2SaasUserOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/users"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "postDb2SaasUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", postDb2SaasUserOptions.xDeploymentId());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("id", postDb2SaasUserOptions.id());
    contentJson.addProperty("iam", postDb2SaasUserOptions.iam());
    contentJson.addProperty("ibmid", postDb2SaasUserOptions.ibmid());
    contentJson.addProperty("name", postDb2SaasUserOptions.name());
    contentJson.addProperty("password", postDb2SaasUserOptions.password());
    contentJson.addProperty("role", postDb2SaasUserOptions.role());
    contentJson.addProperty("email", postDb2SaasUserOptions.email());
    contentJson.addProperty("locked", postDb2SaasUserOptions.locked());
    contentJson.add("authentication", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDb2SaasUserOptions.authentication()));
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessUserResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessUserResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the list of Users.
   *
   * @param getDb2SaasUserOptions the {@link GetDb2SaasUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessGetUserInfo}
   */
  public ServiceCall<SuccessGetUserInfo> getDb2SaasUser(GetDb2SaasUserOptions getDb2SaasUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDb2SaasUserOptions,
      "getDb2SaasUserOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/users"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getDb2SaasUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", getDb2SaasUserOptions.xDeploymentId());
    ResponseConverter<SuccessGetUserInfo> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessGetUserInfo>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the details of existing user.
   *
   * @param putDb2SaasUserOptions the {@link PutDb2SaasUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessUserResponse}
   */
  public ServiceCall<SuccessUserResponse> putDb2SaasUser(PutDb2SaasUserOptions putDb2SaasUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putDb2SaasUserOptions,
      "putDb2SaasUserOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", putDb2SaasUserOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/users/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "putDb2SaasUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", putDb2SaasUserOptions.xDeploymentId());
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("id", putDb2SaasUserOptions.newId());
    contentJson.addProperty("name", putDb2SaasUserOptions.newName());
    contentJson.addProperty("old_password", putDb2SaasUserOptions.newOldPassword());
    contentJson.addProperty("new_password", putDb2SaasUserOptions.newNewPassword());
    contentJson.addProperty("role", putDb2SaasUserOptions.newRole());
    contentJson.addProperty("email", putDb2SaasUserOptions.newEmail());
    contentJson.addProperty("locked", putDb2SaasUserOptions.newLocked());
    contentJson.add("authentication", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putDb2SaasUserOptions.newAuthentication()));
    if (putDb2SaasUserOptions.newIbmid() != null) {
      contentJson.addProperty("ibmid", putDb2SaasUserOptions.newIbmid());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessUserResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessUserResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a user (only platform admin).
   *
   * @param deleteDb2SaasUserOptions the {@link DeleteDb2SaasUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Object>> deleteDb2SaasUser(DeleteDb2SaasUserOptions deleteDb2SaasUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDb2SaasUserOptions,
      "deleteDb2SaasUserOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteDb2SaasUserOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/users/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "deleteDb2SaasUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", deleteDb2SaasUserOptions.xDeploymentId());
    ResponseConverter<Map<String, Object>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Object>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get specific user by Id.
   *
   * @param getbyidDb2SaasUserOptions the {@link GetbyidDb2SaasUserOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessGetUserByID}
   */
  public ServiceCall<SuccessGetUserByID> getbyidDb2SaasUser(GetbyidDb2SaasUserOptions getbyidDb2SaasUserOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getbyidDb2SaasUserOptions,
      "getbyidDb2SaasUserOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/users/bluadmin"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getbyidDb2SaasUser");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", getbyidDb2SaasUserOptions.xDeploymentId());
    ResponseConverter<SuccessGetUserByID> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessGetUserByID>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update auto scaling configuration.
   *
   * @param putDb2SaasAutoscaleOptions the {@link PutDb2SaasAutoscaleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessUpdateAutoScale}
   */
  public ServiceCall<SuccessUpdateAutoScale> putDb2SaasAutoscale(PutDb2SaasAutoscaleOptions putDb2SaasAutoscaleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putDb2SaasAutoscaleOptions,
      "putDb2SaasAutoscaleOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/manage/scaling/auto"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "putDb2SaasAutoscale");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", putDb2SaasAutoscaleOptions.xDeploymentId());
    final JsonObject contentJson = new JsonObject();
    if (putDb2SaasAutoscaleOptions.autoScalingEnabled() != null) {
      contentJson.addProperty("auto_scaling_enabled", putDb2SaasAutoscaleOptions.autoScalingEnabled());
    }
    if (putDb2SaasAutoscaleOptions.autoScalingThreshold() != null) {
      contentJson.addProperty("auto_scaling_threshold", putDb2SaasAutoscaleOptions.autoScalingThreshold());
    }
    if (putDb2SaasAutoscaleOptions.autoScalingOverTimePeriod() != null) {
      contentJson.addProperty("auto_scaling_over_time_period", putDb2SaasAutoscaleOptions.autoScalingOverTimePeriod());
    }
    if (putDb2SaasAutoscaleOptions.autoScalingPauseLimit() != null) {
      contentJson.addProperty("auto_scaling_pause_limit", putDb2SaasAutoscaleOptions.autoScalingPauseLimit());
    }
    if (putDb2SaasAutoscaleOptions.autoScalingAllowPlanLimit() != null) {
      contentJson.addProperty("auto_scaling_allow_plan_limit", putDb2SaasAutoscaleOptions.autoScalingAllowPlanLimit());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessUpdateAutoScale> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessUpdateAutoScale>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get auto scaling info.
   *
   * @param getDb2SaasAutoscaleOptions the {@link GetDb2SaasAutoscaleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessAutoScaling}
   */
  public ServiceCall<SuccessAutoScaling> getDb2SaasAutoscale(GetDb2SaasAutoscaleOptions getDb2SaasAutoscaleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDb2SaasAutoscaleOptions,
      "getDb2SaasAutoscaleOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/scaling/auto"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getDb2SaasAutoscale");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("x-deployment-id", getDb2SaasAutoscaleOptions.xDeploymentId());
    ResponseConverter<SuccessAutoScaling> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessAutoScaling>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
