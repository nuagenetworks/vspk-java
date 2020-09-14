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
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "permission", resourceName = "permissions")
public class Permission extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };

   
   @JsonProperty(value = "associatedGroupDescription")
   
   protected String associatedGroupDescription;
   
   @JsonProperty(value = "associatedGroupID")
   
   protected String associatedGroupID;
   
   @JsonProperty(value = "associatedGroupName")
   
   protected String associatedGroupName;
   
   @JsonProperty(value = "associatedRoleDescription")
   
   protected String associatedRoleDescription;
   
   @JsonProperty(value = "associatedRoleID")
   
   protected String associatedRoleID;
   
   @JsonProperty(value = "associatedRoleName")
   
   protected String associatedRoleName;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "permittedAction")
   
   protected EPermittedAction permittedAction;
   
   @JsonProperty(value = "permittedEnterpriseDescription")
   
   protected String permittedEnterpriseDescription;
   
   @JsonProperty(value = "permittedEnterpriseName")
   
   protected String permittedEnterpriseName;
   
   @JsonProperty(value = "permittedEntityID")
   
   protected String permittedEntityID;
   
   @JsonProperty(value = "permittedEntityName")
   
   protected String permittedEntityName;
   
   @JsonProperty(value = "permittedEntityType")
   
   protected String permittedEntityType;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public Permission() {
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssociatedGroupDescription() {
      return associatedGroupDescription;
   }

   @JsonIgnore
   public void setAssociatedGroupDescription(String value) { 
      this.associatedGroupDescription = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGroupID() {
      return associatedGroupID;
   }

   @JsonIgnore
   public void setAssociatedGroupID(String value) { 
      this.associatedGroupID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGroupName() {
      return associatedGroupName;
   }

   @JsonIgnore
   public void setAssociatedGroupName(String value) { 
      this.associatedGroupName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedRoleDescription() {
      return associatedRoleDescription;
   }

   @JsonIgnore
   public void setAssociatedRoleDescription(String value) { 
      this.associatedRoleDescription = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedRoleID() {
      return associatedRoleID;
   }

   @JsonIgnore
   public void setAssociatedRoleID(String value) { 
      this.associatedRoleID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedRoleName() {
      return associatedRoleName;
   }

   @JsonIgnore
   public void setAssociatedRoleName(String value) { 
      this.associatedRoleName = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public EPermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(EPermittedAction value) { 
      this.permittedAction = value;
   }
   
   
   @JsonIgnore
   public String getPermittedEnterpriseDescription() {
      return permittedEnterpriseDescription;
   }

   @JsonIgnore
   public void setPermittedEnterpriseDescription(String value) { 
      this.permittedEnterpriseDescription = value;
   }
   
   
   @JsonIgnore
   public String getPermittedEnterpriseName() {
      return permittedEnterpriseName;
   }

   @JsonIgnore
   public void setPermittedEnterpriseName(String value) { 
      this.permittedEnterpriseName = value;
   }
   
   
   @JsonIgnore
   public String getPermittedEntityID() {
      return permittedEntityID;
   }

   @JsonIgnore
   public void setPermittedEntityID(String value) { 
      this.permittedEntityID = value;
   }
   
   
   @JsonIgnore
   public String getPermittedEntityName() {
      return permittedEntityName;
   }

   @JsonIgnore
   public void setPermittedEntityName(String value) { 
      this.permittedEntityName = value;
   }
   
   
   @JsonIgnore
   public String getPermittedEntityType() {
      return permittedEntityType;
   }

   @JsonIgnore
   public void setPermittedEntityType(String value) { 
      this.permittedEntityType = value;
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
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   

   public String toString() {
      return "Permission [" + "associatedGroupDescription=" + associatedGroupDescription + ", associatedGroupID=" + associatedGroupID + ", associatedGroupName=" + associatedGroupName + ", associatedRoleDescription=" + associatedRoleDescription + ", associatedRoleID=" + associatedRoleID + ", associatedRoleName=" + associatedRoleName + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", permittedEnterpriseDescription=" + permittedEnterpriseDescription + ", permittedEnterpriseName=" + permittedEnterpriseName + ", permittedEntityID=" + permittedEntityID + ", permittedEntityName=" + permittedEntityName + ", permittedEntityType=" + permittedEntityType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}