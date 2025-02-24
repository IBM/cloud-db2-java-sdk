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

import com.ibm.cloud.cloud_db2.db2saas.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SuccessUserResponse model.
 */
public class SuccessUserResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSuccessUserResponse() throws Throwable {
    SuccessUserResponse successUserResponseModel = new SuccessUserResponse();
    assertNull(successUserResponseModel.getDvRole());
    assertNull(successUserResponseModel.getMetadata());
    assertNull(successUserResponseModel.getFormatedIbmid());
    assertNull(successUserResponseModel.getRole());
    assertNull(successUserResponseModel.getIamid());
    assertNull(successUserResponseModel.getPermittedActions());
    assertNull(successUserResponseModel.isAllClean());
    assertNull(successUserResponseModel.getPassword());
    assertNull(successUserResponseModel.isIam());
    assertNull(successUserResponseModel.getName());
    assertNull(successUserResponseModel.getIbmid());
    assertNull(successUserResponseModel.getId());
    assertNull(successUserResponseModel.getLocked());
    assertNull(successUserResponseModel.getInitErrorMsg());
    assertNull(successUserResponseModel.getEmail());
    assertNull(successUserResponseModel.getAuthentication());
  }
}