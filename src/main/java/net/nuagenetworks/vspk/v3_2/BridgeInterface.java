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

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v3_2.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.RedirectionTargetsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.PolicyDecisionsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.PolicyGroupsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "bridgeinterface", resourceName = "bridgeinterfaces")
public class BridgeInterface extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum AttachedNetworkType { L2DOMAIN, SUBNET };

   
   @JsonProperty(value = "VPortID")
   protected String VPortID;
   
   @JsonProperty(value = "VPortName")
   protected String VPortName;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "networkName")
   protected String networkName;
   
   @JsonProperty(value = "tierID")
   protected String tierID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "policyDecisionID")
   protected String policyDecisionID;
   
   @JsonProperty(value = "domainID")
   protected String domainID;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "zoneID")
   protected String zoneID;
   
   @JsonProperty(value = "zoneName")
   protected String zoneName;
   
   @JsonProperty(value = "associatedFloatingIPAddress")
   protected String associatedFloatingIPAddress;
   
   @JsonProperty(value = "attachedNetworkID")
   protected String attachedNetworkID;
   
   @JsonProperty(value = "attachedNetworkType")
   protected AttachedNetworkType attachedNetworkType;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private PolicyDecisionsFetcher policyDecisions;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public BridgeInterface() {
      
      tCAs = new TCAsFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      policyDecisions = new PolicyDecisionsFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public String getVPortID() {
      return VPortID;
   }

   public void setVPortID(String value) { 
      this.VPortID = value;
   }
   public String getVPortName() {
      return VPortName;
   }

   public void setVPortName(String value) { 
      this.VPortName = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getGateway() {
      return gateway;
   }

   public void setGateway(String value) { 
      this.gateway = value;
   }
   public String getNetmask() {
      return netmask;
   }

   public void setNetmask(String value) { 
      this.netmask = value;
   }
   public String getNetworkName() {
      return networkName;
   }

   public void setNetworkName(String value) { 
      this.networkName = value;
   }
   public String getTierID() {
      return tierID;
   }

   public void setTierID(String value) { 
      this.tierID = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getPolicyDecisionID() {
      return policyDecisionID;
   }

   public void setPolicyDecisionID(String value) { 
      this.policyDecisionID = value;
   }
   public String getDomainID() {
      return domainID;
   }

   public void setDomainID(String value) { 
      this.domainID = value;
   }
   public String getDomainName() {
      return domainName;
   }

   public void setDomainName(String value) { 
      this.domainName = value;
   }
   public String getZoneID() {
      return zoneID;
   }

   public void setZoneID(String value) { 
      this.zoneID = value;
   }
   public String getZoneName() {
      return zoneName;
   }

   public void setZoneName(String value) { 
      this.zoneName = value;
   }
   public String getAssociatedFloatingIPAddress() {
      return associatedFloatingIPAddress;
   }

   public void setAssociatedFloatingIPAddress(String value) { 
      this.associatedFloatingIPAddress = value;
   }
   public String getAttachedNetworkID() {
      return attachedNetworkID;
   }

   public void setAttachedNetworkID(String value) { 
      this.attachedNetworkID = value;
   }
   public AttachedNetworkType getAttachedNetworkType() {
      return attachedNetworkType;
   }

   public void setAttachedNetworkType(AttachedNetworkType value) { 
      this.attachedNetworkType = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   

   
   @JsonIgnore
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   @JsonIgnore
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public PolicyDecisionsFetcher getPolicyDecisions() {
      return policyDecisions;
   }
   
   @JsonIgnore
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
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
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "BridgeInterface [" + "VPortID=" + VPortID + ", VPortName=" + VPortName + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", gateway=" + gateway + ", netmask=" + netmask + ", networkName=" + networkName + ", tierID=" + tierID + ", entityScope=" + entityScope + ", policyDecisionID=" + policyDecisionID + ", domainID=" + domainID + ", domainName=" + domainName + ", zoneID=" + zoneID + ", zoneName=" + zoneName + ", associatedFloatingIPAddress=" + associatedFloatingIPAddress + ", attachedNetworkID=" + attachedNetworkID + ", attachedNetworkType=" + attachedNetworkType + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}