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
@RestEntity(restName = "allgateway", resourceName = "allgateways")
public class AllGateway extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EZFBMatchAttribute { HOSTNAME, IP_ADDRESS, MAC_ADDRESS, NONE, NSGATEWAY_ID, SERIAL_NUMBER, UUID };
   public enum EBootstrapStatus { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT, QUARANTINED, REVOKED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EFamily { ANY, NSG_AMI, NSG_AZ, NSG_C, NSG_DOCKER, NSG_E, NSG_E200, NSG_E300, NSG_V, NSG_X, NSG_X200, VRS };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EPersonality { DC7X50, EVDF, EVDFB, HARDWARE_VTEP, NETCONF_7X50, NETCONF_THIRDPARTY_HW_VTEP, NSG, NSGBR, NSGDUC, NUAGE_210_WBX_32_Q, NUAGE_210_WBX_48_S, OTHER, VDFG, VRSB, VRSG, VSA, VSG };

   
   @JsonProperty(value = "BIOSReleaseDate")
   
   protected String BIOSReleaseDate;
   
   @JsonProperty(value = "BIOSVersion")
   
   protected String BIOSVersion;
   
   @JsonProperty(value = "CPUType")
   
   protected String CPUType;
   
   @JsonProperty(value = "MACAddress")
   
   protected String MACAddress;
   
   @JsonProperty(value = "UUID")
   
   protected String UUID;
   
   @JsonProperty(value = "ZFBMatchAttribute")
   
   protected EZFBMatchAttribute ZFBMatchAttribute;
   
   @JsonProperty(value = "ZFBMatchValue")
   
   protected String ZFBMatchValue;
   
   @JsonProperty(value = "associatedGatewaySecurityID")
   
   protected String associatedGatewaySecurityID;
   
   @JsonProperty(value = "associatedGatewaySecurityProfileID")
   
   protected String associatedGatewaySecurityProfileID;
   
   @JsonProperty(value = "associatedNSGInfoID")
   
   protected String associatedNSGInfoID;
   
   @JsonProperty(value = "associatedNetconfProfileID")
   
   protected String associatedNetconfProfileID;
   
   @JsonProperty(value = "autoDiscGatewayID")
   
   protected String autoDiscGatewayID;
   
   @JsonProperty(value = "bootstrapID")
   
   protected String bootstrapID;
   
   @JsonProperty(value = "bootstrapStatus")
   
   protected EBootstrapStatus bootstrapStatus;
   
   @JsonProperty(value = "datapathID")
   
   protected String datapathID;
   
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
   
   @JsonProperty(value = "family")
   
   protected EFamily family;
   
   @JsonProperty(value = "gatewayConnected")
   
   protected Boolean gatewayConnected;
   
   @JsonProperty(value = "gatewayVersion")
   
   protected String gatewayVersion;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "libraries")
   
   protected String libraries;
   
   @JsonProperty(value = "locationID")
   
   protected String locationID;
   
   @JsonProperty(value = "managementID")
   
   protected String managementID;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "patches")
   
   protected String patches;
   
   @JsonProperty(value = "peer")
   
   protected String peer;
   
   @JsonProperty(value = "pending")
   
   protected Boolean pending;
   
   @JsonProperty(value = "permittedAction")
   
   protected EPermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   
   protected EPersonality personality;
   
   @JsonProperty(value = "productName")
   
   protected String productName;
   
   @JsonProperty(value = "redundancyGroupID")
   
   protected String redundancyGroupID;
   
   @JsonProperty(value = "serialNumber")
   
   protected String serialNumber;
   
   @JsonProperty(value = "systemID")
   
   protected String systemID;
   
   @JsonProperty(value = "templateID")
   
   protected String templateID;
   
   @JsonProperty(value = "useGatewayVLANVNID")
   
   protected Boolean useGatewayVLANVNID;
   
   @JsonProperty(value = "vtep")
   
   protected String vtep;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public AllGateway() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getBIOSReleaseDate() {
      return BIOSReleaseDate;
   }

   @JsonIgnore
   public void setBIOSReleaseDate(String value) { 
      this.BIOSReleaseDate = value;
   }
   
   
   @JsonIgnore
   public String getBIOSVersion() {
      return BIOSVersion;
   }

   @JsonIgnore
   public void setBIOSVersion(String value) { 
      this.BIOSVersion = value;
   }
   
   
   @JsonIgnore
   public String getCPUType() {
      return CPUType;
   }

   @JsonIgnore
   public void setCPUType(String value) { 
      this.CPUType = value;
   }
   
   
   @JsonIgnore
   public String getMACAddress() {
      return MACAddress;
   }

   @JsonIgnore
   public void setMACAddress(String value) { 
      this.MACAddress = value;
   }
   
   
   @JsonIgnore
   public String getUUID() {
      return UUID;
   }

   @JsonIgnore
   public void setUUID(String value) { 
      this.UUID = value;
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
   public String getAssociatedGatewaySecurityID() {
      return associatedGatewaySecurityID;
   }

   @JsonIgnore
   public void setAssociatedGatewaySecurityID(String value) { 
      this.associatedGatewaySecurityID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGatewaySecurityProfileID() {
      return associatedGatewaySecurityProfileID;
   }

   @JsonIgnore
   public void setAssociatedGatewaySecurityProfileID(String value) { 
      this.associatedGatewaySecurityProfileID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNSGInfoID() {
      return associatedNSGInfoID;
   }

   @JsonIgnore
   public void setAssociatedNSGInfoID(String value) { 
      this.associatedNSGInfoID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNetconfProfileID() {
      return associatedNetconfProfileID;
   }

   @JsonIgnore
   public void setAssociatedNetconfProfileID(String value) { 
      this.associatedNetconfProfileID = value;
   }
   
   
   @JsonIgnore
   public String getAutoDiscGatewayID() {
      return autoDiscGatewayID;
   }

   @JsonIgnore
   public void setAutoDiscGatewayID(String value) { 
      this.autoDiscGatewayID = value;
   }
   
   
   @JsonIgnore
   public String getBootstrapID() {
      return bootstrapID;
   }

   @JsonIgnore
   public void setBootstrapID(String value) { 
      this.bootstrapID = value;
   }
   
   
   @JsonIgnore
   public EBootstrapStatus getBootstrapStatus() {
      return bootstrapStatus;
   }

   @JsonIgnore
   public void setBootstrapStatus(EBootstrapStatus value) { 
      this.bootstrapStatus = value;
   }
   
   
   @JsonIgnore
   public String getDatapathID() {
      return datapathID;
   }

   @JsonIgnore
   public void setDatapathID(String value) { 
      this.datapathID = value;
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
   public EFamily getFamily() {
      return family;
   }

   @JsonIgnore
   public void setFamily(EFamily value) { 
      this.family = value;
   }
   
   
   @JsonIgnore
   public Boolean getGatewayConnected() {
      return gatewayConnected;
   }

   @JsonIgnore
   public void setGatewayConnected(Boolean value) { 
      this.gatewayConnected = value;
   }
   
   
   @JsonIgnore
   public String getGatewayVersion() {
      return gatewayVersion;
   }

   @JsonIgnore
   public void setGatewayVersion(String value) { 
      this.gatewayVersion = value;
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
   public String getLibraries() {
      return libraries;
   }

   @JsonIgnore
   public void setLibraries(String value) { 
      this.libraries = value;
   }
   
   
   @JsonIgnore
   public String getLocationID() {
      return locationID;
   }

   @JsonIgnore
   public void setLocationID(String value) { 
      this.locationID = value;
   }
   
   
   @JsonIgnore
   public String getManagementID() {
      return managementID;
   }

   @JsonIgnore
   public void setManagementID(String value) { 
      this.managementID = value;
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
   public String getPatches() {
      return patches;
   }

   @JsonIgnore
   public void setPatches(String value) { 
      this.patches = value;
   }
   
   
   @JsonIgnore
   public String getPeer() {
      return peer;
   }

   @JsonIgnore
   public void setPeer(String value) { 
      this.peer = value;
   }
   
   
   @JsonIgnore
   public Boolean getPending() {
      return pending;
   }

   @JsonIgnore
   public void setPending(Boolean value) { 
      this.pending = value;
   }
   
   
   @JsonIgnore
   public EPermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(EPermittedAction value) { 
      this.permittedAction = value;
   }
   
   
   @JsonIgnore
   public EPersonality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(EPersonality value) { 
      this.personality = value;
   }
   
   
   @JsonIgnore
   public String getProductName() {
      return productName;
   }

   @JsonIgnore
   public void setProductName(String value) { 
      this.productName = value;
   }
   
   
   @JsonIgnore
   public String getRedundancyGroupID() {
      return redundancyGroupID;
   }

   @JsonIgnore
   public void setRedundancyGroupID(String value) { 
      this.redundancyGroupID = value;
   }
   
   
   @JsonIgnore
   public String getSerialNumber() {
      return serialNumber;
   }

   @JsonIgnore
   public void setSerialNumber(String value) { 
      this.serialNumber = value;
   }
   
   
   @JsonIgnore
   public String getSystemID() {
      return systemID;
   }

   @JsonIgnore
   public void setSystemID(String value) { 
      this.systemID = value;
   }
   
   
   @JsonIgnore
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   
   
   @JsonIgnore
   public Boolean getUseGatewayVLANVNID() {
      return useGatewayVLANVNID;
   }

   @JsonIgnore
   public void setUseGatewayVLANVNID(Boolean value) { 
      this.useGatewayVLANVNID = value;
   }
   
   
   @JsonIgnore
   public String getVtep() {
      return vtep;
   }

   @JsonIgnore
   public void setVtep(String value) { 
      this.vtep = value;
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
      return "AllGateway [" + "BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", UUID=" + UUID + ", ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchValue=" + ZFBMatchValue + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", associatedNSGInfoID=" + associatedNSGInfoID + ", associatedNetconfProfileID=" + associatedNetconfProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", datapathID=" + datapathID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", gatewayConnected=" + gatewayConnected + ", gatewayVersion=" + gatewayVersion + ", lastUpdatedBy=" + lastUpdatedBy + ", libraries=" + libraries + ", locationID=" + locationID + ", managementID=" + managementID + ", name=" + name + ", patches=" + patches + ", peer=" + peer + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", productName=" + productName + ", redundancyGroupID=" + redundancyGroupID + ", serialNumber=" + serialNumber + ", systemID=" + systemID + ", templateID=" + templateID + ", useGatewayVLANVNID=" + useGatewayVLANVNID + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}