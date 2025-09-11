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

package com.ibm.cloud.cloud_db2.db2saas.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.cloud_db2.db2saas.v1.model.PutDb2SaasUserOptions;
import com.ibm.cloud.cloud_db2.db2saas.v1.model.UpdateUserAuthentication;
import com.ibm.cloud.cloud_db2.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PutDb2SaasUserOptions model.
 */
public class PutDb2SaasUserOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutDb2SaasUserOptions() throws Throwable {
    UpdateUserAuthentication updateUserAuthenticationModel = new UpdateUserAuthentication.Builder()
      .method("internal")
      .policyId("Default")
      .build();
    assertEquals(updateUserAuthenticationModel.method(), "internal");
    assertEquals(updateUserAuthenticationModel.policyId(), "Default");

    PutDb2SaasUserOptions putDb2SaasUserOptionsModel = new PutDb2SaasUserOptions.Builder()
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .id("test-user")
      .newId("test-user")
      .newIam(false)
      .newIbmid("test-ibm-id")
      .newName("test_user")
      .newPassword("dEkMc43@gfAPl!867^dSbu")
      .newRole("bluuser")
      .newEmail("test_user@mycompany.com")
      .newLocked("no")
      .newAuthentication(updateUserAuthenticationModel)
      .build();
    assertEquals(putDb2SaasUserOptionsModel.xDeploymentId(), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    assertEquals(putDb2SaasUserOptionsModel.id(), "test-user");
    assertEquals(putDb2SaasUserOptionsModel.newId(), "test-user");
    assertEquals(putDb2SaasUserOptionsModel.newIam(), Boolean.valueOf(false));
    assertEquals(putDb2SaasUserOptionsModel.newIbmid(), "test-ibm-id");
    assertEquals(putDb2SaasUserOptionsModel.newName(), "test_user");
    assertEquals(putDb2SaasUserOptionsModel.newPassword(), "dEkMc43@gfAPl!867^dSbu");
    assertEquals(putDb2SaasUserOptionsModel.newRole(), "bluuser");
    assertEquals(putDb2SaasUserOptionsModel.newEmail(), "test_user@mycompany.com");
    assertEquals(putDb2SaasUserOptionsModel.newLocked(), "no");
    assertEquals(putDb2SaasUserOptionsModel.newAuthentication(), updateUserAuthenticationModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutDb2SaasUserOptionsError() throws Throwable {
    new PutDb2SaasUserOptions.Builder().build();
  }

}