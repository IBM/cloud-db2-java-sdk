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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Container for general database management settings.
 */
public class CreateCustomSettingsDbm extends GenericModel {

  /**
   * Configures the communication bandwidth for the database manager.
   */
  public interface CommBandwidth {
    /** range(0.1, 100000). */
    String RANGE_0_1_100000 = "range(0.1, 100000)";
  }

  /**
   * Configures the CPU speed for the database manager.
   */
  public interface Cpuspeed {
    /** range(0.0000000001, 1). */
    String RANGE_0_0000000001_1 = "range(0.0000000001, 1)";
  }

  /**
   * Configures whether the buffer pool is monitored by default.
   */
  public interface DftMonBufpool {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether lock monitoring is enabled by default.
   */
  public interface DftMonLock {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether sort operations are monitored by default.
   */
  public interface DftMonSort {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether statement execution is monitored by default.
   */
  public interface DftMonStmt {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether table operations are monitored by default.
   */
  public interface DftMonTable {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether timestamp monitoring is enabled by default.
   */
  public interface DftMonTimestamp {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether unit of work (UOW) monitoring is enabled by default.
   */
  public interface DftMonUow {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures the diagnostic level for the database manager.
   */
  public interface Diaglevel {
    /** range(0, 4). */
    String RANGE_0_4 = "range(0, 4)";
  }

  /**
   * Configures whether federated asynchronous mode is enabled.
   */
  public interface FederatedAsync {
    /** range(0, 32767). */
    String RANGE_0_32767 = "range(0, 32767)";
    /** ANY. */
    String ANY = "ANY";
  }

  /**
   * Configures the type of indexing to be used in the database manager.
   */
  public interface Indexrec {
    /** RESTART. */
    String RESTART = "RESTART";
    /** RESTART_NO_REDO. */
    String RESTART_NO_REDO = "RESTART_NO_REDO";
    /** ACCESS. */
    String ACCESS = "ACCESS";
    /** ACCESS_NO_REDO. */
    String ACCESS_NO_REDO = "ACCESS_NO_REDO";
  }

  /**
   * Configures the parallelism settings for intra-query parallelism.
   */
  public interface IntraParallel {
    /** SYSTEM. */
    String SYSTEM = "SYSTEM";
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures whether fenced routines are kept in memory.
   */
  public interface Keepfenced {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the maximum number of connection retries.
   */
  public interface MaxConnretries {
    /** range(0, 100). */
    String RANGE_0_100 = "range(0, 100)";
  }

  /**
   * Configures the maximum degree of parallelism for queries.
   */
  public interface MaxQuerydegree {
    /** range(1, 32767). */
    String RANGE_1_32767 = "range(1, 32767)";
    /** ANY. */
    String ANY = "ANY";
  }

  /**
   * Configures the size of the monitoring heap.
   */
  public interface MonHeapSz {
    /** range(0, 2147483647). */
    String RANGE_0_2147483647 = "range(0, 2147483647)";
    /** AUTOMATIC. */
    String AUTOMATIC = "AUTOMATIC";
  }

  /**
   * Configures the size of multipart queries in MB.
   */
  public interface Multipartsizemb {
    /** range(5, 5120). */
    String RANGE_5_5120 = "range(5, 5120)";
  }

  /**
   * Configures the level of notifications for the database manager.
   */
  public interface Notifylevel {
    /** range(0, 4). */
    String RANGE_0_4 = "range(0, 4)";
  }

  /**
   * Configures the number of initial agents in the database manager.
   */
  public interface NumInitagents {
    /** range(0, 64000). */
    String RANGE_0_64000 = "range(0, 64000)";
  }

  /**
   * Configures the number of initial fenced routines.
   */
  public interface NumInitfenced {
    /** range(0, 64000). */
    String RANGE_0_64000 = "range(0, 64000)";
  }

  /**
   * Configures the number of pool agents.
   */
  public interface NumPoolagents {
    /** range(0, 64000). */
    String RANGE_0_64000 = "range(0, 64000)";
  }

  /**
   * Configures the interval between resync operations.
   */
  public interface ResyncInterval {
    /** range(1, 60000). */
    String RANGE_1_60000 = "range(1, 60000)";
  }

  /**
   * Configures the request/response I/O block size.
   */
  public interface Rqrioblk {
    /** range(4096, 65535). */
    String RANGE_4096_65535 = "range(4096, 65535)";
  }

