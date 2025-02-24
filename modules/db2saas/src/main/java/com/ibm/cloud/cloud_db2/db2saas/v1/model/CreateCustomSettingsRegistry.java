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
 * registry for db2 related configuration settings/configurations.
 */
public class CreateCustomSettingsRegistry extends GenericModel {

  /**
   * Configures the bidi (bidirectional) support for DB2.
   */
  public interface DB2Bidi {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures the DB2 lock timeout behavior.
   */
  public interface DB2LockToRb {
    /** STATEMENT. */
    String STATEMENT = "STATEMENT";
  }

  /**
   * Configures whether DB2's self-tuning memory manager (STMM) is enabled.
   */
  public interface DB2Stmm {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures the alternate authorization behavior for DB2.
   */
  public interface DB2AlternateAuthzBehaviour {
    /** EXTERNAL_ROUTINE_DBADM. */
    String EXTERNAL_ROUTINE_DBADM = "EXTERNAL_ROUTINE_DBADM";
    /** EXTERNAL_ROUTINE_DBAUTH. */
    String EXTERNAL_ROUTINE_DBAUTH = "EXTERNAL_ROUTINE_DBAUTH";
  }

  /**
   * Configures how DB2 handles anti-joins.
   */
  public interface DB2Antijoin {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
    /** EXTEND. */
    String EXTEND = "EXTEND";
  }

  /**
   * Configures whether DB2 asynchronous table scanning (ATS) is enabled.
   */
  public interface DB2AtsEnable {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  /**
   * Configures whether deferred prepare semantics are enabled in DB2.
   */
  public interface DB2DeferredPrepareSemantics {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures whether uncommitted data is evaluated by DB2.
   */
  public interface DB2Evaluncommitted {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures the default percentage of free space for DB2 indexes.
   */
  public interface DB2IndexPctfreeDefault {
    /** range(0, 99). */
    String RANGE_0_99 = "range(0, 99)";
  }

  /**
   * Configures whether in-list queries are converted to nested loop joins.
   */
  public interface DB2InlistToNljn {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures whether DB2 minimizes list prefetching for queries.
   */
  public interface DB2MinimizeListprefetch {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures the number of entries for DB2 object tables.
   */
  public interface DB2ObjectTableEntries {
    /** range(0, 65532). */
    String RANGE_0_65532 = "range(0, 65532)";
  }

  /**
   * Configures whether DB2's optimizer profile is enabled.
   */
  public interface DB2Optprofile {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures the selectivity behavior for DB2 queries.
   */
  public interface DB2Selectivity {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
    /** ALL. */
    String ALL = "ALL";
  }

  /**
   * Configures whether DB2 skips deleted rows during query processing.
   */
  public interface DB2Skipdeleted {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures whether DB2 skips inserted rows during query processing.
   */
  public interface DB2Skipinserted {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures whether DB2 synchronizes lock release attributes.
   */
  public interface DB2SyncReleaseLockAttributes {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures the types of operations that reuse storage after truncation.
   */
  public interface DB2TruncateReusestorage {
    /** IMPORT. */
    String X_IMPORT = "IMPORT";
    /** LOAD. */
    String LOAD = "LOAD";
    /** TRUNCATE. */
    String TRUNCATE = "TRUNCATE";
  }

  /**
   * Configures whether DB2 uses alternate page cleaning methods.
   */
  public interface DB2UseAlternatePageCleaning {
    /** ON. */
    String ON = "ON";
    /** OFF. */
    String OFF = "OFF";
  }

  /**
   * Configures whether DB2 view reoptimization values are used.
   */
  public interface DB2ViewReoptValues {
    /** NO. */
    String NO = "NO";
    /** YES. */
    String YES = "YES";
  }

  /**
   * Configures the DB2 workload type.
   */
  public interface DB2Workload {
    /** ANALYTICS. */
    String ANALYTICS = "ANALYTICS";
    /** CM. */
    String CM = "CM";
    /** COGNOS_CS. */
    String COGNOS_CS = "COGNOS_CS";
    /** FILENET_CM. */
    String FILENET_CM = "FILENET_CM";
    /** INFOR_ERP_LN. */
    String INFOR_ERP_LN = "INFOR_ERP_LN";
    /** MAXIMO. */
    String MAXIMO = "MAXIMO";
    /** MDM. */
    String MDM = "MDM";
    /** SAP. */
    String SAP = "SAP";
    /** TPM. */
    String TPM = "TPM";
    /** WAS. */
    String WAS = "WAS";
    /** WC. */
    String WC = "WC";
    /** WP. */
    String WP = "WP";
  }

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

