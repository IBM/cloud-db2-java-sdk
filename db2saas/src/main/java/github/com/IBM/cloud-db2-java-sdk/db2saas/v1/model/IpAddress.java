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
 * Details of an IP address.
 */
public class IpAddress extends GenericModel {

  protected String address;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String address;
    private String description;

    /**
     * Instantiates a new Builder from an existing IpAddress instance.
     *
     * @param ipAddress the instance to initialize the Builder with
     */
    private Builder(IpAddress ipAddress) {
      this.address = ipAddress.address;
      this.description = ipAddress.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param address the address
     * @param description the description
     */
    public Builder(String address, String description) {
      this.address = address;
      this.description = description;
    }

    /**
     * Builds a IpAddress.
     *
     * @return the new IpAddress instance
     */
    public IpAddress build() {
      return new IpAddress(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the IpAddress builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the IpAddress builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected IpAddress() { }

  protected IpAddress(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.address,
      "address cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    address = builder.address;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a IpAddress builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the address.
   *
   * The IP address, in IPv4/ipv6 format.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the description.
   *
   * Description of the IP address.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

