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
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "egressdomainfloatingipaclentrytemplate", resourceName = "egressdomainfloatingipaclentrytemplates")
public class DomainFIPAclTemplateEntry extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum Action { DROP, FORWARD, REDIRECT };
   public enum DestinationType { NETWORK, NETWORKPOLICYGROUP, POLICYGROUP };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum LocationType { ANY, POLICYGROUP, REDIRECTIONTARGET, SUBNET, VPORTTAG, ZONE };
   public enum NetworkType { ANY, ENDPOINT_DOMAIN, ENDPOINT_SUBNET, ENDPOINT_ZONE, ENTERPRISE_NETWORK, INTERNET_POLICYGROUP, NETWORK_MACRO_GROUP, POLICYGROUP, PUBLIC_NETWORK, SUBNET, ZONE };
   public enum PolicyState { DRAFT, LIVE };
   public enum SourceType { NETWORK, NETWORKPOLICYGROUP, POLICYGROUP };

   
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
   protected Action action;
   
   @JsonProperty(value = "actionDetails")
   protected Object actionDetails;
   
   @JsonProperty(value = "addressOverride")
   protected String addressOverride;
   
   @JsonProperty(value = "associatedLiveEntityID")
   protected String associatedLiveEntityID;
   
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
   
   @JsonProperty(value = "flowLoggingEnabled")
   protected Boolean flowLoggingEnabled;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "locationID")
   protected String locationID;
   
   @JsonProperty(value = "locationType")
   protected LocationType locationType;
   
   @JsonProperty(value = "mirrorDestinationID")
   protected String mirrorDestinationID;
   
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
   
   @JsonProperty(value = "stateful")
   protected Boolean stateful;
   
   @JsonProperty(value = "statsID")
   protected String statsID;
   
   @JsonProperty(value = "statsLoggingEnabled")
   protected Boolean statsLoggingEnabled;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public DomainFIPAclTemplateEntry() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
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
   public String getAssociatedLiveEntityID() {
      return associatedLiveEntityID;
   }

   @JsonIgnore
   public void setAssociatedLiveEntityID(String value) { 
      this.associatedLiveEntityID = value;
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
   public Boolean getFlowLoggingEnabled() {
      return flowLoggingEnabled;
   }

   @JsonIgnore
   public void setFlowLoggingEnabled(Boolean value) { 
      this.flowLoggingEnabled = value;
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
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "DomainFIPAclTemplateEntry [" + "ACLTemplateName=" + ACLTemplateName + ", DSCP=" + DSCP + ", ICMPCode=" + ICMPCode + ", ICMPType=" + ICMPType + ", IPv6AddressOverride=" + IPv6AddressOverride + ", action=" + action + ", actionDetails=" + actionDetails + ", addressOverride=" + addressOverride + ", associatedLiveEntityID=" + associatedLiveEntityID + ", description=" + description + ", destPgId=" + destPgId + ", destPgType=" + destPgType + ", destinationPort=" + destinationPort + ", destinationType=" + destinationType + ", destinationValue=" + destinationValue + ", domainName=" + domainName + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", etherType=" + etherType + ", externalID=" + externalID + ", flowLoggingEnabled=" + flowLoggingEnabled + ", lastUpdatedBy=" + lastUpdatedBy + ", locationID=" + locationID + ", locationType=" + locationType + ", mirrorDestinationID=" + mirrorDestinationID + ", networkID=" + networkID + ", networkType=" + networkType + ", policyState=" + policyState + ", priority=" + priority + ", protocol=" + protocol + ", sourcePgId=" + sourcePgId + ", sourcePgType=" + sourcePgType + ", sourcePort=" + sourcePort + ", sourceType=" + sourceType + ", sourceValue=" + sourceValue + ", stateful=" + stateful + ", statsID=" + statsID + ", statsLoggingEnabled=" + statsLoggingEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}