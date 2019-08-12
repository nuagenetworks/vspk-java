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
import net.nuagenetworks.vspk.v6.fetchers.BGPNeighborsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainerResyncsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DefaultGatewaysFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DeploymentFailuresFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DHCPv6OptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IKEGatewayConnectionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IPReservationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PATIPEntriesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ProxyARPFiltersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMResyncsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VirtualIPsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "subnet", resourceName = "subnets")
public class Subnet extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EDHCPRelayStatus { DISABLED, ENABLED };
   public enum EDPI { DISABLED, ENABLED, INHERITED };
   public enum EIPType { DUALSTACK, IPV4, IPV6 };
   public enum EPATEnabled { DISABLED, ENABLED, INHERITED };
   public enum EEncryption { DISABLED, ENABLED, INHERITED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EEntityState { MARKED_FOR_DELETION, UNDER_CONSTRUCTION };
   public enum EMaintenanceMode { DISABLED, ENABLED, ENABLED_INHERITED };
   public enum EMulticast { DISABLED, ENABLED, INHERITED };
   public enum EResourceType { FLOATING, NSG_VNF, PUBLIC, STANDARD };
   public enum EUnderlayEnabled { DISABLED, ENABLED, INHERITED };
   public enum EUseGlobalMAC { DISABLED, ENABLED, ENTERPRISE_DEFAULT };

   
   @JsonProperty(value = "DHCPRelayStatus")
   
   protected EDHCPRelayStatus DHCPRelayStatus;
   
   @JsonProperty(value = "DPI")
   
   protected EDPI DPI;
   
   @JsonProperty(value = "EVPNEnabled")
   
   protected Boolean EVPNEnabled;
   
   @JsonProperty(value = "IPType")
   
   protected EIPType IPType;
   
   @JsonProperty(value = "IPv6Address")
   
   protected String IPv6Address;
   
   @JsonProperty(value = "IPv6Gateway")
   
   protected String IPv6Gateway;
   
   @JsonProperty(value = "PATEnabled")
   
   protected EPATEnabled PATEnabled;
   
   @JsonProperty(value = "accessRestrictionEnabled")
   
   protected Boolean accessRestrictionEnabled;
   
   @JsonProperty(value = "address")
   
   protected String address;
   
   @JsonProperty(value = "advertise")
   
   protected Boolean advertise;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSharedNetworkResourceID")
   
   protected String associatedSharedNetworkResourceID;
   
   @JsonProperty(value = "color")
   
   protected Long color;
   
   @JsonProperty(value = "customerID")
   
   protected Long customerID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "domainServiceLabel")
   
   protected String domainServiceLabel;
   
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
   
   @JsonProperty(value = "gateway")
   
   protected String gateway;
   
   @JsonProperty(value = "gatewayMACAddress")
   
   protected String gatewayMACAddress;
   
   @JsonProperty(value = "ingressReplicationEnabled")
   
   protected Boolean ingressReplicationEnabled;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "linkLocalAddress")
   
   protected String linkLocalAddress;
   
   @JsonProperty(value = "maintenanceMode")
   
   protected EMaintenanceMode maintenanceMode;
   
   @JsonProperty(value = "multiHomeEnabled")
   
   protected Boolean multiHomeEnabled;
   
   @JsonProperty(value = "multicast")
   
   protected EMulticast multicast;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "netmask")
   
   protected String netmask;
   
   @JsonProperty(value = "policyGroupID")
   
   protected Long policyGroupID;
   
   @JsonProperty(value = "proxyARP")
   
   protected Boolean proxyARP;
   
   @JsonProperty(value = "public")
   
   protected Boolean public_;
   
   @JsonProperty(value = "resourceType")
   
   protected EResourceType resourceType;
   
   @JsonProperty(value = "routeDistinguisher")
   
   protected String routeDistinguisher;
   
   @JsonProperty(value = "routeTarget")
   
   protected String routeTarget;
   
   @JsonProperty(value = "serviceID")
   
   protected Long serviceID;
   
   @JsonProperty(value = "splitSubnet")
   
   protected Boolean splitSubnet;
   
   @JsonProperty(value = "subnetVLANID")
   
   protected Long subnetVLANID;
   
   @JsonProperty(value = "templateID")
   
   protected String templateID;
   
   @JsonProperty(value = "underlay")
   
   protected Boolean underlay;
   
   @JsonProperty(value = "underlayEnabled")
   
   protected EUnderlayEnabled underlayEnabled;
   
   @JsonProperty(value = "useGlobalMAC")
   
   protected EUseGlobalMAC useGlobalMAC;
   
   @JsonProperty(value = "vnId")
   
   protected Long vnId;
   
   @JsonProperty(value = "vrrpIPv6BackupAddress")
   
   protected String vrrpIPv6BackupAddress;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private BGPNeighborsFetcher bGPNeighbors;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private ContainerResyncsFetcher containerResyncs;
   
   @JsonIgnore
   private DefaultGatewaysFetcher defaultGateways;
   
   @JsonIgnore
   private DeploymentFailuresFetcher deploymentFailures;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private DHCPv6OptionsFetcher dHCPv6Options;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private IKEGatewayConnectionsFetcher iKEGatewayConnections;
   
   @JsonIgnore
   private IPReservationsFetcher iPReservations;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PATIPEntriesFetcher pATIPEntries;
   
   @JsonIgnore
   private ProxyARPFiltersFetcher proxyARPFilters;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private VMResyncsFetcher vMResyncs;
   
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
   private VPortsFetcher vPorts;
   

   public Subnet() {
      PATEnabled = EPATEnabled.INHERITED;
      multicast = EMulticast.INHERITED;
      IPType = EIPType.IPV4;
      maintenanceMode = EMaintenanceMode.DISABLED;
      
      addressRanges = new AddressRangesFetcher(this);
      
      bGPNeighbors = new BGPNeighborsFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      containerResyncs = new ContainerResyncsFetcher(this);
      
      defaultGateways = new DefaultGatewaysFetcher(this);
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      dHCPv6Options = new DHCPv6OptionsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
      
      iPReservations = new IPReservationsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      pATIPEntries = new PATIPEntriesFetcher(this);
      
      proxyARPFilters = new ProxyARPFiltersFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      vMResyncs = new VMResyncsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      virtualIPs = new VirtualIPsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EDHCPRelayStatus getDHCPRelayStatus() {
      return DHCPRelayStatus;
   }

   @JsonIgnore
   public void setDHCPRelayStatus(EDHCPRelayStatus value) { 
      this.DHCPRelayStatus = value;
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
   public Boolean getEVPNEnabled() {
      return EVPNEnabled;
   }

   @JsonIgnore
   public void setEVPNEnabled(Boolean value) { 
      this.EVPNEnabled = value;
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
   public EPATEnabled getPATEnabled() {
      return PATEnabled;
   }

   @JsonIgnore
   public void setPATEnabled(EPATEnabled value) { 
      this.PATEnabled = value;
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
   public String getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(String value) { 
      this.address = value;
   }
   
   
   @JsonIgnore
   public Boolean getAdvertise() {
      return advertise;
   }

   @JsonIgnore
   public void setAdvertise(Boolean value) { 
      this.advertise = value;
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
   public String getDomainServiceLabel() {
      return domainServiceLabel;
   }

   @JsonIgnore
   public void setDomainServiceLabel(String value) { 
      this.domainServiceLabel = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   
   @JsonIgnore
   public String getLinkLocalAddress() {
      return linkLocalAddress;
   }

   @JsonIgnore
   public void setLinkLocalAddress(String value) { 
      this.linkLocalAddress = value;
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
   public Boolean getMultiHomeEnabled() {
      return multiHomeEnabled;
   }

   @JsonIgnore
   public void setMultiHomeEnabled(Boolean value) { 
      this.multiHomeEnabled = value;
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
   public Long getPolicyGroupID() {
      return policyGroupID;
   }

   @JsonIgnore
   public void setPolicyGroupID(Long value) { 
      this.policyGroupID = value;
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
   public Boolean getPublic_() {
      return public_;
   }

   @JsonIgnore
   public void setPublic_(Boolean value) { 
      this.public_ = value;
   }
   
   
   @JsonIgnore
   public EResourceType getResourceType() {
      return resourceType;
   }

   @JsonIgnore
   public void setResourceType(EResourceType value) { 
      this.resourceType = value;
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
   public Long getServiceID() {
      return serviceID;
   }

   @JsonIgnore
   public void setServiceID(Long value) { 
      this.serviceID = value;
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
   public Long getSubnetVLANID() {
      return subnetVLANID;
   }

   @JsonIgnore
   public void setSubnetVLANID(Long value) { 
      this.subnetVLANID = value;
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
   public Boolean getUnderlay() {
      return underlay;
   }

   @JsonIgnore
   public void setUnderlay(Boolean value) { 
      this.underlay = value;
   }
   
   
   @JsonIgnore
   public EUnderlayEnabled getUnderlayEnabled() {
      return underlayEnabled;
   }

   @JsonIgnore
   public void setUnderlayEnabled(EUnderlayEnabled value) { 
      this.underlayEnabled = value;
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
   public String getVrrpIPv6BackupAddress() {
      return vrrpIPv6BackupAddress;
   }

   @JsonIgnore
   public void setVrrpIPv6BackupAddress(String value) { 
      this.vrrpIPv6BackupAddress = value;
   }
   

   
   @JsonIgnore
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   @JsonIgnore
   public BGPNeighborsFetcher getBGPNeighbors() {
      return bGPNeighbors;
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
   public ContainerResyncsFetcher getContainerResyncs() {
      return containerResyncs;
   }
   
   @JsonIgnore
   public DefaultGatewaysFetcher getDefaultGateways() {
      return defaultGateways;
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
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
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
   public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
      return iKEGatewayConnections;
   }
   
   @JsonIgnore
   public IPReservationsFetcher getIPReservations() {
      return iPReservations;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PATIPEntriesFetcher getPATIPEntries() {
      return pATIPEntries;
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
   public VMResyncsFetcher getVMResyncs() {
      return vMResyncs;
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
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "Subnet [" + "DHCPRelayStatus=" + DHCPRelayStatus + ", DPI=" + DPI + ", EVPNEnabled=" + EVPNEnabled + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", IPv6Gateway=" + IPv6Gateway + ", PATEnabled=" + PATEnabled + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", address=" + address + ", advertise=" + advertise + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSharedNetworkResourceID=" + associatedSharedNetworkResourceID + ", color=" + color + ", customerID=" + customerID + ", description=" + description + ", domainServiceLabel=" + domainServiceLabel + ", dualStackDynamicIPAllocation=" + dualStackDynamicIPAllocation + ", embeddedMetadata=" + embeddedMetadata + ", enableDHCPv4=" + enableDHCPv4 + ", enableDHCPv6=" + enableDHCPv6 + ", encryption=" + encryption + ", entityScope=" + entityScope + ", entityState=" + entityState + ", externalID=" + externalID + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", ingressReplicationEnabled=" + ingressReplicationEnabled + ", lastUpdatedBy=" + lastUpdatedBy + ", linkLocalAddress=" + linkLocalAddress + ", maintenanceMode=" + maintenanceMode + ", multiHomeEnabled=" + multiHomeEnabled + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyGroupID=" + policyGroupID + ", proxyARP=" + proxyARP + ", public_=" + public_ + ", resourceType=" + resourceType + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", serviceID=" + serviceID + ", splitSubnet=" + splitSubnet + ", subnetVLANID=" + subnetVLANID + ", templateID=" + templateID + ", underlay=" + underlay + ", underlayEnabled=" + underlayEnabled + ", useGlobalMAC=" + useGlobalMAC + ", vnId=" + vnId + ", vrrpIPv6BackupAddress=" + vrrpIPv6BackupAddress + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}