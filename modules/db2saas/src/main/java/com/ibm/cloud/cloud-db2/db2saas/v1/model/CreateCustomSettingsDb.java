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
 * Container for general database settings.
 */
public class CreateCustomSettingsDb extends GenericModel {

  /**
   * Configures the sort memory limit for DB2.
   */
  public interface ActSortmemLimit {
    /** NONE. */
    String NONE = "NONE";
    /** range(10, 100). */
    String RANGE_10_100 = "range(10, 100)";
  }

  /**
   * Configures the collation sequence.
   */
  public interface AltCollate {
    /** NULL. */
    String NULL = "NULL";
    /** IDENTITY_16BIT. */
    String IDENTITY_16BIT = "IDENTITY_16BIT";
  }

  /**
   * Sets the application group memory size.
   */
  public interface AppgroupMemSz {
    /** range(1, 1000000). */
    String RANGE_1_1000000 = "range(1, 1000000)";
  }

  /**
   * Configures the application heap size.
   */
  public interface Applheapsz {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(16, 2147483647). */
    String RANGE_16_2147483647 = "range(16, 2147483647)";
  }

  /**
   * Configures the application memory allocation.
   */
  public interface ApplMemory {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(128, 4294967295). */
    String RANGE_128_4294967295 = "range(128, 4294967295)";
  }

  /**
   * Configures the application control heap size.
   */
  public interface AppCtlHeapSz {
    /** range(1, 64000). */
    String RANGE_1_64000 = "range(1, 64000)";
  }

  /**
   * Configures the archive retry delay time.
   */
  public interface Archretrydelay {
    /** range(0, 65535). */
    String RANGE_0_65535 = "range(0, 65535)";
  }

  /**
   * Configures the authentication cache duration.
   */
  public interface AuthnCacheDuration {
    /** range(1,10000). */
    String RANGE_1_10000 = "range(1,10000)";
  }

  /**
   * Configures whether the database will automatically restart.
   */
  public interface Autorestart {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether auto collection of CG statistics is enabled.
   */
  public interface AutoCgStats {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures automatic maintenance for the database.
   */
  public interface AutoMaint {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures automatic reorganization for the database.
   */
  public interface AutoReorg {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures the auto refresh or revalidation method.
   */
  public interface AutoReval {
    /** IMMEDIATE. */
    String IMMEDIATE = "IMMEDIATE";
    /** DISABLED. */
    String DISABLED = "DISABLED";
    /** DEFERRED. */
    String DEFERRED = "DEFERRED";
    /** DEFERRED_FORCE. */
    String DEFERRED_FORCE = "DEFERRED_FORCE";
  }

  /**
   * Configures automatic collection of run-time statistics.
   */
  public interface AutoRunstats {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether auto-sampling is enabled.
   */
  public interface AutoSampling {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures automatic collection of statistics on views.
   */
  public interface AutoStatsViews {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures automatic collection of statement-level statistics.
   */
  public interface AutoStmtStats {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures automatic table maintenance.
   */
  public interface AutoTblMaint {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures the change pages threshold percentage.
   */
  public interface ChngpgsThresh {
    /** range(5,99). */
    String RANGE_5_99 = "range(5,99)";
  }

  /**
   * Configures the commit behavior.
   */
  public interface CurCommit {
    /** ON. */
    String ON = "ON";
    /** AVAILABLE. */
    String AVAILABLE = "AVAILABLE";
    /** DISABLED. */
    String DISABLED = "DISABLED";
  }

  /**
   * Configures the database memory management.
   */
  public interface DatabaseMemory {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** COMPUTED. */
    String COMPUTED = "COMPUTED";
    /** range(0, 4294967295). */
    String RANGE_0_4294967295 = "range(0, 4294967295)";
  }

  /**
   * Configures the database heap size.
   */
  public interface Dbheap {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(32, 2147483647). */
    String RANGE_32_2147483647 = "range(32, 2147483647)";
  }

  /**
   * Configures the memory threshold percentage for database.
   */
  public interface DbMemThresh {
    /** range(0, 100). */
    String RANGE_0_100 = "range(0, 100)";
  }

  /**
   * Defines the default DDL compression behavior.
   */
  public interface DdlCompressionDef {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Defines the default constraint behavior in DDL.
   */
  public interface DdlConstraintDef {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the decimal floating-point rounding method.
   */
  public interface DecfltRounding {
    /** ROUND_HALF_EVEN. */
    String ROUND_HALF_EVEN = "ROUND_HALF_EVEN";
    /** ROUND_CEILING. */
    String ROUND_CEILING = "ROUND_CEILING";
    /** ROUND_FLOOR. */
    String ROUND_FLOOR = "ROUND_FLOOR";
    /** ROUND_HALF_UP. */
    String ROUND_HALF_UP = "ROUND_HALF_UP";
    /** ROUND_DOWN. */
    String ROUND_DOWN = "ROUND_DOWN";
  }

  /**
   * Configures the decimal-to-character conversion format.
   */
  public interface DecToCharFmt {
    /** NEW. */
    String X_NEW = "NEW";
    /** V95. */
    String V95 = "V95";
  }

  /**
   * Configures the default degree for parallelism.
   */
  public interface DftDegree {
    /** ANY. */
    String ANY = "ANY";
    /** range(1, 32767). */
    String RANGE_1_32767 = "range(1, 32767)";
  }

  /**
   * Configures the default extent size for tables.
   */
  public interface DftExtentSz {
    /** range(2, 256). */
    String RANGE_2_256 = "range(2, 256)";
  }

  /**
   * Configures the default load record session count.
   */
  public interface DftLoadrecSes {
    /** range(1, 30000). */
    String RANGE_1_30000 = "range(1, 30000)";
  }

  /**
   * Configures the default prefetch size for queries.
   */
  public interface DftPrefetchSz {
    /** range(0, 32767). */
    String RANGE_0_32767 = "range(0, 32767)";
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
  }

  /**
   * Configures the default query optimization level.
   */
  public interface DftQueryopt {
    /** range(0, 9). */
    String RANGE_0_9 = "range(0, 9)";
  }

  /**
   * Configures whether DCC (database control center) is enabled for schemas.
   */
  public interface DftSchemasDcc {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures whether SQL math warnings are enabled.
   */
  public interface DftSqlmathwarn {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the default table organization (ROW or COLUMN).
   */
  public interface DftTableOrg {
    /** COLUMN. */
    String COLUMN = "COLUMN";
    /** ROW. */
    String ROW = "ROW";
  }

  /**
   * Configures the deadlock check time in milliseconds.
   */
  public interface Dlchktime {
    /** range(1000, 600000). */
    String RANGE_1000_600000 = "range(1000, 600000)";
  }

  /**
   * Configures whether XML character support is enabled.
   */
  public interface EnableXmlchar {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures whether extended row size is enabled.
   */
  public interface ExtendedRowSz {
    /** ENABLE. */
    String ENABLE = "ENABLE";
    /** DISABLE. */
    String DISABLE = "DISABLE";
  }

  /**
   * Configures the heap ratio for group heap memory.
   */
  public interface GroupheapRatio {
    /** range(1, 99). */
    String RANGE_1_99 = "range(1, 99)";
  }

  /**
   * Configures the index recovery method.
   */
  public interface Indexrec {
    /** SYSTEM. */
    String SYSTEM = "SYSTEM";
    /** ACCESS. */
    String ACCESS = "ACCESS";
    /** ACCESS_NO_REDO. */
    String ACCESS_NO_REDO = "ACCESS_NO_REDO";
    /** RESTART. */
    String RESTART = "RESTART";
    /** RESTART_NO_REDO. */
    String RESTART_NO_REDO = "RESTART_NO_REDO";
  }

  /**
   * Configures whether large aggregation is enabled.
   */
  public interface LargeAggregation {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the lock list memory size.
   */
  public interface Locklist {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(4, 134217728). */
    String RANGE_4_134217728 = "range(4, 134217728)";
  }

  /**
   * Configures the lock timeout duration.
   */
  public interface Locktimeout {
    /** range(0, 32767). */
    String RANGE_0_32767 = "range(0, 32767)";
  }

  /**
   * Configures whether index builds are logged.
   */
  public interface Logindexbuild {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether application information is logged.
   */
  public interface LogApplInfo {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures whether DDL statements are logged.
   */
  public interface LogDdlStmts {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the disk capacity log setting.
   */
  public interface LogDiskCap {
    /** range(1, 2147483647). */
    String RANGE_1_2147483647 = "range(1, 2147483647)";
  }

  /**
   * Configures the maximum number of applications.
   */
  public interface Maxappls {
    /** range(1, 60000). */
    String RANGE_1_60000 = "range(1, 60000)";
  }

  /**
   * Configures the maximum number of file operations.
   */
  public interface Maxfilop {
    /** range(64, 61440). */
    String RANGE_64_61440 = "range(64, 61440)";
  }

  /**
   * Configures the maximum number of locks.
   */
  public interface Maxlocks {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(1, 100). */
    String RANGE_1_100 = "range(1, 100)";
  }

  /**
   * Configures whether decimal division by 3 should be handled.
   */
  public interface MinDecDiv3 {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the level of activity metrics to be monitored.
   */
  public interface MonActMetrics {
    /** NONE. */
    String NONE = "NONE";
    /** BASE. */
    String BASE = "BASE";
    /** EXTENDED. */
    String EXTENDED = "EXTENDED";
  }

  /**
   * Configures deadlock monitoring settings.
   */
  public interface MonDeadlock {
    /** NONE. */
    String NONE = "NONE";
    /** WITHOUT_HIST. */
    String WITHOUT_HIST = "WITHOUT_HIST";
    /** HISTORY. */
    String HISTORY = "HISTORY";
    /** HIST_AND_VALUES. */
    String HIST_AND_VALUES = "HIST_AND_VALUES";
  }

  /**
   * Configures the lock message level for monitoring.
   */
  public interface MonLckMsgLvl {
    /** range(0, 3). */
    String RANGE_0_3 = "range(0, 3)";
  }

  /**
   * Configures lock timeout monitoring settings.
   */
  public interface MonLocktimeout {
    /** NONE. */
    String NONE = "NONE";
    /** WITHOUT_HIST. */
    String WITHOUT_HIST = "WITHOUT_HIST";
    /** HISTORY. */
    String HISTORY = "HISTORY";
    /** HIST_AND_VALUES. */
    String HIST_AND_VALUES = "HIST_AND_VALUES";
  }

