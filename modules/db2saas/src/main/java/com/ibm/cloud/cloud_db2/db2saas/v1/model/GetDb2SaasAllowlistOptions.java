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
 * The getDb2SaasAllowlist options.
 */
public class GetDb2SaasAllowlistOptions extends GenericModel {

  protected String xDeploymentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDeploymentId;

    /**
     * Instantiates a new Builder from an existing GetDb2SaasAllowlistOptions instance.
     *
     * @param getDb2SaasAllowlistOptions the instance to initialize the Builder with
     */
    private Builder(GetDb2SaasAllowlistOptions getDb2SaasAllowlistOptions) {
      this.xDeploymentId = getDb2SaasAllowlistOptions.xDeploymentId;
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
     */
    public Builder(String xDeploymentId) {
      this.xDeploymentId = xDeploymentId;
    }

    /**
     * Builds a GetDb2SaasAllowlistOptions.
     *
     * @return the new GetDb2SaasAllowlistOptions instance
     */
    public GetDb2SaasAllowlistOptions build() {
      return new GetDb2SaasAllowlistOptions(this);
    }

    /**
     * Set the xDeploymentId.
     *
     * @param xDeploymentId the xDeploymentId
     * @return the GetDb2SaasAllowlistOptions builder
     */
    public Builder xDeploymentId(String xDeploymentId) {
      this.xDeploymentId = xDeploymentId;
      return this;
    }
  }

  protected GetDb2SaasAllowlistOptions() { }

  protected GetDb2SaasAllowlistOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDeploymentId,
      "xDeploymentId cannot be null");
    xDeploymentId = builder.xDeploymentId;
  }

  /**
   * New builder.
   *
   * @return a GetDb2SaasAllowlistOptions builder
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
}

