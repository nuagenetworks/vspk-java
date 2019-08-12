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
import net.nuagenetworks.vspk.v6.fetchers.IKEGatewayConfigsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IKESubnetsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ikegateway", resourceName = "ikegateways")
public class IKEGateway extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EIKEVersion { V1, V2 };
   public enum EIKEv1Mode { AGGRESSIVE, MAIN, NONE };
   public enum EAssociatedCloudType { AZURECLOUD };
   public enum EConfigurationStatus { CANCELING, CANCELLED, CLOUD_CONFIGURATION_REMOVED, FAILED, IN_PROGRESS, NOT_APPLICABLE, PAUSING, SUCCESS, SYNCED_FROM_CLOUD, UNKNOWN, WAITING, WAITING_FOR_RESOURCES };
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "IKEVersion")
   
   protected EIKEVersion IKEVersion;
   
   @JsonProperty(value = "IKEv1Mode")
   
   protected EIKEv1Mode IKEv1Mode;
   
   @JsonProperty(value = "IPAddress")
   
   protected String IPAddress;
   
   @JsonProperty(value = "associatedCloudID")
   
   protected String associatedCloudID;
   
   @JsonProperty(value = "associatedCloudType")
   
   protected EAssociatedCloudType associatedCloudType;
   
   @JsonProperty(value = "associatedEnterpriseID")
   
   protected String associatedEnterpriseID;
   
   @JsonProperty(value = "configurationStatus")
   
   protected EConfigurationStatus configurationStatus;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private IKEGatewayConfigsFetcher iKEGatewayConfigs;
   
   @JsonIgnore
   private IKESubnetsFetcher iKESubnets;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public IKEGateway() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      iKEGatewayConfigs = new IKEGatewayConfigsFetcher(this);
      
      iKESubnets = new IKESubnetsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EIKEVersion getIKEVersion() {
      return IKEVersion;
   }

   @JsonIgnore
   public void setIKEVersion(EIKEVersion value) { 
      this.IKEVersion = value;
   }
   
   
   @JsonIgnore
   public EIKEv1Mode getIKEv1Mode() {
      return IKEv1Mode;
   }

   @JsonIgnore
   public void setIKEv1Mode(EIKEv1Mode value) { 
      this.IKEv1Mode = value;
   }
   
   
   @JsonIgnore
   public String getIPAddress() {
      return IPAddress;
   }

   @JsonIgnore
   public void setIPAddress(String value) { 
      this.IPAddress = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedCloudID() {
      return associatedCloudID;
   }

   @JsonIgnore
   public void setAssociatedCloudID(String value) { 
      this.associatedCloudID = value;
   }
   
   
   @JsonIgnore
   public EAssociatedCloudType getAssociatedCloudType() {
      return associatedCloudType;
   }

   @JsonIgnore
   public void setAssociatedCloudType(EAssociatedCloudType value) { 
      this.associatedCloudType = value;
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
   public EConfigurationStatus getConfigurationStatus() {
      return configurationStatus;
   }

   @JsonIgnore
   public void setConfigurationStatus(EConfigurationStatus value) { 
      this.configurationStatus = value;
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
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public IKEGatewayConfigsFetcher getIKEGatewayConfigs() {
      return iKEGatewayConfigs;
   }
   
   @JsonIgnore
   public IKESubnetsFetcher getIKESubnets() {
      return iKESubnets;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "IKEGateway [" + "IKEVersion=" + IKEVersion + ", IKEv1Mode=" + IKEv1Mode + ", IPAddress=" + IPAddress + ", associatedCloudID=" + associatedCloudID + ", associatedCloudType=" + associatedCloudType + ", associatedEnterpriseID=" + associatedEnterpriseID + ", configurationStatus=" + configurationStatus + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}