  /**
   * Configures lock wait monitoring settings.
   */
  public interface MonLockwait {
    /** NONE. */
    String NONE = "NONE";
    /** WITHOUT_HIST. */
    String WITHOUT_HIST = "WITHOUT_HIST";
    /** HISTORY. */
    String HISTORY = "HISTORY";
    /** HIST_AND_VALUES. */
    String HIST_AND_VALUES = "HIST_AND_VALUES";
  }

  /**
   * Configures the lightweight threshold for monitoring.
   */
  public interface MonLwThresh {
    /** range(1000, 4294967295). */
    String RANGE_1000_4294967295 = "range(1000, 4294967295)";
  }

  /**
   * Configures the object metrics level for monitoring.
   */
  public interface MonObjMetrics {
    /** NONE. */
    String NONE = "NONE";
    /** BASE. */
    String BASE = "BASE";
    /** EXTENDED. */
    String EXTENDED = "EXTENDED";
  }

  /**
   * Configures the package list size for monitoring.
   */
  public interface MonPkglistSz {
    /** range(0, 1024). */
    String RANGE_0_1024 = "range(0, 1024)";
  }

  /**
   * Configures the request metrics level for monitoring.
   */
  public interface MonReqMetrics {
    /** NONE. */
    String NONE = "NONE";
    /** BASE. */
    String BASE = "BASE";
    /** EXTENDED. */
    String EXTENDED = "EXTENDED";
  }

  /**
   * Configures the level of return data for monitoring.
   */
  public interface MonRtnData {
    /** NONE. */
    String NONE = "NONE";
    /** BASE. */
    String BASE = "BASE";
  }

  /**
   * Configures whether stored procedure execution list is monitored.
   */
  public interface MonRtnExeclist {
    /** OFF. */
    String OFF = "OFF";
    /** ON. */
    String ON = "ON";
  }

  /**
   * Configures the level of unit of work (UOW) data for monitoring.
   */
  public interface MonUowData {
    /** NONE. */
    String NONE = "NONE";
    /** BASE. */
    String BASE = "BASE";
  }

  /**
   * Configures whether UOW execution list is monitored.
   */
  public interface MonUowExeclist {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether UOW package list is monitored.
   */
  public interface MonUowPkglist {
    /** OFF. */
    String OFF = "OFF";
    /** ON. */
    String ON = "ON";
  }

  /**
   * Configures the mapping of NCHAR character types.
   */
  public interface NcharMapping {
    /** CHAR_CU32. */
    String CHAR_CU32 = "CHAR_CU32";
    /** GRAPHIC_CU32. */
    String GRAPHIC_CU32 = "GRAPHIC_CU32";
    /** GRAPHIC_CU16. */
    String GRAPHIC_CU16 = "GRAPHIC_CU16";
    /** NOT APPLICABLE. */
    String NOT_APPLICABLE = "NOT APPLICABLE";
  }

  /**
   * Configures the number of frequent values for optimization.
   */
  public interface NumFreqvalues {
    /** range(0, 32767). */
    String RANGE_0_32767 = "range(0, 32767)";
  }

  /**
   * Configures the number of IO cleaners.
   */
  public interface NumIocleaners {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(0, 255). */
    String RANGE_0_255 = "range(0, 255)";
  }

  /**
   * Configures the number of IO servers.
   */
  public interface NumIoservers {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(1, 255). */
    String RANGE_1_255 = "range(1, 255)";
  }

  /**
   * Configures the number of log spans.
   */
  public interface NumLogSpan {
    /** range(0, 65535). */
    String RANGE_0_65535 = "range(0, 65535)";
  }

  /**
   * Configures the number of quantiles for optimizations.
   */
  public interface NumQuantiles {
    /** range(0, 32767). */
    String RANGE_0_32767 = "range(0, 32767)";
  }

  /**
   * Configures the direct workload optimization setting.
   */
  public interface OptDirectWrkld {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
  }

  /**
   * Configures the page age target for garbage collection.
   */
  public interface PageAgeTrgtGcr {
    /** range(1, 65535). */
    String RANGE_1_65535 = "range(1, 65535)";
  }

  /**
   * Configures the page age target for memory collection.
   */
  public interface PageAgeTrgtMcr {
    /** range(1, 65535). */
    String RANGE_1_65535 = "range(1, 65535)";
  }

  /**
   * Configures the package cache size.
   */
  public interface Pckcachesz {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(32, 2147483646). */
    String RANGE_32_2147483646 = "range(32, 2147483646)";
  }

  /**
   * Configures the level of stack trace logging for stored procedures.
   */
  public interface PlStackTrace {
    /** NONE. */
    String NONE = "NONE";
    /** ALL. */
    String ALL = "ALL";
    /** UNHANDLED. */
    String UNHANDLED = "UNHANDLED";
  }

  /**
   * Configures whether self-tuning memory is enabled.
   */
  public interface SelfTuningMem {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures sequence detection for queries.
   */
  public interface Seqdetect {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the shared heap threshold size.
   */
  public interface SheapthresShr {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(250, 2147483647). */
    String RANGE_250_2147483647 = "range(250, 2147483647)";
  }

  /**
   * Configures the sort heap memory size.
   */
  public interface Sortheap {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(16, 4294967295). */
    String RANGE_16_4294967295 = "range(16, 4294967295)";
  }

  /**
   * Configures the statistics heap size.
   */
  public interface StatHeapSz {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(1096, 2147483647). */
    String RANGE_1096_2147483647 = "range(1096, 2147483647)";
  }

  /**
   * Configures the statement heap size.
   */
  public interface Stmtheap {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(128, 2147483647). */
    String RANGE_128_2147483647 = "range(128, 2147483647)";
  }

  /**
   * Configures the statement concurrency.
   */
  public interface StmtConc {
    /** OFF. */
    String OFF = "OFF";
    /** LITERALS. */
    String LITERALS = "LITERALS";
    /** COMMENTS. */
    String COMMENTS = "COMMENTS";
    /** COMM_LIT. */
    String COMM_LIT = "COMM_LIT";
  }

  /**
   * Configures the string unit settings.
   */
  public interface StringUnits {
    /** SYSTEM. */
    String SYSTEM = "SYSTEM";
    /** CODEUNITS32. */
    String CODEUNITS32 = "CODEUNITS32";
  }

  /**
   * Configures whether system time period adjustments are enabled.
   */
  public interface SystimePeriodAdj {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures whether modifications to tracked objects are logged.
   */
  public interface Trackmod {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the utility heap size.
   */
  public interface UtilHeapSz {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(16, 2147483647). */
    String RANGE_16_2147483647 = "range(16, 2147483647)";
  }

  /**
   * Configures whether WLM (Workload Management) admission control is enabled.
   */
  public interface WlmAdmissionCtrl {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the WLM agent load target.
   */
  public interface WlmAgentLoadTrgt {
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
    /** range(1, 65535). */
    String RANGE_1_65535 = "range(1, 65535)";
  }

  /**
   * Configures the CPU limit for WLM workloads.
   */
  public interface WlmCpuLimit {
    /** range(0, 100). */
    String RANGE_0_100 = "range(0, 100)";
  }

  /**
   * Configures the CPU share count for WLM workloads.
   */
  public interface WlmCpuShares {
    /** range(1, 65535). */
    String RANGE_1_65535 = "range(1, 65535)";
  }

  /**
   * Configures the mode of CPU shares for WLM workloads.
   */
  public interface WlmCpuShareMode {
    /** HARD. */
    String HARD = "HARD";
    /** SOFT. */
    String SOFT = "SOFT";
  }

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

  /**
   * Builder.
   */
  public static class Builder {
    private String actSortmemLimit;
    private String altCollate;
    private String appgroupMemSz;
    private String applheapsz;
    private String applMemory;
    private String appCtlHeapSz;
    private String archretrydelay;
    private String authnCacheDuration;
    private String autorestart;
    private String autoCgStats;
    private String autoMaint;
    private String autoReorg;
    private String autoReval;
    private String autoRunstats;
    private String autoSampling;
    private String autoStatsViews;
    private String autoStmtStats;
    private String autoTblMaint;
    private String avgAppls;
    private String catalogcacheSz;
    private String chngpgsThresh;
    private String curCommit;
    private String databaseMemory;
    private String dbheap;
    private String dbCollname;
    private String dbMemThresh;
    private String ddlCompressionDef;
    private String ddlConstraintDef;
    private String decfltRounding;
    private String decArithmetic;
    private String decToCharFmt;
    private String dftDegree;
    private String dftExtentSz;
    private String dftLoadrecSes;
    private String dftMttbTypes;
    private String dftPrefetchSz;
    private String dftQueryopt;
    private String dftRefreshAge;
    private String dftSchemasDcc;
    private String dftSqlmathwarn;
    private String dftTableOrg;
    private String dlchktime;
    private String enableXmlchar;
    private String extendedRowSz;
    private String groupheapRatio;
    private String indexrec;
    private String largeAggregation;
    private String locklist;
    private String locktimeout;
    private String logindexbuild;
    private String logApplInfo;
    private String logDdlStmts;
    private String logDiskCap;
    private String maxappls;
    private String maxfilop;
    private String maxlocks;
    private String minDecDiv3;
    private String monActMetrics;
    private String monDeadlock;
    private String monLckMsgLvl;
    private String monLocktimeout;
    private String monLockwait;
    private String monLwThresh;
    private String monObjMetrics;
    private String monPkglistSz;
    private String monReqMetrics;
    private String monRtnData;
    private String monRtnExeclist;
    private String monUowData;
    private String monUowExeclist;
    private String monUowPkglist;
    private String ncharMapping;
    private String numFreqvalues;
    private String numIocleaners;
    private String numIoservers;
    private String numLogSpan;
    private String numQuantiles;
    private String optBuffpage;
    private String optDirectWrkld;
    private String optLocklist;
    private String optMaxlocks;
    private String optSortheap;
    private String pageAgeTrgtGcr;
    private String pageAgeTrgtMcr;
    private String pckcachesz;
    private String plStackTrace;
    private String selfTuningMem;
    private String seqdetect;
    private String sheapthresShr;
    private String softmax;
    private String sortheap;
    private String sqlCcflags;
    private String statHeapSz;
    private String stmtheap;
    private String stmtConc;
    private String stringUnits;
    private String systimePeriodAdj;
    private String trackmod;
    private String utilHeapSz;
    private String wlmAdmissionCtrl;
    private String wlmAgentLoadTrgt;
    private String wlmCpuLimit;
    private String wlmCpuShares;
    private String wlmCpuShareMode;

