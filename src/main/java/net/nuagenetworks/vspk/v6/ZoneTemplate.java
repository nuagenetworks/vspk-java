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
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SubnetTemplatesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "zonetemplate", resourceName = "zonetemplates")
public class ZoneTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EDPI { DISABLED, ENABLED, INHERITED };
   public enum EIPType { IPV4, IPV6 };
   public enum EEncryption { DISABLED, ENABLED, INHERITED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EMulticast { DISABLED, ENABLED, INHERITED };

   
   @JsonProperty(value = "DPI")
   
   protected EDPI DPI;
   
   @JsonProperty(value = "IPType")
   
   protected EIPType IPType;
   
   @JsonProperty(value = "IPv6Address")
   
   protected String IPv6Address;
   
   @JsonProperty(value = "address")
   
   protected String address;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "creationDate")
   
   protected String creationDate;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "dynamicIpv6Address")
   
   protected Boolean dynamicIpv6Address;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "encryption")
   
   protected EEncryption encryption;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUpdatedDate")
   
   protected String lastUpdatedDate;
   
   @JsonProperty(value = "multicast")
   
   protected EMulticast multicast;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "netmask")
   
   protected String netmask;
   
   @JsonProperty(value = "numberOfHostsInSubnets")
   
   protected Long numberOfHostsInSubnets;
   
   @JsonProperty(value = "owner")
   
   protected String owner;
   
   @JsonProperty(value = "publicZone")
   
   protected Boolean publicZone;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private SubnetTemplatesFetcher subnetTemplates;
   

   public ZoneTemplate() {
      multicast = EMulticast.INHERITED;
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      subnetTemplates = new SubnetTemplatesFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EDPI getDPI() {
      return DPI;
   }

   @JsonIgnore
   public void setDPI(EDPI value) { 
      this.DPI = value;
   }
   
   
   @JsonIgnore
   public EIPType getIPType() {
      return IPType;
   }

   @JsonIgnore
   public void setIPType(EIPType value) { 
      this.IPType = value;
   }
   
   
   @JsonIgnore
   public String getIPv6Address() {
      return IPv6Address;
   }

   @JsonIgnore
   public void setIPv6Address(String value) { 
      this.IPv6Address = value;
   }
   
   
   @JsonIgnore
   public String getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(String value) { 
      this.address = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   @JsonIgnore
   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
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
   public Boolean getDynamicIpv6Address() {
      return dynamicIpv6Address;
   }

   @JsonIgnore
   public void setDynamicIpv6Address(Boolean value) { 
      this.dynamicIpv6Address = value;
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
   public EEncryption getEncryption() {
      return encryption;
   }

   @JsonIgnore
   public void setEncryption(EEncryption value) { 
      this.encryption = value;
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
   public String getLastUpdatedDate() {
      return lastUpdatedDate;
   }

   @JsonIgnore
   public void setLastUpdatedDate(String value) { 
      this.lastUpdatedDate = value;
   }
   
   
   @JsonIgnore
   public EMulticast getMulticast() {
      return multicast;
   }

   @JsonIgnore
   public void setMulticast(EMulticast value) { 
      this.multicast = value;
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
   public String getNetmask() {
      return netmask;
   }

   @JsonIgnore
   public void setNetmask(String value) { 
      this.netmask = value;
   }
   
   
   @JsonIgnore
   public Long getNumberOfHostsInSubnets() {
      return numberOfHostsInSubnets;
   }

   @JsonIgnore
   public void setNumberOfHostsInSubnets(Long value) { 
      this.numberOfHostsInSubnets = value;
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
   public Boolean getPublicZone() {
      return publicZone;
   }

   @JsonIgnore
   public void setPublicZone(Boolean value) { 
      this.publicZone = value;
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
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public SubnetTemplatesFetcher getSubnetTemplates() {
      return subnetTemplates;
   }
   

   public String toString() {
      return "ZoneTemplate [" + "DPI=" + DPI + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", creationDate=" + creationDate + ", description=" + description + ", dynamicIpv6Address=" + dynamicIpv6Address + ", embeddedMetadata=" + embeddedMetadata + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", numberOfHostsInSubnets=" + numberOfHostsInSubnets + ", owner=" + owner + ", publicZone=" + publicZone + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}