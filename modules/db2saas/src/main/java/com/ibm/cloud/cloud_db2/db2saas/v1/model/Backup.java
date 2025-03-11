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
 * Info of backup.
 */
public class Backup extends GenericModel {

  protected String id;
  protected String type;
  protected String status;
  @SerializedName("created_at")
  protected String createdAt;
  protected Long size;
  protected Long duration;

  protected Backup() { }

  /**
   * Gets the id.
   *
   * CRN of the db2 instance.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * Defines the type of execution of backup.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the status.
   *
   * Status of the backup.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the createdAt.
   *
   * Timestamp of the backup created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the size.
   *
   * Size of the backup or data set.
   *
   * @return the size
   */
  public Long getSize() {
    return size;
  }

  /**
   * Gets the duration.
   *
   * The duration of the backup operation in seconds.
   *
   * @return the duration
   */
  public Long getDuration() {
    return duration;
  }
}

