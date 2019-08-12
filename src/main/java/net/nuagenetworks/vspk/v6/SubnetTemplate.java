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


import net.nuagenetworks.vspk.v6.fetchers.AddressRangesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SubnetsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "subnettemplate", resourceName = "subnettemplates")
public class SubnetTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EDPI { DISABLED, ENABLED, INHERITED };
   public enum EIPType { DUALSTACK, IPV4, IPV6 };
   public enum EEncryption { DISABLED, ENABLED, INHERITED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EMulticast { DISABLED, ENABLED, INHERITED };
   public enum EUseGlobalMAC { DISABLED, ENABLED, ENTERPRISE_DEFAULT };

   
   @JsonProperty(value = "DPI")
   
   protected EDPI DPI;
   
   @JsonProperty(value = "IPType")
   
   protected EIPType IPType;
   
   @JsonProperty(value = "IPv6Address")
   
   protected String IPv6Address;
   
   @JsonProperty(value = "IPv6Gateway")
   
   protected String IPv6Gateway;
   
   @JsonProperty(value = "address")
   
   protected String address;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "dualStackDynamicIPAllocation")
   
   protected Boolean dualStackDynamicIPAllocation;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enableDHCPv4")
   
   protected Boolean enableDHCPv4;
   
   @JsonProperty(value = "enableDHCPv6")
   
   protected Boolean enableDHCPv6;
   
   @JsonProperty(value = "encryption")
   
   protected EEncryption encryption;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   
   protected String gateway;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "multicast")
   
   protected EMulticast multicast;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "netmask")
   
   protected String netmask;
   
   @JsonProperty(value = "proxyARP")
   
   protected Boolean proxyARP;
   
   @JsonProperty(value = "splitSubnet")
   
   protected Boolean splitSubnet;
   
   @JsonProperty(value = "useGlobalMAC")
   
   protected EUseGlobalMAC useGlobalMAC;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   

   public SubnetTemplate() {
      multicast = EMulticast.INHERITED;
      IPType = EIPType.IPV4;
      
      addressRanges = new AddressRangesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
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
   public String getIPv6Gateway() {
      return IPv6Gateway;
   }

   @JsonIgnore
   public void setIPv6Gateway(String value) { 
      this.IPv6Gateway = value;
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   
   
   @JsonIgnore
   public Boolean getDualStackDynamicIPAllocation() {
      return dualStackDynamicIPAllocation;
   }

   @JsonIgnore
   public void setDualStackDynamicIPAllocation(Boolean value) { 
      this.dualStackDynamicIPAllocation = value;
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
   public Boolean getEnableDHCPv4() {
      return enableDHCPv4;
   }

   @JsonIgnore
   public void setEnableDHCPv4(Boolean value) { 
      this.enableDHCPv4 = value;
   }
   
   
   @JsonIgnore
   public Boolean getEnableDHCPv6() {
      return enableDHCPv6;
   }

   @JsonIgnore
   public void setEnableDHCPv6(Boolean value) { 
      this.enableDHCPv6 = value;
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
   public String getGateway() {
      return gateway;
   }

   @JsonIgnore
   public void setGateway(String value) { 
      this.gateway = value;
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
   public Boolean getProxyARP() {
      return proxyARP;
   }

   @JsonIgnore
   public void setProxyARP(Boolean value) { 
      this.proxyARP = value;
   }
   
   
   @JsonIgnore
   public Boolean getSplitSubnet() {
      return splitSubnet;
   }

   @JsonIgnore
   public void setSplitSubnet(Boolean value) { 
      this.splitSubnet = value;
   }
   
   
   @JsonIgnore
   public EUseGlobalMAC getUseGlobalMAC() {
      return useGlobalMAC;
   }

   @JsonIgnore
   public void setUseGlobalMAC(EUseGlobalMAC value) { 
      this.useGlobalMAC = value;
   }
   

   
   @JsonIgnore
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
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
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   

   public String toString() {
      return "SubnetTemplate [" + "DPI=" + DPI + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", IPv6Gateway=" + IPv6Gateway + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", description=" + description + ", dualStackDynamicIPAllocation=" + dualStackDynamicIPAllocation + ", embeddedMetadata=" + embeddedMetadata + ", enableDHCPv4=" + enableDHCPv4 + ", enableDHCPv6=" + enableDHCPv6 + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", lastUpdatedBy=" + lastUpdatedBy + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", proxyARP=" + proxyARP + ", splitSubnet=" + splitSubnet + ", useGlobalMAC=" + useGlobalMAC + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}