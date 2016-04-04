/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.KeyServerMonitorEncryptedSeedsFetcher;
import vspk.v3_2.fetchers.KeyServerMonitorEncryptedSEKsFetcher;
import vspk.v3_2.fetchers.KeyServerMonitorSeedsFetcher;
import vspk.v3_2.fetchers.KeyServerMonitorSEKsFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyServerMonitor extends RestObject {

   public final static String REST_NAME = "keyservermonitor";
   public final static String RESOURCE_NAME = "keyservermonitors";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "enterpriseSecuredDataRecordCount")
   protected int enterpriseSecuredDataRecordCount;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gatewaySecuredDataRecordCount")
   protected int gatewaySecuredDataRecordCount;
   
   @JsonProperty(value = "keyserverMonitorEncryptedSEKCount")
   protected int keyserverMonitorEncryptedSEKCount;
   
   @JsonProperty(value = "keyserverMonitorEncryptedSeedCount")
   protected int keyserverMonitorEncryptedSeedCount;
   
   @JsonProperty(value = "keyserverMonitorSEKCount")
   protected int keyserverMonitorSEKCount;
   
   @JsonProperty(value = "keyserverMonitorSeedCount")
   protected int keyserverMonitorSeedCount;
   
   @JsonProperty(value = "lastUpdateTime")
   protected int lastUpdateTime;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private KeyServerMonitorEncryptedSeedsFetcher keyServerMonitorEncryptedSeeds;
   
   @JsonIgnore
   private KeyServerMonitorEncryptedSEKsFetcher keyServerMonitorEncryptedSEKs;
   
   @JsonIgnore
   private KeyServerMonitorSeedsFetcher keyServerMonitorSeeds;
   
   @JsonIgnore
   private KeyServerMonitorSEKsFetcher keyServerMonitorSEKs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public KeyServerMonitor() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      keyServerMonitorEncryptedSeeds = new KeyServerMonitorEncryptedSeedsFetcher(this);
      
      keyServerMonitorEncryptedSEKs = new KeyServerMonitorEncryptedSEKsFetcher(this);
      
      keyServerMonitorSeeds = new KeyServerMonitorSeedsFetcher(this);
      
      keyServerMonitorSEKs = new KeyServerMonitorSEKsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public int getEnterpriseSecuredDataRecordCount() {
      return enterpriseSecuredDataRecordCount;
   }

   public void setEnterpriseSecuredDataRecordCount(int value) { 
      this.enterpriseSecuredDataRecordCount = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public int getGatewaySecuredDataRecordCount() {
      return gatewaySecuredDataRecordCount;
   }

   public void setGatewaySecuredDataRecordCount(int value) { 
      this.gatewaySecuredDataRecordCount = value;
   }
   public int getKeyserverMonitorEncryptedSEKCount() {
      return keyserverMonitorEncryptedSEKCount;
   }

   public void setKeyserverMonitorEncryptedSEKCount(int value) { 
      this.keyserverMonitorEncryptedSEKCount = value;
   }
   public int getKeyserverMonitorEncryptedSeedCount() {
      return keyserverMonitorEncryptedSeedCount;
   }

   public void setKeyserverMonitorEncryptedSeedCount(int value) { 
      this.keyserverMonitorEncryptedSeedCount = value;
   }
   public int getKeyserverMonitorSEKCount() {
      return keyserverMonitorSEKCount;
   }

   public void setKeyserverMonitorSEKCount(int value) { 
      this.keyserverMonitorSEKCount = value;
   }
   public int getKeyserverMonitorSeedCount() {
      return keyserverMonitorSeedCount;
   }

   public void setKeyserverMonitorSeedCount(int value) { 
      this.keyserverMonitorSeedCount = value;
   }
   public int getLastUpdateTime() {
      return lastUpdateTime;
   }

   public void setLastUpdateTime(int value) { 
      this.lastUpdateTime = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeeds() {
      return keyServerMonitorEncryptedSeeds;
   }
   
   public KeyServerMonitorEncryptedSEKsFetcher getKeyServerMonitorEncryptedSEKs() {
      return keyServerMonitorEncryptedSEKs;
   }
   
   public KeyServerMonitorSeedsFetcher getKeyServerMonitorSeeds() {
      return keyServerMonitorSeeds;
   }
   
   public KeyServerMonitorSEKsFetcher getKeyServerMonitorSEKs() {
      return keyServerMonitorSEKs;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "KeyServerMonitor [" + "enterpriseSecuredDataRecordCount=" + enterpriseSecuredDataRecordCount + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewaySecuredDataRecordCount=" + gatewaySecuredDataRecordCount + ", keyserverMonitorEncryptedSEKCount=" + keyserverMonitorEncryptedSEKCount + ", keyserverMonitorEncryptedSeedCount=" + keyserverMonitorEncryptedSeedCount + ", keyserverMonitorSEKCount=" + keyserverMonitorSEKCount + ", keyserverMonitorSeedCount=" + keyserverMonitorSeedCount + ", lastUpdateTime=" + lastUpdateTime + ", lastUpdatedBy=" + lastUpdatedBy + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}