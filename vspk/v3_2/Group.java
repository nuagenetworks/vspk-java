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
import vspk.v3_2.fetchers.UsersFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Group extends RestObject {

   public final static String REST_NAME = "group";
   public final static String RESOURCE_NAME = "groups";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum ManagementMode { CMS, DEFAULT };
   public enum Role { CMS, CSPOPERATOR, CSPROOT, JMS, ORGADMIN, ORGAPPDESIGNER, ORGNETWORKDESIGNER, ORGUSER, SYSTEM, UNKNOWN, USER };

   
   @JsonProperty(value = "accountRestrictions")
   protected boolean accountRestrictions;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "managementMode")
   protected ManagementMode managementMode;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "private_")
   protected boolean private_;
   
   @JsonProperty(value = "restrictionDate")
   protected float restrictionDate;
   
   @JsonProperty(value = "role")
   protected Role role;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private UsersFetcher users;
   

   public Group() {
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      users = new UsersFetcher(this);
      
   }

   public boolean getAccountRestrictions() {
      return accountRestrictions;
   }

   public void setAccountRestrictions(boolean value) { 
      this.accountRestrictions = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
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
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public boolean getPrivate_() {
      return private_;
   }

   public void setPrivate_(boolean value) { 
      this.private_ = value;
   }
   public float getRestrictionDate() {
      return restrictionDate;
   }

   public void setRestrictionDate(float value) { 
      this.restrictionDate = value;
   }
   public Role getRole() {
      return role;
   }

   public void setRole(Role value) { 
      this.role = value;
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
   
   public UsersFetcher getUsers() {
      return users;
   }
   

   public String toString() {
      return "Group [" + "accountRestrictions=" + accountRestrictions + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", managementMode=" + managementMode + ", name=" + name + ", private_=" + private_ + ", restrictionDate=" + restrictionDate + ", role=" + role + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}