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

import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.NSPortsFetcher;
import vspk.v4_0.fetchers.VLANsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedundantPort extends RestObject {

   public final static String REST_NAME = "nsredundantport";
   public final static String RESOURCE_NAME = "nsredundantports";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum PortType { ACCESS, NETWORK };
   public enum Status { INITIALIZED, MISMATCH, ORPHAN, READY };

   
   @JsonProperty(value = "VLANRange")
   protected String VLANRange;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
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
   
   @JsonProperty(value = "portPeer1ID")
   protected String portPeer1ID;
   
   @JsonProperty(value = "portPeer2ID")
   protected String portPeer2ID;
   
   @JsonProperty(value = "portType")
   protected PortType portType;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "useUntaggedHeartbeatVlan")
   protected boolean useUntaggedHeartbeatVlan;
   
   @JsonProperty(value = "useUserMnemonic")
   protected boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   protected String userMnemonic;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NSPortsFetcher nSPorts;
   
   @JsonIgnore
   private VLANsFetcher vLANs;
   

   public RedundantPort() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nSPorts = new NSPortsFetcher(this);
      
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
   public String getPortPeer1ID() {
      return portPeer1ID;
   }

   public void setPortPeer1ID(String value) { 
      this.portPeer1ID = value;
   }
   public String getPortPeer2ID() {
      return portPeer2ID;
   }

   public void setPortPeer2ID(String value) { 
      this.portPeer2ID = value;
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
   public boolean getUseUntaggedHeartbeatVlan() {
      return useUntaggedHeartbeatVlan;
   }

   public void setUseUntaggedHeartbeatVlan(boolean value) { 
      this.useUntaggedHeartbeatVlan = value;
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
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public NSPortsFetcher getNSPorts() {
      return nSPorts;
   }
   
   public VLANsFetcher getVLANs() {
      return vLANs;
   }
   

   public String toString() {
      return "RedundantPort [" + "VLANRange=" + VLANRange + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", infrastructureProfileID=" + infrastructureProfileID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", physicalName=" + physicalName + ", portPeer1ID=" + portPeer1ID + ", portPeer2ID=" + portPeer2ID + ", portType=" + portType + ", status=" + status + ", useUntaggedHeartbeatVlan=" + useUntaggedHeartbeatVlan + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}