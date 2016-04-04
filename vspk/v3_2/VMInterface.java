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


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.DHCPOptionsFetcher;
import vspk.v3_2.fetchers.EventLogsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.MultiCastChannelMapsFetcher;
import vspk.v3_2.fetchers.PolicyDecisionsFetcher;
import vspk.v3_2.fetchers.PolicyGroupsFetcher;
import vspk.v3_2.fetchers.RedirectionTargetsFetcher;
import vspk.v3_2.fetchers.StaticRoutesFetcher;
import vspk.v3_2.fetchers.StatisticsFetcher;
import vspk.v3_2.fetchers.TCAsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VMInterface extends RestObject {

   public final static String REST_NAME = "vminterface";
   public final static String RESOURCE_NAME = "vminterfaces";

   
   public enum AttachedNetworkType { L2DOMAIN, SUBNET };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "IPAddress")
   protected String IPAddress;
   
   @JsonProperty(value = "MAC")
   protected String MAC;
   
   @JsonProperty(value = "VMUUID")
   protected String VMUUID;
   
   @JsonProperty(value = "VPortID")
   protected String VPortID;
   
   @JsonProperty(value = "VPortName")
   protected String VPortName;
   
   @JsonProperty(value = "associatedFloatingIPAddress")
   protected String associatedFloatingIPAddress;
   
   @JsonProperty(value = "attachedNetworkID")
   protected String attachedNetworkID;
   
   @JsonProperty(value = "attachedNetworkType")
   protected AttachedNetworkType attachedNetworkType;
   
   @JsonProperty(value = "domainID")
   protected String domainID;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
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

   public String getIPAddress() {
      return IPAddress;
   }

   public void setIPAddress(String value) { 
      this.IPAddress = value;
   }
   public String getMAC() {
      return MAC;
   }

   public void setMAC(String value) { 
      this.MAC = value;
   }
   public String getVMUUID() {
      return VMUUID;
   }

   public void setVMUUID(String value) { 
      this.VMUUID = value;
   }
   public String getVPortID() {
      return VPortID;
   }

   public void setVPortID(String value) { 
      this.VPortID = value;
   }
   public String getVPortName() {
      return VPortName;
   }

   public void setVPortName(String value) { 
      this.VPortName = value;
   }
   public String getAssociatedFloatingIPAddress() {
      return associatedFloatingIPAddress;
   }

   public void setAssociatedFloatingIPAddress(String value) { 
      this.associatedFloatingIPAddress = value;
   }
   public String getAttachedNetworkID() {
      return attachedNetworkID;
   }

   public void setAttachedNetworkID(String value) { 
      this.attachedNetworkID = value;
   }
   public AttachedNetworkType getAttachedNetworkType() {
      return attachedNetworkType;
   }

   public void setAttachedNetworkType(AttachedNetworkType value) { 
      this.attachedNetworkType = value;
   }
   public String getDomainID() {
      return domainID;
   }

   public void setDomainID(String value) { 
      this.domainID = value;
   }
   public String getDomainName() {
      return domainName;
   }

   public void setDomainName(String value) { 
      this.domainName = value;
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
   public String getGateway() {
      return gateway;
   }

   public void setGateway(String value) { 
      this.gateway = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getMultiNICVPortName() {
      return multiNICVPortName;
   }

   public void setMultiNICVPortName(String value) { 
      this.multiNICVPortName = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getNetmask() {
      return netmask;
   }

   public void setNetmask(String value) { 
      this.netmask = value;
   }
   public String getNetworkName() {
      return networkName;
   }

   public void setNetworkName(String value) { 
      this.networkName = value;
   }
   public String getPolicyDecisionID() {
      return policyDecisionID;
   }

   public void setPolicyDecisionID(String value) { 
      this.policyDecisionID = value;
   }
   public String getTierID() {
      return tierID;
   }

   public void setTierID(String value) { 
      this.tierID = value;
   }
   public String getZoneID() {
      return zoneID;
   }

   public void setZoneID(String value) { 
      this.zoneID = value;
   }
   public String getZoneName() {
      return zoneName;
   }

   public void setZoneName(String value) { 
      this.zoneName = value;
   }
   

   
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
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
   
   public MultiCastChannelMapsFetcher getMultiCastChannelMaps() {
      return multiCastChannelMaps;
   }
   
   public PolicyDecisionsFetcher getPolicyDecisions() {
      return policyDecisions;
   }
   
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   

   public String toString() {
      return "VMInterface [" + "IPAddress=" + IPAddress + ", MAC=" + MAC + ", VMUUID=" + VMUUID + ", VPortID=" + VPortID + ", VPortName=" + VPortName + ", associatedFloatingIPAddress=" + associatedFloatingIPAddress + ", attachedNetworkID=" + attachedNetworkID + ", attachedNetworkType=" + attachedNetworkType + ", domainID=" + domainID + ", domainName=" + domainName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", lastUpdatedBy=" + lastUpdatedBy + ", multiNICVPortName=" + multiNICVPortName + ", name=" + name + ", netmask=" + netmask + ", networkName=" + networkName + ", policyDecisionID=" + policyDecisionID + ", tierID=" + tierID + ", zoneID=" + zoneID + ", zoneName=" + zoneName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}