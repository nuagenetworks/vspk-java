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

package net.nuagenetworks.vspk.v6;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.KeyServerMonitorEncryptedSeedsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.KeyServerMonitorSeedsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.KeyServerMonitorSEKsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "keyservermonitor", resourceName = "keyservermonitors")
public class KeyServerMonitor extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseSecuredDataRecordCount")
   
   protected Long enterpriseSecuredDataRecordCount;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
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
   
   @JsonProperty(value = "lastUpdateTime")
   
   protected Long lastUpdateTime;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private KeyServerMonitorEncryptedSeedsFetcher keyServerMonitorEncryptedSeeds;
   
   @JsonIgnore
   private KeyServerMonitorSeedsFetcher keyServerMonitorSeeds;
   
   @JsonIgnore
   private KeyServerMonitorSEKsFetcher keyServerMonitorSEKs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public KeyServerMonitor() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      keyServerMonitorEncryptedSeeds = new KeyServerMonitorEncryptedSeedsFetcher(this);
      
      keyServerMonitorSeeds = new KeyServerMonitorSeedsFetcher(this);
      
      keyServerMonitorSEKs = new KeyServerMonitorSEKsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
   }
   
   
   @JsonIgnore
   public Long getEnterpriseSecuredDataRecordCount() {
      return enterpriseSecuredDataRecordCount;
   }

   @JsonIgnore
   public void setEnterpriseSecuredDataRecordCount(Long value) { 
      this.enterpriseSecuredDataRecordCount = value;
   }
   
   
   @JsonIgnore
   public EEntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EEntityScope value) { 
      this.entityScope = value;
   }
   
   
   @JsonIgnore
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   
   
   @JsonIgnore
   public Long getGatewaySecuredDataRecordCount() {
      return gatewaySecuredDataRecordCount;
   }

   @JsonIgnore
   public void setGatewaySecuredDataRecordCount(Long value) { 
      this.gatewaySecuredDataRecordCount = value;
   }
   
   
   @JsonIgnore
   public Long getKeyserverMonitorEncryptedSEKCount() {
      return keyserverMonitorEncryptedSEKCount;
   }

   @JsonIgnore
   public void setKeyserverMonitorEncryptedSEKCount(Long value) { 
      this.keyserverMonitorEncryptedSEKCount = value;
   }
   
   
   @JsonIgnore
   public Long getKeyserverMonitorEncryptedSeedCount() {
      return keyserverMonitorEncryptedSeedCount;
   }

   @JsonIgnore
   public void setKeyserverMonitorEncryptedSeedCount(Long value) { 
      this.keyserverMonitorEncryptedSeedCount = value;
   }
   
   
   @JsonIgnore
   public Long getKeyserverMonitorSEKCount() {
      return keyserverMonitorSEKCount;
   }

   @JsonIgnore
   public void setKeyserverMonitorSEKCount(Long value) { 
      this.keyserverMonitorSEKCount = value;
   }
   
   
   @JsonIgnore
   public Long getKeyserverMonitorSeedCount() {
      return keyserverMonitorSeedCount;
   }

   @JsonIgnore
   public void setKeyserverMonitorSeedCount(Long value) { 
      this.keyserverMonitorSeedCount = value;
   }
   
   
   @JsonIgnore
   public Long getLastUpdateTime() {
      return lastUpdateTime;
   }

   @JsonIgnore
   public void setLastUpdateTime(Long value) { 
      this.lastUpdateTime = value;
   }
   
   
   @JsonIgnore
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeeds() {
      return keyServerMonitorEncryptedSeeds;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "KeyServerMonitor [" + "embeddedMetadata=" + embeddedMetadata + ", enterpriseSecuredDataRecordCount=" + enterpriseSecuredDataRecordCount + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewaySecuredDataRecordCount=" + gatewaySecuredDataRecordCount + ", keyserverMonitorEncryptedSEKCount=" + keyserverMonitorEncryptedSEKCount + ", keyserverMonitorEncryptedSeedCount=" + keyserverMonitorEncryptedSeedCount + ", keyserverMonitorSEKCount=" + keyserverMonitorSEKCount + ", keyserverMonitorSeedCount=" + keyserverMonitorSeedCount + ", lastUpdateTime=" + lastUpdateTime + ", lastUpdatedBy=" + lastUpdatedBy + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}