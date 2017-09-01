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


import net.nuagenetworks.vspk.v5_0.fetchers.AggregateMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ApplicationperformancemanagementsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.BGPNeighborsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.BridgeInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EgressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.HostInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IngressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IngressAdvFwdEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PolicyGroupsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PortMappingsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.RedirectionTargetsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.TrunksFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VirtualIPsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VNFInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VPortMirrorsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VRSsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vport", resourceName = "vports")
public class VPort extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum DPI { DISABLED, ENABLED, INHERITED };
   public enum AddressSpoofing { DISABLED, ENABLED, INHERITED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum GatewayMACMoveRole { SECONDARY, TERTIARY };
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   public enum OperationalState { DOWN, INIT, UP };
   public enum SegmentationType { VLAN };
   public enum SubType { NONE, VNF };
   public enum SystemType { HARDWARE, HARDWARE_VTEP, NUAGE_1, NUAGE_2, NUAGE_VRSG, SOFTWARE };
   public enum TrunkRole { PARENT_PORT, SUB_PORT };
   public enum Type { BRIDGE, CONTAINER, HOST, VM };

   
   @JsonProperty(value = "DPI")
   protected DPI DPI;
   
   @JsonProperty(value = "VLANID")
   protected String VLANID;
   
   @JsonProperty(value = "active")
   protected Boolean active;
   
   @JsonProperty(value = "addressSpoofing")
   protected AddressSpoofing addressSpoofing;
   
   @JsonProperty(value = "associatedFloatingIPID")
   protected String associatedFloatingIPID;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSSID")
   protected String associatedSSID;
   
   @JsonProperty(value = "associatedSendMulticastChannelMapID")
   protected String associatedSendMulticastChannelMapID;
   
   @JsonProperty(value = "associatedTrunkID")
   protected String associatedTrunkID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "domainID")
   protected String domainID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gatewayMACMoveRole")
   protected GatewayMACMoveRole gatewayMACMoveRole;
   
   @JsonProperty(value = "hasAttachedInterfaces")
   protected Boolean hasAttachedInterfaces;
   
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
   
   @JsonProperty(value = "segmentationID")
   protected Long segmentationID;
   
   @JsonProperty(value = "segmentationType")
   protected SegmentationType segmentationType;
   
   @JsonProperty(value = "subType")
   protected SubType subType;
   
   @JsonProperty(value = "systemType")
   protected SystemType systemType;
   
   @JsonProperty(value = "trunkRole")
   protected TrunkRole trunkRole;
   
   @JsonProperty(value = "type")
   protected Type type;
   
   @JsonProperty(value = "zoneID")
   protected String zoneID;
   

   
   @JsonIgnore
   private AggregateMetadatasFetcher aggregateMetadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private ApplicationperformancemanagementsFetcher applicationperformancemanagements;
   
   @JsonIgnore
   private BGPNeighborsFetcher bGPNeighbors;
   
   @JsonIgnore
   private BridgeInterfacesFetcher bridgeInterfaces;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private HostInterfacesFetcher hostInterfaces;
   
   @JsonIgnore
   private IngressACLEntryTemplatesFetcher ingressACLEntryTemplates;
   
   @JsonIgnore
   private IngressAdvFwdEntryTemplatesFetcher ingressAdvFwdEntryTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private PortMappingsFetcher portMappings;
   
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
   private TrunksFetcher trunks;
   
   @JsonIgnore
   private VirtualIPsFetcher virtualIPs;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private VNFInterfacesFetcher vNFInterfaces;
   
   @JsonIgnore
   private VPortMirrorsFetcher vPortMirrors;
   
   @JsonIgnore
   private VRSsFetcher vRSs;
   

   public VPort() {
      multicast = Multicast.INHERITED;
      type = Type.VM;
      addressSpoofing = AddressSpoofing.INHERITED;
      operationalState = OperationalState.INIT;
      
      aggregateMetadatas = new AggregateMetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      applicationperformancemanagements = new ApplicationperformancemanagementsFetcher(this);
      
      bGPNeighbors = new BGPNeighborsFetcher(this);
      
      bridgeInterfaces = new BridgeInterfacesFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      hostInterfaces = new HostInterfacesFetcher(this);
      
      ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
      
      ingressAdvFwdEntryTemplates = new IngressAdvFwdEntryTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      portMappings = new PortMappingsFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      trunks = new TrunksFetcher(this);
      
      virtualIPs = new VirtualIPsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vNFInterfaces = new VNFInterfacesFetcher(this);
      
      vPortMirrors = new VPortMirrorsFetcher(this);
      
      vRSs = new VRSsFetcher(this);
      
   }

   @JsonIgnore
   public DPI getDPI() {
      return DPI;
   }

   @JsonIgnore
   public void setDPI(DPI value) { 
      this.DPI = value;
   }
   @JsonIgnore
   public String getVLANID() {
      return VLANID;
   }

   @JsonIgnore
   public void setVLANID(String value) { 
      this.VLANID = value;
   }
   @JsonIgnore
   public Boolean getActive() {
      return active;
   }

   @JsonIgnore
   public void setActive(Boolean value) { 
      this.active = value;
   }
   @JsonIgnore
   public AddressSpoofing getAddressSpoofing() {
      return addressSpoofing;
   }

   @JsonIgnore
   public void setAddressSpoofing(AddressSpoofing value) { 
      this.addressSpoofing = value;
   }
   @JsonIgnore
   public String getAssociatedFloatingIPID() {
      return associatedFloatingIPID;
   }

   @JsonIgnore
   public void setAssociatedFloatingIPID(String value) { 
      this.associatedFloatingIPID = value;
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
   public String getAssociatedSSID() {
      return associatedSSID;
   }

   @JsonIgnore
   public void setAssociatedSSID(String value) { 
      this.associatedSSID = value;
   }
   @JsonIgnore
   public String getAssociatedSendMulticastChannelMapID() {
      return associatedSendMulticastChannelMapID;
   }

   @JsonIgnore
   public void setAssociatedSendMulticastChannelMapID(String value) { 
      this.associatedSendMulticastChannelMapID = value;
   }
   @JsonIgnore
   public String getAssociatedTrunkID() {
      return associatedTrunkID;
   }

   @JsonIgnore
   public void setAssociatedTrunkID(String value) { 
      this.associatedTrunkID = value;
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
   public String getDomainID() {
      return domainID;
   }

   @JsonIgnore
   public void setDomainID(String value) { 
      this.domainID = value;
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
   public GatewayMACMoveRole getGatewayMACMoveRole() {
      return gatewayMACMoveRole;
   }

   @JsonIgnore
   public void setGatewayMACMoveRole(GatewayMACMoveRole value) { 
      this.gatewayMACMoveRole = value;
   }
   @JsonIgnore
   public Boolean getHasAttachedInterfaces() {
      return hasAttachedInterfaces;
   }

   @JsonIgnore
   public void setHasAttachedInterfaces(Boolean value) { 
      this.hasAttachedInterfaces = value;
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
   public String getMultiNICVPortID() {
      return multiNICVPortID;
   }

   @JsonIgnore
   public void setMultiNICVPortID(String value) { 
      this.multiNICVPortID = value;
   }
   @JsonIgnore
   public Multicast getMulticast() {
      return multicast;
   }

   @JsonIgnore
   public void setMulticast(Multicast value) { 
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
   public OperationalState getOperationalState() {
      return operationalState;
   }

   @JsonIgnore
   public void setOperationalState(OperationalState value) { 
      this.operationalState = value;
   }
   @JsonIgnore
   public Long getSegmentationID() {
      return segmentationID;
   }

   @JsonIgnore
   public void setSegmentationID(Long value) { 
      this.segmentationID = value;
   }
   @JsonIgnore
   public SegmentationType getSegmentationType() {
      return segmentationType;
   }

   @JsonIgnore
   public void setSegmentationType(SegmentationType value) { 
      this.segmentationType = value;
   }
   @JsonIgnore
   public SubType getSubType() {
      return subType;
   }

   @JsonIgnore
   public void setSubType(SubType value) { 
      this.subType = value;
   }
   @JsonIgnore
   public SystemType getSystemType() {
      return systemType;
   }

   @JsonIgnore
   public void setSystemType(SystemType value) { 
      this.systemType = value;
   }
   @JsonIgnore
   public TrunkRole getTrunkRole() {
      return trunkRole;
   }

   @JsonIgnore
   public void setTrunkRole(TrunkRole value) { 
      this.trunkRole = value;
   }
   @JsonIgnore
   public Type getType() {
      return type;
   }

   @JsonIgnore
   public void setType(Type value) { 
      this.type = value;
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
   public AggregateMetadatasFetcher getAggregateMetadatas() {
      return aggregateMetadatas;
   }
   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public ApplicationperformancemanagementsFetcher getApplicationperformancemanagements() {
      return applicationperformancemanagements;
   }
   
   @JsonIgnore
   public BGPNeighborsFetcher getBGPNeighbors() {
      return bGPNeighbors;
   }
   
   @JsonIgnore
   public BridgeInterfacesFetcher getBridgeInterfaces() {
      return bridgeInterfaces;
   }
   
   @JsonIgnore
   public ContainersFetcher getContainers() {
      return containers;
   }
   
   @JsonIgnore
   public ContainerInterfacesFetcher getContainerInterfaces() {
      return containerInterfaces;
   }
   
   @JsonIgnore
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   @JsonIgnore
   public EgressACLEntryTemplatesFetcher getEgressACLEntryTemplates() {
      return egressACLEntryTemplates;
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
   public HostInterfacesFetcher getHostInterfaces() {
      return hostInterfaces;
   }
   
   @JsonIgnore
   public IngressACLEntryTemplatesFetcher getIngressACLEntryTemplates() {
      return ingressACLEntryTemplates;
   }
   
   @JsonIgnore
   public IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplates() {
      return ingressAdvFwdEntryTemplates;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   @JsonIgnore
   public PortMappingsFetcher getPortMappings() {
      return portMappings;
   }
   
   @JsonIgnore
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   @JsonIgnore
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   
   @JsonIgnore
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   @JsonIgnore
   public TrunksFetcher getTrunks() {
      return trunks;
   }
   
   @JsonIgnore
   public VirtualIPsFetcher getVirtualIPs() {
      return virtualIPs;
   }
   
   @JsonIgnore
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   @JsonIgnore
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
   }
   
   @JsonIgnore
   public VNFInterfacesFetcher getVNFInterfaces() {
      return vNFInterfaces;
   }
   
   @JsonIgnore
   public VPortMirrorsFetcher getVPortMirrors() {
      return vPortMirrors;
   }
   
   @JsonIgnore
   public VRSsFetcher getVRSs() {
      return vRSs;
   }
   

   public String toString() {
      return "VPort [" + "DPI=" + DPI + ", VLANID=" + VLANID + ", active=" + active + ", addressSpoofing=" + addressSpoofing + ", associatedFloatingIPID=" + associatedFloatingIPID + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSSID=" + associatedSSID + ", associatedSendMulticastChannelMapID=" + associatedSendMulticastChannelMapID + ", associatedTrunkID=" + associatedTrunkID + ", description=" + description + ", domainID=" + domainID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayMACMoveRole=" + gatewayMACMoveRole + ", hasAttachedInterfaces=" + hasAttachedInterfaces + ", lastUpdatedBy=" + lastUpdatedBy + ", multiNICVPortID=" + multiNICVPortID + ", multicast=" + multicast + ", name=" + name + ", operationalState=" + operationalState + ", segmentationID=" + segmentationID + ", segmentationType=" + segmentationType + ", subType=" + subType + ", systemType=" + systemType + ", trunkRole=" + trunkRole + ", type=" + type + ", zoneID=" + zoneID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}