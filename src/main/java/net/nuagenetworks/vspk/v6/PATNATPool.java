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


import net.nuagenetworks.vspk.v6.fetchers.AddressMapsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.BulkStatisticsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NATMapEntriesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsPoliciesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "patnatpool", resourceName = "patnatpools")
public class PATNATPool extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EIPType { DUALSTACK, IPV4, IPV6 };
   public enum EAssociatedGatewayType { AUTO_DISC_GATEWAY, GATEWAY, IKE_GATEWAY, NSGATEWAY };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };

   
   @JsonProperty(value = "IPType")
   
   protected EIPType IPType;
   
   @JsonProperty(value = "addressRange")
   
   protected String addressRange;
   
   @JsonProperty(value = "associatedGatewayId")
   
   protected String associatedGatewayId;
   
   @JsonProperty(value = "associatedGatewayType")
   
   protected EAssociatedGatewayType associatedGatewayType;
   
   @JsonProperty(value = "associatedSubnetId")
   
   protected String associatedSubnetId;
   
   @JsonProperty(value = "associatedVlanId")
   
   protected String associatedVlanId;
   
   @JsonProperty(value = "defaultPATIP")
   
   protected String defaultPATIP;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "dynamicSourceEnabled")
   
   protected Boolean dynamicSourceEnabled;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "endAddressRange")
   
   protected String endAddressRange;
   
   @JsonProperty(value = "endSourceAddress")
   
   protected String endSourceAddress;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "permittedAction")
   
   protected EPermittedAction permittedAction;
   
   @JsonProperty(value = "startAddressRange")
   
   protected String startAddressRange;
   
   @JsonProperty(value = "startSourceAddress")
   
   protected String startSourceAddress;
   

   
   @JsonIgnore
   private AddressMapsFetcher addressMaps;
   
   @JsonIgnore
   private BulkStatisticsFetcher bulkStatistics;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NATMapEntriesFetcher nATMapEntries;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   

   public PATNATPool() {
      
      addressMaps = new AddressMapsFetcher(this);
      
      bulkStatistics = new BulkStatisticsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nATMapEntries = new NATMapEntriesFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
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
   public String getAddressRange() {
      return addressRange;
   }

   @JsonIgnore
   public void setAddressRange(String value) { 
      this.addressRange = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGatewayId() {
      return associatedGatewayId;
   }

   @JsonIgnore
   public void setAssociatedGatewayId(String value) { 
      this.associatedGatewayId = value;
   }
   
   
   @JsonIgnore
   public EAssociatedGatewayType getAssociatedGatewayType() {
      return associatedGatewayType;
   }

   @JsonIgnore
   public void setAssociatedGatewayType(EAssociatedGatewayType value) { 
      this.associatedGatewayType = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedSubnetId() {
      return associatedSubnetId;
   }

   @JsonIgnore
   public void setAssociatedSubnetId(String value) { 
      this.associatedSubnetId = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedVlanId() {
      return associatedVlanId;
   }

   @JsonIgnore
   public void setAssociatedVlanId(String value) { 
      this.associatedVlanId = value;
   }
   
   
   @JsonIgnore
   public String getDefaultPATIP() {
      return defaultPATIP;
   }

   @JsonIgnore
   public void setDefaultPATIP(String value) { 
      this.defaultPATIP = value;
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
   public Boolean getDynamicSourceEnabled() {
      return dynamicSourceEnabled;
   }

   @JsonIgnore
   public void setDynamicSourceEnabled(Boolean value) { 
      this.dynamicSourceEnabled = value;
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
   public String getEndAddressRange() {
      return endAddressRange;
   }

   @JsonIgnore
   public void setEndAddressRange(String value) { 
      this.endAddressRange = value;
   }
   
   
   @JsonIgnore
   public String getEndSourceAddress() {
      return endSourceAddress;
   }

   @JsonIgnore
   public void setEndSourceAddress(String value) { 
      this.endSourceAddress = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   
   
   @JsonIgnore
   public EPermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(EPermittedAction value) { 
      this.permittedAction = value;
   }
   
   
   @JsonIgnore
   public String getStartAddressRange() {
      return startAddressRange;
   }

   @JsonIgnore
   public void setStartAddressRange(String value) { 
      this.startAddressRange = value;
   }
   
   
   @JsonIgnore
   public String getStartSourceAddress() {
      return startSourceAddress;
   }

   @JsonIgnore
   public void setStartSourceAddress(String value) { 
      this.startSourceAddress = value;
   }
   

   
   @JsonIgnore
   public AddressMapsFetcher getAddressMaps() {
      return addressMaps;
   }
   
   @JsonIgnore
   public BulkStatisticsFetcher getBulkStatistics() {
      return bulkStatistics;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
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
   public NATMapEntriesFetcher getNATMapEntries() {
      return nATMapEntries;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   @JsonIgnore
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   

   public String toString() {
      return "PATNATPool [" + "IPType=" + IPType + ", addressRange=" + addressRange + ", associatedGatewayId=" + associatedGatewayId + ", associatedGatewayType=" + associatedGatewayType + ", associatedSubnetId=" + associatedSubnetId + ", associatedVlanId=" + associatedVlanId + ", defaultPATIP=" + defaultPATIP + ", description=" + description + ", dynamicSourceEnabled=" + dynamicSourceEnabled + ", embeddedMetadata=" + embeddedMetadata + ", endAddressRange=" + endAddressRange + ", endSourceAddress=" + endSourceAddress + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", startAddressRange=" + startAddressRange + ", startSourceAddress=" + startSourceAddress + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}