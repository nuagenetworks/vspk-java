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


import net.nuagenetworks.vspk.v6.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DHCPv6OptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MultiCastChannelMapsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyDecisionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.RedirectionTargetsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StaticRoutesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TCAsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vminterface", resourceName = "vminterfaces")
public class VMInterface extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAttachedNetworkType { L2DOMAIN, SUBNET };
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "IPAddress")
   
   protected String IPAddress;
   
   @JsonProperty(value = "IPv6Address")
   
   protected String IPv6Address;
   
   @JsonProperty(value = "IPv6Gateway")
   
   protected String IPv6Gateway;
   
   @JsonProperty(value = "MAC")
   
   protected String MAC;
   
   @JsonProperty(value = "VMUUID")
   
   protected String VMUUID;
   
   @JsonProperty(value = "VPortID")
   
   protected String VPortID;
   
   @JsonProperty(value = "VPortName")
   
   protected String VPortName;
   
   @JsonProperty(value = "attachedNetworkID")
   
   protected String attachedNetworkID;
   
   @JsonProperty(value = "attachedNetworkType")
   
   protected EAttachedNetworkType attachedNetworkType;
   
   @JsonProperty(value = "domainID")
   
   protected String domainID;
   
   @JsonProperty(value = "domainName")
   
   protected String domainName;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   
   protected String gateway;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "multiNICVPortName")
   
   protected String multiNICVPortName;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "netmask")
   
   protected String netmask;
   
   @JsonProperty(value = "networkName")
   
   protected String networkName;
   
   @JsonProperty(value = "policyDecisionID")
   
   protected String policyDecisionID;
   
   @JsonProperty(value = "tierID")
   
   protected String tierID;
   
   @JsonProperty(value = "zoneID")
   
   protected String zoneID;
   
   @JsonProperty(value = "zoneName")
   
   protected String zoneName;
   

   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private DHCPv6OptionsFetcher dHCPv6Options;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MultiCastChannelMapsFetcher multiCastChannelMaps;
   
   @JsonIgnore
   private PolicyDecisionsFetcher policyDecisions;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private StaticRoutesFetcher staticRoutes;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private TCAsFetcher tCAs;
   

   public VMInterface() {
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      dHCPv6Options = new DHCPv6OptionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      multiCastChannelMaps = new MultiCastChannelMapsFetcher(this);
      
      policyDecisions = new PolicyDecisionsFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getIPAddress() {
      return IPAddress;
   }

   @JsonIgnore
   public void setIPAddress(String value) { 
      this.IPAddress = value;
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
   public String getMAC() {
      return MAC;
   }

   @JsonIgnore
   public void setMAC(String value) { 
      this.MAC = value;
   }
   
   
   @JsonIgnore
   public String getVMUUID() {
      return VMUUID;
   }

   @JsonIgnore
   public void setVMUUID(String value) { 
      this.VMUUID = value;
   }
   
   
   @JsonIgnore
   public String getVPortID() {
      return VPortID;
   }

   @JsonIgnore
   public void setVPortID(String value) { 
      this.VPortID = value;
   }
   
   
   @JsonIgnore
   public String getVPortName() {
      return VPortName;
   }

   @JsonIgnore
   public void setVPortName(String value) { 
      this.VPortName = value;
   }
   
   
   @JsonIgnore
   public String getAttachedNetworkID() {
      return attachedNetworkID;
   }

   @JsonIgnore
   public void setAttachedNetworkID(String value) { 
      this.attachedNetworkID = value;
   }
   
   
   @JsonIgnore
   public EAttachedNetworkType getAttachedNetworkType() {
      return attachedNetworkType;
   }

   @JsonIgnore
   public void setAttachedNetworkType(EAttachedNetworkType value) { 
      this.attachedNetworkType = value;
   }
   
   
   @JsonIgnore
   public String getDomainID() {
      return domainID;
   }

   @JsonIgnore
   public void setDomainID(String value) { 
      this.domainID = value;
   }
   
   
   @JsonIgnore
   public String getDomainName() {
      return domainName;
   }

   @JsonIgnore
   public void setDomainName(String value) { 
      this.domainName = value;
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
   public String getMultiNICVPortName() {
      return multiNICVPortName;
   }

   @JsonIgnore
   public void setMultiNICVPortName(String value) { 
      this.multiNICVPortName = value;
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
   public String getNetworkName() {
      return networkName;
   }

   @JsonIgnore
   public void setNetworkName(String value) { 
      this.networkName = value;
   }
   
   
   @JsonIgnore
   public String getPolicyDecisionID() {
      return policyDecisionID;
   }

   @JsonIgnore
   public void setPolicyDecisionID(String value) { 
      this.policyDecisionID = value;
   }
   
   
   @JsonIgnore
   public String getTierID() {
      return tierID;
   }

   @JsonIgnore
   public void setTierID(String value) { 
      this.tierID = value;
   }
   
   
   @JsonIgnore
   public String getZoneID() {
      return zoneID;
   }

   @JsonIgnore
   public void setZoneID(String value) { 
      this.zoneID = value;
   }
   
   
   @JsonIgnore
   public String getZoneName() {
      return zoneName;
   }

   @JsonIgnore
   public void setZoneName(String value) { 
      this.zoneName = value;
   }
   

   
   @JsonIgnore
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   @JsonIgnore
   public DHCPv6OptionsFetcher getDHCPv6Options() {
      return dHCPv6Options;
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
   public MultiCastChannelMapsFetcher getMultiCastChannelMaps() {
      return multiCastChannelMaps;
   }
   
   @JsonIgnore
   public PolicyDecisionsFetcher getPolicyDecisions() {
      return policyDecisions;
   }
   
   @JsonIgnore
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   @JsonIgnore
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   @JsonIgnore
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   @JsonIgnore
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   

   public String toString() {
      return "VMInterface [" + "IPAddress=" + IPAddress + ", IPv6Address=" + IPv6Address + ", IPv6Gateway=" + IPv6Gateway + ", MAC=" + MAC + ", VMUUID=" + VMUUID + ", VPortID=" + VPortID + ", VPortName=" + VPortName + ", attachedNetworkID=" + attachedNetworkID + ", attachedNetworkType=" + attachedNetworkType + ", domainID=" + domainID + ", domainName=" + domainName + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", lastUpdatedBy=" + lastUpdatedBy + ", multiNICVPortName=" + multiNICVPortName + ", name=" + name + ", netmask=" + netmask + ", networkName=" + networkName + ", policyDecisionID=" + policyDecisionID + ", tierID=" + tierID + ", zoneID=" + zoneID + ", zoneName=" + zoneName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}