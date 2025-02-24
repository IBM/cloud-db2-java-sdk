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
 * The getDb2SaasBackup options.
 */
public class GetDb2SaasBackupOptions extends GenericModel {

  protected String xDbProfile;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDbProfile;

    /**
     * Instantiates a new Builder from an existing GetDb2SaasBackupOptions instance.
     *
     * @param getDb2SaasBackupOptions the instance to initialize the Builder with
     */
    private Builder(GetDb2SaasBackupOptions getDb2SaasBackupOptions) {
      this.xDbProfile = getDb2SaasBackupOptions.xDbProfile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param xDbProfile the xDbProfile
     */
    public Builder(String xDbProfile) {
      this.xDbProfile = xDbProfile;
    }

    /**
     * Builds a GetDb2SaasBackupOptions.
     *
     * @return the new GetDb2SaasBackupOptions instance
     */
    public GetDb2SaasBackupOptions build() {
      return new GetDb2SaasBackupOptions(this);
    }

    /**
     * Set the xDbProfile.
     *
     * @param xDbProfile the xDbProfile
     * @return the GetDb2SaasBackupOptions builder
     */
    public Builder xDbProfile(String xDbProfile) {
      this.xDbProfile = xDbProfile;
      return this;
    }
  }

  protected GetDb2SaasBackupOptions() { }

  protected GetDb2SaasBackupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDbProfile,
      "xDbProfile cannot be null");
    xDbProfile = builder.xDbProfile;
  }

  /**
   * New builder.
   *
   * @return a GetDb2SaasBackupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDbProfile.
   *
   * Encoded CRN deployment id.
   *
   * @return the xDbProfile
   */
  public String xDbProfile() {
    return xDbProfile;
  }
}