  /**
   * Configures the time in minutes for start/stop operations.
   */
  public interface StartStopTime {
    /** range(1, 1440). */
    String RANGE_1_1440 = "range(1, 1440)";
  }

  /**
   * Configures the utility impact limit.
   */
  public interface UtilImpactLim {
    /** range(1, 100). */
    String RANGE_1_100 = "range(1, 100)";
  }

  /**
   * Configures whether the WLM (Workload Management) dispatcher is enabled.
   */
  public interface WlmDispatcher {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the concurrency level for the WLM dispatcher.
   */
  public interface WlmDispConcur {
    /** range(1, 32767). */
    String RANGE_1_32767 = "range(1, 32767)";
    /** COMPUTED. */
    String COMPUTED = "COMPUTED";
  }

  /**
   * Configures whether CPU shares are used for WLM dispatcher.
   */
  public interface WlmDispCpuShares {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures the minimum utility threshold for WLM dispatcher.
   */
  public interface WlmDispMinUtil {
    /** range(0, 100). */
    String RANGE_0_100 = "range(0, 100)";
  }

  @SerializedName("COMM_BANDWIDTH")
  protected String commBandwidth;
  @SerializedName("CPUSPEED")
  protected String cpuspeed;
  @SerializedName("DFT_MON_BUFPOOL")
  protected String dftMonBufpool;
  @SerializedName("DFT_MON_LOCK")
  protected String dftMonLock;
  @SerializedName("DFT_MON_SORT")
  protected String dftMonSort;
  @SerializedName("DFT_MON_STMT")
  protected String dftMonStmt;
  @SerializedName("DFT_MON_TABLE")
  protected String dftMonTable;
  @SerializedName("DFT_MON_TIMESTAMP")
  protected String dftMonTimestamp;
  @SerializedName("DFT_MON_UOW")
  protected String dftMonUow;
  @SerializedName("DIAGLEVEL")
  protected String diaglevel;
  @SerializedName("FEDERATED_ASYNC")
  protected String federatedAsync;
  @SerializedName("INDEXREC")
  protected String indexrec;
  @SerializedName("INTRA_PARALLEL")
  protected String intraParallel;
  @SerializedName("KEEPFENCED")
  protected String keepfenced;
  @SerializedName("MAX_CONNRETRIES")
  protected String maxConnretries;
  @SerializedName("MAX_QUERYDEGREE")
  protected String maxQuerydegree;
  @SerializedName("MON_HEAP_SZ")
  protected String monHeapSz;
  @SerializedName("MULTIPARTSIZEMB")
  protected String multipartsizemb;
  @SerializedName("NOTIFYLEVEL")
  protected String notifylevel;
  @SerializedName("NUM_INITAGENTS")
  protected String numInitagents;
  @SerializedName("NUM_INITFENCED")
  protected String numInitfenced;
  @SerializedName("NUM_POOLAGENTS")
  protected String numPoolagents;
  @SerializedName("RESYNC_INTERVAL")
  protected String resyncInterval;
  @SerializedName("RQRIOBLK")
  protected String rqrioblk;
  @SerializedName("START_STOP_TIME")
  protected String startStopTime;
  @SerializedName("UTIL_IMPACT_LIM")
  protected String utilImpactLim;
  @SerializedName("WLM_DISPATCHER")
  protected String wlmDispatcher;
  @SerializedName("WLM_DISP_CONCUR")
  protected String wlmDispConcur;
  @SerializedName("WLM_DISP_CPU_SHARES")
  protected String wlmDispCpuShares;
  @SerializedName("WLM_DISP_MIN_UTIL")
  protected String wlmDispMinUtil;

  /**
   * Builder.
   */
  public static class Builder {
    private String commBandwidth;
    private String cpuspeed;
    private String dftMonBufpool;
    private String dftMonLock;
    private String dftMonSort;
    private String dftMonStmt;
    private String dftMonTable;
    private String dftMonTimestamp;
    private String dftMonUow;
    private String diaglevel;
    private String federatedAsync;
    private String indexrec;
    private String intraParallel;
    private String keepfenced;
    private String maxConnretries;
    private String maxQuerydegree;
    private String monHeapSz;
    private String multipartsizemb;
    private String notifylevel;
    private String numInitagents;
    private String numInitfenced;
    private String numPoolagents;
    private String resyncInterval;
    private String rqrioblk;
    private String startStopTime;
    private String utilImpactLim;
    private String wlmDispatcher;
    private String wlmDispConcur;
    private String wlmDispCpuShares;
    private String wlmDispMinUtil;