    /**
     * Instantiates a new Builder from an existing CreateCustomSettingsDb instance.
     *
     * @param createCustomSettingsDb the instance to initialize the Builder with
     */
    private Builder(CreateCustomSettingsDb createCustomSettingsDb) {
      this.actSortmemLimit = createCustomSettingsDb.actSortmemLimit;
      this.altCollate = createCustomSettingsDb.altCollate;
      this.appgroupMemSz = createCustomSettingsDb.appgroupMemSz;
      this.applheapsz = createCustomSettingsDb.applheapsz;
      this.applMemory = createCustomSettingsDb.applMemory;
      this.appCtlHeapSz = createCustomSettingsDb.appCtlHeapSz;
      this.archretrydelay = createCustomSettingsDb.archretrydelay;
      this.authnCacheDuration = createCustomSettingsDb.authnCacheDuration;
      this.autorestart = createCustomSettingsDb.autorestart;
      this.autoCgStats = createCustomSettingsDb.autoCgStats;
      this.autoMaint = createCustomSettingsDb.autoMaint;
      this.autoReorg = createCustomSettingsDb.autoReorg;
      this.autoReval = createCustomSettingsDb.autoReval;
      this.autoRunstats = createCustomSettingsDb.autoRunstats;
      this.autoSampling = createCustomSettingsDb.autoSampling;
      this.autoStatsViews = createCustomSettingsDb.autoStatsViews;
      this.autoStmtStats = createCustomSettingsDb.autoStmtStats;
      this.autoTblMaint = createCustomSettingsDb.autoTblMaint;
      this.avgAppls = createCustomSettingsDb.avgAppls;
      this.catalogcacheSz = createCustomSettingsDb.catalogcacheSz;
      this.chngpgsThresh = createCustomSettingsDb.chngpgsThresh;
      this.curCommit = createCustomSettingsDb.curCommit;
      this.databaseMemory = createCustomSettingsDb.databaseMemory;
      this.dbheap = createCustomSettingsDb.dbheap;
      this.dbCollname = createCustomSettingsDb.dbCollname;
      this.dbMemThresh = createCustomSettingsDb.dbMemThresh;
      this.ddlCompressionDef = createCustomSettingsDb.ddlCompressionDef;
      this.ddlConstraintDef = createCustomSettingsDb.ddlConstraintDef;
      this.decfltRounding = createCustomSettingsDb.decfltRounding;
      this.decArithmetic = createCustomSettingsDb.decArithmetic;
      this.decToCharFmt = createCustomSettingsDb.decToCharFmt;
      this.dftDegree = createCustomSettingsDb.dftDegree;
      this.dftExtentSz = createCustomSettingsDb.dftExtentSz;
      this.dftLoadrecSes = createCustomSettingsDb.dftLoadrecSes;
      this.dftMttbTypes = createCustomSettingsDb.dftMttbTypes;
      this.dftPrefetchSz = createCustomSettingsDb.dftPrefetchSz;
      this.dftQueryopt = createCustomSettingsDb.dftQueryopt;
      this.dftRefreshAge = createCustomSettingsDb.dftRefreshAge;
      this.dftSchemasDcc = createCustomSettingsDb.dftSchemasDcc;
      this.dftSqlmathwarn = createCustomSettingsDb.dftSqlmathwarn;
      this.dftTableOrg = createCustomSettingsDb.dftTableOrg;
      this.dlchktime = createCustomSettingsDb.dlchktime;
      this.enableXmlchar = createCustomSettingsDb.enableXmlchar;
      this.extendedRowSz = createCustomSettingsDb.extendedRowSz;
      this.groupheapRatio = createCustomSettingsDb.groupheapRatio;
      this.indexrec = createCustomSettingsDb.indexrec;
      this.largeAggregation = createCustomSettingsDb.largeAggregation;
      this.locklist = createCustomSettingsDb.locklist;
      this.locktimeout = createCustomSettingsDb.locktimeout;
      this.logindexbuild = createCustomSettingsDb.logindexbuild;
      this.logApplInfo = createCustomSettingsDb.logApplInfo;
      this.logDdlStmts = createCustomSettingsDb.logDdlStmts;
      this.logDiskCap = createCustomSettingsDb.logDiskCap;
      this.maxappls = createCustomSettingsDb.maxappls;
      this.maxfilop = createCustomSettingsDb.maxfilop;
      this.maxlocks = createCustomSettingsDb.maxlocks;
      this.minDecDiv3 = createCustomSettingsDb.minDecDiv3;
      this.monActMetrics = createCustomSettingsDb.monActMetrics;
      this.monDeadlock = createCustomSettingsDb.monDeadlock;
      this.monLckMsgLvl = createCustomSettingsDb.monLckMsgLvl;
      this.monLocktimeout = createCustomSettingsDb.monLocktimeout;
      this.monLockwait = createCustomSettingsDb.monLockwait;
      this.monLwThresh = createCustomSettingsDb.monLwThresh;
      this.monObjMetrics = createCustomSettingsDb.monObjMetrics;
      this.monPkglistSz = createCustomSettingsDb.monPkglistSz;
      this.monReqMetrics = createCustomSettingsDb.monReqMetrics;
      this.monRtnData = createCustomSettingsDb.monRtnData;
      this.monRtnExeclist = createCustomSettingsDb.monRtnExeclist;
      this.monUowData = createCustomSettingsDb.monUowData;
      this.monUowExeclist = createCustomSettingsDb.monUowExeclist;
      this.monUowPkglist = createCustomSettingsDb.monUowPkglist;
      this.ncharMapping = createCustomSettingsDb.ncharMapping;
      this.numFreqvalues = createCustomSettingsDb.numFreqvalues;
      this.numIocleaners = createCustomSettingsDb.numIocleaners;
      this.numIoservers = createCustomSettingsDb.numIoservers;
      this.numLogSpan = createCustomSettingsDb.numLogSpan;
      this.numQuantiles = createCustomSettingsDb.numQuantiles;
      this.optBuffpage = createCustomSettingsDb.optBuffpage;
      this.optDirectWrkld = createCustomSettingsDb.optDirectWrkld;
      this.optLocklist = createCustomSettingsDb.optLocklist;
      this.optMaxlocks = createCustomSettingsDb.optMaxlocks;
      this.optSortheap = createCustomSettingsDb.optSortheap;
      this.pageAgeTrgtGcr = createCustomSettingsDb.pageAgeTrgtGcr;
      this.pageAgeTrgtMcr = createCustomSettingsDb.pageAgeTrgtMcr;
      this.pckcachesz = createCustomSettingsDb.pckcachesz;
      this.plStackTrace = createCustomSettingsDb.plStackTrace;
      this.selfTuningMem = createCustomSettingsDb.selfTuningMem;
      this.seqdetect = createCustomSettingsDb.seqdetect;
      this.sheapthresShr = createCustomSettingsDb.sheapthresShr;
      this.softmax = createCustomSettingsDb.softmax;
      this.sortheap = createCustomSettingsDb.sortheap;
      this.sqlCcflags = createCustomSettingsDb.sqlCcflags;
      this.statHeapSz = createCustomSettingsDb.statHeapSz;
      this.stmtheap = createCustomSettingsDb.stmtheap;
      this.stmtConc = createCustomSettingsDb.stmtConc;
      this.stringUnits = createCustomSettingsDb.stringUnits;
      this.systimePeriodAdj = createCustomSettingsDb.systimePeriodAdj;
      this.trackmod = createCustomSettingsDb.trackmod;
      this.utilHeapSz = createCustomSettingsDb.utilHeapSz;
      this.wlmAdmissionCtrl = createCustomSettingsDb.wlmAdmissionCtrl;
      this.wlmAgentLoadTrgt = createCustomSettingsDb.wlmAgentLoadTrgt;
      this.wlmCpuLimit = createCustomSettingsDb.wlmCpuLimit;
      this.wlmCpuShares = createCustomSettingsDb.wlmCpuShares;
      this.wlmCpuShareMode = createCustomSettingsDb.wlmCpuShareMode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateCustomSettingsDb.
     *
     * @return the new CreateCustomSettingsDb instance
     */
    public CreateCustomSettingsDb build() {
      return new CreateCustomSettingsDb(this);
    }

    /**
     * Set the actSortmemLimit.
     *
     * @param actSortmemLimit the actSortmemLimit
     * @return the CreateCustomSettingsDb builder
     */
    public Builder actSortmemLimit(String actSortmemLimit) {
      this.actSortmemLimit = actSortmemLimit;
      return this;
    }

    /**
     * Set the altCollate.
     *
     * @param altCollate the altCollate
     * @return the CreateCustomSettingsDb builder
     */
    public Builder altCollate(String altCollate) {
      this.altCollate = altCollate;
      return this;
    }

    /**
     * Set the appgroupMemSz.
     *
     * @param appgroupMemSz the appgroupMemSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder appgroupMemSz(String appgroupMemSz) {
      this.appgroupMemSz = appgroupMemSz;
      return this;
    }

    /**
     * Set the applheapsz.
     *
     * @param applheapsz the applheapsz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder applheapsz(String applheapsz) {
      this.applheapsz = applheapsz;
      return this;
    }

    /**
     * Set the applMemory.
     *
     * @param applMemory the applMemory
     * @return the CreateCustomSettingsDb builder
     */
    public Builder applMemory(String applMemory) {
      this.applMemory = applMemory;
      return this;
    }

    /**
     * Set the appCtlHeapSz.
     *
     * @param appCtlHeapSz the appCtlHeapSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder appCtlHeapSz(String appCtlHeapSz) {
      this.appCtlHeapSz = appCtlHeapSz;
      return this;
    }

    /**
     * Set the archretrydelay.
     *
     * @param archretrydelay the archretrydelay
     * @return the CreateCustomSettingsDb builder
     */
    public Builder archretrydelay(String archretrydelay) {
      this.archretrydelay = archretrydelay;
      return this;
    }

    /**
     * Set the authnCacheDuration.
     *
     * @param authnCacheDuration the authnCacheDuration
     * @return the CreateCustomSettingsDb builder
     */
    public Builder authnCacheDuration(String authnCacheDuration) {
      this.authnCacheDuration = authnCacheDuration;
      return this;
    }

    /**
     * Set the autorestart.
     *
     * @param autorestart the autorestart
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autorestart(String autorestart) {
      this.autorestart = autorestart;
      return this;
    }

    /**
     * Set the autoCgStats.
     *
     * @param autoCgStats the autoCgStats
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoCgStats(String autoCgStats) {
      this.autoCgStats = autoCgStats;
      return this;
    }

    /**
     * Set the autoMaint.
     *
     * @param autoMaint the autoMaint
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoMaint(String autoMaint) {
      this.autoMaint = autoMaint;
      return this;
    }

    /**
     * Set the autoReorg.
     *
     * @param autoReorg the autoReorg
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoReorg(String autoReorg) {
      this.autoReorg = autoReorg;
      return this;
    }

    /**
     * Set the autoReval.
     *
     * @param autoReval the autoReval
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoReval(String autoReval) {
      this.autoReval = autoReval;
      return this;
    }

    /**
     * Set the autoRunstats.
     *
     * @param autoRunstats the autoRunstats
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoRunstats(String autoRunstats) {
      this.autoRunstats = autoRunstats;
      return this;
    }

    /**
     * Set the autoSampling.
     *
     * @param autoSampling the autoSampling
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoSampling(String autoSampling) {
      this.autoSampling = autoSampling;
      return this;
    }

    /**
     * Set the autoStatsViews.
     *
     * @param autoStatsViews the autoStatsViews
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoStatsViews(String autoStatsViews) {
      this.autoStatsViews = autoStatsViews;
      return this;
    }

    /**
     * Set the autoStmtStats.
     *
     * @param autoStmtStats the autoStmtStats
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoStmtStats(String autoStmtStats) {
      this.autoStmtStats = autoStmtStats;
      return this;
    }

    /**
     * Set the autoTblMaint.
     *
     * @param autoTblMaint the autoTblMaint
     * @return the CreateCustomSettingsDb builder
     */
    public Builder autoTblMaint(String autoTblMaint) {
      this.autoTblMaint = autoTblMaint;
      return this;
    }

    /**
     * Set the avgAppls.
     *
     * @param avgAppls the avgAppls
     * @return the CreateCustomSettingsDb builder
     */
    public Builder avgAppls(String avgAppls) {
      this.avgAppls = avgAppls;
      return this;
    }

    /**
     * Set the catalogcacheSz.
     *
     * @param catalogcacheSz the catalogcacheSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder catalogcacheSz(String catalogcacheSz) {
      this.catalogcacheSz = catalogcacheSz;
      return this;
    }

    /**
     * Set the chngpgsThresh.
     *
     * @param chngpgsThresh the chngpgsThresh
     * @return the CreateCustomSettingsDb builder
     */
    public Builder chngpgsThresh(String chngpgsThresh) {
      this.chngpgsThresh = chngpgsThresh;
      return this;
    }

    /**
     * Set the curCommit.
     *
     * @param curCommit the curCommit
     * @return the CreateCustomSettingsDb builder
     */
    public Builder curCommit(String curCommit) {
      this.curCommit = curCommit;
      return this;
    }

    /**
     * Set the databaseMemory.
     *
     * @param databaseMemory the databaseMemory
     * @return the CreateCustomSettingsDb builder
     */
    public Builder databaseMemory(String databaseMemory) {
      this.databaseMemory = databaseMemory;
      return this;
    }

    /**
     * Set the dbheap.
     *
     * @param dbheap the dbheap
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dbheap(String dbheap) {
      this.dbheap = dbheap;
      return this;
    }

    /**
     * Set the dbCollname.
     *
     * @param dbCollname the dbCollname
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dbCollname(String dbCollname) {
      this.dbCollname = dbCollname;
      return this;
    }

    /**
     * Set the dbMemThresh.
     *
     * @param dbMemThresh the dbMemThresh
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dbMemThresh(String dbMemThresh) {
      this.dbMemThresh = dbMemThresh;
      return this;
    }

    /**
     * Set the ddlCompressionDef.
     *
     * @param ddlCompressionDef the ddlCompressionDef
     * @return the CreateCustomSettingsDb builder
     */
    public Builder ddlCompressionDef(String ddlCompressionDef) {
      this.ddlCompressionDef = ddlCompressionDef;
      return this;
    }

    /**
     * Set the ddlConstraintDef.
     *
     * @param ddlConstraintDef the ddlConstraintDef
     * @return the CreateCustomSettingsDb builder
     */
    public Builder ddlConstraintDef(String ddlConstraintDef) {
      this.ddlConstraintDef = ddlConstraintDef;
      return this;
    }

    /**
     * Set the decfltRounding.
     *
     * @param decfltRounding the decfltRounding
     * @return the CreateCustomSettingsDb builder
     */
    public Builder decfltRounding(String decfltRounding) {
      this.decfltRounding = decfltRounding;
      return this;
    }

    /**
     * Set the decArithmetic.
     *
     * @param decArithmetic the decArithmetic
     * @return the CreateCustomSettingsDb builder
     */
    public Builder decArithmetic(String decArithmetic) {
      this.decArithmetic = decArithmetic;
      return this;
    }

    /**
     * Set the decToCharFmt.
     *
     * @param decToCharFmt the decToCharFmt
     * @return the CreateCustomSettingsDb builder
     */
    public Builder decToCharFmt(String decToCharFmt) {
      this.decToCharFmt = decToCharFmt;
      return this;
    }

    /**
     * Set the dftDegree.
     *
     * @param dftDegree the dftDegree
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftDegree(String dftDegree) {
      this.dftDegree = dftDegree;
      return this;
    }

    /**
     * Set the dftExtentSz.
     *
     * @param dftExtentSz the dftExtentSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftExtentSz(String dftExtentSz) {
      this.dftExtentSz = dftExtentSz;
      return this;
    }

    /**
     * Set the dftLoadrecSes.
     *
     * @param dftLoadrecSes the dftLoadrecSes
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftLoadrecSes(String dftLoadrecSes) {
      this.dftLoadrecSes = dftLoadrecSes;
      return this;
    }

    /**
     * Set the dftMttbTypes.
     *
     * @param dftMttbTypes the dftMttbTypes
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftMttbTypes(String dftMttbTypes) {
      this.dftMttbTypes = dftMttbTypes;
      return this;
    }

    /**
     * Set the dftPrefetchSz.
     *
     * @param dftPrefetchSz the dftPrefetchSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftPrefetchSz(String dftPrefetchSz) {
      this.dftPrefetchSz = dftPrefetchSz;
      return this;
    }

    /**
     * Set the dftQueryopt.
     *
     * @param dftQueryopt the dftQueryopt
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftQueryopt(String dftQueryopt) {
      this.dftQueryopt = dftQueryopt;
      return this;
    }

    /**
     * Set the dftRefreshAge.
     *
     * @param dftRefreshAge the dftRefreshAge
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftRefreshAge(String dftRefreshAge) {
      this.dftRefreshAge = dftRefreshAge;
      return this;
    }

    /**
     * Set the dftSchemasDcc.
     *
     * @param dftSchemasDcc the dftSchemasDcc
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftSchemasDcc(String dftSchemasDcc) {
      this.dftSchemasDcc = dftSchemasDcc;
      return this;
    }

    /**
     * Set the dftSqlmathwarn.
     *
     * @param dftSqlmathwarn the dftSqlmathwarn
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftSqlmathwarn(String dftSqlmathwarn) {
      this.dftSqlmathwarn = dftSqlmathwarn;
      return this;
    }

    /**
     * Set the dftTableOrg.
     *
     * @param dftTableOrg the dftTableOrg
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dftTableOrg(String dftTableOrg) {
      this.dftTableOrg = dftTableOrg;
      return this;
    }

    /**
     * Set the dlchktime.
     *
     * @param dlchktime the dlchktime
     * @return the CreateCustomSettingsDb builder
     */
    public Builder dlchktime(String dlchktime) {
      this.dlchktime = dlchktime;
      return this;
    }

    /**
     * Set the enableXmlchar.
     *
     * @param enableXmlchar the enableXmlchar
     * @return the CreateCustomSettingsDb builder
     */
    public Builder enableXmlchar(String enableXmlchar) {
      this.enableXmlchar = enableXmlchar;
      return this;
    }

    /**
     * Set the extendedRowSz.
     *
     * @param extendedRowSz the extendedRowSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder extendedRowSz(String extendedRowSz) {
      this.extendedRowSz = extendedRowSz;
      return this;
    }

    /**
     * Set the groupheapRatio.
     *
     * @param groupheapRatio the groupheapRatio
     * @return the CreateCustomSettingsDb builder
     */
    public Builder groupheapRatio(String groupheapRatio) {
      this.groupheapRatio = groupheapRatio;
      return this;
    }

    /**
     * Set the indexrec.
     *
     * @param indexrec the indexrec
     * @return the CreateCustomSettingsDb builder
     */
    public Builder indexrec(String indexrec) {
      this.indexrec = indexrec;
      return this;
    }

    /**
     * Set the largeAggregation.
     *
     * @param largeAggregation the largeAggregation
     * @return the CreateCustomSettingsDb builder
     */
    public Builder largeAggregation(String largeAggregation) {
      this.largeAggregation = largeAggregation;
      return this;
    }

    /**
     * Set the locklist.
     *
     * @param locklist the locklist
     * @return the CreateCustomSettingsDb builder
     */
    public Builder locklist(String locklist) {
      this.locklist = locklist;
      return this;
    }

    /**
     * Set the locktimeout.
     *
     * @param locktimeout the locktimeout
     * @return the CreateCustomSettingsDb builder
     */
    public Builder locktimeout(String locktimeout) {
      this.locktimeout = locktimeout;
      return this;
    }

    /**
     * Set the logindexbuild.
     *
     * @param logindexbuild the logindexbuild
     * @return the CreateCustomSettingsDb builder
     */
    public Builder logindexbuild(String logindexbuild) {
      this.logindexbuild = logindexbuild;
      return this;
    }

    /**
     * Set the logApplInfo.
     *
     * @param logApplInfo the logApplInfo
     * @return the CreateCustomSettingsDb builder
     */
    public Builder logApplInfo(String logApplInfo) {
      this.logApplInfo = logApplInfo;
      return this;
    }

    /**
     * Set the logDdlStmts.
     *
     * @param logDdlStmts the logDdlStmts
     * @return the CreateCustomSettingsDb builder
     */
    public Builder logDdlStmts(String logDdlStmts) {
      this.logDdlStmts = logDdlStmts;
      return this;
    }

    /**
     * Set the logDiskCap.
     *
     * @param logDiskCap the logDiskCap
     * @return the CreateCustomSettingsDb builder
     */
    public Builder logDiskCap(String logDiskCap) {
      this.logDiskCap = logDiskCap;
      return this;
    }

    /**
     * Set the maxappls.
     *
     * @param maxappls the maxappls
     * @return the CreateCustomSettingsDb builder
     */
    public Builder maxappls(String maxappls) {
      this.maxappls = maxappls;
      return this;
    }

    /**
     * Set the maxfilop.
     *
     * @param maxfilop the maxfilop
     * @return the CreateCustomSettingsDb builder
     */
    public Builder maxfilop(String maxfilop) {
      this.maxfilop = maxfilop;
      return this;
    }

    /**
     * Set the maxlocks.
     *
     * @param maxlocks the maxlocks
     * @return the CreateCustomSettingsDb builder
     */
    public Builder maxlocks(String maxlocks) {
      this.maxlocks = maxlocks;
      return this;
    }

    /**
     * Set the minDecDiv3.
     *
     * @param minDecDiv3 the minDecDiv3
     * @return the CreateCustomSettingsDb builder
     */
    public Builder minDecDiv3(String minDecDiv3) {
      this.minDecDiv3 = minDecDiv3;
      return this;
    }

    /**
     * Set the monActMetrics.
     *
     * @param monActMetrics the monActMetrics
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monActMetrics(String monActMetrics) {
      this.monActMetrics = monActMetrics;
      return this;
    }

    /**
     * Set the monDeadlock.
     *
     * @param monDeadlock the monDeadlock
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monDeadlock(String monDeadlock) {
      this.monDeadlock = monDeadlock;
      return this;
    }

    /**
     * Set the monLckMsgLvl.
     *
     * @param monLckMsgLvl the monLckMsgLvl
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monLckMsgLvl(String monLckMsgLvl) {
      this.monLckMsgLvl = monLckMsgLvl;
      return this;
    }

    /**
     * Set the monLocktimeout.
     *
     * @param monLocktimeout the monLocktimeout
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monLocktimeout(String monLocktimeout) {
      this.monLocktimeout = monLocktimeout;
      return this;
    }

    /**
     * Set the monLockwait.
     *
     * @param monLockwait the monLockwait
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monLockwait(String monLockwait) {
      this.monLockwait = monLockwait;
      return this;
    }

    /**
     * Set the monLwThresh.
     *
     * @param monLwThresh the monLwThresh
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monLwThresh(String monLwThresh) {
      this.monLwThresh = monLwThresh;
      return this;
    }

    /**
     * Set the monObjMetrics.
     *
     * @param monObjMetrics the monObjMetrics
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monObjMetrics(String monObjMetrics) {
      this.monObjMetrics = monObjMetrics;
      return this;
    }

    /**
     * Set the monPkglistSz.
     *
     * @param monPkglistSz the monPkglistSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monPkglistSz(String monPkglistSz) {
      this.monPkglistSz = monPkglistSz;
      return this;
    }

    /**
     * Set the monReqMetrics.
     *
     * @param monReqMetrics the monReqMetrics
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monReqMetrics(String monReqMetrics) {
      this.monReqMetrics = monReqMetrics;
      return this;
    }

    /**
     * Set the monRtnData.
     *
     * @param monRtnData the monRtnData
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monRtnData(String monRtnData) {
      this.monRtnData = monRtnData;
      return this;
    }

    /**
     * Set the monRtnExeclist.
     *
     * @param monRtnExeclist the monRtnExeclist
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monRtnExeclist(String monRtnExeclist) {
      this.monRtnExeclist = monRtnExeclist;
      return this;
    }

    /**
     * Set the monUowData.
     *
     * @param monUowData the monUowData
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monUowData(String monUowData) {
      this.monUowData = monUowData;
      return this;
    }

    /**
     * Set the monUowExeclist.
     *
     * @param monUowExeclist the monUowExeclist
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monUowExeclist(String monUowExeclist) {
      this.monUowExeclist = monUowExeclist;
      return this;
    }

    /**
     * Set the monUowPkglist.
     *
     * @param monUowPkglist the monUowPkglist
     * @return the CreateCustomSettingsDb builder
     */
    public Builder monUowPkglist(String monUowPkglist) {
      this.monUowPkglist = monUowPkglist;
      return this;
    }

    /**
     * Set the ncharMapping.
     *
     * @param ncharMapping the ncharMapping
     * @return the CreateCustomSettingsDb builder
     */
    public Builder ncharMapping(String ncharMapping) {
      this.ncharMapping = ncharMapping;
      return this;
    }

    /**
     * Set the numFreqvalues.
     *
     * @param numFreqvalues the numFreqvalues
     * @return the CreateCustomSettingsDb builder
     */
    public Builder numFreqvalues(String numFreqvalues) {
      this.numFreqvalues = numFreqvalues;
      return this;
    }

    /**
     * Set the numIocleaners.
     *
     * @param numIocleaners the numIocleaners
     * @return the CreateCustomSettingsDb builder
     */
    public Builder numIocleaners(String numIocleaners) {
      this.numIocleaners = numIocleaners;
      return this;
    }

    /**
     * Set the numIoservers.
     *
     * @param numIoservers the numIoservers
     * @return the CreateCustomSettingsDb builder
     */
    public Builder numIoservers(String numIoservers) {
      this.numIoservers = numIoservers;
      return this;
    }

    /**
     * Set the numLogSpan.
     *
     * @param numLogSpan the numLogSpan
     * @return the CreateCustomSettingsDb builder
     */
    public Builder numLogSpan(String numLogSpan) {
      this.numLogSpan = numLogSpan;
      return this;
    }

    /**
     * Set the numQuantiles.
     *
     * @param numQuantiles the numQuantiles
     * @return the CreateCustomSettingsDb builder
     */
    public Builder numQuantiles(String numQuantiles) {
      this.numQuantiles = numQuantiles;
      return this;
    }

    /**
     * Set the optBuffpage.
     *
     * @param optBuffpage the optBuffpage
     * @return the CreateCustomSettingsDb builder
     */
    public Builder optBuffpage(String optBuffpage) {
      this.optBuffpage = optBuffpage;
      return this;
    }

    /**
     * Set the optDirectWrkld.
     *
     * @param optDirectWrkld the optDirectWrkld
     * @return the CreateCustomSettingsDb builder
     */
    public Builder optDirectWrkld(String optDirectWrkld) {
      this.optDirectWrkld = optDirectWrkld;
      return this;
    }

    /**
     * Set the optLocklist.
     *
     * @param optLocklist the optLocklist
     * @return the CreateCustomSettingsDb builder
     */
    public Builder optLocklist(String optLocklist) {
      this.optLocklist = optLocklist;
      return this;
    }

    /**
     * Set the optMaxlocks.
     *
     * @param optMaxlocks the optMaxlocks
     * @return the CreateCustomSettingsDb builder
     */
    public Builder optMaxlocks(String optMaxlocks) {
      this.optMaxlocks = optMaxlocks;
      return this;
    }

    /**
     * Set the optSortheap.
     *
     * @param optSortheap the optSortheap
     * @return the CreateCustomSettingsDb builder
     */
    public Builder optSortheap(String optSortheap) {
      this.optSortheap = optSortheap;
      return this;
    }

    /**
     * Set the pageAgeTrgtGcr.
     *
     * @param pageAgeTrgtGcr the pageAgeTrgtGcr
     * @return the CreateCustomSettingsDb builder
     */
    public Builder pageAgeTrgtGcr(String pageAgeTrgtGcr) {
      this.pageAgeTrgtGcr = pageAgeTrgtGcr;
      return this;
    }

    /**
     * Set the pageAgeTrgtMcr.
     *
     * @param pageAgeTrgtMcr the pageAgeTrgtMcr
     * @return the CreateCustomSettingsDb builder
     */
    public Builder pageAgeTrgtMcr(String pageAgeTrgtMcr) {
      this.pageAgeTrgtMcr = pageAgeTrgtMcr;
      return this;
    }

    /**
     * Set the pckcachesz.
     *
     * @param pckcachesz the pckcachesz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder pckcachesz(String pckcachesz) {
      this.pckcachesz = pckcachesz;
      return this;
    }

    /**
     * Set the plStackTrace.
     *
     * @param plStackTrace the plStackTrace
     * @return the CreateCustomSettingsDb builder
     */
    public Builder plStackTrace(String plStackTrace) {
      this.plStackTrace = plStackTrace;
      return this;
    }

    /**
     * Set the selfTuningMem.
     *
     * @param selfTuningMem the selfTuningMem
     * @return the CreateCustomSettingsDb builder
     */
    public Builder selfTuningMem(String selfTuningMem) {
      this.selfTuningMem = selfTuningMem;
      return this;
    }

    /**
     * Set the seqdetect.
     *
     * @param seqdetect the seqdetect
     * @return the CreateCustomSettingsDb builder
     */
    public Builder seqdetect(String seqdetect) {
      this.seqdetect = seqdetect;
      return this;
    }

    /**
     * Set the sheapthresShr.
     *
     * @param sheapthresShr the sheapthresShr
     * @return the CreateCustomSettingsDb builder
     */
    public Builder sheapthresShr(String sheapthresShr) {
      this.sheapthresShr = sheapthresShr;
      return this;
    }

    /**
     * Set the softmax.
     *
     * @param softmax the softmax
     * @return the CreateCustomSettingsDb builder
     */
    public Builder softmax(String softmax) {
      this.softmax = softmax;
      return this;
    }

    /**
     * Set the sortheap.
     *
     * @param sortheap the sortheap
     * @return the CreateCustomSettingsDb builder
     */
    public Builder sortheap(String sortheap) {
      this.sortheap = sortheap;
      return this;
    }

    /**
     * Set the sqlCcflags.
     *
     * @param sqlCcflags the sqlCcflags
     * @return the CreateCustomSettingsDb builder
     */
    public Builder sqlCcflags(String sqlCcflags) {
      this.sqlCcflags = sqlCcflags;
      return this;
    }

    /**
     * Set the statHeapSz.
     *
     * @param statHeapSz the statHeapSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder statHeapSz(String statHeapSz) {
      this.statHeapSz = statHeapSz;
      return this;
    }

    /**
     * Set the stmtheap.
     *
     * @param stmtheap the stmtheap
     * @return the CreateCustomSettingsDb builder
     */
    public Builder stmtheap(String stmtheap) {
      this.stmtheap = stmtheap;
      return this;
    }

    /**
     * Set the stmtConc.
     *
     * @param stmtConc the stmtConc
     * @return the CreateCustomSettingsDb builder
     */
    public Builder stmtConc(String stmtConc) {
      this.stmtConc = stmtConc;
      return this;
    }

    /**
     * Set the stringUnits.
     *
     * @param stringUnits the stringUnits
     * @return the CreateCustomSettingsDb builder
     */
    public Builder stringUnits(String stringUnits) {
      this.stringUnits = stringUnits;
      return this;
    }

    /**
     * Set the systimePeriodAdj.
     *
     * @param systimePeriodAdj the systimePeriodAdj
     * @return the CreateCustomSettingsDb builder
     */
    public Builder systimePeriodAdj(String systimePeriodAdj) {
      this.systimePeriodAdj = systimePeriodAdj;
      return this;
    }

    /**
     * Set the trackmod.
     *
     * @param trackmod the trackmod
     * @return the CreateCustomSettingsDb builder
     */
    public Builder trackmod(String trackmod) {
      this.trackmod = trackmod;
      return this;
    }

    /**
     * Set the utilHeapSz.
     *
     * @param utilHeapSz the utilHeapSz
     * @return the CreateCustomSettingsDb builder
     */
    public Builder utilHeapSz(String utilHeapSz) {
      this.utilHeapSz = utilHeapSz;
      return this;
    }

    /**
     * Set the wlmAdmissionCtrl.
     *
     * @param wlmAdmissionCtrl the wlmAdmissionCtrl
     * @return the CreateCustomSettingsDb builder
     */
    public Builder wlmAdmissionCtrl(String wlmAdmissionCtrl) {
      this.wlmAdmissionCtrl = wlmAdmissionCtrl;
      return this;
    }

    /**
     * Set the wlmAgentLoadTrgt.
     *
     * @param wlmAgentLoadTrgt the wlmAgentLoadTrgt
     * @return the CreateCustomSettingsDb builder
     */
    public Builder wlmAgentLoadTrgt(String wlmAgentLoadTrgt) {
      this.wlmAgentLoadTrgt = wlmAgentLoadTrgt;
      return this;
    }

    /**
     * Set the wlmCpuLimit.
     *
     * @param wlmCpuLimit the wlmCpuLimit
     * @return the CreateCustomSettingsDb builder
     */
    public Builder wlmCpuLimit(String wlmCpuLimit) {
      this.wlmCpuLimit = wlmCpuLimit;
      return this;
    }

    /**
     * Set the wlmCpuShares.
     *
     * @param wlmCpuShares the wlmCpuShares
     * @return the CreateCustomSettingsDb builder
     */
    public Builder wlmCpuShares(String wlmCpuShares) {
      this.wlmCpuShares = wlmCpuShares;
      return this;
    }

    /**
     * Set the wlmCpuShareMode.
     *
     * @param wlmCpuShareMode the wlmCpuShareMode
     * @return the CreateCustomSettingsDb builder
     */
    public Builder wlmCpuShareMode(String wlmCpuShareMode) {
      this.wlmCpuShareMode = wlmCpuShareMode;
      return this;
    }
  }

