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


import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.UsersFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "group", resourceName = "groups")
public class Group extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum ManagementMode { CMS, DEFAULT };
   public enum Role { CMS, CSPOPERATOR, CSPROOT, JMS, ORGADMIN, ORGAPPDESIGNER, ORGNETWORKDESIGNER, ORGUSER, SYSTEM, UNKNOWN, USER };

   
   @JsonProperty(value = "LDAPGroupDN")
   protected String LDAPGroupDN;
   
   @JsonProperty(value = "accountRestrictions")
   protected Boolean accountRestrictions;
   
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
   
   @JsonProperty(value = "private")
   protected Boolean private_;
   
   @JsonProperty(value = "restrictionDate")
   protected Float restrictionDate;
   
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

   @JsonIgnore
   public String getLDAPGroupDN() {
      return LDAPGroupDN;
   }

   @JsonIgnore
   public void setLDAPGroupDN(String value) { 
      this.LDAPGroupDN = value;
   }
   @JsonIgnore
   public Boolean getAccountRestrictions() {
      return accountRestrictions;
   }

   @JsonIgnore
   public void setAccountRestrictions(Boolean value) { 
      this.accountRestrictions = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   @JsonIgnore
   public ManagementMode getManagementMode() {
      return managementMode;
   }

   @JsonIgnore
   public void setManagementMode(ManagementMode value) { 
      this.managementMode = value;
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
   public Boolean getPrivate_() {
      return private_;
   }

   @JsonIgnore
   public void setPrivate_(Boolean value) { 
      this.private_ = value;
   }
   @JsonIgnore
   public Float getRestrictionDate() {
      return restrictionDate;
   }

   @JsonIgnore
   public void setRestrictionDate(Float value) { 
      this.restrictionDate = value;
   }
   @JsonIgnore
   public Role getRole() {
      return role;
   }

   @JsonIgnore
   public void setRole(Role value) { 
      this.role = value;
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
   
   @JsonIgnore
   public UsersFetcher getUsers() {
      return users;
   }
   

   public String toString() {
      return "Group [" + "LDAPGroupDN=" + LDAPGroupDN + ", accountRestrictions=" + accountRestrictions + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", managementMode=" + managementMode + ", name=" + name + ", private_=" + private_ + ", restrictionDate=" + restrictionDate + ", role=" + role + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}