  /**
   * Builder.
   */
  public static class Builder {
    private String dB2Bidi;
    private String dB2Compopt;
    private String dB2LockToRb;
    private String dB2Stmm;
    private String dB2AlternateAuthzBehaviour;
    private String dB2Antijoin;
    private String dB2AtsEnable;
    private String dB2DeferredPrepareSemantics;
    private String dB2Evaluncommitted;
    private String dB2ExtendedOptimization;
    private String dB2IndexPctfreeDefault;
    private String dB2InlistToNljn;
    private String dB2MinimizeListprefetch;
    private String dB2ObjectTableEntries;
    private String dB2Optprofile;
    private String dB2OptstatsLog;
    private String dB2OptMaxTempSize;
    private String dB2ParallelIo;
    private String dB2ReducedOptimization;
    private String dB2Selectivity;
    private String dB2Skipdeleted;
    private String dB2Skipinserted;
    private String dB2SyncReleaseLockAttributes;
    private String dB2TruncateReusestorage;
    private String dB2UseAlternatePageCleaning;
    private String dB2ViewReoptValues;
    private String dB2WlmSettings;
    private String dB2Workload;

    /**
     * Instantiates a new Builder from an existing CreateCustomSettingsRegistry instance.
     *
     * @param createCustomSettingsRegistry the instance to initialize the Builder with
     */
    private Builder(CreateCustomSettingsRegistry createCustomSettingsRegistry) {
      this.dB2Bidi = createCustomSettingsRegistry.dB2Bidi;
      this.dB2Compopt = createCustomSettingsRegistry.dB2Compopt;
      this.dB2LockToRb = createCustomSettingsRegistry.dB2LockToRb;
      this.dB2Stmm = createCustomSettingsRegistry.dB2Stmm;
      this.dB2AlternateAuthzBehaviour = createCustomSettingsRegistry.dB2AlternateAuthzBehaviour;
      this.dB2Antijoin = createCustomSettingsRegistry.dB2Antijoin;
      this.dB2AtsEnable = createCustomSettingsRegistry.dB2AtsEnable;
      this.dB2DeferredPrepareSemantics = createCustomSettingsRegistry.dB2DeferredPrepareSemantics;
      this.dB2Evaluncommitted = createCustomSettingsRegistry.dB2Evaluncommitted;
      this.dB2ExtendedOptimization = createCustomSettingsRegistry.dB2ExtendedOptimization;
      this.dB2IndexPctfreeDefault = createCustomSettingsRegistry.dB2IndexPctfreeDefault;
      this.dB2InlistToNljn = createCustomSettingsRegistry.dB2InlistToNljn;
      this.dB2MinimizeListprefetch = createCustomSettingsRegistry.dB2MinimizeListprefetch;
      this.dB2ObjectTableEntries = createCustomSettingsRegistry.dB2ObjectTableEntries;
      this.dB2Optprofile = createCustomSettingsRegistry.dB2Optprofile;
      this.dB2OptstatsLog = createCustomSettingsRegistry.dB2OptstatsLog;
      this.dB2OptMaxTempSize = createCustomSettingsRegistry.dB2OptMaxTempSize;
      this.dB2ParallelIo = createCustomSettingsRegistry.dB2ParallelIo;
      this.dB2ReducedOptimization = createCustomSettingsRegistry.dB2ReducedOptimization;
      this.dB2Selectivity = createCustomSettingsRegistry.dB2Selectivity;
      this.dB2Skipdeleted = createCustomSettingsRegistry.dB2Skipdeleted;
      this.dB2Skipinserted = createCustomSettingsRegistry.dB2Skipinserted;
      this.dB2SyncReleaseLockAttributes = createCustomSettingsRegistry.dB2SyncReleaseLockAttributes;
      this.dB2TruncateReusestorage = createCustomSettingsRegistry.dB2TruncateReusestorage;
      this.dB2UseAlternatePageCleaning = createCustomSettingsRegistry.dB2UseAlternatePageCleaning;
      this.dB2ViewReoptValues = createCustomSettingsRegistry.dB2ViewReoptValues;
      this.dB2WlmSettings = createCustomSettingsRegistry.dB2WlmSettings;
      this.dB2Workload = createCustomSettingsRegistry.dB2Workload;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateCustomSettingsRegistry.
     *
     * @return the new CreateCustomSettingsRegistry instance
     */
    public CreateCustomSettingsRegistry build() {
      return new CreateCustomSettingsRegistry(this);
    }

    /**
     * Set the dB2Bidi.
     *
     * @param dB2Bidi the dB2Bidi
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Bidi(String dB2Bidi) {
      this.dB2Bidi = dB2Bidi;
      return this;
    }

    /**
     * Set the dB2Compopt.
     *
     * @param dB2Compopt the dB2Compopt
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Compopt(String dB2Compopt) {
      this.dB2Compopt = dB2Compopt;
      return this;
    }

    /**
     * Set the dB2LockToRb.
     *
     * @param dB2LockToRb the dB2LockToRb
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2LockToRb(String dB2LockToRb) {
      this.dB2LockToRb = dB2LockToRb;
      return this;
    }

    /**
     * Set the dB2Stmm.
     *
     * @param dB2Stmm the dB2Stmm
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Stmm(String dB2Stmm) {
      this.dB2Stmm = dB2Stmm;
      return this;
    }

    /**
     * Set the dB2AlternateAuthzBehaviour.
     *
     * @param dB2AlternateAuthzBehaviour the dB2AlternateAuthzBehaviour
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2AlternateAuthzBehaviour(String dB2AlternateAuthzBehaviour) {
      this.dB2AlternateAuthzBehaviour = dB2AlternateAuthzBehaviour;
      return this;
    }

    /**
     * Set the dB2Antijoin.
     *
     * @param dB2Antijoin the dB2Antijoin
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Antijoin(String dB2Antijoin) {
      this.dB2Antijoin = dB2Antijoin;
      return this;
    }

    /**
     * Set the dB2AtsEnable.
     *
     * @param dB2AtsEnable the dB2AtsEnable
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2AtsEnable(String dB2AtsEnable) {
      this.dB2AtsEnable = dB2AtsEnable;
      return this;
    }

    /**
     * Set the dB2DeferredPrepareSemantics.
     *
     * @param dB2DeferredPrepareSemantics the dB2DeferredPrepareSemantics
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2DeferredPrepareSemantics(String dB2DeferredPrepareSemantics) {
      this.dB2DeferredPrepareSemantics = dB2DeferredPrepareSemantics;
      return this;
    }

    /**
     * Set the dB2Evaluncommitted.
     *
     * @param dB2Evaluncommitted the dB2Evaluncommitted
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Evaluncommitted(String dB2Evaluncommitted) {
      this.dB2Evaluncommitted = dB2Evaluncommitted;
      return this;
    }

    /**
     * Set the dB2ExtendedOptimization.
     *
     * @param dB2ExtendedOptimization the dB2ExtendedOptimization
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2ExtendedOptimization(String dB2ExtendedOptimization) {
      this.dB2ExtendedOptimization = dB2ExtendedOptimization;
      return this;
    }

    /**
     * Set the dB2IndexPctfreeDefault.
     *
     * @param dB2IndexPctfreeDefault the dB2IndexPctfreeDefault
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2IndexPctfreeDefault(String dB2IndexPctfreeDefault) {
      this.dB2IndexPctfreeDefault = dB2IndexPctfreeDefault;
      return this;
    }

    /**
     * Set the dB2InlistToNljn.
     *
     * @param dB2InlistToNljn the dB2InlistToNljn
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2InlistToNljn(String dB2InlistToNljn) {
      this.dB2InlistToNljn = dB2InlistToNljn;
      return this;
    }

    /**
     * Set the dB2MinimizeListprefetch.
     *
     * @param dB2MinimizeListprefetch the dB2MinimizeListprefetch
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2MinimizeListprefetch(String dB2MinimizeListprefetch) {
      this.dB2MinimizeListprefetch = dB2MinimizeListprefetch;
      return this;
    }

    /**
     * Set the dB2ObjectTableEntries.
     *
     * @param dB2ObjectTableEntries the dB2ObjectTableEntries
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2ObjectTableEntries(String dB2ObjectTableEntries) {
      this.dB2ObjectTableEntries = dB2ObjectTableEntries;
      return this;
    }

    /**
     * Set the dB2Optprofile.
     *
     * @param dB2Optprofile the dB2Optprofile
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Optprofile(String dB2Optprofile) {
      this.dB2Optprofile = dB2Optprofile;
      return this;
    }

    /**
     * Set the dB2OptstatsLog.
     *
     * @param dB2OptstatsLog the dB2OptstatsLog
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2OptstatsLog(String dB2OptstatsLog) {
      this.dB2OptstatsLog = dB2OptstatsLog;
      return this;
    }

    /**
     * Set the dB2OptMaxTempSize.
     *
     * @param dB2OptMaxTempSize the dB2OptMaxTempSize
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2OptMaxTempSize(String dB2OptMaxTempSize) {
      this.dB2OptMaxTempSize = dB2OptMaxTempSize;
      return this;
    }

    /**
     * Set the dB2ParallelIo.
     *
     * @param dB2ParallelIo the dB2ParallelIo
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2ParallelIo(String dB2ParallelIo) {
      this.dB2ParallelIo = dB2ParallelIo;
      return this;
    }

    /**
     * Set the dB2ReducedOptimization.
     *
     * @param dB2ReducedOptimization the dB2ReducedOptimization
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2ReducedOptimization(String dB2ReducedOptimization) {
      this.dB2ReducedOptimization = dB2ReducedOptimization;
      return this;
    }

    /**
     * Set the dB2Selectivity.
     *
     * @param dB2Selectivity the dB2Selectivity
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Selectivity(String dB2Selectivity) {
      this.dB2Selectivity = dB2Selectivity;
      return this;
    }

    /**
     * Set the dB2Skipdeleted.
     *
     * @param dB2Skipdeleted the dB2Skipdeleted
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Skipdeleted(String dB2Skipdeleted) {
      this.dB2Skipdeleted = dB2Skipdeleted;
      return this;
    }

    /**
     * Set the dB2Skipinserted.
     *
     * @param dB2Skipinserted the dB2Skipinserted
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Skipinserted(String dB2Skipinserted) {
      this.dB2Skipinserted = dB2Skipinserted;
      return this;
    }

    /**
     * Set the dB2SyncReleaseLockAttributes.
     *
     * @param dB2SyncReleaseLockAttributes the dB2SyncReleaseLockAttributes
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2SyncReleaseLockAttributes(String dB2SyncReleaseLockAttributes) {
      this.dB2SyncReleaseLockAttributes = dB2SyncReleaseLockAttributes;
      return this;
    }

    /**
     * Set the dB2TruncateReusestorage.
     *
     * @param dB2TruncateReusestorage the dB2TruncateReusestorage
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2TruncateReusestorage(String dB2TruncateReusestorage) {
      this.dB2TruncateReusestorage = dB2TruncateReusestorage;
      return this;
    }

    /**
     * Set the dB2UseAlternatePageCleaning.
     *
     * @param dB2UseAlternatePageCleaning the dB2UseAlternatePageCleaning
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2UseAlternatePageCleaning(String dB2UseAlternatePageCleaning) {
      this.dB2UseAlternatePageCleaning = dB2UseAlternatePageCleaning;
      return this;
    }

    /**
     * Set the dB2ViewReoptValues.
     *
     * @param dB2ViewReoptValues the dB2ViewReoptValues
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2ViewReoptValues(String dB2ViewReoptValues) {
      this.dB2ViewReoptValues = dB2ViewReoptValues;
      return this;
    }

    /**
     * Set the dB2WlmSettings.
     *
     * @param dB2WlmSettings the dB2WlmSettings
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2WlmSettings(String dB2WlmSettings) {
      this.dB2WlmSettings = dB2WlmSettings;
      return this;
    }

    /**
     * Set the dB2Workload.
     *
     * @param dB2Workload the dB2Workload
     * @return the CreateCustomSettingsRegistry builder
     */
    public Builder dB2Workload(String dB2Workload) {
      this.dB2Workload = dB2Workload;
      return this;
    }
  }

