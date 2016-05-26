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

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.SubnetTemplatesFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "zonetemplate", resourceName = "zonetemplates")
public class ZoneTemplate extends RestObject {

   
   public enum IPType { IPV4, IPV6 };
   public enum Encryption { DISABLED, ENABLED, INHERITED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Multicast { DISABLED, ENABLED, INHERITED };

   
   @JsonProperty(value = "IPType")
   protected IPType IPType;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "publicZone")
   protected Boolean publicZone;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "numberOfHostsInSubnets")
   protected Long numberOfHostsInSubnets;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private SubnetTemplatesFetcher subnetTemplates;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public ZoneTemplate() {
      multicast = Multicast.INHERITED;
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      subnetTemplates = new SubnetTemplatesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public IPType getIPType() {
      return IPType;
   }

   public void setIPType(IPType value) { 
      this.IPType = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getNetmask() {
      return netmask;
   }

   public void setNetmask(String value) { 
      this.netmask = value;
   }
   public Encryption getEncryption() {
      return encryption;
   }

   public void setEncryption(Encryption value) { 
      this.encryption = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   public Boolean getPublicZone() {
      return publicZone;
   }

   public void setPublicZone(Boolean value) { 
      this.publicZone = value;
   }
   public Multicast getMulticast() {
      return multicast;
   }

   public void setMulticast(Multicast value) { 
      this.multicast = value;
   }
   public Long getNumberOfHostsInSubnets() {
      return numberOfHostsInSubnets;
   }

   public void setNumberOfHostsInSubnets(Long value) { 
      this.numberOfHostsInSubnets = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public SubnetTemplatesFetcher getSubnetTemplates() {
      return subnetTemplates;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "ZoneTemplate [" + "IPType=" + IPType + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", address=" + address + ", description=" + description + ", netmask=" + netmask + ", encryption=" + encryption + ", entityScope=" + entityScope + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", publicZone=" + publicZone + ", multicast=" + multicast + ", numberOfHostsInSubnets=" + numberOfHostsInSubnets + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}