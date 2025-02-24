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
 * Tunable parameters related to the Db2 registry.
 */
public class SuccessTuneableParamsTuneableParamRegistry extends GenericModel {

  @SerializedName("DB2BIDI")
  protected String dB2Bidi;
  @SerializedName("DB2COMPOPT")
  protected String dB2Compopt;
  @SerializedName("DB2LOCK_TO_RB")
  protected String dB2LockToRb;
  @SerializedName("DB2STMM")
  protected String dB2Stmm;
  @SerializedName("DB2_ALTERNATE_AUTHZ_BEHAVIOUR")
  protected String dB2AlternateAuthzBehaviour;
  @SerializedName("DB2_ANTIJOIN")
  protected String dB2Antijoin;
  @SerializedName("DB2_ATS_ENABLE")
  protected String dB2AtsEnable;
  @SerializedName("DB2_DEFERRED_PREPARE_SEMANTICS")
  protected String dB2DeferredPrepareSemantics;
  @SerializedName("DB2_EVALUNCOMMITTED")
  protected String dB2Evaluncommitted;
  @SerializedName("DB2_EXTENDED_OPTIMIZATION")
  protected String dB2ExtendedOptimization;
  @SerializedName("DB2_INDEX_PCTFREE_DEFAULT")
  protected String dB2IndexPctfreeDefault;
  @SerializedName("DB2_INLIST_TO_NLJN")
  protected String dB2InlistToNljn;
  @SerializedName("DB2_MINIMIZE_LISTPREFETCH")
  protected String dB2MinimizeListprefetch;
  @SerializedName("DB2_OBJECT_TABLE_ENTRIES")
  protected String dB2ObjectTableEntries;
  @SerializedName("DB2_OPTPROFILE")
  protected String dB2Optprofile;
  @SerializedName("DB2_OPTSTATS_LOG")
  protected String dB2OptstatsLog;
  @SerializedName("DB2_OPT_MAX_TEMP_SIZE")
  protected String dB2OptMaxTempSize;
  @SerializedName("DB2_PARALLEL_IO")
  protected String dB2ParallelIo;
  @SerializedName("DB2_REDUCED_OPTIMIZATION")
  protected String dB2ReducedOptimization;
  @SerializedName("DB2_SELECTIVITY")
  protected String dB2Selectivity;
  @SerializedName("DB2_SKIPDELETED")
  protected String dB2Skipdeleted;
  @SerializedName("DB2_SKIPINSERTED")
  protected String dB2Skipinserted;
  @SerializedName("DB2_SYNC_RELEASE_LOCK_ATTRIBUTES")
  protected String dB2SyncReleaseLockAttributes;
  @SerializedName("DB2_TRUNCATE_REUSESTORAGE")
  protected String dB2TruncateReusestorage;
  @SerializedName("DB2_USE_ALTERNATE_PAGE_CLEANING")
  protected String dB2UseAlternatePageCleaning;
  @SerializedName("DB2_VIEW_REOPT_VALUES")
  protected String dB2ViewReoptValues;
  @SerializedName("DB2_WLM_SETTINGS")
  protected String dB2WlmSettings;
  @SerializedName("DB2_WORKLOAD")
  protected String dB2Workload;

  protected SuccessTuneableParamsTuneableParamRegistry() { }

  /**
   * Gets the dB2Bidi.
   *
   * @return the dB2Bidi
   */
  public String getDB2Bidi() {
    return dB2Bidi;
  }

  /**
   * Gets the dB2Compopt.
   *
   * @return the dB2Compopt
   */
  public String getDB2Compopt() {
    return dB2Compopt;
  }

  /**
   * Gets the dB2LockToRb.
   *
   * @return the dB2LockToRb
   */
  public String getDB2LockToRb() {
    return dB2LockToRb;
  }

  /**
   * Gets the dB2Stmm.
   *
   * @return the dB2Stmm
   */
  public String getDB2Stmm() {
    return dB2Stmm;
  }

  /**
   * Gets the dB2AlternateAuthzBehaviour.
   *
   * @return the dB2AlternateAuthzBehaviour
   */
  public String getDB2AlternateAuthzBehaviour() {
    return dB2AlternateAuthzBehaviour;
  }

  /**
   * Gets the dB2Antijoin.
   *
   * @return the dB2Antijoin
   */
  public String getDB2Antijoin() {
    return dB2Antijoin;
  }

