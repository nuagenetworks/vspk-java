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


import net.nuagenetworks.vspk.v6.fetchers.AvatarsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "user", resourceName = "users")
public class User extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAvatarType { BASE64, COMPUTEDURL, URL };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EManagementMode { CMS, DEFAULT };

   
   @JsonProperty(value = "LDAPUserDN")
   
   protected String LDAPUserDN;
   
   @JsonProperty(value = "avatarData")
   
   protected String avatarData;
   
   @JsonProperty(value = "avatarType")
   
   protected EAvatarType avatarType;
   
   @JsonProperty(value = "disableCertificateAuth")
   
   protected Boolean disableCertificateAuth;
   
   @JsonProperty(value = "disablePasswordAuth")
   
   protected Boolean disablePasswordAuth;
   
   @JsonProperty(value = "disabled")
   
   protected Boolean disabled;
   
   @JsonProperty(value = "email")
   
   protected String email;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "firstName")
   
   protected String firstName;
   
   @JsonProperty(value = "lastName")
   
   protected String lastName;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "managementMode")
   
   protected EManagementMode managementMode;
   
   @JsonProperty(value = "mobileNumber")
   
   protected String mobileNumber;
   
   @JsonProperty(value = "password")
   
   protected String password;
   
   @JsonProperty(value = "userName")
   
   protected String userName;
   

   
   @JsonIgnore
   private AvatarsFetcher avatars;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   

   public User() {
      
      avatars = new AvatarsFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getLDAPUserDN() {
      return LDAPUserDN;
   }

   @JsonIgnore
   public void setLDAPUserDN(String value) { 
      this.LDAPUserDN = value;
   }
   
   
   @JsonIgnore
   public String getAvatarData() {
      return avatarData;
   }

   @JsonIgnore
   public void setAvatarData(String value) { 
      this.avatarData = value;
   }
   
   
   @JsonIgnore
   public EAvatarType getAvatarType() {
      return avatarType;
   }

   @JsonIgnore
   public void setAvatarType(EAvatarType value) { 
      this.avatarType = value;
   }
   
   
   @JsonIgnore
   public Boolean getDisableCertificateAuth() {
      return disableCertificateAuth;
   }

   @JsonIgnore
   public void setDisableCertificateAuth(Boolean value) { 
      this.disableCertificateAuth = value;
   }
   
   
   @JsonIgnore
   public Boolean getDisablePasswordAuth() {
      return disablePasswordAuth;
   }

   @JsonIgnore
   public void setDisablePasswordAuth(Boolean value) { 
      this.disablePasswordAuth = value;
   }
   
   
   @JsonIgnore
   public Boolean getDisabled() {
      return disabled;
   }

   @JsonIgnore
   public void setDisabled(Boolean value) { 
      this.disabled = value;
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
   public String getFirstName() {
      return firstName;
   }

   @JsonIgnore
   public void setFirstName(String value) { 
      this.firstName = value;
   }
   
   
   @JsonIgnore
   public String getLastName() {
      return lastName;
   }

   @JsonIgnore
   public void setLastName(String value) { 
      this.lastName = value;
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
   public EManagementMode getManagementMode() {
      return managementMode;
   }

   @JsonIgnore
   public void setManagementMode(EManagementMode value) { 
      this.managementMode = value;
   }
   
   
   @JsonIgnore
   public String getMobileNumber() {
      return mobileNumber;
   }

   @JsonIgnore
   public void setMobileNumber(String value) { 
      this.mobileNumber = value;
   }
   
   
   @JsonIgnore
   public String getPassword() {
      return password;
   }

   @JsonIgnore
   public void setPassword(String value) { 
      this.password = value;
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
   public AvatarsFetcher getAvatars() {
      return avatars;
   }
   
   @JsonIgnore
   public ContainersFetcher getContainers() {
      return containers;
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
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public VMsFetcher getVMs() {
      return vMs;
   }
   

   public String toString() {
      return "User [" + "LDAPUserDN=" + LDAPUserDN + ", avatarData=" + avatarData + ", avatarType=" + avatarType + ", disableCertificateAuth=" + disableCertificateAuth + ", disablePasswordAuth=" + disablePasswordAuth + ", disabled=" + disabled + ", email=" + email + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdatedBy=" + lastUpdatedBy + ", managementMode=" + managementMode + ", mobileNumber=" + mobileNumber + ", password=" + password + ", userName=" + userName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}