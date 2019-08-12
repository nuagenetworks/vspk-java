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
import net.nuagenetworks.vspk.v6.fetchers.NSPortsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PortsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.WANServicesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.WirelessPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "autodiscoveredgateway", resourceName = "autodiscoveredgateways")
public class AutoDiscoveredGateway extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPersonality { DC7X50, HARDWARE_VTEP, NSG, OTHER, VRSB, VRSG, VSA, VSG };

   
   @JsonProperty(value = "controllers")
   
   protected java.util.List<String> controllers;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gatewayID")
   
   protected String gatewayID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "peer")
   
   protected String peer;
   
   @JsonProperty(value = "personality")
   
   protected EPersonality personality;
   
   @JsonProperty(value = "systemID")
   
   protected String systemID;
   
   @JsonProperty(value = "vtep")
   
   protected String vtep;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NSPortsFetcher nSPorts;
   
   @JsonIgnore
   private PortsFetcher ports;
   
   @JsonIgnore
   private WANServicesFetcher wANServices;
   
   @JsonIgnore
   private WirelessPortsFetcher wirelessPorts;
   

   public AutoDiscoveredGateway() {
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nSPorts = new NSPortsFetcher(this);
      
      ports = new PortsFetcher(this);
      
      wANServices = new WANServicesFetcher(this);
      
      wirelessPorts = new WirelessPortsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public java.util.List<String> getControllers() {
      return controllers;
   }

   @JsonIgnore
   public void setControllers(java.util.List<String> value) { 
      this.controllers = value;
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
   public String getGatewayID() {
      return gatewayID;
   }

   @JsonIgnore
   public void setGatewayID(String value) { 
      this.gatewayID = value;
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
   public EPersonality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(EPersonality value) { 
      this.personality = value;
   }
   
   
   @JsonIgnore
   public String getSystemID() {
      return systemID;
   }

   @JsonIgnore
   public void setSystemID(String value) { 
      this.systemID = value;
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
   public NSPortsFetcher getNSPorts() {
      return nSPorts;
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
   public WirelessPortsFetcher getWirelessPorts() {
      return wirelessPorts;
   }
   

   public String toString() {
      return "AutoDiscoveredGateway [" + "controllers=" + controllers + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayID=" + gatewayID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", peer=" + peer + ", personality=" + personality + ", systemID=" + systemID + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}