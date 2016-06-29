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

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "license", resourceName = "licenses")
public class License extends RestObject {

   private static final long serialVersionUID = 1L;

   
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

   @JsonIgnore
   public Long getMajorRelease() {
      return majorRelease;
   }

   @JsonIgnore
   public void setMajorRelease(Long value) { 
      this.majorRelease = value;
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
   public String getPhone() {
      return phone;
   }

   @JsonIgnore
   public void setPhone(String value) { 
      this.phone = value;
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
   public LicenseEncryption getLicenseEncryption() {
      return licenseEncryption;
   }

   @JsonIgnore
   public void setLicenseEncryption(LicenseEncryption value) { 
      this.licenseEncryption = value;
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
   public LicenseType getLicenseType() {
      return licenseType;
   }

   @JsonIgnore
   public void setLicenseType(LicenseType value) { 
      this.licenseType = value;
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
   public String getZip() {
      return zip;
   }

   @JsonIgnore
   public void setZip(String value) { 
      this.zip = value;
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
   public String getEmail() {
      return email;
   }

   @JsonIgnore
   public void setEmail(String value) { 
      this.email = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
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
   public Boolean getIsClusterLicense() {
      return isClusterLicense;
   }

   @JsonIgnore
   public void setIsClusterLicense(Boolean value) { 
      this.isClusterLicense = value;
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
   public String getCustomerKey() {
      return customerKey;
   }

   @JsonIgnore
   public void setCustomerKey(String value) { 
      this.customerKey = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
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
      return "License [" + "majorRelease=" + majorRelease + ", lastUpdatedBy=" + lastUpdatedBy + ", phone=" + phone + ", license=" + license + ", licenseEncryption=" + licenseEncryption + ", licenseID=" + licenseID + ", licenseType=" + licenseType + ", minorRelease=" + minorRelease + ", zip=" + zip + ", city=" + city + ", allowedCPEsCount=" + allowedCPEsCount + ", allowedNICsCount=" + allowedNICsCount + ", allowedVMsCount=" + allowedVMsCount + ", allowedVRSGsCount=" + allowedVRSGsCount + ", allowedVRSsCount=" + allowedVRSsCount + ", email=" + email + ", encryptionMode=" + encryptionMode + ", entityScope=" + entityScope + ", company=" + company + ", country=" + country + ", productVersion=" + productVersion + ", provider=" + provider + ", isClusterLicense=" + isClusterLicense + ", userName=" + userName + ", state=" + state + ", street=" + street + ", customerKey=" + customerKey + ", expirationDate=" + expirationDate + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}