    /**
     * Instantiates a new Builder from an existing CreateCustomSettingsDbm instance.
     *
     * @param createCustomSettingsDbm the instance to initialize the Builder with
     */
    private Builder(CreateCustomSettingsDbm createCustomSettingsDbm) {
      this.commBandwidth = createCustomSettingsDbm.commBandwidth;
      this.cpuspeed = createCustomSettingsDbm.cpuspeed;
      this.dftMonBufpool = createCustomSettingsDbm.dftMonBufpool;
      this.dftMonLock = createCustomSettingsDbm.dftMonLock;
      this.dftMonSort = createCustomSettingsDbm.dftMonSort;
      this.dftMonStmt = createCustomSettingsDbm.dftMonStmt;
      this.dftMonTable = createCustomSettingsDbm.dftMonTable;
      this.dftMonTimestamp = createCustomSettingsDbm.dftMonTimestamp;
      this.dftMonUow = createCustomSettingsDbm.dftMonUow;
      this.diaglevel = createCustomSettingsDbm.diaglevel;
      this.federatedAsync = createCustomSettingsDbm.federatedAsync;
      this.indexrec = createCustomSettingsDbm.indexrec;
      this.intraParallel = createCustomSettingsDbm.intraParallel;
      this.keepfenced = createCustomSettingsDbm.keepfenced;
      this.maxConnretries = createCustomSettingsDbm.maxConnretries;
      this.maxQuerydegree = createCustomSettingsDbm.maxQuerydegree;
      this.monHeapSz = createCustomSettingsDbm.monHeapSz;
      this.multipartsizemb = createCustomSettingsDbm.multipartsizemb;
      this.notifylevel = createCustomSettingsDbm.notifylevel;
      this.numInitagents = createCustomSettingsDbm.numInitagents;
      this.numInitfenced = createCustomSettingsDbm.numInitfenced;
      this.numPoolagents = createCustomSettingsDbm.numPoolagents;
      this.resyncInterval = createCustomSettingsDbm.resyncInterval;
      this.rqrioblk = createCustomSettingsDbm.rqrioblk;
      this.startStopTime = createCustomSettingsDbm.startStopTime;
      this.utilImpactLim = createCustomSettingsDbm.utilImpactLim;
      this.wlmDispatcher = createCustomSettingsDbm.wlmDispatcher;
      this.wlmDispConcur = createCustomSettingsDbm.wlmDispConcur;
      this.wlmDispCpuShares = createCustomSettingsDbm.wlmDispCpuShares;
      this.wlmDispMinUtil = createCustomSettingsDbm.wlmDispMinUtil;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateCustomSettingsDbm.
     *
     * @return the new CreateCustomSettingsDbm instance
     */
    public CreateCustomSettingsDbm build() {
      return new CreateCustomSettingsDbm(this);
    }

    /**
     * Set the commBandwidth.
     *
     * @param commBandwidth the commBandwidth
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder commBandwidth(String commBandwidth) {
      this.commBandwidth = commBandwidth;
      return this;
    }

    /**
     * Set the cpuspeed.
     *
     * @param cpuspeed the cpuspeed
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder cpuspeed(String cpuspeed) {
      this.cpuspeed = cpuspeed;
      return this;
    }

    /**
     * Set the dftMonBufpool.
     *
     * @param dftMonBufpool the dftMonBufpool
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder dftMonBufpool(String dftMonBufpool) {
      this.dftMonBufpool = dftMonBufpool;
      return this;
    }

    /**
     * Set the dftMonLock.
     *
     * @param dftMonLock the dftMonLock
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder dftMonLock(String dftMonLock) {
      this.dftMonLock = dftMonLock;
      return this;
    }

    /**
     * Set the dftMonSort.
     *
     * @param dftMonSort the dftMonSort
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder dftMonSort(String dftMonSort) {
      this.dftMonSort = dftMonSort;
      return this;
    }

    /**
     * Set the dftMonStmt.
     *
     * @param dftMonStmt the dftMonStmt
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder dftMonStmt(String dftMonStmt) {
      this.dftMonStmt = dftMonStmt;
      return this;
    }

    /**
     * Set the dftMonTable.
     *
     * @param dftMonTable the dftMonTable
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder dftMonTable(String dftMonTable) {
      this.dftMonTable = dftMonTable;
      return this;
    }

    /**
     * Set the dftMonTimestamp.
     *
     * @param dftMonTimestamp the dftMonTimestamp
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder dftMonTimestamp(String dftMonTimestamp) {
      this.dftMonTimestamp = dftMonTimestamp;
      return this;
    }

    /**
     * Set the dftMonUow.
     *
     * @param dftMonUow the dftMonUow
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder dftMonUow(String dftMonUow) {
      this.dftMonUow = dftMonUow;
      return this;
    }

    /**
     * Set the diaglevel.
     *
     * @param diaglevel the diaglevel
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder diaglevel(String diaglevel) {
      this.diaglevel = diaglevel;
      return this;
    }

    /**
     * Set the federatedAsync.
     *
     * @param federatedAsync the federatedAsync
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder federatedAsync(String federatedAsync) {
      this.federatedAsync = federatedAsync;
      return this;
    }

    /**
     * Set the indexrec.
     *
     * @param indexrec the indexrec
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder indexrec(String indexrec) {
      this.indexrec = indexrec;
      return this;
    }

    /**
     * Set the intraParallel.
     *
     * @param intraParallel the intraParallel
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder intraParallel(String intraParallel) {
      this.intraParallel = intraParallel;
      return this;
    }

    /**
     * Set the keepfenced.
     *
     * @param keepfenced the keepfenced
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder keepfenced(String keepfenced) {
      this.keepfenced = keepfenced;
      return this;
    }

    /**
     * Set the maxConnretries.
     *
     * @param maxConnretries the maxConnretries
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder maxConnretries(String maxConnretries) {
      this.maxConnretries = maxConnretries;
      return this;
    }

    /**
     * Set the maxQuerydegree.
     *
     * @param maxQuerydegree the maxQuerydegree
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder maxQuerydegree(String maxQuerydegree) {
      this.maxQuerydegree = maxQuerydegree;
      return this;
    }

    /**
     * Set the monHeapSz.
     *
     * @param monHeapSz the monHeapSz
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder monHeapSz(String monHeapSz) {
      this.monHeapSz = monHeapSz;
      return this;
    }

    /**
     * Set the multipartsizemb.
     *
     * @param multipartsizemb the multipartsizemb
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder multipartsizemb(String multipartsizemb) {
      this.multipartsizemb = multipartsizemb;
      return this;
    }

    /**
     * Set the notifylevel.
     *
     * @param notifylevel the notifylevel
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder notifylevel(String notifylevel) {
      this.notifylevel = notifylevel;
      return this;
    }

    /**
     * Set the numInitagents.
     *
     * @param numInitagents the numInitagents
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder numInitagents(String numInitagents) {
      this.numInitagents = numInitagents;
      return this;
    }

    /**
     * Set the numInitfenced.
     *
     * @param numInitfenced the numInitfenced
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder numInitfenced(String numInitfenced) {
      this.numInitfenced = numInitfenced;
      return this;
    }

    /**
     * Set the numPoolagents.
     *
     * @param numPoolagents the numPoolagents
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder numPoolagents(String numPoolagents) {
      this.numPoolagents = numPoolagents;
      return this;
    }

    /**
     * Set the resyncInterval.
     *
     * @param resyncInterval the resyncInterval
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder resyncInterval(String resyncInterval) {
      this.resyncInterval = resyncInterval;
      return this;
    }

    /**
     * Set the rqrioblk.
     *
     * @param rqrioblk the rqrioblk
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder rqrioblk(String rqrioblk) {
      this.rqrioblk = rqrioblk;
      return this;
    }

    /**
     * Set the startStopTime.
     *
     * @param startStopTime the startStopTime
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder startStopTime(String startStopTime) {
      this.startStopTime = startStopTime;
      return this;
    }

    /**
     * Set the utilImpactLim.
     *
     * @param utilImpactLim the utilImpactLim
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder utilImpactLim(String utilImpactLim) {
      this.utilImpactLim = utilImpactLim;
      return this;
    }

    /**
     * Set the wlmDispatcher.
     *
     * @param wlmDispatcher the wlmDispatcher
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder wlmDispatcher(String wlmDispatcher) {
      this.wlmDispatcher = wlmDispatcher;
      return this;
    }

    /**
     * Set the wlmDispConcur.
     *
     * @param wlmDispConcur the wlmDispConcur
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder wlmDispConcur(String wlmDispConcur) {
      this.wlmDispConcur = wlmDispConcur;
      return this;
    }

    /**
     * Set the wlmDispCpuShares.
     *
     * @param wlmDispCpuShares the wlmDispCpuShares
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder wlmDispCpuShares(String wlmDispCpuShares) {
      this.wlmDispCpuShares = wlmDispCpuShares;
      return this;
    }

    /**
     * Set the wlmDispMinUtil.
     *
     * @param wlmDispMinUtil the wlmDispMinUtil
     * @return the CreateCustomSettingsDbm builder
     */
    public Builder wlmDispMinUtil(String wlmDispMinUtil) {
      this.wlmDispMinUtil = wlmDispMinUtil;
      return this;
    }
  }