  /**
   * Gets the dB2AtsEnable.
   *
   * @return the dB2AtsEnable
   */
  public String getDB2AtsEnable() {
    return dB2AtsEnable;
  }

  /**
   * Gets the dB2DeferredPrepareSemantics.
   *
   * @return the dB2DeferredPrepareSemantics
   */
  public String getDB2DeferredPrepareSemantics() {
    return dB2DeferredPrepareSemantics;
  }

  /**
   * Gets the dB2Evaluncommitted.
   *
   * @return the dB2Evaluncommitted
   */
  public String getDB2Evaluncommitted() {
    return dB2Evaluncommitted;
  }

  /**
   * Gets the dB2ExtendedOptimization.
   *
   * @return the dB2ExtendedOptimization
   */
  public String getDB2ExtendedOptimization() {
    return dB2ExtendedOptimization;
  }

  /**
   * Gets the dB2IndexPctfreeDefault.
   *
   * @return the dB2IndexPctfreeDefault
   */
  public String getDB2IndexPctfreeDefault() {
    return dB2IndexPctfreeDefault;
  }

  /**
   * Gets the dB2InlistToNljn.
   *
   * @return the dB2InlistToNljn
   */
  public String getDB2InlistToNljn() {
    return dB2InlistToNljn;
  }

  /**
   * Gets the dB2MinimizeListprefetch.
   *
   * @return the dB2MinimizeListprefetch
   */
  public String getDB2MinimizeListprefetch() {
    return dB2MinimizeListprefetch;
  }

  /**
   * Gets the dB2ObjectTableEntries.
   *
   * @return the dB2ObjectTableEntries
   */
  public String getDB2ObjectTableEntries() {
    return dB2ObjectTableEntries;
  }

  /**
   * Gets the dB2Optprofile.
   *
   * @return the dB2Optprofile
   */
  public String getDB2Optprofile() {
    return dB2Optprofile;
  }

  /**
   * Gets the dB2OptstatsLog.
   *
   * @return the dB2OptstatsLog
   */
  public String getDB2OptstatsLog() {
    return dB2OptstatsLog;
  }

  /**
   * Gets the dB2OptMaxTempSize.
   *
   * @return the dB2OptMaxTempSize
   */
  public String getDB2OptMaxTempSize() {
    return dB2OptMaxTempSize;
  }

  /**
   * Gets the dB2ParallelIo.
   *
   * @return the dB2ParallelIo
   */
  public String getDB2ParallelIo() {
    return dB2ParallelIo;
  }

  /**
   * Gets the dB2ReducedOptimization.
   *
   * @return the dB2ReducedOptimization
   */
  public String getDB2ReducedOptimization() {
    return dB2ReducedOptimization;
  }

  /**
   * Gets the dB2Selectivity.
   *
   * @return the dB2Selectivity
   */
  public String getDB2Selectivity() {
    return dB2Selectivity;
  }

  /**
   * Gets the dB2Skipdeleted.
   *
   * @return the dB2Skipdeleted
   */
  public String getDB2Skipdeleted() {
    return dB2Skipdeleted;
  }

  /**
   * Gets the dB2Skipinserted.
   *
   * @return the dB2Skipinserted
   */
  public String getDB2Skipinserted() {
    return dB2Skipinserted;
  }

  /**
   * Gets the dB2SyncReleaseLockAttributes.
   *
   * @return the dB2SyncReleaseLockAttributes
   */
  public String getDB2SyncReleaseLockAttributes() {
    return dB2SyncReleaseLockAttributes;
  }

  /**
   * Gets the dB2TruncateReusestorage.
   *
   * @return the dB2TruncateReusestorage
   */
  public String getDB2TruncateReusestorage() {
    return dB2TruncateReusestorage;
  }

  /**
   * Gets the dB2UseAlternatePageCleaning.
   *
   * @return the dB2UseAlternatePageCleaning
   */
  public String getDB2UseAlternatePageCleaning() {
    return dB2UseAlternatePageCleaning;
  }

  /**
   * Gets the dB2ViewReoptValues.
   *
   * @return the dB2ViewReoptValues
   */
  public String getDB2ViewReoptValues() {
    return dB2ViewReoptValues;
  }

  /**
   * Gets the dB2WlmSettings.
   *
   * @return the dB2WlmSettings
   */
  public String getDB2WlmSettings() {
    return dB2WlmSettings;
  }

  /**
   * Gets the dB2Workload.
   *
   * @return the dB2Workload
   */
  public String getDB2Workload() {
    return dB2Workload;
  }
}

