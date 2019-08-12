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
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "keyservermonitorencryptedseed", resourceName = "keyservermonitorencryptedseeds")
public class KeyServerMonitorEncryptedSeed extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ESeedType { STANDARD, DR };

   
   @JsonProperty(value = "SEKCreationTime")
   
   protected Long SEKCreationTime;
   
   @JsonProperty(value = "associatedKeyServerMonitorSEKCreationTime")
   
   protected Long associatedKeyServerMonitorSEKCreationTime;
   
   @JsonProperty(value = "associatedKeyServerMonitorSEKID")
   
   protected String associatedKeyServerMonitorSEKID;
   
   @JsonProperty(value = "associatedKeyServerMonitorSeedCreationTime")
   
   protected Long associatedKeyServerMonitorSeedCreationTime;
   
   @JsonProperty(value = "associatedKeyServerMonitorSeedID")
   
   protected String associatedKeyServerMonitorSeedID;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseSecuredDataID")
   
   protected String enterpriseSecuredDataID;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "keyServerCertificateSerialNumber")
   
   protected Long keyServerCertificateSerialNumber;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "seedType")
   
   protected ESeedType seedType;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public KeyServerMonitorEncryptedSeed() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Long getSEKCreationTime() {
      return SEKCreationTime;
   }

   @JsonIgnore
   public void setSEKCreationTime(Long value) { 
      this.SEKCreationTime = value;
   }
   
   
   @JsonIgnore
   public Long getAssociatedKeyServerMonitorSEKCreationTime() {
      return associatedKeyServerMonitorSEKCreationTime;
   }

   @JsonIgnore
   public void setAssociatedKeyServerMonitorSEKCreationTime(Long value) { 
      this.associatedKeyServerMonitorSEKCreationTime = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedKeyServerMonitorSEKID() {
      return associatedKeyServerMonitorSEKID;
   }

   @JsonIgnore
   public void setAssociatedKeyServerMonitorSEKID(String value) { 
      this.associatedKeyServerMonitorSEKID = value;
   }
   
   
   @JsonIgnore
   public Long getAssociatedKeyServerMonitorSeedCreationTime() {
      return associatedKeyServerMonitorSeedCreationTime;
   }

   @JsonIgnore
   public void setAssociatedKeyServerMonitorSeedCreationTime(Long value) { 
      this.associatedKeyServerMonitorSeedCreationTime = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedKeyServerMonitorSeedID() {
      return associatedKeyServerMonitorSeedID;
   }

   @JsonIgnore
   public void setAssociatedKeyServerMonitorSeedID(String value) { 
      this.associatedKeyServerMonitorSeedID = value;
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
   public String getEnterpriseSecuredDataID() {
      return enterpriseSecuredDataID;
   }

   @JsonIgnore
   public void setEnterpriseSecuredDataID(String value) { 
      this.enterpriseSecuredDataID = value;
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
   public Long getKeyServerCertificateSerialNumber() {
      return keyServerCertificateSerialNumber;
   }

   @JsonIgnore
   public void setKeyServerCertificateSerialNumber(Long value) { 
      this.keyServerCertificateSerialNumber = value;
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
   public ESeedType getSeedType() {
      return seedType;
   }

   @JsonIgnore
   public void setSeedType(ESeedType value) { 
      this.seedType = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "KeyServerMonitorEncryptedSeed [" + "SEKCreationTime=" + SEKCreationTime + ", associatedKeyServerMonitorSEKCreationTime=" + associatedKeyServerMonitorSEKCreationTime + ", associatedKeyServerMonitorSEKID=" + associatedKeyServerMonitorSEKID + ", associatedKeyServerMonitorSeedCreationTime=" + associatedKeyServerMonitorSeedCreationTime + ", associatedKeyServerMonitorSeedID=" + associatedKeyServerMonitorSeedID + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseSecuredDataID=" + enterpriseSecuredDataID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", keyServerCertificateSerialNumber=" + keyServerCertificateSerialNumber + ", lastUpdatedBy=" + lastUpdatedBy + ", seedType=" + seedType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}