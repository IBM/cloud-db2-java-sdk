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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The putDb2SaasAutoscale options.
 */
public class PutDb2SaasAutoscaleOptions extends GenericModel {

  /**
   * Indicates if automatic scaling is enabled or not.
   */
  public interface AutoScalingEnabled {
    /** true. */
    String X_TRUE = "true";
    /** false. */
    String X_FALSE = "false";
  }

  /**
   * Indicates the maximum number of scaling actions that are allowed within a specified time period.
   */
  public interface AutoScalingAllowPlanLimit {
    /** YES. */
    String YES = "YES";
    /** NO. */
    String NO = "NO";
  }

  protected String xDbProfile;
  protected String autoScalingEnabled;
  protected Long autoScalingThreshold;
  protected Double autoScalingOverTimePeriod;
  protected Long autoScalingPauseLimit;
  protected String autoScalingAllowPlanLimit;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDbProfile;
    private String autoScalingEnabled;
    private Long autoScalingThreshold;
    private Double autoScalingOverTimePeriod;
    private Long autoScalingPauseLimit;
    private String autoScalingAllowPlanLimit;

    /**
     * Instantiates a new Builder from an existing PutDb2SaasAutoscaleOptions instance.
     *
     * @param putDb2SaasAutoscaleOptions the instance to initialize the Builder with
     */
    private Builder(PutDb2SaasAutoscaleOptions putDb2SaasAutoscaleOptions) {
      this.xDbProfile = putDb2SaasAutoscaleOptions.xDbProfile;
      this.autoScalingEnabled = putDb2SaasAutoscaleOptions.autoScalingEnabled;
      this.autoScalingThreshold = putDb2SaasAutoscaleOptions.autoScalingThreshold;
      this.autoScalingOverTimePeriod = putDb2SaasAutoscaleOptions.autoScalingOverTimePeriod;
      this.autoScalingPauseLimit = putDb2SaasAutoscaleOptions.autoScalingPauseLimit;
      this.autoScalingAllowPlanLimit = putDb2SaasAutoscaleOptions.autoScalingAllowPlanLimit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param xDbProfile the xDbProfile
     */
    public Builder(String xDbProfile) {
      this.xDbProfile = xDbProfile;
    }

    /**
     * Builds a PutDb2SaasAutoscaleOptions.
     *
     * @return the new PutDb2SaasAutoscaleOptions instance
     */
    public PutDb2SaasAutoscaleOptions build() {
      return new PutDb2SaasAutoscaleOptions(this);
    }

    /**
     * Set the xDbProfile.
     *
     * @param xDbProfile the xDbProfile
     * @return the PutDb2SaasAutoscaleOptions builder
     */
    public Builder xDbProfile(String xDbProfile) {
      this.xDbProfile = xDbProfile;
      return this;
    }

    /**
     * Set the autoScalingEnabled.
     *
     * @param autoScalingEnabled the autoScalingEnabled
     * @return the PutDb2SaasAutoscaleOptions builder
     */
    public Builder autoScalingEnabled(String autoScalingEnabled) {
      this.autoScalingEnabled = autoScalingEnabled;
      return this;
    }

    /**
     * Set the autoScalingThreshold.
     *
     * @param autoScalingThreshold the autoScalingThreshold
     * @return the PutDb2SaasAutoscaleOptions builder
     */
    public Builder autoScalingThreshold(long autoScalingThreshold) {
      this.autoScalingThreshold = autoScalingThreshold;
      return this;
    }

    /**
     * Set the autoScalingOverTimePeriod.
     *
     * @param autoScalingOverTimePeriod the autoScalingOverTimePeriod
     * @return the PutDb2SaasAutoscaleOptions builder
     */
    public Builder autoScalingOverTimePeriod(Double autoScalingOverTimePeriod) {
      this.autoScalingOverTimePeriod = autoScalingOverTimePeriod;
      return this;
    }

    /**
     * Set the autoScalingPauseLimit.
     *
     * @param autoScalingPauseLimit the autoScalingPauseLimit
     * @return the PutDb2SaasAutoscaleOptions builder
     */
    public Builder autoScalingPauseLimit(long autoScalingPauseLimit) {
      this.autoScalingPauseLimit = autoScalingPauseLimit;
      return this;
    }

    /**
     * Set the autoScalingAllowPlanLimit.
     *
     * @param autoScalingAllowPlanLimit the autoScalingAllowPlanLimit
     * @return the PutDb2SaasAutoscaleOptions builder
     */
    public Builder autoScalingAllowPlanLimit(String autoScalingAllowPlanLimit) {
      this.autoScalingAllowPlanLimit = autoScalingAllowPlanLimit;
      return this;
    }
  }

  protected PutDb2SaasAutoscaleOptions() { }

  protected PutDb2SaasAutoscaleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDbProfile,
      "xDbProfile cannot be null");
    xDbProfile = builder.xDbProfile;
    autoScalingEnabled = builder.autoScalingEnabled;
    autoScalingThreshold = builder.autoScalingThreshold;
    autoScalingOverTimePeriod = builder.autoScalingOverTimePeriod;
    autoScalingPauseLimit = builder.autoScalingPauseLimit;
    autoScalingAllowPlanLimit = builder.autoScalingAllowPlanLimit;
  }

  /**
   * New builder.
   *
   * @return a PutDb2SaasAutoscaleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDbProfile.
   *
   * Encoded CRN deployment id.
   *
   * @return the xDbProfile
   */
  public String xDbProfile() {
    return xDbProfile;
  }

  /**
   * Gets the autoScalingEnabled.
   *
   * Indicates if automatic scaling is enabled or not.
   *
   * @return the autoScalingEnabled
   */
  public String autoScalingEnabled() {
    return autoScalingEnabled;
  }

  /**
   * Gets the autoScalingThreshold.
   *
   * Specifies the resource utilization level that triggers an auto-scaling.
   *
   * @return the autoScalingThreshold
   */
  public Long autoScalingThreshold() {
    return autoScalingThreshold;
  }

  /**
   * Gets the autoScalingOverTimePeriod.
   *
   * Defines the time period over which auto-scaling adjustments are monitored and applied.
   *
   * @return the autoScalingOverTimePeriod
   */
  public Double autoScalingOverTimePeriod() {
    return autoScalingOverTimePeriod;
  }

  /**
   * Gets the autoScalingPauseLimit.
   *
   * Specifies the duration to pause auto-scaling actions after a scaling event has occurred.
   *
   * @return the autoScalingPauseLimit
   */
  public Long autoScalingPauseLimit() {
    return autoScalingPauseLimit;
  }

  /**
   * Gets the autoScalingAllowPlanLimit.
   *
   * Indicates the maximum number of scaling actions that are allowed within a specified time period.
   *
   * @return the autoScalingAllowPlanLimit
   */
  public String autoScalingAllowPlanLimit() {
    return autoScalingAllowPlanLimit;
  }
}

