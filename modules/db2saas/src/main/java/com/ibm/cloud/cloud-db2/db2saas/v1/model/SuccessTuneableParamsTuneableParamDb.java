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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Tunable parameters related to the Db2 database instance.
 */
public class SuccessTuneableParamsTuneableParamDb extends GenericModel {

  @SerializedName("ACT_SORTMEM_LIMIT")
  protected String actSortmemLimit;
  @SerializedName("ALT_COLLATE")
  protected String altCollate;
  @SerializedName("APPGROUP_MEM_SZ")
  protected String appgroupMemSz;
  @SerializedName("APPLHEAPSZ")
  protected String applheapsz;
  @SerializedName("APPL_MEMORY")
  protected String applMemory;
  @SerializedName("APP_CTL_HEAP_SZ")
  protected String appCtlHeapSz;
  @SerializedName("ARCHRETRYDELAY")
  protected String archretrydelay;
  @SerializedName("AUTHN_CACHE_DURATION")
  protected String authnCacheDuration;
  @SerializedName("AUTORESTART")
  protected String autorestart;
  @SerializedName("AUTO_CG_STATS")
  protected String autoCgStats;
  @SerializedName("AUTO_MAINT")
  protected String autoMaint;
  @SerializedName("AUTO_REORG")
  protected String autoReorg;
  @SerializedName("AUTO_REVAL")
  protected String autoReval;
  @SerializedName("AUTO_RUNSTATS")
  protected String autoRunstats;
  @SerializedName("AUTO_SAMPLING")
  protected String autoSampling;
  @SerializedName("AUTO_STATS_VIEWS")
  protected String autoStatsViews;
  @SerializedName("AUTO_STMT_STATS")
  protected String autoStmtStats;
  @SerializedName("AUTO_TBL_MAINT")
  protected String autoTblMaint;
  @SerializedName("AVG_APPLS")
  protected String avgAppls;
  @SerializedName("CATALOGCACHE_SZ")
  protected String catalogcacheSz;
  @SerializedName("CHNGPGS_THRESH")
  protected String chngpgsThresh;
  @SerializedName("CUR_COMMIT")
  protected String curCommit;
  @SerializedName("DATABASE_MEMORY")
  protected String databaseMemory;
  @SerializedName("DBHEAP")
  protected String dbheap;
  @SerializedName("DB_COLLNAME")
  protected String dbCollname;
  @SerializedName("DB_MEM_THRESH")
  protected String dbMemThresh;
  @SerializedName("DDL_COMPRESSION_DEF")
  protected String ddlCompressionDef;
  @SerializedName("DDL_CONSTRAINT_DEF")
  protected String ddlConstraintDef;
  @SerializedName("DECFLT_ROUNDING")
  protected String decfltRounding;
  @SerializedName("DEC_ARITHMETIC")
  protected String decArithmetic;
  @SerializedName("DEC_TO_CHAR_FMT")
  protected String decToCharFmt;
  @SerializedName("DFT_DEGREE")
  protected String dftDegree;
  @SerializedName("DFT_EXTENT_SZ")
  protected String dftExtentSz;
  @SerializedName("DFT_LOADREC_SES")
  protected String dftLoadrecSes;
  @SerializedName("DFT_MTTB_TYPES")
  protected String dftMttbTypes;
  @SerializedName("DFT_PREFETCH_SZ")
  protected String dftPrefetchSz;
  @SerializedName("DFT_QUERYOPT")
  protected String dftQueryopt;
  @SerializedName("DFT_REFRESH_AGE")
  protected String dftRefreshAge;
  @SerializedName("DFT_SCHEMAS_DCC")
  protected String dftSchemasDcc;
  @SerializedName("DFT_SQLMATHWARN")
  protected String dftSqlmathwarn;
  @SerializedName("DFT_TABLE_ORG")
  protected String dftTableOrg;
  @SerializedName("DLCHKTIME")
  protected String dlchktime;
  @SerializedName("ENABLE_XMLCHAR")
  protected String enableXmlchar;
  @SerializedName("EXTENDED_ROW_SZ")
  protected String extendedRowSz;
  @SerializedName("GROUPHEAP_RATIO")
  protected String groupheapRatio;
  @SerializedName("INDEXREC")
  protected String indexrec;
  @SerializedName("LARGE_AGGREGATION")
  protected String largeAggregation;
  @SerializedName("LOCKLIST")
  protected String locklist;
  @SerializedName("LOCKTIMEOUT")
  protected String locktimeout;
  @SerializedName("LOGINDEXBUILD")
  protected String logindexbuild;
  @SerializedName("LOG_APPL_INFO")
  protected String logApplInfo;
  @SerializedName("LOG_DDL_STMTS")
  protected String logDdlStmts;
  @SerializedName("LOG_DISK_CAP")
  protected String logDiskCap;
  @SerializedName("MAXAPPLS")
  protected String maxappls;
  @SerializedName("MAXFILOP")
  protected String maxfilop;
  @SerializedName("MAXLOCKS")
  protected String maxlocks;
  @SerializedName("MIN_DEC_DIV_3")
  protected String minDecDiv3;
  @SerializedName("MON_ACT_METRICS")
  protected String monActMetrics;
  @SerializedName("MON_DEADLOCK")
  protected String monDeadlock;
  @SerializedName("MON_LCK_MSG_LVL")
  protected String monLckMsgLvl;
  @SerializedName("MON_LOCKTIMEOUT")
  protected String monLocktimeout;
  @SerializedName("MON_LOCKWAIT")
  protected String monLockwait;
  @SerializedName("MON_LW_THRESH")
  protected String monLwThresh;
  @SerializedName("MON_OBJ_METRICS")
  protected String monObjMetrics;
  @SerializedName("MON_PKGLIST_SZ")
  protected String monPkglistSz;
  @SerializedName("MON_REQ_METRICS")
  protected String monReqMetrics;
  @SerializedName("MON_RTN_DATA")
  protected String monRtnData;
  @SerializedName("MON_RTN_EXECLIST")
  protected String monRtnExeclist;
  @SerializedName("MON_UOW_DATA")
  protected String monUowData;
  @SerializedName("MON_UOW_EXECLIST")
  protected String monUowExeclist;
  @SerializedName("MON_UOW_PKGLIST")
  protected String monUowPkglist;
  @SerializedName("NCHAR_MAPPING")
  protected String ncharMapping;
  @SerializedName("NUM_FREQVALUES")
  protected String numFreqvalues;
  @SerializedName("NUM_IOCLEANERS")
  protected String numIocleaners;
  @SerializedName("NUM_IOSERVERS")
  protected String numIoservers;
  @SerializedName("NUM_LOG_SPAN")
  protected String numLogSpan;
  @SerializedName("NUM_QUANTILES")
  protected String numQuantiles;
  @SerializedName("OPT_BUFFPAGE")
  protected String optBuffpage;
  @SerializedName("OPT_DIRECT_WRKLD")
  protected String optDirectWrkld;
  @SerializedName("OPT_LOCKLIST")
  protected String optLocklist;
  @SerializedName("OPT_MAXLOCKS")
  protected String optMaxlocks;
  @SerializedName("OPT_SORTHEAP")
  protected String optSortheap;
  @SerializedName("PAGE_AGE_TRGT_GCR")
  protected String pageAgeTrgtGcr;
  @SerializedName("PAGE_AGE_TRGT_MCR")
  protected String pageAgeTrgtMcr;
  @SerializedName("PCKCACHESZ")
  protected String pckcachesz;
  @SerializedName("PL_STACK_TRACE")
  protected String plStackTrace;
  @SerializedName("SELF_TUNING_MEM")
  protected String selfTuningMem;
  @SerializedName("SEQDETECT")
  protected String seqdetect;
  @SerializedName("SHEAPTHRES_SHR")
  protected String sheapthresShr;
  @SerializedName("SOFTMAX")
  protected String softmax;
  @SerializedName("SORTHEAP")
  protected String sortheap;
  @SerializedName("SQL_CCFLAGS")
  protected String sqlCcflags;
  @SerializedName("STAT_HEAP_SZ")
  protected String statHeapSz;
  @SerializedName("STMTHEAP")
  protected String stmtheap;
  @SerializedName("STMT_CONC")
  protected String stmtConc;
  @SerializedName("STRING_UNITS")
  protected String stringUnits;
  @SerializedName("SYSTIME_PERIOD_ADJ")
  protected String systimePeriodAdj;
  @SerializedName("TRACKMOD")
  protected String trackmod;
  @SerializedName("UTIL_HEAP_SZ")
  protected String utilHeapSz;
  @SerializedName("WLM_ADMISSION_CTRL")
  protected String wlmAdmissionCtrl;
  @SerializedName("WLM_AGENT_LOAD_TRGT")
  protected String wlmAgentLoadTrgt;
  @SerializedName("WLM_CPU_LIMIT")
  protected String wlmCpuLimit;
  @SerializedName("WLM_CPU_SHARES")
  protected String wlmCpuShares;
  @SerializedName("WLM_CPU_SHARE_MODE")
  protected String wlmCpuShareMode;

