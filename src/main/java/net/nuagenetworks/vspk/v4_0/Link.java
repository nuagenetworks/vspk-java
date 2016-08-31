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

package net.nuagenetworks.vspk.v4_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "link", resourceName = "links")
public class Link extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum AssociatedDestinationType { UNSUPPORTED, NETWORK_ELEMENT, NETWORK_LAYOUT, ENTERPRISE, AVATAR, ENTERPRISE_PROFILE, GROUP, USER, DOMAIN_FLOATING_IP_ACL_TEMPLATE, DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY, FLOATING_IP_ACL_TEMPLATE, FLOATING_IP_ACL_TEMPLATE_ENTRY, FLOATINGIP_ACL, FLOATINGIP_ACL_ENTRY, INGRESS_ACL_TEMPLATE, INGRESS_ACL_TEMPLATE_ENTRY, INGRESS_ACL, INGRESS_ACL_ENTRY, INGRESS_ADV_FWD_TEMPLATE, INGRESS_ADV_FWD_TEMPLATE_ENTRY, INGRESS_ADV_FWD, INGRESS_ADV_FWD_ENTRY, INGRESS_EXT_SERVICE_TEMPLATE, INGRESS_EXT_SERVICE_TEMPLATE_ENTRY, INGRESS_EXT_SERVICE, INGRESS_EXT_SERVICE_ENTRY, EGRESS_ACL_TEMPLATE, EGRESS_ACL_TEMPLATE_ENTRY, EGRESS_ACL, EGRESS_ACL_ENTRY, POLICING_POLICY, SHAPING_POLICY, QOS_PRIMITIVE, EGRESS_QOS_PRIMITIVE, EGRESS_QOS_QUEUE_MR, EGRESS_QOS_MR, PORT_MR, RATE_LIMITER, DSCP_FORWARDING_CLASS_MAPPING, DSCP_FORWARDING_CLASS_TABLE, APPLICATION, VIRTUAL_MACHINE, CONTAINER, SUBNET, ADDRESS_RANGE, ADDRESS_RANGE_STATE, IP_BINDING, L2DOMAIN, L2DOMAIN_SHARED, L2DOMAIN_TEMPLATE, SUBNET_ENTRY, SUBNET_MAC_ENTRY, ENTERPRISE_NETWORK, NETWORK_MACRO_GROUP, PUBLIC_NETWORK, SUBNET_TEMPLATE, VM_INTERFACE, CONTAINER_INTERFACE, VM_DESCRIPTION, CONTAINER_DESCRIPTION, POLICY_DECISION, CUSTOMER_VRF_SEQUENCENO, SERVICE_VRF_SEQUENCENO, DOMAIN, VPN_CONNECT, ZONE, FLOATINGIP, SUBNET_POOL_ENTRY, DOMAIN_TEMPLATE, ZONE_TEMPLATE, PERMISSION, PERMITTED_ACTION, STATS_TCA, STATS_POLICY, STATS_COLLECTOR, STATISTICS, BULKSTATISTICS, ALARM, EVENT_LOG, DHCP_OPTION, STATIC_ROUTE, DC_CONFIG, VM_RESYNC, CONTAINER_RESYNC, VPRN_LABEL_SEQUENCENO, LDAP_CONFIG, LICENSE, LICENSE_STATUS, VPORT, VPORT_GATEWAY_RESPONSE, SERVICE_GATEWAY_RESPONSE, SERVICES_GATEWAY_RESPONSE, VPORTTAGTEMPLATE, VPORTTAG, POLICY_GROUP_TEMPLATE, HOSTINTERFACE, BRIDGEINTERFACE, VIRTUAL_IP, VPORT_TAG_BASE, POLICY_GROUP, VNID_SEQUENCENO, ESI_SEQUENCENO, SYSTEM_CONFIG, SYSTEM_CONFIG_REQ, SYSTEM_CONFIG_RESP, SHARED_RESOURCE, RTRD_SEQUENCENO, RD_SEQUENCENO, RTRD_ENTITY, EVPN_BGP_COMMUNITY_TAG_SEQ_NO, EVPN_BGP_COMMUNITY_TAG_ENTRY, VPORT_MEDIATION_REQUEST, NODE_EXECUTION_ERROR, MIRROR_DESTINATION, VPORT_MIRROR, GATEWAY, NSGATEWAY, GATEWAY_STATE, GATEWAY_TEMPLATE, NSGATEWAY_TEMPLATE, AUTO_DISC_GATEWAY, PORT, NSPORT, NS_REDUNDANT_PORT, VSG_REDUNDANT_PORT, PORT_TEMPLATE, NSPORT_TEMPLATE, VLAN, VLAN_TEMPLATE, VLAN_CONFIG_RESPONSE, REDUNDANT_GW_GRP, NSREDUNDANT_GW_GRP, WAN_SERVICE, GATEWAY_VPORT_CONFIG, GATEWAY_SERVICE_CONFIG, GATEWAY_SERVICE_CONFIG_RESP, GATEWAY_VPORT_CONFIG_RESP, GATEWAY_CONFIG, NSGATEWAY_CONFIG, GATEWAY_CONFIG_RESP, ENTERPRISE_CONFIG, ENTERPRISE_CONFIG_RESP, DHCP_CONFIG_RESP, DHCP_ALLOC_MESSAGE, VSC, HSC, VSD, VRS, STATSSERVER, VSP, VSD_COMPONENT, SYSTEM_MONITORING, DISKSTATS, MONITORING_PORT, BGPPEER, JOB, ENTERPRISE_PERMISSION, VIRTUAL_MACHINE_REPORT, BOOTSTRAP, LOCATION, BOOTSTRAP_ACTIVATION, INFRASTRUCTURE_GATEWAY_PROFILE, INFRASTRUCTURE_PORT_PROFILE, INFRASTRUCTURE_VSC_PROFILE, INFRASTRUCTURE_CONFIG, NSPORT_STATIC_CONFIG, NSG_NOTIFICATION, SITE, SITE_REQ, HEALTH_REQ, SITE_RES, GEO_VM_REQ, GEO_VM_RES, GEO_VM_EVENT, METADATA, METADATA_TAG, ENTITY_METADATA_BINDING, CHILD_ENTITY_POLICY_CHANGE, MULTI_NIC_VPORT, BACK_HAUL_SERVICE_RESP, MC_CHANNEL_MAP, MC_LIST, MC_RANGE, LIBVIRT_INTERFACE, APPD_APPLICATION, APPD_SERVICE, APPD_TIER, APPD_FLOW, APPD_FLOW_SECURITY_POLICY, APPD_FLOW_FORWARDING_POLICY, APPD_EXTERNAL_APP_SERVICE, PATNATPOOL, NATMAPENTRY, PATCONFIG_CONFIG_RESP, MACRO_GROUP_MED, PORT_RANGE_MED, NETWORK_POLICY_GROUP, ACLENTRY_LOCATION, EXPORTIMPORT, EXTERNAL_SERVICE, ENDPOINT, DOMAIN_CONFIG, DOMAIN_CONFIG_RESP, STATIC_ROUTE_RESP, NEXT_HOP_RESP, UPLINK_RD, VMWARE_VCENTER_EAM_CONFIG, VMWARE_VCENTER_VRS_CONFIG, VMWARE_VCENTER, VMWARE_VCENTER_DATACENTER, VMWARE_VCENTER_CLUSTER, VMWARE_VCENTER_HYPERVISOR, VMWARE_VRS_ADDRESS_RANGE, VMWARE_VRS_REDEPLOYMENT_POLICY, VMWARE_VCENTER_VRS_BASE_CONFIG, VMWARE_RELOAD_CONFIG, VCENTER_FETCH_DATACENTERS, VCENTER_FETCH_CLUSTERS, FETCH_HYPERVISOR_PROPERTIES, VMWARE_ADD_CLUSTER_INSCOPE, VMWARE_REMOVE_CLUSTER_INSCOPE, EAM_VRS_METRICS, CLOUD_MGMT_SYSTEM, IKE_ENCRYPTION_PROFILE, IKE_GATEWAY, IKE_GATEWAY_CONFIG, IKE_GATEWAY_PROFILE, IKE_GATEWAY_CONNECTION, IKE_CERTIFICATE, IKE_PSK, IKE_SUBNET, GROUPKEY_ENCRYPTION_PROFILE, KEYSERVER_MEMBER, KEYSERVER_MONITOR, KEYSERVER_MONITOR_SEED, KEYSERVER_MONITOR_ENCRYPTED_SEED, KEYSERVER_MONITOR_SEK, KEYSERVER_NOTIFICATION, ENTERPRISE_SECURITY, ENTERPRISE_SECURED_DATA, GATEWAY_SECURITY, GATEWAY_SECURITY_REQUEST, GATEWAY_SECURITY_RESPONSE, GATEWAY_SECURITY_PROFILE_REQUEST, IKE_ENCRYPTION_PROFILE_REQUEST, IKE_GATEWAY_CONNECTION_REQUEST, GATEWAY_SECURITY_PROFILE_RESPONSE, GATEWAY_SECURED_DATA, CERTIFICATE, PATMAPPER, PAT_IP_ENTRY, PORTMAPPING, BGP_PROFILE, ROUTING_POLICY, BGP_NEIGHBOR, BGP_PROFILE_MED_RESPONSE, ROUTING_POL_MED_RESPONSE, BGP_NEIGHBOR_MED_RESPONSE, BGP_DAMPENING_MED_RESPONSE, PORT_VLAN_CONFIG, NSPORT_VLAN_CONFIG, PORT_VLAN_CONFIG_RESPONSE, PORT_PUSH, ZFB_REQUEST, ZFB_AUTO_ASSIGNMENT, ZFB_AUTO_ASSIGNMENT_VALUE, ZFB_GLOBAL, NSG_INFO, LINK, LINKED_DOMAIN_RESP, NEXT_HOP };

   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "acceptanceCriteria")
   protected String acceptanceCriteria;
   
   @JsonProperty(value = "readOnly")
   protected Boolean readOnly;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "associatedDestinationID")
   protected String associatedDestinationID;
   
   @JsonProperty(value = "associatedDestinationName")
   protected String associatedDestinationName;
   
   @JsonProperty(value = "associatedDestinationType")
   protected AssociatedDestinationType associatedDestinationType;
   
   @JsonProperty(value = "associatedSourceID")
   protected String associatedSourceID;
   
   @JsonProperty(value = "associatedSourceName")
   protected String associatedSourceName;
   
   @JsonProperty(value = "associatedSourceType")
   protected String associatedSourceType;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "type")
   protected String type;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public Link() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
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
   public String getAcceptanceCriteria() {
      return acceptanceCriteria;
   }

   @JsonIgnore
   public void setAcceptanceCriteria(String value) { 
      this.acceptanceCriteria = value;
   }
   @JsonIgnore
   public Boolean getReadOnly() {
      return readOnly;
   }

   @JsonIgnore
   public void setReadOnly(Boolean value) { 
      this.readOnly = value;
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
   public String getAssociatedDestinationID() {
      return associatedDestinationID;
   }

   @JsonIgnore
   public void setAssociatedDestinationID(String value) { 
      this.associatedDestinationID = value;
   }
   @JsonIgnore
   public String getAssociatedDestinationName() {
      return associatedDestinationName;
   }

   @JsonIgnore
   public void setAssociatedDestinationName(String value) { 
      this.associatedDestinationName = value;
   }
   @JsonIgnore
   public AssociatedDestinationType getAssociatedDestinationType() {
      return associatedDestinationType;
   }

   @JsonIgnore
   public void setAssociatedDestinationType(AssociatedDestinationType value) { 
      this.associatedDestinationType = value;
   }
   @JsonIgnore
   public String getAssociatedSourceID() {
      return associatedSourceID;
   }

   @JsonIgnore
   public void setAssociatedSourceID(String value) { 
      this.associatedSourceID = value;
   }
   @JsonIgnore
   public String getAssociatedSourceName() {
      return associatedSourceName;
   }

   @JsonIgnore
   public void setAssociatedSourceName(String value) { 
      this.associatedSourceName = value;
   }
   @JsonIgnore
   public String getAssociatedSourceType() {
      return associatedSourceType;
   }

   @JsonIgnore
   public void setAssociatedSourceType(String value) { 
      this.associatedSourceType = value;
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
   public String getType() {
      return type;
   }

   @JsonIgnore
   public void setType(String value) { 
      this.type = value;
   }
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "Link [" + "lastUpdatedBy=" + lastUpdatedBy + ", acceptanceCriteria=" + acceptanceCriteria + ", readOnly=" + readOnly + ", entityScope=" + entityScope + ", associatedDestinationID=" + associatedDestinationID + ", associatedDestinationName=" + associatedDestinationName + ", associatedDestinationType=" + associatedDestinationType + ", associatedSourceID=" + associatedSourceID + ", associatedSourceName=" + associatedSourceName + ", associatedSourceType=" + associatedSourceType + ", externalID=" + externalID + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}