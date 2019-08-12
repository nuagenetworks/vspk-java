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


import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "license", resourceName = "licenses")
public class License extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ELicenseEncryption { ENCRYPTION_DISABLED, ENCRYPTION_ENABLED };
   public enum ELicenseType { CLUSTERED, STANDARD };

   
   @JsonProperty(value = "additionalSupportedVersions")
   
   protected String additionalSupportedVersions;
   
   @JsonProperty(value = "allowedAVRSGsCount")
   
   protected Long allowedAVRSGsCount;
   
   @JsonProperty(value = "allowedAVRSsCount")
   
   protected Long allowedAVRSsCount;
   
   @JsonProperty(value = "allowedCPEsCount")
   
   protected Long allowedCPEsCount;
   
   @JsonProperty(value = "allowedNICsCount")
   
   protected Long allowedNICsCount;
   
   @JsonProperty(value = "allowedVDFGsCount")
   
   protected Long allowedVDFGsCount;
   
   @JsonProperty(value = "allowedVDFsCount")
   
   protected Long allowedVDFsCount;
   
   @JsonProperty(value = "allowedVMsCount")
   
   protected Long allowedVMsCount;
   
   @JsonProperty(value = "allowedVRSGsCount")
   
   protected Long allowedVRSGsCount;
   
   @JsonProperty(value = "allowedVRSsCount")
   
   protected Long allowedVRSsCount;
   
   @JsonProperty(value = "city")
   
   protected String city;
   
   @JsonProperty(value = "company")
   
   protected String company;
   
   @JsonProperty(value = "country")
   
   protected String country;
   
   @JsonProperty(value = "customerKey")
   
   protected String customerKey;
   
   @JsonProperty(value = "email")
   
   protected String email;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "encryptionMode")
   
   protected Boolean encryptionMode;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "expirationDate")
   
   protected Float expirationDate;
   
   @JsonProperty(value = "expiryTimestamp")
   
   protected Long expiryTimestamp;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "isClusterLicense")
   
   protected Boolean isClusterLicense;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "license")
   
   protected String license;
   
   @JsonProperty(value = "licenseEncryption")
   
   protected ELicenseEncryption licenseEncryption;
   
   @JsonProperty(value = "licenseEntities")
   
   protected String licenseEntities;
   
   @JsonProperty(value = "licenseID")
   
   protected Long licenseID;
   
   @JsonProperty(value = "licenseType")
   
   protected ELicenseType licenseType;
   
   @JsonProperty(value = "licensedFeature")
   
   protected String licensedFeature;
   
   @JsonProperty(value = "majorRelease")
   
   protected Long majorRelease;
   
   @JsonProperty(value = "minorRelease")
   
   protected Long minorRelease;
   
   @JsonProperty(value = "phone")
   
   protected String phone;
   
   @JsonProperty(value = "productVersion")
   
   protected String productVersion;
   
   @JsonProperty(value = "provider")
   
   protected String provider;
   
   @JsonProperty(value = "requestID")
   
   protected String requestID;
   
   @JsonProperty(value = "state")
   
   protected String state;
   
   @JsonProperty(value = "street")
   
   protected String street;
   
   @JsonProperty(value = "system")
   
   protected String system;
   
   @JsonProperty(value = "uniqueLicenseIdentifier")
   
   protected String uniqueLicenseIdentifier;
   
   @JsonProperty(value = "userName")
   
   protected String userName;
   
   @JsonProperty(value = "zip")
   
   protected String zip;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public License() {
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAdditionalSupportedVersions() {
      return additionalSupportedVersions;
   }

   @JsonIgnore
   public void setAdditionalSupportedVersions(String value) { 
      this.additionalSupportedVersions = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedAVRSGsCount() {
      return allowedAVRSGsCount;
   }

   @JsonIgnore
   public void setAllowedAVRSGsCount(Long value) { 
      this.allowedAVRSGsCount = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedAVRSsCount() {
      return allowedAVRSsCount;
   }

   @JsonIgnore
   public void setAllowedAVRSsCount(Long value) { 
      this.allowedAVRSsCount = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedCPEsCount() {
      return allowedCPEsCount;
   }

   @JsonIgnore
   public void setAllowedCPEsCount(Long value) { 
      this.allowedCPEsCount = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedNICsCount() {
      return allowedNICsCount;
   }

   @JsonIgnore
   public void setAllowedNICsCount(Long value) { 
      this.allowedNICsCount = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedVDFGsCount() {
      return allowedVDFGsCount;
   }

   @JsonIgnore
   public void setAllowedVDFGsCount(Long value) { 
      this.allowedVDFGsCount = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedVDFsCount() {
      return allowedVDFsCount;
   }

   @JsonIgnore
   public void setAllowedVDFsCount(Long value) { 
      this.allowedVDFsCount = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedVMsCount() {
      return allowedVMsCount;
   }

   @JsonIgnore
   public void setAllowedVMsCount(Long value) { 
      this.allowedVMsCount = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedVRSGsCount() {
      return allowedVRSGsCount;
   }

   @JsonIgnore
   public void setAllowedVRSGsCount(Long value) { 
      this.allowedVRSGsCount = value;
   }
   
   
   @JsonIgnore
   public Long getAllowedVRSsCount() {
      return allowedVRSsCount;
   }

   @JsonIgnore
   public void setAllowedVRSsCount(Long value) { 
      this.allowedVRSsCount = value;
   }
   
   
   @JsonIgnore
   public String getCity() {
      return city;
   }

   @JsonIgnore
   public void setCity(String value) { 
      this.city = value;
   }
   
   
   @JsonIgnore
   public String getCompany() {
      return company;
   }

   @JsonIgnore
   public void setCompany(String value) { 
      this.company = value;
   }
   
   
   @JsonIgnore
   public String getCountry() {
      return country;
   }

   @JsonIgnore
   public void setCountry(String value) { 
      this.country = value;
   }
   
   
   @JsonIgnore
   public String getCustomerKey() {
      return customerKey;
   }

   @JsonIgnore
   public void setCustomerKey(String value) { 
      this.customerKey = value;
   }
   
   
   @JsonIgnore
   public String getEmail() {
      return email;
   }

   @JsonIgnore
   public void setEmail(String value) { 
      this.email = value;
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
   public Boolean getEncryptionMode() {
      return encryptionMode;
   }

   @JsonIgnore
   public void setEncryptionMode(Boolean value) { 
      this.encryptionMode = value;
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
   public Float getExpirationDate() {
      return expirationDate;
   }

   @JsonIgnore
   public void setExpirationDate(Float value) { 
      this.expirationDate = value;
   }
   
   
   @JsonIgnore
   public Long getExpiryTimestamp() {
      return expiryTimestamp;
   }

   @JsonIgnore
   public void setExpiryTimestamp(Long value) { 
      this.expiryTimestamp = value;
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
   public Boolean getIsClusterLicense() {
      return isClusterLicense;
   }

   @JsonIgnore
   public void setIsClusterLicense(Boolean value) { 
      this.isClusterLicense = value;
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
   public String getLicense() {
      return license;
   }

   @JsonIgnore
   public void setLicense(String value) { 
      this.license = value;
   }
   
   
   @JsonIgnore
   public ELicenseEncryption getLicenseEncryption() {
      return licenseEncryption;
   }

   @JsonIgnore
   public void setLicenseEncryption(ELicenseEncryption value) { 
      this.licenseEncryption = value;
   }
   
   
   @JsonIgnore
   public String getLicenseEntities() {
      return licenseEntities;
   }

   @JsonIgnore
   public void setLicenseEntities(String value) { 
      this.licenseEntities = value;
   }
   
   
   @JsonIgnore
   public Long getLicenseID() {
      return licenseID;
   }

   @JsonIgnore
   public void setLicenseID(Long value) { 
      this.licenseID = value;
   }
   
   
   @JsonIgnore
   public ELicenseType getLicenseType() {
      return licenseType;
   }

   @JsonIgnore
   public void setLicenseType(ELicenseType value) { 
      this.licenseType = value;
   }
   
   
   @JsonIgnore
   public String getLicensedFeature() {
      return licensedFeature;
   }

   @JsonIgnore
   public void setLicensedFeature(String value) { 
      this.licensedFeature = value;
   }
   
   
   @JsonIgnore
   public Long getMajorRelease() {
      return majorRelease;
   }

   @JsonIgnore
   public void setMajorRelease(Long value) { 
      this.majorRelease = value;
   }
   
   
   @JsonIgnore
   public Long getMinorRelease() {
      return minorRelease;
   }

   @JsonIgnore
   public void setMinorRelease(Long value) { 
      this.minorRelease = value;
   }
   
   
   @JsonIgnore
   public String getPhone() {
      return phone;
   }

   @JsonIgnore
   public void setPhone(String value) { 
      this.phone = value;
   }
   
   
   @JsonIgnore
   public String getProductVersion() {
      return productVersion;
   }

   @JsonIgnore
   public void setProductVersion(String value) { 
      this.productVersion = value;
   }
   
   
   @JsonIgnore
   public String getProvider() {
      return provider;
   }

   @JsonIgnore
   public void setProvider(String value) { 
      this.provider = value;
   }
   
   
   @JsonIgnore
   public String getRequestID() {
      return requestID;
   }

   @JsonIgnore
   public void setRequestID(String value) { 
      this.requestID = value;
   }
   
   
   @JsonIgnore
   public String getState() {
      return state;
   }

   @JsonIgnore
   public void setState(String value) { 
      this.state = value;
   }
   
   
   @JsonIgnore
   public String getStreet() {
      return street;
   }

   @JsonIgnore
   public void setStreet(String value) { 
      this.street = value;
   }
   
   
   @JsonIgnore
   public String getSystem() {
      return system;
   }

   @JsonIgnore
   public void setSystem(String value) { 
      this.system = value;
   }
   
   
   @JsonIgnore
   public String getUniqueLicenseIdentifier() {
      return uniqueLicenseIdentifier;
   }

   @JsonIgnore
   public void setUniqueLicenseIdentifier(String value) { 
      this.uniqueLicenseIdentifier = value;
   }
   
   
   @JsonIgnore
   public String getUserName() {
      return userName;
   }

   @JsonIgnore
   public void setUserName(String value) { 
      this.userName = value;
   }
   
   
   @JsonIgnore
   public String getZip() {
      return zip;
   }

   @JsonIgnore
   public void setZip(String value) { 
      this.zip = value;
   }
   

   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
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
      return "License [" + "additionalSupportedVersions=" + additionalSupportedVersions + ", allowedAVRSGsCount=" + allowedAVRSGsCount + ", allowedAVRSsCount=" + allowedAVRSsCount + ", allowedCPEsCount=" + allowedCPEsCount + ", allowedNICsCount=" + allowedNICsCount + ", allowedVDFGsCount=" + allowedVDFGsCount + ", allowedVDFsCount=" + allowedVDFsCount + ", allowedVMsCount=" + allowedVMsCount + ", allowedVRSGsCount=" + allowedVRSGsCount + ", allowedVRSsCount=" + allowedVRSsCount + ", city=" + city + ", company=" + company + ", country=" + country + ", customerKey=" + customerKey + ", email=" + email + ", embeddedMetadata=" + embeddedMetadata + ", encryptionMode=" + encryptionMode + ", entityScope=" + entityScope + ", expirationDate=" + expirationDate + ", expiryTimestamp=" + expiryTimestamp + ", externalID=" + externalID + ", isClusterLicense=" + isClusterLicense + ", lastUpdatedBy=" + lastUpdatedBy + ", license=" + license + ", licenseEncryption=" + licenseEncryption + ", licenseEntities=" + licenseEntities + ", licenseID=" + licenseID + ", licenseType=" + licenseType + ", licensedFeature=" + licensedFeature + ", majorRelease=" + majorRelease + ", minorRelease=" + minorRelease + ", phone=" + phone + ", productVersion=" + productVersion + ", provider=" + provider + ", requestID=" + requestID + ", state=" + state + ", street=" + street + ", system=" + system + ", uniqueLicenseIdentifier=" + uniqueLicenseIdentifier + ", userName=" + userName + ", zip=" + zip + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}