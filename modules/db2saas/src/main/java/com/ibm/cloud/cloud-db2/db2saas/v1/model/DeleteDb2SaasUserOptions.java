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
 * The deleteDb2SaasUser options.
 */
public class DeleteDb2SaasUserOptions extends GenericModel {

  protected String xDeploymentId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDeploymentId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteDb2SaasUserOptions instance.
     *
     * @param deleteDb2SaasUserOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDb2SaasUserOptions deleteDb2SaasUserOptions) {
      this.xDeploymentId = deleteDb2SaasUserOptions.xDeploymentId;
      this.id = deleteDb2SaasUserOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param xDeploymentId the xDeploymentId
     * @param id the id
     */
    public Builder(String xDeploymentId, String id) {
      this.xDeploymentId = xDeploymentId;
      this.id = id;
    }

    /**
     * Builds a DeleteDb2SaasUserOptions.
     *
     * @return the new DeleteDb2SaasUserOptions instance
     */
    public DeleteDb2SaasUserOptions build() {
      return new DeleteDb2SaasUserOptions(this);
    }

    /**
     * Set the xDeploymentId.
     *
     * @param xDeploymentId the xDeploymentId
     * @return the DeleteDb2SaasUserOptions builder
     */
    public Builder xDeploymentId(String xDeploymentId) {
      this.xDeploymentId = xDeploymentId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteDb2SaasUserOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteDb2SaasUserOptions() { }

  protected DeleteDb2SaasUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDeploymentId,
      "xDeploymentId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    xDeploymentId = builder.xDeploymentId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteDb2SaasUserOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDeploymentId.
   *
   * CRN deployment id.
   *
   * @return the xDeploymentId
   */
  public String xDeploymentId() {
    return xDeploymentId;
  }

  /**
   * Gets the id.
   *
   * id of the user.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

