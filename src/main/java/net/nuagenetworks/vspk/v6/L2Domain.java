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
import net.nuagenetworks.vspk.v6.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ApplicationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ApplicationperformancemanagementbindingsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.BridgeInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DeploymentFailuresFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DHCPv6OptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EgressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EgressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EgressAdvFwdTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GatewaysFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.HostInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressAdvFwdTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MirrorDestinationGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NetworkPerformanceBindingsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGatewaySummariesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.OverlayMirrorDestinationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PGExpressionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ProxyARPFiltersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.RedirectionTargetsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.RedundancyGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StaticRoutesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.UplinkRDsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VirtualFirewallPoliciesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VirtualFirewallRulesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VPNConnectionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "l2domain", resourceName = "l2domains")
public class L2Domain extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EDPI { DISABLED, ENABLED };
   public enum EIPType { DUALSTACK, IPV4, IPV6 };
   public enum EEncryption { DISABLED, ENABLED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EEntityState { MARKED_FOR_DELETION, UNDER_CONSTRUCTION };
   public enum EFlowCollectionEnabled { DISABLED, ENABLED, INHERITED };
   public enum EL2EncapType { MPLSoUDP, VXLAN };
   public enum EMaintenanceMode { DISABLED, ENABLED, ENABLED_INHERITED };
   public enum EMulticast { DISABLED, ENABLED, INHERITED };
   public enum EPolicyChangeStatus { APPLIED, DISCARDED, STARTED };
   public enum EUplinkPreference { PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY, SYMMETRIC };
   public enum EUseGlobalMAC { DISABLED, ENABLED };

   
   @JsonProperty(value = "DHCPManaged")
   
   protected Boolean DHCPManaged;
   
   @JsonProperty(value = "DPI")
   
   protected EDPI DPI;
   
   @JsonProperty(value = "IPType")
   
   protected EIPType IPType;
   
   @JsonProperty(value = "IPv6Address")
   
   protected String IPv6Address;
   
   @JsonProperty(value = "IPv6Gateway")
   
   protected String IPv6Gateway;
   
   @JsonProperty(value = "VXLANECMPEnabled")
   
   protected Boolean VXLANECMPEnabled;
   
   @JsonProperty(value = "address")
   
   protected String address;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSharedNetworkResourceID")
   
   protected String associatedSharedNetworkResourceID;
   
   @JsonProperty(value = "associatedUnderlayID")
   
   protected String associatedUnderlayID;
   
   @JsonProperty(value = "color")
   
   protected Long color;
   
   @JsonProperty(value = "customerID")
   
   protected Long customerID;
   
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
   
   @JsonProperty(value = "entityState")
   
   protected EEntityState entityState;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "flowCollectionEnabled")
   
   protected EFlowCollectionEnabled flowCollectionEnabled;
   
   @JsonProperty(value = "gateway")
   
   protected String gateway;
   
   @JsonProperty(value = "gatewayMACAddress")
   
   protected String gatewayMACAddress;
   
   @JsonProperty(value = "ingressReplicationEnabled")
   
   protected Boolean ingressReplicationEnabled;
   
   @JsonProperty(value = "l2EncapType")
   
   protected EL2EncapType l2EncapType;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "maintenanceMode")
   
   protected EMaintenanceMode maintenanceMode;
   
   @JsonProperty(value = "multicast")
   
   protected EMulticast multicast;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "netmask")
   
   protected String netmask;
   
   @JsonProperty(value = "policyChangeStatus")
   
   protected EPolicyChangeStatus policyChangeStatus;
   
   @JsonProperty(value = "routeDistinguisher")
   
   protected String routeDistinguisher;
   
   @JsonProperty(value = "routeTarget")
   
   protected String routeTarget;
   
   @JsonProperty(value = "routedVPLSEnabled")
   
   protected Boolean routedVPLSEnabled;
   
   @JsonProperty(value = "serviceID")
   
   protected Long serviceID;
   
   @JsonProperty(value = "stretched")
   
   protected Boolean stretched;
   
   @JsonProperty(value = "templateID")
   
   protected String templateID;
   
   @JsonProperty(value = "uplinkPreference")
   
   protected EUplinkPreference uplinkPreference;
   
   @JsonProperty(value = "useGlobalMAC")
   
   protected EUseGlobalMAC useGlobalMAC;
   
   @JsonProperty(value = "vnId")
   
   protected Long vnId;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private ApplicationsFetcher applications;
   
   @JsonIgnore
   private ApplicationperformancemanagementbindingsFetcher applicationperformancemanagementbindings;
   
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
   private EgressACLTemplatesFetcher egressACLTemplates;
   
   @JsonIgnore
   private EgressAdvFwdTemplatesFetcher egressAdvFwdTemplates;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GatewaysFetcher gateways;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private HostInterfacesFetcher hostInterfaces;
   
   @JsonIgnore
   private IngressACLEntryTemplatesFetcher ingressACLEntryTemplates;
   
   @JsonIgnore
   private IngressACLTemplatesFetcher ingressACLTemplates;
   
   @JsonIgnore
   private IngressAdvFwdTemplatesFetcher ingressAdvFwdTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MirrorDestinationGroupsFetcher mirrorDestinationGroups;
   
   @JsonIgnore
   private NetworkPerformanceBindingsFetcher networkPerformanceBindings;
   
   @JsonIgnore
   private NSGatewaySummariesFetcher nSGatewaySummaries;
   
   @JsonIgnore
   private OverlayMirrorDestinationsFetcher overlayMirrorDestinations;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private PGExpressionsFetcher pGExpressions;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private ProxyARPFiltersFetcher proxyARPFilters;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private RedundancyGroupsFetcher redundancyGroups;
   
   @JsonIgnore
   private StaticRoutesFetcher staticRoutes;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private UplinkRDsFetcher uplinkRDs;
   
   @JsonIgnore
   private VirtualFirewallPoliciesFetcher virtualFirewallPolicies;
   
   @JsonIgnore
   private VirtualFirewallRulesFetcher virtualFirewallRules;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private VPNConnectionsFetcher vPNConnections;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   

   public L2Domain() {
      maintenanceMode = EMaintenanceMode.DISABLED;
      
      addressRanges = new AddressRangesFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      applications = new ApplicationsFetcher(this);
      
      applicationperformancemanagementbindings = new ApplicationperformancemanagementbindingsFetcher(this);
      
      bridgeInterfaces = new BridgeInterfacesFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      dHCPv6Options = new DHCPv6OptionsFetcher(this);
      
      egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      egressAdvFwdTemplates = new EgressAdvFwdTemplatesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      gateways = new GatewaysFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      hostInterfaces = new HostInterfacesFetcher(this);
      
      ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
      
      ingressACLTemplates = new IngressACLTemplatesFetcher(this);
      
      ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      mirrorDestinationGroups = new MirrorDestinationGroupsFetcher(this);
      
      networkPerformanceBindings = new NetworkPerformanceBindingsFetcher(this);
      
      nSGatewaySummaries = new NSGatewaySummariesFetcher(this);
      
      overlayMirrorDestinations = new OverlayMirrorDestinationsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      pGExpressions = new PGExpressionsFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      proxyARPFilters = new ProxyARPFiltersFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      redundancyGroups = new RedundancyGroupsFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      uplinkRDs = new UplinkRDsFetcher(this);
      
      virtualFirewallPolicies = new VirtualFirewallPoliciesFetcher(this);
      
      virtualFirewallRules = new VirtualFirewallRulesFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vPNConnections = new VPNConnectionsFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getDHCPManaged() {
      return DHCPManaged;
   }

   @JsonIgnore
   public void setDHCPManaged(Boolean value) { 
      this.DHCPManaged = value;
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
   public Boolean getVXLANECMPEnabled() {
      return VXLANECMPEnabled;
   }

   @JsonIgnore
   public void setVXLANECMPEnabled(Boolean value) { 
      this.VXLANECMPEnabled = value;
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
   public String getAssociatedSharedNetworkResourceID() {
      return associatedSharedNetworkResourceID;
   }

   @JsonIgnore
   public void setAssociatedSharedNetworkResourceID(String value) { 
      this.associatedSharedNetworkResourceID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedUnderlayID() {
      return associatedUnderlayID;
   }

   @JsonIgnore
   public void setAssociatedUnderlayID(String value) { 
      this.associatedUnderlayID = value;
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
   public Long getCustomerID() {
      return customerID;
   }

   @JsonIgnore
   public void setCustomerID(Long value) { 
      this.customerID = value;
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
   public EEntityState getEntityState() {
      return entityState;
   }

   @JsonIgnore
   public void setEntityState(EEntityState value) { 
      this.entityState = value;
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
   public EFlowCollectionEnabled getFlowCollectionEnabled() {
      return flowCollectionEnabled;
   }

   @JsonIgnore
   public void setFlowCollectionEnabled(EFlowCollectionEnabled value) { 
      this.flowCollectionEnabled = value;
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
   public String getGatewayMACAddress() {
      return gatewayMACAddress;
   }

   @JsonIgnore
   public void setGatewayMACAddress(String value) { 
      this.gatewayMACAddress = value;
   }
   
   
   @JsonIgnore
   public Boolean getIngressReplicationEnabled() {
      return ingressReplicationEnabled;
   }

   @JsonIgnore
   public void setIngressReplicationEnabled(Boolean value) { 
      this.ingressReplicationEnabled = value;
   }
   
   
   @JsonIgnore
   public EL2EncapType getL2EncapType() {
      return l2EncapType;
   }

   @JsonIgnore
   public void setL2EncapType(EL2EncapType value) { 
      this.l2EncapType = value;
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
   public EMaintenanceMode getMaintenanceMode() {
      return maintenanceMode;
   }

   @JsonIgnore
   public void setMaintenanceMode(EMaintenanceMode value) { 
      this.maintenanceMode = value;
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
   public EPolicyChangeStatus getPolicyChangeStatus() {
      return policyChangeStatus;
   }

   @JsonIgnore
   public void setPolicyChangeStatus(EPolicyChangeStatus value) { 
      this.policyChangeStatus = value;
   }
   
   
   @JsonIgnore
   public String getRouteDistinguisher() {
      return routeDistinguisher;
   }

   @JsonIgnore
   public void setRouteDistinguisher(String value) { 
      this.routeDistinguisher = value;
   }
   
   
   @JsonIgnore
   public String getRouteTarget() {
      return routeTarget;
   }

   @JsonIgnore
   public void setRouteTarget(String value) { 
      this.routeTarget = value;
   }
   
   
   @JsonIgnore
   public Boolean getRoutedVPLSEnabled() {
      return routedVPLSEnabled;
   }

   @JsonIgnore
   public void setRoutedVPLSEnabled(Boolean value) { 
      this.routedVPLSEnabled = value;
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
   public Boolean getStretched() {
      return stretched;
   }

   @JsonIgnore
   public void setStretched(Boolean value) { 
      this.stretched = value;
   }
   
   
   @JsonIgnore
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   
   
   @JsonIgnore
   public EUplinkPreference getUplinkPreference() {
      return uplinkPreference;
   }

   @JsonIgnore
   public void setUplinkPreference(EUplinkPreference value) { 
      this.uplinkPreference = value;
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
   public Long getVnId() {
      return vnId;
   }

   @JsonIgnore
   public void setVnId(Long value) { 
      this.vnId = value;
   }
   

   
   @JsonIgnore
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public ApplicationsFetcher getApplications() {
      return applications;
   }
   
   @JsonIgnore
   public ApplicationperformancemanagementbindingsFetcher getApplicationperformancemanagementbindings() {
      return applicationperformancemanagementbindings;
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
   public EgressACLTemplatesFetcher getEgressACLTemplates() {
      return egressACLTemplates;
   }
   
   @JsonIgnore
   public EgressAdvFwdTemplatesFetcher getEgressAdvFwdTemplates() {
      return egressAdvFwdTemplates;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public GatewaysFetcher getGateways() {
      return gateways;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public GroupsFetcher getGroups() {
      return groups;
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
   public IngressACLTemplatesFetcher getIngressACLTemplates() {
      return ingressACLTemplates;
   }
   
   @JsonIgnore
   public IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplates() {
      return ingressAdvFwdTemplates;
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
   public MirrorDestinationGroupsFetcher getMirrorDestinationGroups() {
      return mirrorDestinationGroups;
   }
   
   @JsonIgnore
   public NetworkPerformanceBindingsFetcher getNetworkPerformanceBindings() {
      return networkPerformanceBindings;
   }
   
   @JsonIgnore
   public NSGatewaySummariesFetcher getNSGatewaySummaries() {
      return nSGatewaySummaries;
   }
   
   @JsonIgnore
   public OverlayMirrorDestinationsFetcher getOverlayMirrorDestinations() {
      return overlayMirrorDestinations;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public PGExpressionsFetcher getPGExpressions() {
      return pGExpressions;
   }
   
   @JsonIgnore
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   @JsonIgnore
   public ProxyARPFiltersFetcher getProxyARPFilters() {
      return proxyARPFilters;
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
   public RedundancyGroupsFetcher getRedundancyGroups() {
      return redundancyGroups;
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
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   
   @JsonIgnore
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   @JsonIgnore
   public UplinkRDsFetcher getUplinkRDs() {
      return uplinkRDs;
   }
   
   @JsonIgnore
   public VirtualFirewallPoliciesFetcher getVirtualFirewallPolicies() {
      return virtualFirewallPolicies;
   }
   
   @JsonIgnore
   public VirtualFirewallRulesFetcher getVirtualFirewallRules() {
      return virtualFirewallRules;
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
   public VPNConnectionsFetcher getVPNConnections() {
      return vPNConnections;
   }
   
   @JsonIgnore
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "L2Domain [" + "DHCPManaged=" + DHCPManaged + ", DPI=" + DPI + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", IPv6Gateway=" + IPv6Gateway + ", VXLANECMPEnabled=" + VXLANECMPEnabled + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSharedNetworkResourceID=" + associatedSharedNetworkResourceID + ", associatedUnderlayID=" + associatedUnderlayID + ", color=" + color + ", customerID=" + customerID + ", description=" + description + ", dualStackDynamicIPAllocation=" + dualStackDynamicIPAllocation + ", embeddedMetadata=" + embeddedMetadata + ", enableDHCPv4=" + enableDHCPv4 + ", enableDHCPv6=" + enableDHCPv6 + ", encryption=" + encryption + ", entityScope=" + entityScope + ", entityState=" + entityState + ", externalID=" + externalID + ", flowCollectionEnabled=" + flowCollectionEnabled + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", ingressReplicationEnabled=" + ingressReplicationEnabled + ", l2EncapType=" + l2EncapType + ", lastUpdatedBy=" + lastUpdatedBy + ", maintenanceMode=" + maintenanceMode + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyChangeStatus=" + policyChangeStatus + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", routedVPLSEnabled=" + routedVPLSEnabled + ", serviceID=" + serviceID + ", stretched=" + stretched + ", templateID=" + templateID + ", uplinkPreference=" + uplinkPreference + ", useGlobalMAC=" + useGlobalMAC + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}