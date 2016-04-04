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


package vspk.v4_0;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v4_0.fetchers.AlarmsFetcher;
import vspk.v4_0.fetchers.BGPNeighborsFetcher;
import vspk.v4_0.fetchers.EnterprisePermissionsFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.IKEGatewayConnectionsFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.PATNATPoolsFetcher;
import vspk.v4_0.fetchers.PermissionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VLAN extends RestObject {

   public final static String REST_NAME = "vlan";
   public final static String RESOURCE_NAME = "vlans";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Status { INITIALIZED, MISMATCH, ORPHAN, READY };

   
   @JsonProperty(value = "associatedBGPProfileID")
   protected String associatedBGPProfileID;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gatewayID")
   protected String gatewayID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "readonly")
   protected boolean readonly;
   
   @JsonProperty(value = "restricted")
   protected boolean restricted;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "useUserMnemonic")
   protected boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   protected String userMnemonic;
   
   @JsonProperty(value = "value")
   protected int value;
   
   @JsonProperty(value = "vportID")
   protected String vportID;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private BGPNeighborsFetcher bGPNeighbors;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private IKEGatewayConnectionsFetcher iKEGatewayConnections;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public VLAN() {
      
      alarms = new AlarmsFetcher(this);
      
      bGPNeighbors = new BGPNeighborsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   public String getAssociatedBGPProfileID() {
      return associatedBGPProfileID;
   }

   public void setAssociatedBGPProfileID(String value) { 
      this.associatedBGPProfileID = value;
   }
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
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
   public String getGatewayID() {
      return gatewayID;
   }

   public void setGatewayID(String value) { 
      this.gatewayID = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   public boolean getReadonly() {
      return readonly;
   }

   public void setReadonly(boolean value) { 
      this.readonly = value;
   }
   public boolean getRestricted() {
      return restricted;
   }

   public void setRestricted(boolean value) { 
      this.restricted = value;
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
   public int getValue() {
      return value;
   }

   public void setValue(int value) { 
      this.value = value;
   }
   public String getVportID() {
      return vportID;
   }

   public void setVportID(String value) { 
      this.vportID = value;
   }
   

   
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   public BGPNeighborsFetcher getBGPNeighbors() {
      return bGPNeighbors;
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
   
   public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
      return iKEGatewayConnections;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   

   public String toString() {
      return "VLAN [" + "associatedBGPProfileID=" + associatedBGPProfileID + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayID=" + gatewayID + ", lastUpdatedBy=" + lastUpdatedBy + ", permittedAction=" + permittedAction + ", readonly=" + readonly + ", restricted=" + restricted + ", status=" + status + ", templateID=" + templateID + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", value=" + value + ", vportID=" + vportID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}