  protected CreateCustomSettingsDb() { }

  protected CreateCustomSettingsDb(Builder builder) {
    actSortmemLimit = builder.actSortmemLimit;
    altCollate = builder.altCollate;
    appgroupMemSz = builder.appgroupMemSz;
    applheapsz = builder.applheapsz;
    applMemory = builder.applMemory;
    appCtlHeapSz = builder.appCtlHeapSz;
    archretrydelay = builder.archretrydelay;
    authnCacheDuration = builder.authnCacheDuration;
    autorestart = builder.autorestart;
    autoCgStats = builder.autoCgStats;
    autoMaint = builder.autoMaint;
    autoReorg = builder.autoReorg;
    autoReval = builder.autoReval;
    autoRunstats = builder.autoRunstats;
    autoSampling = builder.autoSampling;
    autoStatsViews = builder.autoStatsViews;
    autoStmtStats = builder.autoStmtStats;
    autoTblMaint = builder.autoTblMaint;
    avgAppls = builder.avgAppls;
    catalogcacheSz = builder.catalogcacheSz;
    chngpgsThresh = builder.chngpgsThresh;
    curCommit = builder.curCommit;
    databaseMemory = builder.databaseMemory;
    dbheap = builder.dbheap;
    dbCollname = builder.dbCollname;
    dbMemThresh = builder.dbMemThresh;
    ddlCompressionDef = builder.ddlCompressionDef;
    ddlConstraintDef = builder.ddlConstraintDef;
    decfltRounding = builder.decfltRounding;
    decArithmetic = builder.decArithmetic;
    decToCharFmt = builder.decToCharFmt;
    dftDegree = builder.dftDegree;
    dftExtentSz = builder.dftExtentSz;
    dftLoadrecSes = builder.dftLoadrecSes;
    dftMttbTypes = builder.dftMttbTypes;
    dftPrefetchSz = builder.dftPrefetchSz;
    dftQueryopt = builder.dftQueryopt;
    dftRefreshAge = builder.dftRefreshAge;
    dftSchemasDcc = builder.dftSchemasDcc;
    dftSqlmathwarn = builder.dftSqlmathwarn;
    dftTableOrg = builder.dftTableOrg;
    dlchktime = builder.dlchktime;
    enableXmlchar = builder.enableXmlchar;
    extendedRowSz = builder.extendedRowSz;
    groupheapRatio = builder.groupheapRatio;
    indexrec = builder.indexrec;
    largeAggregation = builder.largeAggregation;
    locklist = builder.locklist;
    locktimeout = builder.locktimeout;
    logindexbuild = builder.logindexbuild;
    logApplInfo = builder.logApplInfo;
    logDdlStmts = builder.logDdlStmts;
    logDiskCap = builder.logDiskCap;
    maxappls = builder.maxappls;
    maxfilop = builder.maxfilop;
    maxlocks = builder.maxlocks;
    minDecDiv3 = builder.minDecDiv3;
    monActMetrics = builder.monActMetrics;
    monDeadlock = builder.monDeadlock;
    monLckMsgLvl = builder.monLckMsgLvl;
    monLocktimeout = builder.monLocktimeout;
    monLockwait = builder.monLockwait;
    monLwThresh = builder.monLwThresh;
    monObjMetrics = builder.monObjMetrics;
    monPkglistSz = builder.monPkglistSz;
    monReqMetrics = builder.monReqMetrics;
    monRtnData = builder.monRtnData;
    monRtnExeclist = builder.monRtnExeclist;
    monUowData = builder.monUowData;
    monUowExeclist = builder.monUowExeclist;
    monUowPkglist = builder.monUowPkglist;
    ncharMapping = builder.ncharMapping;
    numFreqvalues = builder.numFreqvalues;
    numIocleaners = builder.numIocleaners;
    numIoservers = builder.numIoservers;
    numLogSpan = builder.numLogSpan;
    numQuantiles = builder.numQuantiles;
    optBuffpage = builder.optBuffpage;
    optDirectWrkld = builder.optDirectWrkld;
    optLocklist = builder.optLocklist;
    optMaxlocks = builder.optMaxlocks;
    optSortheap = builder.optSortheap;
    pageAgeTrgtGcr = builder.pageAgeTrgtGcr;
    pageAgeTrgtMcr = builder.pageAgeTrgtMcr;
    pckcachesz = builder.pckcachesz;
    plStackTrace = builder.plStackTrace;
    selfTuningMem = builder.selfTuningMem;
    seqdetect = builder.seqdetect;
    sheapthresShr = builder.sheapthresShr;
    softmax = builder.softmax;
    sortheap = builder.sortheap;
    sqlCcflags = builder.sqlCcflags;
    statHeapSz = builder.statHeapSz;
    stmtheap = builder.stmtheap;
    stmtConc = builder.stmtConc;
    stringUnits = builder.stringUnits;
    systimePeriodAdj = builder.systimePeriodAdj;
    trackmod = builder.trackmod;
    utilHeapSz = builder.utilHeapSz;
    wlmAdmissionCtrl = builder.wlmAdmissionCtrl;
    wlmAgentLoadTrgt = builder.wlmAgentLoadTrgt;
    wlmCpuLimit = builder.wlmCpuLimit;
    wlmCpuShares = builder.wlmCpuShares;
    wlmCpuShareMode = builder.wlmCpuShareMode;
  }

