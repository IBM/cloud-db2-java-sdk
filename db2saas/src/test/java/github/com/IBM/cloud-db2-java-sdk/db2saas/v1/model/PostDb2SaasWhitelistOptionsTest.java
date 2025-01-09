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
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.IpAddress;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.PostDb2SaasWhitelistOptions;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PostDb2SaasWhitelistOptions model.
 */
public class PostDb2SaasWhitelistOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPostDb2SaasWhitelistOptions() throws Throwable {
    IpAddress ipAddressModel = new IpAddress.Builder()
      .address("127.0.0.1")
      .description("A sample IP address")
      .build();
    assertEquals(ipAddressModel.address(), "127.0.0.1");
    assertEquals(ipAddressModel.description(), "A sample IP address");

    PostDb2SaasWhitelistOptions postDb2SaasWhitelistOptionsModel = new PostDb2SaasWhitelistOptions.Builder()
      .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
      .ipAddresses(java.util.Arrays.asList(ipAddressModel))
      .build();
    assertEquals(postDb2SaasWhitelistOptionsModel.xDeploymentId(), "crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::");
    assertEquals(postDb2SaasWhitelistOptionsModel.ipAddresses(), java.util.Arrays.asList(ipAddressModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostDb2SaasWhitelistOptionsError() throws Throwable {
    new PostDb2SaasWhitelistOptions.Builder().build();
  }

}