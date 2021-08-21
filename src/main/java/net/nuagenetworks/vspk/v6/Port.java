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


import net.nuagenetworks.vspk.v6.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VLANsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "port", resourceName = "ports")
public class Port extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EOperationalState { DOWN, INIT, UP };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EPortType { ACCESS, MANAGEMENT, NETWORK };
   public enum EStatus { INITIALIZED, MISMATCH, ORPHAN, READY };

   
   @JsonProperty(value = "VLANRange")
   
   protected String VLANRange;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "associatedEthernetSegmentGroupID")
   
   protected String associatedEthernetSegmentGroupID;
   
   @JsonProperty(value = "associatedEthernetSegmentID")
   
   protected String associatedEthernetSegmentID;
   
   @JsonProperty(value = "associatedEthernetSegmentVLANRange")
   
   protected String associatedEthernetSegmentVLANRange;
   
   @JsonProperty(value = "associatedEthernetSegmentVirtual")
   
   protected Boolean associatedEthernetSegmentVirtual;
   
   @JsonProperty(value = "associatedRedundantPortID")
   
   protected String associatedRedundantPortID;
   
   @JsonProperty(value = "creationDate")
   
   protected String creationDate;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "isResilient")
   
   protected Boolean isResilient;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUpdatedDate")
   
   protected String lastUpdatedDate;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "nativeVLAN")
   
   protected String nativeVLAN;
   
   @JsonProperty(value = "operationalState")
   
   protected EOperationalState operationalState;
   
   @JsonProperty(value = "owner")
   
   protected String owner;
   
   @JsonProperty(value = "permittedAction")
   
   protected EPermittedAction permittedAction;
   
   @JsonProperty(value = "physicalName")
   
   protected String physicalName;
   
   @JsonProperty(value = "portType")
   
   protected EPortType portType;
   
   @JsonProperty(value = "routed")
   
   protected Boolean routed;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   
   @JsonProperty(value = "templateID")
   
   protected String templateID;
   
   @JsonProperty(value = "useUserMnemonic")
   
   protected Boolean useUserMnemonic;
   
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
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private VLANsFetcher vLANs;
   

   public Port() {
      
      alarms = new AlarmsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      vLANs = new VLANsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getVLANRange() {
      return VLANRange;
   }

   @JsonIgnore
   public void setVLANRange(String value) { 
      this.VLANRange = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEthernetSegmentGroupID() {
      return associatedEthernetSegmentGroupID;
   }

   @JsonIgnore
   public void setAssociatedEthernetSegmentGroupID(String value) { 
      this.associatedEthernetSegmentGroupID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEthernetSegmentID() {
      return associatedEthernetSegmentID;
   }

   @JsonIgnore
   public void setAssociatedEthernetSegmentID(String value) { 
      this.associatedEthernetSegmentID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEthernetSegmentVLANRange() {
      return associatedEthernetSegmentVLANRange;
   }

   @JsonIgnore
   public void setAssociatedEthernetSegmentVLANRange(String value) { 
      this.associatedEthernetSegmentVLANRange = value;
   }
   
   
   @JsonIgnore
   public Boolean getAssociatedEthernetSegmentVirtual() {
      return associatedEthernetSegmentVirtual;
   }

   @JsonIgnore
   public void setAssociatedEthernetSegmentVirtual(Boolean value) { 
      this.associatedEthernetSegmentVirtual = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedRedundantPortID() {
      return associatedRedundantPortID;
   }

   @JsonIgnore
   public void setAssociatedRedundantPortID(String value) { 
      this.associatedRedundantPortID = value;
   }
   
   
   @JsonIgnore
   public String getCreationDate() {
      return creationDate;
   }

   @JsonIgnore
   public void setCreationDate(String value) { 
      this.creationDate = value;
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
   public Boolean getIsResilient() {
      return isResilient;
   }

   @JsonIgnore
   public void setIsResilient(Boolean value) { 
      this.isResilient = value;
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
   public String getLastUpdatedDate() {
      return lastUpdatedDate;
   }

   @JsonIgnore
   public void setLastUpdatedDate(String value) { 
      this.lastUpdatedDate = value;
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
   public String getNativeVLAN() {
      return nativeVLAN;
   }

   @JsonIgnore
   public void setNativeVLAN(String value) { 
      this.nativeVLAN = value;
   }
   
   
   @JsonIgnore
   public EOperationalState getOperationalState() {
      return operationalState;
   }

   @JsonIgnore
   public void setOperationalState(EOperationalState value) { 
      this.operationalState = value;
   }
   
   
   @JsonIgnore
   public String getOwner() {
      return owner;
   }

   @JsonIgnore
   public void setOwner(String value) { 
      this.owner = value;
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
   public String getPhysicalName() {
      return physicalName;
   }

   @JsonIgnore
   public void setPhysicalName(String value) { 
      this.physicalName = value;
   }
   
   
   @JsonIgnore
   public EPortType getPortType() {
      return portType;
   }

   @JsonIgnore
   public void setPortType(EPortType value) { 
      this.portType = value;
   }
   
   
   @JsonIgnore
   public Boolean getRouted() {
      return routed;
   }

   @JsonIgnore
   public void setRouted(Boolean value) { 
      this.routed = value;
   }
   
   
   @JsonIgnore
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
   }
   
   
   @JsonIgnore
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   
   
   @JsonIgnore
   public Boolean getUseUserMnemonic() {
      return useUserMnemonic;
   }

   @JsonIgnore
   public void setUseUserMnemonic(Boolean value) { 
      this.useUserMnemonic = value;
   }
   
   
   @JsonIgnore
   public String getUserMnemonic() {
      return userMnemonic;
   }

   @JsonIgnore
   public void setUserMnemonic(String value) { 
      this.userMnemonic = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
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
   
   @JsonIgnore
   public VLANsFetcher getVLANs() {
      return vLANs;
   }
   

   public String toString() {
      return "Port [" + "VLANRange=" + VLANRange + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedEthernetSegmentGroupID=" + associatedEthernetSegmentGroupID + ", associatedEthernetSegmentID=" + associatedEthernetSegmentID + ", associatedEthernetSegmentVLANRange=" + associatedEthernetSegmentVLANRange + ", associatedEthernetSegmentVirtual=" + associatedEthernetSegmentVirtual + ", associatedRedundantPortID=" + associatedRedundantPortID + ", creationDate=" + creationDate + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", isResilient=" + isResilient + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", name=" + name + ", nativeVLAN=" + nativeVLAN + ", operationalState=" + operationalState + ", owner=" + owner + ", permittedAction=" + permittedAction + ", physicalName=" + physicalName + ", portType=" + portType + ", routed=" + routed + ", status=" + status + ", templateID=" + templateID + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}