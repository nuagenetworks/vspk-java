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
@RestEntity(restName = "bootstrapactivation", resourceName = "bootstrapactivations")
public class BootstrapActivation extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum Action { AUTHENTICATE, BOOTSTRAP_COMPLETE, CERTIFICATE_RENEW, CERTIFICATE_REVOKE, CERTIFICATE_SIGNED, CONFIRM, INITIATE, INITIATE_RENEW, NEW_NCPE_AUTH_REQUIRED, NO_AUTH_REQUIRED, ROLLBACK, ROLLED_BACK, UNSPECIFIED };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "cacert")
   protected String cacert;
   
   @JsonProperty(value = "hash")
   protected String hash;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "action")
   protected Action action;
   
   @JsonProperty(value = "seed")
   protected String seed;
   
   @JsonProperty(value = "cert")
   protected String cert;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "configURL")
   protected String configURL;
   
   @JsonProperty(value = "tpmOwnerPassword")
   protected String tpmOwnerPassword;
   
   @JsonProperty(value = "tpmState")
   protected Long tpmState;
   
   @JsonProperty(value = "srkPassword")
   protected String srkPassword;
   
   @JsonProperty(value = "vsdTime")
   protected Long vsdTime;
   
   @JsonProperty(value = "csr")
   protected String csr;
   
   @JsonProperty(value = "status")
   protected String status;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public BootstrapActivation() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public String getCacert() {
      return cacert;
   }

   public void setCacert(String value) { 
      this.cacert = value;
   }
   public String getHash() {
      return hash;
   }

   public void setHash(String value) { 
      this.hash = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public Action getAction() {
      return action;
   }

   public void setAction(Action value) { 
      this.action = value;
   }
   public String getSeed() {
      return seed;
   }

   public void setSeed(String value) { 
      this.seed = value;
   }
   public String getCert() {
      return cert;
   }

   public void setCert(String value) { 
      this.cert = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getConfigURL() {
      return configURL;
   }

   public void setConfigURL(String value) { 
      this.configURL = value;
   }
   public String getTpmOwnerPassword() {
      return tpmOwnerPassword;
   }

   public void setTpmOwnerPassword(String value) { 
      this.tpmOwnerPassword = value;
   }
   public Long getTpmState() {
      return tpmState;
   }

   public void setTpmState(Long value) { 
      this.tpmState = value;
   }
   public String getSrkPassword() {
      return srkPassword;
   }

   public void setSrkPassword(String value) { 
      this.srkPassword = value;
   }
   public Long getVsdTime() {
      return vsdTime;
   }

   public void setVsdTime(Long value) { 
      this.vsdTime = value;
   }
   public String getCsr() {
      return csr;
   }

   public void setCsr(String value) { 
      this.csr = value;
   }
   public String getStatus() {
      return status;
   }

   public void setStatus(String value) { 
      this.status = value;
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
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "BootstrapActivation [" + "cacert=" + cacert + ", hash=" + hash + ", lastUpdatedBy=" + lastUpdatedBy + ", action=" + action + ", seed=" + seed + ", cert=" + cert + ", entityScope=" + entityScope + ", configURL=" + configURL + ", tpmOwnerPassword=" + tpmOwnerPassword + ", tpmState=" + tpmState + ", srkPassword=" + srkPassword + ", vsdTime=" + vsdTime + ", csr=" + csr + ", status=" + status + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}