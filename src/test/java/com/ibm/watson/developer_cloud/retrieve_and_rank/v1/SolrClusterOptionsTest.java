/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.watson.developer_cloud.retrieve_and_rank.v1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ibm.watson.developer_cloud.retrieve_and_rank.v1.model.SolrClusterOptions;

public class SolrClusterOptionsTest {
  public static final String CLUSTER_NAME = "cluster_name";
  public static final Integer CLUSTER_SIZE = 5;

  @Test
  public void canCreateAFreeCluster() {
    final SolrClusterOptions options = new SolrClusterOptions(CLUSTER_NAME);
    assertEquals(CLUSTER_NAME, options.getClusterName());
    assertEquals(null, options.getClusterSize());
  }

  @Test
  public void canCreateASizedCluster() {
    final SolrClusterOptions options = new SolrClusterOptions(CLUSTER_NAME, CLUSTER_SIZE);
    assertEquals(CLUSTER_NAME, options.getClusterName());
    assertEquals(CLUSTER_SIZE, options.getClusterSize());
  }
}
