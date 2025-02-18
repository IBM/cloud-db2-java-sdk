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

package com/ibm/cloud/cloud-db2.db2saas.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.Backup;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsDb;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsDbm;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateCustomSettingsRegistry;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.CreateUserAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.DeleteDb2SaasUserOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasAllowlistOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasAutoscaleOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasBackupOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasConnectionInfoOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasTuneableParamOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetDb2SaasUserOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.GetbyidDb2SaasUserOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.IpAddress;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasAllowlistOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasBackupOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasDbConfigurationOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PostDb2SaasUserOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.PutDb2SaasAutoscaleOptions;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessAutoScaling;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessConnectionInfo;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessConnectionInfoPrivate;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessConnectionInfoPublic;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessCreateBackup;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessCreateBackupTask;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetAllowlistIPs;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetBackups;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserByID;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserByIDAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserInfo;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserInfoResourcesItem;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessGetUserInfoResourcesItemAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessPostAllowedlistIPs;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessPostCustomSettings;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParams;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParam;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParamDb;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParamDbm;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessTuneableParamsTuneableParamRegistry;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessUpdateAutoScale;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessUserResponse;
import com/ibm/cloud/cloud-db2.db2saas.v1.model.SuccessUserResponseAuthentication;
import com/ibm/cloud/cloud-db2.db2saas.v1.utils.TestUtilities;
import com/ibm/cloud/cloud-db2.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the Db2saas service.
 */
