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
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "zfbrequest", resourceName = "zfbrequests")
public class ZFBRequest extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EZFBApprovalStatus { APPROVED, ASSIGNED, DENIED, UNASSIGNED };
   public enum EAssociatedEntityType { GATEWAY, NSGATEWAY };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ERequestType { SELF_REBOOTSTRAP, ZFB };

   
   @JsonProperty(value = "CPUType")
   
   protected String CPUType;
   
   @JsonProperty(value = "IPAddress")
   
   protected String IPAddress;
   
   @JsonProperty(value = "MACAddress")
   
   protected String MACAddress;
   
   @JsonProperty(value = "NSGVersion")
   
   protected String NSGVersion;
   
   @JsonProperty(value = "SKU")
   
   protected String SKU;
   
   @JsonProperty(value = "UUID")
   
   protected String UUID;
   
   @JsonProperty(value = "ZFBApprovalStatus")
   
   protected EZFBApprovalStatus ZFBApprovalStatus;
   
   @JsonProperty(value = "ZFBBootstrapEnabled")
   
   protected Boolean ZFBBootstrapEnabled;
   
   @JsonProperty(value = "ZFBInfo")
   
   protected String ZFBInfo;
   
   @JsonProperty(value = "ZFBRequestRetryTimer")
   
   protected Long ZFBRequestRetryTimer;
   
   @JsonProperty(value = "associatedEnterpriseID")
   
   protected String associatedEnterpriseID;
   
   @JsonProperty(value = "associatedEnterpriseName")
   
   protected String associatedEnterpriseName;
   
   @JsonProperty(value = "associatedEntityType")
   
   protected EAssociatedEntityType associatedEntityType;
   
   @JsonProperty(value = "associatedGatewayID")
   
   protected String associatedGatewayID;
   
   @JsonProperty(value = "associatedGatewayName")
   
   protected String associatedGatewayName;
   
   @JsonProperty(value = "associatedNSGatewayID")
   
   protected String associatedNSGatewayID;
   
   @JsonProperty(value = "associatedNSGatewayName")
   
   protected String associatedNSGatewayName;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "family")
   
   protected String family;
   
   @JsonProperty(value = "hostname")
   
   protected String hostname;
   
   @JsonProperty(value = "lastConnectedTime")
   
   protected Float lastConnectedTime;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "originalEnterpriseName")
   
   protected String originalEnterpriseName;
   
   @JsonProperty(value = "originalGatewayDatapathID")
   
   protected String originalGatewayDatapathID;
   
   @JsonProperty(value = "originalGatewayName")
   
   protected String originalGatewayName;
   
   @JsonProperty(value = "originalUplinkConnectionInfo")
   
   protected String originalUplinkConnectionInfo;
   
   @JsonProperty(value = "registrationURL")
   
   protected String registrationURL;
   
   @JsonProperty(value = "requestType")
   
   protected ERequestType requestType;
   
   @JsonProperty(value = "serialNumber")
   
   protected String serialNumber;
   
   @JsonProperty(value = "statusString")
   
   protected String statusString;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public ZFBRequest() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
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
   public String getIPAddress() {
      return IPAddress;
   }

   @JsonIgnore
   public void setIPAddress(String value) { 
      this.IPAddress = value;
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
   public String getNSGVersion() {
      return NSGVersion;
   }

   @JsonIgnore
   public void setNSGVersion(String value) { 
      this.NSGVersion = value;
   }
   
   
   @JsonIgnore
   public String getSKU() {
      return SKU;
   }

   @JsonIgnore
   public void setSKU(String value) { 
      this.SKU = value;
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
   public EZFBApprovalStatus getZFBApprovalStatus() {
      return ZFBApprovalStatus;
   }

   @JsonIgnore
   public void setZFBApprovalStatus(EZFBApprovalStatus value) { 
      this.ZFBApprovalStatus = value;
   }
   
   
   @JsonIgnore
   public Boolean getZFBBootstrapEnabled() {
      return ZFBBootstrapEnabled;
   }

   @JsonIgnore
   public void setZFBBootstrapEnabled(Boolean value) { 
      this.ZFBBootstrapEnabled = value;
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
   public Long getZFBRequestRetryTimer() {
      return ZFBRequestRetryTimer;
   }

   @JsonIgnore
   public void setZFBRequestRetryTimer(Long value) { 
      this.ZFBRequestRetryTimer = value;
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
   public String getAssociatedEnterpriseName() {
      return associatedEnterpriseName;
   }

   @JsonIgnore
   public void setAssociatedEnterpriseName(String value) { 
      this.associatedEnterpriseName = value;
   }
   
   
   @JsonIgnore
   public EAssociatedEntityType getAssociatedEntityType() {
      return associatedEntityType;
   }

   @JsonIgnore
   public void setAssociatedEntityType(EAssociatedEntityType value) { 
      this.associatedEntityType = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGatewayID() {
      return associatedGatewayID;
   }

   @JsonIgnore
   public void setAssociatedGatewayID(String value) { 
      this.associatedGatewayID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGatewayName() {
      return associatedGatewayName;
   }

   @JsonIgnore
   public void setAssociatedGatewayName(String value) { 
      this.associatedGatewayName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNSGatewayID() {
      return associatedNSGatewayID;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayID(String value) { 
      this.associatedNSGatewayID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNSGatewayName() {
      return associatedNSGatewayName;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayName(String value) { 
      this.associatedNSGatewayName = value;
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
   public String getFamily() {
      return family;
   }

   @JsonIgnore
   public void setFamily(String value) { 
      this.family = value;
   }
   
   
   @JsonIgnore
   public String getHostname() {
      return hostname;
   }

   @JsonIgnore
   public void setHostname(String value) { 
      this.hostname = value;
   }
   
   
   @JsonIgnore
   public Float getLastConnectedTime() {
      return lastConnectedTime;
   }

   @JsonIgnore
   public void setLastConnectedTime(Float value) { 
      this.lastConnectedTime = value;
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
   public String getOriginalEnterpriseName() {
      return originalEnterpriseName;
   }

   @JsonIgnore
   public void setOriginalEnterpriseName(String value) { 
      this.originalEnterpriseName = value;
   }
   
   
   @JsonIgnore
   public String getOriginalGatewayDatapathID() {
      return originalGatewayDatapathID;
   }

   @JsonIgnore
   public void setOriginalGatewayDatapathID(String value) { 
      this.originalGatewayDatapathID = value;
   }
   
   
   @JsonIgnore
   public String getOriginalGatewayName() {
      return originalGatewayName;
   }

   @JsonIgnore
   public void setOriginalGatewayName(String value) { 
      this.originalGatewayName = value;
   }
   
   
   @JsonIgnore
   public String getOriginalUplinkConnectionInfo() {
      return originalUplinkConnectionInfo;
   }

   @JsonIgnore
   public void setOriginalUplinkConnectionInfo(String value) { 
      this.originalUplinkConnectionInfo = value;
   }
   
   
   @JsonIgnore
   public String getRegistrationURL() {
      return registrationURL;
   }

   @JsonIgnore
   public void setRegistrationURL(String value) { 
      this.registrationURL = value;
   }
   
   
   @JsonIgnore
   public ERequestType getRequestType() {
      return requestType;
   }

   @JsonIgnore
   public void setRequestType(ERequestType value) { 
      this.requestType = value;
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
   public String getStatusString() {
      return statusString;
   }

   @JsonIgnore
   public void setStatusString(String value) { 
      this.statusString = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "ZFBRequest [" + "CPUType=" + CPUType + ", IPAddress=" + IPAddress + ", MACAddress=" + MACAddress + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", UUID=" + UUID + ", ZFBApprovalStatus=" + ZFBApprovalStatus + ", ZFBBootstrapEnabled=" + ZFBBootstrapEnabled + ", ZFBInfo=" + ZFBInfo + ", ZFBRequestRetryTimer=" + ZFBRequestRetryTimer + ", associatedEnterpriseID=" + associatedEnterpriseID + ", associatedEnterpriseName=" + associatedEnterpriseName + ", associatedEntityType=" + associatedEntityType + ", associatedGatewayID=" + associatedGatewayID + ", associatedGatewayName=" + associatedGatewayName + ", associatedNSGatewayID=" + associatedNSGatewayID + ", associatedNSGatewayName=" + associatedNSGatewayName + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", hostname=" + hostname + ", lastConnectedTime=" + lastConnectedTime + ", lastUpdatedBy=" + lastUpdatedBy + ", originalEnterpriseName=" + originalEnterpriseName + ", originalGatewayDatapathID=" + originalGatewayDatapathID + ", originalGatewayName=" + originalGatewayName + ", originalUplinkConnectionInfo=" + originalUplinkConnectionInfo + ", registrationURL=" + registrationURL + ", requestType=" + requestType + ", serialNumber=" + serialNumber + ", statusString=" + statusString + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}