  protected CreateCustomSettingsRegistry() { }

  protected CreateCustomSettingsRegistry(Builder builder) {
    dB2Bidi = builder.dB2Bidi;
    dB2Compopt = builder.dB2Compopt;
    dB2LockToRb = builder.dB2LockToRb;
    dB2Stmm = builder.dB2Stmm;
    dB2AlternateAuthzBehaviour = builder.dB2AlternateAuthzBehaviour;
    dB2Antijoin = builder.dB2Antijoin;
    dB2AtsEnable = builder.dB2AtsEnable;
    dB2DeferredPrepareSemantics = builder.dB2DeferredPrepareSemantics;
    dB2Evaluncommitted = builder.dB2Evaluncommitted;
    dB2ExtendedOptimization = builder.dB2ExtendedOptimization;
    dB2IndexPctfreeDefault = builder.dB2IndexPctfreeDefault;
    dB2InlistToNljn = builder.dB2InlistToNljn;
    dB2MinimizeListprefetch = builder.dB2MinimizeListprefetch;
    dB2ObjectTableEntries = builder.dB2ObjectTableEntries;
    dB2Optprofile = builder.dB2Optprofile;
    dB2OptstatsLog = builder.dB2OptstatsLog;
    dB2OptMaxTempSize = builder.dB2OptMaxTempSize;
    dB2ParallelIo = builder.dB2ParallelIo;
    dB2ReducedOptimization = builder.dB2ReducedOptimization;
    dB2Selectivity = builder.dB2Selectivity;
    dB2Skipdeleted = builder.dB2Skipdeleted;
    dB2Skipinserted = builder.dB2Skipinserted;
    dB2SyncReleaseLockAttributes = builder.dB2SyncReleaseLockAttributes;
    dB2TruncateReusestorage = builder.dB2TruncateReusestorage;
    dB2UseAlternatePageCleaning = builder.dB2UseAlternatePageCleaning;
    dB2ViewReoptValues = builder.dB2ViewReoptValues;
    dB2WlmSettings = builder.dB2WlmSettings;
    dB2Workload = builder.dB2Workload;
  }

