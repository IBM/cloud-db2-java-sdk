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

package github.com/IBM/cloud-db2-java-sdk.db2saas.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.CreateUserAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.DeleteDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasAutoscaleOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasConnectionInfoOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetDb2SaasWhitelistOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetbyidDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.IpAddress;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PostDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PostDb2SaasWhitelistOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PutDb2SaasAutoscaleOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PutDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessAutoScaling;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessConnectionInfo;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessConnectionInfoPrivate;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessConnectionInfoPublic;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserByID;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserByIDAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfo;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfoResourcesItem;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfoResourcesItemAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetWhitelistIPs;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessPostWhitelistIPs;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUpdateAutoScale;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUserResponse;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUserResponseAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.UpdateUserAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.utils.TestUtilities;
import github.com/IBM/cloud-db2-java-sdk.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the Db2saas service.
 */
public class Db2saasIT extends SdkIntegrationTestBase {
  public Db2saas service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../db2saas_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Db2saas.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Db2saas.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testGetDb2SaasConnectionInfo() throws Exception {
    try {
      GetDb2SaasConnectionInfoOptions getDb2SaasConnectionInfoOptions = new GetDb2SaasConnectionInfoOptions.Builder()
        .deploymentId("testString")
        .xDeploymentId("testString")
        .build();

      // Invoke operation
      Response<SuccessConnectionInfo> response = service.getDb2SaasConnectionInfo(getDb2SaasConnectionInfoOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessConnectionInfo successConnectionInfoResult = response.getResult();
      assertNotNull(successConnectionInfoResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasConnectionInfo" })
  public void testPostDb2SaasWhitelist() throws Exception {
    try {
      IpAddress ipAddressModel = new IpAddress.Builder()
        .address("127.0.0.1")
        .description("A sample IP address")
        .build();

      PostDb2SaasWhitelistOptions postDb2SaasWhitelistOptions = new PostDb2SaasWhitelistOptions.Builder()
        .xDeploymentId("testString")
        .ipAddresses(java.util.Arrays.asList(ipAddressModel))
        .build();

      // Invoke operation
      Response<SuccessPostWhitelistIPs> response = service.postDb2SaasWhitelist(postDb2SaasWhitelistOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessPostWhitelistIPs successPostWhitelistIPsResult = response.getResult();
      assertNotNull(successPostWhitelistIPsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPostDb2SaasWhitelist" })
  public void testGetDb2SaasWhitelist() throws Exception {
    try {
      GetDb2SaasWhitelistOptions getDb2SaasWhitelistOptions = new GetDb2SaasWhitelistOptions.Builder()
        .xDeploymentId("testString")
        .build();

      // Invoke operation
      Response<SuccessGetWhitelistIPs> response = service.getDb2SaasWhitelist(getDb2SaasWhitelistOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessGetWhitelistIPs successGetWhitelistIPsResult = response.getResult();
      assertNotNull(successGetWhitelistIPsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasWhitelist" })
  public void testPostDb2SaasUser() throws Exception {
    try {
      CreateUserAuthentication createUserAuthenticationModel = new CreateUserAuthentication.Builder()
        .method("internal")
        .policyId("Default")
        .build();

      PostDb2SaasUserOptions postDb2SaasUserOptions = new PostDb2SaasUserOptions.Builder()
        .xDeploymentId("testString")
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

      // Invoke operation
      Response<SuccessUserResponse> response = service.postDb2SaasUser(postDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessUserResponse successUserResponseResult = response.getResult();
      assertNotNull(successUserResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPostDb2SaasUser" })
  public void testGetDb2SaasUser() throws Exception {
    try {
      GetDb2SaasUserOptions getDb2SaasUserOptions = new GetDb2SaasUserOptions.Builder()
        .xDeploymentId("testString")
        .build();

      // Invoke operation
      Response<SuccessGetUserInfo> response = service.getDb2SaasUser(getDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessGetUserInfo successGetUserInfoResult = response.getResult();
      assertNotNull(successGetUserInfoResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasUser" })
  public void testPutDb2SaasUser() throws Exception {
    try {
      UpdateUserAuthentication updateUserAuthenticationModel = new UpdateUserAuthentication.Builder()
        .method("internal")
        .policyId("Default")
        .build();

      PutDb2SaasUserOptions putDb2SaasUserOptions = new PutDb2SaasUserOptions.Builder()
        .xDeploymentId("testString")
        .id("test-user")
        .newId("test-user")
        .newName("test_user")
        .newOldPassword("dEkMc43@gfAPl!867^dSbu")
        .newNewPassword("ihbgc26@gfAPl!1297^dFGy")
        .newRole("bluuser")
        .newEmail("test_user@mycompany.com")
        .newLocked("no")
        .newAuthentication(updateUserAuthenticationModel)
        .newIbmid("test-ibm-id")
        .build();

      // Invoke operation
      Response<SuccessUserResponse> response = service.putDb2SaasUser(putDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessUserResponse successUserResponseResult = response.getResult();
      assertNotNull(successUserResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPutDb2SaasUser" })
  public void testGetbyidDb2SaasUser() throws Exception {
    try {
      GetbyidDb2SaasUserOptions getbyidDb2SaasUserOptions = new GetbyidDb2SaasUserOptions.Builder()
        .xDeploymentId("testString")
        .build();

      // Invoke operation
      Response<SuccessGetUserByID> response = service.getbyidDb2SaasUser(getbyidDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessGetUserByID successGetUserByIdResult = response.getResult();
      assertNotNull(successGetUserByIdResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetbyidDb2SaasUser" })
  public void testPutDb2SaasAutoscale() throws Exception {
    try {
      PutDb2SaasAutoscaleOptions putDb2SaasAutoscaleOptions = new PutDb2SaasAutoscaleOptions.Builder()
        .xDeploymentId("testString")
        .autoScalingThreshold(Long.valueOf("90"))
        .autoScalingPauseLimit(Long.valueOf("70"))
        .build();

      // Invoke operation
      Response<SuccessUpdateAutoScale> response = service.putDb2SaasAutoscale(putDb2SaasAutoscaleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessUpdateAutoScale successUpdateAutoScaleResult = response.getResult();
      assertNotNull(successUpdateAutoScaleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPutDb2SaasAutoscale" })
  public void testGetDb2SaasAutoscale() throws Exception {
    try {
      GetDb2SaasAutoscaleOptions getDb2SaasAutoscaleOptions = new GetDb2SaasAutoscaleOptions.Builder()
        .xDeploymentId("testString")
        .build();

      // Invoke operation
      Response<SuccessAutoScaling> response = service.getDb2SaasAutoscale(getDb2SaasAutoscaleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessAutoScaling successAutoScalingResult = response.getResult();
      assertNotNull(successAutoScalingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasAutoscale" })
  public void testDeleteDb2SaasUser() throws Exception {
    try {
      DeleteDb2SaasUserOptions deleteDb2SaasUserOptions = new DeleteDb2SaasUserOptions.Builder()
        .xDeploymentId("testString")
        .id("test-user")
        .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.deleteDb2SaasUser(deleteDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();
      assertNotNull(resultResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
