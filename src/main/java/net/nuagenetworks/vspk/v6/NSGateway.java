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


import net.nuagenetworks.vspk.v6.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.BootstrapsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.BootstrapActivationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.CommandsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GatewaySecuritiesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.InfrastructureConfigsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.LocationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGatewayMonitorsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGatewaySummariesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGInfosFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSPortsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PatchsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSPortInfosFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SubnetsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.UplinkConnectionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VNFsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.WirelessPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgateway", resourceName = "nsgateways")
public class NSGateway extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum ESSHService { DISABLED, ENABLED, INHERITED };
   public enum ETPMStatus { DISABLED, ENABLED_NOT_OPERATIONAL, ENABLED_OPERATIONAL, UNKNOWN };
   public enum EZFBMatchAttribute { HOSTNAME, IP_ADDRESS, MAC_ADDRESS, NONE, NSGATEWAY_ID, SERIAL_NUMBER, UUID };
   public enum EBootstrapStatus { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT, QUARANTINED, REVOKED };
   public enum EConfigurationReloadState { APPLIED, FAILED_TO_APPLY, PENDING, SENT, UNKNOWN };
   public enum EConfigurationStatus { FAILURE, SUCCESS, UNKNOWN };
   public enum EConfigureLoadBalancing { DISABLED, INHERITED };
   public enum EDerivedSSHServiceState { INHERITED_DISABLED, INHERITED_ENABLED, INSTANCE_DISABLED, INSTANCE_ENABLED, UNKNOWN };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EFamily { ANY, NSG_AMI, NSG_AZ, NSG_C, NSG_E, NSG_E200, NSG_E300, NSG_V, NSG_X, NSG_X200 };
   public enum EFunctions { GATEWAY, HUB, UBR };
   public enum EInheritedSSHServiceState { DISABLED, ENABLED };
   public enum ENetworkAcceleration { NONE, PERFORMANCE, SESSION_OPTIMIZED, VNF_AWARE };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EPersonality { NSG, NSGBR, NSGDUC };
   public enum ESyslogLevel { ALERT, CRITICAL, EMERGENCY, ERROR, INFO, NOTICE, WARNING };
   public enum ETunnelShaping { DISABLED, ENABLED };

   
   @JsonProperty(value = "AARApplicationReleaseDate")
   
   protected String AARApplicationReleaseDate;
   
   @JsonProperty(value = "AARApplicationVersion")
   
   protected String AARApplicationVersion;
   
   @JsonProperty(value = "BIOSReleaseDate")
   
   protected String BIOSReleaseDate;
   
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
   
   protected ESSHService SSHService;
   
   @JsonProperty(value = "TCPMSSEnabled")
   
   protected Boolean TCPMSSEnabled;
   
   @JsonProperty(value = "TCPMaximumSegmentSize")
   
   protected Long TCPMaximumSegmentSize;
   
   @JsonProperty(value = "TPMStatus")
   
   protected ETPMStatus TPMStatus;
   
   @JsonProperty(value = "TPMVersion")
   
   protected String TPMVersion;
   
   @JsonProperty(value = "UUID")
   
   protected String UUID;
   
   @JsonProperty(value = "VSDAARApplicationVersion")
   
   protected String VSDAARApplicationVersion;
   
   @JsonProperty(value = "ZFBMatchAttribute")
   
   protected EZFBMatchAttribute ZFBMatchAttribute;
   
   @JsonProperty(value = "ZFBMatchValue")
   
   protected String ZFBMatchValue;
   
   @JsonProperty(value = "associatedGatewaySecurityID")
   
   protected String associatedGatewaySecurityID;
   
   @JsonProperty(value = "associatedGatewaySecurityProfileID")
   
   protected String associatedGatewaySecurityProfileID;
   
   @JsonProperty(value = "associatedNSGInfoID")
   
   protected String associatedNSGInfoID;
   
   @JsonProperty(value = "associatedNSGUpgradeProfileID")
   
   protected String associatedNSGUpgradeProfileID;
   
   @JsonProperty(value = "associatedOverlayManagementProfileID")
   
   protected String associatedOverlayManagementProfileID;
   
   @JsonProperty(value = "autoDiscGatewayID")
   
   protected String autoDiscGatewayID;
   
   @JsonProperty(value = "bootstrapID")
   
   protected String bootstrapID;
   
   @JsonProperty(value = "bootstrapStatus")
   
   protected EBootstrapStatus bootstrapStatus;
   
   @JsonProperty(value = "configurationReloadState")
   
   protected EConfigurationReloadState configurationReloadState;
   
   @JsonProperty(value = "configurationStatus")
   
   protected EConfigurationStatus configurationStatus;
   
   @JsonProperty(value = "configureLoadBalancing")
   
   protected EConfigureLoadBalancing configureLoadBalancing;
   
   @JsonProperty(value = "controlTrafficCOSValue")
   
   protected Long controlTrafficCOSValue;
   
   @JsonProperty(value = "controlTrafficDSCPValue")
   
   protected Long controlTrafficDSCPValue;
   
   @JsonProperty(value = "datapathID")
   
   protected String datapathID;
   
   @JsonProperty(value = "derivedSSHServiceState")
   
   protected EDerivedSSHServiceState derivedSSHServiceState;
   
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
   
   @JsonProperty(value = "family")
   
   protected EFamily family;
   
   @JsonProperty(value = "functions")
   
   protected java.util.List<EFunctions> functions;
   
   @JsonProperty(value = "gatewayConfigRawVersion")
   
   protected String gatewayConfigRawVersion;
   
   @JsonProperty(value = "gatewayConfigVersion")
   
   protected String gatewayConfigVersion;
   
   @JsonProperty(value = "gatewayConnected")
   
   protected Boolean gatewayConnected;
   
   @JsonProperty(value = "inheritedSSHServiceState")
   
   protected EInheritedSSHServiceState inheritedSSHServiceState;
   
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
   
   protected ENetworkAcceleration networkAcceleration;
   
   @JsonProperty(value = "operationMode")
   
   protected String operationMode;
   
   @JsonProperty(value = "operationStatus")
   
   protected String operationStatus;
   
   @JsonProperty(value = "pending")
   
   protected Boolean pending;
   
   @JsonProperty(value = "permittedAction")
   
   protected EPermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   
   protected EPersonality personality;
   
   @JsonProperty(value = "productName")
   
   protected String productName;
   
   @JsonProperty(value = "redundancyGroupID")
   
   protected String redundancyGroupID;
   
   @JsonProperty(value = "serialNumber")
   
   protected String serialNumber;
   
   @JsonProperty(value = "syslogLevel")
   
   protected ESyslogLevel syslogLevel;
   
   @JsonProperty(value = "systemID")
   
   protected String systemID;
   
   @JsonProperty(value = "templateID")
   
   protected String templateID;
   
   @JsonProperty(value = "tunnelShaping")
   
   protected ETunnelShaping tunnelShaping;
   

   
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
   private NSGatewayMonitorsFetcher nSGatewayMonitors;
   
   @JsonIgnore
   private NSGatewaySummariesFetcher nSGatewaySummaries;
   
   @JsonIgnore
   private NSGInfosFetcher nSGInfos;
   
   @JsonIgnore
   private NSPortsFetcher nSPorts;
   
   @JsonIgnore
   private PatchsFetcher patchs;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private NSPortInfosFetcher nSPortInfos;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   
   @JsonIgnore
   private UplinkConnectionsFetcher uplinkConnections;
   
   @JsonIgnore
   private VNFsFetcher vNFs;
   
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
      
      nSGatewayMonitors = new NSGatewayMonitorsFetcher(this);
      
      nSGatewaySummaries = new NSGatewaySummariesFetcher(this);
      
      nSGInfos = new NSGInfosFetcher(this);
      
      nSPorts = new NSPortsFetcher(this);
      
      patchs = new PatchsFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      nSPortInfos = new NSPortInfosFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
      uplinkConnections = new UplinkConnectionsFetcher(this);
      
      vNFs = new VNFsFetcher(this);
      
      wirelessPorts = new WirelessPortsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAARApplicationReleaseDate() {
      return AARApplicationReleaseDate;
   }

   @JsonIgnore
   public void setAARApplicationReleaseDate(String value) { 
      this.AARApplicationReleaseDate = value;
   }
   
   
   @JsonIgnore
   public String getAARApplicationVersion() {
      return AARApplicationVersion;
   }

   @JsonIgnore
   public void setAARApplicationVersion(String value) { 
      this.AARApplicationVersion = value;
   }
   
   
   @JsonIgnore
   public String getBIOSReleaseDate() {
      return BIOSReleaseDate;
   }

   @JsonIgnore
   public void setBIOSReleaseDate(String value) { 
      this.BIOSReleaseDate = value;
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
   public ESSHService getSSHService() {
      return SSHService;
   }

   @JsonIgnore
   public void setSSHService(ESSHService value) { 
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
   public ETPMStatus getTPMStatus() {
      return TPMStatus;
   }

   @JsonIgnore
   public void setTPMStatus(ETPMStatus value) { 
      this.TPMStatus = value;
   }
   
   
   @JsonIgnore
   public String getTPMVersion() {
      return TPMVersion;
   }

   @JsonIgnore
   public void setTPMVersion(String value) { 
      this.TPMVersion = value;
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
   public String getVSDAARApplicationVersion() {
      return VSDAARApplicationVersion;
   }

   @JsonIgnore
   public void setVSDAARApplicationVersion(String value) { 
      this.VSDAARApplicationVersion = value;
   }
   
   
   @JsonIgnore
   public EZFBMatchAttribute getZFBMatchAttribute() {
      return ZFBMatchAttribute;
   }

   @JsonIgnore
   public void setZFBMatchAttribute(EZFBMatchAttribute value) { 
      this.ZFBMatchAttribute = value;
   }
   
   
   @JsonIgnore
   public String getZFBMatchValue() {
      return ZFBMatchValue;
   }

   @JsonIgnore
   public void setZFBMatchValue(String value) { 
      this.ZFBMatchValue = value;
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
   public String getAssociatedOverlayManagementProfileID() {
      return associatedOverlayManagementProfileID;
   }

   @JsonIgnore
   public void setAssociatedOverlayManagementProfileID(String value) { 
      this.associatedOverlayManagementProfileID = value;
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
   public EBootstrapStatus getBootstrapStatus() {
      return bootstrapStatus;
   }

   @JsonIgnore
   public void setBootstrapStatus(EBootstrapStatus value) { 
      this.bootstrapStatus = value;
   }
   
   
   @JsonIgnore
   public EConfigurationReloadState getConfigurationReloadState() {
      return configurationReloadState;
   }

   @JsonIgnore
   public void setConfigurationReloadState(EConfigurationReloadState value) { 
      this.configurationReloadState = value;
   }
   
   
   @JsonIgnore
   public EConfigurationStatus getConfigurationStatus() {
      return configurationStatus;
   }

   @JsonIgnore
   public void setConfigurationStatus(EConfigurationStatus value) { 
      this.configurationStatus = value;
   }
   
   
   @JsonIgnore
   public EConfigureLoadBalancing getConfigureLoadBalancing() {
      return configureLoadBalancing;
   }

   @JsonIgnore
   public void setConfigureLoadBalancing(EConfigureLoadBalancing value) { 
      this.configureLoadBalancing = value;
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
   public EDerivedSSHServiceState getDerivedSSHServiceState() {
      return derivedSSHServiceState;
   }

   @JsonIgnore
   public void setDerivedSSHServiceState(EDerivedSSHServiceState value) { 
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
   public EFamily getFamily() {
      return family;
   }

   @JsonIgnore
   public void setFamily(EFamily value) { 
      this.family = value;
   }
   
   
   @JsonIgnore
   public java.util.List<EFunctions> getFunctions() {
      return functions;
   }

   @JsonIgnore
   public void setFunctions(java.util.List<EFunctions> value) { 
      this.functions = value;
   }
   
   
   @JsonIgnore
   public String getGatewayConfigRawVersion() {
      return gatewayConfigRawVersion;
   }

   @JsonIgnore
   public void setGatewayConfigRawVersion(String value) { 
      this.gatewayConfigRawVersion = value;
   }
   
   
   @JsonIgnore
   public String getGatewayConfigVersion() {
      return gatewayConfigVersion;
   }

   @JsonIgnore
   public void setGatewayConfigVersion(String value) { 
      this.gatewayConfigVersion = value;
   }
   
   
   @JsonIgnore
   public Boolean getGatewayConnected() {
      return gatewayConnected;
   }

   @JsonIgnore
   public void setGatewayConnected(Boolean value) { 
      this.gatewayConnected = value;
   }
   
   
   @JsonIgnore
   public EInheritedSSHServiceState getInheritedSSHServiceState() {
      return inheritedSSHServiceState;
   }

   @JsonIgnore
   public void setInheritedSSHServiceState(EInheritedSSHServiceState value) { 
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
   public ENetworkAcceleration getNetworkAcceleration() {
      return networkAcceleration;
   }

   @JsonIgnore
   public void setNetworkAcceleration(ENetworkAcceleration value) { 
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
   public EPermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(EPermittedAction value) { 
      this.permittedAction = value;
   }
   
   
   @JsonIgnore
   public EPersonality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(EPersonality value) { 
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
   public ESyslogLevel getSyslogLevel() {
      return syslogLevel;
   }

   @JsonIgnore
   public void setSyslogLevel(ESyslogLevel value) { 
      this.syslogLevel = value;
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
   public ETunnelShaping getTunnelShaping() {
      return tunnelShaping;
   }

   @JsonIgnore
   public void setTunnelShaping(ETunnelShaping value) { 
      this.tunnelShaping = value;
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
   public NSGatewayMonitorsFetcher getNSGatewayMonitors() {
      return nSGatewayMonitors;
   }
   
   @JsonIgnore
   public NSGatewaySummariesFetcher getNSGatewaySummaries() {
      return nSGatewaySummaries;
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
   public PatchsFetcher getPatchs() {
      return patchs;
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
   public NSPortInfosFetcher getNSPortInfos() {
      return nSPortInfos;
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
   public VNFsFetcher getVNFs() {
      return vNFs;
   }
   
   @JsonIgnore
   public WirelessPortsFetcher getWirelessPorts() {
      return wirelessPorts;
   }
   

   public String toString() {
      return "NSGateway [" + "AARApplicationReleaseDate=" + AARApplicationReleaseDate + ", AARApplicationVersion=" + AARApplicationVersion + ", BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", NATTraversalEnabled=" + NATTraversalEnabled + ", NSGVersion=" + NSGVersion + ", SKU=" + SKU + ", SSHService=" + SSHService + ", TCPMSSEnabled=" + TCPMSSEnabled + ", TCPMaximumSegmentSize=" + TCPMaximumSegmentSize + ", TPMStatus=" + TPMStatus + ", TPMVersion=" + TPMVersion + ", UUID=" + UUID + ", VSDAARApplicationVersion=" + VSDAARApplicationVersion + ", ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchValue=" + ZFBMatchValue + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", associatedNSGInfoID=" + associatedNSGInfoID + ", associatedNSGUpgradeProfileID=" + associatedNSGUpgradeProfileID + ", associatedOverlayManagementProfileID=" + associatedOverlayManagementProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", configurationReloadState=" + configurationReloadState + ", configurationStatus=" + configurationStatus + ", configureLoadBalancing=" + configureLoadBalancing + ", controlTrafficCOSValue=" + controlTrafficCOSValue + ", controlTrafficDSCPValue=" + controlTrafficDSCPValue + ", datapathID=" + datapathID + ", derivedSSHServiceState=" + derivedSSHServiceState + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", functions=" + functions + ", gatewayConfigRawVersion=" + gatewayConfigRawVersion + ", gatewayConfigVersion=" + gatewayConfigVersion + ", gatewayConnected=" + gatewayConnected + ", inheritedSSHServiceState=" + inheritedSSHServiceState + ", lastConfigurationReloadTimestamp=" + lastConfigurationReloadTimestamp + ", lastUpdatedBy=" + lastUpdatedBy + ", libraries=" + libraries + ", locationID=" + locationID + ", name=" + name + ", networkAcceleration=" + networkAcceleration + ", operationMode=" + operationMode + ", operationStatus=" + operationStatus + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", productName=" + productName + ", redundancyGroupID=" + redundancyGroupID + ", serialNumber=" + serialNumber + ", syslogLevel=" + syslogLevel + ", systemID=" + systemID + ", templateID=" + templateID + ", tunnelShaping=" + tunnelShaping + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}