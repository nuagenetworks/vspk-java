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


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.EventLogsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class License extends RestObject {

   public final static String REST_NAME = "license";
   public final static String RESOURCE_NAME = "licenses";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum LicenseEncryption { ENCRYPTION_DISABLED, ENCRYPTION_ENABLED };
   public enum LicenseType { CLUSTERED, STANDARD };

   
   @JsonProperty(value = "allowedCPEsCount")
   protected int allowedCPEsCount;
   
   @JsonProperty(value = "allowedNICsCount")
   protected int allowedNICsCount;
   
   @JsonProperty(value = "allowedVMsCount")
   protected int allowedVMsCount;
   
   @JsonProperty(value = "allowedVRSGsCount")
   protected int allowedVRSGsCount;
   
   @JsonProperty(value = "allowedVRSsCount")
   protected int allowedVRSsCount;
   
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
   
   @JsonProperty(value = "encryptionMode")
   protected boolean encryptionMode;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "expirationDate")
   protected float expirationDate;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "isClusterLicense")
   protected boolean isClusterLicense;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "license")
   protected String license;
   
   @JsonProperty(value = "licenseEncryption")
   protected LicenseEncryption licenseEncryption;
   
   @JsonProperty(value = "licenseID")
   protected int licenseID;
   
   @JsonProperty(value = "licenseType")
   protected LicenseType licenseType;
   
   @JsonProperty(value = "majorRelease")
   protected int majorRelease;
   
   @JsonProperty(value = "minorRelease")
   protected int minorRelease;
   
   @JsonProperty(value = "phone")
   protected String phone;
   
   @JsonProperty(value = "productVersion")
   protected String productVersion;
   
   @JsonProperty(value = "provider")
   protected String provider;
   
   @JsonProperty(value = "state")
   protected String state;
   
   @JsonProperty(value = "street")
   protected String street;
   
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

   public int getAllowedCPEsCount() {
      return allowedCPEsCount;
   }

   public void setAllowedCPEsCount(int value) { 
      this.allowedCPEsCount = value;
   }
   public int getAllowedNICsCount() {
      return allowedNICsCount;
   }

   public void setAllowedNICsCount(int value) { 
      this.allowedNICsCount = value;
   }
   public int getAllowedVMsCount() {
      return allowedVMsCount;
   }

   public void setAllowedVMsCount(int value) { 
      this.allowedVMsCount = value;
   }
   public int getAllowedVRSGsCount() {
      return allowedVRSGsCount;
   }

   public void setAllowedVRSGsCount(int value) { 
      this.allowedVRSGsCount = value;
   }
   public int getAllowedVRSsCount() {
      return allowedVRSsCount;
   }

   public void setAllowedVRSsCount(int value) { 
      this.allowedVRSsCount = value;
   }
   public String getCity() {
      return city;
   }

   public void setCity(String value) { 
      this.city = value;
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
   public String getCustomerKey() {
      return customerKey;
   }

   public void setCustomerKey(String value) { 
      this.customerKey = value;
   }
   public String getEmail() {
      return email;
   }

   public void setEmail(String value) { 
      this.email = value;
   }
   public boolean getEncryptionMode() {
      return encryptionMode;
   }

   public void setEncryptionMode(boolean value) { 
      this.encryptionMode = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public float getExpirationDate() {
      return expirationDate;
   }

   public void setExpirationDate(float value) { 
      this.expirationDate = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public boolean getIsClusterLicense() {
      return isClusterLicense;
   }

   public void setIsClusterLicense(boolean value) { 
      this.isClusterLicense = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public int getLicenseID() {
      return licenseID;
   }

   public void setLicenseID(int value) { 
      this.licenseID = value;
   }
   public LicenseType getLicenseType() {
      return licenseType;
   }

   public void setLicenseType(LicenseType value) { 
      this.licenseType = value;
   }
   public int getMajorRelease() {
      return majorRelease;
   }

   public void setMajorRelease(int value) { 
      this.majorRelease = value;
   }
   public int getMinorRelease() {
      return minorRelease;
   }

   public void setMinorRelease(int value) { 
      this.minorRelease = value;
   }
   public String getPhone() {
      return phone;
   }

   public void setPhone(String value) { 
      this.phone = value;
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
   public String getUserName() {
      return userName;
   }

   public void setUserName(String value) { 
      this.userName = value;
   }
   public String getZip() {
      return zip;
   }

   public void setZip(String value) { 
      this.zip = value;
   }
   

   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "License [" + "allowedCPEsCount=" + allowedCPEsCount + ", allowedNICsCount=" + allowedNICsCount + ", allowedVMsCount=" + allowedVMsCount + ", allowedVRSGsCount=" + allowedVRSGsCount + ", allowedVRSsCount=" + allowedVRSsCount + ", city=" + city + ", company=" + company + ", country=" + country + ", customerKey=" + customerKey + ", email=" + email + ", encryptionMode=" + encryptionMode + ", entityScope=" + entityScope + ", expirationDate=" + expirationDate + ", externalID=" + externalID + ", isClusterLicense=" + isClusterLicense + ", lastUpdatedBy=" + lastUpdatedBy + ", license=" + license + ", licenseEncryption=" + licenseEncryption + ", licenseID=" + licenseID + ", licenseType=" + licenseType + ", majorRelease=" + majorRelease + ", minorRelease=" + minorRelease + ", phone=" + phone + ", productVersion=" + productVersion + ", provider=" + provider + ", state=" + state + ", street=" + street + ", userName=" + userName + ", zip=" + zip + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}