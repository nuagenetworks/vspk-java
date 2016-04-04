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


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InfrastructureGatewayProfile extends RestObject {

   public final static String REST_NAME = "infrastructuregatewayprofile";
   public final static String RESOURCE_NAME = "infrastructuregatewayprofiles";

   
   public enum DeadTimer { FIVE_HOURS, FOUR_HOURS, NONE, ONE_HOUR, SIX_HOURS, TEN_MINUTES, THIRTY_MINUTES, THREE_HOURS, TWO_HOURS };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum RemoteLogMode { DISABLED, RSYSLOG, SCP, SFTP };
   public enum SystemSyncWindow { FIVE_HOURS, FOUR_HOURS, NONE, ONE_HOUR, SIX_HOURS, TEN_MINUTES, THIRTY_MINUTES, THREE_HOURS, TWO_HOURS };
   public enum UpgradeAction { DOWNLOAD_AND_UPGRADE_AT_WINDOW, DOWNLOAD_AND_UPGRADE_NOW, DOWNLOAD_ONLY, NONE, UPGRADE_AT_BOOTSTRAPPING, UPGRADE_NOW };

   
   @JsonProperty(value = "NTPServerKey")
   protected String NTPServerKey;
   
   @JsonProperty(value = "NTPServerKeyID")
   protected int NTPServerKeyID;
   
   @JsonProperty(value = "datapathSyncTimeout")
   protected int datapathSyncTimeout;
   
   @JsonProperty(value = "deadTimer")
   protected DeadTimer deadTimer;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "flowEvictionThreshold")
   protected int flowEvictionThreshold;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "metadataUpgradePath")
   protected String metadataUpgradePath;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "proxyDNSName")
   protected String proxyDNSName;
   
   @JsonProperty(value = "remoteLogDirPath")
   protected String remoteLogDirPath;
   
   @JsonProperty(value = "remoteLogMode")
   protected RemoteLogMode remoteLogMode;
   
   @JsonProperty(value = "remoteLogPassword")
   protected String remoteLogPassword;
   
   @JsonProperty(value = "remoteLogServerAddress")
   protected String remoteLogServerAddress;
   
   @JsonProperty(value = "remoteLogServerPort")
   protected int remoteLogServerPort;
   
   @JsonProperty(value = "remoteLogUsername")
   protected String remoteLogUsername;
   
   @JsonProperty(value = "statsCollectorPort")
   protected int statsCollectorPort;
   
   @JsonProperty(value = "systemSyncScheduler")
   protected String systemSyncScheduler;
   
   @JsonProperty(value = "systemSyncWindow")
   protected SystemSyncWindow systemSyncWindow;
   
   @JsonProperty(value = "upgradeAction")
   protected UpgradeAction upgradeAction;
   
   @JsonProperty(value = "useTwoFactor")
   protected boolean useTwoFactor;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public InfrastructureGatewayProfile() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public String getNTPServerKey() {
      return NTPServerKey;
   }

   public void setNTPServerKey(String value) { 
      this.NTPServerKey = value;
   }
   public int getNTPServerKeyID() {
      return NTPServerKeyID;
   }

   public void setNTPServerKeyID(int value) { 
      this.NTPServerKeyID = value;
   }
   public int getDatapathSyncTimeout() {
      return datapathSyncTimeout;
   }

   public void setDatapathSyncTimeout(int value) { 
      this.datapathSyncTimeout = value;
   }
   public DeadTimer getDeadTimer() {
      return deadTimer;
   }

   public void setDeadTimer(DeadTimer value) { 
      this.deadTimer = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
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
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public int getFlowEvictionThreshold() {
      return flowEvictionThreshold;
   }

   public void setFlowEvictionThreshold(int value) { 
      this.flowEvictionThreshold = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getMetadataUpgradePath() {
      return metadataUpgradePath;
   }

   public void setMetadataUpgradePath(String value) { 
      this.metadataUpgradePath = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getProxyDNSName() {
      return proxyDNSName;
   }

   public void setProxyDNSName(String value) { 
      this.proxyDNSName = value;
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
   public int getRemoteLogServerPort() {
      return remoteLogServerPort;
   }

   public void setRemoteLogServerPort(int value) { 
      this.remoteLogServerPort = value;
   }
   public String getRemoteLogUsername() {
      return remoteLogUsername;
   }

   public void setRemoteLogUsername(String value) { 
      this.remoteLogUsername = value;
   }
   public int getStatsCollectorPort() {
      return statsCollectorPort;
   }

   public void setStatsCollectorPort(int value) { 
      this.statsCollectorPort = value;
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
   public UpgradeAction getUpgradeAction() {
      return upgradeAction;
   }

   public void setUpgradeAction(UpgradeAction value) { 
      this.upgradeAction = value;
   }
   public boolean getUseTwoFactor() {
      return useTwoFactor;
   }

   public void setUseTwoFactor(boolean value) { 
      this.useTwoFactor = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "InfrastructureGatewayProfile [" + "NTPServerKey=" + NTPServerKey + ", NTPServerKeyID=" + NTPServerKeyID + ", datapathSyncTimeout=" + datapathSyncTimeout + ", deadTimer=" + deadTimer + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", flowEvictionThreshold=" + flowEvictionThreshold + ", lastUpdatedBy=" + lastUpdatedBy + ", metadataUpgradePath=" + metadataUpgradePath + ", name=" + name + ", proxyDNSName=" + proxyDNSName + ", remoteLogDirPath=" + remoteLogDirPath + ", remoteLogMode=" + remoteLogMode + ", remoteLogPassword=" + remoteLogPassword + ", remoteLogServerAddress=" + remoteLogServerAddress + ", remoteLogServerPort=" + remoteLogServerPort + ", remoteLogUsername=" + remoteLogUsername + ", statsCollectorPort=" + statsCollectorPort + ", systemSyncScheduler=" + systemSyncScheduler + ", systemSyncWindow=" + systemSyncWindow + ", upgradeAction=" + upgradeAction + ", useTwoFactor=" + useTwoFactor + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}