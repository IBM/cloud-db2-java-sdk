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
 * Unit test class for the SuccessTuneableParamsTuneableParamDbm model.
 */
public class SuccessTuneableParamsTuneableParamDbmTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSuccessTuneableParamsTuneableParamDbm() throws Throwable {
    SuccessTuneableParamsTuneableParamDbm successTuneableParamsTuneableParamDbmModel = new SuccessTuneableParamsTuneableParamDbm();
    assertNull(successTuneableParamsTuneableParamDbmModel.getCommBandwidth());
    assertNull(successTuneableParamsTuneableParamDbmModel.getCpuspeed());
    assertNull(successTuneableParamsTuneableParamDbmModel.getDftMonBufpool());
    assertNull(successTuneableParamsTuneableParamDbmModel.getDftMonLock());
    assertNull(successTuneableParamsTuneableParamDbmModel.getDftMonSort());
    assertNull(successTuneableParamsTuneableParamDbmModel.getDftMonStmt());
    assertNull(successTuneableParamsTuneableParamDbmModel.getDftMonTable());
    assertNull(successTuneableParamsTuneableParamDbmModel.getDftMonTimestamp());
    assertNull(successTuneableParamsTuneableParamDbmModel.getDftMonUow());
    assertNull(successTuneableParamsTuneableParamDbmModel.getDiaglevel());
    assertNull(successTuneableParamsTuneableParamDbmModel.getFederatedAsync());
    assertNull(successTuneableParamsTuneableParamDbmModel.getIndexrec());
    assertNull(successTuneableParamsTuneableParamDbmModel.getIntraParallel());
    assertNull(successTuneableParamsTuneableParamDbmModel.getKeepfenced());
    assertNull(successTuneableParamsTuneableParamDbmModel.getMaxConnretries());
    assertNull(successTuneableParamsTuneableParamDbmModel.getMaxQuerydegree());
    assertNull(successTuneableParamsTuneableParamDbmModel.getMonHeapSz());
    assertNull(successTuneableParamsTuneableParamDbmModel.getMultipartsizemb());
    assertNull(successTuneableParamsTuneableParamDbmModel.getNotifylevel());
    assertNull(successTuneableParamsTuneableParamDbmModel.getNumInitagents());
    assertNull(successTuneableParamsTuneableParamDbmModel.getNumInitfenced());
    assertNull(successTuneableParamsTuneableParamDbmModel.getNumPoolagents());
    assertNull(successTuneableParamsTuneableParamDbmModel.getResyncInterval());
    assertNull(successTuneableParamsTuneableParamDbmModel.getRqrioblk());
    assertNull(successTuneableParamsTuneableParamDbmModel.getStartStopTime());
    assertNull(successTuneableParamsTuneableParamDbmModel.getUtilImpactLim());
    assertNull(successTuneableParamsTuneableParamDbmModel.getWlmDispatcher());
    assertNull(successTuneableParamsTuneableParamDbmModel.getWlmDispConcur());
    assertNull(successTuneableParamsTuneableParamDbmModel.getWlmDispCpuShares());
    assertNull(successTuneableParamsTuneableParamDbmModel.getWlmDispMinUtil());
  }
}