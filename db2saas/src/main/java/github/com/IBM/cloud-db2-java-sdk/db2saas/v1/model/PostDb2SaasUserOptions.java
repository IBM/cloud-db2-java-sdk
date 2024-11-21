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
 * The postDb2SaasUser options.
 */
public class PostDb2SaasUserOptions extends GenericModel {

  /**
   * Role of the User.
   */
  public interface Role {
    /** bluadmin. */
    String BLUADMIN = "bluadmin";
    /** bluuser. */
    String BLUUSER = "bluuser";
  }

  /**
   * Indicates if the account is locked.
   */
  public interface Locked {
    /** yes. */
    String YES = "yes";
    /** no. */
    String NO = "no";
  }

  protected String xDeploymentId;
  protected String id;
  protected Boolean iam;
  protected String ibmid;
  protected String name;
  protected String password;
  protected String role;
  protected String email;
  protected String locked;
  protected CreateUserAuthentication authentication;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDeploymentId;
    private String id;
    private Boolean iam;
    private String ibmid;
    private String name;
    private String password;
    private String role;
    private String email;
    private String locked;
    private CreateUserAuthentication authentication;

    /**
     * Instantiates a new Builder from an existing PostDb2SaasUserOptions instance.
     *
     * @param postDb2SaasUserOptions the instance to initialize the Builder with
     */
    private Builder(PostDb2SaasUserOptions postDb2SaasUserOptions) {
      this.xDeploymentId = postDb2SaasUserOptions.xDeploymentId;
      this.id = postDb2SaasUserOptions.id;
      this.iam = postDb2SaasUserOptions.iam;
      this.ibmid = postDb2SaasUserOptions.ibmid;
      this.name = postDb2SaasUserOptions.name;
      this.password = postDb2SaasUserOptions.password;
      this.role = postDb2SaasUserOptions.role;
      this.email = postDb2SaasUserOptions.email;
      this.locked = postDb2SaasUserOptions.locked;
      this.authentication = postDb2SaasUserOptions.authentication;
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
     * @param iam the iam
     * @param ibmid the ibmid
     * @param name the name
     * @param password the password
     * @param role the role
     * @param email the email
     * @param locked the locked
     * @param authentication the authentication
     */
    public Builder(String xDeploymentId, String id, Boolean iam, String ibmid, String name, String password, String role, String email, String locked, CreateUserAuthentication authentication) {
      this.xDeploymentId = xDeploymentId;
      this.id = id;
      this.iam = iam;
      this.ibmid = ibmid;
      this.name = name;
      this.password = password;
      this.role = role;
      this.email = email;
      this.locked = locked;
      this.authentication = authentication;
    }

    /**
     * Builds a PostDb2SaasUserOptions.
     *
     * @return the new PostDb2SaasUserOptions instance
     */
    public PostDb2SaasUserOptions build() {
      return new PostDb2SaasUserOptions(this);
    }

    /**
     * Set the xDeploymentId.
     *
     * @param xDeploymentId the xDeploymentId
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder xDeploymentId(String xDeploymentId) {
      this.xDeploymentId = xDeploymentId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the iam.
     *
     * @param iam the iam
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder iam(Boolean iam) {
      this.iam = iam;
      return this;
    }

    /**
     * Set the ibmid.
     *
     * @param ibmid the ibmid
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder ibmid(String ibmid) {
      this.ibmid = ibmid;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }

    /**
     * Set the email.
     *
     * @param email the email
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * Set the locked.
     *
     * @param locked the locked
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder locked(String locked) {
      this.locked = locked;
      return this;
    }

    /**
     * Set the authentication.
     *
     * @param authentication the authentication
     * @return the PostDb2SaasUserOptions builder
     */
    public Builder authentication(CreateUserAuthentication authentication) {
      this.authentication = authentication;
      return this;
    }
  }

  protected PostDb2SaasUserOptions() { }

  protected PostDb2SaasUserOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xDeploymentId,
      "xDeploymentId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.iam,
      "iam cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmid,
      "ibmid cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.password,
      "password cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.role,
      "role cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.email,
      "email cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locked,
      "locked cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authentication,
      "authentication cannot be null");
    xDeploymentId = builder.xDeploymentId;
    id = builder.id;
    iam = builder.iam;
    ibmid = builder.ibmid;
    name = builder.name;
    password = builder.password;
    role = builder.role;
    email = builder.email;
    locked = builder.locked;
    authentication = builder.authentication;
  }

  /**
   * New builder.
   *
   * @return a PostDb2SaasUserOptions builder
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
   * The id of the User.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the iam.
   *
   * Indicates if IAM is enabled.
   *
   * @return the iam
   */
  public Boolean iam() {
    return iam;
  }

  /**
   * Gets the ibmid.
   *
   * IBM ID of the User.
   *
   * @return the ibmid
   */
  public String ibmid() {
    return ibmid;
  }

  /**
   * Gets the name.
   *
   * The name of the User.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the password.
   *
   * Password of the User.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the role.
   *
   * Role of the User.
   *
   * @return the role
   */
  public String role() {
    return role;
  }

  /**
   * Gets the email.
   *
   * Email of the User.
   *
   * @return the email
   */
  public String email() {
    return email;
  }

  /**
   * Gets the locked.
   *
   * Indicates if the account is locked.
   *
   * @return the locked
   */
  public String locked() {
    return locked;
  }

  /**
   * Gets the authentication.
   *
   * @return the authentication
   */
  public CreateUserAuthentication authentication() {
    return authentication;
  }
}

