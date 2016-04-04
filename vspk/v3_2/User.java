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
import vspk.v3_2.fetchers.GroupsFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.VMsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends RestObject {

   public final static String REST_NAME = "user";
   public final static String RESOURCE_NAME = "users";

   
   public enum AvatarType { BASE64, COMPUTEDURL, URL };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum ManagementMode { CMS, DEFAULT };

   
   @JsonProperty(value = "avatarData")
   protected String avatarData;
   
   @JsonProperty(value = "avatarType")
   protected AvatarType avatarType;
   
   @JsonProperty(value = "disabled")
   protected boolean disabled;
   
   @JsonProperty(value = "email")
   protected String email;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "firstName")
   protected String firstName;
   
   @JsonProperty(value = "lastName")
   protected String lastName;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "managementMode")
   protected ManagementMode managementMode;
   
   @JsonProperty(value = "mobileNumber")
   protected String mobileNumber;
   
   @JsonProperty(value = "password")
   protected String password;
   
   @JsonProperty(value = "userName")
   protected String userName;
   

   
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
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
   }

   public String getAvatarData() {
      return avatarData;
   }

   public void setAvatarData(String value) { 
      this.avatarData = value;
   }
   public AvatarType getAvatarType() {
      return avatarType;
   }

   public void setAvatarType(AvatarType value) { 
      this.avatarType = value;
   }
   public boolean getDisabled() {
      return disabled;
   }

   public void setDisabled(boolean value) { 
      this.disabled = value;
   }
   public String getEmail() {
      return email;
   }

   public void setEmail(String value) { 
      this.email = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String value) { 
      this.firstName = value;
   }
   public String getLastName() {
      return lastName;
   }

   public void setLastName(String value) { 
      this.lastName = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public ManagementMode getManagementMode() {
      return managementMode;
   }

   public void setManagementMode(ManagementMode value) { 
      this.managementMode = value;
   }
   public String getMobileNumber() {
      return mobileNumber;
   }

   public void setMobileNumber(String value) { 
      this.mobileNumber = value;
   }
   public String getPassword() {
      return password;
   }

   public void setPassword(String value) { 
      this.password = value;
   }
   public String getUserName() {
      return userName;
   }

   public void setUserName(String value) { 
      this.userName = value;
   }
   

   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public VMsFetcher getVMs() {
      return vMs;
   }
   

   public String toString() {
      return "User [" + "avatarData=" + avatarData + ", avatarType=" + avatarType + ", disabled=" + disabled + ", email=" + email + ", entityScope=" + entityScope + ", externalID=" + externalID + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdatedBy=" + lastUpdatedBy + ", managementMode=" + managementMode + ", mobileNumber=" + mobileNumber + ", password=" + password + ", userName=" + userName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}