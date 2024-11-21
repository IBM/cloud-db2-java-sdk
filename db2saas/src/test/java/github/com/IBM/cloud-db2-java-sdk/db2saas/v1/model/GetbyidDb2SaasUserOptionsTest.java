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
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.GetbyidDb2SaasUserOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.utils.TestUtilities;
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
      .xDeploymentId("testString")
      .build();
    assertEquals(getbyidDb2SaasUserOptionsModel.xDeploymentId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetbyidDb2SaasUserOptionsError() throws Throwable {
    new GetbyidDb2SaasUserOptions.Builder().build();
  }

}