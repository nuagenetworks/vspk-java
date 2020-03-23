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
@RestEntity(restName = "bootstrap", resourceName = "bootstraps")
public class Bootstrap extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EZFBMatchAttribute { HOSTNAME, IP_ADDRESS, MAC_ADDRESS, NONE, NSGATEWAY_ID, SERIAL_NUMBER, UUID };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EStatus { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT, QUARANTINED, REVOKED };

   
   @JsonProperty(value = "ZFBInfo")
   
   protected String ZFBInfo;
   
   @JsonProperty(value = "ZFBMatchAttribute")
   
   protected EZFBMatchAttribute ZFBMatchAttribute;
   
   @JsonProperty(value = "ZFBMatchValue")
   
   protected String ZFBMatchValue;
   
   @JsonProperty(value = "activationURL")
   
   protected String activationURL;
   
   @JsonProperty(value = "associatedEntityType")
   
   protected String associatedEntityType;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "installerID")
   
   protected String installerID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public Bootstrap() {
      status = EStatus.INACTIVE;
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getZFBInfo() {
      return ZFBInfo;
   }

   @JsonIgnore
   public void setZFBInfo(String value) { 
      this.ZFBInfo = value;
   }
   
   
   @JsonIgnore
   public EZFBMatchAttribute getZFBMatchAttribute() {
      return ZFBMatchAttribute;
   }

   @JsonIgnore
   public void setZFBMatchAttribute(EZFBMatchAttribute value) { 
      this.ZFBMatchAttribute = value;
   }
   
   
   @JsonIgnore
   public String getZFBMatchValue() {
      return ZFBMatchValue;
   }

   @JsonIgnore
   public void setZFBMatchValue(String value) { 
      this.ZFBMatchValue = value;
   }
   
   
   @JsonIgnore
   public String getActivationURL() {
      return activationURL;
   }

   @JsonIgnore
   public void setActivationURL(String value) { 
      this.activationURL = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEntityType() {
      return associatedEntityType;
   }

   @JsonIgnore
   public void setAssociatedEntityType(String value) { 
      this.associatedEntityType = value;
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
   public String getInstallerID() {
      return installerID;
   }

   @JsonIgnore
   public void setInstallerID(String value) { 
      this.installerID = value;
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
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
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
      return "Bootstrap [" + "ZFBInfo=" + ZFBInfo + ", ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchValue=" + ZFBMatchValue + ", activationURL=" + activationURL + ", associatedEntityType=" + associatedEntityType + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", installerID=" + installerID + ", lastUpdatedBy=" + lastUpdatedBy + ", status=" + status + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}