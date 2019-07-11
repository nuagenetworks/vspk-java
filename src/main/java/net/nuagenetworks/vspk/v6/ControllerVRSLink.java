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


import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.HSCsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VRSsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VSCsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "controllervrslink", resourceName = "controllervrslinks")
public class ControllerVRSLink extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum JSONRPCConnectionState { ADMIN_DOWN, DOWN, NONE, UP };
   
   public enum VRSPersonality { HARDWARE_VTEP, NONE, NSG, NSGBR, NSGDUC, NUAGE_210_WBX_32_Q, NUAGE_210_WBX_48_S, VRS, VRSB, VRSG };
   
   public enum VSCConfigState { PRIMARY, SECONDARY };
   
   public enum VSCCurrentState { PRIMARY, SECONDARY };
   
   public enum ClusterNodeRole { NONE, PRIMARY, SECONDARY };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum Role { MASTER, NONE, SLAVE };
   
   public enum Status { ADMIN_DOWN, DOWN, UP };

   
   @JsonProperty(value = "JSONRPCConnectionState")
   protected JSONRPCConnectionState JSONRPCConnectionState;
   
   @JsonProperty(value = "VRSID")
   protected String VRSID;
   
   @JsonProperty(value = "VRSPersonality")
   protected VRSPersonality VRSPersonality;
   
   @JsonProperty(value = "VSCConfigState")
   protected VSCConfigState VSCConfigState;
   
   @JsonProperty(value = "VSCCurrentState")
   protected VSCCurrentState VSCCurrentState;
   
   @JsonProperty(value = "clusterNodeRole")
   protected ClusterNodeRole clusterNodeRole;
   
   @JsonProperty(value = "connections")
   protected java.util.List<SysmonUplinkConnection> connections;
   
   @JsonProperty(value = "controllerID")
   protected String controllerID;
   
   @JsonProperty(value = "controllerType")
   protected String controllerType;
   
   @JsonProperty(value = "dynamic")
   protected Boolean dynamic;
   
   @JsonProperty(value = "embeddedMetadata")
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "peer")
   protected String peer;
   
   @JsonProperty(value = "role")
   protected Role role;
   
   @JsonProperty(value = "status")
   protected Status status;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private HSCsFetcher hSCs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VRSsFetcher vRSs;
   
   @JsonIgnore
   private VSCsFetcher vSCs;
   

   public ControllerVRSLink() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      hSCs = new HSCsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vRSs = new VRSsFetcher(this);
      
      vSCs = new VSCsFetcher(this);
      
   }

   
   @JsonIgnore
   public JSONRPCConnectionState getJSONRPCConnectionState() {
      return JSONRPCConnectionState;
   }

   @JsonIgnore
   public void setJSONRPCConnectionState(JSONRPCConnectionState value) { 
      this.JSONRPCConnectionState = value;
   }
   
   @JsonIgnore
   public String getVRSID() {
      return VRSID;
   }

   @JsonIgnore
   public void setVRSID(String value) { 
      this.VRSID = value;
   }
   
   @JsonIgnore
   public VRSPersonality getVRSPersonality() {
      return VRSPersonality;
   }

   @JsonIgnore
   public void setVRSPersonality(VRSPersonality value) { 
      this.VRSPersonality = value;
   }
   
   @JsonIgnore
   public VSCConfigState getVSCConfigState() {
      return VSCConfigState;
   }

   @JsonIgnore
   public void setVSCConfigState(VSCConfigState value) { 
      this.VSCConfigState = value;
   }
   
   @JsonIgnore
   public VSCCurrentState getVSCCurrentState() {
      return VSCCurrentState;
   }

   @JsonIgnore
   public void setVSCCurrentState(VSCCurrentState value) { 
      this.VSCCurrentState = value;
   }
   
   @JsonIgnore
   public ClusterNodeRole getClusterNodeRole() {
      return clusterNodeRole;
   }

   @JsonIgnore
   public void setClusterNodeRole(ClusterNodeRole value) { 
      this.clusterNodeRole = value;
   }
   
   @JsonIgnore
   public java.util.List<SysmonUplinkConnection> getConnections() {
      return connections;
   }

   @JsonIgnore
   public void setConnections(java.util.List<SysmonUplinkConnection> value) { 
      this.connections = value;
   }
   
   @JsonIgnore
   public String getControllerID() {
      return controllerID;
   }

   @JsonIgnore
   public void setControllerID(String value) { 
      this.controllerID = value;
   }
   
   @JsonIgnore
   public String getControllerType() {
      return controllerType;
   }

   @JsonIgnore
   public void setControllerType(String value) { 
      this.controllerType = value;
   }
   
   @JsonIgnore
   public Boolean getDynamic() {
      return dynamic;
   }

   @JsonIgnore
   public void setDynamic(Boolean value) { 
      this.dynamic = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   
   @JsonIgnore
   public String getPeer() {
      return peer;
   }

   @JsonIgnore
   public void setPeer(String value) { 
      this.peer = value;
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
   public Status getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(Status value) { 
      this.status = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public HSCsFetcher getHSCs() {
      return hSCs;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public VRSsFetcher getVRSs() {
      return vRSs;
   }
   
   @JsonIgnore
   public VSCsFetcher getVSCs() {
      return vSCs;
   }
   

   public String toString() {
      return "ControllerVRSLink [" + "JSONRPCConnectionState=" + JSONRPCConnectionState + ", VRSID=" + VRSID + ", VRSPersonality=" + VRSPersonality + ", VSCConfigState=" + VSCConfigState + ", VSCCurrentState=" + VSCCurrentState + ", clusterNodeRole=" + clusterNodeRole + ", connections=" + connections + ", controllerID=" + controllerID + ", controllerType=" + controllerType + ", dynamic=" + dynamic + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", peer=" + peer + ", role=" + role + ", status=" + status + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}