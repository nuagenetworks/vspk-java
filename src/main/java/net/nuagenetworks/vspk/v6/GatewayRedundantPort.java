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
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VLANsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "gatewayredundantport", resourceName = "gatewayredundantports")
public class GatewayRedundantPort extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EPortType { ACCESS, NETWORK };
   public enum EStatus { INITIALIZED, MISMATCH, ORPHAN, READY };

   
   @JsonProperty(value = "VLANRange")
   
   protected String VLANRange;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
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
   
   @JsonProperty(value = "physicalName")
   
   protected String physicalName;
   
   @JsonProperty(value = "portPeer1ID")
   
   protected String portPeer1ID;
   
   @JsonProperty(value = "portPeer2ID")
   
   protected String portPeer2ID;
   
   @JsonProperty(value = "portType")
   
   protected EPortType portType;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   
   @JsonProperty(value = "useUserMnemonic")
   
   protected Boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   
   protected String userMnemonic;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private VLANsFetcher vLANs;
   

   public GatewayRedundantPort() {
      
      alarms = new AlarmsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
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
   public String getPhysicalName() {
      return physicalName;
   }

   @JsonIgnore
   public void setPhysicalName(String value) { 
      this.physicalName = value;
   }
   
   
   @JsonIgnore
   public String getPortPeer1ID() {
      return portPeer1ID;
   }

   @JsonIgnore
   public void setPortPeer1ID(String value) { 
      this.portPeer1ID = value;
   }
   
   
   @JsonIgnore
   public String getPortPeer2ID() {
      return portPeer2ID;
   }

   @JsonIgnore
   public void setPortPeer2ID(String value) { 
      this.portPeer2ID = value;
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
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
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
      return "GatewayRedundantPort [" + "VLANRange=" + VLANRange + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", physicalName=" + physicalName + ", portPeer1ID=" + portPeer1ID + ", portPeer2ID=" + portPeer2ID + ", portType=" + portType + ", status=" + status + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}