/*
 * (C) Copyright IBM Corp. 2025.
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
 package com.ibm.cloud.cloud_db2.db2saas.v1;

 import com.google.gson.JsonObject;
 import com.ibm.cloud.cloud_db2.common.SdkCommon;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.DeleteDb2SaasUserOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.GetDb2SaasAllowlistOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.GetDb2SaasAutoscaleOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.GetDb2SaasBackupOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.GetDb2SaasConnectionInfoOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.GetDb2SaasTuneableParamOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.GetDb2SaasUserOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.GetbyidDb2SaasUserOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.PostDb2SaasAllowlistOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.PostDb2SaasBackupOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.PostDb2SaasDbConfigurationOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.PostDb2SaasUserOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.PutDb2SaasAutoscaleOptions;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessAutoScaling;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessConnectionInfo;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessCreateBackup;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessGetAllowlistIPs;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessGetBackups;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessGetUserByID;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessGetUserInfo;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessPostAllowedlistIPs;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessPostCustomSettings;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessTuneableParams;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessUpdateAutoScale;
 import com.ibm.cloud.cloud_db2.db2saas.v1.model.SuccessUserResponse;
 import com.ibm.cloud.sdk.core.http.RequestBuilder;
 import com.ibm.cloud.sdk.core.http.ResponseConverter;
 import com.ibm.cloud.sdk.core.http.ServiceCall;
 import com.ibm.cloud.sdk.core.security.Authenticator;
 import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
 import com.ibm.cloud.sdk.core.service.BaseService;
 import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
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
    * Allow listing of new IPs.
    *
    * @param postDb2SaasAllowlistOptions the {@link PostDb2SaasAllowlistOptions} containing the options for the call
    * @return a {@link ServiceCall} with a result of type {@link SuccessPostAllowedlistIPs}
    */
   public ServiceCall<SuccessPostAllowedlistIPs> postDb2SaasAllowlist(PostDb2SaasAllowlistOptions postDb2SaasAllowlistOptions) {
     com.ibm.cloud.sdk.core.util.Validator.notNull(postDb2SaasAllowlistOptions,
       "postDb2SaasAllowlistOptions cannot be null");
     RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dbsettings/whitelistips"));
     Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "postDb2SaasAllowlist");
     for (Entry<String, String> header : sdkHeaders.entrySet()) {
       builder.header(header.getKey(), header.getValue());
     }
     builder.header("Accept", "application/json");
     builder.header("x-deployment-id", postDb2SaasAllowlistOptions.xDeploymentId());
     final JsonObject contentJson = new JsonObject();
     contentJson.add("ip_addresses", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDb2SaasAllowlistOptions.ipAddresses()));
     builder.bodyJson(contentJson);
     ResponseConverter<SuccessPostAllowedlistIPs> responseConverter =
       ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessPostAllowedlistIPs>() { }.getType());
     return createServiceCall(builder.build(), responseConverter);
   }

   /**
    * Get allowed list of IPs.
    *
    * @param getDb2SaasAllowlistOptions the {@link GetDb2SaasAllowlistOptions} containing the options for the call
    * @return a {@link ServiceCall} with a result of type {@link SuccessGetAllowlistIPs}
    */
   public ServiceCall<SuccessGetAllowlistIPs> getDb2SaasAllowlist(GetDb2SaasAllowlistOptions getDb2SaasAllowlistOptions) {
     com.ibm.cloud.sdk.core.util.Validator.notNull(getDb2SaasAllowlistOptions,
       "getDb2SaasAllowlistOptions cannot be null");
     RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/dbsettings/whitelistips"));
     Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getDb2SaasAllowlist");
     for (Entry<String, String> header : sdkHeaders.entrySet()) {
       builder.header(header.getKey(), header.getValue());
     }
     builder.header("Accept", "application/json");
     builder.header("x-deployment-id", getDb2SaasAllowlistOptions.xDeploymentId());
     ResponseConverter<SuccessGetAllowlistIPs> responseConverter =
       ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessGetAllowlistIPs>() { }.getType());
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
     builder.header("x-db-profile", putDb2SaasAutoscaleOptions.xDbProfile());
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
     RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/manage/scaling/auto"));
     Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getDb2SaasAutoscale");
     for (Entry<String, String> header : sdkHeaders.entrySet()) {
       builder.header(header.getKey(), header.getValue());
     }
     builder.header("Accept", "application/json");
     builder.header("x-db-profile", getDb2SaasAutoscaleOptions.xDbProfile());
     ResponseConverter<SuccessAutoScaling> responseConverter =
       ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessAutoScaling>() { }.getType());
     return createServiceCall(builder.build(), responseConverter);
   }

   /**
    * Set database and database manager configuration.
    *
    * @param postDb2SaasDbConfigurationOptions the {@link PostDb2SaasDbConfigurationOptions} containing the options for the call
    * @return a {@link ServiceCall} with a result of type {@link SuccessPostCustomSettings}
    */
   public ServiceCall<SuccessPostCustomSettings> postDb2SaasDbConfiguration(PostDb2SaasDbConfigurationOptions postDb2SaasDbConfigurationOptions) {
     com.ibm.cloud.sdk.core.util.Validator.notNull(postDb2SaasDbConfigurationOptions,
       "postDb2SaasDbConfigurationOptions cannot be null");
     RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/manage/deployments/custom_setting"));
     Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "postDb2SaasDbConfiguration");
     for (Entry<String, String> header : sdkHeaders.entrySet()) {
       builder.header(header.getKey(), header.getValue());
     }
     builder.header("Accept", "application/json");
     builder.header("x-db-profile", postDb2SaasDbConfigurationOptions.xDbProfile());
     final JsonObject contentJson = new JsonObject();
     if (postDb2SaasDbConfigurationOptions.registry() != null) {
       contentJson.add("registry", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDb2SaasDbConfigurationOptions.registry()));
     }
     if (postDb2SaasDbConfigurationOptions.db() != null) {
       contentJson.add("db", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDb2SaasDbConfigurationOptions.db()));
     }
     if (postDb2SaasDbConfigurationOptions.dbm() != null) {
       contentJson.add("dbm", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDb2SaasDbConfigurationOptions.dbm()));
     }
     builder.bodyJson(contentJson);
     ResponseConverter<SuccessPostCustomSettings> responseConverter =
       ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessPostCustomSettings>() { }.getType());
     return createServiceCall(builder.build(), responseConverter);
   }

   /**
    * Retrieves the values of tunable parameters of the DB2 instance.
    *
    * @param getDb2SaasTuneableParamOptions the {@link GetDb2SaasTuneableParamOptions} containing the options for the call
    * @return a {@link ServiceCall} with a result of type {@link SuccessTuneableParams}
    */
   public ServiceCall<SuccessTuneableParams> getDb2SaasTuneableParam(GetDb2SaasTuneableParamOptions getDb2SaasTuneableParamOptions) {
     RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/manage/tuneable_param"));
     Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getDb2SaasTuneableParam");
     for (Entry<String, String> header : sdkHeaders.entrySet()) {
       builder.header(header.getKey(), header.getValue());
     }
     builder.header("Accept", "application/json");
     ResponseConverter<SuccessTuneableParams> responseConverter =
       ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessTuneableParams>() { }.getType());
     return createServiceCall(builder.build(), responseConverter);
   }

   /**
    * Retrieves the values of tunable parameters of the DB2 instance.
    *
    * @return a {@link ServiceCall} with a result of type {@link SuccessTuneableParams}
    */
   public ServiceCall<SuccessTuneableParams> getDb2SaasTuneableParam() {
     return getDb2SaasTuneableParam(null);
   }

   /**
    * Get Db2 instance backup information.
    *
    * @param getDb2SaasBackupOptions the {@link GetDb2SaasBackupOptions} containing the options for the call
    * @return a {@link ServiceCall} with a result of type {@link SuccessGetBackups}
    */
   public ServiceCall<SuccessGetBackups> getDb2SaasBackup(GetDb2SaasBackupOptions getDb2SaasBackupOptions) {
     com.ibm.cloud.sdk.core.util.Validator.notNull(getDb2SaasBackupOptions,
       "getDb2SaasBackupOptions cannot be null");
     RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/manage/backups"));
     Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "getDb2SaasBackup");
     for (Entry<String, String> header : sdkHeaders.entrySet()) {
       builder.header(header.getKey(), header.getValue());
     }
     builder.header("Accept", "application/json");
     builder.header("x-db-profile", getDb2SaasBackupOptions.xDbProfile());
     ResponseConverter<SuccessGetBackups> responseConverter =
       ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessGetBackups>() { }.getType());
     return createServiceCall(builder.build(), responseConverter);
   }

   /**
    * Create backup of an instance.
    *
    * @param postDb2SaasBackupOptions the {@link PostDb2SaasBackupOptions} containing the options for the call
    * @return a {@link ServiceCall} with a result of type {@link SuccessCreateBackup}
    */
   public ServiceCall<SuccessCreateBackup> postDb2SaasBackup(PostDb2SaasBackupOptions postDb2SaasBackupOptions) {
     com.ibm.cloud.sdk.core.util.Validator.notNull(postDb2SaasBackupOptions,
       "postDb2SaasBackupOptions cannot be null");
     RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/manage/backups/backup"));
     Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("db2saas", "v1", "postDb2SaasBackup");
     for (Entry<String, String> header : sdkHeaders.entrySet()) {
       builder.header(header.getKey(), header.getValue());
     }
     builder.header("Accept", "application/json");
     builder.header("x-db-profile", postDb2SaasBackupOptions.xDbProfile());
     ResponseConverter<SuccessCreateBackup> responseConverter =
       ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessCreateBackup>() { }.getType());
     return createServiceCall(builder.build(), responseConverter);
   }

 }