  /**
   * New builder.
   *
   * @return a CreateCustomSettingsDb builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actSortmemLimit.
   *
   * Configures the sort memory limit for DB2.
   *
   * @return the actSortmemLimit
   */
  public String actSortmemLimit() {
    return actSortmemLimit;
  }

  /**
   * Gets the altCollate.
   *
   * Configures the collation sequence.
   *
   * @return the altCollate
   */
  public String altCollate() {
    return altCollate;
  }

  /**
   * Gets the appgroupMemSz.
   *
   * Sets the application group memory size.
   *
   * @return the appgroupMemSz
   */
  public String appgroupMemSz() {
    return appgroupMemSz;
  }

  /**
   * Gets the applheapsz.
   *
   * Configures the application heap size.
   *
   * @return the applheapsz
   */
  public String applheapsz() {
    return applheapsz;
  }

  /**
   * Gets the applMemory.
   *
   * Configures the application memory allocation.
   *
   * @return the applMemory
   */
  public String applMemory() {
    return applMemory;
  }

  /**
   * Gets the appCtlHeapSz.
   *
   * Configures the application control heap size.
   *
   * @return the appCtlHeapSz
   */
  public String appCtlHeapSz() {
    return appCtlHeapSz;
  }

  /**
   * Gets the archretrydelay.
   *
   * Configures the archive retry delay time.
   *
   * @return the archretrydelay
   */
  public String archretrydelay() {
    return archretrydelay;
  }

