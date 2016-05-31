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

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.KeyServerMonitorEncryptedSeedsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.KeyServerMonitorEncryptedSEKsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.KeyServerMonitorSeedsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.KeyServerMonitorSEKsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "keyservermonitor", resourceName = "keyservermonitors")
public class KeyServerMonitor extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "lastUpdateTime")
   protected Long lastUpdateTime;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "gatewaySecuredDataRecordCount")
   protected Long gatewaySecuredDataRecordCount;
   
   @JsonProperty(value = "keyserverMonitorEncryptedSEKCount")
   protected Long keyserverMonitorEncryptedSEKCount;
   
   @JsonProperty(value = "keyserverMonitorEncryptedSeedCount")
   protected Long keyserverMonitorEncryptedSeedCount;
   
   @JsonProperty(value = "keyserverMonitorSEKCount")
   protected Long keyserverMonitorSEKCount;
   
   @JsonProperty(value = "keyserverMonitorSeedCount")
   protected Long keyserverMonitorSeedCount;
   
   @JsonProperty(value = "enterpriseSecuredDataRecordCount")
   protected Long enterpriseSecuredDataRecordCount;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private KeyServerMonitorEncryptedSeedsFetcher keyServerMonitorEncryptedSeeds;
   
   @JsonIgnore
   private KeyServerMonitorEncryptedSEKsFetcher keyServerMonitorEncryptedSEKs;
   
   @JsonIgnore
   private KeyServerMonitorSeedsFetcher keyServerMonitorSeeds;
   
   @JsonIgnore
   private KeyServerMonitorSEKsFetcher keyServerMonitorSEKs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public KeyServerMonitor() {
      
      metadatas = new MetadatasFetcher(this);
      
      keyServerMonitorEncryptedSeeds = new KeyServerMonitorEncryptedSeedsFetcher(this);
      
      keyServerMonitorEncryptedSEKs = new KeyServerMonitorEncryptedSEKsFetcher(this);
      
      keyServerMonitorSeeds = new KeyServerMonitorSeedsFetcher(this);
      
      keyServerMonitorSEKs = new KeyServerMonitorSEKsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public Long getLastUpdateTime() {
      return lastUpdateTime;
   }

   public void setLastUpdateTime(Long value) { 
      this.lastUpdateTime = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public Long getGatewaySecuredDataRecordCount() {
      return gatewaySecuredDataRecordCount;
   }

   public void setGatewaySecuredDataRecordCount(Long value) { 
      this.gatewaySecuredDataRecordCount = value;
   }
   public Long getKeyserverMonitorEncryptedSEKCount() {
      return keyserverMonitorEncryptedSEKCount;
   }

   public void setKeyserverMonitorEncryptedSEKCount(Long value) { 
      this.keyserverMonitorEncryptedSEKCount = value;
   }
   public Long getKeyserverMonitorEncryptedSeedCount() {
      return keyserverMonitorEncryptedSeedCount;
   }

   public void setKeyserverMonitorEncryptedSeedCount(Long value) { 
      this.keyserverMonitorEncryptedSeedCount = value;
   }
   public Long getKeyserverMonitorSEKCount() {
      return keyserverMonitorSEKCount;
   }

   public void setKeyserverMonitorSEKCount(Long value) { 
      this.keyserverMonitorSEKCount = value;
   }
   public Long getKeyserverMonitorSeedCount() {
      return keyserverMonitorSeedCount;
   }

   public void setKeyserverMonitorSeedCount(Long value) { 
      this.keyserverMonitorSeedCount = value;
   }
   public Long getEnterpriseSecuredDataRecordCount() {
      return enterpriseSecuredDataRecordCount;
   }

   public void setEnterpriseSecuredDataRecordCount(Long value) { 
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
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeeds() {
      return keyServerMonitorEncryptedSeeds;
   }
   
   @JsonIgnore
   public KeyServerMonitorEncryptedSEKsFetcher getKeyServerMonitorEncryptedSEKs() {
      return keyServerMonitorEncryptedSEKs;
   }
   
   @JsonIgnore
   public KeyServerMonitorSeedsFetcher getKeyServerMonitorSeeds() {
      return keyServerMonitorSeeds;
   }
   
   @JsonIgnore
   public KeyServerMonitorSEKsFetcher getKeyServerMonitorSEKs() {
      return keyServerMonitorSEKs;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "KeyServerMonitor [" + "lastUpdateTime=" + lastUpdateTime + ", lastUpdatedBy=" + lastUpdatedBy + ", gatewaySecuredDataRecordCount=" + gatewaySecuredDataRecordCount + ", keyserverMonitorEncryptedSEKCount=" + keyserverMonitorEncryptedSEKCount + ", keyserverMonitorEncryptedSeedCount=" + keyserverMonitorEncryptedSeedCount + ", keyserverMonitorSEKCount=" + keyserverMonitorSEKCount + ", keyserverMonitorSeedCount=" + keyserverMonitorSeedCount + ", enterpriseSecuredDataRecordCount=" + enterpriseSecuredDataRecordCount + ", entityScope=" + entityScope + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}