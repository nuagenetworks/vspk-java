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


import net.nuagenetworks.vspk.v5_0.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GroupsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.SubnetsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "zone", resourceName = "zones")
public class Zone extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum DPI { DISABLED, ENABLED, INHERITED };
   public enum IPType { IPV4, IPV6 };
   public enum AssociatedApplicationObjectType { ACLENTRY_LOCATION, ADDRESS_RANGE, ADDRESS_RANGE_STATE, ALARM, APPD_APPLICATION, APPD_EXTERNAL_APP_SERVICE, APPD_FLOW, APPD_FLOW_FORWARDING_POLICY, APPD_FLOW_SECURITY_POLICY, APPD_SERVICE, APPD_TIER, AUTO_DISC_GATEWAY, BACK_HAUL_SERVICE_RESP, BGPPEER, BGP_DAMPENING_MED_RESPONSE, BGP_NEIGHBOR, BGP_NEIGHBOR_MED_RESPONSE, BGP_PROFILE, BGP_PROFILE_MED_RESPONSE, BOOTSTRAP, BOOTSTRAP_ACTIVATION, BRIDGEINTERFACE, CERTIFICATE, CHILD_ENTITY_POLICY_CHANGE, CLOUD_MGMT_SYSTEM, CONTAINER_RESYNC, CUSTOMER_VRF_SEQUENCENO, DC_CONFIG, DHCP_ALLOC_MESSAGE, DHCP_CONFIG_RESP, DHCP_OPTION, DISKSTATS, DOMAIN, DOMAIN_CONFIG, DOMAIN_CONFIG_RESP, DOMAIN_FLOATING_IP_ACL_TEMPLATE, DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY, DOMAIN_TEMPLATE, DSCP_FORWARDING_CLASS_MAPPING, DSCP_FORWARDING_CLASS_TABLE, EGRESS_ACL, EGRESS_ACL_ENTRY, EGRESS_ACL_TEMPLATE, EGRESS_ACL_TEMPLATE_ENTRY, EGRESS_QOS_PRIMITIVE, ENDPOINT, ENTERPRISE, ENTERPRISE_CONFIG, ENTERPRISE_CONFIG_RESP, ENTERPRISE_NETWORK, ENTERPRISE_PERMISSION, ENTERPRISE_PROFILE, ENTERPRISE_SECURED_DATA, ENTERPRISE_SECURITY, ENTITY_METADATA_BINDING, ESI_SEQUENCENO, EVENT_LOG, EVPN_BGP_COMMUNITY_TAG_ENTRY, EVPN_BGP_COMMUNITY_TAG_SEQ_NO, EXPORTIMPORT, EXTERNAL_SERVICE, FLOATINGIP, FLOATINGIP_ACL, FLOATINGIP_ACL_ENTRY, FLOATING_IP_ACL_TEMPLATE, FLOATING_IP_ACL_TEMPLATE_ENTRY, GATEWAY, GATEWAY_CONFIG, GATEWAY_CONFIG_RESP, GATEWAY_SECURED_DATA, GATEWAY_SECURITY, GATEWAY_SECURITY_PROFILE_REQUEST, GATEWAY_SECURITY_PROFILE_RESPONSE, GATEWAY_SECURITY_REQUEST, GATEWAY_SECURITY_RESPONSE, GATEWAY_SERVICE_CONFIG, GATEWAY_SERVICE_CONFIG_RESP, GATEWAY_TEMPLATE, GATEWAY_VPORT_CONFIG, GATEWAY_VPORT_CONFIG_RESP, GEO_VM_EVENT, GEO_VM_REQ, GEO_VM_RES, GROUP, GROUPKEY_ENCRYPTION_PROFILE, HEALTH_REQ, HOSTINTERFACE, HSC, IKE_CERTIFICATE, IKE_ENCRYPTION_PROFILE, IKE_GATEWAY, IKE_GATEWAY_CONFIG, IKE_GATEWAY_CONNECTION, IKE_GATEWAY_PROFILE, IKE_PSK, IKE_SUBNET, INFRASTRUCTURE_CONFIG, INFRASTRUCTURE_GATEWAY_PROFILE, INFRASTRUCTURE_PORT_PROFILE, INFRASTRUCTURE_VSC_PROFILE, INGRESS_ACL, INGRESS_ACL_ENTRY, INGRESS_ACL_TEMPLATE, INGRESS_ACL_TEMPLATE_ENTRY, INGRESS_ADV_FWD, INGRESS_ADV_FWD_ENTRY, INGRESS_ADV_FWD_TEMPLATE, INGRESS_ADV_FWD_TEMPLATE_ENTRY, INGRESS_EXT_SERVICE, INGRESS_EXT_SERVICE_ENTRY, INGRESS_EXT_SERVICE_TEMPLATE, INGRESS_EXT_SERVICE_TEMPLATE_ENTRY, IP_BINDING, JOB, KEYSERVER_MEMBER, KEYSERVER_MONITOR, KEYSERVER_MONITOR_ENCRYPTED_SEED, KEYSERVER_MONITOR_SEED, KEYSERVER_MONITOR_SEK, KEYSERVER_NOTIFICATION, L2DOMAIN, L2DOMAIN_SHARED, L2DOMAIN_TEMPLATE, LDAP_CONFIG, LIBVIRT_INTERFACE, LICENSE, LOCATION, MC_CHANNEL_MAP, MC_LIST, MC_RANGE, METADATA, METADATA_TAG, MIRROR_DESTINATION, MONITORING_PORT, MULTI_NIC_VPORT, NATMAPENTRY, NETWORK_ELEMENT, NETWORK_LAYOUT, NETWORK_MACRO_GROUP, NETWORK_POLICY_GROUP, NEXT_HOP_RESP, NODE_EXECUTION, NSGATEWAY, NSGATEWAY_CONFIG, NSGATEWAY_TEMPLATE, NSG_NOTIFICATION, NSPORT, NSPORT_STATIC_CONFIG, NSPORT_TEMPLATE, NSPORT_VLAN_CONFIG, NSREDUNDANT_GW_GRP, NS_REDUNDANT_PORT, PATCONFIG_CONFIG_RESP, PATNATPOOL, PERMISSION, PERMITTED_ACTION, POLICING_POLICY, POLICY_DECISION, POLICY_GROUP, POLICY_GROUP_TEMPLATE, PORT, PORT_MR, PORT_PUSH, PORT_TEMPLATE, PORT_VLAN_CONFIG, PORT_VLAN_CONFIG_RESPONSE, PUBLIC_NETWORK, QOS_PRIMITIVE, RATE_LIMITER, RD_SEQUENCENO, REDUNDANT_GW_GRP, ROUTING_POLICY, ROUTING_POL_MED_RESPONSE, RTRD_ENTITY, RTRD_SEQUENCENO, SERVICES_GATEWAY_RESPONSE, SERVICE_GATEWAY_RESPONSE, SERVICE_VRF_SEQUENCENO, SHAPING_POLICY, SHARED_RESOURCE, SITE, SITE_REQ, SITE_RES, STATIC_ROUTE, STATIC_ROUTE_RESP, STATISTICS, STATSSERVER, STATS_COLLECTOR, STATS_POLICY, STATS_TCA, SUBNET, SUBNET_ENTRY, SUBNET_MAC_ENTRY, SUBNET_POOL_ENTRY, SUBNET_TEMPLATE, SYSTEM_CONFIG, SYSTEM_CONFIG_REQ, SYSTEM_CONFIG_RESP, SYSTEM_MONITORING, UNSUPPORTED, UPLINK_RD, USER, VIRTUAL_IP, VIRTUAL_MACHINE, VIRTUAL_MACHINE_REPORT, VLAN, VLAN_CONFIG_RESPONSE, VLAN_TEMPLATE, VMWARE_RELOAD_CONFIG, VMWARE_VCENTER, VMWARE_VCENTER_CLUSTER, VMWARE_VCENTER_DATACENTER, VMWARE_VCENTER_EAM_CONFIG, VMWARE_VCENTER_HYPERVISOR, VMWARE_VCENTER_VRS_BASE_CONFIG, VMWARE_VCENTER_VRS_CONFIG, VMWARE_VRS_ADDRESS_RANGE, VM_DESCRIPTION, VM_INTERFACE, VM_RESYNC, VNID_SEQUENCENO, VPN_CONNECT, VPORT, VPORTTAG, VPORTTAGTEMPLATE, VPORT_GATEWAY_RESPONSE, VPORT_MEDIATION_REQUEST, VPORT_MIRROR, VPORT_TAG_BASE, VPRN_LABEL_SEQUENCENO, VRS, VSC, VSD, VSD_COMPONENT, VSG_REDUNDANT_PORT, VSP, WAN_SERVICE, ZONE, ZONE_TEMPLATE };
   public enum Encryption { DISABLED, ENABLED, INHERITED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum MaintenanceMode { DISABLED, ENABLED, ENABLED_INHERITED };
   public enum Multicast { DISABLED, ENABLED, INHERITED };

   
   @JsonProperty(value = "DPI")
   protected DPI DPI;
   
   @JsonProperty(value = "IPType")
   protected IPType IPType;
   
   @JsonProperty(value = "IPv6Address")
   protected String IPv6Address;
   
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
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "dynamicIpv6Address")
   protected Boolean dynamicIpv6Address;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
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
   
   @JsonProperty(value = "numberOfHostsInSubnets")
   protected Long numberOfHostsInSubnets;
   
   @JsonProperty(value = "policyGroupID")
   protected Long policyGroupID;
   
   @JsonProperty(value = "publicZone")
   protected Boolean publicZone;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   

   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   

   public Zone() {
      multicast = Multicast.INHERITED;
      maintenanceMode = MaintenanceMode.DISABLED;
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
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
   public IPType getIPType() {
      return IPType;
   }

   @JsonIgnore
   public void setIPType(IPType value) { 
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
   public String getAssociatedApplicationID() {
      return associatedApplicationID;
   }

   @JsonIgnore
   public void setAssociatedApplicationID(String value) { 
      this.associatedApplicationID = value;
   }
   @JsonIgnore
   public String getAssociatedApplicationObjectID() {
      return associatedApplicationObjectID;
   }

   @JsonIgnore
   public void setAssociatedApplicationObjectID(String value) { 
      this.associatedApplicationObjectID = value;
   }
   @JsonIgnore
   public AssociatedApplicationObjectType getAssociatedApplicationObjectType() {
      return associatedApplicationObjectType;
   }

   @JsonIgnore
   public void setAssociatedApplicationObjectType(AssociatedApplicationObjectType value) { 
      this.associatedApplicationObjectType = value;
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
   public Boolean getDynamicIpv6Address() {
      return dynamicIpv6Address;
   }

   @JsonIgnore
   public void setDynamicIpv6Address(Boolean value) { 
      this.dynamicIpv6Address = value;
   }
   @JsonIgnore
   public Encryption getEncryption() {
      return encryption;
   }

   @JsonIgnore
   public void setEncryption(Encryption value) { 
      this.encryption = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   @JsonIgnore
   public MaintenanceMode getMaintenanceMode() {
      return maintenanceMode;
   }

   @JsonIgnore
   public void setMaintenanceMode(MaintenanceMode value) { 
      this.maintenanceMode = value;
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
   public Long getPolicyGroupID() {
      return policyGroupID;
   }

   @JsonIgnore
   public void setPolicyGroupID(Long value) { 
      this.policyGroupID = value;
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
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
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
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
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
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   @JsonIgnore
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   
   @JsonIgnore
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   
   @JsonIgnore
   public TCAsFetcher getTCAs() {
      return tCAs;
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
      return "Zone [" + "DPI=" + DPI + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", address=" + address + ", associatedApplicationID=" + associatedApplicationID + ", associatedApplicationObjectID=" + associatedApplicationObjectID + ", associatedApplicationObjectType=" + associatedApplicationObjectType + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", description=" + description + ", dynamicIpv6Address=" + dynamicIpv6Address + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", maintenanceMode=" + maintenanceMode + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", numberOfHostsInSubnets=" + numberOfHostsInSubnets + ", policyGroupID=" + policyGroupID + ", publicZone=" + publicZone + ", templateID=" + templateID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}