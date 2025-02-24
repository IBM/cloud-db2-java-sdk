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
 * Unit test class for the SuccessTuneableParamsTuneableParamRegistry model.
 */
public class SuccessTuneableParamsTuneableParamRegistryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSuccessTuneableParamsTuneableParamRegistry() throws Throwable {
    SuccessTuneableParamsTuneableParamRegistry successTuneableParamsTuneableParamRegistryModel = new SuccessTuneableParamsTuneableParamRegistry();
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Bidi());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Compopt());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2LockToRb());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Stmm());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2AlternateAuthzBehaviour());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Antijoin());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2AtsEnable());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2DeferredPrepareSemantics());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Evaluncommitted());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2ExtendedOptimization());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2IndexPctfreeDefault());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2InlistToNljn());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2MinimizeListprefetch());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2ObjectTableEntries());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Optprofile());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2OptstatsLog());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2OptMaxTempSize());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2ParallelIo());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2ReducedOptimization());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Selectivity());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Skipdeleted());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Skipinserted());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2SyncReleaseLockAttributes());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2TruncateReusestorage());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2UseAlternatePageCleaning());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2ViewReoptValues());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2WlmSettings());
    assertNull(successTuneableParamsTuneableParamRegistryModel.getDB2Workload());
  }
}