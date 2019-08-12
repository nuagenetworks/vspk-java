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

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "infrastructuregatewayprofile", resourceName = "infrastructuregatewayprofiles")
public class InfrastructureGatewayProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EControllerLessForwardingMode { DISABLED, LOCAL_AND_REMOTE, LOCAL_ONLY };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ERemoteLogMode { DISABLED, RSYSLOG };
   public enum EUpgradeAction { DOWNLOAD_AND_UPGRADE_AT_WINDOW, DOWNLOAD_AND_UPGRADE_NOW, DOWNLOAD_ONLY, NONE, UPGRADE_AT_BOOTSTRAPPING, UPGRADE_NOW };

   
   @JsonProperty(value = "NTPServerKey")
   
   protected String NTPServerKey;
   
   @JsonProperty(value = "NTPServerKeyID")
   
   protected Long NTPServerKeyID;
   
   @JsonProperty(value = "controllerLessDuration")
   
   protected String controllerLessDuration;
   
   @JsonProperty(value = "controllerLessEnabled")
   
   protected Boolean controllerLessEnabled;
   
   @JsonProperty(value = "controllerLessForwardingMode")
   
   protected EControllerLessForwardingMode controllerLessForwardingMode;
   
   @JsonProperty(value = "controllerLessRemoteDuration")
   
   protected String controllerLessRemoteDuration;
   
   @JsonProperty(value = "datapathSyncTimeout")
   
   protected Long datapathSyncTimeout;
   
   @JsonProperty(value = "deadTimer")
   
   protected String deadTimer;
   
   @JsonProperty(value = "deadTimerEnabled")
   
   protected Boolean deadTimerEnabled;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseID")
   
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "flowEvictionThreshold")
   
   protected Long flowEvictionThreshold;
   
   @JsonProperty(value = "forceImmediateSystemSync")
   
   protected Boolean forceImmediateSystemSync;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "metadataUpgradePath")
   
   protected String metadataUpgradePath;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "openFlowAuditTimer")
   
   protected Long openFlowAuditTimer;
   
   @JsonProperty(value = "proxyDNSName")
   
   protected String proxyDNSName;
   
   @JsonProperty(value = "remoteLogMode")
   
   protected ERemoteLogMode remoteLogMode;
   
   @JsonProperty(value = "remoteLogServerAddress")
   
   protected String remoteLogServerAddress;
   
   @JsonProperty(value = "remoteLogServerPort")
   
   protected Long remoteLogServerPort;
   
   @JsonProperty(value = "statsCollectorPort")
   
   protected Long statsCollectorPort;
   
   @JsonProperty(value = "systemSyncScheduler")
   
   protected String systemSyncScheduler;
   
   @JsonProperty(value = "upgradeAction")
   
   protected EUpgradeAction upgradeAction;
   
   @JsonProperty(value = "useTwoFactor")
   
   protected Boolean useTwoFactor;
   
   @JsonProperty(value = "webFilterDownloadPort")
   
   protected Long webFilterDownloadPort;
   
   @JsonProperty(value = "webFilterQueryPort")
   
   protected Long webFilterQueryPort;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public InfrastructureGatewayProfile() {
      upgradeAction = EUpgradeAction.NONE;
      statsCollectorPort = 29090L;
      systemSyncScheduler = "0 0 * * *";
      useTwoFactor = true;
      remoteLogMode = ERemoteLogMode.DISABLED;
      datapathSyncTimeout = 1000L;
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getNTPServerKey() {
      return NTPServerKey;
   }

   @JsonIgnore
   public void setNTPServerKey(String value) { 
      this.NTPServerKey = value;
   }
   
   
   @JsonIgnore
   public Long getNTPServerKeyID() {
      return NTPServerKeyID;
   }

   @JsonIgnore
   public void setNTPServerKeyID(Long value) { 
      this.NTPServerKeyID = value;
   }
   
   
   @JsonIgnore
   public String getControllerLessDuration() {
      return controllerLessDuration;
   }

   @JsonIgnore
   public void setControllerLessDuration(String value) { 
      this.controllerLessDuration = value;
   }
   
   
   @JsonIgnore
   public Boolean getControllerLessEnabled() {
      return controllerLessEnabled;
   }

   @JsonIgnore
   public void setControllerLessEnabled(Boolean value) { 
      this.controllerLessEnabled = value;
   }
   
   
   @JsonIgnore
   public EControllerLessForwardingMode getControllerLessForwardingMode() {
      return controllerLessForwardingMode;
   }

   @JsonIgnore
   public void setControllerLessForwardingMode(EControllerLessForwardingMode value) { 
      this.controllerLessForwardingMode = value;
   }
   
   
   @JsonIgnore
   public String getControllerLessRemoteDuration() {
      return controllerLessRemoteDuration;
   }

   @JsonIgnore
   public void setControllerLessRemoteDuration(String value) { 
      this.controllerLessRemoteDuration = value;
   }
   
   
   @JsonIgnore
   public Long getDatapathSyncTimeout() {
      return datapathSyncTimeout;
   }

   @JsonIgnore
   public void setDatapathSyncTimeout(Long value) { 
      this.datapathSyncTimeout = value;
   }
   
   
   @JsonIgnore
   public String getDeadTimer() {
      return deadTimer;
   }

   @JsonIgnore
   public void setDeadTimer(String value) { 
      this.deadTimer = value;
   }
   
   
   @JsonIgnore
   public Boolean getDeadTimerEnabled() {
      return deadTimerEnabled;
   }

   @JsonIgnore
   public void setDeadTimerEnabled(Boolean value) { 
      this.deadTimerEnabled = value;
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
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
   }
   
   
   @JsonIgnore
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
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
   public Long getFlowEvictionThreshold() {
      return flowEvictionThreshold;
   }

   @JsonIgnore
   public void setFlowEvictionThreshold(Long value) { 
      this.flowEvictionThreshold = value;
   }
   
   
   @JsonIgnore
   public Boolean getForceImmediateSystemSync() {
      return forceImmediateSystemSync;
   }

   @JsonIgnore
   public void setForceImmediateSystemSync(Boolean value) { 
      this.forceImmediateSystemSync = value;
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
   public String getMetadataUpgradePath() {
      return metadataUpgradePath;
   }

   @JsonIgnore
   public void setMetadataUpgradePath(String value) { 
      this.metadataUpgradePath = value;
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
   public Long getOpenFlowAuditTimer() {
      return openFlowAuditTimer;
   }

   @JsonIgnore
   public void setOpenFlowAuditTimer(Long value) { 
      this.openFlowAuditTimer = value;
   }
   
   
   @JsonIgnore
   public String getProxyDNSName() {
      return proxyDNSName;
   }

   @JsonIgnore
   public void setProxyDNSName(String value) { 
      this.proxyDNSName = value;
   }
   
   
   @JsonIgnore
   public ERemoteLogMode getRemoteLogMode() {
      return remoteLogMode;
   }

   @JsonIgnore
   public void setRemoteLogMode(ERemoteLogMode value) { 
      this.remoteLogMode = value;
   }
   
   
   @JsonIgnore
   public String getRemoteLogServerAddress() {
      return remoteLogServerAddress;
   }

   @JsonIgnore
   public void setRemoteLogServerAddress(String value) { 
      this.remoteLogServerAddress = value;
   }
   
   
   @JsonIgnore
   public Long getRemoteLogServerPort() {
      return remoteLogServerPort;
   }

   @JsonIgnore
   public void setRemoteLogServerPort(Long value) { 
      this.remoteLogServerPort = value;
   }
   
   
   @JsonIgnore
   public Long getStatsCollectorPort() {
      return statsCollectorPort;
   }

   @JsonIgnore
   public void setStatsCollectorPort(Long value) { 
      this.statsCollectorPort = value;
   }
   
   
   @JsonIgnore
   public String getSystemSyncScheduler() {
      return systemSyncScheduler;
   }

   @JsonIgnore
   public void setSystemSyncScheduler(String value) { 
      this.systemSyncScheduler = value;
   }
   
   
   @JsonIgnore
   public EUpgradeAction getUpgradeAction() {
      return upgradeAction;
   }

   @JsonIgnore
   public void setUpgradeAction(EUpgradeAction value) { 
      this.upgradeAction = value;
   }
   
   
   @JsonIgnore
   public Boolean getUseTwoFactor() {
      return useTwoFactor;
   }

   @JsonIgnore
   public void setUseTwoFactor(Boolean value) { 
      this.useTwoFactor = value;
   }
   
   
   @JsonIgnore
   public Long getWebFilterDownloadPort() {
      return webFilterDownloadPort;
   }

   @JsonIgnore
   public void setWebFilterDownloadPort(Long value) { 
      this.webFilterDownloadPort = value;
   }
   
   
   @JsonIgnore
   public Long getWebFilterQueryPort() {
      return webFilterQueryPort;
   }

   @JsonIgnore
   public void setWebFilterQueryPort(Long value) { 
      this.webFilterQueryPort = value;
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
      return "InfrastructureGatewayProfile [" + "NTPServerKey=" + NTPServerKey + ", NTPServerKeyID=" + NTPServerKeyID + ", controllerLessDuration=" + controllerLessDuration + ", controllerLessEnabled=" + controllerLessEnabled + ", controllerLessForwardingMode=" + controllerLessForwardingMode + ", controllerLessRemoteDuration=" + controllerLessRemoteDuration + ", datapathSyncTimeout=" + datapathSyncTimeout + ", deadTimer=" + deadTimer + ", deadTimerEnabled=" + deadTimerEnabled + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", flowEvictionThreshold=" + flowEvictionThreshold + ", forceImmediateSystemSync=" + forceImmediateSystemSync + ", lastUpdatedBy=" + lastUpdatedBy + ", metadataUpgradePath=" + metadataUpgradePath + ", name=" + name + ", openFlowAuditTimer=" + openFlowAuditTimer + ", proxyDNSName=" + proxyDNSName + ", remoteLogMode=" + remoteLogMode + ", remoteLogServerAddress=" + remoteLogServerAddress + ", remoteLogServerPort=" + remoteLogServerPort + ", statsCollectorPort=" + statsCollectorPort + ", systemSyncScheduler=" + systemSyncScheduler + ", upgradeAction=" + upgradeAction + ", useTwoFactor=" + useTwoFactor + ", webFilterDownloadPort=" + webFilterDownloadPort + ", webFilterQueryPort=" + webFilterQueryPort + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}