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

import vspk.v3_2.fetchers.AlarmsFetcher;
import vspk.v3_2.fetchers.EnterprisePermissionsFetcher;
import vspk.v3_2.fetchers.EventLogsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.NSPortStaticConfigurationsFetcher;
import vspk.v3_2.fetchers.PermissionsFetcher;
import vspk.v3_2.fetchers.VLANsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NSPort extends RestObject {

   public final static String REST_NAME = "nsport";
   public final static String RESOURCE_NAME = "nsports";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum PortType { ACCESS, NETWORK };
   public enum Status { INITIALIZED, MISMATCH, ORPHAN, READY };

   
   @JsonProperty(value = "VLANRange")
   protected String VLANRange;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "associatedRedundantPortID")
   protected String associatedRedundantPortID;
   
   @JsonProperty(value = "associatedVSCProfileID")
   protected String associatedVSCProfileID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "infrastructureProfileID")
   protected String infrastructureProfileID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "physicalName")
   protected String physicalName;
   
   @JsonProperty(value = "portType")
   protected PortType portType;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "useUserMnemonic")
   protected boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   protected String userMnemonic;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NSPortStaticConfigurationsFetcher nSPortStaticConfigurations;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private VLANsFetcher vLANs;
   

   public NSPort() {
      
      alarms = new AlarmsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nSPortStaticConfigurations = new NSPortStaticConfigurationsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      vLANs = new VLANsFetcher(this);
      
   }

   public String getVLANRange() {
      return VLANRange;
   }

   public void setVLANRange(String value) { 
      this.VLANRange = value;
   }
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   public String getAssociatedRedundantPortID() {
      return associatedRedundantPortID;
   }

   public void setAssociatedRedundantPortID(String value) { 
      this.associatedRedundantPortID = value;
   }
   public String getAssociatedVSCProfileID() {
      return associatedVSCProfileID;
   }

   public void setAssociatedVSCProfileID(String value) { 
      this.associatedVSCProfileID = value;
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
   public String getInfrastructureProfileID() {
      return infrastructureProfileID;
   }

   public void setInfrastructureProfileID(String value) { 
      this.infrastructureProfileID = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   public String getPhysicalName() {
      return physicalName;
   }

   public void setPhysicalName(String value) { 
      this.physicalName = value;
   }
   public PortType getPortType() {
      return portType;
   }

   public void setPortType(PortType value) { 
      this.portType = value;
   }
   public Status getStatus() {
      return status;
   }

   public void setStatus(Status value) { 
      this.status = value;
   }
   public String getTemplateID() {
      return templateID;
   }

   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   public boolean getUseUserMnemonic() {
      return useUserMnemonic;
   }

   public void setUseUserMnemonic(boolean value) { 
      this.useUserMnemonic = value;
   }
   public String getUserMnemonic() {
      return userMnemonic;
   }

   public void setUserMnemonic(String value) { 
      this.userMnemonic = value;
   }
   

   
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
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
   
   public NSPortStaticConfigurationsFetcher getNSPortStaticConfigurations() {
      return nSPortStaticConfigurations;
   }
   
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   public VLANsFetcher getVLANs() {
      return vLANs;
   }
   

   public String toString() {
      return "NSPort [" + "VLANRange=" + VLANRange + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedRedundantPortID=" + associatedRedundantPortID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", infrastructureProfileID=" + infrastructureProfileID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", physicalName=" + physicalName + ", portType=" + portType + ", status=" + status + ", templateID=" + templateID + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}