  protected CreateCustomSettingsDbm() { }

  protected CreateCustomSettingsDbm(Builder builder) {
    commBandwidth = builder.commBandwidth;
    cpuspeed = builder.cpuspeed;
    dftMonBufpool = builder.dftMonBufpool;
    dftMonLock = builder.dftMonLock;
    dftMonSort = builder.dftMonSort;
    dftMonStmt = builder.dftMonStmt;
    dftMonTable = builder.dftMonTable;
    dftMonTimestamp = builder.dftMonTimestamp;
    dftMonUow = builder.dftMonUow;
    diaglevel = builder.diaglevel;
    federatedAsync = builder.federatedAsync;
    indexrec = builder.indexrec;
    intraParallel = builder.intraParallel;
    keepfenced = builder.keepfenced;
    maxConnretries = builder.maxConnretries;
    maxQuerydegree = builder.maxQuerydegree;
    monHeapSz = builder.monHeapSz;
    multipartsizemb = builder.multipartsizemb;
    notifylevel = builder.notifylevel;
    numInitagents = builder.numInitagents;
    numInitfenced = builder.numInitfenced;
    numPoolagents = builder.numPoolagents;
    resyncInterval = builder.resyncInterval;
    rqrioblk = builder.rqrioblk;
    startStopTime = builder.startStopTime;
    utilImpactLim = builder.utilImpactLim;
    wlmDispatcher = builder.wlmDispatcher;
    wlmDispConcur = builder.wlmDispConcur;
    wlmDispCpuShares = builder.wlmDispCpuShares;
    wlmDispMinUtil = builder.wlmDispMinUtil;
  }

