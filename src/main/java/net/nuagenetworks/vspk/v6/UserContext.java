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
@RestEntity(restName = "usercontext", resourceName = "usercontexts")
public class UserContext extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ESystemAvatarType { BASE64, COMPUTEDURL, URL };

   
   @JsonProperty(value = "AARFlowStatsInterval")
   
   protected Long AARFlowStatsInterval;
   
   @JsonProperty(value = "AARProbeStatsInterval")
   
   protected Long AARProbeStatsInterval;
   
   @JsonProperty(value = "VSSFeatureEnabled")
   
   protected Boolean VSSFeatureEnabled;
   
   @JsonProperty(value = "VSSStatsInterval")
   
   protected Long VSSStatsInterval;
   
   @JsonProperty(value = "allowEnterpriseAvatarOnNSG")
   
   protected Boolean allowEnterpriseAvatarOnNSG;
   
   @JsonProperty(value = "creationDate")
   
   protected String creationDate;
   
   @JsonProperty(value = "deniedFlowCollectionEnabled")
   
   protected Boolean deniedFlowCollectionEnabled;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enhancedSecurityEnabled")
   
   protected Boolean enhancedSecurityEnabled;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "explicitACLMatchingEnabled")
   
   protected Boolean explicitACLMatchingEnabled;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "flowCollectionEnabled")
   
   protected Boolean flowCollectionEnabled;
   
   @JsonProperty(value = "globalNetworkMacroGroupsEnabled")
   
   protected Boolean globalNetworkMacroGroupsEnabled;
   
   @JsonProperty(value = "googleMapsAPIKey")
   
   protected String googleMapsAPIKey;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUpdatedDate")
   
   protected String lastUpdatedDate;
   
   @JsonProperty(value = "maintenanceModeEnabled")
   
   protected Boolean maintenanceModeEnabled;
   
   @JsonProperty(value = "owner")
   
   protected String owner;
   
   @JsonProperty(value = "pageSize")
   
   protected Long pageSize;
   
   @JsonProperty(value = "rbacEnabled")
   
   protected Boolean rbacEnabled;
   
   @JsonProperty(value = "statisticsEnabled")
   
   protected Boolean statisticsEnabled;
   
   @JsonProperty(value = "statsDatabaseProxy")
   
   protected String statsDatabaseProxy;
   
   @JsonProperty(value = "statsTSDBServerAddress")
   
   protected String statsTSDBServerAddress;
   
   @JsonProperty(value = "systemAvatarData")
   
   protected String systemAvatarData;
   
   @JsonProperty(value = "systemAvatarType")
   
   protected ESystemAvatarType systemAvatarType;
   
   @JsonProperty(value = "threatIntelligenceEnabled")
   
   protected Boolean threatIntelligenceEnabled;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public UserContext() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Long getAARFlowStatsInterval() {
      return AARFlowStatsInterval;
   }

   @JsonIgnore
   public void setAARFlowStatsInterval(Long value) { 
      this.AARFlowStatsInterval = value;
   }
   
   
   @JsonIgnore
   public Long getAARProbeStatsInterval() {
      return AARProbeStatsInterval;
   }

   @JsonIgnore
   public void setAARProbeStatsInterval(Long value) { 
      this.AARProbeStatsInterval = value;
   }
   
   
   @JsonIgnore
   public Boolean getVSSFeatureEnabled() {
      return VSSFeatureEnabled;
   }

   @JsonIgnore
   public void setVSSFeatureEnabled(Boolean value) { 
      this.VSSFeatureEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getVSSStatsInterval() {
      return VSSStatsInterval;
   }

   @JsonIgnore
   public void setVSSStatsInterval(Long value) { 
      this.VSSStatsInterval = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowEnterpriseAvatarOnNSG() {
      return allowEnterpriseAvatarOnNSG;
   }

   @JsonIgnore
   public void setAllowEnterpriseAvatarOnNSG(Boolean value) { 
      this.allowEnterpriseAvatarOnNSG = value;
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
   public Boolean getDeniedFlowCollectionEnabled() {
      return deniedFlowCollectionEnabled;
   }

   @JsonIgnore
   public void setDeniedFlowCollectionEnabled(Boolean value) { 
      this.deniedFlowCollectionEnabled = value;
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
   public Boolean getEnhancedSecurityEnabled() {
      return enhancedSecurityEnabled;
   }

   @JsonIgnore
   public void setEnhancedSecurityEnabled(Boolean value) { 
      this.enhancedSecurityEnabled = value;
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
   public Boolean getExplicitACLMatchingEnabled() {
      return explicitACLMatchingEnabled;
   }

   @JsonIgnore
   public void setExplicitACLMatchingEnabled(Boolean value) { 
      this.explicitACLMatchingEnabled = value;
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
   public Boolean getFlowCollectionEnabled() {
      return flowCollectionEnabled;
   }

   @JsonIgnore
   public void setFlowCollectionEnabled(Boolean value) { 
      this.flowCollectionEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getGlobalNetworkMacroGroupsEnabled() {
      return globalNetworkMacroGroupsEnabled;
   }

   @JsonIgnore
   public void setGlobalNetworkMacroGroupsEnabled(Boolean value) { 
      this.globalNetworkMacroGroupsEnabled = value;
   }
   
   
   @JsonIgnore
   public String getGoogleMapsAPIKey() {
      return googleMapsAPIKey;
   }

   @JsonIgnore
   public void setGoogleMapsAPIKey(String value) { 
      this.googleMapsAPIKey = value;
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
   public Boolean getMaintenanceModeEnabled() {
      return maintenanceModeEnabled;
   }

   @JsonIgnore
   public void setMaintenanceModeEnabled(Boolean value) { 
      this.maintenanceModeEnabled = value;
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
   public Long getPageSize() {
      return pageSize;
   }

   @JsonIgnore
   public void setPageSize(Long value) { 
      this.pageSize = value;
   }
   
   
   @JsonIgnore
   public Boolean getRbacEnabled() {
      return rbacEnabled;
   }

   @JsonIgnore
   public void setRbacEnabled(Boolean value) { 
      this.rbacEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getStatisticsEnabled() {
      return statisticsEnabled;
   }

   @JsonIgnore
   public void setStatisticsEnabled(Boolean value) { 
      this.statisticsEnabled = value;
   }
   
   
   @JsonIgnore
   public String getStatsDatabaseProxy() {
      return statsDatabaseProxy;
   }

   @JsonIgnore
   public void setStatsDatabaseProxy(String value) { 
      this.statsDatabaseProxy = value;
   }
   
   
   @JsonIgnore
   public String getStatsTSDBServerAddress() {
      return statsTSDBServerAddress;
   }

   @JsonIgnore
   public void setStatsTSDBServerAddress(String value) { 
      this.statsTSDBServerAddress = value;
   }
   
   
   @JsonIgnore
   public String getSystemAvatarData() {
      return systemAvatarData;
   }

   @JsonIgnore
   public void setSystemAvatarData(String value) { 
      this.systemAvatarData = value;
   }
   
   
   @JsonIgnore
   public ESystemAvatarType getSystemAvatarType() {
      return systemAvatarType;
   }

   @JsonIgnore
   public void setSystemAvatarType(ESystemAvatarType value) { 
      this.systemAvatarType = value;
   }
   
   
   @JsonIgnore
   public Boolean getThreatIntelligenceEnabled() {
      return threatIntelligenceEnabled;
   }

   @JsonIgnore
   public void setThreatIntelligenceEnabled(Boolean value) { 
      this.threatIntelligenceEnabled = value;
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
      return "UserContext [" + "AARFlowStatsInterval=" + AARFlowStatsInterval + ", AARProbeStatsInterval=" + AARProbeStatsInterval + ", VSSFeatureEnabled=" + VSSFeatureEnabled + ", VSSStatsInterval=" + VSSStatsInterval + ", allowEnterpriseAvatarOnNSG=" + allowEnterpriseAvatarOnNSG + ", creationDate=" + creationDate + ", deniedFlowCollectionEnabled=" + deniedFlowCollectionEnabled + ", embeddedMetadata=" + embeddedMetadata + ", enhancedSecurityEnabled=" + enhancedSecurityEnabled + ", entityScope=" + entityScope + ", explicitACLMatchingEnabled=" + explicitACLMatchingEnabled + ", externalID=" + externalID + ", flowCollectionEnabled=" + flowCollectionEnabled + ", globalNetworkMacroGroupsEnabled=" + globalNetworkMacroGroupsEnabled + ", googleMapsAPIKey=" + googleMapsAPIKey + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", maintenanceModeEnabled=" + maintenanceModeEnabled + ", owner=" + owner + ", pageSize=" + pageSize + ", rbacEnabled=" + rbacEnabled + ", statisticsEnabled=" + statisticsEnabled + ", statsDatabaseProxy=" + statsDatabaseProxy + ", statsTSDBServerAddress=" + statsTSDBServerAddress + ", systemAvatarData=" + systemAvatarData + ", systemAvatarType=" + systemAvatarType + ", threatIntelligenceEnabled=" + threatIntelligenceEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}