/*
 * (C) Copyright IBM Corp. 2024.
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
 * The putDb2SaasUser options.
 */
public class PutDb2SaasUserOptions extends GenericModel {

  /**
   * Role of the User.
   */
  public interface NewRole {
    /** bluadmin. */
    String BLUADMIN = "bluadmin";
    /** bluuser. */
    String BLUUSER = "bluuser";
  }

  /**
   * Indicates if the account is locked.
   */
  public interface NewLocked {
    /** yes. */
    String YES = "yes";
    /** no. */
    String NO = "no";
  }

  protected String xDeploymentId;
  protected String id;
  protected String newId;
  protected String newName;
  protected String newOldPassword;
  protected String newNewPassword;
  protected String newRole;
  protected String newEmail;
  protected String newLocked;
  protected UpdateUserAuthentication newAuthentication;
  protected String newIbmid;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDeploymentId;
    private String id;
    private String newId;
    private String newName;
    private String newOldPassword;
    private String newNewPassword;
    private String newRole;
    private String newEmail;
    private String newLocked;
    private UpdateUserAuthentication newAuthentication;
    private String newIbmid;

    /**
     * Instantiates a new Builder from an existing PutDb2SaasUserOptions instance.
     *
     * @param putDb2SaasUserOptions the instance to initialize the Builder with
     */
    private Builder(PutDb2SaasUserOptions putDb2SaasUserOptions) {
      this.xDeploymentId = putDb2SaasUserOptions.xDeploymentId;
      this.id = putDb2SaasUserOptions.id;
      this.newId = putDb2SaasUserOptions.newId;
      this.newName = putDb2SaasUserOptions.newName;
      this.newOldPassword = putDb2SaasUserOptions.newOldPassword;
      this.newNewPassword = putDb2SaasUserOptions.newNewPassword;
      this.newRole = putDb2SaasUserOptions.newRole;
      this.newEmail = putDb2SaasUserOptions.newEmail;
      this.newLocked = putDb2SaasUserOptions.newLocked;
      this.newAuthentication = putDb2SaasUserOptions.newAuthentication;
      this.newIbmid = putDb2SaasUserOptions.newIbmid;
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
     * @param id the id
     * @param newId the newId
     * @param newName the newName
     * @param newOldPassword the newOldPassword
     * @param newNewPassword the newNewPassword
     * @param newRole the newRole
     * @param newEmail the newEmail
     * @param newLocked the newLocked
     * @param newAuthentication the newAuthentication
     */
    public Builder(String xDeploymentId, String id, String newId, String newName, String newOldPassword, String newNewPassword, String newRole, String newEmail, String newLocked, UpdateUserAuthentication newAuthentication) {
      this.xDeploymentId = xDeploymentId;
      this.id = id;
      this.newId = newId;
      this.newName = newName;
      this.newOldPassword = newOldPassword;
      this.newNewPassword = newNewPassword;
      this.newRole = newRole;
      this.newEmail = newEmail;
      this.newLocked = newLocked;
      this.newAuthentication = newAuthentication;
    }

    /**
     * Builds a PutDb2SaasUserOptions.
     *
     * @return the new PutDb2SaasUserOptions instance
     */
    public PutDb2SaasUserOptions build() {
      return new PutDb2SaasUserOptions(this);
    }

    /**
     * Set the xDeploymentId.
     *
     * @param xDeploymentId the xDeploymentId
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder xDeploymentId(String xDeploymentId) {
      this.xDeploymentId = xDeploymentId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the newId.
     *
     * @param newId the newId
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newId(String newId) {
      this.newId = newId;
      return this;
    }

    /**
     * Set the newName.
     *
     * @param newName the newName
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newName(String newName) {
      this.newName = newName;
      return this;
    }

    /**
     * Set the newOldPassword.
     *
     * @param newOldPassword the newOldPassword
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newOldPassword(String newOldPassword) {
      this.newOldPassword = newOldPassword;
      return this;
    }

    /**
     * Set the newNewPassword.
     *
     * @param newNewPassword the newNewPassword
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newNewPassword(String newNewPassword) {
      this.newNewPassword = newNewPassword;
      return this;
    }

    /**
     * Set the newRole.
     *
     * @param newRole the newRole
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newRole(String newRole) {
      this.newRole = newRole;
      return this;
    }

    /**
     * Set the newEmail.
     *
     * @param newEmail the newEmail
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newEmail(String newEmail) {
      this.newEmail = newEmail;
      return this;
    }

    /**
     * Set the newLocked.
     *
     * @param newLocked the newLocked
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newLocked(String newLocked) {
      this.newLocked = newLocked;
      return this;
    }

    /**
     * Set the newAuthentication.
     *
     * @param newAuthentication the newAuthentication
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newAuthentication(UpdateUserAuthentication newAuthentication) {
      this.newAuthentication = newAuthentication;
      return this;
    }

    /**
     * Set the newIbmid.
     *
     * @param newIbmid the newIbmid
     * @return the PutDb2SaasUserOptions builder
     */
    public Builder newIbmid(String newIbmid) {
      this.newIbmid = newIbmid;
      return this;
    }
  }

  protected PutDb2SaasUserOptions() { }

  protected PutDb2SaasUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDeploymentId,
      "xDeploymentId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newId,
      "newId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newName,
      "newName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newOldPassword,
      "newOldPassword cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newNewPassword,
      "newNewPassword cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newRole,
      "newRole cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newEmail,
      "newEmail cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newLocked,
      "newLocked cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newAuthentication,
      "newAuthentication cannot be null");
    xDeploymentId = builder.xDeploymentId;
    id = builder.id;
    newId = builder.newId;
    newName = builder.newName;
    newOldPassword = builder.newOldPassword;
    newNewPassword = builder.newNewPassword;
    newRole = builder.newRole;
    newEmail = builder.newEmail;
    newLocked = builder.newLocked;
    newAuthentication = builder.newAuthentication;
    newIbmid = builder.newIbmid;
  }

  /**
   * New builder.
   *
   * @return a PutDb2SaasUserOptions builder
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
   * Gets the id.
   *
   * id of the user.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the newId.
   *
   * The unique identifier of the User.
   *
   * @return the newId
   */
  public String newId() {
    return newId;
  }

  /**
   * Gets the newName.
   *
   * The name of the User.
   *
   * @return the newName
   */
  public String newName() {
    return newName;
  }

  /**
   * Gets the newOldPassword.
   *
   * Current password of the User.
   *
   * @return the newOldPassword
   */
  public String newOldPassword() {
    return newOldPassword;
  }

  /**
   * Gets the newNewPassword.
   *
   * New password for the User.
   *
   * @return the newNewPassword
   */
  public String newNewPassword() {
    return newNewPassword;
  }

  /**
   * Gets the newRole.
   *
   * Role of the User.
   *
   * @return the newRole
   */
  public String newRole() {
    return newRole;
  }

  /**
   * Gets the newEmail.
   *
   * Email of the User.
   *
   * @return the newEmail
   */
  public String newEmail() {
    return newEmail;
  }

  /**
   * Gets the newLocked.
   *
   * Indicates if the account is locked.
   *
   * @return the newLocked
   */
  public String newLocked() {
    return newLocked;
  }

  /**
   * Gets the newAuthentication.
   *
   * @return the newAuthentication
   */
  public UpdateUserAuthentication newAuthentication() {
    return newAuthentication;
  }

  /**
   * Gets the newIbmid.
   *
   * IBM ID of the User.
   *
   * @return the newIbmid
   */
  public String newIbmid() {
    return newIbmid;
  }
}