  /**
   * New builder.
   *
   * @return a CreateCustomSettingsDbm builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the commBandwidth.
   *
   * Configures the communication bandwidth for the database manager.
   *
   * @return the commBandwidth
   */
  public String commBandwidth() {
    return commBandwidth;
  }

  /**
   * Gets the cpuspeed.
   *
   * Configures the CPU speed for the database manager.
   *
   * @return the cpuspeed
   */
  public String cpuspeed() {
    return cpuspeed;
  }

  /**
   * Gets the dftMonBufpool.
   *
   * Configures whether the buffer pool is monitored by default.
   *
   * @return the dftMonBufpool
   */
  public String dftMonBufpool() {
    return dftMonBufpool;
  }

  /**
   * Gets the dftMonLock.
   *
   * Configures whether lock monitoring is enabled by default.
   *
   * @return the dftMonLock
   */
  public String dftMonLock() {
    return dftMonLock;
  }

  /**
   * Gets the dftMonSort.
   *
   * Configures whether sort operations are monitored by default.
   *
   * @return the dftMonSort
   */
  public String dftMonSort() {
    return dftMonSort;
  }

  /**
   * Gets the dftMonStmt.
   *
   * Configures whether statement execution is monitored by default.
   *
   * @return the dftMonStmt
   */
  public String dftMonStmt() {
    return dftMonStmt;
  }

  /**
   * Gets the dftMonTable.
   *
   * Configures whether table operations are monitored by default.
   *
   * @return the dftMonTable
   */
  public String dftMonTable() {
    return dftMonTable;
  }

  /**
   * Gets the dftMonTimestamp.
   *
   * Configures whether timestamp monitoring is enabled by default.
   *
   * @return the dftMonTimestamp
   */
  public String dftMonTimestamp() {
    return dftMonTimestamp;
  }

  /**
   * Gets the dftMonUow.
   *
   * Configures whether unit of work (UOW) monitoring is enabled by default.
   *
   * @return the dftMonUow
   */
  public String dftMonUow() {
    return dftMonUow;
  }

