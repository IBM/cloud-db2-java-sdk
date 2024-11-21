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

package github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.UpdateUserAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateUserAuthentication model.
 */
public class UpdateUserAuthenticationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateUserAuthentication() throws Throwable {
    UpdateUserAuthentication updateUserAuthenticationModel = new UpdateUserAuthentication.Builder()
      .method("internal")
      .policyId("Default")
      .build();
    assertEquals(updateUserAuthenticationModel.method(), "internal");
    assertEquals(updateUserAuthenticationModel.policyId(), "Default");

    String json = TestUtilities.serialize(updateUserAuthenticationModel);

    UpdateUserAuthentication updateUserAuthenticationModelNew = TestUtilities.deserialize(json, UpdateUserAuthentication.class);
    assertTrue(updateUserAuthenticationModelNew instanceof UpdateUserAuthentication);
    assertEquals(updateUserAuthenticationModelNew.method(), "internal");
    assertEquals(updateUserAuthenticationModelNew.policyId(), "Default");
  }
}