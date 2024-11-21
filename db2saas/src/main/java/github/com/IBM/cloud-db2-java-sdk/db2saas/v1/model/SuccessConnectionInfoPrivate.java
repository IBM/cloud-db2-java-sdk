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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SuccessConnectionInfoPrivate.
 */
public class SuccessConnectionInfoPrivate extends GenericModel {

  protected String hostname;
  protected String databaseName;
  @SerializedName("host_ros")
  protected String hostRos;
  protected String certificateBase64;
  protected String sslPort;
  protected Boolean ssl;
  protected String databaseVersion;

  protected SuccessConnectionInfoPrivate() { }

  /**
   * Gets the hostname.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the databaseName.
   *
   * @return the databaseName
   */
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Gets the hostRos.
   *
   * @return the hostRos
   */
  public String getHostRos() {
    return hostRos;
  }

  /**
   * Gets the certificateBase64.
   *
   * @return the certificateBase64
   */
  public String getCertificateBase64() {
    return certificateBase64;
  }

  /**
   * Gets the sslPort.
   *
   * @return the sslPort
   */
  public String getSslPort() {
    return sslPort;
  }

  /**
   * Gets the ssl.
   *
   * @return the ssl
   */
  public Boolean isSsl() {
    return ssl;
  }

  /**
   * Gets the databaseVersion.
   *
   * @return the databaseVersion
   */
  public String getDatabaseVersion() {
    return databaseVersion;
  }
}

