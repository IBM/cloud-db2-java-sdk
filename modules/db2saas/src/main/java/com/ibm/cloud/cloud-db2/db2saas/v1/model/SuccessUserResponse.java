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

import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The details of the users.
 */
public class SuccessUserResponse extends GenericModel {

  /**
   * Role assigned to the user.
   */
  public interface Role {
    /** bluadmin. */
    String BLUADMIN = "bluadmin";
    /** bluuser. */
    String BLUUSER = "bluuser";
  }

  /**
   * Account lock status for the user.
   */
  public interface Locked {
    /** yes. */
    String YES = "yes";
    /** no. */
    String NO = "no";
  }

  protected String dvRole;
  protected Map<String, Object> metadata;
  protected String formatedIbmid;
  protected String role;
  protected String iamid;
  protected List<String> permittedActions;
  protected Boolean allClean;
  protected String password;
  protected Boolean iam;
  protected String name;
  protected String ibmid;
  protected String id;
  protected String locked;
  protected String initErrorMsg;
  protected String email;
  protected SuccessUserResponseAuthentication authentication;

  protected SuccessUserResponse() { }

  /**
   * Gets the dvRole.
   *
   * User's DV role.
   *
   * @return the dvRole
   */
  public String getDvRole() {
    return dvRole;
  }

  /**
   * Gets the metadata.
   *
   * Metadata associated with the user.
   *
   * @return the metadata
   */
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  /**
   * Gets the formatedIbmid.
   *
   * Formatted IBM ID.
   *
   * @return the formatedIbmid
   */
  public String getFormatedIbmid() {
    return formatedIbmid;
  }

  /**
   * Gets the role.
   *
   * Role assigned to the user.
   *
   * @return the role
   */
  public String getRole() {
    return role;
  }

  /**
   * Gets the iamid.
   *
   * IAM ID for the user.
   *
   * @return the iamid
   */
  public String getIamid() {
    return iamid;
  }

  /**
   * Gets the permittedActions.
   *
   * List of allowed actions of the user.
   *
   * @return the permittedActions
   */
  public List<String> getPermittedActions() {
    return permittedActions;
  }

  /**
   * Gets the allClean.
   *
   * Indicates if the user account has no issues.
   *
   * @return the allClean
   */
  public Boolean isAllClean() {
    return allClean;
  }

  /**
   * Gets the password.
   *
   * User's password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Gets the iam.
   *
   * Indicates if IAM is enabled or not.
   *
   * @return the iam
   */
  public Boolean isIam() {
    return iam;
  }

  /**
   * Gets the name.
   *
   * The display name of the user.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the ibmid.
   *
   * IBM ID of the user.
   *
   * @return the ibmid
   */
  public String getIbmid() {
    return ibmid;
  }

  /**
   * Gets the id.
   *
   * Unique identifier for the user.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the locked.
   *
   * Account lock status for the user.
   *
   * @return the locked
   */
  public String getLocked() {
    return locked;
  }

  /**
   * Gets the initErrorMsg.
   *
   * Initial error message.
   *
   * @return the initErrorMsg
   */
  public String getInitErrorMsg() {
    return initErrorMsg;
  }

  /**
   * Gets the email.
   *
   * Email address of the user.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the authentication.
   *
   * Authentication details for the user.
   *
   * @return the authentication
   */
  public SuccessUserResponseAuthentication getAuthentication() {
    return authentication;
  }
}

