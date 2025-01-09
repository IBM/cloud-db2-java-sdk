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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfoResourcesItem;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.model.SuccessGetUserInfoResourcesItemAuthentication;
import github.com/IBM/cloud-db2-java-sdk.db2saas.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SuccessGetUserInfoResourcesItem model.
 */
public class SuccessGetUserInfoResourcesItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSuccessGetUserInfoResourcesItem() throws Throwable {
    SuccessGetUserInfoResourcesItem successGetUserInfoResourcesItemModel = new SuccessGetUserInfoResourcesItem();
    assertNull(successGetUserInfoResourcesItemModel.getDvRole());
    assertNull(successGetUserInfoResourcesItemModel.getMetadata());
    assertNull(successGetUserInfoResourcesItemModel.getFormatedIbmid());
    assertNull(successGetUserInfoResourcesItemModel.getRole());
    assertNull(successGetUserInfoResourcesItemModel.getIamid());
    assertNull(successGetUserInfoResourcesItemModel.getPermittedActions());
    assertNull(successGetUserInfoResourcesItemModel.isAllClean());
    assertNull(successGetUserInfoResourcesItemModel.getPassword());
    assertNull(successGetUserInfoResourcesItemModel.isIam());
    assertNull(successGetUserInfoResourcesItemModel.getName());
    assertNull(successGetUserInfoResourcesItemModel.getIbmid());
    assertNull(successGetUserInfoResourcesItemModel.getId());
    assertNull(successGetUserInfoResourcesItemModel.getLocked());
    assertNull(successGetUserInfoResourcesItemModel.getInitErrorMsg());
    assertNull(successGetUserInfoResourcesItemModel.getEmail());
    assertNull(successGetUserInfoResourcesItemModel.getAuthentication());
  }
}