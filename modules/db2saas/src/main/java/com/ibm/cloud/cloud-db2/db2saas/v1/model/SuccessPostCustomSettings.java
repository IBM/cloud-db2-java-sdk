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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The details of created custom settings of db2.
 */
public class SuccessPostCustomSettings extends GenericModel {

  protected String description;
  protected String id;
  protected String status;

  protected SuccessPostCustomSettings() { }

  /**
   * Gets the description.
   *
   * Describes the operation done.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

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
   * Gets the status.
   *
   * Defines the status of the instance.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

