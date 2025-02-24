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
 * Unit test class for the GetbyidDb2SaasUserOptions model.
 */
public class GetbyidDb2SaasUserOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetbyidDb2SaasUserOptions() throws Throwable {
    GetbyidDb2SaasUserOptions getbyidDb2SaasUserOptionsModel = new GetbyidDb2SaasUserOptions.Builder()
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .build();
    assertEquals(getbyidDb2SaasUserOptionsModel.xDeploymentId(), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetbyidDb2SaasUserOptionsError() throws Throwable {
    new GetbyidDb2SaasUserOptions.Builder().build();
  }

}