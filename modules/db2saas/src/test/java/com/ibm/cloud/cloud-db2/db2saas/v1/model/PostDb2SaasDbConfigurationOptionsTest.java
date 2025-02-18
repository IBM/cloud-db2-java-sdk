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
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsDb;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsDbm;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsRegistry;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasDbConfigurationOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PostDb2SaasDbConfigurationOptions model.
 */
public class PostDb2SaasDbConfigurationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPostDb2SaasDbConfigurationOptions() throws Throwable {
    CreateCustomSettingsRegistry createCustomSettingsRegistryModel = new CreateCustomSettingsRegistry.Builder()
      .dB2Bidi("YES")
      .dB2Compopt("-")
      .dB2LockToRb("STATEMENT")
      .dB2Stmm("YES")
      .dB2AlternateAuthzBehaviour("EXTERNAL_ROUTINE_DBADM")
      .dB2Antijoin("EXTEND")
      .dB2AtsEnable("YES")
      .dB2DeferredPrepareSemantics("YES")
      .dB2Evaluncommitted("NO")
      .dB2ExtendedOptimization("-")
      .dB2IndexPctfreeDefault("10")
      .dB2InlistToNljn("YES")
      .dB2MinimizeListprefetch("NO")
      .dB2ObjectTableEntries("5000")
      .dB2Optprofile("NO")
      .dB2OptstatsLog("-")
      .dB2OptMaxTempSize("-")
      .dB2ParallelIo("-")
      .dB2ReducedOptimization("-")
      .dB2Selectivity("YES")
      .dB2Skipdeleted("NO")
      .dB2Skipinserted("YES")
      .dB2SyncReleaseLockAttributes("YES")
      .dB2TruncateReusestorage("IMPORT")
      .dB2UseAlternatePageCleaning("ON")
      .dB2ViewReoptValues("NO")
      .dB2WlmSettings("-")
      .dB2Workload("SAP")
      .build();
    assertEquals(createCustomSettingsRegistryModel.dB2Bidi(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2Compopt(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2LockToRb(), "STATEMENT");
    assertEquals(createCustomSettingsRegistryModel.dB2Stmm(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2AlternateAuthzBehaviour(), "EXTERNAL_ROUTINE_DBADM");
    assertEquals(createCustomSettingsRegistryModel.dB2Antijoin(), "EXTEND");
    assertEquals(createCustomSettingsRegistryModel.dB2AtsEnable(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2DeferredPrepareSemantics(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2Evaluncommitted(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2ExtendedOptimization(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2IndexPctfreeDefault(), "10");
    assertEquals(createCustomSettingsRegistryModel.dB2InlistToNljn(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2MinimizeListprefetch(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2ObjectTableEntries(), "5000");
    assertEquals(createCustomSettingsRegistryModel.dB2Optprofile(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2OptstatsLog(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2OptMaxTempSize(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2ParallelIo(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2ReducedOptimization(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2Selectivity(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2Skipdeleted(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2Skipinserted(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2SyncReleaseLockAttributes(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2TruncateReusestorage(), "IMPORT");
    assertEquals(createCustomSettingsRegistryModel.dB2UseAlternatePageCleaning(), "ON");
    assertEquals(createCustomSettingsRegistryModel.dB2ViewReoptValues(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2WlmSettings(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2Workload(), "SAP");

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

    PostDb2SaasDbConfigurationOptions postDb2SaasDbConfigurationOptionsModel = new PostDb2SaasDbConfigurationOptions.Builder()
      .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
      .registry(createCustomSettingsRegistryModel)
      .db(createCustomSettingsDbModel)
      .dbm(createCustomSettingsDbmModel)
      .build();
    assertEquals(postDb2SaasDbConfigurationOptionsModel.xDbProfile(), "crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A");
    assertEquals(postDb2SaasDbConfigurationOptionsModel.registry(), createCustomSettingsRegistryModel);
    assertEquals(postDb2SaasDbConfigurationOptionsModel.db(), createCustomSettingsDbModel);
    assertEquals(postDb2SaasDbConfigurationOptionsModel.dbm(), createCustomSettingsDbmModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostDb2SaasDbConfigurationOptionsError() throws Throwable {
    new PostDb2SaasDbConfigurationOptions.Builder().build();
  }

}