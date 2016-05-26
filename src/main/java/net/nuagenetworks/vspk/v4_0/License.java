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
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "license", resourceName = "licenses")
public class License extends RestObject {

   
   public enum LicenseEncryption { ENCRYPTION_DISABLED, ENCRYPTION_ENABLED };
   public enum LicenseType { CLUSTERED, STANDARD };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "majorRelease")
   protected Long majorRelease;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "phone")
   protected String phone;
   
   @JsonProperty(value = "license")
   protected String license;
   
   @JsonProperty(value = "licenseEncryption")
   protected LicenseEncryption licenseEncryption;
   
   @JsonProperty(value = "licenseEntities")
   protected String licenseEntities;
   
   @JsonProperty(value = "licenseID")
   protected Long licenseID;
   
   @JsonProperty(value = "licenseType")
   protected LicenseType licenseType;
   
   @JsonProperty(value = "minorRelease")
   protected Long minorRelease;
   
   @JsonProperty(value = "zip")
   protected String zip;
   
   @JsonProperty(value = "city")
   protected String city;
   
   @JsonProperty(value = "allowedCPEsCount")
   protected Long allowedCPEsCount;
   
   @JsonProperty(value = "allowedNICsCount")
   protected Long allowedNICsCount;
   
   @JsonProperty(value = "allowedVMsCount")
   protected Long allowedVMsCount;
   
   @JsonProperty(value = "allowedVRSGsCount")
   protected Long allowedVRSGsCount;
   
   @JsonProperty(value = "allowedVRSsCount")
   protected Long allowedVRSsCount;
   
   @JsonProperty(value = "email")
   protected String email;
   
   @JsonProperty(value = "encryptionMode")
   protected Boolean encryptionMode;
   
   @JsonProperty(value = "uniqueLicenseIdentifier")
   protected String uniqueLicenseIdentifier;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "company")
   protected String company;
   
   @JsonProperty(value = "country")
   protected String country;
   
   @JsonProperty(value = "productVersion")
   protected String productVersion;
   
   @JsonProperty(value = "provider")
   protected String provider;
   
   @JsonProperty(value = "isClusterLicense")
   protected Boolean isClusterLicense;
   
   @JsonProperty(value = "userName")
   protected String userName;
   
   @JsonProperty(value = "state")
   protected String state;
   
   @JsonProperty(value = "street")
   protected String street;
   
   @JsonProperty(value = "customerKey")
   protected String customerKey;
   
   @JsonProperty(value = "expirationDate")
   protected Float expirationDate;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public License() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public Long getMajorRelease() {
      return majorRelease;
   }

   public void setMajorRelease(Long value) { 
      this.majorRelease = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getPhone() {
      return phone;
   }

   public void setPhone(String value) { 
      this.phone = value;
   }
   public String getLicense() {
      return license;
   }

   public void setLicense(String value) { 
      this.license = value;
   }
   public LicenseEncryption getLicenseEncryption() {
      return licenseEncryption;
   }

   public void setLicenseEncryption(LicenseEncryption value) { 
      this.licenseEncryption = value;
   }
   public String getLicenseEntities() {
      return licenseEntities;
   }

   public void setLicenseEntities(String value) { 
      this.licenseEntities = value;
   }
   public Long getLicenseID() {
      return licenseID;
   }

   public void setLicenseID(Long value) { 
      this.licenseID = value;
   }
   public LicenseType getLicenseType() {
      return licenseType;
   }

   public void setLicenseType(LicenseType value) { 
      this.licenseType = value;
   }
   public Long getMinorRelease() {
      return minorRelease;
   }

   public void setMinorRelease(Long value) { 
      this.minorRelease = value;
   }
   public String getZip() {
      return zip;
   }

   public void setZip(String value) { 
      this.zip = value;
   }
   public String getCity() {
      return city;
   }

   public void setCity(String value) { 
      this.city = value;
   }
   public Long getAllowedCPEsCount() {
      return allowedCPEsCount;
   }

   public void setAllowedCPEsCount(Long value) { 
      this.allowedCPEsCount = value;
   }
   public Long getAllowedNICsCount() {
      return allowedNICsCount;
   }

   public void setAllowedNICsCount(Long value) { 
      this.allowedNICsCount = value;
   }
   public Long getAllowedVMsCount() {
      return allowedVMsCount;
   }

   public void setAllowedVMsCount(Long value) { 
      this.allowedVMsCount = value;
   }
   public Long getAllowedVRSGsCount() {
      return allowedVRSGsCount;
   }

   public void setAllowedVRSGsCount(Long value) { 
      this.allowedVRSGsCount = value;
   }
   public Long getAllowedVRSsCount() {
      return allowedVRSsCount;
   }

   public void setAllowedVRSsCount(Long value) { 
      this.allowedVRSsCount = value;
   }
   public String getEmail() {
      return email;
   }

   public void setEmail(String value) { 
      this.email = value;
   }
   public Boolean getEncryptionMode() {
      return encryptionMode;
   }

   public void setEncryptionMode(Boolean value) { 
      this.encryptionMode = value;
   }
   public String getUniqueLicenseIdentifier() {
      return uniqueLicenseIdentifier;
   }

   public void setUniqueLicenseIdentifier(String value) { 
      this.uniqueLicenseIdentifier = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getCompany() {
      return company;
   }

   public void setCompany(String value) { 
      this.company = value;
   }
   public String getCountry() {
      return country;
   }

   public void setCountry(String value) { 
      this.country = value;
   }
   public String getProductVersion() {
      return productVersion;
   }

   public void setProductVersion(String value) { 
      this.productVersion = value;
   }
   public String getProvider() {
      return provider;
   }

   public void setProvider(String value) { 
      this.provider = value;
   }
   public Boolean getIsClusterLicense() {
      return isClusterLicense;
   }

   public void setIsClusterLicense(Boolean value) { 
      this.isClusterLicense = value;
   }
   public String getUserName() {
      return userName;
   }

   public void setUserName(String value) { 
      this.userName = value;
   }
   public String getState() {
      return state;
   }

   public void setState(String value) { 
      this.state = value;
   }
   public String getStreet() {
      return street;
   }

   public void setStreet(String value) { 
      this.street = value;
   }
   public String getCustomerKey() {
      return customerKey;
   }

   public void setCustomerKey(String value) { 
      this.customerKey = value;
   }
   public Float getExpirationDate() {
      return expirationDate;
   }

   public void setExpirationDate(Float value) { 
      this.expirationDate = value;
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
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "License [" + "majorRelease=" + majorRelease + ", lastUpdatedBy=" + lastUpdatedBy + ", phone=" + phone + ", license=" + license + ", licenseEncryption=" + licenseEncryption + ", licenseEntities=" + licenseEntities + ", licenseID=" + licenseID + ", licenseType=" + licenseType + ", minorRelease=" + minorRelease + ", zip=" + zip + ", city=" + city + ", allowedCPEsCount=" + allowedCPEsCount + ", allowedNICsCount=" + allowedNICsCount + ", allowedVMsCount=" + allowedVMsCount + ", allowedVRSGsCount=" + allowedVRSGsCount + ", allowedVRSsCount=" + allowedVRSsCount + ", email=" + email + ", encryptionMode=" + encryptionMode + ", uniqueLicenseIdentifier=" + uniqueLicenseIdentifier + ", entityScope=" + entityScope + ", company=" + company + ", country=" + country + ", productVersion=" + productVersion + ", provider=" + provider + ", isClusterLicense=" + isClusterLicense + ", userName=" + userName + ", state=" + state + ", street=" + street + ", customerKey=" + customerKey + ", expirationDate=" + expirationDate + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}