public class Db2saasIT extends SdkIntegrationTestBase {
  public Db2saas service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../db2saas_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Db2saas.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Db2saas.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testGetDb2SaasConnectionInfo() throws Exception {
    try {
      GetDb2SaasConnectionInfoOptions getDb2SaasConnectionInfoOptions = new GetDb2SaasConnectionInfoOptions.Builder()
        .deploymentId("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A69db420f-33d5-4953-8bd8-1950abd356f6%3A%3A")
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      // Invoke operation
      Response<SuccessConnectionInfo> response = service.getDb2SaasConnectionInfo(getDb2SaasConnectionInfoOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessConnectionInfo successConnectionInfoResult = response.getResult();
      assertNotNull(successConnectionInfoResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasConnectionInfo" })
  public void testPostDb2SaasAllowlist() throws Exception {
    try {
      IpAddress ipAddressModel = new IpAddress.Builder()
        .address("127.0.0.1")
        .description("A sample IP address")
        .build();

      PostDb2SaasAllowlistOptions postDb2SaasAllowlistOptions = new PostDb2SaasAllowlistOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .ipAddresses(java.util.Arrays.asList(ipAddressModel))
        .build();

      // Invoke operation
      Response<SuccessPostAllowedlistIPs> response = service.postDb2SaasAllowlist(postDb2SaasAllowlistOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessPostAllowedlistIPs successPostAllowedlistIPsResult = response.getResult();
      assertNotNull(successPostAllowedlistIPsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPostDb2SaasAllowlist" })
  public void testGetDb2SaasAllowlist() throws Exception {
    try {
      GetDb2SaasAllowlistOptions getDb2SaasAllowlistOptions = new GetDb2SaasAllowlistOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      // Invoke operation
      Response<SuccessGetAllowlistIPs> response = service.getDb2SaasAllowlist(getDb2SaasAllowlistOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessGetAllowlistIPs successGetAllowlistIPsResult = response.getResult();
      assertNotNull(successGetAllowlistIPsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasAllowlist" })
  public void testPostDb2SaasUser() throws Exception {
    try {
      CreateUserAuthentication createUserAuthenticationModel = new CreateUserAuthentication.Builder()
        .method("internal")
        .policyId("Default")
        .build();

      PostDb2SaasUserOptions postDb2SaasUserOptions = new PostDb2SaasUserOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .id("test-user")
        .iam(false)
        .ibmid("test-ibm-id")
        .name("test_user")
        .password("dEkMc43@gfAPl!867^dSbu")
        .role("bluuser")
        .email("test_user@mycompany.com")
        .locked("no")
        .authentication(createUserAuthenticationModel)
        .build();

      // Invoke operation
      Response<SuccessUserResponse> response = service.postDb2SaasUser(postDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessUserResponse successUserResponseResult = response.getResult();
      assertNotNull(successUserResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPostDb2SaasUser" })
  public void testGetDb2SaasUser() throws Exception {
    try {
      GetDb2SaasUserOptions getDb2SaasUserOptions = new GetDb2SaasUserOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      // Invoke operation
      Response<SuccessGetUserInfo> response = service.getDb2SaasUser(getDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessGetUserInfo successGetUserInfoResult = response.getResult();
      assertNotNull(successGetUserInfoResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasUser" })
  public void testGetbyidDb2SaasUser() throws Exception {
    try {
      GetbyidDb2SaasUserOptions getbyidDb2SaasUserOptions = new GetbyidDb2SaasUserOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .build();

      // Invoke operation
      Response<SuccessGetUserByID> response = service.getbyidDb2SaasUser(getbyidDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessGetUserByID successGetUserByIdResult = response.getResult();
      assertNotNull(successGetUserByIdResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetbyidDb2SaasUser" })
  public void testPutDb2SaasAutoscale() throws Exception {
    try {
      PutDb2SaasAutoscaleOptions putDb2SaasAutoscaleOptions = new PutDb2SaasAutoscaleOptions.Builder()
        .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
        .autoScalingThreshold(Long.valueOf("90"))
        .autoScalingPauseLimit(Long.valueOf("70"))
        .build();

      // Invoke operation
      Response<SuccessUpdateAutoScale> response = service.putDb2SaasAutoscale(putDb2SaasAutoscaleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessUpdateAutoScale successUpdateAutoScaleResult = response.getResult();
      assertNotNull(successUpdateAutoScaleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPutDb2SaasAutoscale" })
  public void testGetDb2SaasAutoscale() throws Exception {
    try {
      GetDb2SaasAutoscaleOptions getDb2SaasAutoscaleOptions = new GetDb2SaasAutoscaleOptions.Builder()
        .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
        .build();

      // Invoke operation
      Response<SuccessAutoScaling> response = service.getDb2SaasAutoscale(getDb2SaasAutoscaleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessAutoScaling successAutoScalingResult = response.getResult();
      assertNotNull(successAutoScalingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasAutoscale" })
  public void testPostDb2SaasDbConfiguration() throws Exception {
    try {
      CreateCustomSettingsRegistry createCustomSettingsRegistryModel = new CreateCustomSettingsRegistry.Builder()
        .dB2Bidi("YES")
        .dB2Compopt("-")
        .dB2LockToRb("STATEMENT")
        .dB2Stmm("YES")
        .dB2AlternateAuthzBehaviour("EXTERNAL_ROUTINE_DBADM")
        .dB2Antijoin("EXTEND")
        .dB2AtsEnable("YES")
        .dB2DeferredPrepareSemantics("YES")
        .dB2Evaluncommitted("NO")
        .dB2ExtendedOptimization("-")
        .dB2IndexPctfreeDefault("10")
        .dB2InlistToNljn("YES")
        .dB2MinimizeListprefetch("NO")
        .dB2ObjectTableEntries("5000")
        .dB2Optprofile("NO")
        .dB2OptstatsLog("-")
        .dB2OptMaxTempSize("-")
        .dB2ParallelIo("-")
        .dB2ReducedOptimization("-")
        .dB2Selectivity("YES")
        .dB2Skipdeleted("NO")
        .dB2Skipinserted("YES")
        .dB2SyncReleaseLockAttributes("YES")
        .dB2TruncateReusestorage("IMPORT")
        .dB2UseAlternatePageCleaning("ON")
        .dB2ViewReoptValues("NO")
        .dB2WlmSettings("-")
        .dB2Workload("SAP")
        .build();

      CreateCustomSettingsDb createCustomSettingsDbModel = new CreateCustomSettingsDb.Builder()
        .actSortmemLimit("NONE")
        .altCollate("NULL")
        .appgroupMemSz("10")
        .applheapsz("AUTOMATIC")
        .applMemory("AUTOMATIC")
        .appCtlHeapSz("64000")
        .archretrydelay("65535")
        .authnCacheDuration("10000")
        .autorestart("ON")
        .autoCgStats("ON")
        .autoMaint("OFF")
        .autoReorg("ON")
        .autoReval("IMMEDIATE")
        .autoRunstats("ON")
        .autoSampling("OFF")
        .autoStatsViews("ON")
        .autoStmtStats("OFF")
        .autoTblMaint("ON")
        .avgAppls("-")
        .catalogcacheSz("-")
        .chngpgsThresh("50")
        .curCommit("AVAILABLE")
        .databaseMemory("AUTOMATIC")
        .dbheap("AUTOMATIC")
        .dbCollname("-")
        .dbMemThresh("75")
        .ddlCompressionDef("YES")
        .ddlConstraintDef("NO")
        .decfltRounding("ROUND_HALF_UP")
        .decArithmetic("-")
        .decToCharFmt("NEW")
        .dftDegree("-1")
        .dftExtentSz("32")
        .dftLoadrecSes("1000")
        .dftMttbTypes("-")
        .dftPrefetchSz("AUTOMATIC")
        .dftQueryopt("3")
        .dftRefreshAge("-")
        .dftSchemasDcc("YES")
        .dftSqlmathwarn("YES")
        .dftTableOrg("COLUMN")
        .dlchktime("10000")
        .enableXmlchar("YES")
        .extendedRowSz("ENABLE")
        .groupheapRatio("50")
        .indexrec("SYSTEM")
        .largeAggregation("YES")
        .locklist("AUTOMATIC")
        .locktimeout("-1")
        .logindexbuild("ON")
        .logApplInfo("YES")
        .logDdlStmts("NO")
        .logDiskCap("0")
        .maxappls("5000")
        .maxfilop("1024")
        .maxlocks("AUTOMATIC")
        .minDecDiv3("NO")
        .monActMetrics("EXTENDED")
        .monDeadlock("HISTORY")
        .monLckMsgLvl("2")
        .monLocktimeout("HISTORY")
        .monLockwait("WITHOUT_HIST")
        .monLwThresh("10000")
        .monObjMetrics("BASE")
        .monPkglistSz("512")
        .monReqMetrics("NONE")
        .monRtnData("BASE")
        .monRtnExeclist("ON")
        .monUowData("NONE")
        .monUowExeclist("ON")
        .monUowPkglist("OFF")
        .ncharMapping("CHAR_CU32")
        .numFreqvalues("50")
        .numIocleaners("AUTOMATIC")
        .numIoservers("AUTOMATIC")
        .numLogSpan("10")
        .numQuantiles("100")
        .optBuffpage("-")
        .optDirectWrkld("ON")
        .optLocklist("-")
        .optMaxlocks("-")
        .optSortheap("-")
        .pageAgeTrgtGcr("5000")
        .pageAgeTrgtMcr("3000")
        .pckcachesz("AUTOMATIC")
        .plStackTrace("UNHANDLED")
        .selfTuningMem("ON")
        .seqdetect("YES")
        .sheapthresShr("AUTOMATIC")
        .softmax("-")
        .sortheap("AUTOMATIC")
        .sqlCcflags("-")
        .statHeapSz("AUTOMATIC")
        .stmtheap("AUTOMATIC")
        .stmtConc("LITERALS")
        .stringUnits("SYSTEM")
        .systimePeriodAdj("NO")
        .trackmod("YES")
        .utilHeapSz("AUTOMATIC")
        .wlmAdmissionCtrl("YES")
        .wlmAgentLoadTrgt("1000")
        .wlmCpuLimit("80")
        .wlmCpuShares("1000")
        .wlmCpuShareMode("SOFT")
        .build();

      CreateCustomSettingsDbm createCustomSettingsDbmModel = new CreateCustomSettingsDbm.Builder()
        .commBandwidth("1000")
        .cpuspeed("0.5")
        .dftMonBufpool("ON")
        .dftMonLock("OFF")
        .dftMonSort("ON")
        .dftMonStmt("ON")
        .dftMonTable("OFF")
        .dftMonTimestamp("ON")
        .dftMonUow("ON")
        .diaglevel("2")
        .federatedAsync("32767")
        .indexrec("RESTART")
        .intraParallel("YES")
        .keepfenced("YES")
        .maxConnretries("5")
        .maxQuerydegree("4")
        .monHeapSz("AUTOMATIC")
        .multipartsizemb("100")
        .notifylevel("2")
        .numInitagents("100")
        .numInitfenced("20")
        .numPoolagents("10")
        .resyncInterval("1000")
        .rqrioblk("8192")
        .startStopTime("10")
        .utilImpactLim("50")
        .wlmDispatcher("YES")
        .wlmDispConcur("16")
        .wlmDispCpuShares("YES")
        .wlmDispMinUtil("10")
        .build();

      PostDb2SaasDbConfigurationOptions postDb2SaasDbConfigurationOptions = new PostDb2SaasDbConfigurationOptions.Builder()
        .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
        .build();

      // Invoke operation
      Response<SuccessPostCustomSettings> response = service.postDb2SaasDbConfiguration(postDb2SaasDbConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessPostCustomSettings successPostCustomSettingsResult = response.getResult();
      assertNotNull(successPostCustomSettingsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPostDb2SaasDbConfiguration" })
  public void testGetDb2SaasTuneableParam() throws Exception {
    try {
      GetDb2SaasTuneableParamOptions getDb2SaasTuneableParamOptions = new GetDb2SaasTuneableParamOptions();

      // Invoke operation
      Response<SuccessTuneableParams> response = service.getDb2SaasTuneableParam(getDb2SaasTuneableParamOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessTuneableParams successTuneableParamsResult = response.getResult();
      assertNotNull(successTuneableParamsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasTuneableParam" })
  public void testGetDb2SaasBackup() throws Exception {
    try {
      GetDb2SaasBackupOptions getDb2SaasBackupOptions = new GetDb2SaasBackupOptions.Builder()
        .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
        .build();

      // Invoke operation
      Response<SuccessGetBackups> response = service.getDb2SaasBackup(getDb2SaasBackupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessGetBackups successGetBackupsResult = response.getResult();
      assertNotNull(successGetBackupsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDb2SaasBackup" })
  public void testPostDb2SaasBackup() throws Exception {
    try {
      PostDb2SaasBackupOptions postDb2SaasBackupOptions = new PostDb2SaasBackupOptions.Builder()
        .xDbProfile("crn%3Av1%3Astaging%3Apublic%3Adashdb-for-transactions%3Aus-south%3Aa%2Fe7e3e87b512f474381c0684a5ecbba03%3A39269573-e43f-43e8-8b93-09f44c2ff875%3A%3A")
        .build();

      // Invoke operation
      Response<SuccessCreateBackup> response = service.postDb2SaasBackup(postDb2SaasBackupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessCreateBackup successCreateBackupResult = response.getResult();
      assertNotNull(successCreateBackupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPostDb2SaasBackup" })
  public void testDeleteDb2SaasUser() throws Exception {
    try {
      DeleteDb2SaasUserOptions deleteDb2SaasUserOptions = new DeleteDb2SaasUserOptions.Builder()
        .xDeploymentId("crn:v1:staging:public:dashdb-for-transactions:us-south:a/e7e3e87b512f474381c0684a5ecbba03:69db420f-33d5-4953-8bd8-1950abd356f6::")
        .id("test-user")
        .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.deleteDb2SaasUser(deleteDb2SaasUserOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();
      assertNotNull(resultResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
