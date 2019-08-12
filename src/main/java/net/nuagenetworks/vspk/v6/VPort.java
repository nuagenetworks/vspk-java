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


import net.nuagenetworks.vspk.v6.fetchers.AggregateMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.BGPNeighborsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.BridgeInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DeploymentFailuresFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DHCPv6OptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EgressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.HostInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressAdvFwdEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PortMappingsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.RedirectionTargetsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TestSuiteRunsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TrunksFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VirtualIPsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VNFInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VPortMirrorsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VRSsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vport", resourceName = "vports")
public class VPort extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EDPI { DISABLED, ENABLED, INHERITED };
   public enum EFIPIgnoreDefaultRoute { DISABLED, ENABLED, INHERITED };
   public enum EAddressSpoofing { DISABLED, ENABLED, INHERITED };
   public enum EAssociatedGatewayPersonality { DC7X50, EVDF, EVDFB, HARDWARE_VTEP, NETCONF_7X50, NETCONF_THIRDPARTY_HW_VTEP, NSG, NSGBR, NSGDUC, NUAGE_210_WBX_32_Q, NUAGE_210_WBX_48_S, OTHER, VDF, VDFG, VRSB, VRSG, VSA, VSG };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EGatewayMACMoveRole { SECONDARY, TERTIARY };
   public enum EMulticast { DISABLED, ENABLED, INHERITED };
   public enum EOperationalState { DOWN, INIT, UP };
   public enum EPeerOperationalState { DOWN, INIT, UP };
   public enum ESegmentationType { VLAN };
   public enum ESubType { NONE, VNF };
   public enum ESystemType { HARDWARE, HARDWARE_VTEP, NUAGE_1, NUAGE_2, NUAGE_VRSG, SOFTWARE };
   public enum ETrunkRole { PARENT_PORT, SUB_PORT };
   public enum EType { BRIDGE, CONTAINER, HOST, VM };

   
   @JsonProperty(value = "DPI")
   
   protected EDPI DPI;
   
   @JsonProperty(value = "FIPIgnoreDefaultRoute")
   
   protected EFIPIgnoreDefaultRoute FIPIgnoreDefaultRoute;
   
   @JsonProperty(value = "VLAN")
   
   protected Long VLAN;
   
   @JsonProperty(value = "VLANID")
   
   protected String VLANID;
   
   @JsonProperty(value = "accessRestrictionEnabled")
   
   protected Boolean accessRestrictionEnabled;
   
   @JsonProperty(value = "active")
   
   protected Boolean active;
   
   @JsonProperty(value = "addressSpoofing")
   
   protected EAddressSpoofing addressSpoofing;
   
   @JsonProperty(value = "assocEntityID")
   
   protected String assocEntityID;
   
   @JsonProperty(value = "associatedEgressProfileID")
   
   protected String associatedEgressProfileID;
   
   @JsonProperty(value = "associatedFloatingIPID")
   
   protected String associatedFloatingIPID;
   
   @JsonProperty(value = "associatedGatewayID")
   
   protected String associatedGatewayID;
   
   @JsonProperty(value = "associatedGatewayPersonality")
   
   protected EAssociatedGatewayPersonality associatedGatewayPersonality;
   
   @JsonProperty(value = "associatedGatewayType")
   
   protected String associatedGatewayType;
   
   @JsonProperty(value = "associatedIngressProfileID")
   
   protected String associatedIngressProfileID;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSSID")
   
   protected String associatedSSID;
   
   @JsonProperty(value = "associatedSendMulticastChannelMapID")
   
   protected String associatedSendMulticastChannelMapID;
   
   @JsonProperty(value = "associatedTrunkID")
   
   protected String associatedTrunkID;
   
   @JsonProperty(value = "backhaulSubnetVNID")
   
   protected Long backhaulSubnetVNID;
   
   @JsonProperty(value = "color")
   
   protected Long color;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "domainID")
   
   protected String domainID;
   
   @JsonProperty(value = "domainName")
   
   protected String domainName;
   
   @JsonProperty(value = "domainServiceLabel")
   
   protected String domainServiceLabel;
   
   @JsonProperty(value = "domainVLANID")
   
   protected Long domainVLANID;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gatewayMACMoveRole")
   
   protected EGatewayMACMoveRole gatewayMACMoveRole;
   
   @JsonProperty(value = "gatewayPortName")
   
   protected String gatewayPortName;
   
   @JsonProperty(value = "gwEligible")
   
   protected Boolean gwEligible;
   
   @JsonProperty(value = "hasAttachedInterfaces")
   
   protected Boolean hasAttachedInterfaces;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "multiNICVPortID")
   
   protected String multiNICVPortID;
   
   @JsonProperty(value = "multicast")
   
   protected EMulticast multicast;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "operationalState")
   
   protected EOperationalState operationalState;
   
   @JsonProperty(value = "peerOperationalState")
   
   protected EPeerOperationalState peerOperationalState;
   
   @JsonProperty(value = "segmentationID")
   
   protected Long segmentationID;
   
   @JsonProperty(value = "segmentationType")
   
   protected ESegmentationType segmentationType;
   
   @JsonProperty(value = "serviceID")
   
   protected Long serviceID;
   
   @JsonProperty(value = "subType")
   
   protected ESubType subType;
   
   @JsonProperty(value = "subnetVNID")
   
   protected Long subnetVNID;
   
   @JsonProperty(value = "systemType")
   
   protected ESystemType systemType;
   
   @JsonProperty(value = "trunkRole")
   
   protected ETrunkRole trunkRole;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   
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
   private ContainersFetcher containers;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private DeploymentFailuresFetcher deploymentFailures;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private DHCPv6OptionsFetcher dHCPv6Options;
   
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
   private TestSuiteRunsFetcher testSuiteRuns;
   
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
      multicast = EMulticast.INHERITED;
      type = EType.VM;
      addressSpoofing = EAddressSpoofing.INHERITED;
      operationalState = EOperationalState.INIT;
      
      aggregateMetadatas = new AggregateMetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      bGPNeighbors = new BGPNeighborsFetcher(this);
      
      bridgeInterfaces = new BridgeInterfacesFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      dHCPv6Options = new DHCPv6OptionsFetcher(this);
      
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
      
      testSuiteRuns = new TestSuiteRunsFetcher(this);
      
      trunks = new TrunksFetcher(this);
      
      virtualIPs = new VirtualIPsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vNFInterfaces = new VNFInterfacesFetcher(this);
      
      vPortMirrors = new VPortMirrorsFetcher(this);
      
      vRSs = new VRSsFetcher(this);
      
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
   public EFIPIgnoreDefaultRoute getFIPIgnoreDefaultRoute() {
      return FIPIgnoreDefaultRoute;
   }

   @JsonIgnore
   public void setFIPIgnoreDefaultRoute(EFIPIgnoreDefaultRoute value) { 
      this.FIPIgnoreDefaultRoute = value;
   }
   
   
   @JsonIgnore
   public Long getVLAN() {
      return VLAN;
   }

   @JsonIgnore
   public void setVLAN(Long value) { 
      this.VLAN = value;
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
   public Boolean getAccessRestrictionEnabled() {
      return accessRestrictionEnabled;
   }

   @JsonIgnore
   public void setAccessRestrictionEnabled(Boolean value) { 
      this.accessRestrictionEnabled = value;
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
   public EAddressSpoofing getAddressSpoofing() {
      return addressSpoofing;
   }

   @JsonIgnore
   public void setAddressSpoofing(EAddressSpoofing value) { 
      this.addressSpoofing = value;
   }
   
   
   @JsonIgnore
   public String getAssocEntityID() {
      return assocEntityID;
   }

   @JsonIgnore
   public void setAssocEntityID(String value) { 
      this.assocEntityID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEgressProfileID() {
      return associatedEgressProfileID;
   }

   @JsonIgnore
   public void setAssociatedEgressProfileID(String value) { 
      this.associatedEgressProfileID = value;
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
   public String getAssociatedGatewayID() {
      return associatedGatewayID;
   }

   @JsonIgnore
   public void setAssociatedGatewayID(String value) { 
      this.associatedGatewayID = value;
   }
   
   
   @JsonIgnore
   public EAssociatedGatewayPersonality getAssociatedGatewayPersonality() {
      return associatedGatewayPersonality;
   }

   @JsonIgnore
   public void setAssociatedGatewayPersonality(EAssociatedGatewayPersonality value) { 
      this.associatedGatewayPersonality = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGatewayType() {
      return associatedGatewayType;
   }

   @JsonIgnore
   public void setAssociatedGatewayType(String value) { 
      this.associatedGatewayType = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIngressProfileID() {
      return associatedIngressProfileID;
   }

   @JsonIgnore
   public void setAssociatedIngressProfileID(String value) { 
      this.associatedIngressProfileID = value;
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
   public Long getBackhaulSubnetVNID() {
      return backhaulSubnetVNID;
   }

   @JsonIgnore
   public void setBackhaulSubnetVNID(Long value) { 
      this.backhaulSubnetVNID = value;
   }
   
   
   @JsonIgnore
   public Long getColor() {
      return color;
   }

   @JsonIgnore
   public void setColor(Long value) { 
      this.color = value;
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
   public String getDomainName() {
      return domainName;
   }

   @JsonIgnore
   public void setDomainName(String value) { 
      this.domainName = value;
   }
   
   
   @JsonIgnore
   public String getDomainServiceLabel() {
      return domainServiceLabel;
   }

   @JsonIgnore
   public void setDomainServiceLabel(String value) { 
      this.domainServiceLabel = value;
   }
   
   
   @JsonIgnore
   public Long getDomainVLANID() {
      return domainVLANID;
   }

   @JsonIgnore
   public void setDomainVLANID(Long value) { 
      this.domainVLANID = value;
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
   public EGatewayMACMoveRole getGatewayMACMoveRole() {
      return gatewayMACMoveRole;
   }

   @JsonIgnore
   public void setGatewayMACMoveRole(EGatewayMACMoveRole value) { 
      this.gatewayMACMoveRole = value;
   }
   
   
   @JsonIgnore
   public String getGatewayPortName() {
      return gatewayPortName;
   }

   @JsonIgnore
   public void setGatewayPortName(String value) { 
      this.gatewayPortName = value;
   }
   
   
   @JsonIgnore
   public Boolean getGwEligible() {
      return gwEligible;
   }

   @JsonIgnore
   public void setGwEligible(Boolean value) { 
      this.gwEligible = value;
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
   public EOperationalState getOperationalState() {
      return operationalState;
   }

   @JsonIgnore
   public void setOperationalState(EOperationalState value) { 
      this.operationalState = value;
   }
   
   
   @JsonIgnore
   public EPeerOperationalState getPeerOperationalState() {
      return peerOperationalState;
   }

   @JsonIgnore
   public void setPeerOperationalState(EPeerOperationalState value) { 
      this.peerOperationalState = value;
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
   public ESegmentationType getSegmentationType() {
      return segmentationType;
   }

   @JsonIgnore
   public void setSegmentationType(ESegmentationType value) { 
      this.segmentationType = value;
   }
   
   
   @JsonIgnore
   public Long getServiceID() {
      return serviceID;
   }

   @JsonIgnore
   public void setServiceID(Long value) { 
      this.serviceID = value;
   }
   
   
   @JsonIgnore
   public ESubType getSubType() {
      return subType;
   }

   @JsonIgnore
   public void setSubType(ESubType value) { 
      this.subType = value;
   }
   
   
   @JsonIgnore
   public Long getSubnetVNID() {
      return subnetVNID;
   }

   @JsonIgnore
   public void setSubnetVNID(Long value) { 
      this.subnetVNID = value;
   }
   
   
   @JsonIgnore
   public ESystemType getSystemType() {
      return systemType;
   }

   @JsonIgnore
   public void setSystemType(ESystemType value) { 
      this.systemType = value;
   }
   
   
   @JsonIgnore
   public ETrunkRole getTrunkRole() {
      return trunkRole;
   }

   @JsonIgnore
   public void setTrunkRole(ETrunkRole value) { 
      this.trunkRole = value;
   }
   
   
   @JsonIgnore
   public EType getType() {
      return type;
   }

   @JsonIgnore
   public void setType(EType value) { 
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
   public DeploymentFailuresFetcher getDeploymentFailures() {
      return deploymentFailures;
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
   public TestSuiteRunsFetcher getTestSuiteRuns() {
      return testSuiteRuns;
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
      return "VPort [" + "DPI=" + DPI + ", FIPIgnoreDefaultRoute=" + FIPIgnoreDefaultRoute + ", VLAN=" + VLAN + ", VLANID=" + VLANID + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", active=" + active + ", addressSpoofing=" + addressSpoofing + ", assocEntityID=" + assocEntityID + ", associatedEgressProfileID=" + associatedEgressProfileID + ", associatedFloatingIPID=" + associatedFloatingIPID + ", associatedGatewayID=" + associatedGatewayID + ", associatedGatewayPersonality=" + associatedGatewayPersonality + ", associatedGatewayType=" + associatedGatewayType + ", associatedIngressProfileID=" + associatedIngressProfileID + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSSID=" + associatedSSID + ", associatedSendMulticastChannelMapID=" + associatedSendMulticastChannelMapID + ", associatedTrunkID=" + associatedTrunkID + ", backhaulSubnetVNID=" + backhaulSubnetVNID + ", color=" + color + ", description=" + description + ", domainID=" + domainID + ", domainName=" + domainName + ", domainServiceLabel=" + domainServiceLabel + ", domainVLANID=" + domainVLANID + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayMACMoveRole=" + gatewayMACMoveRole + ", gatewayPortName=" + gatewayPortName + ", gwEligible=" + gwEligible + ", hasAttachedInterfaces=" + hasAttachedInterfaces + ", lastUpdatedBy=" + lastUpdatedBy + ", multiNICVPortID=" + multiNICVPortID + ", multicast=" + multicast + ", name=" + name + ", operationalState=" + operationalState + ", peerOperationalState=" + peerOperationalState + ", segmentationID=" + segmentationID + ", segmentationType=" + segmentationType + ", serviceID=" + serviceID + ", subType=" + subType + ", subnetVNID=" + subnetVNID + ", systemType=" + systemType + ", trunkRole=" + trunkRole + ", type=" + type + ", zoneID=" + zoneID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}