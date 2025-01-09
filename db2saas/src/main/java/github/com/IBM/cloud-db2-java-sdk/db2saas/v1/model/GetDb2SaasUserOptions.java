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
 * The getDb2SaasUser options.
 */
public class GetDb2SaasUserOptions extends GenericModel {

  protected String xDeploymentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDeploymentId;

    /**
     * Instantiates a new Builder from an existing GetDb2SaasUserOptions instance.
     *
     * @param getDb2SaasUserOptions the instance to initialize the Builder with
     */
    private Builder(GetDb2SaasUserOptions getDb2SaasUserOptions) {
      this.xDeploymentId = getDb2SaasUserOptions.xDeploymentId;
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
     * Builds a GetDb2SaasUserOptions.
     *
     * @return the new GetDb2SaasUserOptions instance
     */
    public GetDb2SaasUserOptions build() {
      return new GetDb2SaasUserOptions(this);
    }

    /**
     * Set the xDeploymentId.
     *
     * @param xDeploymentId the xDeploymentId
     * @return the GetDb2SaasUserOptions builder
     */
    public Builder xDeploymentId(String xDeploymentId) {
      this.xDeploymentId = xDeploymentId;
      return this;
    }
  }

  protected GetDb2SaasUserOptions() { }

  protected GetDb2SaasUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDeploymentId,
      "xDeploymentId cannot be null");
    xDeploymentId = builder.xDeploymentId;
  }

  /**
   * New builder.
   *
   * @return a GetDb2SaasUserOptions builder
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

