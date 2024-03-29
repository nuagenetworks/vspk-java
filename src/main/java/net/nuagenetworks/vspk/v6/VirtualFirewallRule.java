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


import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "virtualfirewallrule", resourceName = "virtualfirewallrules")
public class VirtualFirewallRule extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAction { DROP, FORWARD };
   public enum EAppType { ALL, APPLICATION, NONE };
   public enum EAssociatedTrafficType { L4_SERVICE, L4_SERVICE_GROUP };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EFailsafeDatapath { FAIL_TO_BLOCK, FAIL_TO_WIRE };
   public enum ELocationEntityType { ENTERPRISENETWORK, NETWORKMACROGROUP, PGEXPRESSION, PGEXPRESSIONTEMPLATE, POLICYGROUP, POLICYGROUPTEMPLATE, PUBLICNETWORK, REDIRECTIONTARGET, REDIRECTIONTARGETTEMPLATE, SUBNET, SUBNETTEMPLATE, ZONE, ZONETEMPLATE };
   public enum ELocationType { ANY, ENTERPRISE_NETWORK, NETWORK_MACRO_GROUP, PGEXPRESSION, POLICYGROUP, SUBNET, UNDERLAY_INTERNET_POLICYGROUP, ZONE };
   public enum ENetworkEntityType { ENTERPRISENETWORK, NETWORKMACROGROUP, PGEXPRESSION, PGEXPRESSIONTEMPLATE, POLICYGROUP, POLICYGROUPTEMPLATE, PUBLICNETWORK, SAASAPPLICATIONGROUP, SUBNET, SUBNETTEMPLATE, ZONE, ZONETEMPLATE };
   public enum ENetworkType { ANY, ENTERPRISE_NETWORK, NETWORK_MACRO_GROUP, PGEXPRESSION, POLICYGROUP, SUBNET, UNDERLAY_INTERNET_POLICYGROUP, ZONE };
   public enum EPolicyState { DRAFT, LIVE };
   public enum ERemoteUplinkPreference { DEFAULT, PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY };
   public enum EReputationScore { HIGH_RISK, LOW_RISK, MEDIUM_RISK };
   public enum EType { L4, L7, THREAT_PREVENTION, WEB_FILTER };
   public enum EUplinkPreference { DEFAULT, PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY, SYMMETRIC };
   public enum EWebFilterType { WEB_CATEGORY, WEB_DOMAIN_NAME, WEB_DOMAIN_REPUTATION };

   
   @JsonProperty(value = "ACLTemplateName")
   
   protected String ACLTemplateName;
   
   @JsonProperty(value = "DSCP")
   
   protected String DSCP;
   
   @JsonProperty(value = "ICMPCode")
   
   protected String ICMPCode;
   
   @JsonProperty(value = "ICMPType")
   
   protected String ICMPType;
   
   @JsonProperty(value = "IPv6AddressOverride")
   
   protected String IPv6AddressOverride;
   
   @JsonProperty(value = "action")
   
   protected EAction action;
   
   @JsonProperty(value = "addressOverride")
   
   protected String addressOverride;
   
   @JsonProperty(value = "appType")
   
   protected EAppType appType;
   
   @JsonProperty(value = "associatedApplicationID")
   
   protected String associatedApplicationID;
   
   @JsonProperty(value = "associatedEgressEntryID")
   
   protected String associatedEgressEntryID;
   
   @JsonProperty(value = "associatedIngressEntryID")
   
   protected String associatedIngressEntryID;
   
   @JsonProperty(value = "associatedL7ApplicationSignatureID")
   
   protected String associatedL7ApplicationSignatureID;
   
   @JsonProperty(value = "associatedLiveEntityID")
   
   protected String associatedLiveEntityID;
   
   @JsonProperty(value = "associatedLiveTemplateID")
   
   protected String associatedLiveTemplateID;
   
   @JsonProperty(value = "associatedTrafficType")
   
   protected EAssociatedTrafficType associatedTrafficType;
   
   @JsonProperty(value = "associatedTrafficTypeID")
   
   protected String associatedTrafficTypeID;
   
   @JsonProperty(value = "creationDate")
   
   protected String creationDate;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "destinationPort")
   
   protected String destinationPort;
   
   @JsonProperty(value = "domainName")
   
   protected String domainName;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseName")
   
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "etherType")
   
   protected String etherType;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "failsafeDatapath")
   
   protected EFailsafeDatapath failsafeDatapath;
   
   @JsonProperty(value = "flowLoggingEnabled")
   
   protected Boolean flowLoggingEnabled;
   
   @JsonProperty(value = "isSLAAware")
   
   protected Boolean isSLAAware;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUpdatedDate")
   
   protected String lastUpdatedDate;
   
   @JsonProperty(value = "locationEntityType")
   
   protected ELocationEntityType locationEntityType;
   
   @JsonProperty(value = "locationID")
   
   protected String locationID;
   
   @JsonProperty(value = "locationType")
   
   protected ELocationType locationType;
   
   @JsonProperty(value = "mirrorDestinationGroupID")
   
   protected String mirrorDestinationGroupID;
   
   @JsonProperty(value = "mirrorDestinationID")
   
   protected String mirrorDestinationID;
   
   @JsonProperty(value = "networkEntityType")
   
   protected ENetworkEntityType networkEntityType;
   
   @JsonProperty(value = "networkID")
   
   protected String networkID;
   
   @JsonProperty(value = "networkType")
   
   protected ENetworkType networkType;
   
   @JsonProperty(value = "overlayMirrorDestinationID")
   
   protected String overlayMirrorDestinationID;
   
   @JsonProperty(value = "owner")
   
   protected String owner;
   
   @JsonProperty(value = "policyState")
   
   protected EPolicyState policyState;
   
   @JsonProperty(value = "priority")
   
   protected Long priority;
   
   @JsonProperty(value = "protocol")
   
   protected String protocol;
   
   @JsonProperty(value = "remoteUplinkPreference")
   
   protected ERemoteUplinkPreference remoteUplinkPreference;
   
   @JsonProperty(value = "reputationScore")
   
   protected EReputationScore reputationScore;
   
   @JsonProperty(value = "sourcePort")
   
   protected String sourcePort;
   
   @JsonProperty(value = "stateful")
   
   protected Boolean stateful;
   
   @JsonProperty(value = "statsID")
   
   protected String statsID;
   
   @JsonProperty(value = "statsLoggingEnabled")
   
   protected Boolean statsLoggingEnabled;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   
   @JsonProperty(value = "uplinkPreference")
   
   protected EUplinkPreference uplinkPreference;
   
   @JsonProperty(value = "webFilterID")
   
   protected String webFilterID;
   
   @JsonProperty(value = "webFilterStatsLoggingEnabled")
   
   protected Boolean webFilterStatsLoggingEnabled;
   
   @JsonProperty(value = "webFilterType")
   
   protected EWebFilterType webFilterType;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public VirtualFirewallRule() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
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
   public String getDSCP() {
      return DSCP;
   }

   @JsonIgnore
   public void setDSCP(String value) { 
      this.DSCP = value;
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
   public String getIPv6AddressOverride() {
      return IPv6AddressOverride;
   }

   @JsonIgnore
   public void setIPv6AddressOverride(String value) { 
      this.IPv6AddressOverride = value;
   }
   
   
   @JsonIgnore
   public EAction getAction() {
      return action;
   }

   @JsonIgnore
   public void setAction(EAction value) { 
      this.action = value;
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
   public EAppType getAppType() {
      return appType;
   }

   @JsonIgnore
   public void setAppType(EAppType value) { 
      this.appType = value;
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
   public String getAssociatedEgressEntryID() {
      return associatedEgressEntryID;
   }

   @JsonIgnore
   public void setAssociatedEgressEntryID(String value) { 
      this.associatedEgressEntryID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIngressEntryID() {
      return associatedIngressEntryID;
   }

   @JsonIgnore
   public void setAssociatedIngressEntryID(String value) { 
      this.associatedIngressEntryID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedL7ApplicationSignatureID() {
      return associatedL7ApplicationSignatureID;
   }

   @JsonIgnore
   public void setAssociatedL7ApplicationSignatureID(String value) { 
      this.associatedL7ApplicationSignatureID = value;
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
   public String getAssociatedLiveTemplateID() {
      return associatedLiveTemplateID;
   }

   @JsonIgnore
   public void setAssociatedLiveTemplateID(String value) { 
      this.associatedLiveTemplateID = value;
   }
   
   
   @JsonIgnore
   public EAssociatedTrafficType getAssociatedTrafficType() {
      return associatedTrafficType;
   }

   @JsonIgnore
   public void setAssociatedTrafficType(EAssociatedTrafficType value) { 
      this.associatedTrafficType = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedTrafficTypeID() {
      return associatedTrafficTypeID;
   }

   @JsonIgnore
   public void setAssociatedTrafficTypeID(String value) { 
      this.associatedTrafficTypeID = value;
   }
   
   
   @JsonIgnore
   public String getCreationDate() {
      return creationDate;
   }

   @JsonIgnore
   public void setCreationDate(String value) { 
      this.creationDate = value;
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
   public String getDestinationPort() {
      return destinationPort;
   }

   @JsonIgnore
   public void setDestinationPort(String value) { 
      this.destinationPort = value;
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
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
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
   public EEntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EEntityScope value) { 
      this.entityScope = value;
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
   public EFailsafeDatapath getFailsafeDatapath() {
      return failsafeDatapath;
   }

   @JsonIgnore
   public void setFailsafeDatapath(EFailsafeDatapath value) { 
      this.failsafeDatapath = value;
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
   public Boolean getIsSLAAware() {
      return isSLAAware;
   }

   @JsonIgnore
   public void setIsSLAAware(Boolean value) { 
      this.isSLAAware = value;
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
   public String getLastUpdatedDate() {
      return lastUpdatedDate;
   }

   @JsonIgnore
   public void setLastUpdatedDate(String value) { 
      this.lastUpdatedDate = value;
   }
   
   
   @JsonIgnore
   public ELocationEntityType getLocationEntityType() {
      return locationEntityType;
   }

   @JsonIgnore
   public void setLocationEntityType(ELocationEntityType value) { 
      this.locationEntityType = value;
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
   public ELocationType getLocationType() {
      return locationType;
   }

   @JsonIgnore
   public void setLocationType(ELocationType value) { 
      this.locationType = value;
   }
   
   
   @JsonIgnore
   public String getMirrorDestinationGroupID() {
      return mirrorDestinationGroupID;
   }

   @JsonIgnore
   public void setMirrorDestinationGroupID(String value) { 
      this.mirrorDestinationGroupID = value;
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
   public ENetworkEntityType getNetworkEntityType() {
      return networkEntityType;
   }

   @JsonIgnore
   public void setNetworkEntityType(ENetworkEntityType value) { 
      this.networkEntityType = value;
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
   public ENetworkType getNetworkType() {
      return networkType;
   }

   @JsonIgnore
   public void setNetworkType(ENetworkType value) { 
      this.networkType = value;
   }
   
   
   @JsonIgnore
   public String getOverlayMirrorDestinationID() {
      return overlayMirrorDestinationID;
   }

   @JsonIgnore
   public void setOverlayMirrorDestinationID(String value) { 
      this.overlayMirrorDestinationID = value;
   }
   
   
   @JsonIgnore
   public String getOwner() {
      return owner;
   }

   @JsonIgnore
   public void setOwner(String value) { 
      this.owner = value;
   }
   
   
   @JsonIgnore
   public EPolicyState getPolicyState() {
      return policyState;
   }

   @JsonIgnore
   public void setPolicyState(EPolicyState value) { 
      this.policyState = value;
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
   public ERemoteUplinkPreference getRemoteUplinkPreference() {
      return remoteUplinkPreference;
   }

   @JsonIgnore
   public void setRemoteUplinkPreference(ERemoteUplinkPreference value) { 
      this.remoteUplinkPreference = value;
   }
   
   
   @JsonIgnore
   public EReputationScore getReputationScore() {
      return reputationScore;
   }

   @JsonIgnore
   public void setReputationScore(EReputationScore value) { 
      this.reputationScore = value;
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
   public EType getType() {
      return type;
   }

   @JsonIgnore
   public void setType(EType value) { 
      this.type = value;
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
   public String getWebFilterID() {
      return webFilterID;
   }

   @JsonIgnore
   public void setWebFilterID(String value) { 
      this.webFilterID = value;
   }
   
   
   @JsonIgnore
   public Boolean getWebFilterStatsLoggingEnabled() {
      return webFilterStatsLoggingEnabled;
   }

   @JsonIgnore
   public void setWebFilterStatsLoggingEnabled(Boolean value) { 
      this.webFilterStatsLoggingEnabled = value;
   }
   
   
   @JsonIgnore
   public EWebFilterType getWebFilterType() {
      return webFilterType;
   }

   @JsonIgnore
   public void setWebFilterType(EWebFilterType value) { 
      this.webFilterType = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   

   public String toString() {
      return "VirtualFirewallRule [" + "ACLTemplateName=" + ACLTemplateName + ", DSCP=" + DSCP + ", ICMPCode=" + ICMPCode + ", ICMPType=" + ICMPType + ", IPv6AddressOverride=" + IPv6AddressOverride + ", action=" + action + ", addressOverride=" + addressOverride + ", appType=" + appType + ", associatedApplicationID=" + associatedApplicationID + ", associatedEgressEntryID=" + associatedEgressEntryID + ", associatedIngressEntryID=" + associatedIngressEntryID + ", associatedL7ApplicationSignatureID=" + associatedL7ApplicationSignatureID + ", associatedLiveEntityID=" + associatedLiveEntityID + ", associatedLiveTemplateID=" + associatedLiveTemplateID + ", associatedTrafficType=" + associatedTrafficType + ", associatedTrafficTypeID=" + associatedTrafficTypeID + ", creationDate=" + creationDate + ", description=" + description + ", destinationPort=" + destinationPort + ", domainName=" + domainName + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", etherType=" + etherType + ", externalID=" + externalID + ", failsafeDatapath=" + failsafeDatapath + ", flowLoggingEnabled=" + flowLoggingEnabled + ", isSLAAware=" + isSLAAware + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", locationEntityType=" + locationEntityType + ", locationID=" + locationID + ", locationType=" + locationType + ", mirrorDestinationGroupID=" + mirrorDestinationGroupID + ", mirrorDestinationID=" + mirrorDestinationID + ", networkEntityType=" + networkEntityType + ", networkID=" + networkID + ", networkType=" + networkType + ", overlayMirrorDestinationID=" + overlayMirrorDestinationID + ", owner=" + owner + ", policyState=" + policyState + ", priority=" + priority + ", protocol=" + protocol + ", remoteUplinkPreference=" + remoteUplinkPreference + ", reputationScore=" + reputationScore + ", sourcePort=" + sourcePort + ", stateful=" + stateful + ", statsID=" + statsID + ", statsLoggingEnabled=" + statsLoggingEnabled + ", type=" + type + ", uplinkPreference=" + uplinkPreference + ", webFilterID=" + webFilterID + ", webFilterStatsLoggingEnabled=" + webFilterStatsLoggingEnabled + ", webFilterType=" + webFilterType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}