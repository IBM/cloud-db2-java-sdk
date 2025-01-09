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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The postDb2SaasAllowlist options.
 */
public class PostDb2SaasAllowlistOptions extends GenericModel {

  protected String xDeploymentId;
  protected List<IpAddress> ipAddresses;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDeploymentId;
    private List<IpAddress> ipAddresses;

    /**
     * Instantiates a new Builder from an existing PostDb2SaasAllowlistOptions instance.
     *
     * @param postDb2SaasAllowlistOptions the instance to initialize the Builder with
     */
    private Builder(PostDb2SaasAllowlistOptions postDb2SaasAllowlistOptions) {
      this.xDeploymentId = postDb2SaasAllowlistOptions.xDeploymentId;
      this.ipAddresses = postDb2SaasAllowlistOptions.ipAddresses;
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
     * @param ipAddresses the ipAddresses
     */
    public Builder(String xDeploymentId, List<IpAddress> ipAddresses) {
      this.xDeploymentId = xDeploymentId;
      this.ipAddresses = ipAddresses;
    }

    /**
     * Builds a PostDb2SaasAllowlistOptions.
     *
     * @return the new PostDb2SaasAllowlistOptions instance
     */
    public PostDb2SaasAllowlistOptions build() {
      return new PostDb2SaasAllowlistOptions(this);
    }

    /**
     * Adds a new element to ipAddresses.
     *
     * @param ipAddresses the new element to be added
     * @return the PostDb2SaasAllowlistOptions builder
     */
    public Builder addIpAddresses(IpAddress ipAddresses) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(ipAddresses,
        "ipAddresses cannot be null");
      if (this.ipAddresses == null) {
        this.ipAddresses = new ArrayList<IpAddress>();
      }
      this.ipAddresses.add(ipAddresses);
      return this;
    }

    /**
     * Set the xDeploymentId.
     *
     * @param xDeploymentId the xDeploymentId
     * @return the PostDb2SaasAllowlistOptions builder
     */
    public Builder xDeploymentId(String xDeploymentId) {
      this.xDeploymentId = xDeploymentId;
      return this;
    }

    /**
     * Set the ipAddresses.
     * Existing ipAddresses will be replaced.
     *
     * @param ipAddresses the ipAddresses
     * @return the PostDb2SaasAllowlistOptions builder
     */
    public Builder ipAddresses(List<IpAddress> ipAddresses) {
      this.ipAddresses = ipAddresses;
      return this;
    }
  }

  protected PostDb2SaasAllowlistOptions() { }

  protected PostDb2SaasAllowlistOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDeploymentId,
      "xDeploymentId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ipAddresses,
      "ipAddresses cannot be null");
    xDeploymentId = builder.xDeploymentId;
    ipAddresses = builder.ipAddresses;
  }

  /**
   * New builder.
   *
   * @return a PostDb2SaasAllowlistOptions builder
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
   * Gets the ipAddresses.
   *
   * List of IP addresses.
   *
   * @return the ipAddresses
   */
  public List<IpAddress> ipAddresses() {
    return ipAddresses;
  }
}

