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
@RestEntity(restName = "infrastructuregatewayprofile", resourceName = "infrastructuregatewayprofiles")
public class InfrastructureGatewayProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum RemoteLogMode { DISABLED, RSYSLOG, SCP, SFTP };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum UpgradeAction { DOWNLOAD_AND_UPGRADE_AT_WINDOW, DOWNLOAD_AND_UPGRADE_NOW, DOWNLOAD_ONLY, NONE, UPGRADE_AT_BOOTSTRAPPING, UPGRADE_NOW };

   
   @JsonProperty(value = "NTPServerKey")
   protected String NTPServerKey;
   
   @JsonProperty(value = "NTPServerKeyID")
   protected Long NTPServerKeyID;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "datapathSyncTimeout")
   protected Long datapathSyncTimeout;
   
   @JsonProperty(value = "deadTimer")
   protected String deadTimer;
   
   @JsonProperty(value = "deadTimerEnabled")
   protected Boolean deadTimerEnabled;
   
   @JsonProperty(value = "remoteLogMode")
   protected RemoteLogMode remoteLogMode;
   
   @JsonProperty(value = "remoteLogServerAddress")
   protected String remoteLogServerAddress;
   
   @JsonProperty(value = "remoteLogServerPort")
   protected Long remoteLogServerPort;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "metadataUpgradePath")
   protected String metadataUpgradePath;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "controllerLessDuration")
   protected String controllerLessDuration;
   
   @JsonProperty(value = "controllerLessEnabled")
   protected Boolean controllerLessEnabled;
   
   @JsonProperty(value = "forceImmediateSystemSync")
   protected Boolean forceImmediateSystemSync;
   
   @JsonProperty(value = "upgradeAction")
   protected UpgradeAction upgradeAction;
   
   @JsonProperty(value = "proxyDNSName")
   protected String proxyDNSName;
   
   @JsonProperty(value = "useTwoFactor")
   protected Boolean useTwoFactor;
   
   @JsonProperty(value = "statsCollectorPort")
   protected Long statsCollectorPort;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "systemSyncScheduler")
   protected String systemSyncScheduler;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public InfrastructureGatewayProfile() {
      flowEvictionThreshold = 2500L;
      systemSyncWindow = SystemSyncWindow.ONE_HOUR;
      upgradeAction = UpgradeAction.NONE;
      statsCollectorPort = 29090L;
      systemSyncScheduler = "0 0 * * 0";
      useTwoFactor = true;
      remoteLogMode = RemoteLogMode.DISABLED;
      datapathSyncTimeout = 1000L;
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
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
   public RemoteLogMode getRemoteLogMode() {
      return remoteLogMode;
   }

   @JsonIgnore
   public void setRemoteLogMode(RemoteLogMode value) { 
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
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
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
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
   public Boolean getForceImmediateSystemSync() {
      return forceImmediateSystemSync;
   }

   @JsonIgnore
   public void setForceImmediateSystemSync(Boolean value) { 
      this.forceImmediateSystemSync = value;
   }
   @JsonIgnore
   public UpgradeAction getUpgradeAction() {
      return upgradeAction;
   }

   @JsonIgnore
   public void setUpgradeAction(UpgradeAction value) { 
      this.upgradeAction = value;
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
   public Boolean getUseTwoFactor() {
      return useTwoFactor;
   }

   @JsonIgnore
   public void setUseTwoFactor(Boolean value) { 
      this.useTwoFactor = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "InfrastructureGatewayProfile [" + "NTPServerKey=" + NTPServerKey + ", NTPServerKeyID=" + NTPServerKeyID + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", datapathSyncTimeout=" + datapathSyncTimeout + ", deadTimer=" + deadTimer + ", deadTimerEnabled=" + deadTimerEnabled + ", remoteLogMode=" + remoteLogMode + ", remoteLogServerAddress=" + remoteLogServerAddress + ", remoteLogServerPort=" + remoteLogServerPort + ", description=" + description + ", metadataUpgradePath=" + metadataUpgradePath + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", controllerLessDuration=" + controllerLessDuration + ", controllerLessEnabled=" + controllerLessEnabled + ", forceImmediateSystemSync=" + forceImmediateSystemSync + ", upgradeAction=" + upgradeAction + ", proxyDNSName=" + proxyDNSName + ", useTwoFactor=" + useTwoFactor + ", statsCollectorPort=" + statsCollectorPort + ", externalID=" + externalID + ", systemSyncScheduler=" + systemSyncScheduler + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}