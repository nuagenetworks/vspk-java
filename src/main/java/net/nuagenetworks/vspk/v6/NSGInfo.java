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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsginfo", resourceName = "nsginfos")
public class NSGInfo extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EBootstrapStatus { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT };
   public enum ECmdStatus { ABANDONED, COMPLETED, FAILED, RUNNING, SKIPPED, STARTED, UNKNOWN };
   public enum ECmdType { NSG_DOWNLOAD_OS_IMAGE, NSG_UPGRADE_TO_IMAGE };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EFamily { ANY, NSG_AMI, NSG_AZ, NSG_C, NSG_DOCKER, NSG_E, NSG_E200, NSG_E300, NSG_V, NSG_X, NSG_X200 };
   public enum EPersonality { NSG, NSGBR, NSGDUC };

   
   @JsonProperty(value = "AARApplicationReleaseDate")
   
   protected String AARApplicationReleaseDate;
   
   @JsonProperty(value = "AARApplicationVersion")
   
   protected String AARApplicationVersion;
   
   @JsonProperty(value = "BIOSReleaseDate")
   
   protected String BIOSReleaseDate;
   
   @JsonProperty(value = "BIOSVersion")
   
   protected String BIOSVersion;
   
   @JsonProperty(value = "CPUType")
   
   protected String CPUType;
   
   @JsonProperty(value = "MACAddress")
   
   protected String MACAddress;
   
   @JsonProperty(value = "NSGVersion")
   
   protected String NSGVersion;
   
   @JsonProperty(value = "SKU")
   
   protected String SKU;
   
   @JsonProperty(value = "TPMStatus")
   
   protected Long TPMStatus;
   
   @JsonProperty(value = "TPMVersion")
   
   protected String TPMVersion;
   
   @JsonProperty(value = "UUID")
   
   protected String UUID;
   
   @JsonProperty(value = "associatedEntityType")
   
   protected String associatedEntityType;
   
   @JsonProperty(value = "associatedNSGatewayID")
   
   protected String associatedNSGatewayID;
   
   @JsonProperty(value = "bootstrapStatus")
   
   protected EBootstrapStatus bootstrapStatus;
   
   @JsonProperty(value = "cmdDetailedStatus")
   
   protected String cmdDetailedStatus;
   
   @JsonProperty(value = "cmdDetailedStatusCode")
   
   protected Long cmdDetailedStatusCode;
   
   @JsonProperty(value = "cmdDownloadProgress")
   
   protected Object cmdDownloadProgress;
   
   @JsonProperty(value = "cmdID")
   
   protected String cmdID;
   
   @JsonProperty(value = "cmdLastUpdatedDate")
   
   protected Float cmdLastUpdatedDate;
   
   @JsonProperty(value = "cmdStatus")
   
   protected ECmdStatus cmdStatus;
   
   @JsonProperty(value = "cmdType")
   
   protected ECmdType cmdType;
   
   @JsonProperty(value = "enterpriseID")
   
   protected String enterpriseID;
   
   @JsonProperty(value = "enterpriseName")
   
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "family")
   
   protected EFamily family;
   
   @JsonProperty(value = "libraries")
   
   protected String libraries;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "patchesDetail")
   
   protected String patchesDetail;
   
   @JsonProperty(value = "personality")
   
   protected EPersonality personality;
   
   @JsonProperty(value = "productName")
   
   protected String productName;
   
   @JsonProperty(value = "serialNumber")
   
   protected String serialNumber;
   
   @JsonProperty(value = "systemID")
   
   protected String systemID;
   

   

   public NSGInfo() {
      
   }

   
   
   @JsonIgnore
   public String getAARApplicationReleaseDate() {
      return AARApplicationReleaseDate;
   }

   @JsonIgnore
   public void setAARApplicationReleaseDate(String value) { 
      this.AARApplicationReleaseDate = value;
   }
   
   
   @JsonIgnore
   public String getAARApplicationVersion() {
      return AARApplicationVersion;
   }

   @JsonIgnore
   public void setAARApplicationVersion(String value) { 
      this.AARApplicationVersion = value;
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
   public Long getTPMStatus() {
      return TPMStatus;
   }

   @JsonIgnore
   public void setTPMStatus(Long value) { 
      this.TPMStatus = value;
   }
   
   
   @JsonIgnore
   public String getTPMVersion() {
      return TPMVersion;
   }

   @JsonIgnore
   public void setTPMVersion(String value) { 
      this.TPMVersion = value;
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
   public String getAssociatedEntityType() {
      return associatedEntityType;
   }

   @JsonIgnore
   public void setAssociatedEntityType(String value) { 
      this.associatedEntityType = value;
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
   public EBootstrapStatus getBootstrapStatus() {
      return bootstrapStatus;
   }

   @JsonIgnore
   public void setBootstrapStatus(EBootstrapStatus value) { 
      this.bootstrapStatus = value;
   }
   
   
   @JsonIgnore
   public String getCmdDetailedStatus() {
      return cmdDetailedStatus;
   }

   @JsonIgnore
   public void setCmdDetailedStatus(String value) { 
      this.cmdDetailedStatus = value;
   }
   
   
   @JsonIgnore
   public Long getCmdDetailedStatusCode() {
      return cmdDetailedStatusCode;
   }

   @JsonIgnore
   public void setCmdDetailedStatusCode(Long value) { 
      this.cmdDetailedStatusCode = value;
   }
   
   
   @JsonIgnore
   public Object getCmdDownloadProgress() {
      return cmdDownloadProgress;
   }

   @JsonIgnore
   public void setCmdDownloadProgress(Object value) { 
      this.cmdDownloadProgress = value;
   }
   
   
   @JsonIgnore
   public String getCmdID() {
      return cmdID;
   }

   @JsonIgnore
   public void setCmdID(String value) { 
      this.cmdID = value;
   }
   
   
   @JsonIgnore
   public Float getCmdLastUpdatedDate() {
      return cmdLastUpdatedDate;
   }

   @JsonIgnore
   public void setCmdLastUpdatedDate(Float value) { 
      this.cmdLastUpdatedDate = value;
   }
   
   
   @JsonIgnore
   public ECmdStatus getCmdStatus() {
      return cmdStatus;
   }

   @JsonIgnore
   public void setCmdStatus(ECmdStatus value) { 
      this.cmdStatus = value;
   }
   
   
   @JsonIgnore
   public ECmdType getCmdType() {
      return cmdType;
   }

   @JsonIgnore
   public void setCmdType(ECmdType value) { 
      this.cmdType = value;
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
   public String getEnterpriseName() {
      return enterpriseName;
   }

   @JsonIgnore
   public void setEnterpriseName(String value) { 
      this.enterpriseName = value;
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
   public String getLibraries() {
      return libraries;
   }

   @JsonIgnore
   public void setLibraries(String value) { 
      this.libraries = value;
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
   public String getPatchesDetail() {
      return patchesDetail;
   }

   @JsonIgnore
   public void setPatchesDetail(String value) { 
      this.patchesDetail = value;
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
   

   

   public String toString() {
      return "NSGInfo [" + "AARApplicationReleaseDate=" + AARApplicationReleaseDate + ", AARApplicationVersion=" + AARApplicationVersion + ", BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", TPMStatus=" + TPMStatus + ", TPMVersion=" + TPMVersion + ", UUID=" + UUID + ", associatedEntityType=" + associatedEntityType + ", associatedNSGatewayID=" + associatedNSGatewayID + ", bootstrapStatus=" + bootstrapStatus + ", cmdDetailedStatus=" + cmdDetailedStatus + ", cmdDetailedStatusCode=" + cmdDetailedStatusCode + ", cmdDownloadProgress=" + cmdDownloadProgress + ", cmdID=" + cmdID + ", cmdLastUpdatedDate=" + cmdLastUpdatedDate + ", cmdStatus=" + cmdStatus + ", cmdType=" + cmdType + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", libraries=" + libraries + ", name=" + name + ", patchesDetail=" + patchesDetail + ", personality=" + personality + ", productName=" + productName + ", serialNumber=" + serialNumber + ", systemID=" + systemID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}