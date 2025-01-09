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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Authentication details for the user.
 */
public class SuccessGetUserByIDAuthentication extends GenericModel {

  protected String method;
  @SerializedName("policy_id")
  protected String policyId;

  protected SuccessGetUserByIDAuthentication() { }

  /**
   * Gets the method.
   *
   * Authentication method.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the policyId.
   *
   * Policy ID of authentication.
   *
   * @return the policyId
   */
  public String getPolicyId() {
    return policyId;
  }
}

