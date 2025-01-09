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

package github.com/IBM/cloud-db2-java-sdk.db2saas.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.CreateUserAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.DeleteDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasAllowlistOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasAutoscaleOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasConnectionInfoOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetbyidDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.IpAddress;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PostDb2SaasAllowlistOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PostDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PutDb2SaasAutoscaleOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessAutoScaling;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessConnectionInfo;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetAllowlistIPs;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserByID;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfo;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessPostAllowedlistIPs;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUpdateAutoScale;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUserResponse;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the db2saas service.
 *
 * The following configuration properties are assumed to be defined:
 * DB2SAAS_URL=&lt;service base url&gt;
 * DB2SAAS_AUTH_TYPE=iam
 * DB2SAAS_APIKEY=&lt;IAM apikey&gt;
 * DB2SAAS_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class Db2saasExamples {
  private static final Logger logger = LoggerFactory.getLogger(Db2saasExamples.class);
  protected Db2saasExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../db2saas_v1.env");
  }

  /**
   * The main() function invokes operations of the db2saas service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    Db2saas db2saasService = Db2saas.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(Db2saas.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("getDb2SaasConnectionInfo() result:");
      // begin-get_db2_saas_connection_info
      GetDb2SaasConnectionInfoOptions getDb2SaasConnectionInfoOptions = new GetDb2SaasConnectionInfoOptions.Builder()
        .deploymentId("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A69db420f-33d5-4953-8bd8-1950abd356f6%3A%3A")
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      Response<SuccessConnectionInfo> response = db2saasService.getDb2SaasConnectionInfo(getDb2SaasConnectionInfoOptions).execute();
      SuccessConnectionInfo successConnectionInfo = response.getResult();

      System.out.println(successConnectionInfo);
      // end-get_db2_saas_connection_info
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("postDb2SaasAllowlist() result:");
      // begin-post_db2_saas_allowlist
      IpAddress ipAddressModel = new IpAddress.Builder()
        .address("127.0.0.1")
        .description("A sample IP address")
        .build();
      PostDb2SaasAllowlistOptions postDb2SaasAllowlistOptions = new PostDb2SaasAllowlistOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .ipAddresses(java.util.Arrays.asList(ipAddressModel))
        .build();

      Response<SuccessPostAllowedlistIPs> response = db2saasService.postDb2SaasAllowlist(postDb2SaasAllowlistOptions).execute();
      SuccessPostAllowedlistIPs successPostAllowedlistIPs = response.getResult();

      System.out.println(successPostAllowedlistIPs);
      // end-post_db2_saas_allowlist
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDb2SaasAllowlist() result:");
      // begin-get_db2_saas_allowlist
      GetDb2SaasAllowlistOptions getDb2SaasAllowlistOptions = new GetDb2SaasAllowlistOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      Response<SuccessGetAllowlistIPs> response = db2saasService.getDb2SaasAllowlist(getDb2SaasAllowlistOptions).execute();
      SuccessGetAllowlistIPs successGetAllowlistIPs = response.getResult();

      System.out.println(successGetAllowlistIPs);
      // end-get_db2_saas_allowlist
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("postDb2SaasUser() result:");
      // begin-post_db2_saas_user
      CreateUserAuthentication createUserAuthenticationModel = new CreateUserAuthentication.Builder()
        .method("internal")
        .policyId("Default")
        .build();
      PostDb2SaasUserOptions postDb2SaasUserOptions = new PostDb2SaasUserOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .id("test-user")
        .iam(false)
        .ibmid("test-ibm-id")
        .name("test_user")
        .password("dEkMc43@gfAPl!867^dSbu")
        .role("bluuser")
        .email("test_user@mycompany.com")
        .locked("no")
        .authentication(createUserAuthenticationModel)
        .build();

      Response<SuccessUserResponse> response = db2saasService.postDb2SaasUser(postDb2SaasUserOptions).execute();
      SuccessUserResponse successUserResponse = response.getResult();

      System.out.println(successUserResponse);
      // end-post_db2_saas_user
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDb2SaasUser() result:");
      // begin-get_db2_saas_user
      GetDb2SaasUserOptions getDb2SaasUserOptions = new GetDb2SaasUserOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      Response<SuccessGetUserInfo> response = db2saasService.getDb2SaasUser(getDb2SaasUserOptions).execute();
      SuccessGetUserInfo successGetUserInfo = response.getResult();

      System.out.println(successGetUserInfo);
      // end-get_db2_saas_user
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getbyidDb2SaasUser() result:");
      // begin-getbyid_db2_saas_user
      GetbyidDb2SaasUserOptions getbyidDb2SaasUserOptions = new GetbyidDb2SaasUserOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      Response<SuccessGetUserByID> response = db2saasService.getbyidDb2SaasUser(getbyidDb2SaasUserOptions).execute();
      SuccessGetUserByID successGetUserById = response.getResult();

      System.out.println(successGetUserById);
      // end-getbyid_db2_saas_user
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("putDb2SaasAutoscale() result:");
      // begin-put_db2_saas_autoscale
      PutDb2SaasAutoscaleOptions putDb2SaasAutoscaleOptions = new PutDb2SaasAutoscaleOptions.Builder()
        .xDbProfile("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      Response<SuccessUpdateAutoScale> response = db2saasService.putDb2SaasAutoscale(putDb2SaasAutoscaleOptions).execute();
      SuccessUpdateAutoScale successUpdateAutoScale = response.getResult();

      System.out.println(successUpdateAutoScale);
      // end-put_db2_saas_autoscale
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDb2SaasAutoscale() result:");
      // begin-get_db2_saas_autoscale
      GetDb2SaasAutoscaleOptions getDb2SaasAutoscaleOptions = new GetDb2SaasAutoscaleOptions.Builder()
        .xDbProfile("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      Response<SuccessAutoScaling> response = db2saasService.getDb2SaasAutoscale(getDb2SaasAutoscaleOptions).execute();
      SuccessAutoScaling successAutoScaling = response.getResult();

      System.out.println(successAutoScaling);
      // end-get_db2_saas_autoscale
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteDb2SaasUser() result:");
      // begin-delete_db2_saas_user
      DeleteDb2SaasUserOptions deleteDb2SaasUserOptions = new DeleteDb2SaasUserOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .id("test-user")
        .build();

      Response<Map<String, Object>> response = db2saasService.deleteDb2SaasUser(deleteDb2SaasUserOptions).execute();
      Map<String, Object> result = response.getResult();

      System.out.println(result);
      // end-delete_db2_saas_user
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
