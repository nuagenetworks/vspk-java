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

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v5_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GatewaysFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PortsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.WANServicesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VsgRedundantPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "redundancygroup", resourceName = "redundancygroups")
public class RedundancyGroup extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   
   public enum Personality { DC7X50, HARDWARE_VTEP, NSG, OTHER, VRSG, VSA, VSG };
   
   public enum RedundantGatewayStatus { FAILED, SUCCESS };

   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gatewayPeer1AutodiscoveredGatewayID")
   protected String gatewayPeer1AutodiscoveredGatewayID;
   
   @JsonProperty(value = "gatewayPeer1ID")
   protected String gatewayPeer1ID;
   
   @JsonProperty(value = "gatewayPeer1Name")
   protected String gatewayPeer1Name;
   
   @JsonProperty(value = "gatewayPeer2AutodiscoveredGatewayID")
   protected String gatewayPeer2AutodiscoveredGatewayID;
   
   @JsonProperty(value = "gatewayPeer2ID")
   protected String gatewayPeer2ID;
   
   @JsonProperty(value = "gatewayPeer2Name")
   protected String gatewayPeer2Name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "redundantGatewayStatus")
   protected RedundantGatewayStatus redundantGatewayStatus;
   
   @JsonProperty(value = "vtep")
   protected String vtep;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GatewaysFetcher gateways;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private PortsFetcher ports;
   
   @JsonIgnore
   private WANServicesFetcher wANServices;
   
   @JsonIgnore
   private VsgRedundantPortsFetcher vsgRedundantPorts;
   

   public RedundancyGroup() {
      
      alarms = new AlarmsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      gateways = new GatewaysFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      ports = new PortsFetcher(this);
      
      wANServices = new WANServicesFetcher(this);
      
      vsgRedundantPorts = new VsgRedundantPortsFetcher(this);
      
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
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
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
   public String getGatewayPeer1AutodiscoveredGatewayID() {
      return gatewayPeer1AutodiscoveredGatewayID;
   }

   @JsonIgnore
   public void setGatewayPeer1AutodiscoveredGatewayID(String value) { 
      this.gatewayPeer1AutodiscoveredGatewayID = value;
   }
   
   @JsonIgnore
   public String getGatewayPeer1ID() {
      return gatewayPeer1ID;
   }

   @JsonIgnore
   public void setGatewayPeer1ID(String value) { 
      this.gatewayPeer1ID = value;
   }
   
   @JsonIgnore
   public String getGatewayPeer1Name() {
      return gatewayPeer1Name;
   }

   @JsonIgnore
   public void setGatewayPeer1Name(String value) { 
      this.gatewayPeer1Name = value;
   }
   
   @JsonIgnore
   public String getGatewayPeer2AutodiscoveredGatewayID() {
      return gatewayPeer2AutodiscoveredGatewayID;
   }

   @JsonIgnore
   public void setGatewayPeer2AutodiscoveredGatewayID(String value) { 
      this.gatewayPeer2AutodiscoveredGatewayID = value;
   }
   
   @JsonIgnore
   public String getGatewayPeer2ID() {
      return gatewayPeer2ID;
   }

   @JsonIgnore
   public void setGatewayPeer2ID(String value) { 
      this.gatewayPeer2ID = value;
   }
   
   @JsonIgnore
   public String getGatewayPeer2Name() {
      return gatewayPeer2Name;
   }

   @JsonIgnore
   public void setGatewayPeer2Name(String value) { 
      this.gatewayPeer2Name = value;
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
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   
   @JsonIgnore
   public Personality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(Personality value) { 
      this.personality = value;
   }
   
   @JsonIgnore
   public RedundantGatewayStatus getRedundantGatewayStatus() {
      return redundantGatewayStatus;
   }

   @JsonIgnore
   public void setRedundantGatewayStatus(RedundantGatewayStatus value) { 
      this.redundantGatewayStatus = value;
   }
   
   @JsonIgnore
   public String getVtep() {
      return vtep;
   }

   @JsonIgnore
   public void setVtep(String value) { 
      this.vtep = value;
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
   public GatewaysFetcher getGateways() {
      return gateways;
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
   public PortsFetcher getPorts() {
      return ports;
   }
   
   @JsonIgnore
   public WANServicesFetcher getWANServices() {
      return wANServices;
   }
   
   @JsonIgnore
   public VsgRedundantPortsFetcher getVsgRedundantPorts() {
      return vsgRedundantPorts;
   }
   

   public String toString() {
      return "RedundancyGroup [" + "description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayPeer1AutodiscoveredGatewayID=" + gatewayPeer1AutodiscoveredGatewayID + ", gatewayPeer1ID=" + gatewayPeer1ID + ", gatewayPeer1Name=" + gatewayPeer1Name + ", gatewayPeer2AutodiscoveredGatewayID=" + gatewayPeer2AutodiscoveredGatewayID + ", gatewayPeer2ID=" + gatewayPeer2ID + ", gatewayPeer2Name=" + gatewayPeer2Name + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", personality=" + personality + ", redundantGatewayStatus=" + redundantGatewayStatus + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}