  protected SuccessTuneableParamsTuneableParamDb() { }

  /**
   * Gets the actSortmemLimit.
   *
   * @return the actSortmemLimit
   */
  public String getActSortmemLimit() {
    return actSortmemLimit;
  }

  /**
   * Gets the altCollate.
   *
   * @return the altCollate
   */
  public String getAltCollate() {
    return altCollate;
  }

  /**
   * Gets the appgroupMemSz.
   *
   * @return the appgroupMemSz
   */
  public String getAppgroupMemSz() {
    return appgroupMemSz;
  }

  /**
   * Gets the applheapsz.
   *
   * @return the applheapsz
   */
  public String getApplheapsz() {
    return applheapsz;
  }

  /**
   * Gets the applMemory.
   *
   * @return the applMemory
   */
  public String getApplMemory() {
    return applMemory;
  }

  /**
   * Gets the appCtlHeapSz.
   *
   * @return the appCtlHeapSz
   */
  public String getAppCtlHeapSz() {
    return appCtlHeapSz;
  }

  /**
   * Gets the archretrydelay.
   *
   * @return the archretrydelay
   */
  public String getArchretrydelay() {
    return archretrydelay;
  }

  /**
   * Gets the authnCacheDuration.
   *
   * @return the authnCacheDuration
   */
  public String getAuthnCacheDuration() {
    return authnCacheDuration;
  }