  /**
   * Gets the diaglevel.
   *
   * Configures the diagnostic level for the database manager.
   *
   * @return the diaglevel
   */
  public String diaglevel() {
    return diaglevel;
  }

  /**
   * Gets the federatedAsync.
   *
   * Configures whether federated asynchronous mode is enabled.
   *
   * @return the federatedAsync
   */
  public String federatedAsync() {
    return federatedAsync;
  }

  /**
   * Gets the indexrec.
   *
   * Configures the type of indexing to be used in the database manager.
   *
   * @return the indexrec
   */
  public String indexrec() {
    return indexrec;
  }

  /**
   * Gets the intraParallel.
   *
   * Configures the parallelism settings for intra-query parallelism.
   *
   * @return the intraParallel
   */
  public String intraParallel() {
    return intraParallel;
  }

  /**
   * Gets the keepfenced.
   *
   * Configures whether fenced routines are kept in memory.
   *
   * @return the keepfenced
   */
  public String keepfenced() {
    return keepfenced;
  }

  /**
   * Gets the maxConnretries.
   *
   * Configures the maximum number of connection retries.
   *
   * @return the maxConnretries
   */
  public String maxConnretries() {
    return maxConnretries;
  }

  /**
   * Gets the maxQuerydegree.
   *
   * Configures the maximum degree of parallelism for queries.
   *
   * @return the maxQuerydegree
   */
  public String maxQuerydegree() {
    return maxQuerydegree;
  }

  /**
   * Gets the monHeapSz.
   *
   * Configures the size of the monitoring heap.
   *
   * @return the monHeapSz
   */
  public String monHeapSz() {
    return monHeapSz;
  }

  /**
   * Gets the multipartsizemb.
   *
   * Configures the size of multipart queries in MB.
   *
   * @return the multipartsizemb
   */
  public String multipartsizemb() {
    return multipartsizemb;
  }

  /**
   * Gets the notifylevel.
   *
   * Configures the level of notifications for the database manager.
   *
   * @return the notifylevel
   */
  public String notifylevel() {
    return notifylevel;
  }

  /**
   * Gets the numInitagents.
   *
   * Configures the number of initial agents in the database manager.
   *
   * @return the numInitagents
   */
  public String numInitagents() {
    return numInitagents;
  }

  /**
   * Gets the numInitfenced.
   *
   * Configures the number of initial fenced routines.
   *
   * @return the numInitfenced
   */
  public String numInitfenced() {
    return numInitfenced;
  }

  /**
   * Gets the numPoolagents.
   *
   * Configures the number of pool agents.
   *
   * @return the numPoolagents
   */
  public String numPoolagents() {
    return numPoolagents;
  }

  /**
   * Gets the resyncInterval.
   *
   * Configures the interval between resync operations.
   *
   * @return the resyncInterval
   */
  public String resyncInterval() {
    return resyncInterval;
  }

  /**
   * Gets the rqrioblk.
   *
   * Configures the request/response I/O block size.
   *
   * @return the rqrioblk
   */
  public String rqrioblk() {
    return rqrioblk;
  }

  /**
   * Gets the startStopTime.
   *
   * Configures the time in minutes for start/stop operations.
   *
   * @return the startStopTime
   */
  public String startStopTime() {
    return startStopTime;
  }

  /**
   * Gets the utilImpactLim.
   *
   * Configures the utility impact limit.
   *
   * @return the utilImpactLim
   */
  public String utilImpactLim() {
    return utilImpactLim;
  }

  /**
   * Gets the wlmDispatcher.
   *
   * Configures whether the WLM (Workload Management) dispatcher is enabled.
   *
   * @return the wlmDispatcher
   */
  public String wlmDispatcher() {
    return wlmDispatcher;
  }

  /**
   * Gets the wlmDispConcur.
   *
   * Configures the concurrency level for the WLM dispatcher.
   *
   * @return the wlmDispConcur
   */
  public String wlmDispConcur() {
    return wlmDispConcur;
  }

  /**
   * Gets the wlmDispCpuShares.
   *
   * Configures whether CPU shares are used for WLM dispatcher.
   *
   * @return the wlmDispCpuShares
   */
  public String wlmDispCpuShares() {
    return wlmDispCpuShares;
  }

  /**
   * Gets the wlmDispMinUtil.
   *
   * Configures the minimum utility threshold for WLM dispatcher.
   *
   * @return the wlmDispMinUtil
   */
  public String wlmDispMinUtil() {
    return wlmDispMinUtil;
  }
}

