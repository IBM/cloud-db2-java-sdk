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
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PutDb2SaasAutoscaleOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PutDb2SaasAutoscaleOptions model.
 */
public class PutDb2SaasAutoscaleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutDb2SaasAutoscaleOptions() throws Throwable {
    PutDb2SaasAutoscaleOptions putDb2SaasAutoscaleOptionsModel = new PutDb2SaasAutoscaleOptions.Builder()
      .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
      .autoScalingEnabled("true")
      .autoScalingThreshold(Long.valueOf("90"))
      .autoScalingOverTimePeriod(Double.valueOf("5"))
      .autoScalingPauseLimit(Long.valueOf("70"))
      .autoScalingAllowPlanLimit("YES")
      .build();
    assertEquals(putDb2SaasAutoscaleOptionsModel.xDbProfile(), "crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A");
    assertEquals(putDb2SaasAutoscaleOptionsModel.autoScalingEnabled(), "true");
    assertEquals(putDb2SaasAutoscaleOptionsModel.autoScalingThreshold(), Long.valueOf("90"));
    assertEquals(putDb2SaasAutoscaleOptionsModel.autoScalingOverTimePeriod(), Double.valueOf("5"));
    assertEquals(putDb2SaasAutoscaleOptionsModel.autoScalingPauseLimit(), Long.valueOf("70"));
    assertEquals(putDb2SaasAutoscaleOptionsModel.autoScalingAllowPlanLimit(), "YES");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutDb2SaasAutoscaleOptionsError() throws Throwable {
    new PutDb2SaasAutoscaleOptions.Builder().build();
  }

}