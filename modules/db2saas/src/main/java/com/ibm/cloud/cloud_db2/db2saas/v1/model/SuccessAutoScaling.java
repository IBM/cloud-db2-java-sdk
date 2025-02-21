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
 * The details of the autoscale.
 */
public class SuccessAutoScaling extends GenericModel {

  @SerializedName("auto_scaling_allow_plan_limit")
  protected Boolean autoScalingAllowPlanLimit;
  @SerializedName("auto_scaling_enabled")
  protected Boolean autoScalingEnabled;
  @SerializedName("auto_scaling_max_storage")
  protected Long autoScalingMaxStorage;
  @SerializedName("auto_scaling_over_time_period")
  protected Long autoScalingOverTimePeriod;
  @SerializedName("auto_scaling_pause_limit")
  protected Long autoScalingPauseLimit;
  @SerializedName("auto_scaling_threshold")
  protected Long autoScalingThreshold;
  @SerializedName("storage_unit")
  protected String storageUnit;
  @SerializedName("storage_utilization_percentage")
  protected Long storageUtilizationPercentage;
  @SerializedName("support_auto_scaling")
  protected Boolean supportAutoScaling;

  protected SuccessAutoScaling() { }

  /**
   * Gets the autoScalingAllowPlanLimit.
   *
   * Indicates the maximum number of scaling actions that are allowed within a specified time period.
   *
   * @return the autoScalingAllowPlanLimit
   */
  public Boolean isAutoScalingAllowPlanLimit() {
    return autoScalingAllowPlanLimit;
  }

  /**
   * Gets the autoScalingEnabled.
   *
   * Indicates if automatic scaling is enabled or not.
   *
   * @return the autoScalingEnabled
   */
  public Boolean isAutoScalingEnabled() {
    return autoScalingEnabled;
  }

  /**
   * Gets the autoScalingMaxStorage.
   *
   * The maximum limit for automatically increasing storage capacity to handle growing data needs.
   *
   * @return the autoScalingMaxStorage
   */
  public Long getAutoScalingMaxStorage() {
    return autoScalingMaxStorage;
  }

  /**
   * Gets the autoScalingOverTimePeriod.
   *
   * Defines the time period over which auto-scaling adjustments are monitored and applied.
   *
   * @return the autoScalingOverTimePeriod
   */
  public Long getAutoScalingOverTimePeriod() {
    return autoScalingOverTimePeriod;
  }

  /**
   * Gets the autoScalingPauseLimit.
   *
   * Specifies the duration to pause auto-scaling actions after a scaling event has occurred.
   *
   * @return the autoScalingPauseLimit
   */
  public Long getAutoScalingPauseLimit() {
    return autoScalingPauseLimit;
  }

  /**
   * Gets the autoScalingThreshold.
   *
   * Specifies the resource utilization level that triggers an auto-scaling.
   *
   * @return the autoScalingThreshold
   */
  public Long getAutoScalingThreshold() {
    return autoScalingThreshold;
  }

  /**
   * Gets the storageUnit.
   *
   * Specifies the unit of measurement for storage capacity.
   *
   * @return the storageUnit
   */
  public String getStorageUnit() {
    return storageUnit;
  }

  /**
   * Gets the storageUtilizationPercentage.
   *
   * Represents the percentage of total storage capacity currently in use.
   *
   * @return the storageUtilizationPercentage
   */
  public Long getStorageUtilizationPercentage() {
    return storageUtilizationPercentage;
  }

  /**
   * Gets the supportAutoScaling.
   *
   * Indicates whether a system or service can automatically adjust resources based on demand.
   *
   * @return the supportAutoScaling
   */
  public Boolean isSupportAutoScaling() {
    return supportAutoScaling;
  }
}