  /**
   * Gets the authnCacheDuration.
   *
   * Configures the authentication cache duration.
   *
   * @return the authnCacheDuration
   */
  public String authnCacheDuration() {
    return authnCacheDuration;
  }

  /**
   * Gets the autorestart.
   *
   * Configures whether the database will automatically restart.
   *
   * @return the autorestart
   */
  public String autorestart() {
    return autorestart;
  }

  /**
   * Gets the autoCgStats.
   *
   * Configures whether auto collection of CG statistics is enabled.
   *
   * @return the autoCgStats
   */
  public String autoCgStats() {
    return autoCgStats;
  }

  /**
   * Gets the autoMaint.
   *
   * Configures automatic maintenance for the database.
   *
   * @return the autoMaint
   */
  public String autoMaint() {
    return autoMaint;
  }

  /**
   * Gets the autoReorg.
   *
   * Configures automatic reorganization for the database.
   *
   * @return the autoReorg
   */
  public String autoReorg() {
    return autoReorg;
  }

  /**
   * Gets the autoReval.
   *
   * Configures the auto refresh or revalidation method.
   *
   * @return the autoReval
   */
  public String autoReval() {
    return autoReval;
  }

  /**
   * Gets the autoRunstats.
   *
   * Configures automatic collection of run-time statistics.
   *
   * @return the autoRunstats
   */
  public String autoRunstats() {
    return autoRunstats;
  }

