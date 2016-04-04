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

import vspk.v4_0.fetchers.AggregateMetadatasFetcher;
import vspk.v4_0.fetchers.AlarmsFetcher;
import vspk.v4_0.fetchers.BGPNeighborsFetcher;
import vspk.v4_0.fetchers.BridgeInterfacesFetcher;
import vspk.v4_0.fetchers.DHCPOptionsFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.HostInterfacesFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.PolicyGroupsFetcher;
import vspk.v4_0.fetchers.QOSsFetcher;
import vspk.v4_0.fetchers.RedirectionTargetsFetcher;
import vspk.v4_0.fetchers.StatisticsFetcher;
import vspk.v4_0.fetchers.StatisticsPoliciesFetcher;
import vspk.v4_0.fetchers.TCAsFetcher;
import vspk.v4_0.fetchers.VirtualIPsFetcher;
import vspk.v4_0.fetchers.VMsFetcher;
import vspk.v4_0.fetchers.VMInterfacesFetcher;
import vspk.v4_0.fetchers.VPortMirrorsFetcher;
import vspk.v4_0.fetchers.VRSsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VPort extends RestObject {

   public final static String REST_NAME = "vport";
   public final static String RESOURCE_NAME = "vports";

   
   public enum AddressSpoofing { DISABLED, ENABLED, INHERITED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   public enum OperationalState { DOWN, INIT, UP };
   public enum SystemType { HARDWARE, HARDWARE_VTEP, NUAGE_1, NUAGE_2, NUAGE_VRSG, SOFTWARE };
   public enum Type { BRIDGE, HOST, VM };

   
   @JsonProperty(value = "VLANID")
   protected String VLANID;
   
   @JsonProperty(value = "active")
   protected boolean active;
   
   @JsonProperty(value = "addressSpoofing")
   protected AddressSpoofing addressSpoofing;
   
   @JsonProperty(value = "associatedFloatingIPID")
   protected String associatedFloatingIPID;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSendMulticastChannelMapID")
   protected String associatedSendMulticastChannelMapID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "domainID")
   protected String domainID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "hasAttachedInterfaces")
   protected boolean hasAttachedInterfaces;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "multiNICVPortID")
   protected String multiNICVPortID;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "operationalState")
   protected OperationalState operationalState;
   
   @JsonProperty(value = "systemType")
   protected SystemType systemType;
   
   @JsonProperty(value = "type")
   protected Type type;
   
   @JsonProperty(value = "zoneID")
   protected String zoneID;
   

   
   @JsonIgnore
   private AggregateMetadatasFetcher aggregateMetadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private BGPNeighborsFetcher bGPNeighbors;
   
   @JsonIgnore
   private BridgeInterfacesFetcher bridgeInterfaces;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private HostInterfacesFetcher hostInterfaces;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private VirtualIPsFetcher virtualIPs;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private VPortMirrorsFetcher vPortMirrors;
   
   @JsonIgnore
   private VRSsFetcher vRSs;
   

   public VPort() {
      
      aggregateMetadatas = new AggregateMetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      bGPNeighbors = new BGPNeighborsFetcher(this);
      
      bridgeInterfaces = new BridgeInterfacesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      hostInterfaces = new HostInterfacesFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      virtualIPs = new VirtualIPsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vPortMirrors = new VPortMirrorsFetcher(this);
      
      vRSs = new VRSsFetcher(this);
      
   }

   public String getVLANID() {
      return VLANID;
   }

   public void setVLANID(String value) { 
      this.VLANID = value;
   }
   public boolean getActive() {
      return active;
   }

   public void setActive(boolean value) { 
      this.active = value;
   }
   public AddressSpoofing getAddressSpoofing() {
      return addressSpoofing;
   }

   public void setAddressSpoofing(AddressSpoofing value) { 
      this.addressSpoofing = value;
   }
   public String getAssociatedFloatingIPID() {
      return associatedFloatingIPID;
   }

   public void setAssociatedFloatingIPID(String value) { 
      this.associatedFloatingIPID = value;
   }
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   public String getAssociatedSendMulticastChannelMapID() {
      return associatedSendMulticastChannelMapID;
   }

   public void setAssociatedSendMulticastChannelMapID(String value) { 
      this.associatedSendMulticastChannelMapID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getDomainID() {
      return domainID;
   }

   public void setDomainID(String value) { 
      this.domainID = value;
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
   public boolean getHasAttachedInterfaces() {
      return hasAttachedInterfaces;
   }

   public void setHasAttachedInterfaces(boolean value) { 
      this.hasAttachedInterfaces = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getMultiNICVPortID() {
      return multiNICVPortID;
   }

   public void setMultiNICVPortID(String value) { 
      this.multiNICVPortID = value;
   }
   public Multicast getMulticast() {
      return multicast;
   }

   public void setMulticast(Multicast value) { 
      this.multicast = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public OperationalState getOperationalState() {
      return operationalState;
   }

   public void setOperationalState(OperationalState value) { 
      this.operationalState = value;
   }
   public SystemType getSystemType() {
      return systemType;
   }

   public void setSystemType(SystemType value) { 
      this.systemType = value;
   }
   public Type getType() {
      return type;
   }

   public void setType(Type value) { 
      this.type = value;
   }
   public String getZoneID() {
      return zoneID;
   }

   public void setZoneID(String value) { 
      this.zoneID = value;
   }
   

   
   public AggregateMetadatasFetcher getAggregateMetadatas() {
      return aggregateMetadatas;
   }
   
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   public BGPNeighborsFetcher getBGPNeighbors() {
      return bGPNeighbors;
   }
   
   public BridgeInterfacesFetcher getBridgeInterfaces() {
      return bridgeInterfaces;
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
   
   public HostInterfacesFetcher getHostInterfaces() {
      return hostInterfaces;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   public VirtualIPsFetcher getVirtualIPs() {
      return virtualIPs;
   }
   
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
   }
   
   public VPortMirrorsFetcher getVPortMirrors() {
      return vPortMirrors;
   }
   
   public VRSsFetcher getVRSs() {
      return vRSs;
   }
   

   public String toString() {
      return "VPort [" + "VLANID=" + VLANID + ", active=" + active + ", addressSpoofing=" + addressSpoofing + ", associatedFloatingIPID=" + associatedFloatingIPID + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSendMulticastChannelMapID=" + associatedSendMulticastChannelMapID + ", description=" + description + ", domainID=" + domainID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", hasAttachedInterfaces=" + hasAttachedInterfaces + ", lastUpdatedBy=" + lastUpdatedBy + ", multiNICVPortID=" + multiNICVPortID + ", multicast=" + multicast + ", name=" + name + ", operationalState=" + operationalState + ", systemType=" + systemType + ", type=" + type + ", zoneID=" + zoneID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}