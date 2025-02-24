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
 * SuccessTuneableParamsTuneableParam.
 */
public class SuccessTuneableParamsTuneableParam extends GenericModel {

  protected SuccessTuneableParamsTuneableParamDb db;
  protected SuccessTuneableParamsTuneableParamDbm dbm;
  protected SuccessTuneableParamsTuneableParamRegistry registry;

  protected SuccessTuneableParamsTuneableParam() { }

  /**
   * Gets the db.
   *
   * Tunable parameters related to the Db2 database instance.
   *
   * @return the db
   */
  public SuccessTuneableParamsTuneableParamDb getDb() {
    return db;
  }

  /**
   * Gets the dbm.
   *
   * Tunable parameters related to the Db2 instance manager (dbm).
   *
   * @return the dbm
   */
  public SuccessTuneableParamsTuneableParamDbm getDbm() {
    return dbm;
  }

  /**
   * Gets the registry.
   *
   * Tunable parameters related to the Db2 registry.
   *
   * @return the registry
   */
  public SuccessTuneableParamsTuneableParamRegistry getRegistry() {
    return registry;
  }
}

