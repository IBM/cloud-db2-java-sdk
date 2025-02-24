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
 * Unit test class for the CreateCustomSettingsDb model.
 */
public class CreateCustomSettingsDbTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateCustomSettingsDb() throws Throwable {
    CreateCustomSettingsDb createCustomSettingsDbModel = new CreateCustomSettingsDb.Builder()
      .actSortmemLimit("NONE")
      .altCollate("NULL")
      .appgroupMemSz("10")
      .applheapsz("AUTOMATIC")
      .applMemory("AUTOMATIC")
      .appCtlHeapSz("64000")
      .archretrydelay("65535")
      .authnCacheDuration("10000")
      .autorestart("ON")
      .autoCgStats("ON")
      .autoMaint("OFF")
      .autoReorg("ON")
      .autoReval("IMMEDIATE")
      .autoRunstats("ON")
      .autoSampling("OFF")
      .autoStatsViews("ON")
      .autoStmtStats("OFF")
      .autoTblMaint("ON")
      .avgAppls("-")
      .catalogcacheSz("-")
      .chngpgsThresh("50")
      .curCommit("AVAILABLE")
      .databaseMemory("AUTOMATIC")
      .dbheap("AUTOMATIC")
      .dbCollname("-")
      .dbMemThresh("75")
      .ddlCompressionDef("YES")
      .ddlConstraintDef("NO")
      .decfltRounding("ROUND_HALF_UP")
      .decArithmetic("-")
      .decToCharFmt("NEW")
      .dftDegree("-1")
      .dftExtentSz("32")
      .dftLoadrecSes("1000")
      .dftMttbTypes("-")
      .dftPrefetchSz("AUTOMATIC")
      .dftQueryopt("3")
      .dftRefreshAge("-")
      .dftSchemasDcc("YES")
      .dftSqlmathwarn("YES")
      .dftTableOrg("COLUMN")
      .dlchktime("10000")
      .enableXmlchar("YES")
      .extendedRowSz("ENABLE")
      .groupheapRatio("50")
      .indexrec("SYSTEM")
      .largeAggregation("YES")
      .locklist("AUTOMATIC")
      .locktimeout("-1")
      .logindexbuild("ON")
      .logApplInfo("YES")
      .logDdlStmts("NO")
      .logDiskCap("0")
      .maxappls("5000")
      .maxfilop("1024")
      .maxlocks("AUTOMATIC")
      .minDecDiv3("NO")
      .monActMetrics("EXTENDED")
      .monDeadlock("HISTORY")
      .monLckMsgLvl("2")
      .monLocktimeout("HISTORY")
      .monLockwait("WITHOUT_HIST")
      .monLwThresh("10000")
      .monObjMetrics("BASE")
      .monPkglistSz("512")
      .monReqMetrics("NONE")
      .monRtnData("BASE")
      .monRtnExeclist("ON")
      .monUowData("NONE")
      .monUowExeclist("ON")
      .monUowPkglist("OFF")
      .ncharMapping("CHAR_CU32")
      .numFreqvalues("50")
      .numIocleaners("AUTOMATIC")
      .numIoservers("AUTOMATIC")
      .numLogSpan("10")
      .numQuantiles("100")
      .optBuffpage("-")
      .optDirectWrkld("ON")
      .optLocklist("-")
      .optMaxlocks("-")
      .optSortheap("-")
      .pageAgeTrgtGcr("5000")
      .pageAgeTrgtMcr("3000")
      .pckcachesz("AUTOMATIC")
      .plStackTrace("UNHANDLED")
      .selfTuningMem("ON")
      .seqdetect("YES")
      .sheapthresShr("AUTOMATIC")
      .softmax("-")
      .sortheap("AUTOMATIC")
      .sqlCcflags("-")
      .statHeapSz("AUTOMATIC")
      .stmtheap("AUTOMATIC")
      .stmtConc("LITERALS")
      .stringUnits("SYSTEM")
      .systimePeriodAdj("NO")
      .trackmod("YES")
      .utilHeapSz("AUTOMATIC")
      .wlmAdmissionCtrl("YES")
      .wlmAgentLoadTrgt("1000")
      .wlmCpuLimit("80")
      .wlmCpuShares("1000")
      .wlmCpuShareMode("SOFT")
      .build();
    assertEquals(createCustomSettingsDbModel.actSortmemLimit(), "NONE");
    assertEquals(createCustomSettingsDbModel.altCollate(), "NULL");
    assertEquals(createCustomSettingsDbModel.appgroupMemSz(), "10");
    assertEquals(createCustomSettingsDbModel.applheapsz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.applMemory(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.appCtlHeapSz(), "64000");
    assertEquals(createCustomSettingsDbModel.archretrydelay(), "65535");
    assertEquals(createCustomSettingsDbModel.authnCacheDuration(), "10000");
    assertEquals(createCustomSettingsDbModel.autorestart(), "ON");
    assertEquals(createCustomSettingsDbModel.autoCgStats(), "ON");
    assertEquals(createCustomSettingsDbModel.autoMaint(), "OFF");
    assertEquals(createCustomSettingsDbModel.autoReorg(), "ON");
    assertEquals(createCustomSettingsDbModel.autoReval(), "IMMEDIATE");
    assertEquals(createCustomSettingsDbModel.autoRunstats(), "ON");
    assertEquals(createCustomSettingsDbModel.autoSampling(), "OFF");
    assertEquals(createCustomSettingsDbModel.autoStatsViews(), "ON");
    assertEquals(createCustomSettingsDbModel.autoStmtStats(), "OFF");
    assertEquals(createCustomSettingsDbModel.autoTblMaint(), "ON");
    assertEquals(createCustomSettingsDbModel.avgAppls(), "-");
    assertEquals(createCustomSettingsDbModel.catalogcacheSz(), "-");
    assertEquals(createCustomSettingsDbModel.chngpgsThresh(), "50");
    assertEquals(createCustomSettingsDbModel.curCommit(), "AVAILABLE");
    assertEquals(createCustomSettingsDbModel.databaseMemory(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.dbheap(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.dbCollname(), "-");
    assertEquals(createCustomSettingsDbModel.dbMemThresh(), "75");
    assertEquals(createCustomSettingsDbModel.ddlCompressionDef(), "YES");
    assertEquals(createCustomSettingsDbModel.ddlConstraintDef(), "NO");
    assertEquals(createCustomSettingsDbModel.decfltRounding(), "ROUND_HALF_UP");
    assertEquals(createCustomSettingsDbModel.decArithmetic(), "-");
    assertEquals(createCustomSettingsDbModel.decToCharFmt(), "NEW");
    assertEquals(createCustomSettingsDbModel.dftDegree(), "-1");
    assertEquals(createCustomSettingsDbModel.dftExtentSz(), "32");
    assertEquals(createCustomSettingsDbModel.dftLoadrecSes(), "1000");
    assertEquals(createCustomSettingsDbModel.dftMttbTypes(), "-");
    assertEquals(createCustomSettingsDbModel.dftPrefetchSz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.dftQueryopt(), "3");
    assertEquals(createCustomSettingsDbModel.dftRefreshAge(), "-");
    assertEquals(createCustomSettingsDbModel.dftSchemasDcc(), "YES");
    assertEquals(createCustomSettingsDbModel.dftSqlmathwarn(), "YES");
    assertEquals(createCustomSettingsDbModel.dftTableOrg(), "COLUMN");
    assertEquals(createCustomSettingsDbModel.dlchktime(), "10000");
    assertEquals(createCustomSettingsDbModel.enableXmlchar(), "YES");
    assertEquals(createCustomSettingsDbModel.extendedRowSz(), "ENABLE");
    assertEquals(createCustomSettingsDbModel.groupheapRatio(), "50");
    assertEquals(createCustomSettingsDbModel.indexrec(), "SYSTEM");
    assertEquals(createCustomSettingsDbModel.largeAggregation(), "YES");
    assertEquals(createCustomSettingsDbModel.locklist(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.locktimeout(), "-1");
    assertEquals(createCustomSettingsDbModel.logindexbuild(), "ON");
    assertEquals(createCustomSettingsDbModel.logApplInfo(), "YES");
    assertEquals(createCustomSettingsDbModel.logDdlStmts(), "NO");
    assertEquals(createCustomSettingsDbModel.logDiskCap(), "0");
    assertEquals(createCustomSettingsDbModel.maxappls(), "5000");
    assertEquals(createCustomSettingsDbModel.maxfilop(), "1024");
    assertEquals(createCustomSettingsDbModel.maxlocks(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.minDecDiv3(), "NO");
    assertEquals(createCustomSettingsDbModel.monActMetrics(), "EXTENDED");
    assertEquals(createCustomSettingsDbModel.monDeadlock(), "HISTORY");
    assertEquals(createCustomSettingsDbModel.monLckMsgLvl(), "2");
    assertEquals(createCustomSettingsDbModel.monLocktimeout(), "HISTORY");
    assertEquals(createCustomSettingsDbModel.monLockwait(), "WITHOUT_HIST");
    assertEquals(createCustomSettingsDbModel.monLwThresh(), "10000");
    assertEquals(createCustomSettingsDbModel.monObjMetrics(), "BASE");
    assertEquals(createCustomSettingsDbModel.monPkglistSz(), "512");
    assertEquals(createCustomSettingsDbModel.monReqMetrics(), "NONE");
    assertEquals(createCustomSettingsDbModel.monRtnData(), "BASE");
    assertEquals(createCustomSettingsDbModel.monRtnExeclist(), "ON");
    assertEquals(createCustomSettingsDbModel.monUowData(), "NONE");
    assertEquals(createCustomSettingsDbModel.monUowExeclist(), "ON");
    assertEquals(createCustomSettingsDbModel.monUowPkglist(), "OFF");
    assertEquals(createCustomSettingsDbModel.ncharMapping(), "CHAR_CU32");
    assertEquals(createCustomSettingsDbModel.numFreqvalues(), "50");
    assertEquals(createCustomSettingsDbModel.numIocleaners(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.numIoservers(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.numLogSpan(), "10");
    assertEquals(createCustomSettingsDbModel.numQuantiles(), "100");
    assertEquals(createCustomSettingsDbModel.optBuffpage(), "-");
    assertEquals(createCustomSettingsDbModel.optDirectWrkld(), "ON");
    assertEquals(createCustomSettingsDbModel.optLocklist(), "-");
    assertEquals(createCustomSettingsDbModel.optMaxlocks(), "-");
    assertEquals(createCustomSettingsDbModel.optSortheap(), "-");
    assertEquals(createCustomSettingsDbModel.pageAgeTrgtGcr(), "5000");
    assertEquals(createCustomSettingsDbModel.pageAgeTrgtMcr(), "3000");
    assertEquals(createCustomSettingsDbModel.pckcachesz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.plStackTrace(), "UNHANDLED");
    assertEquals(createCustomSettingsDbModel.selfTuningMem(), "ON");
    assertEquals(createCustomSettingsDbModel.seqdetect(), "YES");
    assertEquals(createCustomSettingsDbModel.sheapthresShr(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.softmax(), "-");
    assertEquals(createCustomSettingsDbModel.sortheap(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.sqlCcflags(), "-");
    assertEquals(createCustomSettingsDbModel.statHeapSz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.stmtheap(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.stmtConc(), "LITERALS");
    assertEquals(createCustomSettingsDbModel.stringUnits(), "SYSTEM");
    assertEquals(createCustomSettingsDbModel.systimePeriodAdj(), "NO");
    assertEquals(createCustomSettingsDbModel.trackmod(), "YES");
    assertEquals(createCustomSettingsDbModel.utilHeapSz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModel.wlmAdmissionCtrl(), "YES");
    assertEquals(createCustomSettingsDbModel.wlmAgentLoadTrgt(), "1000");
    assertEquals(createCustomSettingsDbModel.wlmCpuLimit(), "80");
    assertEquals(createCustomSettingsDbModel.wlmCpuShares(), "1000");
    assertEquals(createCustomSettingsDbModel.wlmCpuShareMode(), "SOFT");

    String json = TestUtilities.serialize(createCustomSettingsDbModel);

    CreateCustomSettingsDb createCustomSettingsDbModelNew = TestUtilities.deserialize(json, CreateCustomSettingsDb.class);
    assertTrue(createCustomSettingsDbModelNew instanceof CreateCustomSettingsDb);
    assertEquals(createCustomSettingsDbModelNew.actSortmemLimit(), "NONE");
    assertEquals(createCustomSettingsDbModelNew.altCollate(), "NULL");
    assertEquals(createCustomSettingsDbModelNew.appgroupMemSz(), "10");
    assertEquals(createCustomSettingsDbModelNew.applheapsz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.applMemory(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.appCtlHeapSz(), "64000");
    assertEquals(createCustomSettingsDbModelNew.archretrydelay(), "65535");
    assertEquals(createCustomSettingsDbModelNew.authnCacheDuration(), "10000");
    assertEquals(createCustomSettingsDbModelNew.autorestart(), "ON");
    assertEquals(createCustomSettingsDbModelNew.autoCgStats(), "ON");
    assertEquals(createCustomSettingsDbModelNew.autoMaint(), "OFF");
    assertEquals(createCustomSettingsDbModelNew.autoReorg(), "ON");
    assertEquals(createCustomSettingsDbModelNew.autoReval(), "IMMEDIATE");
    assertEquals(createCustomSettingsDbModelNew.autoRunstats(), "ON");
    assertEquals(createCustomSettingsDbModelNew.autoSampling(), "OFF");
    assertEquals(createCustomSettingsDbModelNew.autoStatsViews(), "ON");
    assertEquals(createCustomSettingsDbModelNew.autoStmtStats(), "OFF");
    assertEquals(createCustomSettingsDbModelNew.autoTblMaint(), "ON");
    assertEquals(createCustomSettingsDbModelNew.avgAppls(), "-");
    assertEquals(createCustomSettingsDbModelNew.catalogcacheSz(), "-");
    assertEquals(createCustomSettingsDbModelNew.chngpgsThresh(), "50");
    assertEquals(createCustomSettingsDbModelNew.curCommit(), "AVAILABLE");
    assertEquals(createCustomSettingsDbModelNew.databaseMemory(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.dbheap(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.dbCollname(), "-");
    assertEquals(createCustomSettingsDbModelNew.dbMemThresh(), "75");
    assertEquals(createCustomSettingsDbModelNew.ddlCompressionDef(), "YES");
    assertEquals(createCustomSettingsDbModelNew.ddlConstraintDef(), "NO");
    assertEquals(createCustomSettingsDbModelNew.decfltRounding(), "ROUND_HALF_UP");
    assertEquals(createCustomSettingsDbModelNew.decArithmetic(), "-");
    assertEquals(createCustomSettingsDbModelNew.decToCharFmt(), "NEW");
    assertEquals(createCustomSettingsDbModelNew.dftDegree(), "-1");
    assertEquals(createCustomSettingsDbModelNew.dftExtentSz(), "32");
    assertEquals(createCustomSettingsDbModelNew.dftLoadrecSes(), "1000");
    assertEquals(createCustomSettingsDbModelNew.dftMttbTypes(), "-");
    assertEquals(createCustomSettingsDbModelNew.dftPrefetchSz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.dftQueryopt(), "3");
    assertEquals(createCustomSettingsDbModelNew.dftRefreshAge(), "-");
    assertEquals(createCustomSettingsDbModelNew.dftSchemasDcc(), "YES");
    assertEquals(createCustomSettingsDbModelNew.dftSqlmathwarn(), "YES");
    assertEquals(createCustomSettingsDbModelNew.dftTableOrg(), "COLUMN");
    assertEquals(createCustomSettingsDbModelNew.dlchktime(), "10000");
    assertEquals(createCustomSettingsDbModelNew.enableXmlchar(), "YES");
    assertEquals(createCustomSettingsDbModelNew.extendedRowSz(), "ENABLE");
    assertEquals(createCustomSettingsDbModelNew.groupheapRatio(), "50");
    assertEquals(createCustomSettingsDbModelNew.indexrec(), "SYSTEM");
    assertEquals(createCustomSettingsDbModelNew.largeAggregation(), "YES");
    assertEquals(createCustomSettingsDbModelNew.locklist(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.locktimeout(), "-1");
    assertEquals(createCustomSettingsDbModelNew.logindexbuild(), "ON");
    assertEquals(createCustomSettingsDbModelNew.logApplInfo(), "YES");
    assertEquals(createCustomSettingsDbModelNew.logDdlStmts(), "NO");
    assertEquals(createCustomSettingsDbModelNew.logDiskCap(), "0");
    assertEquals(createCustomSettingsDbModelNew.maxappls(), "5000");
    assertEquals(createCustomSettingsDbModelNew.maxfilop(), "1024");
    assertEquals(createCustomSettingsDbModelNew.maxlocks(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.minDecDiv3(), "NO");
    assertEquals(createCustomSettingsDbModelNew.monActMetrics(), "EXTENDED");
    assertEquals(createCustomSettingsDbModelNew.monDeadlock(), "HISTORY");
    assertEquals(createCustomSettingsDbModelNew.monLckMsgLvl(), "2");
    assertEquals(createCustomSettingsDbModelNew.monLocktimeout(), "HISTORY");
    assertEquals(createCustomSettingsDbModelNew.monLockwait(), "WITHOUT_HIST");
    assertEquals(createCustomSettingsDbModelNew.monLwThresh(), "10000");
    assertEquals(createCustomSettingsDbModelNew.monObjMetrics(), "BASE");
    assertEquals(createCustomSettingsDbModelNew.monPkglistSz(), "512");
    assertEquals(createCustomSettingsDbModelNew.monReqMetrics(), "NONE");
    assertEquals(createCustomSettingsDbModelNew.monRtnData(), "BASE");
    assertEquals(createCustomSettingsDbModelNew.monRtnExeclist(), "ON");
    assertEquals(createCustomSettingsDbModelNew.monUowData(), "NONE");
    assertEquals(createCustomSettingsDbModelNew.monUowExeclist(), "ON");
    assertEquals(createCustomSettingsDbModelNew.monUowPkglist(), "OFF");
    assertEquals(createCustomSettingsDbModelNew.ncharMapping(), "CHAR_CU32");
    assertEquals(createCustomSettingsDbModelNew.numFreqvalues(), "50");
    assertEquals(createCustomSettingsDbModelNew.numIocleaners(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.numIoservers(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.numLogSpan(), "10");
    assertEquals(createCustomSettingsDbModelNew.numQuantiles(), "100");
    assertEquals(createCustomSettingsDbModelNew.optBuffpage(), "-");
    assertEquals(createCustomSettingsDbModelNew.optDirectWrkld(), "ON");
    assertEquals(createCustomSettingsDbModelNew.optLocklist(), "-");
    assertEquals(createCustomSettingsDbModelNew.optMaxlocks(), "-");
    assertEquals(createCustomSettingsDbModelNew.optSortheap(), "-");
    assertEquals(createCustomSettingsDbModelNew.pageAgeTrgtGcr(), "5000");
    assertEquals(createCustomSettingsDbModelNew.pageAgeTrgtMcr(), "3000");
    assertEquals(createCustomSettingsDbModelNew.pckcachesz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.plStackTrace(), "UNHANDLED");
    assertEquals(createCustomSettingsDbModelNew.selfTuningMem(), "ON");
    assertEquals(createCustomSettingsDbModelNew.seqdetect(), "YES");
    assertEquals(createCustomSettingsDbModelNew.sheapthresShr(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.softmax(), "-");
    assertEquals(createCustomSettingsDbModelNew.sortheap(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.sqlCcflags(), "-");
    assertEquals(createCustomSettingsDbModelNew.statHeapSz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.stmtheap(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.stmtConc(), "LITERALS");
    assertEquals(createCustomSettingsDbModelNew.stringUnits(), "SYSTEM");
    assertEquals(createCustomSettingsDbModelNew.systimePeriodAdj(), "NO");
    assertEquals(createCustomSettingsDbModelNew.trackmod(), "YES");
    assertEquals(createCustomSettingsDbModelNew.utilHeapSz(), "AUTOMATIC");
    assertEquals(createCustomSettingsDbModelNew.wlmAdmissionCtrl(), "YES");
    assertEquals(createCustomSettingsDbModelNew.wlmAgentLoadTrgt(), "1000");
    assertEquals(createCustomSettingsDbModelNew.wlmCpuLimit(), "80");
    assertEquals(createCustomSettingsDbModelNew.wlmCpuShares(), "1000");
    assertEquals(createCustomSettingsDbModelNew.wlmCpuShareMode(), "SOFT");
  }
}