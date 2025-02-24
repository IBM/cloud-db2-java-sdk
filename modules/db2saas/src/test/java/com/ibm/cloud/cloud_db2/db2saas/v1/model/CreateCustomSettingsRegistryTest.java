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

import com.ibm.cloud.cloud_db2.db2saas.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateCustomSettingsRegistry model.
 */
public class CreateCustomSettingsRegistryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateCustomSettingsRegistry() throws Throwable {
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
    assertEquals(createCustomSettingsRegistryModel.dB2Bidi(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2Compopt(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2LockToRb(), "STATEMENT");
    assertEquals(createCustomSettingsRegistryModel.dB2Stmm(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2AlternateAuthzBehaviour(), "EXTERNAL_ROUTINE_DBADM");
    assertEquals(createCustomSettingsRegistryModel.dB2Antijoin(), "EXTEND");
    assertEquals(createCustomSettingsRegistryModel.dB2AtsEnable(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2DeferredPrepareSemantics(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2Evaluncommitted(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2ExtendedOptimization(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2IndexPctfreeDefault(), "10");
    assertEquals(createCustomSettingsRegistryModel.dB2InlistToNljn(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2MinimizeListprefetch(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2ObjectTableEntries(), "5000");
    assertEquals(createCustomSettingsRegistryModel.dB2Optprofile(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2OptstatsLog(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2OptMaxTempSize(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2ParallelIo(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2ReducedOptimization(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2Selectivity(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2Skipdeleted(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2Skipinserted(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2SyncReleaseLockAttributes(), "YES");
    assertEquals(createCustomSettingsRegistryModel.dB2TruncateReusestorage(), "IMPORT");
    assertEquals(createCustomSettingsRegistryModel.dB2UseAlternatePageCleaning(), "ON");
    assertEquals(createCustomSettingsRegistryModel.dB2ViewReoptValues(), "NO");
    assertEquals(createCustomSettingsRegistryModel.dB2WlmSettings(), "-");
    assertEquals(createCustomSettingsRegistryModel.dB2Workload(), "SAP");

    String json = TestUtilities.serialize(createCustomSettingsRegistryModel);

    CreateCustomSettingsRegistry createCustomSettingsRegistryModelNew = TestUtilities.deserialize(json, CreateCustomSettingsRegistry.class);
    assertTrue(createCustomSettingsRegistryModelNew instanceof CreateCustomSettingsRegistry);
    assertEquals(createCustomSettingsRegistryModelNew.dB2Bidi(), "YES");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Compopt(), "-");
    assertEquals(createCustomSettingsRegistryModelNew.dB2LockToRb(), "STATEMENT");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Stmm(), "YES");
    assertEquals(createCustomSettingsRegistryModelNew.dB2AlternateAuthzBehaviour(), "EXTERNAL_ROUTINE_DBADM");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Antijoin(), "EXTEND");
    assertEquals(createCustomSettingsRegistryModelNew.dB2AtsEnable(), "YES");
    assertEquals(createCustomSettingsRegistryModelNew.dB2DeferredPrepareSemantics(), "YES");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Evaluncommitted(), "NO");
    assertEquals(createCustomSettingsRegistryModelNew.dB2ExtendedOptimization(), "-");
    assertEquals(createCustomSettingsRegistryModelNew.dB2IndexPctfreeDefault(), "10");
    assertEquals(createCustomSettingsRegistryModelNew.dB2InlistToNljn(), "YES");
    assertEquals(createCustomSettingsRegistryModelNew.dB2MinimizeListprefetch(), "NO");
    assertEquals(createCustomSettingsRegistryModelNew.dB2ObjectTableEntries(), "5000");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Optprofile(), "NO");
    assertEquals(createCustomSettingsRegistryModelNew.dB2OptstatsLog(), "-");
    assertEquals(createCustomSettingsRegistryModelNew.dB2OptMaxTempSize(), "-");
    assertEquals(createCustomSettingsRegistryModelNew.dB2ParallelIo(), "-");
    assertEquals(createCustomSettingsRegistryModelNew.dB2ReducedOptimization(), "-");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Selectivity(), "YES");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Skipdeleted(), "NO");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Skipinserted(), "YES");
    assertEquals(createCustomSettingsRegistryModelNew.dB2SyncReleaseLockAttributes(), "YES");
    assertEquals(createCustomSettingsRegistryModelNew.dB2TruncateReusestorage(), "IMPORT");
    assertEquals(createCustomSettingsRegistryModelNew.dB2UseAlternatePageCleaning(), "ON");
    assertEquals(createCustomSettingsRegistryModelNew.dB2ViewReoptValues(), "NO");
    assertEquals(createCustomSettingsRegistryModelNew.dB2WlmSettings(), "-");
    assertEquals(createCustomSettingsRegistryModelNew.dB2Workload(), "SAP");
  }
}