  /**
   * Gets the autorestart.
   *
   * @return the autorestart
   */
  public String getAutorestart() {
    return autorestart;
  }

  /**
   * Gets the autoCgStats.
   *
   * @return the autoCgStats
   */
  public String getAutoCgStats() {
    return autoCgStats;
  }

  /**
   * Gets the autoMaint.
   *
   * @return the autoMaint
   */
  public String getAutoMaint() {
    return autoMaint;
  }

  /**
   * Gets the autoReorg.
   *
   * @return the autoReorg
   */
  public String getAutoReorg() {
    return autoReorg;
  }

  /**
   * Gets the autoReval.
   *
   * @return the autoReval
   */
  public String getAutoReval() {
    return autoReval;
  }

  /**
   * Gets the autoRunstats.
   *
   * @return the autoRunstats
   */
  public String getAutoRunstats() {
    return autoRunstats;
  }

  /**
   * Gets the autoSampling.
   *
   * @return the autoSampling
   */
  public String getAutoSampling() {
    return autoSampling;
  }

  /**
   * Gets the autoStatsViews.
   *
   * @return the autoStatsViews
   */
  public String getAutoStatsViews() {
    return autoStatsViews;
  }

  /**
   * Gets the autoStmtStats.
   *
   * @return the autoStmtStats
   */
  public String getAutoStmtStats() {
    return autoStmtStats;
  }

  /**
   * Gets the autoTblMaint.
   *
   * @return the autoTblMaint
   */
  public String getAutoTblMaint() {
    return autoTblMaint;
  }

  /**
   * Gets the avgAppls.
   *
   * @return the avgAppls
   */
  public String getAvgAppls() {
    return avgAppls;
  }

  /**
   * Gets the catalogcacheSz.
   *
   * @return the catalogcacheSz
   */
  public String getCatalogcacheSz() {
    return catalogcacheSz;
  }

  /**
   * Gets the chngpgsThresh.
   *
   * @return the chngpgsThresh
   */
  public String getChngpgsThresh() {
    return chngpgsThresh;
  }

  /**
   * Gets the curCommit.
   *
   * @return the curCommit
   */
  public String getCurCommit() {
    return curCommit;
  }

  /**
   * Gets the databaseMemory.
   *
   * @return the databaseMemory
   */
  public String getDatabaseMemory() {
    return databaseMemory;
  }

  /**
   * Gets the dbheap.
   *
   * @return the dbheap
   */
  public String getDbheap() {
    return dbheap;
  }

