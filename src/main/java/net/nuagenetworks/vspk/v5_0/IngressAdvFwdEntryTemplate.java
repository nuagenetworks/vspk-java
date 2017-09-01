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


import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ingressadvfwdentrytemplate", resourceName = "ingressadvfwdentrytemplates")
public class IngressAdvFwdEntryTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum FCOverride { A, B, C, D, E, F, G, H, NONE };
   public enum Action { DROP, FORWARD, REDIRECT };
   public enum AppType { ALL, APPLICATION, NONE };
   public enum AssociatedTrafficType { L4_SERVICE, L4_SERVICE_GROUP };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum FailsafeDatapath { FAIL_TO_BLOCK, FAIL_TO_WIRE };
   public enum LocationType { ANY, PGEXPRESSION, POLICYGROUP, REDIRECTIONTARGET, SUBNET, VPORTTAG, ZONE };
   public enum NetworkType { ANY, ENDPOINT_DOMAIN, ENDPOINT_SUBNET, ENDPOINT_ZONE, ENTERPRISE_NETWORK, INTERNET_POLICYGROUP, NETWORK_MACRO_GROUP, PGEXPRESSION, POLICYGROUP, PUBLIC_NETWORK, SUBNET, UNDERLAY_INTERNET_POLICYGROUP, ZONE };
   public enum PolicyState { DRAFT, LIVE };
   public enum RedirectRewriteType { VLAN };
   public enum UplinkPreference { DEFAULT, PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY, SYMMETRIC };

   
   @JsonProperty(value = "ACLTemplateName")
   protected String ACLTemplateName;
   
   @JsonProperty(value = "DSCP")
   protected String DSCP;
   
   @JsonProperty(value = "FCOverride")
   protected FCOverride FCOverride;
   
   @JsonProperty(value = "ICMPCode")
   protected String ICMPCode;
   
   @JsonProperty(value = "ICMPType")
   protected String ICMPType;
   
   @JsonProperty(value = "IPv6AddressOverride")
   protected String IPv6AddressOverride;
   
   @JsonProperty(value = "action")
   protected Action action;
   
   @JsonProperty(value = "addressOverride")
   protected String addressOverride;
   
   @JsonProperty(value = "appType")
   protected AppType appType;
   
   @JsonProperty(value = "associatedApplicationID")
   protected String associatedApplicationID;
   
   @JsonProperty(value = "associatedLiveEntityID")
   protected String associatedLiveEntityID;
   
   @JsonProperty(value = "associatedTrafficType")
   protected AssociatedTrafficType associatedTrafficType;
   
   @JsonProperty(value = "associatedTrafficTypeID")
   protected String associatedTrafficTypeID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "destinationPort")
   protected String destinationPort;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "enterpriseName")
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "etherType")
   protected String etherType;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "failsafeDatapath")
   protected FailsafeDatapath failsafeDatapath;
   
   @JsonProperty(value = "flowLoggingEnabled")
   protected Boolean flowLoggingEnabled;
   
   @JsonProperty(value = "isSLAAware")
   protected Boolean isSLAAware;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "locationID")
   protected String locationID;
   
   @JsonProperty(value = "locationType")
   protected LocationType locationType;
   
   @JsonProperty(value = "mirrorDestinationID")
   protected String mirrorDestinationID;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "networkID")
   protected String networkID;
   
   @JsonProperty(value = "networkType")
   protected NetworkType networkType;
   
   @JsonProperty(value = "policyState")
   protected PolicyState policyState;
   
   @JsonProperty(value = "priority")
   protected Long priority;
   
   @JsonProperty(value = "protocol")
   protected String protocol;
   
   @JsonProperty(value = "redirectRewriteType")
   protected RedirectRewriteType redirectRewriteType;
   
   @JsonProperty(value = "redirectRewriteValue")
   protected String redirectRewriteValue;
   
   @JsonProperty(value = "redirectVPortTagID")
   protected String redirectVPortTagID;
   
   @JsonProperty(value = "sourcePort")
   protected String sourcePort;
   
   @JsonProperty(value = "statsID")
   protected String statsID;
   
   @JsonProperty(value = "statsLoggingEnabled")
   protected Boolean statsLoggingEnabled;
   
   @JsonProperty(value = "uplinkPreference")
   protected UplinkPreference uplinkPreference;
   
   @JsonProperty(value = "vlanRange")
   protected String vlanRange;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   

   public IngressAdvFwdEntryTemplate() {
      protocol = "6";
      etherType = "0x0800";
      DSCP = "*";
      locationType = LocationType.ANY;
      action = Action.FORWARD;
      networkType = NetworkType.ANY;
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
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
   public FCOverride getFCOverride() {
      return FCOverride;
   }

   @JsonIgnore
   public void setFCOverride(FCOverride value) { 
      this.FCOverride = value;
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
   public Action getAction() {
      return action;
   }

   @JsonIgnore
   public void setAction(Action value) { 
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
   public AppType getAppType() {
      return appType;
   }

   @JsonIgnore
   public void setAppType(AppType value) { 
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
   public String getAssociatedLiveEntityID() {
      return associatedLiveEntityID;
   }

   @JsonIgnore
   public void setAssociatedLiveEntityID(String value) { 
      this.associatedLiveEntityID = value;
   }
   @JsonIgnore
   public AssociatedTrafficType getAssociatedTrafficType() {
      return associatedTrafficType;
   }

   @JsonIgnore
   public void setAssociatedTrafficType(AssociatedTrafficType value) { 
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
   public FailsafeDatapath getFailsafeDatapath() {
      return failsafeDatapath;
   }

   @JsonIgnore
   public void setFailsafeDatapath(FailsafeDatapath value) { 
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
   public String getMirrorDestinationID() {
      return mirrorDestinationID;
   }

   @JsonIgnore
   public void setMirrorDestinationID(String value) { 
      this.mirrorDestinationID = value;
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
   public PolicyState getPolicyState() {
      return policyState;
   }

   @JsonIgnore
   public void setPolicyState(PolicyState value) { 
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
   public RedirectRewriteType getRedirectRewriteType() {
      return redirectRewriteType;
   }

   @JsonIgnore
   public void setRedirectRewriteType(RedirectRewriteType value) { 
      this.redirectRewriteType = value;
   }
   @JsonIgnore
   public String getRedirectRewriteValue() {
      return redirectRewriteValue;
   }

   @JsonIgnore
   public void setRedirectRewriteValue(String value) { 
      this.redirectRewriteValue = value;
   }
   @JsonIgnore
   public String getRedirectVPortTagID() {
      return redirectVPortTagID;
   }

   @JsonIgnore
   public void setRedirectVPortTagID(String value) { 
      this.redirectVPortTagID = value;
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
   public UplinkPreference getUplinkPreference() {
      return uplinkPreference;
   }

   @JsonIgnore
   public void setUplinkPreference(UplinkPreference value) { 
      this.uplinkPreference = value;
   }
   @JsonIgnore
   public String getVlanRange() {
      return vlanRange;
   }

   @JsonIgnore
   public void setVlanRange(String value) { 
      this.vlanRange = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
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
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   

   public String toString() {
      return "IngressAdvFwdEntryTemplate [" + "ACLTemplateName=" + ACLTemplateName + ", DSCP=" + DSCP + ", FCOverride=" + FCOverride + ", ICMPCode=" + ICMPCode + ", ICMPType=" + ICMPType + ", IPv6AddressOverride=" + IPv6AddressOverride + ", action=" + action + ", addressOverride=" + addressOverride + ", appType=" + appType + ", associatedApplicationID=" + associatedApplicationID + ", associatedLiveEntityID=" + associatedLiveEntityID + ", associatedTrafficType=" + associatedTrafficType + ", associatedTrafficTypeID=" + associatedTrafficTypeID + ", description=" + description + ", destinationPort=" + destinationPort + ", domainName=" + domainName + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", etherType=" + etherType + ", externalID=" + externalID + ", failsafeDatapath=" + failsafeDatapath + ", flowLoggingEnabled=" + flowLoggingEnabled + ", isSLAAware=" + isSLAAware + ", lastUpdatedBy=" + lastUpdatedBy + ", locationID=" + locationID + ", locationType=" + locationType + ", mirrorDestinationID=" + mirrorDestinationID + ", name=" + name + ", networkID=" + networkID + ", networkType=" + networkType + ", policyState=" + policyState + ", priority=" + priority + ", protocol=" + protocol + ", redirectRewriteType=" + redirectRewriteType + ", redirectRewriteValue=" + redirectRewriteValue + ", redirectVPortTagID=" + redirectVPortTagID + ", sourcePort=" + sourcePort + ", statsID=" + statsID + ", statsLoggingEnabled=" + statsLoggingEnabled + ", uplinkPreference=" + uplinkPreference + ", vlanRange=" + vlanRange + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}