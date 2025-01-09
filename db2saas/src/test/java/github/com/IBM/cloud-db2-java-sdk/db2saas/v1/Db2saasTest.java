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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.Db2saas;
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
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessConnectionInfoPrivate;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessConnectionInfoPublic;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetAllowlistIPs;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserByID;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserByIDAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfo;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfoResourcesItem;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfoResourcesItemAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessPostAllowedlistIPs;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUpdateAutoScale;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUserResponse;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessUserResponseAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.utils.TestUtilities;
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
      .xDbProfile("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
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
    assertEquals(request.getHeader("X-Db-Profile"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
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
      .xDbProfile("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
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
    assertEquals(request.getHeader("X-Db-Profile"), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
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