  /**
   * New builder.
   *
   * @return a CreateCustomSettingsRegistry builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dB2Bidi.
   *
   * Configures the bidi (bidirectional) support for DB2.
   *
   * @return the dB2Bidi
   */
  public String dB2Bidi() {
    return dB2Bidi;
  }

  /**
   * Gets the dB2Compopt.
   *
   * Configures the DB2 component options (not specified in values).
   *
   * @return the dB2Compopt
   */
  public String dB2Compopt() {
    return dB2Compopt;
  }

  /**
   * Gets the dB2LockToRb.
   *
   * Configures the DB2 lock timeout behavior.
   *
   * @return the dB2LockToRb
   */
  public String dB2LockToRb() {
    return dB2LockToRb;
  }

  /**
   * Gets the dB2Stmm.
   *
   * Configures whether DB2's self-tuning memory manager (STMM) is enabled.
   *
   * @return the dB2Stmm
   */
  public String dB2Stmm() {
    return dB2Stmm;
  }

  /**
   * Gets the dB2AlternateAuthzBehaviour.
   *
   * Configures the alternate authorization behavior for DB2.
   *
   * @return the dB2AlternateAuthzBehaviour
   */
  public String dB2AlternateAuthzBehaviour() {
    return dB2AlternateAuthzBehaviour;
  }