  /**
   * Gets the autoSampling.
   *
   * Configures whether auto-sampling is enabled.
   *
   * @return the autoSampling
   */
  public String autoSampling() {
    return autoSampling;
  }

  /**
   * Gets the autoStatsViews.
   *
   * Configures automatic collection of statistics on views.
   *
   * @return the autoStatsViews
   */
  public String autoStatsViews() {
    return autoStatsViews;
  }

  /**
   * Gets the autoStmtStats.
   *
   * Configures automatic collection of statement-level statistics.
   *
   * @return the autoStmtStats
   */
  public String autoStmtStats() {
    return autoStmtStats;
  }

  /**
   * Gets the autoTblMaint.
   *
   * Configures automatic table maintenance.
   *
   * @return the autoTblMaint
   */
  public String autoTblMaint() {
    return autoTblMaint;
  }

  /**
   * Gets the avgAppls.
   *
   * Average number of applications.
   *
   * @return the avgAppls
   */
  public String avgAppls() {
    return avgAppls;
  }

  /**
   * Gets the catalogcacheSz.
   *
   * Configures the catalog cache size.
   *
   * @return the catalogcacheSz
   */
  public String catalogcacheSz() {
    return catalogcacheSz;
  }

  /**
   * Gets the chngpgsThresh.
   *
   * Configures the change pages threshold percentage.
   *
   * @return the chngpgsThresh
   */
  public String chngpgsThresh() {
    return chngpgsThresh;
  }

  /**
   * Gets the curCommit.
   *
   * Configures the commit behavior.
   *
   * @return the curCommit
   */
  public String curCommit() {
    return curCommit;
  }

  /**
   * Gets the databaseMemory.
   *
   * Configures the database memory management.
   *
   * @return the databaseMemory
   */
  public String databaseMemory() {
    return databaseMemory;
  }

  /**
   * Gets the dbheap.
   *
   * Configures the database heap size.
   *
   * @return the dbheap
   */
  public String dbheap() {
    return dbheap;
  }

  /**
   * Gets the dbCollname.
   *
   * Specifies the database collation name.
   *
   * @return the dbCollname
   */
  public String dbCollname() {
    return dbCollname;
  }

  /**
   * Gets the dbMemThresh.
   *
   * Configures the memory threshold percentage for database.
   *
   * @return the dbMemThresh
   */
  public String dbMemThresh() {
    return dbMemThresh;
  }

  /**
   * Gets the ddlCompressionDef.
   *
   * Defines the default DDL compression behavior.
   *
   * @return the ddlCompressionDef
   */
  public String ddlCompressionDef() {
    return ddlCompressionDef;
  }

  /**
   * Gets the ddlConstraintDef.
   *
   * Defines the default constraint behavior in DDL.
   *
   * @return the ddlConstraintDef
   */
  public String ddlConstraintDef() {
    return ddlConstraintDef;
  }

  /**
   * Gets the decfltRounding.
   *
   * Configures the decimal floating-point rounding method.
   *
   * @return the decfltRounding
   */
  public String decfltRounding() {
    return decfltRounding;
  }

  /**
   * Gets the decArithmetic.
   *
   * Configures the default arithmetic for decimal operations.
   *
   * @return the decArithmetic
   */
  public String decArithmetic() {
    return decArithmetic;
  }

  /**
   * Gets the decToCharFmt.
   *
   * Configures the decimal-to-character conversion format.
   *
   * @return the decToCharFmt
   */
  public String decToCharFmt() {
    return decToCharFmt;
  }

  /**
   * Gets the dftDegree.
   *
   * Configures the default degree for parallelism.
   *
   * @return the dftDegree
   */
  public String dftDegree() {
    return dftDegree;
  }

  /**
   * Gets the dftExtentSz.
   *
   * Configures the default extent size for tables.
   *
   * @return the dftExtentSz
   */
  public String dftExtentSz() {
    return dftExtentSz;
  }

  /**
   * Gets the dftLoadrecSes.
   *
   * Configures the default load record session count.
   *
   * @return the dftLoadrecSes
   */
  public String dftLoadrecSes() {
    return dftLoadrecSes;
  }

  /**
   * Gets the dftMttbTypes.
   *
   * Configures the default MTTB (multi-table table scan) types.
   *
   * @return the dftMttbTypes
   */
  public String dftMttbTypes() {
    return dftMttbTypes;
  }

  /**
   * Gets the dftPrefetchSz.
   *
   * Configures the default prefetch size for queries.
   *
   * @return the dftPrefetchSz
   */
  public String dftPrefetchSz() {
    return dftPrefetchSz;
  }

  /**
   * Gets the dftQueryopt.
   *
   * Configures the default query optimization level.
   *
   * @return the dftQueryopt
   */
  public String dftQueryopt() {
    return dftQueryopt;
  }

  /**
   * Gets the dftRefreshAge.
   *
   * Configures the default refresh age for views.
   *
   * @return the dftRefreshAge
   */
  public String dftRefreshAge() {
    return dftRefreshAge;
  }

  /**
   * Gets the dftSchemasDcc.
   *
   * Configures whether DCC (database control center) is enabled for schemas.
   *
   * @return the dftSchemasDcc
   */
  public String dftSchemasDcc() {
    return dftSchemasDcc;
  }

  /**
   * Gets the dftSqlmathwarn.
   *
   * Configures whether SQL math warnings are enabled.
   *
   * @return the dftSqlmathwarn
   */
  public String dftSqlmathwarn() {
    return dftSqlmathwarn;
  }

  /**
   * Gets the dftTableOrg.
   *
   * Configures the default table organization (ROW or COLUMN).
   *
   * @return the dftTableOrg
   */
  public String dftTableOrg() {
    return dftTableOrg;
  }

  /**
   * Gets the dlchktime.
   *
   * Configures the deadlock check time in milliseconds.
   *
   * @return the dlchktime
   */
  public String dlchktime() {
    return dlchktime;
  }

  /**
   * Gets the enableXmlchar.
   *
   * Configures whether XML character support is enabled.
   *
   * @return the enableXmlchar
   */
  public String enableXmlchar() {
    return enableXmlchar;
  }

  /**
   * Gets the extendedRowSz.
   *
   * Configures whether extended row size is enabled.
   *
   * @return the extendedRowSz
   */
  public String extendedRowSz() {
    return extendedRowSz;
  }

  /**
   * Gets the groupheapRatio.
   *
   * Configures the heap ratio for group heap memory.
   *
   * @return the groupheapRatio
   */
  public String groupheapRatio() {
    return groupheapRatio;
  }

  /**
   * Gets the indexrec.
   *
   * Configures the index recovery method.
   *
   * @return the indexrec
   */
  public String indexrec() {
    return indexrec;
  }

  /**
   * Gets the largeAggregation.
   *
   * Configures whether large aggregation is enabled.
   *
   * @return the largeAggregation
   */
  public String largeAggregation() {
    return largeAggregation;
  }

  /**
   * Gets the locklist.
   *
   * Configures the lock list memory size.
   *
   * @return the locklist
   */
  public String locklist() {
    return locklist;
  }

  /**
   * Gets the locktimeout.
   *
   * Configures the lock timeout duration.
   *
   * @return the locktimeout
   */
  public String locktimeout() {
    return locktimeout;
  }

  /**
   * Gets the logindexbuild.
   *
   * Configures whether index builds are logged.
   *
   * @return the logindexbuild
   */
  public String logindexbuild() {
    return logindexbuild;
  }

  /**
   * Gets the logApplInfo.
   *
   * Configures whether application information is logged.
   *
   * @return the logApplInfo
   */
  public String logApplInfo() {
    return logApplInfo;
  }

  /**
   * Gets the logDdlStmts.
   *
   * Configures whether DDL statements are logged.
   *
   * @return the logDdlStmts
   */
  public String logDdlStmts() {
    return logDdlStmts;
  }

  /**
   * Gets the logDiskCap.
   *
   * Configures the disk capacity log setting.
   *
   * @return the logDiskCap
   */
  public String logDiskCap() {
    return logDiskCap;
  }

  /**
   * Gets the maxappls.
   *
   * Configures the maximum number of applications.
   *
   * @return the maxappls
   */
  public String maxappls() {
    return maxappls;
  }

  /**
   * Gets the maxfilop.
   *
   * Configures the maximum number of file operations.
   *
   * @return the maxfilop
   */
  public String maxfilop() {
    return maxfilop;
  }

