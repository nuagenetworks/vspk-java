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

import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "infrastructuregatewayprofile", resourceName = "infrastructuregatewayprofiles")
public class InfrastructureGatewayProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum DeadTimer { FIVE_HOURS, FOUR_HOURS, NONE, ONE_HOUR, SIX_HOURS, TEN_MINUTES, THIRTY_MINUTES, THREE_HOURS, TWO_HOURS };
   public enum RemoteLogMode { DISABLED, RSYSLOG, SCP, SFTP };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum UpgradeAction { DOWNLOAD_AND_UPGRADE_AT_WINDOW, DOWNLOAD_AND_UPGRADE_NOW, DOWNLOAD_ONLY, NONE, UPGRADE_AT_BOOTSTRAPPING, UPGRADE_NOW };
   public enum SystemSyncWindow { FIVE_HOURS, FOUR_HOURS, NONE, ONE_HOUR, SIX_HOURS, TEN_MINUTES, THIRTY_MINUTES, THREE_HOURS, TWO_HOURS };

   
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
   protected DeadTimer deadTimer;
   
   @JsonProperty(value = "remoteLogDirPath")
   protected String remoteLogDirPath;
   
   @JsonProperty(value = "remoteLogMode")
   protected RemoteLogMode remoteLogMode;
   
   @JsonProperty(value = "remoteLogPassword")
   protected String remoteLogPassword;
   
   @JsonProperty(value = "remoteLogServerAddress")
   protected String remoteLogServerAddress;
   
   @JsonProperty(value = "remoteLogServerPort")
   protected Long remoteLogServerPort;
   
   @JsonProperty(value = "remoteLogUsername")
   protected String remoteLogUsername;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "metadataUpgradePath")
   protected String metadataUpgradePath;
   
   @JsonProperty(value = "flowEvictionThreshold")
   protected Long flowEvictionThreshold;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
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
   
   @JsonProperty(value = "systemSyncWindow")
   protected SystemSyncWindow systemSyncWindow;
   

   
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
      deadTimer = DeadTimer.ONE_HOUR;
      useTwoFactor = true;
      remoteLogMode = RemoteLogMode.DISABLED;
      datapathSyncTimeout = 1000L;
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public String getNTPServerKey() {
      return NTPServerKey;
   }

   public void setNTPServerKey(String value) { 
      this.NTPServerKey = value;
   }
   public Long getNTPServerKeyID() {
      return NTPServerKeyID;
   }

   public void setNTPServerKeyID(Long value) { 
      this.NTPServerKeyID = value;
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
   public Long getDatapathSyncTimeout() {
      return datapathSyncTimeout;
   }

   public void setDatapathSyncTimeout(Long value) { 
      this.datapathSyncTimeout = value;
   }
   public DeadTimer getDeadTimer() {
      return deadTimer;
   }

   public void setDeadTimer(DeadTimer value) { 
      this.deadTimer = value;
   }
   public String getRemoteLogDirPath() {
      return remoteLogDirPath;
   }

   public void setRemoteLogDirPath(String value) { 
      this.remoteLogDirPath = value;
   }
   public RemoteLogMode getRemoteLogMode() {
      return remoteLogMode;
   }

   public void setRemoteLogMode(RemoteLogMode value) { 
      this.remoteLogMode = value;
   }
   public String getRemoteLogPassword() {
      return remoteLogPassword;
   }

   public void setRemoteLogPassword(String value) { 
      this.remoteLogPassword = value;
   }
   public String getRemoteLogServerAddress() {
      return remoteLogServerAddress;
   }

   public void setRemoteLogServerAddress(String value) { 
      this.remoteLogServerAddress = value;
   }
   public Long getRemoteLogServerPort() {
      return remoteLogServerPort;
   }

   public void setRemoteLogServerPort(Long value) { 
      this.remoteLogServerPort = value;
   }
   public String getRemoteLogUsername() {
      return remoteLogUsername;
   }

   public void setRemoteLogUsername(String value) { 
      this.remoteLogUsername = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getMetadataUpgradePath() {
      return metadataUpgradePath;
   }

   public void setMetadataUpgradePath(String value) { 
      this.metadataUpgradePath = value;
   }
   public Long getFlowEvictionThreshold() {
      return flowEvictionThreshold;
   }

   public void setFlowEvictionThreshold(Long value) { 
      this.flowEvictionThreshold = value;
   }
   public String getEnterpriseID() {
      return enterpriseID;
   }

   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public UpgradeAction getUpgradeAction() {
      return upgradeAction;
   }

   public void setUpgradeAction(UpgradeAction value) { 
      this.upgradeAction = value;
   }
   public String getProxyDNSName() {
      return proxyDNSName;
   }

   public void setProxyDNSName(String value) { 
      this.proxyDNSName = value;
   }
   public Boolean getUseTwoFactor() {
      return useTwoFactor;
   }

   public void setUseTwoFactor(Boolean value) { 
      this.useTwoFactor = value;
   }
   public Long getStatsCollectorPort() {
      return statsCollectorPort;
   }

   public void setStatsCollectorPort(Long value) { 
      this.statsCollectorPort = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getSystemSyncScheduler() {
      return systemSyncScheduler;
   }

   public void setSystemSyncScheduler(String value) { 
      this.systemSyncScheduler = value;
   }
   public SystemSyncWindow getSystemSyncWindow() {
      return systemSyncWindow;
   }

   public void setSystemSyncWindow(SystemSyncWindow value) { 
      this.systemSyncWindow = value;
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
      return "InfrastructureGatewayProfile [" + "NTPServerKey=" + NTPServerKey + ", NTPServerKeyID=" + NTPServerKeyID + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", datapathSyncTimeout=" + datapathSyncTimeout + ", deadTimer=" + deadTimer + ", remoteLogDirPath=" + remoteLogDirPath + ", remoteLogMode=" + remoteLogMode + ", remoteLogPassword=" + remoteLogPassword + ", remoteLogServerAddress=" + remoteLogServerAddress + ", remoteLogServerPort=" + remoteLogServerPort + ", remoteLogUsername=" + remoteLogUsername + ", description=" + description + ", metadataUpgradePath=" + metadataUpgradePath + ", flowEvictionThreshold=" + flowEvictionThreshold + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", upgradeAction=" + upgradeAction + ", proxyDNSName=" + proxyDNSName + ", useTwoFactor=" + useTwoFactor + ", statsCollectorPort=" + statsCollectorPort + ", externalID=" + externalID + ", systemSyncScheduler=" + systemSyncScheduler + ", systemSyncWindow=" + systemSyncWindow + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}