  /**
   * Gets the dB2Antijoin.
   *
   * Configures how DB2 handles anti-joins.
   *
   * @return the dB2Antijoin
   */
  public String dB2Antijoin() {
    return dB2Antijoin;
  }

  /**
   * Gets the dB2AtsEnable.
   *
   * Configures whether DB2 asynchronous table scanning (ATS) is enabled.
   *
   * @return the dB2AtsEnable
   */
  public String dB2AtsEnable() {
    return dB2AtsEnable;
  }

  /**
   * Gets the dB2DeferredPrepareSemantics.
   *
   * Configures whether deferred prepare semantics are enabled in DB2.
   *
   * @return the dB2DeferredPrepareSemantics
   */
  public String dB2DeferredPrepareSemantics() {
    return dB2DeferredPrepareSemantics;
  }

  /**
   * Gets the dB2Evaluncommitted.
   *
   * Configures whether uncommitted data is evaluated by DB2.
   *
   * @return the dB2Evaluncommitted
   */
  public String dB2Evaluncommitted() {
    return dB2Evaluncommitted;
  }

  /**
   * Gets the dB2ExtendedOptimization.
   *
   * Configures extended optimization in DB2 (not specified in values).
   *
   * @return the dB2ExtendedOptimization
   */
  public String dB2ExtendedOptimization() {
    return dB2ExtendedOptimization;
  }

  /**
   * Gets the dB2IndexPctfreeDefault.
   *
   * Configures the default percentage of free space for DB2 indexes.
   *
   * @return the dB2IndexPctfreeDefault
   */
  public String dB2IndexPctfreeDefault() {
    return dB2IndexPctfreeDefault;
  }

