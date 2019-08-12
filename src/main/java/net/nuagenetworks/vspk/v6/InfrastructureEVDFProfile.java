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
@RestEntity(restName = "infrastructureevdfprofile", resourceName = "infrastructureevdfprofiles")
public class InfrastructureEVDFProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ENuagePlatform { KVM, KVM_K8S, KVM_LXC };

   
   @JsonProperty(value = "NTPServerKey")
   
   protected String NTPServerKey;
   
   @JsonProperty(value = "NTPServerKeyID")
   
   protected Long NTPServerKeyID;
   
   @JsonProperty(value = "activeController")
   
   protected String activeController;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseID")
   
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "nuagePlatform")
   
   protected ENuagePlatform nuagePlatform;
   
   @JsonProperty(value = "proxyDNSName")
   
   protected String proxyDNSName;
   
   @JsonProperty(value = "serviceIPv4Subnet")
   
   protected String serviceIPv4Subnet;
   
   @JsonProperty(value = "standbyController")
   
   protected String standbyController;
   
   @JsonProperty(value = "useTwoFactor")
   
   protected Boolean useTwoFactor;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public InfrastructureEVDFProfile() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getNTPServerKey() {
      return NTPServerKey;
   }

   @JsonIgnore
   public void setNTPServerKey(String value) { 
      this.NTPServerKey = value;
   }
   
   
   @JsonIgnore
   public Long getNTPServerKeyID() {
      return NTPServerKeyID;
   }

   @JsonIgnore
   public void setNTPServerKeyID(Long value) { 
      this.NTPServerKeyID = value;
   }
   
   
   @JsonIgnore
   public String getActiveController() {
      return activeController;
   }

   @JsonIgnore
   public void setActiveController(String value) { 
      this.activeController = value;
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
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
   }
   
   
   @JsonIgnore
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public ENuagePlatform getNuagePlatform() {
      return nuagePlatform;
   }

   @JsonIgnore
   public void setNuagePlatform(ENuagePlatform value) { 
      this.nuagePlatform = value;
   }
   
   
   @JsonIgnore
   public String getProxyDNSName() {
      return proxyDNSName;
   }

   @JsonIgnore
   public void setProxyDNSName(String value) { 
      this.proxyDNSName = value;
   }
   
   
   @JsonIgnore
   public String getServiceIPv4Subnet() {
      return serviceIPv4Subnet;
   }

   @JsonIgnore
   public void setServiceIPv4Subnet(String value) { 
      this.serviceIPv4Subnet = value;
   }
   
   
   @JsonIgnore
   public String getStandbyController() {
      return standbyController;
   }

   @JsonIgnore
   public void setStandbyController(String value) { 
      this.standbyController = value;
   }
   
   
   @JsonIgnore
   public Boolean getUseTwoFactor() {
      return useTwoFactor;
   }

   @JsonIgnore
   public void setUseTwoFactor(Boolean value) { 
      this.useTwoFactor = value;
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
      return "InfrastructureEVDFProfile [" + "NTPServerKey=" + NTPServerKey + ", NTPServerKeyID=" + NTPServerKeyID + ", activeController=" + activeController + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", nuagePlatform=" + nuagePlatform + ", proxyDNSName=" + proxyDNSName + ", serviceIPv4Subnet=" + serviceIPv4Subnet + ", standbyController=" + standbyController + ", useTwoFactor=" + useTwoFactor + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}