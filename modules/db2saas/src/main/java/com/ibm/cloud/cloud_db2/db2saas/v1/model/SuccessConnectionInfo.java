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
 * Responds with JSON of the connection information for the Db2 SaaS Instance.
 */
public class SuccessConnectionInfo extends GenericModel {

  @SerializedName("public")
  protected SuccessConnectionInfoPublic xPublic;
  @SerializedName("private")
  protected SuccessConnectionInfoPrivate xPrivate;

  protected SuccessConnectionInfo() { }

  /**
   * Gets the xPublic.
   *
   * @return the xPublic
   */
  public SuccessConnectionInfoPublic getXPublic() {
    return xPublic;
  }

  /**
   * Gets the xPrivate.
   *
   * @return the xPrivate
   */
  public SuccessConnectionInfoPrivate getXPrivate() {
    return xPrivate;
  }
}

