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
 * The postDb2SaasDbConfiguration options.
 */
public class PostDb2SaasDbConfigurationOptions extends GenericModel {

  protected String xDbProfile;
  protected CreateCustomSettingsRegistry registry;
  protected CreateCustomSettingsDb db;
  protected CreateCustomSettingsDbm dbm;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDbProfile;
    private CreateCustomSettingsRegistry registry;
    private CreateCustomSettingsDb db;
    private CreateCustomSettingsDbm dbm;

    /**
     * Instantiates a new Builder from an existing PostDb2SaasDbConfigurationOptions instance.
     *
     * @param postDb2SaasDbConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(PostDb2SaasDbConfigurationOptions postDb2SaasDbConfigurationOptions) {
      this.xDbProfile = postDb2SaasDbConfigurationOptions.xDbProfile;
      this.registry = postDb2SaasDbConfigurationOptions.registry;
      this.db = postDb2SaasDbConfigurationOptions.db;
      this.dbm = postDb2SaasDbConfigurationOptions.dbm;
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
     * Builds a PostDb2SaasDbConfigurationOptions.
     *
     * @return the new PostDb2SaasDbConfigurationOptions instance
     */
    public PostDb2SaasDbConfigurationOptions build() {
      return new PostDb2SaasDbConfigurationOptions(this);
    }

    /**
     * Set the xDbProfile.
     *
     * @param xDbProfile the xDbProfile
     * @return the PostDb2SaasDbConfigurationOptions builder
     */
    public Builder xDbProfile(String xDbProfile) {
      this.xDbProfile = xDbProfile;
      return this;
    }

    /**
     * Set the registry.
     *
     * @param registry the registry
     * @return the PostDb2SaasDbConfigurationOptions builder
     */
    public Builder registry(CreateCustomSettingsRegistry registry) {
      this.registry = registry;
      return this;
    }

    /**
     * Set the db.
     *
     * @param db the db
     * @return the PostDb2SaasDbConfigurationOptions builder
     */
    public Builder db(CreateCustomSettingsDb db) {
      this.db = db;
      return this;
    }

    /**
     * Set the dbm.
     *
     * @param dbm the dbm
     * @return the PostDb2SaasDbConfigurationOptions builder
     */
    public Builder dbm(CreateCustomSettingsDbm dbm) {
      this.dbm = dbm;
      return this;
    }
  }

  protected PostDb2SaasDbConfigurationOptions() { }

  protected PostDb2SaasDbConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDbProfile,
      "xDbProfile cannot be null");
    xDbProfile = builder.xDbProfile;
    registry = builder.registry;
    db = builder.db;
    dbm = builder.dbm;
  }

  /**
   * New builder.
   *
   * @return a PostDb2SaasDbConfigurationOptions builder
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

  /**
   * Gets the registry.
   *
   * registry for db2 related configuration settings/configurations.
   *
   * @return the registry
   */
  public CreateCustomSettingsRegistry registry() {
    return registry;
  }

  /**
   * Gets the db.
   *
   * Container for general database settings.
   *
   * @return the db
   */
  public CreateCustomSettingsDb db() {
    return db;
  }

  /**
   * Gets the dbm.
   *
   * Container for general database management settings.
   *
   * @return the dbm
   */
  public CreateCustomSettingsDbm dbm() {
    return dbm;
  }
}

