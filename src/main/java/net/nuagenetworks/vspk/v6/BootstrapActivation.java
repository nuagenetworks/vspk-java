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
@RestEntity(restName = "bootstrapactivation", resourceName = "bootstrapactivations")
public class BootstrapActivation extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAction { AUTHENTICATE, BOOTSTRAP_COMPLETE, CERTIFICATE_RENEW, CERTIFICATE_REVOKE, CERTIFICATE_SIGNED, CONFIRM, INITIATE, INITIATE_RENEW, NEW_NCPE_AUTH_REQUIRED, NO_AUTH_REQUIRED, ROLLBACK, ROLLED_BACK, UNSPECIFIED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "action")
   
   protected EAction action;
   
   @JsonProperty(value = "associatedEntityType")
   
   protected String associatedEntityType;
   
   @JsonProperty(value = "autoBootstrap")
   
   protected Boolean autoBootstrap;
   
   @JsonProperty(value = "cacert")
   
   protected String cacert;
   
   @JsonProperty(value = "cert")
   
   protected String cert;
   
   @JsonProperty(value = "configURL")
   
   protected String configURL;
   
   @JsonProperty(value = "csr")
   
   protected String csr;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "hash")
   
   protected String hash;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "seed")
   
   protected String seed;
   
   @JsonProperty(value = "srkPassword")
   
   protected String srkPassword;
   
   @JsonProperty(value = "status")
   
   protected String status;
   
   @JsonProperty(value = "tpmOwnerPassword")
   
   protected String tpmOwnerPassword;
   
   @JsonProperty(value = "tpmState")
   
   protected Long tpmState;
   
   @JsonProperty(value = "vsdTime")
   
   protected Long vsdTime;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public BootstrapActivation() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EAction getAction() {
      return action;
   }

   @JsonIgnore
   public void setAction(EAction value) { 
      this.action = value;
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
   public Boolean getAutoBootstrap() {
      return autoBootstrap;
   }

   @JsonIgnore
   public void setAutoBootstrap(Boolean value) { 
      this.autoBootstrap = value;
   }
   
   
   @JsonIgnore
   public String getCacert() {
      return cacert;
   }

   @JsonIgnore
   public void setCacert(String value) { 
      this.cacert = value;
   }
   
   
   @JsonIgnore
   public String getCert() {
      return cert;
   }

   @JsonIgnore
   public void setCert(String value) { 
      this.cert = value;
   }
   
   
   @JsonIgnore
   public String getConfigURL() {
      return configURL;
   }

   @JsonIgnore
   public void setConfigURL(String value) { 
      this.configURL = value;
   }
   
   
   @JsonIgnore
   public String getCsr() {
      return csr;
   }

   @JsonIgnore
   public void setCsr(String value) { 
      this.csr = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   
   @JsonIgnore
   public String getSeed() {
      return seed;
   }

   @JsonIgnore
   public void setSeed(String value) { 
      this.seed = value;
   }
   
   
   @JsonIgnore
   public String getSrkPassword() {
      return srkPassword;
   }

   @JsonIgnore
   public void setSrkPassword(String value) { 
      this.srkPassword = value;
   }
   
   
   @JsonIgnore
   public String getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(String value) { 
      this.status = value;
   }
   
   
   @JsonIgnore
   public String getTpmOwnerPassword() {
      return tpmOwnerPassword;
   }

   @JsonIgnore
   public void setTpmOwnerPassword(String value) { 
      this.tpmOwnerPassword = value;
   }
   
   
   @JsonIgnore
   public Long getTpmState() {
      return tpmState;
   }

   @JsonIgnore
   public void setTpmState(Long value) { 
      this.tpmState = value;
   }
   
   
   @JsonIgnore
   public Long getVsdTime() {
      return vsdTime;
   }

   @JsonIgnore
   public void setVsdTime(Long value) { 
      this.vsdTime = value;
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
      return "BootstrapActivation [" + "action=" + action + ", associatedEntityType=" + associatedEntityType + ", autoBootstrap=" + autoBootstrap + ", cacert=" + cacert + ", cert=" + cert + ", configURL=" + configURL + ", csr=" + csr + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", hash=" + hash + ", lastUpdatedBy=" + lastUpdatedBy + ", seed=" + seed + ", srkPassword=" + srkPassword + ", status=" + status + ", tpmOwnerPassword=" + tpmOwnerPassword + ", tpmState=" + tpmState + ", vsdTime=" + vsdTime + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}