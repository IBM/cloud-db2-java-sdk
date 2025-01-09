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

package github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDb2SaasConnectionInfo options.
 */
public class GetDb2SaasConnectionInfoOptions extends GenericModel {

  protected String deploymentId;
  protected String xDeploymentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String deploymentId;
    private String xDeploymentId;

    /**
     * Instantiates a new Builder from an existing GetDb2SaasConnectionInfoOptions instance.
     *
     * @param getDb2SaasConnectionInfoOptions the instance to initialize the Builder with
     */
    private Builder(GetDb2SaasConnectionInfoOptions getDb2SaasConnectionInfoOptions) {
      this.deploymentId = getDb2SaasConnectionInfoOptions.deploymentId;
      this.xDeploymentId = getDb2SaasConnectionInfoOptions.xDeploymentId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param deploymentId the deploymentId
     * @param xDeploymentId the xDeploymentId
     */
    public Builder(String deploymentId, String xDeploymentId) {
      this.deploymentId = deploymentId;
      this.xDeploymentId = xDeploymentId;
    }

    /**
     * Builds a GetDb2SaasConnectionInfoOptions.
     *
     * @return the new GetDb2SaasConnectionInfoOptions instance
     */
    public GetDb2SaasConnectionInfoOptions build() {
      return new GetDb2SaasConnectionInfoOptions(this);
    }

    /**
     * Set the deploymentId.
     *
     * @param deploymentId the deploymentId
     * @return the GetDb2SaasConnectionInfoOptions builder
     */
    public Builder deploymentId(String deploymentId) {
      this.deploymentId = deploymentId;
      return this;
    }

    /**
     * Set the xDeploymentId.
     *
     * @param xDeploymentId the xDeploymentId
     * @return the GetDb2SaasConnectionInfoOptions builder
     */
    public Builder xDeploymentId(String xDeploymentId) {
      this.xDeploymentId = xDeploymentId;
      return this;
    }
  }

  protected GetDb2SaasConnectionInfoOptions() { }

  protected GetDb2SaasConnectionInfoOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.deploymentId,
      "deploymentId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDeploymentId,
      "xDeploymentId cannot be null");
    deploymentId = builder.deploymentId;
    xDeploymentId = builder.xDeploymentId;
  }

  /**
   * New builder.
   *
   * @return a GetDb2SaasConnectionInfoOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deploymentId.
   *
   * Encoded CRN deployment id.
   *
   * @return the deploymentId
   */
  public String deploymentId() {
    return deploymentId;
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

