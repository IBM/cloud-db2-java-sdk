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
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsDbm;
import com/ibm/cloud/cloud-db2.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateCustomSettingsDbm model.
 */
public class CreateCustomSettingsDbmTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateCustomSettingsDbm() throws Throwable {
    CreateCustomSettingsDbm createCustomSettingsDbmModel = new CreateCustomSettingsDbm.Builder()
      .commBandwidth("1000")
      .cpuspeed("0.5")
      .dftMonBufpool("ON")
      .dftMonLock("OFF")
      .dftMonSort("ON")
      .dftMonStmt("ON")
      .dftMonTable("OFF")
      .dftMonTimestamp("ON")
      .dftMonUow("ON")
      .diaglevel("2")
      .federatedAsync("32767")
      .indexrec("RESTART")
      .intraParallel("YES")
      .keepfenced("YES")
      .maxConnretries("5")
      .maxQuerydegree("4")
      .monHeapSz("AUTOMATIC")
      .multipartsizemb("100")
      .notifylevel("2")
      .numInitagents("100")
      .numInitfenced("20")
      .numPoolagents("10")
      .resyncInterval("1000")
      .rqrioblk("8192")
      .startStopTime("10")
      .utilImpactLim("50")
      .wlmDispatcher("YES")
      .wlmDispConcur("16")
      .wlmDispCpuShares("YES")
      .wlmDispMinUtil("10")
      .build();
    assertEquals(createCustomSettingsDbmModel.commBandwidth(), "1000");
    assertEquals(createCustomSettingsDbmModel.cpuspeed(), "0.5");
    assertEquals(createCustomSettingsDbmModel.dftMonBufpool(), "ON");
    assertEquals(createCustomSettingsDbmModel.dftMonLock(), "OFF");
    assertEquals(createCustomSettingsDbmModel.dftMonSort(), "ON");
    assertEquals(createCustomSettingsDbmModel.dftMonStmt(), "ON");
    assertEquals(createCustomSettingsDbmModel.dftMonTable(), "OFF");
    assertEquals(createCustomSettingsDbmModel.dftMonTimestamp(), "ON");
    assertEquals(createCustomSettingsDbmModel.dftMonUow(), "ON");
    assertEquals(createCustomSettingsDbmModel.diaglevel(), "2");
    assertEquals(createCustomSettingsDbmModel.federatedAsync(), "32767");
    assertEquals(createCustomSettingsDbmModel.indexrec(), "RESTART");
    assertEquals(createCustomSettingsDbmModel.intraParallel(), "YES");
    assertEquals(createCustomSettingsDbmModel.keepfenced(), "YES");
    assertEquals(createCustomSettingsDbmModel.maxConnretries(), "5");
    assertEquals(createCustomSettingsDbmModel.maxQuerydegree(), "4");
    assertEquals(createCustomSettingsDbmModel.monHeapSz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbmModel.multipartsizemb(), "100");
    assertEquals(createCustomSettingsDbmModel.notifylevel(), "2");
    assertEquals(createCustomSettingsDbmModel.numInitagents(), "100");
    assertEquals(createCustomSettingsDbmModel.numInitfenced(), "20");
    assertEquals(createCustomSettingsDbmModel.numPoolagents(), "10");
    assertEquals(createCustomSettingsDbmModel.resyncInterval(), "1000");
    assertEquals(createCustomSettingsDbmModel.rqrioblk(), "8192");
    assertEquals(createCustomSettingsDbmModel.startStopTime(), "10");
    assertEquals(createCustomSettingsDbmModel.utilImpactLim(), "50");
    assertEquals(createCustomSettingsDbmModel.wlmDispatcher(), "YES");
    assertEquals(createCustomSettingsDbmModel.wlmDispConcur(), "16");
    assertEquals(createCustomSettingsDbmModel.wlmDispCpuShares(), "YES");
    assertEquals(createCustomSettingsDbmModel.wlmDispMinUtil(), "10");

    String json = TestUtilities.serialize(createCustomSettingsDbmModel);

    CreateCustomSettingsDbm createCustomSettingsDbmModelNew = TestUtilities.deserialize(json, CreateCustomSettingsDbm.class);
    assertTrue(createCustomSettingsDbmModelNew instanceof CreateCustomSettingsDbm);
    assertEquals(createCustomSettingsDbmModelNew.commBandwidth(), "1000");
    assertEquals(createCustomSettingsDbmModelNew.cpuspeed(), "0.5");
    assertEquals(createCustomSettingsDbmModelNew.dftMonBufpool(), "ON");
    assertEquals(createCustomSettingsDbmModelNew.dftMonLock(), "OFF");
    assertEquals(createCustomSettingsDbmModelNew.dftMonSort(), "ON");
    assertEquals(createCustomSettingsDbmModelNew.dftMonStmt(), "ON");
    assertEquals(createCustomSettingsDbmModelNew.dftMonTable(), "OFF");
    assertEquals(createCustomSettingsDbmModelNew.dftMonTimestamp(), "ON");
    assertEquals(createCustomSettingsDbmModelNew.dftMonUow(), "ON");
    assertEquals(createCustomSettingsDbmModelNew.diaglevel(), "2");
    assertEquals(createCustomSettingsDbmModelNew.federatedAsync(), "32767");
    assertEquals(createCustomSettingsDbmModelNew.indexrec(), "RESTART");
    assertEquals(createCustomSettingsDbmModelNew.intraParallel(), "YES");
    assertEquals(createCustomSettingsDbmModelNew.keepfenced(), "YES");
    assertEquals(createCustomSettingsDbmModelNew.maxConnretries(), "5");
    assertEquals(createCustomSettingsDbmModelNew.maxQuerydegree(), "4");
    assertEquals(createCustomSettingsDbmModelNew.monHeapSz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbmModelNew.multipartsizemb(), "100");
    assertEquals(createCustomSettingsDbmModelNew.notifylevel(), "2");
    assertEquals(createCustomSettingsDbmModelNew.numInitagents(), "100");
    assertEquals(createCustomSettingsDbmModelNew.numInitfenced(), "20");
    assertEquals(createCustomSettingsDbmModelNew.numPoolagents(), "10");
    assertEquals(createCustomSettingsDbmModelNew.resyncInterval(), "1000");
    assertEquals(createCustomSettingsDbmModelNew.rqrioblk(), "8192");
    assertEquals(createCustomSettingsDbmModelNew.startStopTime(), "10");
    assertEquals(createCustomSettingsDbmModelNew.utilImpactLim(), "50");
    assertEquals(createCustomSettingsDbmModelNew.wlmDispatcher(), "YES");
    assertEquals(createCustomSettingsDbmModelNew.wlmDispConcur(), "16");
    assertEquals(createCustomSettingsDbmModelNew.wlmDispCpuShares(), "YES");
    assertEquals(createCustomSettingsDbmModelNew.wlmDispMinUtil(), "10");
  }
}