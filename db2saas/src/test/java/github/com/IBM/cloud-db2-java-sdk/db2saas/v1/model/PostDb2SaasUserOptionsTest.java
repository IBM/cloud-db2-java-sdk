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

package github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.CreateUserAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PostDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PostDb2SaasUserOptions model.
 */
public class PostDb2SaasUserOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPostDb2SaasUserOptions() throws Throwable {
    CreateUserAuthentication createUserAuthenticationModel = new CreateUserAuthentication.Builder()
      .method("internal")
      .policyId("Default")
      .build();
    assertEquals(createUserAuthenticationModel.method(), "internal");
    assertEquals(createUserAuthenticationModel.policyId(), "Default");

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
    assertEquals(postDb2SaasUserOptionsModel.xDeploymentId(), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    assertEquals(postDb2SaasUserOptionsModel.id(), "test-user");
    assertEquals(postDb2SaasUserOptionsModel.iam(), Boolean.valueOf(false));
    assertEquals(postDb2SaasUserOptionsModel.ibmid(), "test-ibm-id");
    assertEquals(postDb2SaasUserOptionsModel.name(), "test_user");
    assertEquals(postDb2SaasUserOptionsModel.password(), "dEkMc43@gfAPl!867^dSbu");
    assertEquals(postDb2SaasUserOptionsModel.role(), "bluuser");
    assertEquals(postDb2SaasUserOptionsModel.email(), "test_user@mycompany.com");
    assertEquals(postDb2SaasUserOptionsModel.locked(), "no");
    assertEquals(postDb2SaasUserOptionsModel.authentication(), createUserAuthenticationModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostDb2SaasUserOptionsError() throws Throwable {
    new PostDb2SaasUserOptions.Builder().build();
  }

}