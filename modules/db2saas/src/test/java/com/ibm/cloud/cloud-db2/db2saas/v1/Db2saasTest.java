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

package com/ibm/cloud/cloud-db2.db2saas.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com/ibm/cloud/cloud-db2.db2saas.v1.Db2saas;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.Backup;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsDb;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsDbm;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsRegistry;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateUserAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.DeleteDb2SaasUserOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasAllowlistOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasAutoscaleOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasBackupOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasConnectionInfoOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasTuneableParamOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasUserOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetbyidDb2SaasUserOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.IpAddress;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasAllowlistOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasBackupOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasDbConfigurationOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasUserOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PutDb2SaasAutoscaleOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessAutoScaling;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessConnectionInfo;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessConnectionInfoPrivate;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessConnectionInfoPublic;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessCreateBackup;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessCreateBackupTask;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetAllowlistIPs;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetBackups;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserByID;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserByIDAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserInfo;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserInfoResourcesItem;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserInfoResourcesItemAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessPostAllowedlistIPs;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessPostCustomSettings;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParams;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParam;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParamDb;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParamDbm;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParamRegistry;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessUpdateAutoScale;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessUserResponse;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessUserResponseAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.utils.TestUtilities;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Db2saas service.
 */
public class Db2saasTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Db2saas db2saasService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new Db2saas(serviceName, null);
  }

  // Construct the service URL using the default server variable values
  @Test
  public void testConstructServiceURLwithDefaultValues() throws Throwable {
    String defaultFormattedUrl = "https://us-south.db2.saas.ibm.com/dbapi/v4";
    String constructedUrl = Db2saas.constructServiceUrl(null);
    assertEquals(constructedUrl, defaultFormattedUrl);
  }

  // Construct the service URL with an invalid server variable name (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructServiceURLWithInvalidVariable() throws Throwable {
    Map<String, String> variables = new HashMap<>();
    variables.put("invalid_variable_name", "value");

    Db2saas.constructServiceUrl(variables);
  }

  // Test the getDb2SaasConnectionInfo operation with a valid options model parameter
  @Test
  public void testGetDb2SaasConnectionInfoWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"public\": {\"hostname\": \"84792aeb-2a9c-4dee-bfad-2e529f16945d-useast-private.bt1ibm.dev.db2.ibmappdomain.cloud\", \"databaseName\": \"bluedb\", \"sslPort\": \"30450\", \"ssl\": true, \"databaseVersion\": \"11.5.0\"}, \"private\": {\"hostname\": \"84792aeb-2a9c-4dee-bfad-2e529f16945d-useast.bt1ibm.dev.db2.ibmappdomain.cloud\", \"databaseName\": \"bluedb\", \"sslPort\": \"30450\", \"ssl\": true, \"databaseVersion\": \"11.5.0\", \"private_serviceName\": \"us-south-private.db2oc.test.saas.ibm.com:32764\", \"cloud_service_offering\": \"dashdb-for-transactions\", \"vpe_service_crn\": \"crn:v1:staging:public:dashdb-for-transactions:us-south:::endpoint:feea41a1-ff88-4541-8865-0698ccb7c5dc-us-south-private.bt1ibm.dev.db2.ibmappdomain.cloud\", \"db_vpc_endpoint_service\": \"feea41a1-ff88-4541-8865-0698ccb7c5dc-ussouth-private.bt1ibm.dev.db2.ibmappdomain.cloud:32679\"}}";
    String getDb2SaasConnectionInfoPath = "/connectioninfo/crn%253Av1%253Astaging%253Apublic%253Adashdb-for-transactions%253Aus-south%253Aa%252Fe7e3e87b512f474381c0684a5ecbba03%253A69db420f-33d5-4953-8bd8-1950abd356f6%253A%253A";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDb2SaasConnectionInfoOptions model
    GetDb2SaasConnectionInfoOptions getDb2SaasConnectionInfoOptionsModel = new GetDb2SaasConnectionInfoOptions.Builder()
      .deploymentId("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A69db420f-33d5-4953-8bd8-1950abd356f6%3A%3A")
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .build();

    // Invoke getDb2SaasConnectionInfo() with a valid options model and verify the result
    Response<SuccessConnectionInfo> response = db2saasService.getDb2SaasConnectionInfo(getDb2SaasConnectionInfoOptionsModel).execute();
    assertNotNull(response);
    SuccessConnectionInfo responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDb2SaasConnectionInfoPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Deployment-Id"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDb2SaasConnectionInfo operation with and without retries enabled
  @Test
  public void testGetDb2SaasConnectionInfoWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testGetDb2SaasConnectionInfoWOptions();

    db2saasService.disableRetries();
    testGetDb2SaasConnectionInfoWOptions();
  }

  // Test the getDb2SaasConnectionInfo operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDb2SaasConnectionInfoNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.getDb2SaasConnectionInfo(null).execute();
  }

  // Test the postDb2SaasAllowlist operation with a valid options model parameter
  @Test
  public void testPostDb2SaasAllowlistWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": \"status\"}";
    String postDb2SaasAllowlistPath = "/dbsettings/whitelistips";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the IpAddress model
    IpAddress ipAddressModel = new IpAddress.Builder()
      .address("127.0.0.1")
      .description("A sample IP address")
      .build();

    // Construct an instance of the PostDb2SaasAllowlistOptions model
    PostDb2SaasAllowlistOptions postDb2SaasAllowlistOptionsModel = new PostDb2SaasAllowlistOptions.Builder()
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .ipAddresses(java.util.Arrays.asList(ipAddressModel))
      .build();

    // Invoke postDb2SaasAllowlist() with a valid options model and verify the result
    Response<SuccessPostAllowedlistIPs> response = db2saasService.postDb2SaasAllowlist(postDb2SaasAllowlistOptionsModel).execute();
    assertNotNull(response);
    SuccessPostAllowedlistIPs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, postDb2SaasAllowlistPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Deployment-Id"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the postDb2SaasAllowlist operation with and without retries enabled
  @Test
  public void testPostDb2SaasAllowlistWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testPostDb2SaasAllowlistWOptions();

    db2saasService.disableRetries();
    testPostDb2SaasAllowlistWOptions();
  }

  // Test the postDb2SaasAllowlist operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostDb2SaasAllowlistNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.postDb2SaasAllowlist(null).execute();
  }

  // Test the getDb2SaasAllowlist operation with a valid options model parameter
  @Test
  public void testGetDb2SaasAllowlistWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ip_addresses\": [{\"address\": \"127.0.0.1\", \"description\": \"A sample IP address\"}]}";
    String getDb2SaasAllowlistPath = "/dbsettings/whitelistips";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDb2SaasAllowlistOptions model
    GetDb2SaasAllowlistOptions getDb2SaasAllowlistOptionsModel = new GetDb2SaasAllowlistOptions.Builder()
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .build();

    // Invoke getDb2SaasAllowlist() with a valid options model and verify the result
    Response<SuccessGetAllowlistIPs> response = db2saasService.getDb2SaasAllowlist(getDb2SaasAllowlistOptionsModel).execute();
    assertNotNull(response);
    SuccessGetAllowlistIPs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDb2SaasAllowlistPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Deployment-Id"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDb2SaasAllowlist operation with and without retries enabled
  @Test
  public void testGetDb2SaasAllowlistWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testGetDb2SaasAllowlistWOptions();

    db2saasService.disableRetries();
    testGetDb2SaasAllowlistWOptions();
  }

  // Test the getDb2SaasAllowlist operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDb2SaasAllowlistNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.getDb2SaasAllowlist(null).execute();
  }

  // Test the postDb2SaasUser operation with a valid options model parameter
  @Test
  public void testPostDb2SaasUserWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"dvRole\": \"dvRole\", \"metadata\": {\"anyKey\": \"anyValue\"}, \"formatedIbmid\": \"formatedIbmid\", \"role\": \"bluadmin\", \"iamid\": \"iamid\", \"permittedActions\": [\"permittedActions\"], \"allClean\": true, \"password\": \"password\", \"iam\": false, \"name\": \"name\", \"ibmid\": \"ibmid\", \"id\": \"id\", \"locked\": \"no\", \"initErrorMsg\": \"initErrorMsg\", \"email\": \"user@host.org\", \"authentication\": {\"method\": \"method\", \"policy_id\": \"policyId\"}}";
    String postDb2SaasUserPath = "/users";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateUserAuthentication model
    CreateUserAuthentication createUserAuthenticationModel = new CreateUserAuthentication.Builder()
      .method("internal")
      .policyId("Default")
      .build();

    // Construct an instance of the PostDb2SaasUserOptions model
    PostDb2SaasUserOptions postDb2SaasUserOptionsModel = new PostDb2SaasUserOptions.Builder()
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

    // Invoke postDb2SaasUser() with a valid options model and verify the result
    Response<SuccessUserResponse> response = db2saasService.postDb2SaasUser(postDb2SaasUserOptionsModel).execute();
    assertNotNull(response);
    SuccessUserResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, postDb2SaasUserPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Deployment-Id"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the postDb2SaasUser operation with and without retries enabled
  @Test
  public void testPostDb2SaasUserWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testPostDb2SaasUserWOptions();

    db2saasService.disableRetries();
    testPostDb2SaasUserWOptions();
  }

  // Test the postDb2SaasUser operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostDb2SaasUserNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.postDb2SaasUser(null).execute();
  }

  // Test the getDb2SaasUser operation with a valid options model parameter
  @Test
  public void testGetDb2SaasUserWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"count\": 1, \"resources\": [{\"dvRole\": \"test-role\", \"metadata\": {\"anyKey\": \"anyValue\"}, \"formatedIbmid\": \"test-formated-ibm-id\", \"role\": \"bluadmin\", \"iamid\": \"test-iam-id\", \"permittedActions\": [\"permittedActions\"], \"allClean\": false, \"password\": \"nd!@aegr63@989hcRFTcdcs63\", \"iam\": false, \"name\": \"admin\", \"ibmid\": \"test-ibm-id\", \"id\": \"admin\", \"locked\": \"no\", \"initErrorMsg\": \"initErrorMsg\", \"email\": \"user@host.org\", \"authentication\": {\"method\": \"internal\", \"policy_id\": \"Default\"}}]}";
    String getDb2SaasUserPath = "/users";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDb2SaasUserOptions model
    GetDb2SaasUserOptions getDb2SaasUserOptionsModel = new GetDb2SaasUserOptions.Builder()
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .build();

    // Invoke getDb2SaasUser() with a valid options model and verify the result
    Response<SuccessGetUserInfo> response = db2saasService.getDb2SaasUser(getDb2SaasUserOptionsModel).execute();
    assertNotNull(response);
    SuccessGetUserInfo responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDb2SaasUserPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Deployment-Id"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDb2SaasUser operation with and without retries enabled
  @Test
  public void testGetDb2SaasUserWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testGetDb2SaasUserWOptions();

    db2saasService.disableRetries();
    testGetDb2SaasUserWOptions();
  }

  // Test the getDb2SaasUser operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDb2SaasUserNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.getDb2SaasUser(null).execute();
  }

  // Test the deleteDb2SaasUser operation with a valid options model parameter
  @Test
  public void testDeleteDb2SaasUserWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"anyKey\": \"anyValue\"}";
    String deleteDb2SaasUserPath = "/users/test-user";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDb2SaasUserOptions model
    DeleteDb2SaasUserOptions deleteDb2SaasUserOptionsModel = new DeleteDb2SaasUserOptions.Builder()
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .id("test-user")
      .build();

    // Invoke deleteDb2SaasUser() with a valid options model and verify the result
    Response<Map<String, Object>> response = db2saasService.deleteDb2SaasUser(deleteDb2SaasUserOptionsModel).execute();
    assertNotNull(response);
    Map<String, Object> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDb2SaasUserPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Deployment-Id"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDb2SaasUser operation with and without retries enabled
  @Test
  public void testDeleteDb2SaasUserWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testDeleteDb2SaasUserWOptions();

    db2saasService.disableRetries();
    testDeleteDb2SaasUserWOptions();
  }

  // Test the deleteDb2SaasUser operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDb2SaasUserNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.deleteDb2SaasUser(null).execute();
  }

  // Test the getbyidDb2SaasUser operation with a valid options model parameter
  @Test
  public void testGetbyidDb2SaasUserWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"dvRole\": \"dvRole\", \"metadata\": {\"anyKey\": \"anyValue\"}, \"formatedIbmid\": \"formatedIbmid\", \"role\": \"bluadmin\", \"iamid\": \"iamid\", \"permittedActions\": [\"permittedActions\"], \"allClean\": true, \"password\": \"password\", \"iam\": false, \"name\": \"name\", \"ibmid\": \"ibmid\", \"id\": \"id\", \"locked\": \"no\", \"initErrorMsg\": \"initErrorMsg\", \"email\": \"user@host.org\", \"authentication\": {\"method\": \"method\", \"policy_id\": \"policyId\"}}";
    String getbyidDb2SaasUserPath = "/users/bluadmin";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetbyidDb2SaasUserOptions model
    GetbyidDb2SaasUserOptions getbyidDb2SaasUserOptionsModel = new GetbyidDb2SaasUserOptions.Builder()
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .build();

    // Invoke getbyidDb2SaasUser() with a valid options model and verify the result
    Response<SuccessGetUserByID> response = db2saasService.getbyidDb2SaasUser(getbyidDb2SaasUserOptionsModel).execute();
    assertNotNull(response);
    SuccessGetUserByID responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getbyidDb2SaasUserPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Deployment-Id"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getbyidDb2SaasUser operation with and without retries enabled
  @Test
  public void testGetbyidDb2SaasUserWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testGetbyidDb2SaasUserWOptions();

    db2saasService.disableRetries();
    testGetbyidDb2SaasUserWOptions();
  }

  // Test the getbyidDb2SaasUser operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetbyidDb2SaasUserNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.getbyidDb2SaasUser(null).execute();
  }

  // Test the putDb2SaasAutoscale operation with a valid options model parameter
  @Test
  public void testPutDb2SaasAutoscaleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\"}";
    String putDb2SaasAutoscalePath = "/manage/scaling/auto";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PutDb2SaasAutoscaleOptions model
    PutDb2SaasAutoscaleOptions putDb2SaasAutoscaleOptionsModel = new PutDb2SaasAutoscaleOptions.Builder()
      .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
      .autoScalingEnabled("true")
      .autoScalingThreshold(Long.valueOf("90"))
      .autoScalingOverTimePeriod(Double.valueOf("5"))
      .autoScalingPauseLimit(Long.valueOf("70"))
      .autoScalingAllowPlanLimit("YES")
      .build();

    // Invoke putDb2SaasAutoscale() with a valid options model and verify the result
    Response<SuccessUpdateAutoScale> response = db2saasService.putDb2SaasAutoscale(putDb2SaasAutoscaleOptionsModel).execute();
    assertNotNull(response);
    SuccessUpdateAutoScale responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, putDb2SaasAutoscalePath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Db-Profile"), "crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the putDb2SaasAutoscale operation with and without retries enabled
  @Test
  public void testPutDb2SaasAutoscaleWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testPutDb2SaasAutoscaleWOptions();

    db2saasService.disableRetries();
    testPutDb2SaasAutoscaleWOptions();
  }

  // Test the putDb2SaasAutoscale operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutDb2SaasAutoscaleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.putDb2SaasAutoscale(null).execute();
  }

  // Test the getDb2SaasAutoscale operation with a valid options model parameter
  @Test
  public void testGetDb2SaasAutoscaleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_scaling_allow_plan_limit\": false, \"auto_scaling_enabled\": true, \"auto_scaling_max_storage\": 21, \"auto_scaling_over_time_period\": 25, \"auto_scaling_pause_limit\": 21, \"auto_scaling_threshold\": 20, \"storage_unit\": \"storageUnit\", \"storage_utilization_percentage\": 28, \"support_auto_scaling\": true}";
    String getDb2SaasAutoscalePath = "/manage/scaling/auto";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDb2SaasAutoscaleOptions model
    GetDb2SaasAutoscaleOptions getDb2SaasAutoscaleOptionsModel = new GetDb2SaasAutoscaleOptions.Builder()
      .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
      .build();

    // Invoke getDb2SaasAutoscale() with a valid options model and verify the result
    Response<SuccessAutoScaling> response = db2saasService.getDb2SaasAutoscale(getDb2SaasAutoscaleOptionsModel).execute();
    assertNotNull(response);
    SuccessAutoScaling responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDb2SaasAutoscalePath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Db-Profile"), "crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDb2SaasAutoscale operation with and without retries enabled
  @Test
  public void testGetDb2SaasAutoscaleWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testGetDb2SaasAutoscaleWOptions();

    db2saasService.disableRetries();
    testGetDb2SaasAutoscaleWOptions();
  }

  // Test the getDb2SaasAutoscale operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDb2SaasAutoscaleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.getDb2SaasAutoscale(null).execute();
  }

  // Test the postDb2SaasDbConfiguration operation with a valid options model parameter
  @Test
  public void testPostDb2SaasDbConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"description\": \"description\", \"id\": \"id\", \"status\": \"status\"}";
    String postDb2SaasDbConfigurationPath = "/manage/deployments/custom_setting";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateCustomSettingsRegistry model
    CreateCustomSettingsRegistry createCustomSettingsRegistryModel = new CreateCustomSettingsRegistry.Builder()
      .dB2Bidi("YES")
      .dB2Compopt("-")
      .dB2LockToRb("STATEMENT")
      .dB2Stmm("YES")
      .dB2AlternateAuthzBehaviour("EXTERNAL_ROUTINE_DBADM")
      .dB2Antijoin("EXTEND")
      .dB2AtsEnable("YES")
      .dB2DeferredPrepareSemantics("YES")
      .dB2Evaluncommitted("NO")
      .dB2ExtendedOptimization("-")
      .dB2IndexPctfreeDefault("10")
      .dB2InlistToNljn("YES")
      .dB2MinimizeListprefetch("NO")
      .dB2ObjectTableEntries("5000")
      .dB2Optprofile("NO")
      .dB2OptstatsLog("-")
      .dB2OptMaxTempSize("-")
      .dB2ParallelIo("-")
      .dB2ReducedOptimization("-")
      .dB2Selectivity("YES")
      .dB2Skipdeleted("NO")
      .dB2Skipinserted("YES")
      .dB2SyncReleaseLockAttributes("YES")
      .dB2TruncateReusestorage("IMPORT")
      .dB2UseAlternatePageCleaning("ON")
      .dB2ViewReoptValues("NO")
      .dB2WlmSettings("-")
      .dB2Workload("SAP")
      .build();

    // Construct an instance of the CreateCustomSettingsDb model
    CreateCustomSettingsDb createCustomSettingsDbModel = new CreateCustomSettingsDb.Builder()
      .actSortmemLimit("NONE")
      .altCollate("NULL")
      .appgroupMemSz("10")
      .applheapsz("AUTOMATIC")
      .applMemory("AUTOMATIC")
      .appCtlHeapSz("64000")
      .archretrydelay("65535")
      .authnCacheDuration("10000")
      .autorestart("ON")
      .autoCgStats("ON")
      .autoMaint("OFF")
      .autoReorg("ON")
      .autoReval("IMMEDIATE")
      .autoRunstats("ON")
      .autoSampling("OFF")
      .autoStatsViews("ON")
      .autoStmtStats("OFF")
      .autoTblMaint("ON")
      .avgAppls("-")
      .catalogcacheSz("-")
      .chngpgsThresh("50")
      .curCommit("AVAILABLE")
      .databaseMemory("AUTOMATIC")
      .dbheap("AUTOMATIC")
      .dbCollname("-")
      .dbMemThresh("75")
      .ddlCompressionDef("YES")
      .ddlConstraintDef("NO")
      .decfltRounding("ROUND_HALF_UP")
      .decArithmetic("-")
      .decToCharFmt("NEW")
      .dftDegree("-1")
      .dftExtentSz("32")
      .dftLoadrecSes("1000")
      .dftMttbTypes("-")
      .dftPrefetchSz("AUTOMATIC")
      .dftQueryopt("3")
      .dftRefreshAge("-")
      .dftSchemasDcc("YES")
      .dftSqlmathwarn("YES")
      .dftTableOrg("COLUMN")
      .dlchktime("10000")
      .enableXmlchar("YES")
      .extendedRowSz("ENABLE")
      .groupheapRatio("50")
      .indexrec("SYSTEM")
      .largeAggregation("YES")
      .locklist("AUTOMATIC")
      .locktimeout("-1")
      .logindexbuild("ON")
      .logApplInfo("YES")
      .logDdlStmts("NO")
      .logDiskCap("0")
      .maxappls("5000")
      .maxfilop("1024")
      .maxlocks("AUTOMATIC")
      .minDecDiv3("NO")
      .monActMetrics("EXTENDED")
      .monDeadlock("HISTORY")
      .monLckMsgLvl("2")
      .monLocktimeout("HISTORY")
      .monLockwait("WITHOUT_HIST")
      .monLwThresh("10000")
      .monObjMetrics("BASE")
      .monPkglistSz("512")
      .monReqMetrics("NONE")
      .monRtnData("BASE")
      .monRtnExeclist("ON")
      .monUowData("NONE")
      .monUowExeclist("ON")
      .monUowPkglist("OFF")
      .ncharMapping("CHAR_CU32")
      .numFreqvalues("50")
      .numIocleaners("AUTOMATIC")
      .numIoservers("AUTOMATIC")
      .numLogSpan("10")
      .numQuantiles("100")
      .optBuffpage("-")
      .optDirectWrkld("ON")
      .optLocklist("-")
      .optMaxlocks("-")
      .optSortheap("-")
      .pageAgeTrgtGcr("5000")
      .pageAgeTrgtMcr("3000")
      .pckcachesz("AUTOMATIC")
      .plStackTrace("UNHANDLED")
      .selfTuningMem("ON")
      .seqdetect("YES")
      .sheapthresShr("AUTOMATIC")
      .softmax("-")
      .sortheap("AUTOMATIC")
      .sqlCcflags("-")
      .statHeapSz("AUTOMATIC")
      .stmtheap("AUTOMATIC")
      .stmtConc("LITERALS")
      .stringUnits("SYSTEM")
      .systimePeriodAdj("NO")
      .trackmod("YES")
      .utilHeapSz("AUTOMATIC")
      .wlmAdmissionCtrl("YES")
      .wlmAgentLoadTrgt("1000")
      .wlmCpuLimit("80")
      .wlmCpuShares("1000")
      .wlmCpuShareMode("SOFT")
      .build();

    // Construct an instance of the CreateCustomSettingsDbm model
    CreateCustomSettingsDbm createCustomSettingsDbmModel = new CreateCustomSettingsDbm.Builder()
      .commBandwidth("1000")
      .cpuspeed("0.5")
      .dftMonBufpool("ON")
      .dftMonLock("OFF")
      .dftMonSort("ON")
      .dftMonStmt("ON")
      .dftMonTable("OFF")
      .dftMonTimestamp("ON")
      .dftMonUow("ON")
      .diaglevel("2")
      .federatedAsync("32767")
      .indexrec("RESTART")
      .intraParallel("YES")
      .keepfenced("YES")
      .maxConnretries("5")
      .maxQuerydegree("4")
      .monHeapSz("AUTOMATIC")
      .multipartsizemb("100")
      .notifylevel("2")
      .numInitagents("100")
      .numInitfenced("20")
      .numPoolagents("10")
      .resyncInterval("1000")
      .rqrioblk("8192")
      .startStopTime("10")
      .utilImpactLim("50")
      .wlmDispatcher("YES")
      .wlmDispConcur("16")
      .wlmDispCpuShares("YES")
      .wlmDispMinUtil("10")
      .build();

    // Construct an instance of the PostDb2SaasDbConfigurationOptions model
    PostDb2SaasDbConfigurationOptions postDb2SaasDbConfigurationOptionsModel = new PostDb2SaasDbConfigurationOptions.Builder()
      .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
      .registry(createCustomSettingsRegistryModel)
      .db(createCustomSettingsDbModel)
      .dbm(createCustomSettingsDbmModel)
      .build();

    // Invoke postDb2SaasDbConfiguration() with a valid options model and verify the result
    Response<SuccessPostCustomSettings> response = db2saasService.postDb2SaasDbConfiguration(postDb2SaasDbConfigurationOptionsModel).execute();
    assertNotNull(response);
    SuccessPostCustomSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, postDb2SaasDbConfigurationPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Db-Profile"), "crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the postDb2SaasDbConfiguration operation with and without retries enabled
  @Test
  public void testPostDb2SaasDbConfigurationWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testPostDb2SaasDbConfigurationWOptions();

    db2saasService.disableRetries();
    testPostDb2SaasDbConfigurationWOptions();
  }

  // Test the postDb2SaasDbConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostDb2SaasDbConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.postDb2SaasDbConfiguration(null).execute();
  }

  // Test the getDb2SaasTuneableParam operation with a valid options model parameter
  @Test
  public void testGetDb2SaasTuneableParamWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"tuneable_param\": {\"db\": {\"ACT_SORTMEM_LIMIT\": \"'NONE', 'range(10, 100)'\", \"ALT_COLLATE\": \"'NULL', 'IDENTITY_16BIT'\", \"APPGROUP_MEM_SZ\": \"'range(1, 1000000)'\", \"APPLHEAPSZ\": \"'AUTOMATIC', 'range(16, 2147483647)'\", \"APPL_MEMORY\": \"'AUTOMATIC', 'range(128, 4294967295)'\", \"APP_CTL_HEAP_SZ\": \"'range(1, 64000)'\", \"ARCHRETRYDELAY\": \"'range(0, 65535)'\", \"AUTHN_CACHE_DURATION\": \"'range(1,10000)'\", \"AUTORESTART\": \"'ON', 'OFF'\", \"AUTO_CG_STATS\": \"'ON', 'OFF'\", \"AUTO_MAINT\": \"'ON', 'OFF'\", \"AUTO_REORG\": \"'ON', 'OFF'\", \"AUTO_REVAL\": \"'IMMEDIATE', 'DISABLED', 'DEFERRED', 'DEFERRED_FORCE'\", \"AUTO_RUNSTATS\": \"'ON', 'OFF'\", \"AUTO_SAMPLING\": \"'ON', 'OFF'\", \"AUTO_STATS_VIEWS\": \"'ON', 'OFF'\", \"AUTO_STMT_STATS\": \"'ON', 'OFF'\", \"AUTO_TBL_MAINT\": \"'ON', 'OFF'\", \"AVG_APPLS\": \"'-'\", \"CATALOGCACHE_SZ\": \"'-'\", \"CHNGPGS_THRESH\": \"'range(5,99)'\", \"CUR_COMMIT\": \"'ON, AVAILABLE, DISABLED'\", \"DATABASE_MEMORY\": \"'AUTOMATIC', 'COMPUTED', 'range(0, 4294967295)'\", \"DBHEAP\": \"'AUTOMATIC', 'range(32, 2147483647)'\", \"DB_COLLNAME\": \"'-'\", \"DB_MEM_THRESH\": \"'range(0, 100)'\", \"DDL_COMPRESSION_DEF\": \"'YES', 'NO'\", \"DDL_CONSTRAINT_DEF\": \"'YES', 'NO'\", \"DECFLT_ROUNDING\": \"'ROUND_HALF_EVEN', 'ROUND_CEILING', 'ROUND_FLOOR', 'ROUND_HALF_UP', 'ROUND_DOWN'\", \"DEC_ARITHMETIC\": \"'-'\", \"DEC_TO_CHAR_FMT\": \"'NEW', 'V95'\", \"DFT_DEGREE\": \"'-1', 'ANY', 'range(1, 32767)'\", \"DFT_EXTENT_SZ\": \"'range(2, 256)'\", \"DFT_LOADREC_SES\": \"'range(1, 30000)'\", \"DFT_MTTB_TYPES\": \"'-'\", \"DFT_PREFETCH_SZ\": \"'range(0, 32767)', 'AUTOMATIC'\", \"DFT_QUERYOPT\": \"'range(0, 9)'\", \"DFT_REFRESH_AGE\": \"'-'\", \"DFT_SCHEMAS_DCC\": \"'YES', 'NO'\", \"DFT_SQLMATHWARN\": \"'YES', 'NO'\", \"DFT_TABLE_ORG\": \"'COLUMN', 'ROW'\", \"DLCHKTIME\": \"'range(1000, 600000)'\", \"ENABLE_XMLCHAR\": \"'YES', 'NO'\", \"EXTENDED_ROW_SZ\": \"'ENABLE', 'DISABLE'\", \"GROUPHEAP_RATIO\": \"'range(1, 99)'\", \"INDEXREC\": \"'SYSTEM', 'ACCESS', 'ACCESS_NO_REDO', 'RESTART', 'RESTART_NO_REDO'\", \"LARGE_AGGREGATION\": \"'YES', 'NO'\", \"LOCKLIST\": \"'AUTOMATIC', 'range(4, 134217728)'\", \"LOCKTIMEOUT\": \"'-1', 'range(0, 32767)'\", \"LOGINDEXBUILD\": \"'ON', 'OFF'\", \"LOG_APPL_INFO\": \"'YES', 'NO'\", \"LOG_DDL_STMTS\": \"'YES', 'NO'\", \"LOG_DISK_CAP\": \"'0', '-1', 'range(1, 2147483647)'\", \"MAXAPPLS\": \"'range(1, 60000)'\", \"MAXFILOP\": \"'range(64, 61440)'\", \"MAXLOCKS\": \"'AUTOMATIC', 'range(1, 100)'\", \"MIN_DEC_DIV_3\": \"'YES', 'NO'\", \"MON_ACT_METRICS\": \"'NONE', 'BASE', 'EXTENDED'\", \"MON_DEADLOCK\": \"'NONE', 'WITHOUT_HIST', 'HISTORY', 'HIST_AND_VALUES'\", \"MON_LCK_MSG_LVL\": \"'range(0, 3)'\", \"MON_LOCKTIMEOUT\": \"'NONE', 'WITHOUT_HIST', 'HISTORY', 'HIST_AND_VALUES'\", \"MON_LOCKWAIT\": \"'NONE', 'WITHOUT_HIST', 'HISTORY', 'HIST_AND_VALUES'\", \"MON_LW_THRESH\": \"'range(1000, 4294967295)'\", \"MON_OBJ_METRICS\": \"'NONE', 'BASE', 'EXTENDED'\", \"MON_PKGLIST_SZ\": \"'range(0, 1024)'\", \"MON_REQ_METRICS\": \"'NONE', 'BASE', 'EXTENDED'\", \"MON_RTN_DATA\": \"'NONE', 'BASE'\", \"MON_RTN_EXECLIST\": \"'OFF', 'ON'\", \"MON_UOW_DATA\": \"'NONE', 'BASE'\", \"MON_UOW_EXECLIST\": \"'ON', 'OFF'\", \"MON_UOW_PKGLIST\": \"'OFF', 'ON'\", \"NCHAR_MAPPING\": \"'CHAR_CU32', 'GRAPHIC_CU32', 'GRAPHIC_CU16', 'NOT APPLICABLE'\", \"NUM_FREQVALUES\": \"'range(0, 32767)'\", \"NUM_IOCLEANERS\": \"'AUTOMATIC', 'range(0, 255)'\", \"NUM_IOSERVERS\": \"'AUTOMATIC', 'range(1, 255)'\", \"NUM_LOG_SPAN\": \"'range(0, 65535)'\", \"NUM_QUANTILES\": \"'range(0, 32767)'\", \"OPT_BUFFPAGE\": \"'-'\", \"OPT_DIRECT_WRKLD\": \"'ON', 'OFF', 'YES', 'NO', 'AUTOMATIC'\", \"OPT_LOCKLIST\": \"'-'\", \"OPT_MAXLOCKS\": \"'-'\", \"OPT_SORTHEAP\": \"'-'\", \"PAGE_AGE_TRGT_GCR\": \"'range(1, 65535)'\", \"PAGE_AGE_TRGT_MCR\": \"'range(1, 65535)'\", \"PCKCACHESZ\": \"'AUTOMATIC', '-1', 'range(32, 2147483646)'\", \"PL_STACK_TRACE\": \"'NONE', 'ALL', 'UNHANDLED'\", \"SELF_TUNING_MEM\": \"'ON', 'OFF'\", \"SEQDETECT\": \"'YES', 'NO'\", \"SHEAPTHRES_SHR\": \"'AUTOMATIC', 'range(250, 2147483647)'\", \"SOFTMAX\": \"'-'\", \"SORTHEAP\": \"'AUTOMATIC', 'range(16, 4294967295)'\", \"SQL_CCFLAGS\": \"'-'\", \"STAT_HEAP_SZ\": \"'AUTOMATIC', 'range(1096, 2147483647)'\", \"STMTHEAP\": \"'AUTOMATIC', 'range(128, 2147483647)'\", \"STMT_CONC\": \"'OFF', 'LITERALS', 'COMMENTS', 'COMM_LIT'\", \"STRING_UNITS\": \"'SYSTEM', 'CODEUNITS32'\", \"SYSTIME_PERIOD_ADJ\": \"'NO', 'YES'\", \"TRACKMOD\": \"'YES', 'NO'\", \"UTIL_HEAP_SZ\": \"'AUTOMATIC', 'range(16, 2147483647)'\", \"WLM_ADMISSION_CTRL\": \"'YES', 'NO'\", \"WLM_AGENT_LOAD_TRGT\": \"'AUTOMATIC', 'range(1, 65535)'\", \"WLM_CPU_LIMIT\": \"'range(0, 100)'\", \"WLM_CPU_SHARES\": \"'range(1, 65535)'\", \"WLM_CPU_SHARE_MODE\": \"'HARD', 'SOFT'\"}, \"dbm\": {\"COMM_BANDWIDTH\": \"'range(0.1, 100000)', '-1'\", \"CPUSPEED\": \"'range(0.0000000001, 1)', '-1'\", \"DFT_MON_BUFPOOL\": \"'ON', 'OFF'\", \"DFT_MON_LOCK\": \"'ON', 'OFF'\", \"DFT_MON_SORT\": \"'ON', 'OFF'\", \"DFT_MON_STMT\": \"'ON', 'OFF'\", \"DFT_MON_TABLE\": \"'ON', 'OFF'\", \"DFT_MON_TIMESTAMP\": \"'ON', 'OFF'\", \"DFT_MON_UOW\": \"'ON', 'OFF'\", \"DIAGLEVEL\": \"'range(0, 4)'\", \"FEDERATED_ASYNC\": \"'range(0, 32767)', '-1', 'ANY'\", \"INDEXREC\": \"'RESTART', 'RESTART_NO_REDO', 'ACCESS', 'ACCESS_NO_REDO'\", \"INTRA_PARALLEL\": \"'SYSTEM', 'NO', 'YES'\", \"KEEPFENCED\": \"'YES', 'NO'\", \"MAX_CONNRETRIES\": \"'range(0, 100)'\", \"MAX_QUERYDEGREE\": \"'range(1, 32767)', '-1', 'ANY'\", \"MON_HEAP_SZ\": \"'range(0, 2147483647)', 'AUTOMATIC'\", \"MULTIPARTSIZEMB\": \"'range(5, 5120)'\", \"NOTIFYLEVEL\": \"'range(0, 4)'\", \"NUM_INITAGENTS\": \"'range(0, 64000)'\", \"NUM_INITFENCED\": \"'range(0, 64000)'\", \"NUM_POOLAGENTS\": \"'-1', 'range(0, 64000)'\", \"RESYNC_INTERVAL\": \"'range(1, 60000)'\", \"RQRIOBLK\": \"'range(4096, 65535)'\", \"START_STOP_TIME\": \"'range(1, 1440)'\", \"UTIL_IMPACT_LIM\": \"'range(1, 100)'\", \"WLM_DISPATCHER\": \"'YES', 'NO'\", \"WLM_DISP_CONCUR\": \"'range(1, 32767)', 'COMPUTED'\", \"WLM_DISP_CPU_SHARES\": \"'NO', 'YES'\", \"WLM_DISP_MIN_UTIL\": \"'range(0, 100)'\"}, \"registry\": {\"DB2BIDI\": \"'YES', 'NO'\", \"DB2COMPOPT\": \"'-'\", \"DB2LOCK_TO_RB\": \"'STATEMENT'\", \"DB2STMM\": \"'NO', 'YES'\", \"DB2_ALTERNATE_AUTHZ_BEHAVIOUR\": \"'EXTERNAL_ROUTINE_DBADM', 'EXTERNAL_ROUTINE_DBAUTH'\", \"DB2_ANTIJOIN\": \"'YES', 'NO', 'EXTEND'\", \"DB2_ATS_ENABLE\": \"'YES', 'NO'\", \"DB2_DEFERRED_PREPARE_SEMANTICS\": \"'NO', 'YES'\", \"DB2_EVALUNCOMMITTED\": \"'NO', 'YES'\", \"DB2_EXTENDED_OPTIMIZATION\": \"'-'\", \"DB2_INDEX_PCTFREE_DEFAULT\": \"'range(0, 99)'\", \"DB2_INLIST_TO_NLJN\": \"'NO', 'YES'\", \"DB2_MINIMIZE_LISTPREFETCH\": \"'NO', 'YES'\", \"DB2_OBJECT_TABLE_ENTRIES\": \"'range(0, 65532)'\", \"DB2_OPTPROFILE\": \"'NO', 'YES'\", \"DB2_OPTSTATS_LOG\": \"'-'\", \"DB2_OPT_MAX_TEMP_SIZE\": \"'-'\", \"DB2_PARALLEL_IO\": \"'-'\", \"DB2_REDUCED_OPTIMIZATION\": \"'-'\", \"DB2_SELECTIVITY\": \"'YES', 'NO', 'ALL'\", \"DB2_SKIPDELETED\": \"'NO', 'YES'\", \"DB2_SKIPINSERTED\": \"'NO', 'YES'\", \"DB2_SYNC_RELEASE_LOCK_ATTRIBUTES\": \"'NO', 'YES'\", \"DB2_TRUNCATE_REUSESTORAGE\": \"'IMPORT', 'LOAD', 'TRUNCATE'\", \"DB2_USE_ALTERNATE_PAGE_CLEANING\": \"'ON', 'OFF'\", \"DB2_VIEW_REOPT_VALUES\": \"'NO', 'YES'\", \"DB2_WLM_SETTINGS\": \"'-'\", \"DB2_WORKLOAD\": \"'1C', 'ANALYTICS', 'CM', 'COGNOS_CS', 'FILENET_CM', 'INFOR_ERP_LN', 'MAXIMO', 'MDM', 'SAP', 'TPM', 'WAS', 'WC', 'WP'\"}}}";
    String getDb2SaasTuneableParamPath = "/manage/tuneable_param";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDb2SaasTuneableParamOptions model
    GetDb2SaasTuneableParamOptions getDb2SaasTuneableParamOptionsModel = new GetDb2SaasTuneableParamOptions();

    // Invoke getDb2SaasTuneableParam() with a valid options model and verify the result
    Response<SuccessTuneableParams> response = db2saasService.getDb2SaasTuneableParam(getDb2SaasTuneableParamOptionsModel).execute();
    assertNotNull(response);
    SuccessTuneableParams responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDb2SaasTuneableParamPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDb2SaasTuneableParam operation with and without retries enabled
  @Test
  public void testGetDb2SaasTuneableParamWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testGetDb2SaasTuneableParamWOptions();

    db2saasService.disableRetries();
    testGetDb2SaasTuneableParamWOptions();
  }

  // Test the getDb2SaasBackup operation with a valid options model parameter
  @Test
  public void testGetDb2SaasBackupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"backups\": [{\"id\": \"id\", \"type\": \"type\", \"status\": \"status\", \"created_at\": \"createdAt\", \"size\": 4, \"duration\": 8}]}";
    String getDb2SaasBackupPath = "/manage/backups";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDb2SaasBackupOptions model
    GetDb2SaasBackupOptions getDb2SaasBackupOptionsModel = new GetDb2SaasBackupOptions.Builder()
      .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
      .build();

    // Invoke getDb2SaasBackup() with a valid options model and verify the result
    Response<SuccessGetBackups> response = db2saasService.getDb2SaasBackup(getDb2SaasBackupOptionsModel).execute();
    assertNotNull(response);
    SuccessGetBackups responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDb2SaasBackupPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Db-Profile"), "crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDb2SaasBackup operation with and without retries enabled
  @Test
  public void testGetDb2SaasBackupWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testGetDb2SaasBackupWOptions();

    db2saasService.disableRetries();
    testGetDb2SaasBackupWOptions();
  }

  // Test the getDb2SaasBackup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDb2SaasBackupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.getDb2SaasBackup(null).execute();
  }

  // Test the postDb2SaasBackup operation with a valid options model parameter
  @Test
  public void testPostDb2SaasBackupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"task\": {\"id\": \"crn:v1:staging:public:dashdb-for-transactions:us-east:a/e7e3e87b512f474381c0684a5ecbba03:0c9c7889-54de-4ecc-8399-09a4d4ff228e:task:51ff2dc7-6cb9-41c0-9345-09e54550fb7b\"}}";
    String postDb2SaasBackupPath = "/manage/backups/backup";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PostDb2SaasBackupOptions model
    PostDb2SaasBackupOptions postDb2SaasBackupOptionsModel = new PostDb2SaasBackupOptions.Builder()
      .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
      .build();

    // Invoke postDb2SaasBackup() with a valid options model and verify the result
    Response<SuccessCreateBackup> response = db2saasService.postDb2SaasBackup(postDb2SaasBackupOptionsModel).execute();
    assertNotNull(response);
    SuccessCreateBackup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, postDb2SaasBackupPath);
    // Verify header parameters
    assertEquals(request.getHeader("X-Db-Profile"), "crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A");
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the postDb2SaasBackup operation with and without retries enabled
  @Test
  public void testPostDb2SaasBackupWRetries() throws Throwable {
    db2saasService.enableRetries(4, 30);
    testPostDb2SaasBackupWOptions();

    db2saasService.disableRetries();
    testPostDb2SaasBackupWOptions();
  }

  // Test the postDb2SaasBackup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostDb2SaasBackupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    db2saasService.postDb2SaasBackup(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    db2saasService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    db2saasService = Db2saas.newInstance(serviceName);
    String url = server.url("/").toString();
    db2saasService.setServiceUrl(url);
  }
}