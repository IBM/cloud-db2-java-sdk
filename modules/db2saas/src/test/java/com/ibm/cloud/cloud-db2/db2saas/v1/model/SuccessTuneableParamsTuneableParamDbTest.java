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
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParamDb;
import com/ibm/cloud/cloud-db2.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SuccessTuneableParamsTuneableParamDb model.
 */
public class SuccessTuneableParamsTuneableParamDbTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSuccessTuneableParamsTuneableParamDb() throws Throwable {
    SuccessTuneableParamsTuneableParamDb successTuneableParamsTuneableParamDbModel = new SuccessTuneableParamsTuneableParamDb();
    assertNull(successTuneableParamsTuneableParamDbModel.getActSortmemLimit());
    assertNull(successTuneableParamsTuneableParamDbModel.getAltCollate());
    assertNull(successTuneableParamsTuneableParamDbModel.getAppgroupMemSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getApplheapsz());
    assertNull(successTuneableParamsTuneableParamDbModel.getApplMemory());
    assertNull(successTuneableParamsTuneableParamDbModel.getAppCtlHeapSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getArchretrydelay());
    assertNull(successTuneableParamsTuneableParamDbModel.getAuthnCacheDuration());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutorestart());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoCgStats());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoMaint());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoReorg());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoReval());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoRunstats());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoSampling());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoStatsViews());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoStmtStats());
    assertNull(successTuneableParamsTuneableParamDbModel.getAutoTblMaint());
    assertNull(successTuneableParamsTuneableParamDbModel.getAvgAppls());
    assertNull(successTuneableParamsTuneableParamDbModel.getCatalogcacheSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getChngpgsThresh());
    assertNull(successTuneableParamsTuneableParamDbModel.getCurCommit());
    assertNull(successTuneableParamsTuneableParamDbModel.getDatabaseMemory());
    assertNull(successTuneableParamsTuneableParamDbModel.getDbheap());
    assertNull(successTuneableParamsTuneableParamDbModel.getDbCollname());
    assertNull(successTuneableParamsTuneableParamDbModel.getDbMemThresh());
    assertNull(successTuneableParamsTuneableParamDbModel.getDdlCompressionDef());
    assertNull(successTuneableParamsTuneableParamDbModel.getDdlConstraintDef());
    assertNull(successTuneableParamsTuneableParamDbModel.getDecfltRounding());
    assertNull(successTuneableParamsTuneableParamDbModel.getDecArithmetic());
    assertNull(successTuneableParamsTuneableParamDbModel.getDecToCharFmt());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftDegree());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftExtentSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftLoadrecSes());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftMttbTypes());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftPrefetchSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftQueryopt());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftRefreshAge());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftSchemasDcc());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftSqlmathwarn());
    assertNull(successTuneableParamsTuneableParamDbModel.getDftTableOrg());
    assertNull(successTuneableParamsTuneableParamDbModel.getDlchktime());
    assertNull(successTuneableParamsTuneableParamDbModel.getEnableXmlchar());
    assertNull(successTuneableParamsTuneableParamDbModel.getExtendedRowSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getGroupheapRatio());
    assertNull(successTuneableParamsTuneableParamDbModel.getIndexrec());
    assertNull(successTuneableParamsTuneableParamDbModel.getLargeAggregation());
    assertNull(successTuneableParamsTuneableParamDbModel.getLocklist());
    assertNull(successTuneableParamsTuneableParamDbModel.getLocktimeout());
    assertNull(successTuneableParamsTuneableParamDbModel.getLogindexbuild());
    assertNull(successTuneableParamsTuneableParamDbModel.getLogApplInfo());
    assertNull(successTuneableParamsTuneableParamDbModel.getLogDdlStmts());
    assertNull(successTuneableParamsTuneableParamDbModel.getLogDiskCap());
    assertNull(successTuneableParamsTuneableParamDbModel.getMaxappls());
    assertNull(successTuneableParamsTuneableParamDbModel.getMaxfilop());
    assertNull(successTuneableParamsTuneableParamDbModel.getMaxlocks());
    assertNull(successTuneableParamsTuneableParamDbModel.getMinDecDiv3());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonActMetrics());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonDeadlock());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonLckMsgLvl());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonLocktimeout());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonLockwait());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonLwThresh());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonObjMetrics());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonPkglistSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonReqMetrics());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonRtnData());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonRtnExeclist());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonUowData());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonUowExeclist());
    assertNull(successTuneableParamsTuneableParamDbModel.getMonUowPkglist());
    assertNull(successTuneableParamsTuneableParamDbModel.getNcharMapping());
    assertNull(successTuneableParamsTuneableParamDbModel.getNumFreqvalues());
    assertNull(successTuneableParamsTuneableParamDbModel.getNumIocleaners());
    assertNull(successTuneableParamsTuneableParamDbModel.getNumIoservers());
    assertNull(successTuneableParamsTuneableParamDbModel.getNumLogSpan());
    assertNull(successTuneableParamsTuneableParamDbModel.getNumQuantiles());
    assertNull(successTuneableParamsTuneableParamDbModel.getOptBuffpage());
    assertNull(successTuneableParamsTuneableParamDbModel.getOptDirectWrkld());
    assertNull(successTuneableParamsTuneableParamDbModel.getOptLocklist());
    assertNull(successTuneableParamsTuneableParamDbModel.getOptMaxlocks());
    assertNull(successTuneableParamsTuneableParamDbModel.getOptSortheap());
    assertNull(successTuneableParamsTuneableParamDbModel.getPageAgeTrgtGcr());
    assertNull(successTuneableParamsTuneableParamDbModel.getPageAgeTrgtMcr());
    assertNull(successTuneableParamsTuneableParamDbModel.getPckcachesz());
    assertNull(successTuneableParamsTuneableParamDbModel.getPlStackTrace());
    assertNull(successTuneableParamsTuneableParamDbModel.getSelfTuningMem());
    assertNull(successTuneableParamsTuneableParamDbModel.getSeqdetect());
    assertNull(successTuneableParamsTuneableParamDbModel.getSheapthresShr());
    assertNull(successTuneableParamsTuneableParamDbModel.getSoftmax());
    assertNull(successTuneableParamsTuneableParamDbModel.getSortheap());
    assertNull(successTuneableParamsTuneableParamDbModel.getSqlCcflags());
    assertNull(successTuneableParamsTuneableParamDbModel.getStatHeapSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getStmtheap());
    assertNull(successTuneableParamsTuneableParamDbModel.getStmtConc());
    assertNull(successTuneableParamsTuneableParamDbModel.getStringUnits());
    assertNull(successTuneableParamsTuneableParamDbModel.getSystimePeriodAdj());
    assertNull(successTuneableParamsTuneableParamDbModel.getTrackmod());
    assertNull(successTuneableParamsTuneableParamDbModel.getUtilHeapSz());
    assertNull(successTuneableParamsTuneableParamDbModel.getWlmAdmissionCtrl());
    assertNull(successTuneableParamsTuneableParamDbModel.getWlmAgentLoadTrgt());
    assertNull(successTuneableParamsTuneableParamDbModel.getWlmCpuLimit());
    assertNull(successTuneableParamsTuneableParamDbModel.getWlmCpuShares());
    assertNull(successTuneableParamsTuneableParamDbModel.getWlmCpuShareMode());
  }
}