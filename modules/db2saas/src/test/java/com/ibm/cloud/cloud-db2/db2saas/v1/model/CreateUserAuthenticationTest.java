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

package com/ibm/cloud/cloud-db2.db2saas.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateUserAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateUserAuthentication model.
 */
public class CreateUserAuthenticationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateUserAuthentication() throws Throwable {
    CreateUserAuthentication createUserAuthenticationModel = new CreateUserAuthentication.Builder()
      .method("internal")
      .policyId("Default")
      .build();
    assertEquals(createUserAuthenticationModel.method(), "internal");
    assertEquals(createUserAuthenticationModel.policyId(), "Default");

    String json = TestUtilities.serialize(createUserAuthenticationModel);

    CreateUserAuthentication createUserAuthenticationModelNew = TestUtilities.deserialize(json, CreateUserAuthentication.class);
    assertTrue(createUserAuthenticationModelNew instanceof CreateUserAuthentication);
    assertEquals(createUserAuthenticationModelNew.method(), "internal");
    assertEquals(createUserAuthenticationModelNew.policyId(), "Default");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateUserAuthenticationError() throws Throwable {
    new CreateUserAuthentication.Builder().build();
  }

}