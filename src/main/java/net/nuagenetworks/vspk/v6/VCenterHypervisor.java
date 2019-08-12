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
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VRSAddressRangesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VRSMetricsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VRSRedeploymentpoliciesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vcenterhypervisor", resourceName = "vcenterhypervisors")
public class VCenterHypervisor extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EVRSState { DEPLOYED, DEPLOYING, NOT_DEPLOYED, TIMEDOUT, UPGRADING };
   public enum EAvrsProfile { AVRS_25G };
   public enum ECpuCount { DEFAULT_2, LARGE_6, MEDIUM_4, XLARGE_8 };
   public enum EDestinationMirrorPort { ens160, ens161, ens224, ens256, no_mirror };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EMemorySizeInGB { DEFAULT_4, LARGE_8, MEDIUM_6 };
   public enum EPersonality { VDF, VRS };
   public enum ERemoteSyslogServerType { NONE, TCP, UDP };

   
   @JsonProperty(value = "ARPReply")
   
   protected Boolean ARPReply;
   
   @JsonProperty(value = "VRSAgentMOID")
   
   protected String VRSAgentMOID;
   
   @JsonProperty(value = "VRSAgentName")
   
   protected String VRSAgentName;
   
   @JsonProperty(value = "VRSConfigurationTimeLimit")
   
   protected Long VRSConfigurationTimeLimit;
   
   @JsonProperty(value = "VRSMetricsID")
   
   protected String VRSMetricsID;
   
   @JsonProperty(value = "VRSMgmtHostname")
   
   protected String VRSMgmtHostname;
   
   @JsonProperty(value = "VRSState")
   
   protected EVRSState VRSState;
   
   @JsonProperty(value = "agencyMoid")
   
   protected String agencyMoid;
   
   @JsonProperty(value = "allowDataDHCP")
   
   protected Boolean allowDataDHCP;
   
   @JsonProperty(value = "allowMgmtDHCP")
   
   protected Boolean allowMgmtDHCP;
   
   @JsonProperty(value = "availableNetworks")
   
   protected java.util.List<String> availableNetworks;
   
   @JsonProperty(value = "avrsEnabled")
   
   protected Boolean avrsEnabled;
   
   @JsonProperty(value = "avrsProfile")
   
   protected EAvrsProfile avrsProfile;
   
   @JsonProperty(value = "configuredMetricsPushInterval")
   
   protected Long configuredMetricsPushInterval;
   
   @JsonProperty(value = "cpuCount")
   
   protected ECpuCount cpuCount;
   
   @JsonProperty(value = "customizedScriptURL")
   
   protected String customizedScriptURL;
   
   @JsonProperty(value = "dataDNS1")
   
   protected String dataDNS1;
   
   @JsonProperty(value = "dataDNS2")
   
   protected String dataDNS2;
   
   @JsonProperty(value = "dataGateway")
   
   protected String dataGateway;
   
   @JsonProperty(value = "dataIPAddress")
   
   protected String dataIPAddress;
   
   @JsonProperty(value = "dataNetmask")
   
   protected String dataNetmask;
   
   @JsonProperty(value = "dataNetworkPortgroup")
   
   protected String dataNetworkPortgroup;
   
   @JsonProperty(value = "datapathSyncTimeout")
   
   protected Long datapathSyncTimeout;
   
   @JsonProperty(value = "deploymentCount")
   
   protected Long deploymentCount;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "destinationMirrorPort")
   
   protected EDestinationMirrorPort destinationMirrorPort;
   
   @JsonProperty(value = "dhcpRelayServer")
   
   protected String dhcpRelayServer;
   
   @JsonProperty(value = "disableGROOnDatapath")
   
   protected Boolean disableGROOnDatapath;
   
   @JsonProperty(value = "disableLROOnDatapath")
   
   protected Boolean disableLROOnDatapath;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enableVRSResourceReservation")
   
   protected Boolean enableVRSResourceReservation;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "flowEvictionThreshold")
   
   protected Long flowEvictionThreshold;
   
   @JsonProperty(value = "genericSplitActivation")
   
   protected Boolean genericSplitActivation;
   
   @JsonProperty(value = "hypervisorIP")
   
   protected String hypervisorIP;
   
   @JsonProperty(value = "hypervisorPassword")
   
   protected String hypervisorPassword;
   
   @JsonProperty(value = "hypervisorUser")
   
   protected String hypervisorUser;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastVRSDeployedDate")
   
   protected Float lastVRSDeployedDate;
   
   @JsonProperty(value = "manageVRSAvailability")
   
   protected Boolean manageVRSAvailability;
   
   @JsonProperty(value = "managedObjectID")
   
   protected String managedObjectID;
   
   @JsonProperty(value = "memorySizeInGB")
   
   protected EMemorySizeInGB memorySizeInGB;
   
   @JsonProperty(value = "metadataServerIP")
   
   protected String metadataServerIP;
   
   @JsonProperty(value = "metadataServerListenPort")
   
   protected Long metadataServerListenPort;
   
   @JsonProperty(value = "metadataServerPort")
   
   protected Long metadataServerPort;
   
   @JsonProperty(value = "metadataServiceEnabled")
   
   protected Boolean metadataServiceEnabled;
   
   @JsonProperty(value = "mgmtDNS1")
   
   protected String mgmtDNS1;
   
   @JsonProperty(value = "mgmtDNS2")
   
   protected String mgmtDNS2;
   
   @JsonProperty(value = "mgmtGateway")
   
   protected String mgmtGateway;
   
   @JsonProperty(value = "mgmtIPAddress")
   
   protected String mgmtIPAddress;
   
   @JsonProperty(value = "mgmtNetmask")
   
   protected String mgmtNetmask;
   
   @JsonProperty(value = "mgmtNetworkPortgroup")
   
   protected String mgmtNetworkPortgroup;
   
   @JsonProperty(value = "mirrorNetworkPortgroup")
   
   protected String mirrorNetworkPortgroup;
   
   @JsonProperty(value = "mtu")
   
   protected Long mtu;
   
   @JsonProperty(value = "multiVMSsupport")
   
   protected Boolean multiVMSsupport;
   
   @JsonProperty(value = "multicastReceiveInterface")
   
   protected String multicastReceiveInterface;
   
   @JsonProperty(value = "multicastReceiveInterfaceIP")
   
   protected String multicastReceiveInterfaceIP;
   
   @JsonProperty(value = "multicastReceiveInterfaceNetmask")
   
   protected String multicastReceiveInterfaceNetmask;
   
   @JsonProperty(value = "multicastReceiveRange")
   
   protected String multicastReceiveRange;
   
   @JsonProperty(value = "multicastSendInterface")
   
   protected String multicastSendInterface;
   
   @JsonProperty(value = "multicastSendInterfaceIP")
   
   protected String multicastSendInterfaceIP;
   
   @JsonProperty(value = "multicastSendInterfaceNetmask")
   
   protected String multicastSendInterfaceNetmask;
   
   @JsonProperty(value = "multicastSourcePortgroup")
   
   protected String multicastSourcePortgroup;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "networkUplinkInterface")
   
   protected String networkUplinkInterface;
   
   @JsonProperty(value = "networkUplinkInterfaceGateway")
   
   protected String networkUplinkInterfaceGateway;
   
   @JsonProperty(value = "networkUplinkInterfaceIp")
   
   protected String networkUplinkInterfaceIp;
   
   @JsonProperty(value = "networkUplinkInterfaceNetmask")
   
   protected String networkUplinkInterfaceNetmask;
   
   @JsonProperty(value = "nfsLogServer")
   
   protected String nfsLogServer;
   
   @JsonProperty(value = "nfsMountPath")
   
   protected String nfsMountPath;
   
   @JsonProperty(value = "novaClientVersion")
   
   protected Long novaClientVersion;
   
   @JsonProperty(value = "novaIdentityURLVersion")
   
   protected String novaIdentityURLVersion;
   
   @JsonProperty(value = "novaMetadataServiceAuthUrl")
   
   protected String novaMetadataServiceAuthUrl;
   
   @JsonProperty(value = "novaMetadataServiceEndpoint")
   
   protected String novaMetadataServiceEndpoint;
   
   @JsonProperty(value = "novaMetadataServicePassword")
   
   protected String novaMetadataServicePassword;
   
   @JsonProperty(value = "novaMetadataServiceTenant")
   
   protected String novaMetadataServiceTenant;
   
   @JsonProperty(value = "novaMetadataServiceUsername")
   
   protected String novaMetadataServiceUsername;
   
   @JsonProperty(value = "novaMetadataSharedSecret")
   
   protected String novaMetadataSharedSecret;
   
   @JsonProperty(value = "novaOSKeystoneUsername")
   
   protected String novaOSKeystoneUsername;
   
   @JsonProperty(value = "novaProjectDomainName")
   
   protected String novaProjectDomainName;
   
   @JsonProperty(value = "novaProjectName")
   
   protected String novaProjectName;
   
   @JsonProperty(value = "novaRegionName")
   
   protected String novaRegionName;
   
   @JsonProperty(value = "novaUserDomainName")
   
   protected String novaUserDomainName;
   
   @JsonProperty(value = "ntpServer1")
   
   protected String ntpServer1;
   
   @JsonProperty(value = "ntpServer2")
   
   protected String ntpServer2;
   
   @JsonProperty(value = "ovfURL")
   
   protected String ovfURL;
   
   @JsonProperty(value = "personality")
   
   protected EPersonality personality;
   
   @JsonProperty(value = "portgroupMetadata")
   
   protected Boolean portgroupMetadata;
   
   @JsonProperty(value = "primaryDataUplinkUnderlayID")
   
   protected Long primaryDataUplinkUnderlayID;
   
   @JsonProperty(value = "primaryDataUplinkVDFControlVLAN")
   
   protected Long primaryDataUplinkVDFControlVLAN;
   
   @JsonProperty(value = "primaryNuageController")
   
   protected String primaryNuageController;
   
   @JsonProperty(value = "remoteSyslogServerIP")
   
   protected String remoteSyslogServerIP;
   
   @JsonProperty(value = "remoteSyslogServerPort")
   
   protected Long remoteSyslogServerPort;
   
   @JsonProperty(value = "remoteSyslogServerType")
   
   protected ERemoteSyslogServerType remoteSyslogServerType;
   
   @JsonProperty(value = "removedFromVCenterInventory")
   
   protected Boolean removedFromVCenterInventory;
   
   @JsonProperty(value = "revertiveControllerEnabled")
   
   protected Boolean revertiveControllerEnabled;
   
   @JsonProperty(value = "revertiveTimer")
   
   protected Long revertiveTimer;
   
   @JsonProperty(value = "scope")
   
   protected Boolean scope;
   
   @JsonProperty(value = "secondaryDataUplinkDHCPEnabled")
   
   protected Boolean secondaryDataUplinkDHCPEnabled;
   
   @JsonProperty(value = "secondaryDataUplinkEnabled")
   
   protected Boolean secondaryDataUplinkEnabled;
   
   @JsonProperty(value = "secondaryDataUplinkIP")
   
   protected String secondaryDataUplinkIP;
   
   @JsonProperty(value = "secondaryDataUplinkInterface")
   
   protected String secondaryDataUplinkInterface;
   
   @JsonProperty(value = "secondaryDataUplinkMTU")
   
   protected Long secondaryDataUplinkMTU;
   
   @JsonProperty(value = "secondaryDataUplinkNetmask")
   
   protected String secondaryDataUplinkNetmask;
   
   @JsonProperty(value = "secondaryDataUplinkPrimaryController")
   
   protected String secondaryDataUplinkPrimaryController;
   
   @JsonProperty(value = "secondaryDataUplinkSecondaryController")
   
   protected String secondaryDataUplinkSecondaryController;
   
   @JsonProperty(value = "secondaryDataUplinkUnderlayID")
   
   protected Long secondaryDataUplinkUnderlayID;
   
   @JsonProperty(value = "secondaryDataUplinkVDFControlVLAN")
   
   protected Long secondaryDataUplinkVDFControlVLAN;
   
   @JsonProperty(value = "secondaryNuageController")
   
   protected String secondaryNuageController;
   
   @JsonProperty(value = "separateDataNetwork")
   
   protected Boolean separateDataNetwork;
   
   @JsonProperty(value = "siteId")
   
   protected String siteId;
   
   @JsonProperty(value = "staticRoute")
   
   protected String staticRoute;
   
   @JsonProperty(value = "staticRouteGateway")
   
   protected String staticRouteGateway;
   
   @JsonProperty(value = "staticRouteNetmask")
   
   protected String staticRouteNetmask;
   
   @JsonProperty(value = "successfullyAppliedUpgradePackagePassword")
   
   protected String successfullyAppliedUpgradePackagePassword;
   
   @JsonProperty(value = "successfullyAppliedUpgradePackageURL")
   
   protected String successfullyAppliedUpgradePackageURL;
   
   @JsonProperty(value = "successfullyAppliedUpgradePackageUsername")
   
   protected String successfullyAppliedUpgradePackageUsername;
   
   @JsonProperty(value = "successfullyAppliedVersion")
   
   protected String successfullyAppliedVersion;
   
   @JsonProperty(value = "toolboxDeploymentMode")
   
   protected Boolean toolboxDeploymentMode;
   
   @JsonProperty(value = "toolboxGroup")
   
   protected String toolboxGroup;
   
   @JsonProperty(value = "toolboxIP")
   
   protected String toolboxIP;
   
   @JsonProperty(value = "toolboxPassword")
   
   protected String toolboxPassword;
   
   @JsonProperty(value = "toolboxUserName")
   
   protected String toolboxUserName;
   
   @JsonProperty(value = "upgradePackagePassword")
   
   protected String upgradePackagePassword;
   
   @JsonProperty(value = "upgradePackageURL")
   
   protected String upgradePackageURL;
   
   @JsonProperty(value = "upgradePackageUsername")
   
   protected String upgradePackageUsername;
   
   @JsonProperty(value = "upgradeScriptTimeLimit")
   
   protected Long upgradeScriptTimeLimit;
   
   @JsonProperty(value = "upgradeStatus")
   
   protected String upgradeStatus;
   
   @JsonProperty(value = "upgradeTimedout")
   
   protected Boolean upgradeTimedout;
   
   @JsonProperty(value = "vCenterIP")
   
   protected String vCenterIP;
   
   @JsonProperty(value = "vCenterPassword")
   
   protected String vCenterPassword;
   
   @JsonProperty(value = "vCenterUser")
   
   protected String vCenterUser;
   
   @JsonProperty(value = "vRequireNuageMetadata")
   
   protected Boolean vRequireNuageMetadata;
   
   @JsonProperty(value = "vmNetworkPortgroup")
   
   protected String vmNetworkPortgroup;
   
   @JsonProperty(value = "vrsId")
   
   protected String vrsId;
   
   @JsonProperty(value = "vrsMarkedAsAvailable")
   
   protected Boolean vrsMarkedAsAvailable;
   
   @JsonProperty(value = "vrsPassword")
   
   protected String vrsPassword;
   
   @JsonProperty(value = "vrsUserName")
   
   protected String vrsUserName;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VRSAddressRangesFetcher vRSAddressRanges;
   
   @JsonIgnore
   private VRSMetricsFetcher vRSMetrics;
   
   @JsonIgnore
   private VRSRedeploymentpoliciesFetcher vRSRedeploymentpolicies;
   

   public VCenterHypervisor() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vRSAddressRanges = new VRSAddressRangesFetcher(this);
      
      vRSMetrics = new VRSMetricsFetcher(this);
      
      vRSRedeploymentpolicies = new VRSRedeploymentpoliciesFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getARPReply() {
      return ARPReply;
   }

   @JsonIgnore
   public void setARPReply(Boolean value) { 
      this.ARPReply = value;
   }
   
   
   @JsonIgnore
   public String getVRSAgentMOID() {
      return VRSAgentMOID;
   }

   @JsonIgnore
   public void setVRSAgentMOID(String value) { 
      this.VRSAgentMOID = value;
   }
   
   
   @JsonIgnore
   public String getVRSAgentName() {
      return VRSAgentName;
   }

   @JsonIgnore
   public void setVRSAgentName(String value) { 
      this.VRSAgentName = value;
   }
   
   
   @JsonIgnore
   public Long getVRSConfigurationTimeLimit() {
      return VRSConfigurationTimeLimit;
   }

   @JsonIgnore
   public void setVRSConfigurationTimeLimit(Long value) { 
      this.VRSConfigurationTimeLimit = value;
   }
   
   
   @JsonIgnore
   public String getVRSMetricsID() {
      return VRSMetricsID;
   }

   @JsonIgnore
   public void setVRSMetricsID(String value) { 
      this.VRSMetricsID = value;
   }
   
   
   @JsonIgnore
   public String getVRSMgmtHostname() {
      return VRSMgmtHostname;
   }

   @JsonIgnore
   public void setVRSMgmtHostname(String value) { 
      this.VRSMgmtHostname = value;
   }
   
   
   @JsonIgnore
   public EVRSState getVRSState() {
      return VRSState;
   }

   @JsonIgnore
   public void setVRSState(EVRSState value) { 
      this.VRSState = value;
   }
   
   
   @JsonIgnore
   public String getAgencyMoid() {
      return agencyMoid;
   }

   @JsonIgnore
   public void setAgencyMoid(String value) { 
      this.agencyMoid = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowDataDHCP() {
      return allowDataDHCP;
   }

   @JsonIgnore
   public void setAllowDataDHCP(Boolean value) { 
      this.allowDataDHCP = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowMgmtDHCP() {
      return allowMgmtDHCP;
   }

   @JsonIgnore
   public void setAllowMgmtDHCP(Boolean value) { 
      this.allowMgmtDHCP = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getAvailableNetworks() {
      return availableNetworks;
   }

   @JsonIgnore
   public void setAvailableNetworks(java.util.List<String> value) { 
      this.availableNetworks = value;
   }
   
   
   @JsonIgnore
   public Boolean getAvrsEnabled() {
      return avrsEnabled;
   }

   @JsonIgnore
   public void setAvrsEnabled(Boolean value) { 
      this.avrsEnabled = value;
   }
   
   
   @JsonIgnore
   public EAvrsProfile getAvrsProfile() {
      return avrsProfile;
   }

   @JsonIgnore
   public void setAvrsProfile(EAvrsProfile value) { 
      this.avrsProfile = value;
   }
   
   
   @JsonIgnore
   public Long getConfiguredMetricsPushInterval() {
      return configuredMetricsPushInterval;
   }

   @JsonIgnore
   public void setConfiguredMetricsPushInterval(Long value) { 
      this.configuredMetricsPushInterval = value;
   }
   
   
   @JsonIgnore
   public ECpuCount getCpuCount() {
      return cpuCount;
   }

   @JsonIgnore
   public void setCpuCount(ECpuCount value) { 
      this.cpuCount = value;
   }
   
   
   @JsonIgnore
   public String getCustomizedScriptURL() {
      return customizedScriptURL;
   }

   @JsonIgnore
   public void setCustomizedScriptURL(String value) { 
      this.customizedScriptURL = value;
   }
   
   
   @JsonIgnore
   public String getDataDNS1() {
      return dataDNS1;
   }

   @JsonIgnore
   public void setDataDNS1(String value) { 
      this.dataDNS1 = value;
   }
   
   
   @JsonIgnore
   public String getDataDNS2() {
      return dataDNS2;
   }

   @JsonIgnore
   public void setDataDNS2(String value) { 
      this.dataDNS2 = value;
   }
   
   
   @JsonIgnore
   public String getDataGateway() {
      return dataGateway;
   }

   @JsonIgnore
   public void setDataGateway(String value) { 
      this.dataGateway = value;
   }
   
   
   @JsonIgnore
   public String getDataIPAddress() {
      return dataIPAddress;
   }

   @JsonIgnore
   public void setDataIPAddress(String value) { 
      this.dataIPAddress = value;
   }
   
   
   @JsonIgnore
   public String getDataNetmask() {
      return dataNetmask;
   }

   @JsonIgnore
   public void setDataNetmask(String value) { 
      this.dataNetmask = value;
   }
   
   
   @JsonIgnore
   public String getDataNetworkPortgroup() {
      return dataNetworkPortgroup;
   }

   @JsonIgnore
   public void setDataNetworkPortgroup(String value) { 
      this.dataNetworkPortgroup = value;
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
   public Long getDeploymentCount() {
      return deploymentCount;
   }

   @JsonIgnore
   public void setDeploymentCount(Long value) { 
      this.deploymentCount = value;
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
   public EDestinationMirrorPort getDestinationMirrorPort() {
      return destinationMirrorPort;
   }

   @JsonIgnore
   public void setDestinationMirrorPort(EDestinationMirrorPort value) { 
      this.destinationMirrorPort = value;
   }
   
   
   @JsonIgnore
   public String getDhcpRelayServer() {
      return dhcpRelayServer;
   }

   @JsonIgnore
   public void setDhcpRelayServer(String value) { 
      this.dhcpRelayServer = value;
   }
   
   
   @JsonIgnore
   public Boolean getDisableGROOnDatapath() {
      return disableGROOnDatapath;
   }

   @JsonIgnore
   public void setDisableGROOnDatapath(Boolean value) { 
      this.disableGROOnDatapath = value;
   }
   
   
   @JsonIgnore
   public Boolean getDisableLROOnDatapath() {
      return disableLROOnDatapath;
   }

   @JsonIgnore
   public void setDisableLROOnDatapath(Boolean value) { 
      this.disableLROOnDatapath = value;
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
   public Boolean getEnableVRSResourceReservation() {
      return enableVRSResourceReservation;
   }

   @JsonIgnore
   public void setEnableVRSResourceReservation(Boolean value) { 
      this.enableVRSResourceReservation = value;
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
   public Boolean getGenericSplitActivation() {
      return genericSplitActivation;
   }

   @JsonIgnore
   public void setGenericSplitActivation(Boolean value) { 
      this.genericSplitActivation = value;
   }
   
   
   @JsonIgnore
   public String getHypervisorIP() {
      return hypervisorIP;
   }

   @JsonIgnore
   public void setHypervisorIP(String value) { 
      this.hypervisorIP = value;
   }
   
   
   @JsonIgnore
   public String getHypervisorPassword() {
      return hypervisorPassword;
   }

   @JsonIgnore
   public void setHypervisorPassword(String value) { 
      this.hypervisorPassword = value;
   }
   
   
   @JsonIgnore
   public String getHypervisorUser() {
      return hypervisorUser;
   }

   @JsonIgnore
   public void setHypervisorUser(String value) { 
      this.hypervisorUser = value;
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
   public Float getLastVRSDeployedDate() {
      return lastVRSDeployedDate;
   }

   @JsonIgnore
   public void setLastVRSDeployedDate(Float value) { 
      this.lastVRSDeployedDate = value;
   }
   
   
   @JsonIgnore
   public Boolean getManageVRSAvailability() {
      return manageVRSAvailability;
   }

   @JsonIgnore
   public void setManageVRSAvailability(Boolean value) { 
      this.manageVRSAvailability = value;
   }
   
   
   @JsonIgnore
   public String getManagedObjectID() {
      return managedObjectID;
   }

   @JsonIgnore
   public void setManagedObjectID(String value) { 
      this.managedObjectID = value;
   }
   
   
   @JsonIgnore
   public EMemorySizeInGB getMemorySizeInGB() {
      return memorySizeInGB;
   }

   @JsonIgnore
   public void setMemorySizeInGB(EMemorySizeInGB value) { 
      this.memorySizeInGB = value;
   }
   
   
   @JsonIgnore
   public String getMetadataServerIP() {
      return metadataServerIP;
   }

   @JsonIgnore
   public void setMetadataServerIP(String value) { 
      this.metadataServerIP = value;
   }
   
   
   @JsonIgnore
   public Long getMetadataServerListenPort() {
      return metadataServerListenPort;
   }

   @JsonIgnore
   public void setMetadataServerListenPort(Long value) { 
      this.metadataServerListenPort = value;
   }
   
   
   @JsonIgnore
   public Long getMetadataServerPort() {
      return metadataServerPort;
   }

   @JsonIgnore
   public void setMetadataServerPort(Long value) { 
      this.metadataServerPort = value;
   }
   
   
   @JsonIgnore
   public Boolean getMetadataServiceEnabled() {
      return metadataServiceEnabled;
   }

   @JsonIgnore
   public void setMetadataServiceEnabled(Boolean value) { 
      this.metadataServiceEnabled = value;
   }
   
   
   @JsonIgnore
   public String getMgmtDNS1() {
      return mgmtDNS1;
   }

   @JsonIgnore
   public void setMgmtDNS1(String value) { 
      this.mgmtDNS1 = value;
   }
   
   
   @JsonIgnore
   public String getMgmtDNS2() {
      return mgmtDNS2;
   }

   @JsonIgnore
   public void setMgmtDNS2(String value) { 
      this.mgmtDNS2 = value;
   }
   
   
   @JsonIgnore
   public String getMgmtGateway() {
      return mgmtGateway;
   }

   @JsonIgnore
   public void setMgmtGateway(String value) { 
      this.mgmtGateway = value;
   }
   
   
   @JsonIgnore
   public String getMgmtIPAddress() {
      return mgmtIPAddress;
   }

   @JsonIgnore
   public void setMgmtIPAddress(String value) { 
      this.mgmtIPAddress = value;
   }
   
   
   @JsonIgnore
   public String getMgmtNetmask() {
      return mgmtNetmask;
   }

   @JsonIgnore
   public void setMgmtNetmask(String value) { 
      this.mgmtNetmask = value;
   }
   
   
   @JsonIgnore
   public String getMgmtNetworkPortgroup() {
      return mgmtNetworkPortgroup;
   }

   @JsonIgnore
   public void setMgmtNetworkPortgroup(String value) { 
      this.mgmtNetworkPortgroup = value;
   }
   
   
   @JsonIgnore
   public String getMirrorNetworkPortgroup() {
      return mirrorNetworkPortgroup;
   }

   @JsonIgnore
   public void setMirrorNetworkPortgroup(String value) { 
      this.mirrorNetworkPortgroup = value;
   }
   
   
   @JsonIgnore
   public Long getMtu() {
      return mtu;
   }

   @JsonIgnore
   public void setMtu(Long value) { 
      this.mtu = value;
   }
   
   
   @JsonIgnore
   public Boolean getMultiVMSsupport() {
      return multiVMSsupport;
   }

   @JsonIgnore
   public void setMultiVMSsupport(Boolean value) { 
      this.multiVMSsupport = value;
   }
   
   
   @JsonIgnore
   public String getMulticastReceiveInterface() {
      return multicastReceiveInterface;
   }

   @JsonIgnore
   public void setMulticastReceiveInterface(String value) { 
      this.multicastReceiveInterface = value;
   }
   
   
   @JsonIgnore
   public String getMulticastReceiveInterfaceIP() {
      return multicastReceiveInterfaceIP;
   }

   @JsonIgnore
   public void setMulticastReceiveInterfaceIP(String value) { 
      this.multicastReceiveInterfaceIP = value;
   }
   
   
   @JsonIgnore
   public String getMulticastReceiveInterfaceNetmask() {
      return multicastReceiveInterfaceNetmask;
   }

   @JsonIgnore
   public void setMulticastReceiveInterfaceNetmask(String value) { 
      this.multicastReceiveInterfaceNetmask = value;
   }
   
   
   @JsonIgnore
   public String getMulticastReceiveRange() {
      return multicastReceiveRange;
   }

   @JsonIgnore
   public void setMulticastReceiveRange(String value) { 
      this.multicastReceiveRange = value;
   }
   
   
   @JsonIgnore
   public String getMulticastSendInterface() {
      return multicastSendInterface;
   }

   @JsonIgnore
   public void setMulticastSendInterface(String value) { 
      this.multicastSendInterface = value;
   }
   
   
   @JsonIgnore
   public String getMulticastSendInterfaceIP() {
      return multicastSendInterfaceIP;
   }

   @JsonIgnore
   public void setMulticastSendInterfaceIP(String value) { 
      this.multicastSendInterfaceIP = value;
   }
   
   
   @JsonIgnore
   public String getMulticastSendInterfaceNetmask() {
      return multicastSendInterfaceNetmask;
   }

   @JsonIgnore
   public void setMulticastSendInterfaceNetmask(String value) { 
      this.multicastSendInterfaceNetmask = value;
   }
   
   
   @JsonIgnore
   public String getMulticastSourcePortgroup() {
      return multicastSourcePortgroup;
   }

   @JsonIgnore
   public void setMulticastSourcePortgroup(String value) { 
      this.multicastSourcePortgroup = value;
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
   public String getNetworkUplinkInterface() {
      return networkUplinkInterface;
   }

   @JsonIgnore
   public void setNetworkUplinkInterface(String value) { 
      this.networkUplinkInterface = value;
   }
   
   
   @JsonIgnore
   public String getNetworkUplinkInterfaceGateway() {
      return networkUplinkInterfaceGateway;
   }

   @JsonIgnore
   public void setNetworkUplinkInterfaceGateway(String value) { 
      this.networkUplinkInterfaceGateway = value;
   }
   
   
   @JsonIgnore
   public String getNetworkUplinkInterfaceIp() {
      return networkUplinkInterfaceIp;
   }

   @JsonIgnore
   public void setNetworkUplinkInterfaceIp(String value) { 
      this.networkUplinkInterfaceIp = value;
   }
   
   
   @JsonIgnore
   public String getNetworkUplinkInterfaceNetmask() {
      return networkUplinkInterfaceNetmask;
   }

   @JsonIgnore
   public void setNetworkUplinkInterfaceNetmask(String value) { 
      this.networkUplinkInterfaceNetmask = value;
   }
   
   
   @JsonIgnore
   public String getNfsLogServer() {
      return nfsLogServer;
   }

   @JsonIgnore
   public void setNfsLogServer(String value) { 
      this.nfsLogServer = value;
   }
   
   
   @JsonIgnore
   public String getNfsMountPath() {
      return nfsMountPath;
   }

   @JsonIgnore
   public void setNfsMountPath(String value) { 
      this.nfsMountPath = value;
   }
   
   
   @JsonIgnore
   public Long getNovaClientVersion() {
      return novaClientVersion;
   }

   @JsonIgnore
   public void setNovaClientVersion(Long value) { 
      this.novaClientVersion = value;
   }
   
   
   @JsonIgnore
   public String getNovaIdentityURLVersion() {
      return novaIdentityURLVersion;
   }

   @JsonIgnore
   public void setNovaIdentityURLVersion(String value) { 
      this.novaIdentityURLVersion = value;
   }
   
   
   @JsonIgnore
   public String getNovaMetadataServiceAuthUrl() {
      return novaMetadataServiceAuthUrl;
   }

   @JsonIgnore
   public void setNovaMetadataServiceAuthUrl(String value) { 
      this.novaMetadataServiceAuthUrl = value;
   }
   
   
   @JsonIgnore
   public String getNovaMetadataServiceEndpoint() {
      return novaMetadataServiceEndpoint;
   }

   @JsonIgnore
   public void setNovaMetadataServiceEndpoint(String value) { 
      this.novaMetadataServiceEndpoint = value;
   }
   
   
   @JsonIgnore
   public String getNovaMetadataServicePassword() {
      return novaMetadataServicePassword;
   }

   @JsonIgnore
   public void setNovaMetadataServicePassword(String value) { 
      this.novaMetadataServicePassword = value;
   }
   
   
   @JsonIgnore
   public String getNovaMetadataServiceTenant() {
      return novaMetadataServiceTenant;
   }

   @JsonIgnore
   public void setNovaMetadataServiceTenant(String value) { 
      this.novaMetadataServiceTenant = value;
   }
   
   
   @JsonIgnore
   public String getNovaMetadataServiceUsername() {
      return novaMetadataServiceUsername;
   }

   @JsonIgnore
   public void setNovaMetadataServiceUsername(String value) { 
      this.novaMetadataServiceUsername = value;
   }
   
   
   @JsonIgnore
   public String getNovaMetadataSharedSecret() {
      return novaMetadataSharedSecret;
   }

   @JsonIgnore
   public void setNovaMetadataSharedSecret(String value) { 
      this.novaMetadataSharedSecret = value;
   }
   
   
   @JsonIgnore
   public String getNovaOSKeystoneUsername() {
      return novaOSKeystoneUsername;
   }

   @JsonIgnore
   public void setNovaOSKeystoneUsername(String value) { 
      this.novaOSKeystoneUsername = value;
   }
   
   
   @JsonIgnore
   public String getNovaProjectDomainName() {
      return novaProjectDomainName;
   }

   @JsonIgnore
   public void setNovaProjectDomainName(String value) { 
      this.novaProjectDomainName = value;
   }
   
   
   @JsonIgnore
   public String getNovaProjectName() {
      return novaProjectName;
   }

   @JsonIgnore
   public void setNovaProjectName(String value) { 
      this.novaProjectName = value;
   }
   
   
   @JsonIgnore
   public String getNovaRegionName() {
      return novaRegionName;
   }

   @JsonIgnore
   public void setNovaRegionName(String value) { 
      this.novaRegionName = value;
   }
   
   
   @JsonIgnore
   public String getNovaUserDomainName() {
      return novaUserDomainName;
   }

   @JsonIgnore
   public void setNovaUserDomainName(String value) { 
      this.novaUserDomainName = value;
   }
   
   
   @JsonIgnore
   public String getNtpServer1() {
      return ntpServer1;
   }

   @JsonIgnore
   public void setNtpServer1(String value) { 
      this.ntpServer1 = value;
   }
   
   
   @JsonIgnore
   public String getNtpServer2() {
      return ntpServer2;
   }

   @JsonIgnore
   public void setNtpServer2(String value) { 
      this.ntpServer2 = value;
   }
   
   
   @JsonIgnore
   public String getOvfURL() {
      return ovfURL;
   }

   @JsonIgnore
   public void setOvfURL(String value) { 
      this.ovfURL = value;
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
   public Boolean getPortgroupMetadata() {
      return portgroupMetadata;
   }

   @JsonIgnore
   public void setPortgroupMetadata(Boolean value) { 
      this.portgroupMetadata = value;
   }
   
   
   @JsonIgnore
   public Long getPrimaryDataUplinkUnderlayID() {
      return primaryDataUplinkUnderlayID;
   }

   @JsonIgnore
   public void setPrimaryDataUplinkUnderlayID(Long value) { 
      this.primaryDataUplinkUnderlayID = value;
   }
   
   
   @JsonIgnore
   public Long getPrimaryDataUplinkVDFControlVLAN() {
      return primaryDataUplinkVDFControlVLAN;
   }

   @JsonIgnore
   public void setPrimaryDataUplinkVDFControlVLAN(Long value) { 
      this.primaryDataUplinkVDFControlVLAN = value;
   }
   
   
   @JsonIgnore
   public String getPrimaryNuageController() {
      return primaryNuageController;
   }

   @JsonIgnore
   public void setPrimaryNuageController(String value) { 
      this.primaryNuageController = value;
   }
   
   
   @JsonIgnore
   public String getRemoteSyslogServerIP() {
      return remoteSyslogServerIP;
   }

   @JsonIgnore
   public void setRemoteSyslogServerIP(String value) { 
      this.remoteSyslogServerIP = value;
   }
   
   
   @JsonIgnore
   public Long getRemoteSyslogServerPort() {
      return remoteSyslogServerPort;
   }

   @JsonIgnore
   public void setRemoteSyslogServerPort(Long value) { 
      this.remoteSyslogServerPort = value;
   }
   
   
   @JsonIgnore
   public ERemoteSyslogServerType getRemoteSyslogServerType() {
      return remoteSyslogServerType;
   }

   @JsonIgnore
   public void setRemoteSyslogServerType(ERemoteSyslogServerType value) { 
      this.remoteSyslogServerType = value;
   }
   
   
   @JsonIgnore
   public Boolean getRemovedFromVCenterInventory() {
      return removedFromVCenterInventory;
   }

   @JsonIgnore
   public void setRemovedFromVCenterInventory(Boolean value) { 
      this.removedFromVCenterInventory = value;
   }
   
   
   @JsonIgnore
   public Boolean getRevertiveControllerEnabled() {
      return revertiveControllerEnabled;
   }

   @JsonIgnore
   public void setRevertiveControllerEnabled(Boolean value) { 
      this.revertiveControllerEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getRevertiveTimer() {
      return revertiveTimer;
   }

   @JsonIgnore
   public void setRevertiveTimer(Long value) { 
      this.revertiveTimer = value;
   }
   
   
   @JsonIgnore
   public Boolean getScope() {
      return scope;
   }

   @JsonIgnore
   public void setScope(Boolean value) { 
      this.scope = value;
   }
   
   
   @JsonIgnore
   public Boolean getSecondaryDataUplinkDHCPEnabled() {
      return secondaryDataUplinkDHCPEnabled;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkDHCPEnabled(Boolean value) { 
      this.secondaryDataUplinkDHCPEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getSecondaryDataUplinkEnabled() {
      return secondaryDataUplinkEnabled;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkEnabled(Boolean value) { 
      this.secondaryDataUplinkEnabled = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryDataUplinkIP() {
      return secondaryDataUplinkIP;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkIP(String value) { 
      this.secondaryDataUplinkIP = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryDataUplinkInterface() {
      return secondaryDataUplinkInterface;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkInterface(String value) { 
      this.secondaryDataUplinkInterface = value;
   }
   
   
   @JsonIgnore
   public Long getSecondaryDataUplinkMTU() {
      return secondaryDataUplinkMTU;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkMTU(Long value) { 
      this.secondaryDataUplinkMTU = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryDataUplinkNetmask() {
      return secondaryDataUplinkNetmask;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkNetmask(String value) { 
      this.secondaryDataUplinkNetmask = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryDataUplinkPrimaryController() {
      return secondaryDataUplinkPrimaryController;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkPrimaryController(String value) { 
      this.secondaryDataUplinkPrimaryController = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryDataUplinkSecondaryController() {
      return secondaryDataUplinkSecondaryController;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkSecondaryController(String value) { 
      this.secondaryDataUplinkSecondaryController = value;
   }
   
   
   @JsonIgnore
   public Long getSecondaryDataUplinkUnderlayID() {
      return secondaryDataUplinkUnderlayID;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkUnderlayID(Long value) { 
      this.secondaryDataUplinkUnderlayID = value;
   }
   
   
   @JsonIgnore
   public Long getSecondaryDataUplinkVDFControlVLAN() {
      return secondaryDataUplinkVDFControlVLAN;
   }

   @JsonIgnore
   public void setSecondaryDataUplinkVDFControlVLAN(Long value) { 
      this.secondaryDataUplinkVDFControlVLAN = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryNuageController() {
      return secondaryNuageController;
   }

   @JsonIgnore
   public void setSecondaryNuageController(String value) { 
      this.secondaryNuageController = value;
   }
   
   
   @JsonIgnore
   public Boolean getSeparateDataNetwork() {
      return separateDataNetwork;
   }

   @JsonIgnore
   public void setSeparateDataNetwork(Boolean value) { 
      this.separateDataNetwork = value;
   }
   
   
   @JsonIgnore
   public String getSiteId() {
      return siteId;
   }

   @JsonIgnore
   public void setSiteId(String value) { 
      this.siteId = value;
   }
   
   
   @JsonIgnore
   public String getStaticRoute() {
      return staticRoute;
   }

   @JsonIgnore
   public void setStaticRoute(String value) { 
      this.staticRoute = value;
   }
   
   
   @JsonIgnore
   public String getStaticRouteGateway() {
      return staticRouteGateway;
   }

   @JsonIgnore
   public void setStaticRouteGateway(String value) { 
      this.staticRouteGateway = value;
   }
   
   
   @JsonIgnore
   public String getStaticRouteNetmask() {
      return staticRouteNetmask;
   }

   @JsonIgnore
   public void setStaticRouteNetmask(String value) { 
      this.staticRouteNetmask = value;
   }
   
   
   @JsonIgnore
   public String getSuccessfullyAppliedUpgradePackagePassword() {
      return successfullyAppliedUpgradePackagePassword;
   }

   @JsonIgnore
   public void setSuccessfullyAppliedUpgradePackagePassword(String value) { 
      this.successfullyAppliedUpgradePackagePassword = value;
   }
   
   
   @JsonIgnore
   public String getSuccessfullyAppliedUpgradePackageURL() {
      return successfullyAppliedUpgradePackageURL;
   }

   @JsonIgnore
   public void setSuccessfullyAppliedUpgradePackageURL(String value) { 
      this.successfullyAppliedUpgradePackageURL = value;
   }
   
   
   @JsonIgnore
   public String getSuccessfullyAppliedUpgradePackageUsername() {
      return successfullyAppliedUpgradePackageUsername;
   }

   @JsonIgnore
   public void setSuccessfullyAppliedUpgradePackageUsername(String value) { 
      this.successfullyAppliedUpgradePackageUsername = value;
   }
   
   
   @JsonIgnore
   public String getSuccessfullyAppliedVersion() {
      return successfullyAppliedVersion;
   }

   @JsonIgnore
   public void setSuccessfullyAppliedVersion(String value) { 
      this.successfullyAppliedVersion = value;
   }
   
   
   @JsonIgnore
   public Boolean getToolboxDeploymentMode() {
      return toolboxDeploymentMode;
   }

   @JsonIgnore
   public void setToolboxDeploymentMode(Boolean value) { 
      this.toolboxDeploymentMode = value;
   }
   
   
   @JsonIgnore
   public String getToolboxGroup() {
      return toolboxGroup;
   }

   @JsonIgnore
   public void setToolboxGroup(String value) { 
      this.toolboxGroup = value;
   }
   
   
   @JsonIgnore
   public String getToolboxIP() {
      return toolboxIP;
   }

   @JsonIgnore
   public void setToolboxIP(String value) { 
      this.toolboxIP = value;
   }
   
   
   @JsonIgnore
   public String getToolboxPassword() {
      return toolboxPassword;
   }

   @JsonIgnore
   public void setToolboxPassword(String value) { 
      this.toolboxPassword = value;
   }
   
   
   @JsonIgnore
   public String getToolboxUserName() {
      return toolboxUserName;
   }

   @JsonIgnore
   public void setToolboxUserName(String value) { 
      this.toolboxUserName = value;
   }
   
   
   @JsonIgnore
   public String getUpgradePackagePassword() {
      return upgradePackagePassword;
   }

   @JsonIgnore
   public void setUpgradePackagePassword(String value) { 
      this.upgradePackagePassword = value;
   }
   
   
   @JsonIgnore
   public String getUpgradePackageURL() {
      return upgradePackageURL;
   }

   @JsonIgnore
   public void setUpgradePackageURL(String value) { 
      this.upgradePackageURL = value;
   }
   
   
   @JsonIgnore
   public String getUpgradePackageUsername() {
      return upgradePackageUsername;
   }

   @JsonIgnore
   public void setUpgradePackageUsername(String value) { 
      this.upgradePackageUsername = value;
   }
   
   
   @JsonIgnore
   public Long getUpgradeScriptTimeLimit() {
      return upgradeScriptTimeLimit;
   }

   @JsonIgnore
   public void setUpgradeScriptTimeLimit(Long value) { 
      this.upgradeScriptTimeLimit = value;
   }
   
   
   @JsonIgnore
   public String getUpgradeStatus() {
      return upgradeStatus;
   }

   @JsonIgnore
   public void setUpgradeStatus(String value) { 
      this.upgradeStatus = value;
   }
   
   
   @JsonIgnore
   public Boolean getUpgradeTimedout() {
      return upgradeTimedout;
   }

   @JsonIgnore
   public void setUpgradeTimedout(Boolean value) { 
      this.upgradeTimedout = value;
   }
   
   
   @JsonIgnore
   public String getVCenterIP() {
      return vCenterIP;
   }

   @JsonIgnore
   public void setVCenterIP(String value) { 
      this.vCenterIP = value;
   }
   
   
   @JsonIgnore
   public String getVCenterPassword() {
      return vCenterPassword;
   }

   @JsonIgnore
   public void setVCenterPassword(String value) { 
      this.vCenterPassword = value;
   }
   
   
   @JsonIgnore
   public String getVCenterUser() {
      return vCenterUser;
   }

   @JsonIgnore
   public void setVCenterUser(String value) { 
      this.vCenterUser = value;
   }
   
   
   @JsonIgnore
   public Boolean getVRequireNuageMetadata() {
      return vRequireNuageMetadata;
   }

   @JsonIgnore
   public void setVRequireNuageMetadata(Boolean value) { 
      this.vRequireNuageMetadata = value;
   }
   
   
   @JsonIgnore
   public String getVmNetworkPortgroup() {
      return vmNetworkPortgroup;
   }

   @JsonIgnore
   public void setVmNetworkPortgroup(String value) { 
      this.vmNetworkPortgroup = value;
   }
   
   
   @JsonIgnore
   public String getVrsId() {
      return vrsId;
   }

   @JsonIgnore
   public void setVrsId(String value) { 
      this.vrsId = value;
   }
   
   
   @JsonIgnore
   public Boolean getVrsMarkedAsAvailable() {
      return vrsMarkedAsAvailable;
   }

   @JsonIgnore
   public void setVrsMarkedAsAvailable(Boolean value) { 
      this.vrsMarkedAsAvailable = value;
   }
   
   
   @JsonIgnore
   public String getVrsPassword() {
      return vrsPassword;
   }

   @JsonIgnore
   public void setVrsPassword(String value) { 
      this.vrsPassword = value;
   }
   
   
   @JsonIgnore
   public String getVrsUserName() {
      return vrsUserName;
   }

   @JsonIgnore
   public void setVrsUserName(String value) { 
      this.vrsUserName = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public VRSAddressRangesFetcher getVRSAddressRanges() {
      return vRSAddressRanges;
   }
   
   @JsonIgnore
   public VRSMetricsFetcher getVRSMetrics() {
      return vRSMetrics;
   }
   
   @JsonIgnore
   public VRSRedeploymentpoliciesFetcher getVRSRedeploymentpolicies() {
      return vRSRedeploymentpolicies;
   }
   

   public String toString() {
      return "VCenterHypervisor [" + "ARPReply=" + ARPReply + ", VRSAgentMOID=" + VRSAgentMOID + ", VRSAgentName=" + VRSAgentName + ", VRSConfigurationTimeLimit=" + VRSConfigurationTimeLimit + ", VRSMetricsID=" + VRSMetricsID + ", VRSMgmtHostname=" + VRSMgmtHostname + ", VRSState=" + VRSState + ", agencyMoid=" + agencyMoid + ", allowDataDHCP=" + allowDataDHCP + ", allowMgmtDHCP=" + allowMgmtDHCP + ", availableNetworks=" + availableNetworks + ", avrsEnabled=" + avrsEnabled + ", avrsProfile=" + avrsProfile + ", configuredMetricsPushInterval=" + configuredMetricsPushInterval + ", cpuCount=" + cpuCount + ", customizedScriptURL=" + customizedScriptURL + ", dataDNS1=" + dataDNS1 + ", dataDNS2=" + dataDNS2 + ", dataGateway=" + dataGateway + ", dataIPAddress=" + dataIPAddress + ", dataNetmask=" + dataNetmask + ", dataNetworkPortgroup=" + dataNetworkPortgroup + ", datapathSyncTimeout=" + datapathSyncTimeout + ", deploymentCount=" + deploymentCount + ", description=" + description + ", destinationMirrorPort=" + destinationMirrorPort + ", dhcpRelayServer=" + dhcpRelayServer + ", disableGROOnDatapath=" + disableGROOnDatapath + ", disableLROOnDatapath=" + disableLROOnDatapath + ", embeddedMetadata=" + embeddedMetadata + ", enableVRSResourceReservation=" + enableVRSResourceReservation + ", entityScope=" + entityScope + ", externalID=" + externalID + ", flowEvictionThreshold=" + flowEvictionThreshold + ", genericSplitActivation=" + genericSplitActivation + ", hypervisorIP=" + hypervisorIP + ", hypervisorPassword=" + hypervisorPassword + ", hypervisorUser=" + hypervisorUser + ", lastUpdatedBy=" + lastUpdatedBy + ", lastVRSDeployedDate=" + lastVRSDeployedDate + ", manageVRSAvailability=" + manageVRSAvailability + ", managedObjectID=" + managedObjectID + ", memorySizeInGB=" + memorySizeInGB + ", metadataServerIP=" + metadataServerIP + ", metadataServerListenPort=" + metadataServerListenPort + ", metadataServerPort=" + metadataServerPort + ", metadataServiceEnabled=" + metadataServiceEnabled + ", mgmtDNS1=" + mgmtDNS1 + ", mgmtDNS2=" + mgmtDNS2 + ", mgmtGateway=" + mgmtGateway + ", mgmtIPAddress=" + mgmtIPAddress + ", mgmtNetmask=" + mgmtNetmask + ", mgmtNetworkPortgroup=" + mgmtNetworkPortgroup + ", mirrorNetworkPortgroup=" + mirrorNetworkPortgroup + ", mtu=" + mtu + ", multiVMSsupport=" + multiVMSsupport + ", multicastReceiveInterface=" + multicastReceiveInterface + ", multicastReceiveInterfaceIP=" + multicastReceiveInterfaceIP + ", multicastReceiveInterfaceNetmask=" + multicastReceiveInterfaceNetmask + ", multicastReceiveRange=" + multicastReceiveRange + ", multicastSendInterface=" + multicastSendInterface + ", multicastSendInterfaceIP=" + multicastSendInterfaceIP + ", multicastSendInterfaceNetmask=" + multicastSendInterfaceNetmask + ", multicastSourcePortgroup=" + multicastSourcePortgroup + ", name=" + name + ", networkUplinkInterface=" + networkUplinkInterface + ", networkUplinkInterfaceGateway=" + networkUplinkInterfaceGateway + ", networkUplinkInterfaceIp=" + networkUplinkInterfaceIp + ", networkUplinkInterfaceNetmask=" + networkUplinkInterfaceNetmask + ", nfsLogServer=" + nfsLogServer + ", nfsMountPath=" + nfsMountPath + ", novaClientVersion=" + novaClientVersion + ", novaIdentityURLVersion=" + novaIdentityURLVersion + ", novaMetadataServiceAuthUrl=" + novaMetadataServiceAuthUrl + ", novaMetadataServiceEndpoint=" + novaMetadataServiceEndpoint + ", novaMetadataServicePassword=" + novaMetadataServicePassword + ", novaMetadataServiceTenant=" + novaMetadataServiceTenant + ", novaMetadataServiceUsername=" + novaMetadataServiceUsername + ", novaMetadataSharedSecret=" + novaMetadataSharedSecret + ", novaOSKeystoneUsername=" + novaOSKeystoneUsername + ", novaProjectDomainName=" + novaProjectDomainName + ", novaProjectName=" + novaProjectName + ", novaRegionName=" + novaRegionName + ", novaUserDomainName=" + novaUserDomainName + ", ntpServer1=" + ntpServer1 + ", ntpServer2=" + ntpServer2 + ", ovfURL=" + ovfURL + ", personality=" + personality + ", portgroupMetadata=" + portgroupMetadata + ", primaryDataUplinkUnderlayID=" + primaryDataUplinkUnderlayID + ", primaryDataUplinkVDFControlVLAN=" + primaryDataUplinkVDFControlVLAN + ", primaryNuageController=" + primaryNuageController + ", remoteSyslogServerIP=" + remoteSyslogServerIP + ", remoteSyslogServerPort=" + remoteSyslogServerPort + ", remoteSyslogServerType=" + remoteSyslogServerType + ", removedFromVCenterInventory=" + removedFromVCenterInventory + ", revertiveControllerEnabled=" + revertiveControllerEnabled + ", revertiveTimer=" + revertiveTimer + ", scope=" + scope + ", secondaryDataUplinkDHCPEnabled=" + secondaryDataUplinkDHCPEnabled + ", secondaryDataUplinkEnabled=" + secondaryDataUplinkEnabled + ", secondaryDataUplinkIP=" + secondaryDataUplinkIP + ", secondaryDataUplinkInterface=" + secondaryDataUplinkInterface + ", secondaryDataUplinkMTU=" + secondaryDataUplinkMTU + ", secondaryDataUplinkNetmask=" + secondaryDataUplinkNetmask + ", secondaryDataUplinkPrimaryController=" + secondaryDataUplinkPrimaryController + ", secondaryDataUplinkSecondaryController=" + secondaryDataUplinkSecondaryController + ", secondaryDataUplinkUnderlayID=" + secondaryDataUplinkUnderlayID + ", secondaryDataUplinkVDFControlVLAN=" + secondaryDataUplinkVDFControlVLAN + ", secondaryNuageController=" + secondaryNuageController + ", separateDataNetwork=" + separateDataNetwork + ", siteId=" + siteId + ", staticRoute=" + staticRoute + ", staticRouteGateway=" + staticRouteGateway + ", staticRouteNetmask=" + staticRouteNetmask + ", successfullyAppliedUpgradePackagePassword=" + successfullyAppliedUpgradePackagePassword + ", successfullyAppliedUpgradePackageURL=" + successfullyAppliedUpgradePackageURL + ", successfullyAppliedUpgradePackageUsername=" + successfullyAppliedUpgradePackageUsername + ", successfullyAppliedVersion=" + successfullyAppliedVersion + ", toolboxDeploymentMode=" + toolboxDeploymentMode + ", toolboxGroup=" + toolboxGroup + ", toolboxIP=" + toolboxIP + ", toolboxPassword=" + toolboxPassword + ", toolboxUserName=" + toolboxUserName + ", upgradePackagePassword=" + upgradePackagePassword + ", upgradePackageURL=" + upgradePackageURL + ", upgradePackageUsername=" + upgradePackageUsername + ", upgradeScriptTimeLimit=" + upgradeScriptTimeLimit + ", upgradeStatus=" + upgradeStatus + ", upgradeTimedout=" + upgradeTimedout + ", vCenterIP=" + vCenterIP + ", vCenterPassword=" + vCenterPassword + ", vCenterUser=" + vCenterUser + ", vRequireNuageMetadata=" + vRequireNuageMetadata + ", vmNetworkPortgroup=" + vmNetworkPortgroup + ", vrsId=" + vrsId + ", vrsMarkedAsAvailable=" + vrsMarkedAsAvailable + ", vrsPassword=" + vrsPassword + ", vrsUserName=" + vrsUserName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}