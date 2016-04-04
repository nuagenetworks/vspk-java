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
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.NSGatewaysFetcher;
import vspk.v4_0.fetchers.RedundantPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NSRedundantGatewayGroup extends RestObject {

   public final static String REST_NAME = "nsgredundancygroup";
   public final static String RESOURCE_NAME = "nsgredundancygroups";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Personality { DC7X50, HARDWARE_VTEP, NSG, OTHER, VRSG, VSA, VSG };
   public enum RedundantGatewayStatus { FAILED, SUCCESS };

   
   @JsonProperty(value = "consecutiveFailuresCount")
   protected int consecutiveFailuresCount;
   
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
   
   @JsonProperty(value = "gatewayPeer2Name")
   protected String gatewayPeer2Name;
   
   @JsonProperty(value = "heartbeatInterval")
   protected int heartbeatInterval;
   
   @JsonProperty(value = "heartbeatVLANID")
   protected int heartbeatVLANID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "redundancyPortIDs")
   protected java.util.List<String> redundancyPortIDs;
   
   @JsonProperty(value = "redundantGatewayStatus")
   protected RedundantGatewayStatus redundantGatewayStatus;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   
   @JsonIgnore
   private RedundantPortsFetcher redundantPorts;
   

   public NSRedundantGatewayGroup() {
      
      alarms = new AlarmsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nSGateways = new NSGatewaysFetcher(this);
      
      redundantPorts = new RedundantPortsFetcher(this);
      
   }

   public int getConsecutiveFailuresCount() {
      return consecutiveFailuresCount;
   }

   public void setConsecutiveFailuresCount(int value) { 
      this.consecutiveFailuresCount = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getEnterpriseID() {
      return enterpriseID;
   }

   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
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
   public String getGatewayPeer1AutodiscoveredGatewayID() {
      return gatewayPeer1AutodiscoveredGatewayID;
   }

   public void setGatewayPeer1AutodiscoveredGatewayID(String value) { 
      this.gatewayPeer1AutodiscoveredGatewayID = value;
   }
   public String getGatewayPeer1ID() {
      return gatewayPeer1ID;
   }

   public void setGatewayPeer1ID(String value) { 
      this.gatewayPeer1ID = value;
   }
   public String getGatewayPeer1Name() {
      return gatewayPeer1Name;
   }

   public void setGatewayPeer1Name(String value) { 
      this.gatewayPeer1Name = value;
   }
   public String getGatewayPeer2AutodiscoveredGatewayID() {
      return gatewayPeer2AutodiscoveredGatewayID;
   }

   public void setGatewayPeer2AutodiscoveredGatewayID(String value) { 
      this.gatewayPeer2AutodiscoveredGatewayID = value;
   }
   public String getGatewayPeer2Name() {
      return gatewayPeer2Name;
   }

   public void setGatewayPeer2Name(String value) { 
      this.gatewayPeer2Name = value;
   }
   public int getHeartbeatInterval() {
      return heartbeatInterval;
   }

   public void setHeartbeatInterval(int value) { 
      this.heartbeatInterval = value;
   }
   public int getHeartbeatVLANID() {
      return heartbeatVLANID;
   }

   public void setHeartbeatVLANID(int value) { 
      this.heartbeatVLANID = value;
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
   public Personality getPersonality() {
      return personality;
   }

   public void setPersonality(Personality value) { 
      this.personality = value;
   }
   public java.util.List<String> getRedundancyPortIDs() {
      return redundancyPortIDs;
   }

   public void setRedundancyPortIDs(java.util.List<String> value) { 
      this.redundancyPortIDs = value;
   }
   public RedundantGatewayStatus getRedundantGatewayStatus() {
      return redundantGatewayStatus;
   }

   public void setRedundantGatewayStatus(RedundantGatewayStatus value) { 
      this.redundantGatewayStatus = value;
   }
   

   
   public AlarmsFetcher getAlarms() {
      return alarms;
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
   
   public NSGatewaysFetcher getNSGateways() {
      return nSGateways;
   }
   
   public RedundantPortsFetcher getRedundantPorts() {
      return redundantPorts;
   }
   

   public String toString() {
      return "NSRedundantGatewayGroup [" + "consecutiveFailuresCount=" + consecutiveFailuresCount + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayPeer1AutodiscoveredGatewayID=" + gatewayPeer1AutodiscoveredGatewayID + ", gatewayPeer1ID=" + gatewayPeer1ID + ", gatewayPeer1Name=" + gatewayPeer1Name + ", gatewayPeer2AutodiscoveredGatewayID=" + gatewayPeer2AutodiscoveredGatewayID + ", gatewayPeer2Name=" + gatewayPeer2Name + ", heartbeatInterval=" + heartbeatInterval + ", heartbeatVLANID=" + heartbeatVLANID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", personality=" + personality + ", redundancyPortIDs=" + redundancyPortIDs + ", redundantGatewayStatus=" + redundantGatewayStatus + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}