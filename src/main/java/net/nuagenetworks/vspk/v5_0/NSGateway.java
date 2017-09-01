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


import net.nuagenetworks.vspk.v5_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.BootstrapsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.BootstrapActivationsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.CommandsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GatewaySecuritiesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.InfrastructureConfigsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.LocationsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MonitorscopesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NSGInfosFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NSPortsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.SubnetsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.UplinkConnectionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.WirelessPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgateway", resourceName = "nsgateways")
public class NSGateway extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum SSHService { DISABLED, ENABLED, INHERITED };
   public enum TPMStatus { DISABLED, ENABLED_NOT_OPERATIONAL, ENABLED_OPERATIONAL, UNKNOWN };
   public enum BootstrapStatus { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT };
   public enum ConfigurationReloadState { APPLIED, FAILED_TO_APPLY, PENDING, SENT, UNKNOWN };
   public enum ConfigurationStatus { FAILURE, SUCCESS, UNKNOWN };
   public enum DerivedSSHServiceState { INHERITED_DISABLED, INHERITED_ENABLED, INSTANCE_DISABLED, INSTANCE_ENABLED, UNKNOWN };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Family { ANY, NSG_E, NSG_V, NSG_AMI, NSG_X, NSG_C, NSG_E200, NSG_E300, NSG_X200 };
   public enum InheritedSSHServiceState { DISABLED, ENABLED };
   public enum NetworkAcceleration { NONE, NORMAL, OPTIMAL, PERFORMANCE };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Personality { DC7X50, HARDWARE_VTEP, NSG, NSGBR, NSGDUC, OTHER, VRSG, VSA, VSG };

   
   @JsonProperty(value = "BIOSVersion")
   protected String BIOSVersion;
   
   @JsonProperty(value = "CPUType")
   protected String CPUType;
   
   @JsonProperty(value = "MACAddress")
   protected String MACAddress;
   
   @JsonProperty(value = "NATTraversalEnabled")
   protected Boolean NATTraversalEnabled;
   
   @JsonProperty(value = "NSGVersion")
   protected String NSGVersion;
   
   @JsonProperty(value = "SKU")
   protected String SKU;
   
   @JsonProperty(value = "SSHService")
   protected SSHService SSHService;
   
   @JsonProperty(value = "TCPMSSEnabled")
   protected Boolean TCPMSSEnabled;
   
   @JsonProperty(value = "TCPMaximumSegmentSize")
   protected Long TCPMaximumSegmentSize;
   
   @JsonProperty(value = "TPMStatus")
   protected TPMStatus TPMStatus;
   
   @JsonProperty(value = "UUID")
   protected String UUID;
   
   @JsonProperty(value = "associatedGatewaySecurityID")
   protected String associatedGatewaySecurityID;
   
   @JsonProperty(value = "associatedGatewaySecurityProfileID")
   protected String associatedGatewaySecurityProfileID;
   
   @JsonProperty(value = "associatedNSGInfoID")
   protected String associatedNSGInfoID;
   
   @JsonProperty(value = "associatedNSGUpgradeProfileID")
   protected String associatedNSGUpgradeProfileID;
   
   @JsonProperty(value = "autoDiscGatewayID")
   protected String autoDiscGatewayID;
   
   @JsonProperty(value = "bootstrapID")
   protected String bootstrapID;
   
   @JsonProperty(value = "bootstrapStatus")
   protected BootstrapStatus bootstrapStatus;
   
   @JsonProperty(value = "configurationReloadState")
   protected ConfigurationReloadState configurationReloadState;
   
   @JsonProperty(value = "configurationStatus")
   protected ConfigurationStatus configurationStatus;
   
   @JsonProperty(value = "controlTrafficCOSValue")
   protected Long controlTrafficCOSValue;
   
   @JsonProperty(value = "controlTrafficDSCPValue")
   protected Long controlTrafficDSCPValue;
   
   @JsonProperty(value = "datapathID")
   protected String datapathID;
   
   @JsonProperty(value = "derivedSSHServiceState")
   protected DerivedSSHServiceState derivedSSHServiceState;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "family")
   protected Family family;
   
   @JsonProperty(value = "inheritedSSHServiceState")
   protected InheritedSSHServiceState inheritedSSHServiceState;
   
   @JsonProperty(value = "lastConfigurationReloadTimestamp")
   protected Long lastConfigurationReloadTimestamp;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "libraries")
   protected String libraries;
   
   @JsonProperty(value = "locationID")
   protected String locationID;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "networkAcceleration")
   protected NetworkAcceleration networkAcceleration;
   
   @JsonProperty(value = "operationMode")
   protected String operationMode;
   
   @JsonProperty(value = "operationStatus")
   protected String operationStatus;
   
   @JsonProperty(value = "pending")
   protected Boolean pending;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "productName")
   protected String productName;
   
   @JsonProperty(value = "redundancyGroupID")
   protected String redundancyGroupID;
   
   @JsonProperty(value = "serialNumber")
   protected String serialNumber;
   
   @JsonProperty(value = "systemID")
   protected String systemID;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private BootstrapsFetcher bootstraps;
   
   @JsonIgnore
   private BootstrapActivationsFetcher bootstrapActivations;
   
   @JsonIgnore
   private CommandsFetcher commands;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GatewaySecuritiesFetcher gatewaySecurities;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private InfrastructureConfigsFetcher infrastructureConfigs;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private LocationsFetcher locations;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MonitorscopesFetcher monitorscopes;
   
   @JsonIgnore
   private NSGInfosFetcher nSGInfos;
   
   @JsonIgnore
   private NSPortsFetcher nSPorts;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   
   @JsonIgnore
   private UplinkConnectionsFetcher uplinkConnections;
   
   @JsonIgnore
   private WirelessPortsFetcher wirelessPorts;
   

   public NSGateway() {
      
      alarms = new AlarmsFetcher(this);
      
      bootstraps = new BootstrapsFetcher(this);
      
      bootstrapActivations = new BootstrapActivationsFetcher(this);
      
      commands = new CommandsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      gatewaySecurities = new GatewaySecuritiesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      infrastructureConfigs = new InfrastructureConfigsFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      locations = new LocationsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      monitorscopes = new MonitorscopesFetcher(this);
      
      nSGInfos = new NSGInfosFetcher(this);
      
      nSPorts = new NSPortsFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
      uplinkConnections = new UplinkConnectionsFetcher(this);
      
      wirelessPorts = new WirelessPortsFetcher(this);
      
   }

   @JsonIgnore
   public String getBIOSVersion() {
      return BIOSVersion;
   }

   @JsonIgnore
   public void setBIOSVersion(String value) { 
      this.BIOSVersion = value;
   }
   @JsonIgnore
   public String getCPUType() {
      return CPUType;
   }

   @JsonIgnore
   public void setCPUType(String value) { 
      this.CPUType = value;
   }
   @JsonIgnore
   public String getMACAddress() {
      return MACAddress;
   }

   @JsonIgnore
   public void setMACAddress(String value) { 
      this.MACAddress = value;
   }
   @JsonIgnore
   public Boolean getNATTraversalEnabled() {
      return NATTraversalEnabled;
   }

   @JsonIgnore
   public void setNATTraversalEnabled(Boolean value) { 
      this.NATTraversalEnabled = value;
   }
   @JsonIgnore
   public String getNSGVersion() {
      return NSGVersion;
   }

   @JsonIgnore
   public void setNSGVersion(String value) { 
      this.NSGVersion = value;
   }
   @JsonIgnore
   public String getSKU() {
      return SKU;
   }

   @JsonIgnore
   public void setSKU(String value) { 
      this.SKU = value;
   }
   @JsonIgnore
   public SSHService getSSHService() {
      return SSHService;
   }

   @JsonIgnore
   public void setSSHService(SSHService value) { 
      this.SSHService = value;
   }
   @JsonIgnore
   public Boolean getTCPMSSEnabled() {
      return TCPMSSEnabled;
   }

   @JsonIgnore
   public void setTCPMSSEnabled(Boolean value) { 
      this.TCPMSSEnabled = value;
   }
   @JsonIgnore
   public Long getTCPMaximumSegmentSize() {
      return TCPMaximumSegmentSize;
   }

   @JsonIgnore
   public void setTCPMaximumSegmentSize(Long value) { 
      this.TCPMaximumSegmentSize = value;
   }
   @JsonIgnore
   public TPMStatus getTPMStatus() {
      return TPMStatus;
   }

   @JsonIgnore
   public void setTPMStatus(TPMStatus value) { 
      this.TPMStatus = value;
   }
   @JsonIgnore
   public String getUUID() {
      return UUID;
   }

   @JsonIgnore
   public void setUUID(String value) { 
      this.UUID = value;
   }
   @JsonIgnore
   public String getAssociatedGatewaySecurityID() {
      return associatedGatewaySecurityID;
   }

   @JsonIgnore
   public void setAssociatedGatewaySecurityID(String value) { 
      this.associatedGatewaySecurityID = value;
   }
   @JsonIgnore
   public String getAssociatedGatewaySecurityProfileID() {
      return associatedGatewaySecurityProfileID;
   }

   @JsonIgnore
   public void setAssociatedGatewaySecurityProfileID(String value) { 
      this.associatedGatewaySecurityProfileID = value;
   }
   @JsonIgnore
   public String getAssociatedNSGInfoID() {
      return associatedNSGInfoID;
   }

   @JsonIgnore
   public void setAssociatedNSGInfoID(String value) { 
      this.associatedNSGInfoID = value;
   }
   @JsonIgnore
   public String getAssociatedNSGUpgradeProfileID() {
      return associatedNSGUpgradeProfileID;
   }

   @JsonIgnore
   public void setAssociatedNSGUpgradeProfileID(String value) { 
      this.associatedNSGUpgradeProfileID = value;
   }
   @JsonIgnore
   public String getAutoDiscGatewayID() {
      return autoDiscGatewayID;
   }

   @JsonIgnore
   public void setAutoDiscGatewayID(String value) { 
      this.autoDiscGatewayID = value;
   }
   @JsonIgnore
   public String getBootstrapID() {
      return bootstrapID;
   }

   @JsonIgnore
   public void setBootstrapID(String value) { 
      this.bootstrapID = value;
   }
   @JsonIgnore
   public BootstrapStatus getBootstrapStatus() {
      return bootstrapStatus;
   }

   @JsonIgnore
   public void setBootstrapStatus(BootstrapStatus value) { 
      this.bootstrapStatus = value;
   }
   @JsonIgnore
   public ConfigurationReloadState getConfigurationReloadState() {
      return configurationReloadState;
   }

   @JsonIgnore
   public void setConfigurationReloadState(ConfigurationReloadState value) { 
      this.configurationReloadState = value;
   }
   @JsonIgnore
   public ConfigurationStatus getConfigurationStatus() {
      return configurationStatus;
   }

   @JsonIgnore
   public void setConfigurationStatus(ConfigurationStatus value) { 
      this.configurationStatus = value;
   }
   @JsonIgnore
   public Long getControlTrafficCOSValue() {
      return controlTrafficCOSValue;
   }

   @JsonIgnore
   public void setControlTrafficCOSValue(Long value) { 
      this.controlTrafficCOSValue = value;
   }
   @JsonIgnore
   public Long getControlTrafficDSCPValue() {
      return controlTrafficDSCPValue;
   }

   @JsonIgnore
   public void setControlTrafficDSCPValue(Long value) { 
      this.controlTrafficDSCPValue = value;
   }
   @JsonIgnore
   public String getDatapathID() {
      return datapathID;
   }

   @JsonIgnore
   public void setDatapathID(String value) { 
      this.datapathID = value;
   }
   @JsonIgnore
   public DerivedSSHServiceState getDerivedSSHServiceState() {
      return derivedSSHServiceState;
   }

   @JsonIgnore
   public void setDerivedSSHServiceState(DerivedSSHServiceState value) { 
      this.derivedSSHServiceState = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   @JsonIgnore
   public Family getFamily() {
      return family;
   }

   @JsonIgnore
   public void setFamily(Family value) { 
      this.family = value;
   }
   @JsonIgnore
   public InheritedSSHServiceState getInheritedSSHServiceState() {
      return inheritedSSHServiceState;
   }

   @JsonIgnore
   public void setInheritedSSHServiceState(InheritedSSHServiceState value) { 
      this.inheritedSSHServiceState = value;
   }
   @JsonIgnore
   public Long getLastConfigurationReloadTimestamp() {
      return lastConfigurationReloadTimestamp;
   }

   @JsonIgnore
   public void setLastConfigurationReloadTimestamp(Long value) { 
      this.lastConfigurationReloadTimestamp = value;
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
   public String getLibraries() {
      return libraries;
   }

   @JsonIgnore
   public void setLibraries(String value) { 
      this.libraries = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   @JsonIgnore
   public NetworkAcceleration getNetworkAcceleration() {
      return networkAcceleration;
   }

   @JsonIgnore
   public void setNetworkAcceleration(NetworkAcceleration value) { 
      this.networkAcceleration = value;
   }
   @JsonIgnore
   public String getOperationMode() {
      return operationMode;
   }

   @JsonIgnore
   public void setOperationMode(String value) { 
      this.operationMode = value;
   }
   @JsonIgnore
   public String getOperationStatus() {
      return operationStatus;
   }

   @JsonIgnore
   public void setOperationStatus(String value) { 
      this.operationStatus = value;
   }
   @JsonIgnore
   public Boolean getPending() {
      return pending;
   }

   @JsonIgnore
   public void setPending(Boolean value) { 
      this.pending = value;
   }
   @JsonIgnore
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   @JsonIgnore
   public Personality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(Personality value) { 
      this.personality = value;
   }
   @JsonIgnore
   public String getProductName() {
      return productName;
   }

   @JsonIgnore
   public void setProductName(String value) { 
      this.productName = value;
   }
   @JsonIgnore
   public String getRedundancyGroupID() {
      return redundancyGroupID;
   }

   @JsonIgnore
   public void setRedundancyGroupID(String value) { 
      this.redundancyGroupID = value;
   }
   @JsonIgnore
   public String getSerialNumber() {
      return serialNumber;
   }

   @JsonIgnore
   public void setSerialNumber(String value) { 
      this.serialNumber = value;
   }
   @JsonIgnore
   public String getSystemID() {
      return systemID;
   }

   @JsonIgnore
   public void setSystemID(String value) { 
      this.systemID = value;
   }
   @JsonIgnore
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public BootstrapsFetcher getBootstraps() {
      return bootstraps;
   }
   
   @JsonIgnore
   public BootstrapActivationsFetcher getBootstrapActivations() {
      return bootstrapActivations;
   }
   
   @JsonIgnore
   public CommandsFetcher getCommands() {
      return commands;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public GatewaySecuritiesFetcher getGatewaySecurities() {
      return gatewaySecurities;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public InfrastructureConfigsFetcher getInfrastructureConfigs() {
      return infrastructureConfigs;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public LocationsFetcher getLocations() {
      return locations;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public MonitorscopesFetcher getMonitorscopes() {
      return monitorscopes;
   }
   
   @JsonIgnore
   public NSGInfosFetcher getNSGInfos() {
      return nSGInfos;
   }
   
   @JsonIgnore
   public NSPortsFetcher getNSPorts() {
      return nSPorts;
   }
   
   @JsonIgnore
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   
   @JsonIgnore
   public UplinkConnectionsFetcher getUplinkConnections() {
      return uplinkConnections;
   }
   
   @JsonIgnore
   public WirelessPortsFetcher getWirelessPorts() {
      return wirelessPorts;
   }
   

   public String toString() {
      return "NSGateway [" + "BIOSVersion=" + BIOSVersion + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", NATTraversalEnabled=" + NATTraversalEnabled + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", SSHService=" + SSHService + ", TCPMSSEnabled=" + TCPMSSEnabled + ", TCPMaximumSegmentSize=" + TCPMaximumSegmentSize + ", TPMStatus=" + TPMStatus + ", UUID=" + UUID + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", associatedNSGInfoID=" + associatedNSGInfoID + ", associatedNSGUpgradeProfileID=" + associatedNSGUpgradeProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", configurationReloadState=" + configurationReloadState + ", configurationStatus=" + configurationStatus + ", controlTrafficCOSValue=" + controlTrafficCOSValue + ", controlTrafficDSCPValue=" + controlTrafficDSCPValue + ", datapathID=" + datapathID + ", derivedSSHServiceState=" + derivedSSHServiceState + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", inheritedSSHServiceState=" + inheritedSSHServiceState + ", lastConfigurationReloadTimestamp=" + lastConfigurationReloadTimestamp + ", lastUpdatedBy=" + lastUpdatedBy + ", libraries=" + libraries + ", locationID=" + locationID + ", name=" + name + ", networkAcceleration=" + networkAcceleration + ", operationMode=" + operationMode + ", operationStatus=" + operationStatus + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", productName=" + productName + ", redundancyGroupID=" + redundancyGroupID + ", serialNumber=" + serialNumber + ", systemID=" + systemID + ", templateID=" + templateID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}