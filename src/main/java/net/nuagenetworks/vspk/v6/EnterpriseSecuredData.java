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
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "enterprisesecureddata", resourceName = "enterprisesecureddatas")
public class EnterpriseSecuredData extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ESeedType { STANDARD, DR };

   
   @JsonProperty(value = "creationDate")
   
   protected String creationDate;
   
   @JsonProperty(value = "data")
   
   protected String data;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "hash")
   
   protected String hash;
   
   @JsonProperty(value = "keyserverCertSerialNumber")
   
   protected String keyserverCertSerialNumber;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUpdatedDate")
   
   protected String lastUpdatedDate;
   
   @JsonProperty(value = "owner")
   
   protected String owner;
   
   @JsonProperty(value = "seedType")
   
   protected ESeedType seedType;
   
   @JsonProperty(value = "sekId")
   
   protected Long sekId;
   
   @JsonProperty(value = "signedHash")
   
   protected String signedHash;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public EnterpriseSecuredData() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getCreationDate() {
      return creationDate;
   }

   @JsonIgnore
   public void setCreationDate(String value) { 
      this.creationDate = value;
   }
   
   
   @JsonIgnore
   public String getData() {
      return data;
   }

   @JsonIgnore
   public void setData(String value) { 
      this.data = value;
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
   public String getHash() {
      return hash;
   }

   @JsonIgnore
   public void setHash(String value) { 
      this.hash = value;
   }
   
   
   @JsonIgnore
   public String getKeyserverCertSerialNumber() {
      return keyserverCertSerialNumber;
   }

   @JsonIgnore
   public void setKeyserverCertSerialNumber(String value) { 
      this.keyserverCertSerialNumber = value;
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
   public String getLastUpdatedDate() {
      return lastUpdatedDate;
   }

   @JsonIgnore
   public void setLastUpdatedDate(String value) { 
      this.lastUpdatedDate = value;
   }
   
   
   @JsonIgnore
   public String getOwner() {
      return owner;
   }

   @JsonIgnore
   public void setOwner(String value) { 
      this.owner = value;
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
   public Long getSekId() {
      return sekId;
   }

   @JsonIgnore
   public void setSekId(Long value) { 
      this.sekId = value;
   }
   
   
   @JsonIgnore
   public String getSignedHash() {
      return signedHash;
   }

   @JsonIgnore
   public void setSignedHash(String value) { 
      this.signedHash = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   

   public String toString() {
      return "EnterpriseSecuredData [" + "creationDate=" + creationDate + ", data=" + data + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", hash=" + hash + ", keyserverCertSerialNumber=" + keyserverCertSerialNumber + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", owner=" + owner + ", seedType=" + seedType + ", sekId=" + sekId + ", signedHash=" + signedHash + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}