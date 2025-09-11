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
 * UpdateUserAuthentication.
 */
public class UpdateUserAuthentication extends GenericModel {

  protected String method;
  @SerializedName("policy_id")
  protected String policyId;

  /**
   * Builder.
   */
  public static class Builder {
    private String method;
    private String policyId;

    /**
     * Instantiates a new Builder from an existing UpdateUserAuthentication instance.
     *
     * @param updateUserAuthentication the instance to initialize the Builder with
     */
    private Builder(UpdateUserAuthentication updateUserAuthentication) {
      this.method = updateUserAuthentication.method;
      this.policyId = updateUserAuthentication.policyId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param method the method
     * @param policyId the policyId
     */
    public Builder(String method, String policyId) {
      this.method = method;
      this.policyId = policyId;
    }

    /**
     * Builds a UpdateUserAuthentication.
     *
     * @return the new UpdateUserAuthentication instance
     */
    public UpdateUserAuthentication build() {
      return new UpdateUserAuthentication(this);
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the UpdateUserAuthentication builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the policyId.
     *
     * @param policyId the policyId
     * @return the UpdateUserAuthentication builder
     */
    public Builder policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }
  }

  protected UpdateUserAuthentication() { }

  protected UpdateUserAuthentication(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.policyId,
      "policyId cannot be null");
    method = builder.method;
    policyId = builder.policyId;
  }

  /**
   * New builder.
   *
   * @return a UpdateUserAuthentication builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the method.
   *
   * Authentication method.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the policyId.
   *
   * Authentication policy ID.
   *
   * @return the policyId
   */
  public String policyId() {
    return policyId;
  }
}