  /**
   * Gets the dbCollname.
   *
   * @return the dbCollname
   */
  public String getDbCollname() {
    return dbCollname;
  }

  /**
   * Gets the dbMemThresh.
   *
   * @return the dbMemThresh
   */
  public String getDbMemThresh() {
    return dbMemThresh;
  }

  /**
   * Gets the ddlCompressionDef.
   *
   * @return the ddlCompressionDef
   */
  public String getDdlCompressionDef() {
    return ddlCompressionDef;
  }

  /**
   * Gets the ddlConstraintDef.
   *
   * @return the ddlConstraintDef
   */
  public String getDdlConstraintDef() {
    return ddlConstraintDef;
  }

  /**
   * Gets the decfltRounding.
   *
   * @return the decfltRounding
   */
  public String getDecfltRounding() {
    return decfltRounding;
  }

  /**
   * Gets the decArithmetic.
   *
   * @return the decArithmetic
   */
  public String getDecArithmetic() {
    return decArithmetic;
  }

  /**
   * Gets the decToCharFmt.
   *
   * @return the decToCharFmt
   */
  public String getDecToCharFmt() {
    return decToCharFmt;
  }

  /**
   * Gets the dftDegree.
   *
   * @return the dftDegree
   */
  public String getDftDegree() {
    return dftDegree;
  }

  /**
   * Gets the dftExtentSz.
   *
   * @return the dftExtentSz
   */
  public String getDftExtentSz() {
    return dftExtentSz;
  }

  /**
   * Gets the dftLoadrecSes.
   *
   * @return the dftLoadrecSes
   */
  public String getDftLoadrecSes() {
    return dftLoadrecSes;
  }

  /**
   * Gets the dftMttbTypes.
   *
   * @return the dftMttbTypes
   */
  public String getDftMttbTypes() {
    return dftMttbTypes;
  }

  /**
   * Gets the dftPrefetchSz.
   *
   * @return the dftPrefetchSz
   */
  public String getDftPrefetchSz() {
    return dftPrefetchSz;
  }

  /**
   * Gets the dftQueryopt.
   *
   * @return the dftQueryopt
   */
  public String getDftQueryopt() {
    return dftQueryopt;
  }

  /**
   * Gets the dftRefreshAge.
   *
   * @return the dftRefreshAge
   */
  public String getDftRefreshAge() {
    return dftRefreshAge;
  }

  /**
   * Gets the dftSchemasDcc.
   *
   * @return the dftSchemasDcc
   */
  public String getDftSchemasDcc() {
    return dftSchemasDcc;
  }

  /**
   * Gets the dftSqlmathwarn.
   *
   * @return the dftSqlmathwarn
   */
  public String getDftSqlmathwarn() {
    return dftSqlmathwarn;
  }

  /**
   * Gets the dftTableOrg.
   *
   * @return the dftTableOrg
   */
  public String getDftTableOrg() {
    return dftTableOrg;
  }

  /**
   * Gets the dlchktime.
   *
   * @return the dlchktime
   */
  public String getDlchktime() {
    return dlchktime;
  }

  /**
   * Gets the enableXmlchar.
   *
   * @return the enableXmlchar
   */
  public String getEnableXmlchar() {
    return enableXmlchar;
  }

  /**
   * Gets the extendedRowSz.
   *
   * @return the extendedRowSz
   */
  public String getExtendedRowSz() {
    return extendedRowSz;
  }

  /**
   * Gets the groupheapRatio.
   *
   * @return the groupheapRatio
   */
  public String getGroupheapRatio() {
    return groupheapRatio;
  }

  /**
   * Gets the indexrec.
   *
   * @return the indexrec
   */
  public String getIndexrec() {
    return indexrec;
  }

  /**
   * Gets the largeAggregation.
   *
   * @return the largeAggregation
   */
  public String getLargeAggregation() {
    return largeAggregation;
  }

  /**
   * Gets the locklist.
   *
   * @return the locklist
   */
  public String getLocklist() {
    return locklist;
  }

  /**
   * Gets the locktimeout.
   *
   * @return the locktimeout
   */
  public String getLocktimeout() {
    return locktimeout;
  }

  /**
   * Gets the logindexbuild.
   *
   * @return the logindexbuild
   */
  public String getLogindexbuild() {
    return logindexbuild;
  }

  /**
   * Gets the logApplInfo.
   *
   * @return the logApplInfo
   */
  public String getLogApplInfo() {
    return logApplInfo;
  }

