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

package net.nuagenetworks.vspk.v4_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ikepsk", resourceName = "ikepsks")
public class IKEPSK extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "signature")
   protected String signature;
   
   @JsonProperty(value = "signingCertificateSerialNumber")
   protected Long signingCertificateSerialNumber;
   
   @JsonProperty(value = "encryptedPSK")
   protected String encryptedPSK;
   
   @JsonProperty(value = "encryptingCertificateSerialNumber")
   protected Long encryptingCertificateSerialNumber;
   
   @JsonProperty(value = "unencryptedPSK")
   protected String unencryptedPSK;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "associatedEnterpriseID")
   protected String associatedEnterpriseID;
   
   @JsonProperty(value = "autoCreated")
   protected Boolean autoCreated;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public IKEPSK() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   @JsonIgnore
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   @JsonIgnore
   public String getSignature() {
      return signature;
   }

   @JsonIgnore
   public void setSignature(String value) { 
      this.signature = value;
   }
   @JsonIgnore
   public Long getSigningCertificateSerialNumber() {
      return signingCertificateSerialNumber;
   }

   @JsonIgnore
   public void setSigningCertificateSerialNumber(Long value) { 
      this.signingCertificateSerialNumber = value;
   }
   @JsonIgnore
   public String getEncryptedPSK() {
      return encryptedPSK;
   }

   @JsonIgnore
   public void setEncryptedPSK(String value) { 
      this.encryptedPSK = value;
   }
   @JsonIgnore
   public Long getEncryptingCertificateSerialNumber() {
      return encryptingCertificateSerialNumber;
   }

   @JsonIgnore
   public void setEncryptingCertificateSerialNumber(Long value) { 
      this.encryptingCertificateSerialNumber = value;
   }
   @JsonIgnore
   public String getUnencryptedPSK() {
      return unencryptedPSK;
   }

   @JsonIgnore
   public void setUnencryptedPSK(String value) { 
      this.unencryptedPSK = value;
   }
   @JsonIgnore
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   @JsonIgnore
   public String getAssociatedEnterpriseID() {
      return associatedEnterpriseID;
   }

   @JsonIgnore
   public void setAssociatedEnterpriseID(String value) { 
      this.associatedEnterpriseID = value;
   }
   @JsonIgnore
   public Boolean getAutoCreated() {
      return autoCreated;
   }

   @JsonIgnore
   public void setAutoCreated(Boolean value) { 
      this.autoCreated = value;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "IKEPSK [" + "name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", description=" + description + ", signature=" + signature + ", signingCertificateSerialNumber=" + signingCertificateSerialNumber + ", encryptedPSK=" + encryptedPSK + ", encryptingCertificateSerialNumber=" + encryptingCertificateSerialNumber + ", unencryptedPSK=" + unencryptedPSK + ", entityScope=" + entityScope + ", associatedEnterpriseID=" + associatedEnterpriseID + ", autoCreated=" + autoCreated + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}