  /**
   * Gets the maxlocks.
   *
   * Configures the maximum number of locks.
   *
   * @return the maxlocks
   */
  public String maxlocks() {
    return maxlocks;
  }

  /**
   * Gets the minDecDiv3.
   *
   * Configures whether decimal division by 3 should be handled.
   *
   * @return the minDecDiv3
   */
  public String minDecDiv3() {
    return minDecDiv3;
  }

  /**
   * Gets the monActMetrics.
   *
   * Configures the level of activity metrics to be monitored.
   *
   * @return the monActMetrics
   */
  public String monActMetrics() {
    return monActMetrics;
  }

  /**
   * Gets the monDeadlock.
   *
   * Configures deadlock monitoring settings.
   *
   * @return the monDeadlock
   */
  public String monDeadlock() {
    return monDeadlock;
  }

  /**
   * Gets the monLckMsgLvl.
   *
   * Configures the lock message level for monitoring.
   *
   * @return the monLckMsgLvl
   */
  public String monLckMsgLvl() {
    return monLckMsgLvl;
  }

  /**
   * Gets the monLocktimeout.
   *
   * Configures lock timeout monitoring settings.
   *
   * @return the monLocktimeout
   */
  public String monLocktimeout() {
    return monLocktimeout;
  }

  /**
   * Gets the monLockwait.
   *
   * Configures lock wait monitoring settings.
   *
   * @return the monLockwait
   */
  public String monLockwait() {
    return monLockwait;
  }

  /**
   * Gets the monLwThresh.
   *
   * Configures the lightweight threshold for monitoring.
   *
   * @return the monLwThresh
   */
  public String monLwThresh() {
    return monLwThresh;
  }

  /**
   * Gets the monObjMetrics.
   *
   * Configures the object metrics level for monitoring.
   *
   * @return the monObjMetrics
   */
  public String monObjMetrics() {
    return monObjMetrics;
  }

  /**
   * Gets the monPkglistSz.
   *
   * Configures the package list size for monitoring.
   *
   * @return the monPkglistSz
   */
  public String monPkglistSz() {
    return monPkglistSz;
  }

  /**
   * Gets the monReqMetrics.
   *
   * Configures the request metrics level for monitoring.
   *
   * @return the monReqMetrics
   */
  public String monReqMetrics() {
    return monReqMetrics;
  }

  /**
   * Gets the monRtnData.
   *
   * Configures the level of return data for monitoring.
   *
   * @return the monRtnData
   */
  public String monRtnData() {
    return monRtnData;
  }

  /**
   * Gets the monRtnExeclist.
   *
   * Configures whether stored procedure execution list is monitored.
   *
   * @return the monRtnExeclist
   */
  public String monRtnExeclist() {
    return monRtnExeclist;
  }

  /**
   * Gets the monUowData.
   *
   * Configures the level of unit of work (UOW) data for monitoring.
   *
   * @return the monUowData
   */
  public String monUowData() {
    return monUowData;
  }

  /**
   * Gets the monUowExeclist.
   *
   * Configures whether UOW execution list is monitored.
   *
   * @return the monUowExeclist
   */
  public String monUowExeclist() {
    return monUowExeclist;
  }

  /**
   * Gets the monUowPkglist.
   *
   * Configures whether UOW package list is monitored.
   *
   * @return the monUowPkglist
   */
  public String monUowPkglist() {
    return monUowPkglist;
  }

  /**
   * Gets the ncharMapping.
   *
   * Configures the mapping of NCHAR character types.
   *
   * @return the ncharMapping
   */
  public String ncharMapping() {
    return ncharMapping;
  }

  /**
   * Gets the numFreqvalues.
   *
   * Configures the number of frequent values for optimization.
   *
   * @return the numFreqvalues
   */
  public String numFreqvalues() {
    return numFreqvalues;
  }

  /**
   * Gets the numIocleaners.
   *
   * Configures the number of IO cleaners.
   *
   * @return the numIocleaners
   */
  public String numIocleaners() {
    return numIocleaners;
  }

  /**
   * Gets the numIoservers.
   *
   * Configures the number of IO servers.
   *
   * @return the numIoservers
   */
  public String numIoservers() {
    return numIoservers;
  }

  /**
   * Gets the numLogSpan.
   *
   * Configures the number of log spans.
   *
   * @return the numLogSpan
   */
  public String numLogSpan() {
    return numLogSpan;
  }

  /**
   * Gets the numQuantiles.
   *
   * Configures the number of quantiles for optimizations.
   *
   * @return the numQuantiles
   */
  public String numQuantiles() {
    return numQuantiles;
  }

  /**
   * Gets the optBuffpage.
   *
   * Configures the buffer page optimization setting.
   *
   * @return the optBuffpage
   */
  public String optBuffpage() {
    return optBuffpage;
  }

  /**
   * Gets the optDirectWrkld.
   *
   * Configures the direct workload optimization setting.
   *
   * @return the optDirectWrkld
   */
  public String optDirectWrkld() {
    return optDirectWrkld;
  }

  /**
   * Gets the optLocklist.
   *
   * Configures the lock list optimization setting.
   *
   * @return the optLocklist
   */
  public String optLocklist() {
    return optLocklist;
  }

  /**
   * Gets the optMaxlocks.
   *
   * Configures the max locks optimization setting.
   *
   * @return the optMaxlocks
   */
  public String optMaxlocks() {
    return optMaxlocks;
  }

  /**
   * Gets the optSortheap.
   *
   * Configures the sort heap optimization setting.
   *
   * @return the optSortheap
   */
  public String optSortheap() {
    return optSortheap;
  }

  /**
   * Gets the pageAgeTrgtGcr.
   *
   * Configures the page age target for garbage collection.
   *
   * @return the pageAgeTrgtGcr
   */
  public String pageAgeTrgtGcr() {
    return pageAgeTrgtGcr;
  }

  /**
   * Gets the pageAgeTrgtMcr.
   *
   * Configures the page age target for memory collection.
   *
   * @return the pageAgeTrgtMcr
   */
  public String pageAgeTrgtMcr() {
    return pageAgeTrgtMcr;
  }

  /**
   * Gets the pckcachesz.
   *
   * Configures the package cache size.
   *
   * @return the pckcachesz
   */
  public String pckcachesz() {
    return pckcachesz;
  }

  /**
   * Gets the plStackTrace.
   *
   * Configures the level of stack trace logging for stored procedures.
   *
   * @return the plStackTrace
   */
  public String plStackTrace() {
    return plStackTrace;
  }

  /**
   * Gets the selfTuningMem.
   *
   * Configures whether self-tuning memory is enabled.
   *
   * @return the selfTuningMem
   */
  public String selfTuningMem() {
    return selfTuningMem;
  }

  /**
   * Gets the seqdetect.
   *
   * Configures sequence detection for queries.
   *
   * @return the seqdetect
   */
  public String seqdetect() {
    return seqdetect;
  }

  /**
   * Gets the sheapthresShr.
   *
   * Configures the shared heap threshold size.
   *
   * @return the sheapthresShr
   */
  public String sheapthresShr() {
    return sheapthresShr;
  }

  /**
   * Gets the softmax.
   *
   * Configures the soft max setting.
   *
   * @return the softmax
   */
  public String softmax() {
    return softmax;
  }

  /**
   * Gets the sortheap.
   *
   * Configures the sort heap memory size.
   *
   * @return the sortheap
   */
  public String sortheap() {
    return sortheap;
  }

  /**
   * Gets the sqlCcflags.
   *
   * Configures the SQL compiler flags.
   *
   * @return the sqlCcflags
   */
  public String sqlCcflags() {
    return sqlCcflags;
  }

  /**
   * Gets the statHeapSz.
   *
   * Configures the statistics heap size.
   *
   * @return the statHeapSz
   */
  public String statHeapSz() {
    return statHeapSz;
  }

  /**
   * Gets the stmtheap.
   *
   * Configures the statement heap size.
   *
   * @return the stmtheap
   */
  public String stmtheap() {
    return stmtheap;
  }

  /**
   * Gets the stmtConc.
   *
   * Configures the statement concurrency.
   *
   * @return the stmtConc
   */
  public String stmtConc() {
    return stmtConc;
  }

  /**
   * Gets the stringUnits.
   *
   * Configures the string unit settings.
   *
   * @return the stringUnits
   */
  public String stringUnits() {
    return stringUnits;
  }

  /**
   * Gets the systimePeriodAdj.
   *
   * Configures whether system time period adjustments are enabled.
   *
   * @return the systimePeriodAdj
   */
  public String systimePeriodAdj() {
    return systimePeriodAdj;
  }

  /**
   * Gets the trackmod.
   *
   * Configures whether modifications to tracked objects are logged.
   *
   * @return the trackmod
   */
  public String trackmod() {
    return trackmod;
  }

  /**
   * Gets the utilHeapSz.
   *
   * Configures the utility heap size.
   *
   * @return the utilHeapSz
   */
  public String utilHeapSz() {
    return utilHeapSz;
  }

  /**
   * Gets the wlmAdmissionCtrl.
   *
   * Configures whether WLM (Workload Management) admission control is enabled.
   *
   * @return the wlmAdmissionCtrl
   */
  public String wlmAdmissionCtrl() {
    return wlmAdmissionCtrl;
  }

  /**
   * Gets the wlmAgentLoadTrgt.
   *
   * Configures the WLM agent load target.
   *
   * @return the wlmAgentLoadTrgt
   */
  public String wlmAgentLoadTrgt() {
    return wlmAgentLoadTrgt;
  }

  /**
   * Gets the wlmCpuLimit.
   *
   * Configures the CPU limit for WLM workloads.
   *
   * @return the wlmCpuLimit
   */
  public String wlmCpuLimit() {
    return wlmCpuLimit;
  }

  /**
   * Gets the wlmCpuShares.
   *
   * Configures the CPU share count for WLM workloads.
   *
   * @return the wlmCpuShares
   */
  public String wlmCpuShares() {
    return wlmCpuShares;
  }

  /**
   * Gets the wlmCpuShareMode.
   *
   * Configures the mode of CPU shares for WLM workloads.
   *
   * @return the wlmCpuShareMode
   */
  public String wlmCpuShareMode() {
    return wlmCpuShareMode;
  }
}

