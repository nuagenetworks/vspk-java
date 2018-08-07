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
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "shuntlink", resourceName = "shuntlinks")
public class ShuntLink extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "VLANPeer1ID")
   protected String VLANPeer1ID;
   
   @JsonProperty(value = "VLANPeer2ID")
   protected String VLANPeer2ID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gatewayPeer1ID")
   protected String gatewayPeer1ID;
   
   @JsonProperty(value = "gatewayPeer2ID")
   protected String gatewayPeer2ID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "peer1IPAddress")
   protected String peer1IPAddress;
   
   @JsonProperty(value = "peer1Subnet")
   protected String peer1Subnet;
   
   @JsonProperty(value = "peer2IPAddress")
   protected String peer2IPAddress;
   
   @JsonProperty(value = "peer2Subnet")
   protected String peer2Subnet;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public ShuntLink() {
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   @JsonIgnore
   public String getVLANPeer1ID() {
      return VLANPeer1ID;
   }

   @JsonIgnore
   public void setVLANPeer1ID(String value) { 
      this.VLANPeer1ID = value;
   }
   
   @JsonIgnore
   public String getVLANPeer2ID() {
      return VLANPeer2ID;
   }

   @JsonIgnore
   public void setVLANPeer2ID(String value) { 
      this.VLANPeer2ID = value;
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
   public String getGatewayPeer1ID() {
      return gatewayPeer1ID;
   }

   @JsonIgnore
   public void setGatewayPeer1ID(String value) { 
      this.gatewayPeer1ID = value;
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
   public String getPeer1IPAddress() {
      return peer1IPAddress;
   }

   @JsonIgnore
   public void setPeer1IPAddress(String value) { 
      this.peer1IPAddress = value;
   }
   
   @JsonIgnore
   public String getPeer1Subnet() {
      return peer1Subnet;
   }

   @JsonIgnore
   public void setPeer1Subnet(String value) { 
      this.peer1Subnet = value;
   }
   
   @JsonIgnore
   public String getPeer2IPAddress() {
      return peer2IPAddress;
   }

   @JsonIgnore
   public void setPeer2IPAddress(String value) { 
      this.peer2IPAddress = value;
   }
   
   @JsonIgnore
   public String getPeer2Subnet() {
      return peer2Subnet;
   }

   @JsonIgnore
   public void setPeer2Subnet(String value) { 
      this.peer2Subnet = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "ShuntLink [" + "VLANPeer1ID=" + VLANPeer1ID + ", VLANPeer2ID=" + VLANPeer2ID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayPeer1ID=" + gatewayPeer1ID + ", gatewayPeer2ID=" + gatewayPeer2ID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", peer1IPAddress=" + peer1IPAddress + ", peer1Subnet=" + peer1Subnet + ", peer2IPAddress=" + peer2IPAddress + ", peer2Subnet=" + peer2Subnet + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}