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
 * Tunable parameters related to the Db2 instance manager (dbm).
 */
public class SuccessTuneableParamsTuneableParamDbm extends GenericModel {

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

  protected SuccessTuneableParamsTuneableParamDbm() { }

  /**
   * Gets the commBandwidth.
   *
   * @return the commBandwidth
   */
  public String getCommBandwidth() {
    return commBandwidth;
  }

  /**
   * Gets the cpuspeed.
   *
   * @return the cpuspeed
   */
  public String getCpuspeed() {
    return cpuspeed;
  }

  /**
   * Gets the dftMonBufpool.
   *
   * @return the dftMonBufpool
   */
  public String getDftMonBufpool() {
    return dftMonBufpool;
  }

  /**
   * Gets the dftMonLock.
   *
   * @return the dftMonLock
   */
  public String getDftMonLock() {
    return dftMonLock;
  }

  /**
   * Gets the dftMonSort.
   *
   * @return the dftMonSort
   */
  public String getDftMonSort() {
    return dftMonSort;
  }

  /**
   * Gets the dftMonStmt.
   *
   * @return the dftMonStmt
   */
  public String getDftMonStmt() {
    return dftMonStmt;
  }

  /**
   * Gets the dftMonTable.
   *
   * @return the dftMonTable
   */
  public String getDftMonTable() {
    return dftMonTable;
  }

  /**
   * Gets the dftMonTimestamp.
   *
   * @return the dftMonTimestamp
   */
  public String getDftMonTimestamp() {
    return dftMonTimestamp;
  }

  /**
   * Gets the dftMonUow.
   *
   * @return the dftMonUow
   */
  public String getDftMonUow() {
    return dftMonUow;
  }

  /**
   * Gets the diaglevel.
   *
   * @return the diaglevel
   */
  public String getDiaglevel() {
    return diaglevel;
  }

  /**
   * Gets the federatedAsync.
   *
   * @return the federatedAsync
   */
  public String getFederatedAsync() {
    return federatedAsync;
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
   * Gets the intraParallel.
   *
   * @return the intraParallel
   */
  public String getIntraParallel() {
    return intraParallel;
  }

  /**
   * Gets the keepfenced.
   *
   * @return the keepfenced
   */
  public String getKeepfenced() {
    return keepfenced;
  }

  /**
   * Gets the maxConnretries.
   *
   * @return the maxConnretries
   */
  public String getMaxConnretries() {
    return maxConnretries;
  }

  /**
   * Gets the maxQuerydegree.
   *
   * @return the maxQuerydegree
   */
  public String getMaxQuerydegree() {
    return maxQuerydegree;
  }

  /**
   * Gets the monHeapSz.
   *
   * @return the monHeapSz
   */
  public String getMonHeapSz() {
    return monHeapSz;
  }

  /**
   * Gets the multipartsizemb.
   *
   * @return the multipartsizemb
   */
  public String getMultipartsizemb() {
    return multipartsizemb;
  }

  /**
   * Gets the notifylevel.
   *
   * @return the notifylevel
   */
  public String getNotifylevel() {
    return notifylevel;
  }

  /**
   * Gets the numInitagents.
   *
   * @return the numInitagents
   */
  public String getNumInitagents() {
    return numInitagents;
  }

  /**
   * Gets the numInitfenced.
   *
   * @return the numInitfenced
   */
  public String getNumInitfenced() {
    return numInitfenced;
  }

  /**
   * Gets the numPoolagents.
   *
   * @return the numPoolagents
   */
  public String getNumPoolagents() {
    return numPoolagents;
  }

  /**
   * Gets the resyncInterval.
   *
   * @return the resyncInterval
   */
  public String getResyncInterval() {
    return resyncInterval;
  }

  /**
   * Gets the rqrioblk.
   *
   * @return the rqrioblk
   */
  public String getRqrioblk() {
    return rqrioblk;
  }

  /**
   * Gets the startStopTime.
   *
   * @return the startStopTime
   */
  public String getStartStopTime() {
    return startStopTime;
  }

  /**
   * Gets the utilImpactLim.
   *
   * @return the utilImpactLim
   */
  public String getUtilImpactLim() {
    return utilImpactLim;
  }

  /**
   * Gets the wlmDispatcher.
   *
   * @return the wlmDispatcher
   */
  public String getWlmDispatcher() {
    return wlmDispatcher;
  }

  /**
   * Gets the wlmDispConcur.
   *
   * @return the wlmDispConcur
   */
  public String getWlmDispConcur() {
    return wlmDispConcur;
  }

  /**
   * Gets the wlmDispCpuShares.
   *
   * @return the wlmDispCpuShares
   */
  public String getWlmDispCpuShares() {
    return wlmDispCpuShares;
  }

  /**
   * Gets the wlmDispMinUtil.
   *
   * @return the wlmDispMinUtil
   */
  public String getWlmDispMinUtil() {
    return wlmDispMinUtil;
  }
}

