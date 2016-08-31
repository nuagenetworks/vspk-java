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
@RestEntity(restName = "egressdomainfloatingipaclentrytemplate", resourceName = "egressdomainfloatingipaclentrytemplates")
public class DomainFIPAclTemplateEntry extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum Action { DROP, FORWARD, REDIRECT };
   public enum DestinationType { NETWORK, NETWORKPOLICYGROUP, POLICYGROUP };
   public enum NetworkType { ANY, ENDPOINT_DOMAIN, ENDPOINT_SUBNET, ENDPOINT_ZONE, ENTERPRISE_NETWORK, INTERNET_POLICYGROUP, NETWORK_MACRO_GROUP, POLICYGROUP, PUBLIC_NETWORK, SUBNET, ZONE };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum LocationType { ANY, POLICYGROUP, REDIRECTIONTARGET, SUBNET, VPORTTAG, ZONE };
   public enum PolicyState { DRAFT, LIVE };
   public enum SourceType { NETWORK, NETWORKPOLICYGROUP, POLICYGROUP };
   public enum AssociatedApplicationObjectType { ACLENTRY_LOCATION, ADDRESS_RANGE, ADDRESS_RANGE_STATE, ALARM, APPD_APPLICATION, APPD_EXTERNAL_APP_SERVICE, APPD_FLOW, APPD_FLOW_FORWARDING_POLICY, APPD_FLOW_SECURITY_POLICY, APPD_SERVICE, APPD_TIER, APPLICATION, AUTO_DISC_GATEWAY, BACK_HAUL_SERVICE_RESP, BGPPEER, BGP_DAMPENING_MED_RESPONSE, BGP_NEIGHBOR, BGP_NEIGHBOR_MED_RESPONSE, BGP_PROFILE, BGP_PROFILE_MED_RESPONSE, BOOTSTRAP, BOOTSTRAP_ACTIVATION, BRIDGEINTERFACE, CERTIFICATE, CHILD_ENTITY_POLICY_CHANGE, CLOUD_MGMT_SYSTEM, CONTAINER_RESYNC, CUSTOMER_VRF_SEQUENCENO, DC_CONFIG, DHCP_ALLOC_MESSAGE, DHCP_CONFIG_RESP, DHCP_OPTION, DISKSTATS, DOMAIN, DOMAIN_CONFIG, DOMAIN_CONFIG_RESP, DOMAIN_FLOATING_IP_ACL_TEMPLATE, DOMAIN_FLOATING_IP_ACL_TEMPLATE_ENTRY, DOMAIN_TEMPLATE, DSCP_FORWARDING_CLASS_MAPPING, DSCP_FORWARDING_CLASS_TABLE, EGRESS_ACL, EGRESS_ACL_ENTRY, EGRESS_ACL_TEMPLATE, EGRESS_ACL_TEMPLATE_ENTRY, EGRESS_QOS_MR, EGRESS_QOS_PRIMITIVE, EGRESS_QOS_QUEUE_MR, ENDPOINT, ENTERPRISE, ENTERPRISE_CONFIG, ENTERPRISE_CONFIG_RESP, ENTERPRISE_NETWORK, ENTERPRISE_PERMISSION, ENTERPRISE_PROFILE, ENTERPRISE_SECURED_DATA, ENTERPRISE_SECURITY, ENTITY_METADATA_BINDING, ESI_SEQUENCENO, EVENT_LOG, EVPN_BGP_COMMUNITY_TAG_ENTRY, EVPN_BGP_COMMUNITY_TAG_SEQ_NO, EXPORTIMPORT, EXTERNAL_SERVICE, FLOATINGIP, FLOATINGIP_ACL, FLOATINGIP_ACL_ENTRY, FLOATING_IP_ACL_TEMPLATE, FLOATING_IP_ACL_TEMPLATE_ENTRY, GATEWAY, GATEWAY_CONFIG, GATEWAY_CONFIG_RESP, GATEWAY_SECURED_DATA, GATEWAY_SECURITY, GATEWAY_SECURITY_PROFILE_REQUEST, GATEWAY_SECURITY_PROFILE_RESPONSE, GATEWAY_SECURITY_REQUEST, GATEWAY_SECURITY_RESPONSE, GATEWAY_SERVICE_CONFIG, GATEWAY_SERVICE_CONFIG_RESP, GATEWAY_TEMPLATE, GATEWAY_VPORT_CONFIG, GATEWAY_VPORT_CONFIG_RESP, GEO_VM_EVENT, GEO_VM_REQ, GEO_VM_RES, GROUP, GROUPKEY_ENCRYPTION_PROFILE, HEALTH_REQ, HOSTINTERFACE, HSC, IKE_ENCRYPTION_PROFILE, IKE_GATEWAY, IKE_GATEWAY_CONFIG, IKE_GATEWAY_PROFILE, IKE_GATEWAY_CONNECTION, IKE_CERTIFICATE, IKE_PSK, IKE_SUBNET, INFRASTRUCTURE_CONFIG, INFRASTRUCTURE_GATEWAY_PROFILE, INFRASTRUCTURE_PORT_PROFILE, INFRASTRUCTURE_VSC_PROFILE, INGRESS_ACL, INGRESS_ACL_ENTRY, INGRESS_ACL_TEMPLATE, INGRESS_ACL_TEMPLATE_ENTRY, INGRESS_ADV_FWD, INGRESS_ADV_FWD_ENTRY, INGRESS_ADV_FWD_TEMPLATE, INGRESS_ADV_FWD_TEMPLATE_ENTRY, INGRESS_EXT_SERVICE, INGRESS_EXT_SERVICE_ENTRY, INGRESS_EXT_SERVICE_TEMPLATE, INGRESS_EXT_SERVICE_TEMPLATE_ENTRY, IP_BINDING, JOB, KEYSERVER_MEMBER, KEYSERVER_MONITOR, KEYSERVER_MONITOR_ENCRYPTED_SEED, KEYSERVER_MONITOR_SEED, KEYSERVER_MONITOR_SEK, KEYSERVER_NOTIFICATION, L2DOMAIN, L2DOMAIN_SHARED, L2DOMAIN_TEMPLATE, LDAP_CONFIG, LIBVIRT_INTERFACE, LICENSE, LOCATION, MC_CHANNEL_MAP, MC_LIST, MC_RANGE, METADATA, METADATA_TAG, MIRROR_DESTINATION, MONITORING_PORT, MULTI_NIC_VPORT, NATMAPENTRY, NETWORK_ELEMENT, NETWORK_LAYOUT, NETWORK_MACRO_GROUP, NETWORK_POLICY_GROUP, NEXT_HOP_RESP, NODE_EXECUTION_ERROR, NSGATEWAY, NSGATEWAY_CONFIG, NSGATEWAY_TEMPLATE, NSG_NOTIFICATION, NSPORT, NSPORT_STATIC_CONFIG, NSPORT_TEMPLATE, NSPORT_VLAN_CONFIG, NSREDUNDANT_GW_GRP, NS_REDUNDANT_PORT, PATCONFIG_CONFIG_RESP, PATNATPOOL, PERMISSION, PERMITTED_ACTION, POLICING_POLICY, POLICY_DECISION, POLICY_GROUP, POLICY_GROUP_TEMPLATE, PORT, PORT_MR, PORT_PUSH, PORT_TEMPLATE, PORT_VLAN_CONFIG, PORT_VLAN_CONFIG_RESPONSE, PUBLIC_NETWORK, QOS_PRIMITIVE, RATE_LIMITER, RD_SEQUENCENO, REDUNDANT_GW_GRP, ROUTING_POLICY, ROUTING_POL_MED_RESPONSE, RTRD_ENTITY, RTRD_SEQUENCENO, SERVICES_GATEWAY_RESPONSE, SERVICE_GATEWAY_RESPONSE, SERVICE_VRF_SEQUENCENO, SHAPING_POLICY, SHARED_RESOURCE, SITE, SITE_REQ, SITE_RES, STATIC_ROUTE, STATIC_ROUTE_RESP, STATISTICS, STATSSERVER, STATS_COLLECTOR, STATS_POLICY, STATS_TCA, SUBNET, SUBNET_ENTRY, SUBNET_MAC_ENTRY, SUBNET_POOL_ENTRY, SUBNET_TEMPLATE, SYSTEM_CONFIG, SYSTEM_CONFIG_REQ, SYSTEM_CONFIG_RESP, SYSTEM_MONITORING, UNSUPPORTED, UPLINK_RD, USER, VIRTUAL_IP, VIRTUAL_MACHINE, VIRTUAL_MACHINE_REPORT, VLAN, VLAN_CONFIG_RESPONSE, VLAN_TEMPLATE, VMWARE_RELOAD_CONFIG, VMWARE_VCENTER, VMWARE_VCENTER_CLUSTER, VMWARE_VCENTER_DATACENTER, VMWARE_VCENTER_EAM_CONFIG, VMWARE_VCENTER_HYPERVISOR, VMWARE_VCENTER_VRS_BASE_CONFIG, VMWARE_VCENTER_VRS_CONFIG, VMWARE_VRS_ADDRESS_RANGE, VM_DESCRIPTION, VM_INTERFACE, VM_RESYNC, VNID_SEQUENCENO, VPN_CONNECT, VPORT, VPORTTAG, VPORTTAGTEMPLATE, VPORT_GATEWAY_RESPONSE, VPORT_MEDIATION_REQUEST, VPORT_MIRROR, VPORT_TAG_BASE, VPRN_LABEL_SEQUENCENO, VRS, VSC, VSD, VSD_COMPONENT, VSG_REDUNDANT_PORT, VSP, WAN_SERVICE, ZONE, ZONE_TEMPLATE };

   
   @JsonProperty(value = "ACLTemplateName")
   protected String ACLTemplateName;
   
   @JsonProperty(value = "ICMPCode")
   protected String ICMPCode;
   
   @JsonProperty(value = "ICMPType")
   protected String ICMPType;
   
   @JsonProperty(value = "DSCP")
   protected String DSCP;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "action")
   protected Action action;
   
   @JsonProperty(value = "actionDetails")
   protected Object actionDetails;
   
   @JsonProperty(value = "addressOverride")
   protected String addressOverride;
   
   @JsonProperty(value = "reflexive")
   protected Boolean reflexive;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "destPgId")
   protected String destPgId;
   
   @JsonProperty(value = "destPgType")
   protected String destPgType;
   
   @JsonProperty(value = "destinationPort")
   protected String destinationPort;
   
   @JsonProperty(value = "destinationType")
   protected DestinationType destinationType;
   
   @JsonProperty(value = "destinationValue")
   protected String destinationValue;
   
   @JsonProperty(value = "networkID")
   protected String networkID;
   
   @JsonProperty(value = "networkType")
   protected NetworkType networkType;
   
   @JsonProperty(value = "mirrorDestinationID")
   protected String mirrorDestinationID;
   
   @JsonProperty(value = "flowLoggingEnabled")
   protected Boolean flowLoggingEnabled;
   
   @JsonProperty(value = "enterpriseName")
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "locationID")
   protected String locationID;
   
   @JsonProperty(value = "locationType")
   protected LocationType locationType;
   
   @JsonProperty(value = "policyState")
   protected PolicyState policyState;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "sourcePgId")
   protected String sourcePgId;
   
   @JsonProperty(value = "sourcePgType")
   protected String sourcePgType;
   
   @JsonProperty(value = "sourcePort")
   protected String sourcePort;
   
   @JsonProperty(value = "sourceType")
   protected SourceType sourceType;
   
   @JsonProperty(value = "sourceValue")
   protected String sourceValue;
   
   @JsonProperty(value = "priority")
   protected Long priority;
   
   @JsonProperty(value = "protocol")
   protected String protocol;
   
   @JsonProperty(value = "associatedApplicationID")
   protected String associatedApplicationID;
   
   @JsonProperty(value = "associatedApplicationObjectID")
   protected String associatedApplicationObjectID;
   
   @JsonProperty(value = "associatedApplicationObjectType")
   protected AssociatedApplicationObjectType associatedApplicationObjectType;
   
   @JsonProperty(value = "associatedLiveEntityID")
   protected String associatedLiveEntityID;
   
   @JsonProperty(value = "stateful")
   protected Boolean stateful;
   
   @JsonProperty(value = "statsID")
   protected String statsID;
   
   @JsonProperty(value = "statsLoggingEnabled")
   protected Boolean statsLoggingEnabled;
   
   @JsonProperty(value = "etherType")
   protected String etherType;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public DomainFIPAclTemplateEntry() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   @JsonIgnore
   public String getACLTemplateName() {
      return ACLTemplateName;
   }

   @JsonIgnore
   public void setACLTemplateName(String value) { 
      this.ACLTemplateName = value;
   }
   @JsonIgnore
   public String getICMPCode() {
      return ICMPCode;
   }

   @JsonIgnore
   public void setICMPCode(String value) { 
      this.ICMPCode = value;
   }
   @JsonIgnore
   public String getICMPType() {
      return ICMPType;
   }

   @JsonIgnore
   public void setICMPType(String value) { 
      this.ICMPType = value;
   }
   @JsonIgnore
   public String getDSCP() {
      return DSCP;
   }

   @JsonIgnore
   public void setDSCP(String value) { 
      this.DSCP = value;
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
   public Action getAction() {
      return action;
   }

   @JsonIgnore
   public void setAction(Action value) { 
      this.action = value;
   }
   @JsonIgnore
   public Object getActionDetails() {
      return actionDetails;
   }

   @JsonIgnore
   public void setActionDetails(Object value) { 
      this.actionDetails = value;
   }
   @JsonIgnore
   public String getAddressOverride() {
      return addressOverride;
   }

   @JsonIgnore
   public void setAddressOverride(String value) { 
      this.addressOverride = value;
   }
   @JsonIgnore
   public Boolean getReflexive() {
      return reflexive;
   }

   @JsonIgnore
   public void setReflexive(Boolean value) { 
      this.reflexive = value;
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
   public String getDestPgId() {
      return destPgId;
   }

   @JsonIgnore
   public void setDestPgId(String value) { 
      this.destPgId = value;
   }
   @JsonIgnore
   public String getDestPgType() {
      return destPgType;
   }

   @JsonIgnore
   public void setDestPgType(String value) { 
      this.destPgType = value;
   }
   @JsonIgnore
   public String getDestinationPort() {
      return destinationPort;
   }

   @JsonIgnore
   public void setDestinationPort(String value) { 
      this.destinationPort = value;
   }
   @JsonIgnore
   public DestinationType getDestinationType() {
      return destinationType;
   }

   @JsonIgnore
   public void setDestinationType(DestinationType value) { 
      this.destinationType = value;
   }
   @JsonIgnore
   public String getDestinationValue() {
      return destinationValue;
   }

   @JsonIgnore
   public void setDestinationValue(String value) { 
      this.destinationValue = value;
   }
   @JsonIgnore
   public String getNetworkID() {
      return networkID;
   }

   @JsonIgnore
   public void setNetworkID(String value) { 
      this.networkID = value;
   }
   @JsonIgnore
   public NetworkType getNetworkType() {
      return networkType;
   }

   @JsonIgnore
   public void setNetworkType(NetworkType value) { 
      this.networkType = value;
   }
   @JsonIgnore
   public String getMirrorDestinationID() {
      return mirrorDestinationID;
   }

   @JsonIgnore
   public void setMirrorDestinationID(String value) { 
      this.mirrorDestinationID = value;
   }
   @JsonIgnore
   public Boolean getFlowLoggingEnabled() {
      return flowLoggingEnabled;
   }

   @JsonIgnore
   public void setFlowLoggingEnabled(Boolean value) { 
      this.flowLoggingEnabled = value;
   }
   @JsonIgnore
   public String getEnterpriseName() {
      return enterpriseName;
   }

   @JsonIgnore
   public void setEnterpriseName(String value) { 
      this.enterpriseName = value;
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
   public String getLocationID() {
      return locationID;
   }

   @JsonIgnore
   public void setLocationID(String value) { 
      this.locationID = value;
   }
   @JsonIgnore
   public LocationType getLocationType() {
      return locationType;
   }

   @JsonIgnore
   public void setLocationType(LocationType value) { 
      this.locationType = value;
   }
   @JsonIgnore
   public PolicyState getPolicyState() {
      return policyState;
   }

   @JsonIgnore
   public void setPolicyState(PolicyState value) { 
      this.policyState = value;
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
   public String getSourcePgId() {
      return sourcePgId;
   }

   @JsonIgnore
   public void setSourcePgId(String value) { 
      this.sourcePgId = value;
   }
   @JsonIgnore
   public String getSourcePgType() {
      return sourcePgType;
   }

   @JsonIgnore
   public void setSourcePgType(String value) { 
      this.sourcePgType = value;
   }
   @JsonIgnore
   public String getSourcePort() {
      return sourcePort;
   }

   @JsonIgnore
   public void setSourcePort(String value) { 
      this.sourcePort = value;
   }
   @JsonIgnore
   public SourceType getSourceType() {
      return sourceType;
   }

   @JsonIgnore
   public void setSourceType(SourceType value) { 
      this.sourceType = value;
   }
   @JsonIgnore
   public String getSourceValue() {
      return sourceValue;
   }

   @JsonIgnore
   public void setSourceValue(String value) { 
      this.sourceValue = value;
   }
   @JsonIgnore
   public Long getPriority() {
      return priority;
   }

   @JsonIgnore
   public void setPriority(Long value) { 
      this.priority = value;
   }
   @JsonIgnore
   public String getProtocol() {
      return protocol;
   }

   @JsonIgnore
   public void setProtocol(String value) { 
      this.protocol = value;
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
   public String getAssociatedLiveEntityID() {
      return associatedLiveEntityID;
   }

   @JsonIgnore
   public void setAssociatedLiveEntityID(String value) { 
      this.associatedLiveEntityID = value;
   }
   @JsonIgnore
   public Boolean getStateful() {
      return stateful;
   }

   @JsonIgnore
   public void setStateful(Boolean value) { 
      this.stateful = value;
   }
   @JsonIgnore
   public String getStatsID() {
      return statsID;
   }

   @JsonIgnore
   public void setStatsID(String value) { 
      this.statsID = value;
   }
   @JsonIgnore
   public Boolean getStatsLoggingEnabled() {
      return statsLoggingEnabled;
   }

   @JsonIgnore
   public void setStatsLoggingEnabled(Boolean value) { 
      this.statsLoggingEnabled = value;
   }
   @JsonIgnore
   public String getEtherType() {
      return etherType;
   }

   @JsonIgnore
   public void setEtherType(String value) { 
      this.etherType = value;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "DomainFIPAclTemplateEntry [" + "ACLTemplateName=" + ACLTemplateName + ", ICMPCode=" + ICMPCode + ", ICMPType=" + ICMPType + ", DSCP=" + DSCP + ", lastUpdatedBy=" + lastUpdatedBy + ", action=" + action + ", actionDetails=" + actionDetails + ", addressOverride=" + addressOverride + ", reflexive=" + reflexive + ", description=" + description + ", destPgId=" + destPgId + ", destPgType=" + destPgType + ", destinationPort=" + destinationPort + ", destinationType=" + destinationType + ", destinationValue=" + destinationValue + ", networkID=" + networkID + ", networkType=" + networkType + ", mirrorDestinationID=" + mirrorDestinationID + ", flowLoggingEnabled=" + flowLoggingEnabled + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", locationID=" + locationID + ", locationType=" + locationType + ", policyState=" + policyState + ", domainName=" + domainName + ", sourcePgId=" + sourcePgId + ", sourcePgType=" + sourcePgType + ", sourcePort=" + sourcePort + ", sourceType=" + sourceType + ", sourceValue=" + sourceValue + ", priority=" + priority + ", protocol=" + protocol + ", associatedApplicationID=" + associatedApplicationID + ", associatedApplicationObjectID=" + associatedApplicationObjectID + ", associatedApplicationObjectType=" + associatedApplicationObjectType + ", associatedLiveEntityID=" + associatedLiveEntityID + ", stateful=" + stateful + ", statsID=" + statsID + ", statsLoggingEnabled=" + statsLoggingEnabled + ", etherType=" + etherType + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}