  /**
   * Gets the logDdlStmts.
   *
   * @return the logDdlStmts
   */
  public String getLogDdlStmts() {
    return logDdlStmts;
  }

  /**
   * Gets the logDiskCap.
   *
   * @return the logDiskCap
   */
  public String getLogDiskCap() {
    return logDiskCap;
  }

  /**
   * Gets the maxappls.
   *
   * @return the maxappls
   */
  public String getMaxappls() {
    return maxappls;
  }

  /**
   * Gets the maxfilop.
   *
   * @return the maxfilop
   */
  public String getMaxfilop() {
    return maxfilop;
  }

  /**
   * Gets the maxlocks.
   *
   * @return the maxlocks
   */
  public String getMaxlocks() {
    return maxlocks;
  }

  /**
   * Gets the minDecDiv3.
   *
   * @return the minDecDiv3
   */
  public String getMinDecDiv3() {
    return minDecDiv3;
  }

  /**
   * Gets the monActMetrics.
   *
   * @return the monActMetrics
   */
  public String getMonActMetrics() {
    return monActMetrics;
  }

  /**
   * Gets the monDeadlock.
   *
   * @return the monDeadlock
   */
  public String getMonDeadlock() {
    return monDeadlock;
  }

  /**
   * Gets the monLckMsgLvl.
   *
   * @return the monLckMsgLvl
   */
  public String getMonLckMsgLvl() {
    return monLckMsgLvl;
  }

  /**
   * Gets the monLocktimeout.
   *
   * @return the monLocktimeout
   */
  public String getMonLocktimeout() {
    return monLocktimeout;
  }

  /**
   * Gets the monLockwait.
   *
   * @return the monLockwait
   */
  public String getMonLockwait() {
    return monLockwait;
  }

  /**
   * Gets the monLwThresh.
   *
   * @return the monLwThresh
   */
  public String getMonLwThresh() {
    return monLwThresh;
  }

  /**
   * Gets the monObjMetrics.
   *
   * @return the monObjMetrics
   */
  public String getMonObjMetrics() {
    return monObjMetrics;
  }

  /**
   * Gets the monPkglistSz.
   *
   * @return the monPkglistSz
   */
  public String getMonPkglistSz() {
    return monPkglistSz;
  }

  /**
   * Gets the monReqMetrics.
   *
   * @return the monReqMetrics
   */
  public String getMonReqMetrics() {
    return monReqMetrics;
  }

  /**
   * Gets the monRtnData.
   *
   * @return the monRtnData
   */
  public String getMonRtnData() {
    return monRtnData;
  }

  /**
   * Gets the monRtnExeclist.
   *
   * @return the monRtnExeclist
   */
  public String getMonRtnExeclist() {
    return monRtnExeclist;
  }

  /**
   * Gets the monUowData.
   *
   * @return the monUowData
   */
  public String getMonUowData() {
    return monUowData;
  }

  /**
   * Gets the monUowExeclist.
   *
   * @return the monUowExeclist
   */
  public String getMonUowExeclist() {
    return monUowExeclist;
  }

  /**
   * Gets the monUowPkglist.
   *
   * @return the monUowPkglist
   */
  public String getMonUowPkglist() {
    return monUowPkglist;
  }

  /**
   * Gets the ncharMapping.
   *
   * @return the ncharMapping
   */
  public String getNcharMapping() {
    return ncharMapping;
  }

  /**
   * Gets the numFreqvalues.
   *
   * @return the numFreqvalues
   */
  public String getNumFreqvalues() {
    return numFreqvalues;
  }

  /**
   * Gets the numIocleaners.
   *
   * @return the numIocleaners
   */
  public String getNumIocleaners() {
    return numIocleaners;
  }

  /**
   * Gets the numIoservers.
   *
   * @return the numIoservers
   */
  public String getNumIoservers() {
    return numIoservers;
  }

  /**
   * Gets the numLogSpan.
   *
   * @return the numLogSpan
   */
  public String getNumLogSpan() {
    return numLogSpan;
  }

  /**
   * Gets the numQuantiles.
   *
   * @return the numQuantiles
   */
  public String getNumQuantiles() {
    return numQuantiles;
  }

  /**
   * Gets the optBuffpage.
   *
   * @return the optBuffpage
   */
  public String getOptBuffpage() {
    return optBuffpage;
  }