  /**
   * Gets the dB2InlistToNljn.
   *
   * Configures whether in-list queries are converted to nested loop joins.
   *
   * @return the dB2InlistToNljn
   */
  public String dB2InlistToNljn() {
    return dB2InlistToNljn;
  }

  /**
   * Gets the dB2MinimizeListprefetch.
   *
   * Configures whether DB2 minimizes list prefetching for queries.
   *
   * @return the dB2MinimizeListprefetch
   */
  public String dB2MinimizeListprefetch() {
    return dB2MinimizeListprefetch;
  }

  /**
   * Gets the dB2ObjectTableEntries.
   *
   * Configures the number of entries for DB2 object tables.
   *
   * @return the dB2ObjectTableEntries
   */
  public String dB2ObjectTableEntries() {
    return dB2ObjectTableEntries;
  }

  /**
   * Gets the dB2Optprofile.
   *
   * Configures whether DB2's optimizer profile is enabled.
   *
   * @return the dB2Optprofile
   */
  public String dB2Optprofile() {
    return dB2Optprofile;
  }

  /**
   * Gets the dB2OptstatsLog.
   *
   * Configures the logging of optimizer statistics (not specified in values).
   *
   * @return the dB2OptstatsLog
   */
  public String dB2OptstatsLog() {
    return dB2OptstatsLog;
  }

  /**
   * Gets the dB2OptMaxTempSize.
   *
   * Configures the maximum temporary space size for DB2 optimizer.
   *
   * @return the dB2OptMaxTempSize
   */
  public String dB2OptMaxTempSize() {
    return dB2OptMaxTempSize;
  }

  /**
   * Gets the dB2ParallelIo.
   *
   * Configures parallel I/O behavior in DB2 (not specified in values).
   *
   * @return the dB2ParallelIo
   */
  public String dB2ParallelIo() {
    return dB2ParallelIo;
  }

  /**
   * Gets the dB2ReducedOptimization.
   *
   * Configures whether reduced optimization is applied in DB2 (not specified in values).
   *
   * @return the dB2ReducedOptimization
   */
  public String dB2ReducedOptimization() {
    return dB2ReducedOptimization;
  }

  /**
   * Gets the dB2Selectivity.
   *
   * Configures the selectivity behavior for DB2 queries.
   *
   * @return the dB2Selectivity
   */
  public String dB2Selectivity() {
    return dB2Selectivity;
  }

  /**
   * Gets the dB2Skipdeleted.
   *
   * Configures whether DB2 skips deleted rows during query processing.
   *
   * @return the dB2Skipdeleted
   */
  public String dB2Skipdeleted() {
    return dB2Skipdeleted;
  }

  /**
   * Gets the dB2Skipinserted.
   *
   * Configures whether DB2 skips inserted rows during query processing.
   *
   * @return the dB2Skipinserted
   */
  public String dB2Skipinserted() {
    return dB2Skipinserted;
  }

  /**
   * Gets the dB2SyncReleaseLockAttributes.
   *
   * Configures whether DB2 synchronizes lock release attributes.
   *
   * @return the dB2SyncReleaseLockAttributes
   */
  public String dB2SyncReleaseLockAttributes() {
    return dB2SyncReleaseLockAttributes;
  }

  /**
   * Gets the dB2TruncateReusestorage.
   *
   * Configures the types of operations that reuse storage after truncation.
   *
   * @return the dB2TruncateReusestorage
   */
  public String dB2TruncateReusestorage() {
    return dB2TruncateReusestorage;
  }

  /**
   * Gets the dB2UseAlternatePageCleaning.
   *
   * Configures whether DB2 uses alternate page cleaning methods.
   *
   * @return the dB2UseAlternatePageCleaning
   */
  public String dB2UseAlternatePageCleaning() {
    return dB2UseAlternatePageCleaning;
  }

  /**
   * Gets the dB2ViewReoptValues.
   *
   * Configures whether DB2 view reoptimization values are used.
   *
   * @return the dB2ViewReoptValues
   */
  public String dB2ViewReoptValues() {
    return dB2ViewReoptValues;
  }

  /**
   * Gets the dB2WlmSettings.
   *
   * Configures the WLM (Workload Management) settings for DB2 (not specified in values).
   *
   * @return the dB2WlmSettings
   */
  public String dB2WlmSettings() {
    return dB2WlmSettings;
  }

  /**
   * Gets the dB2Workload.
   *
   * Configures the DB2 workload type.
   *
   * @return the dB2Workload
   */
  public String dB2Workload() {
    return dB2Workload;
  }
}

