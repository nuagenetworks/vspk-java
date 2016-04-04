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

import vspk.v4_0.fetchers.AddressRangesFetcher;
import vspk.v4_0.fetchers.DHCPOptionsFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.IKEGatewayConnectionsFetcher;
import vspk.v4_0.fetchers.IPReservationsFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.QOSsFetcher;
import vspk.v4_0.fetchers.VMResyncsFetcher;
import vspk.v4_0.fetchers.StatisticsFetcher;
import vspk.v4_0.fetchers.StatisticsPoliciesFetcher;
import vspk.v4_0.fetchers.TCAsFetcher;
import vspk.v4_0.fetchers.VirtualIPsFetcher;
import vspk.v4_0.fetchers.VMsFetcher;
import vspk.v4_0.fetchers.VMInterfacesFetcher;
import vspk.v4_0.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subnet extends RestObject {

   public final static String REST_NAME = "subnet";
   public final static String RESOURCE_NAME = "subnets";

   
   public enum IPType { IPV4, IPV6 };
   public enum PATEnabled { DISABLED, ENABLED, INHERITED };
   public enum AssociatedApplicationObjectType { ACLENTRY_LOCATION, ADDRESS_RANGE, ADDRESS_RANGE_STATE, ALARM, APPD_APPLICATION, APPD_EXTERNAL_APP_SERVICE, APPD_FLOW, APPD_FLOW_FORWARDING_POLICY, APPD_FLOW_SECURITY_POLICY, APPD_SERVICE, APPD_TIER, APPLICATION, AUTO_DISC_GATEWAY, BACK_HAUL_SERVICE_RESP, BGPPEER, BGP_DAMPENING_MED_RESPONSE, BGP_NEIGHBOR, BGP_NEIGHBOR_MED_RESPONSE, BGP_PROFILE, BGP_PROFILE_MED_RESPONSE, BOOTSTRAP, BOOTSTRAP_ACTIVATION, BRIDGEINTERFACE, CERTIFICATE, CHILD_ENTITY_POLICY_CHANGE, CLOUD_MGMT_SYSTEM, CUSTOMER_VRF_SEQUENCENO, DC_CONFIG, DHCP_ALLOC_MESSAGE, DHCP_CONFIG_RESP, DHCP_OPTION, DISKSTATS, DOMAIN, DOMAIN_CONFIG, DOMAIN_CONFIG_RESP, DOMAIN_FLOATING_IP_ACL_TEMPLATE, DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY, DOMAIN_TEMPLATE, DSCP_FORWARDING_CLASS_MAPPING, DSCP_FORWARDING_CLASS_TABLE, EGRESS_ACL, EGRESS_ACL_ENTRY, EGRESS_ACL_TEMPLATE, EGRESS_ACL_TEMPLATE_ENTRY, EGRESS_QOS_MR, EGRESS_QOS_PRIMITIVE, EGRESS_QOS_QUEUE_MR, ENDPOINT, ENTERPRISE, ENTERPRISE_CONFIG, ENTERPRISE_CONFIG_RESP, ENTERPRISE_NETWORK, ENTERPRISE_PERMISSION, ENTERPRISE_PROFILE, ENTERPRISE_SECURED_DATA, ENTERPRISE_SECURITY, ENTITY_METADATA_BINDING, ESI_SEQUENCENO, EVENT_LOG, EVPN_BGP_COMMUNITY_TAG_ENTRY, EVPN_BGP_COMMUNITY_TAG_SEQ_NO, EXPORTIMPORT, EXTERNAL_SERVICE, FLOATINGIP, FLOATINGIP_ACL, FLOATINGIP_ACL_ENTRY, FLOATING_IP_ACL_TEMPLATE, FLOATING_IP_ACL_TEMPLATE_ENTRY, GATEWAY, GATEWAY_CONFIG, GATEWAY_CONFIG_RESP, GATEWAY_SECURED_DATA, GATEWAY_SECURITY, GATEWAY_SECURITY_PROFILE_REQUEST, GATEWAY_SECURITY_PROFILE_RESPONSE, GATEWAY_SECURITY_REQUEST, GATEWAY_SECURITY_RESPONSE, GATEWAY_SERVICE_CONFIG, GATEWAY_SERVICE_CONFIG_RESP, GATEWAY_TEMPLATE, GATEWAY_VPORT_CONFIG, GATEWAY_VPORT_CONFIG_RESP, GEO_VM_EVENT, GEO_VM_REQ, GEO_VM_RES, GROUP, GROUPKEY_ENCRYPTION_PROFILE, HEALTH_REQ, HOSTINTERFACE, HSC, IKE_ENCRYPTION_PROFILE, IKE_GATEWAY, IKE_GATEWAY_CONFIG, IKE_GATEWAY_PROFILE, IKE_GATEWAY_CONNECTION, IKE_CERTIFICATE, IKE_PSK, IKE_SUBNET, INFRASTRUCTURE_CONFIG, INFRASTRUCTURE_GATEWAY_PROFILE, INFRASTRUCTURE_PORT_PROFILE, INFRASTRUCTURE_VSC_PROFILE, INGRESS_ACL, INGRESS_ACL_ENTRY, INGRESS_ACL_TEMPLATE, INGRESS_ACL_TEMPLATE_ENTRY, INGRESS_ADV_FWD, INGRESS_ADV_FWD_ENTRY, INGRESS_ADV_FWD_TEMPLATE, INGRESS_ADV_FWD_TEMPLATE_ENTRY, INGRESS_EXT_SERVICE, INGRESS_EXT_SERVICE_ENTRY, INGRESS_EXT_SERVICE_TEMPLATE, INGRESS_EXT_SERVICE_TEMPLATE_ENTRY, IP_BINDING, JOB, KEYSERVER_MEMBER, KEYSERVER_MONITOR, KEYSERVER_MONITOR_ENCRYPTED_SEED, KEYSERVER_MONITOR_SEED, KEYSERVER_MONITOR_SEK, KEYSERVER_NOTIFICATION, L2DOMAIN, L2DOMAIN_SHARED, L2DOMAIN_TEMPLATE, LDAP_CONFIG, LIBVIRT_INTERFACE, LICENSE, LOCATION, MC_CHANNEL_MAP, MC_LIST, MC_RANGE, METADATA, METADATA_TAG, MIRROR_DESTINATION, MONITORING_PORT, MULTI_NIC_VPORT, NATMAPENTRY, NETWORK_ELEMENT, NETWORK_LAYOUT, NETWORK_MACRO_GROUP, NETWORK_POLICY_GROUP, NEXT_HOP_RESP, NODE_EXECUTION_ERROR, NSGATEWAY, NSGATEWAY_CONFIG, NSGATEWAY_TEMPLATE, NSG_NOTIFICATION, NSPORT, NSPORT_STATIC_CONFIG, NSPORT_TEMPLATE, NSPORT_VLAN_CONFIG, NSREDUNDANT_GW_GRP, NS_REDUNDANT_PORT, PATCONFIG_CONFIG_RESP, PATNATPOOL, PERMISSION, PERMITTED_ACTION, POLICING_POLICY, POLICY_DECISION, POLICY_GROUP, POLICY_GROUP_TEMPLATE, PORT, PORT_MR, PORT_PUSH, PORT_TEMPLATE, PORT_VLAN_CONFIG, PORT_VLAN_CONFIG_RESPONSE, PUBLIC_NETWORK, QOS_PRIMITIVE, RATE_LIMITER, RD_SEQUENCENO, REDUNDANT_GW_GRP, RESYNC, ROUTING_POLICY, ROUTING_POL_MED_RESPONSE, RTRD_ENTITY, RTRD_SEQUENCENO, SERVICES_GATEWAY_RESPONSE, SERVICE_GATEWAY_RESPONSE, SERVICE_VRF_SEQUENCENO, SHAPING_POLICY, SHARED_RESOURCE, SITE, SITE_REQ, SITE_RES, STATIC_ROUTE, STATIC_ROUTE_RESP, STATISTICS, STATSSERVER, STATS_COLLECTOR, STATS_POLICY, STATS_TCA, SUBNET, SUBNET_ENTRY, SUBNET_MAC_ENTRY, SUBNET_POOL_ENTRY, SUBNET_TEMPLATE, SYSTEM_CONFIG, SYSTEM_CONFIG_REQ, SYSTEM_CONFIG_RESP, SYSTEM_MONITORING, UNSUPPORTED, UPLINK_RD, USER, VIRTUAL_IP, VIRTUAL_MACHINE, VIRTUAL_MACHINE_REPORT, VLAN, VLAN_CONFIG_RESPONSE, VLAN_TEMPLATE, VMWARE_RELOAD_CONFIG, VMWARE_VCENTER, VMWARE_VCENTER_CLUSTER, VMWARE_VCENTER_DATACENTER, VMWARE_VCENTER_EAM_CONFIG, VMWARE_VCENTER_HYPERVISOR, VMWARE_VCENTER_VRS_BASE_CONFIG, VMWARE_VCENTER_VRS_CONFIG, VMWARE_VRS_ADDRESS_RANGE, VM_DESCRIPTION, VM_INTERFACE, VNID_SEQUENCENO, VPN_CONNECT, VPORT, VPORTTAG, VPORTTAGTEMPLATE, VPORT_GATEWAY_RESPONSE, VPORT_MEDIATION_REQUEST, VPORT_MIRROR, VPORT_TAG_BASE, VPRN_LABEL_SEQUENCENO, VRS, VSC, VSD, VSD_COMPONENT, VSG_REDUNDANT_PORT, VSP, WAN_SERVICE, ZONE, ZONE_TEMPLATE };
   public enum Encryption { DISABLED, ENABLED, INHERITED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum MaintenanceMode { DISABLED, ENABLED, ENABLED_INHERITED };
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   public enum UnderlayEnabled { DISABLED, ENABLED, INHERITED };

   
   @JsonProperty(value = "IPType")
   protected IPType IPType;
   
   @JsonProperty(value = "PATEnabled")
   protected PATEnabled PATEnabled;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "associatedApplicationID")
   protected String associatedApplicationID;
   
   @JsonProperty(value = "associatedApplicationObjectID")
   protected String associatedApplicationObjectID;
   
   @JsonProperty(value = "associatedApplicationObjectType")
   protected AssociatedApplicationObjectType associatedApplicationObjectType;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSharedNetworkResourceID")
   protected String associatedSharedNetworkResourceID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "gatewayMACAddress")
   protected String gatewayMACAddress;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "maintenanceMode")
   protected MaintenanceMode maintenanceMode;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "policyGroupID")
   protected int policyGroupID;
   
   @JsonProperty(value = "proxyARP")
   protected boolean proxyARP;
   
   @JsonProperty(value = "public_")
   protected boolean public_;
   
   @JsonProperty(value = "routeDistinguisher")
   protected String routeDistinguisher;
   
   @JsonProperty(value = "routeTarget")
   protected String routeTarget;
   
   @JsonProperty(value = "serviceID")
   protected int serviceID;
   
   @JsonProperty(value = "splitSubnet")
   protected boolean splitSubnet;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "underlay")
   protected boolean underlay;
   
   @JsonProperty(value = "underlayEnabled")
   protected UnderlayEnabled underlayEnabled;
   
   @JsonProperty(value = "vnId")
   protected int vnId;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
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
      
      addressRanges = new AddressRangesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
      
      iPReservations = new IPReservationsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
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

   public IPType getIPType() {
      return IPType;
   }

   public void setIPType(IPType value) { 
      this.IPType = value;
   }
   public PATEnabled getPATEnabled() {
      return PATEnabled;
   }

   public void setPATEnabled(PATEnabled value) { 
      this.PATEnabled = value;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
   }
   public String getAssociatedApplicationID() {
      return associatedApplicationID;
   }

   public void setAssociatedApplicationID(String value) { 
      this.associatedApplicationID = value;
   }
   public String getAssociatedApplicationObjectID() {
      return associatedApplicationObjectID;
   }

   public void setAssociatedApplicationObjectID(String value) { 
      this.associatedApplicationObjectID = value;
   }
   public AssociatedApplicationObjectType getAssociatedApplicationObjectType() {
      return associatedApplicationObjectType;
   }

   public void setAssociatedApplicationObjectType(AssociatedApplicationObjectType value) { 
      this.associatedApplicationObjectType = value;
   }
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   public String getAssociatedSharedNetworkResourceID() {
      return associatedSharedNetworkResourceID;
   }

   public void setAssociatedSharedNetworkResourceID(String value) { 
      this.associatedSharedNetworkResourceID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
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
   public String getGatewayMACAddress() {
      return gatewayMACAddress;
   }

   public void setGatewayMACAddress(String value) { 
      this.gatewayMACAddress = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public MaintenanceMode getMaintenanceMode() {
      return maintenanceMode;
   }

   public void setMaintenanceMode(MaintenanceMode value) { 
      this.maintenanceMode = value;
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
   public String getNetmask() {
      return netmask;
   }

   public void setNetmask(String value) { 
      this.netmask = value;
   }
   public int getPolicyGroupID() {
      return policyGroupID;
   }

   public void setPolicyGroupID(int value) { 
      this.policyGroupID = value;
   }
   public boolean getProxyARP() {
      return proxyARP;
   }

   public void setProxyARP(boolean value) { 
      this.proxyARP = value;
   }
   public boolean getPublic_() {
      return public_;
   }

   public void setPublic_(boolean value) { 
      this.public_ = value;
   }
   public String getRouteDistinguisher() {
      return routeDistinguisher;
   }

   public void setRouteDistinguisher(String value) { 
      this.routeDistinguisher = value;
   }
   public String getRouteTarget() {
      return routeTarget;
   }

   public void setRouteTarget(String value) { 
      this.routeTarget = value;
   }
   public int getServiceID() {
      return serviceID;
   }

   public void setServiceID(int value) { 
      this.serviceID = value;
   }
   public boolean getSplitSubnet() {
      return splitSubnet;
   }

   public void setSplitSubnet(boolean value) { 
      this.splitSubnet = value;
   }
   public String getTemplateID() {
      return templateID;
   }

   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   public boolean getUnderlay() {
      return underlay;
   }

   public void setUnderlay(boolean value) { 
      this.underlay = value;
   }
   public UnderlayEnabled getUnderlayEnabled() {
      return underlayEnabled;
   }

   public void setUnderlayEnabled(UnderlayEnabled value) { 
      this.underlayEnabled = value;
   }
   public int getVnId() {
      return vnId;
   }

   public void setVnId(int value) { 
      this.vnId = value;
   }
   

   
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
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
   
   public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
      return iKEGatewayConnections;
   }
   
   public IPReservationsFetcher getIPReservations() {
      return iPReservations;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   public VMResyncsFetcher getVMResyncs() {
      return vMResyncs;
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
   
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "Subnet [" + "IPType=" + IPType + ", PATEnabled=" + PATEnabled + ", address=" + address + ", associatedApplicationID=" + associatedApplicationID + ", associatedApplicationObjectID=" + associatedApplicationObjectID + ", associatedApplicationObjectType=" + associatedApplicationObjectType + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSharedNetworkResourceID=" + associatedSharedNetworkResourceID + ", description=" + description + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", lastUpdatedBy=" + lastUpdatedBy + ", maintenanceMode=" + maintenanceMode + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyGroupID=" + policyGroupID + ", proxyARP=" + proxyARP + ", public_=" + public_ + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", serviceID=" + serviceID + ", splitSubnet=" + splitSubnet + ", templateID=" + templateID + ", underlay=" + underlay + ", underlayEnabled=" + underlayEnabled + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}