  /**
   * Gets the optDirectWrkld.
   *
   * @return the optDirectWrkld
   */
  public String getOptDirectWrkld() {
    return optDirectWrkld;
  }

  /**
   * Gets the optLocklist.
   *
   * @return the optLocklist
   */
  public String getOptLocklist() {
    return optLocklist;
  }

  /**
   * Gets the optMaxlocks.
   *
   * @return the optMaxlocks
   */
  public String getOptMaxlocks() {
    return optMaxlocks;
  }

  /**
   * Gets the optSortheap.
   *
   * @return the optSortheap
   */
  public String getOptSortheap() {
    return optSortheap;
  }

  /**
   * Gets the pageAgeTrgtGcr.
   *
   * @return the pageAgeTrgtGcr
   */
  public String getPageAgeTrgtGcr() {
    return pageAgeTrgtGcr;
  }

  /**
   * Gets the pageAgeTrgtMcr.
   *
   * @return the pageAgeTrgtMcr
   */
  public String getPageAgeTrgtMcr() {
    return pageAgeTrgtMcr;
  }

  /**
   * Gets the pckcachesz.
   *
   * @return the pckcachesz
   */
  public String getPckcachesz() {
    return pckcachesz;
  }

  /**
   * Gets the plStackTrace.
   *
   * @return the plStackTrace
   */
  public String getPlStackTrace() {
    return plStackTrace;
  }

  /**
   * Gets the selfTuningMem.
   *
   * @return the selfTuningMem
   */
  public String getSelfTuningMem() {
    return selfTuningMem;
  }

  /**
   * Gets the seqdetect.
   *
   * @return the seqdetect
   */
  public String getSeqdetect() {
    return seqdetect;
  }

  /**
   * Gets the sheapthresShr.
   *
   * @return the sheapthresShr
   */
  public String getSheapthresShr() {
    return sheapthresShr;
  }

  /**
   * Gets the softmax.
   *
   * @return the softmax
   */
  public String getSoftmax() {
    return softmax;
  }

  /**
   * Gets the sortheap.
   *
   * @return the sortheap
   */
  public String getSortheap() {
    return sortheap;
  }

  /**
   * Gets the sqlCcflags.
   *
   * @return the sqlCcflags
   */
  public String getSqlCcflags() {
    return sqlCcflags;
  }

  /**
   * Gets the statHeapSz.
   *
   * @return the statHeapSz
   */
  public String getStatHeapSz() {
    return statHeapSz;
  }

  /**
   * Gets the stmtheap.
   *
   * @return the stmtheap
   */
  public String getStmtheap() {
    return stmtheap;
  }

  /**
   * Gets the stmtConc.
   *
   * @return the stmtConc
   */
  public String getStmtConc() {
    return stmtConc;
  }

  /**
   * Gets the stringUnits.
   *
   * @return the stringUnits
   */
  public String getStringUnits() {
    return stringUnits;
  }

  /**
   * Gets the systimePeriodAdj.
   *
   * @return the systimePeriodAdj
   */
  public String getSystimePeriodAdj() {
    return systimePeriodAdj;
  }

  /**
   * Gets the trackmod.
   *
   * @return the trackmod
   */
  public String getTrackmod() {
    return trackmod;
  }

  /**
   * Gets the utilHeapSz.
   *
   * @return the utilHeapSz
   */
  public String getUtilHeapSz() {
    return utilHeapSz;
  }

  /**
   * Gets the wlmAdmissionCtrl.
   *
   * @return the wlmAdmissionCtrl
   */
  public String getWlmAdmissionCtrl() {
    return wlmAdmissionCtrl;
  }

  /**
   * Gets the wlmAgentLoadTrgt.
   *
   * @return the wlmAgentLoadTrgt
   */
  public String getWlmAgentLoadTrgt() {
    return wlmAgentLoadTrgt;
  }

  /**
   * Gets the wlmCpuLimit.
   *
   * @return the wlmCpuLimit
   */
  public String getWlmCpuLimit() {
    return wlmCpuLimit;
  }

  /**
   * Gets the wlmCpuShares.
   *
   * @return the wlmCpuShares
   */
  public String getWlmCpuShares() {
    return wlmCpuShares;
  }

  /**
   * Gets the wlmCpuShareMode.
   *
   * @return the wlmCpuShareMode
   */
  public String getWlmCpuShareMode() {
    return wlmCpuShareMode;
  }
}

