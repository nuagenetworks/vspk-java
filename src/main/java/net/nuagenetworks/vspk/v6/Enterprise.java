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
import net.nuagenetworks.vspk.v6.fetchers.AllAlarmsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ApplicationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ApplicationperformancemanagementsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.AvatarsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.AzureCloudsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.BGPProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.CaptivePortalProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.COSRemarkingPolicyTablesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DeploymentFailuresFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DomainsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DomainKindSummariesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DomainTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DSCPForwardingClassTablesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DSCPRemarkingPolicyTablesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EgressQOSPoliciesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterpriseNetworksFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterpriseSecuritiesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.FirewallAclsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.FirewallRulesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GatewaysFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GatewaysLocationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GatewayTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GroupKeyEncryptionProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IKECertificatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IKEEncryptionprofilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IKEGatewaysFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IKEGatewayProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IKEPSKsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressQOSPoliciesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.KeyServerMonitorsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L2DomainsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L2DomainTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L4ServicesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L4ServiceGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L7applicationsignaturesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.LDAPConfigurationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MultiCastListsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NetconfProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NetworkMacroGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NetworkPerformanceMeasurementsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGatewaysFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGatewaysCountsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGatewaySummariesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGatewayTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSGGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NSRedundantGatewayGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.OverlayManagementProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PerformanceMonitorsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyGroupCategoriesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyObjectGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PublicNetworkMacrosFetcher;
import net.nuagenetworks.vspk.v6.fetchers.RateLimitersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.RedundancyGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.RoutingPoliciesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SaaSApplicationGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SaaSApplicationTypesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SharedNetworkResourcesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SyslogDestinationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TestDefinitionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TestSuitesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TrunksFetcher;
import net.nuagenetworks.vspk.v6.fetchers.UsersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VNFsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VNFMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VNFThresholdPoliciesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.WebCategoriesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.WebDomainNamesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ZFBRequestsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "enterprise", resourceName = "enterprises")
public class Enterprise extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAllowedForwardingClasses { A, B, C, D, E, F, G, H, NONE };
   public enum EAllowedForwardingMode { DISABLED, LOCAL_AND_REMOTE, LOCAL_ONLY };
   public enum EAvatarType { BASE64, COMPUTEDURL, URL };
   public enum EEncryptionManagementMode { DISABLED, MANAGED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EFlowCollectionEnabled { DISABLED, ENABLED };

   
   @JsonProperty(value = "BGPEnabled")
   
   protected Boolean BGPEnabled;
   
   @JsonProperty(value = "DHCPLeaseInterval")
   
   protected Long DHCPLeaseInterval;
   
   @JsonProperty(value = "LDAPAuthorizationEnabled")
   
   protected Boolean LDAPAuthorizationEnabled;
   
   @JsonProperty(value = "LDAPEnabled")
   
   protected Boolean LDAPEnabled;
   
   @JsonProperty(value = "VNFManagementEnabled")
   
   protected Boolean VNFManagementEnabled;
   
   @JsonProperty(value = "allowAdvancedQOSConfiguration")
   
   protected Boolean allowAdvancedQOSConfiguration;
   
   @JsonProperty(value = "allowGatewayManagement")
   
   protected Boolean allowGatewayManagement;
   
   @JsonProperty(value = "allowTrustedForwardingClass")
   
   protected Boolean allowTrustedForwardingClass;
   
   @JsonProperty(value = "allowedForwardingClasses")
   
   protected java.util.List<EAllowedForwardingClasses> allowedForwardingClasses;
   
   @JsonProperty(value = "allowedForwardingMode")
   
   protected EAllowedForwardingMode allowedForwardingMode;
   
   @JsonProperty(value = "associatedEnterpriseSecurityID")
   
   protected String associatedEnterpriseSecurityID;
   
   @JsonProperty(value = "associatedGroupKeyEncryptionProfileID")
   
   protected String associatedGroupKeyEncryptionProfileID;
   
   @JsonProperty(value = "associatedKeyServerMonitorID")
   
   protected String associatedKeyServerMonitorID;
   
   @JsonProperty(value = "avatarData")
   
   protected String avatarData;
   
   @JsonProperty(value = "avatarType")
   
   protected EAvatarType avatarType;
   
   @JsonProperty(value = "customerID")
   
   protected Long customerID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "dictionaryVersion")
   
   protected Long dictionaryVersion;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enableApplicationPerformanceManagement")
   
   protected Boolean enableApplicationPerformanceManagement;
   
   @JsonProperty(value = "encryptionManagementMode")
   
   protected EEncryptionManagementMode encryptionManagementMode;
   
   @JsonProperty(value = "enterpriseProfileID")
   
   protected String enterpriseProfileID;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "floatingIPsQuota")
   
   protected Long floatingIPsQuota;
   
   @JsonProperty(value = "floatingIPsUsed")
   
   protected Long floatingIPsUsed;
   
   @JsonProperty(value = "flowCollectionEnabled")
   
   protected EFlowCollectionEnabled flowCollectionEnabled;
   
   @JsonProperty(value = "forwardingClass")
   
   protected java.util.List<ForwardingClass> forwardingClass;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "localAS")
   
   protected Long localAS;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "receiveMultiCastListID")
   
   protected String receiveMultiCastListID;
   
   @JsonProperty(value = "sendMultiCastListID")
   
   protected String sendMultiCastListID;
   
   @JsonProperty(value = "sharedEnterprise")
   
   protected Boolean sharedEnterprise;
   
   @JsonProperty(value = "useGlobalMAC")
   
   protected Boolean useGlobalMAC;
   
   @JsonProperty(value = "virtualFirewallRulesEnabled")
   
   protected Boolean virtualFirewallRulesEnabled;
   
   @JsonProperty(value = "webFilterEnabled")
   
   protected Boolean webFilterEnabled;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private AllAlarmsFetcher allAlarms;
   
   @JsonIgnore
   private ApplicationsFetcher applications;
   
   @JsonIgnore
   private ApplicationperformancemanagementsFetcher applicationperformancemanagements;
   
   @JsonIgnore
   private AvatarsFetcher avatars;
   
   @JsonIgnore
   private AzureCloudsFetcher azureClouds;
   
   @JsonIgnore
   private BGPProfilesFetcher bGPProfiles;
   
   @JsonIgnore
   private CaptivePortalProfilesFetcher captivePortalProfiles;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private COSRemarkingPolicyTablesFetcher cOSRemarkingPolicyTables;
   
   @JsonIgnore
   private DeploymentFailuresFetcher deploymentFailures;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private DomainKindSummariesFetcher domainKindSummaries;
   
   @JsonIgnore
   private DomainTemplatesFetcher domainTemplates;
   
   @JsonIgnore
   private DSCPForwardingClassTablesFetcher dSCPForwardingClassTables;
   
   @JsonIgnore
   private DSCPRemarkingPolicyTablesFetcher dSCPRemarkingPolicyTables;
   
   @JsonIgnore
   private EgressQOSPoliciesFetcher egressQOSPolicies;
   
   @JsonIgnore
   private EnterpriseNetworksFetcher enterpriseNetworks;
   
   @JsonIgnore
   private EnterpriseSecuritiesFetcher enterpriseSecurities;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private FirewallAclsFetcher firewallAcls;
   
   @JsonIgnore
   private FirewallRulesFetcher firewallRules;
   
   @JsonIgnore
   private GatewaysFetcher gateways;
   
   @JsonIgnore
   private GatewaysLocationsFetcher gatewaysLocations;
   
   @JsonIgnore
   private GatewayTemplatesFetcher gatewayTemplates;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private GroupKeyEncryptionProfilesFetcher groupKeyEncryptionProfiles;
   
   @JsonIgnore
   private IKECertificatesFetcher iKECertificates;
   
   @JsonIgnore
   private IKEEncryptionprofilesFetcher iKEEncryptionprofiles;
   
   @JsonIgnore
   private IKEGatewaysFetcher iKEGateways;
   
   @JsonIgnore
   private IKEGatewayProfilesFetcher iKEGatewayProfiles;
   
   @JsonIgnore
   private IKEPSKsFetcher iKEPSKs;
   
   @JsonIgnore
   private IngressQOSPoliciesFetcher ingressQOSPolicies;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private KeyServerMonitorsFetcher keyServerMonitors;
   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private L2DomainTemplatesFetcher l2DomainTemplates;
   
   @JsonIgnore
   private L4ServicesFetcher l4Services;
   
   @JsonIgnore
   private L4ServiceGroupsFetcher l4ServiceGroups;
   
   @JsonIgnore
   private L7applicationsignaturesFetcher l7applicationsignatures;
   
   @JsonIgnore
   private LDAPConfigurationsFetcher lDAPConfigurations;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MultiCastListsFetcher multiCastLists;
   
   @JsonIgnore
   private NetconfProfilesFetcher netconfProfiles;
   
   @JsonIgnore
   private NetworkMacroGroupsFetcher networkMacroGroups;
   
   @JsonIgnore
   private NetworkPerformanceMeasurementsFetcher networkPerformanceMeasurements;
   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   
   @JsonIgnore
   private NSGatewaysCountsFetcher nSGatewaysCounts;
   
   @JsonIgnore
   private NSGatewaySummariesFetcher nSGatewaySummaries;
   
   @JsonIgnore
   private NSGatewayTemplatesFetcher nSGatewayTemplates;
   
   @JsonIgnore
   private NSGGroupsFetcher nSGGroups;
   
   @JsonIgnore
   private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
   
   @JsonIgnore
   private OverlayManagementProfilesFetcher overlayManagementProfiles;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PerformanceMonitorsFetcher performanceMonitors;
   
   @JsonIgnore
   private PolicyGroupCategoriesFetcher policyGroupCategories;
   
   @JsonIgnore
   private PolicyObjectGroupsFetcher policyObjectGroups;
   
   @JsonIgnore
   private PublicNetworkMacrosFetcher publicNetworkMacros;
   
   @JsonIgnore
   private RateLimitersFetcher rateLimiters;
   
   @JsonIgnore
   private RedundancyGroupsFetcher redundancyGroups;
   
   @JsonIgnore
   private RoutingPoliciesFetcher routingPolicies;
   
   @JsonIgnore
   private SaaSApplicationGroupsFetcher saaSApplicationGroups;
   
   @JsonIgnore
   private SaaSApplicationTypesFetcher saaSApplicationTypes;
   
   @JsonIgnore
   private SharedNetworkResourcesFetcher sharedNetworkResources;
   
   @JsonIgnore
   private SyslogDestinationsFetcher syslogDestinations;
   
   @JsonIgnore
   private TestDefinitionsFetcher testDefinitions;
   
   @JsonIgnore
   private TestSuitesFetcher testSuites;
   
   @JsonIgnore
   private TrunksFetcher trunks;
   
   @JsonIgnore
   private UsersFetcher users;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VNFsFetcher vNFs;
   
   @JsonIgnore
   private VNFMetadatasFetcher vNFMetadatas;
   
   @JsonIgnore
   private VNFThresholdPoliciesFetcher vNFThresholdPolicies;
   
   @JsonIgnore
   private WebCategoriesFetcher webCategories;
   
   @JsonIgnore
   private WebDomainNamesFetcher webDomainNames;
   
   @JsonIgnore
   private ZFBRequestsFetcher zFBRequests;
   

   public Enterprise() {
      
      alarms = new AlarmsFetcher(this);
      
      allAlarms = new AllAlarmsFetcher(this);
      
      applications = new ApplicationsFetcher(this);
      
      applicationperformancemanagements = new ApplicationperformancemanagementsFetcher(this);
      
      avatars = new AvatarsFetcher(this);
      
      azureClouds = new AzureCloudsFetcher(this);
      
      bGPProfiles = new BGPProfilesFetcher(this);
      
      captivePortalProfiles = new CaptivePortalProfilesFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      cOSRemarkingPolicyTables = new COSRemarkingPolicyTablesFetcher(this);
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      domainKindSummaries = new DomainKindSummariesFetcher(this);
      
      domainTemplates = new DomainTemplatesFetcher(this);
      
      dSCPForwardingClassTables = new DSCPForwardingClassTablesFetcher(this);
      
      dSCPRemarkingPolicyTables = new DSCPRemarkingPolicyTablesFetcher(this);
      
      egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
      
      enterpriseNetworks = new EnterpriseNetworksFetcher(this);
      
      enterpriseSecurities = new EnterpriseSecuritiesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      firewallAcls = new FirewallAclsFetcher(this);
      
      firewallRules = new FirewallRulesFetcher(this);
      
      gateways = new GatewaysFetcher(this);
      
      gatewaysLocations = new GatewaysLocationsFetcher(this);
      
      gatewayTemplates = new GatewayTemplatesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      groupKeyEncryptionProfiles = new GroupKeyEncryptionProfilesFetcher(this);
      
      iKECertificates = new IKECertificatesFetcher(this);
      
      iKEEncryptionprofiles = new IKEEncryptionprofilesFetcher(this);
      
      iKEGateways = new IKEGatewaysFetcher(this);
      
      iKEGatewayProfiles = new IKEGatewayProfilesFetcher(this);
      
      iKEPSKs = new IKEPSKsFetcher(this);
      
      ingressQOSPolicies = new IngressQOSPoliciesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      keyServerMonitors = new KeyServerMonitorsFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      l2DomainTemplates = new L2DomainTemplatesFetcher(this);
      
      l4Services = new L4ServicesFetcher(this);
      
      l4ServiceGroups = new L4ServiceGroupsFetcher(this);
      
      l7applicationsignatures = new L7applicationsignaturesFetcher(this);
      
      lDAPConfigurations = new LDAPConfigurationsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      multiCastLists = new MultiCastListsFetcher(this);
      
      netconfProfiles = new NetconfProfilesFetcher(this);
      
      networkMacroGroups = new NetworkMacroGroupsFetcher(this);
      
      networkPerformanceMeasurements = new NetworkPerformanceMeasurementsFetcher(this);
      
      nSGateways = new NSGatewaysFetcher(this);
      
      nSGatewaysCounts = new NSGatewaysCountsFetcher(this);
      
      nSGatewaySummaries = new NSGatewaySummariesFetcher(this);
      
      nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
      
      nSGGroups = new NSGGroupsFetcher(this);
      
      nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
      
      overlayManagementProfiles = new OverlayManagementProfilesFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      performanceMonitors = new PerformanceMonitorsFetcher(this);
      
      policyGroupCategories = new PolicyGroupCategoriesFetcher(this);
      
      policyObjectGroups = new PolicyObjectGroupsFetcher(this);
      
      publicNetworkMacros = new PublicNetworkMacrosFetcher(this);
      
      rateLimiters = new RateLimitersFetcher(this);
      
      redundancyGroups = new RedundancyGroupsFetcher(this);
      
      routingPolicies = new RoutingPoliciesFetcher(this);
      
      saaSApplicationGroups = new SaaSApplicationGroupsFetcher(this);
      
      saaSApplicationTypes = new SaaSApplicationTypesFetcher(this);
      
      sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
      
      syslogDestinations = new SyslogDestinationsFetcher(this);
      
      testDefinitions = new TestDefinitionsFetcher(this);
      
      testSuites = new TestSuitesFetcher(this);
      
      trunks = new TrunksFetcher(this);
      
      users = new UsersFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vNFs = new VNFsFetcher(this);
      
      vNFMetadatas = new VNFMetadatasFetcher(this);
      
      vNFThresholdPolicies = new VNFThresholdPoliciesFetcher(this);
      
      webCategories = new WebCategoriesFetcher(this);
      
      webDomainNames = new WebDomainNamesFetcher(this);
      
      zFBRequests = new ZFBRequestsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getBGPEnabled() {
      return BGPEnabled;
   }

   @JsonIgnore
   public void setBGPEnabled(Boolean value) { 
      this.BGPEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getDHCPLeaseInterval() {
      return DHCPLeaseInterval;
   }

   @JsonIgnore
   public void setDHCPLeaseInterval(Long value) { 
      this.DHCPLeaseInterval = value;
   }
   
   
   @JsonIgnore
   public Boolean getLDAPAuthorizationEnabled() {
      return LDAPAuthorizationEnabled;
   }

   @JsonIgnore
   public void setLDAPAuthorizationEnabled(Boolean value) { 
      this.LDAPAuthorizationEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getLDAPEnabled() {
      return LDAPEnabled;
   }

   @JsonIgnore
   public void setLDAPEnabled(Boolean value) { 
      this.LDAPEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getVNFManagementEnabled() {
      return VNFManagementEnabled;
   }

   @JsonIgnore
   public void setVNFManagementEnabled(Boolean value) { 
      this.VNFManagementEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowAdvancedQOSConfiguration() {
      return allowAdvancedQOSConfiguration;
   }

   @JsonIgnore
   public void setAllowAdvancedQOSConfiguration(Boolean value) { 
      this.allowAdvancedQOSConfiguration = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowGatewayManagement() {
      return allowGatewayManagement;
   }

   @JsonIgnore
   public void setAllowGatewayManagement(Boolean value) { 
      this.allowGatewayManagement = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowTrustedForwardingClass() {
      return allowTrustedForwardingClass;
   }

   @JsonIgnore
   public void setAllowTrustedForwardingClass(Boolean value) { 
      this.allowTrustedForwardingClass = value;
   }
   
   
   @JsonIgnore
   public java.util.List<EAllowedForwardingClasses> getAllowedForwardingClasses() {
      return allowedForwardingClasses;
   }

   @JsonIgnore
   public void setAllowedForwardingClasses(java.util.List<EAllowedForwardingClasses> value) { 
      this.allowedForwardingClasses = value;
   }
   
   
   @JsonIgnore
   public EAllowedForwardingMode getAllowedForwardingMode() {
      return allowedForwardingMode;
   }

   @JsonIgnore
   public void setAllowedForwardingMode(EAllowedForwardingMode value) { 
      this.allowedForwardingMode = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEnterpriseSecurityID() {
      return associatedEnterpriseSecurityID;
   }

   @JsonIgnore
   public void setAssociatedEnterpriseSecurityID(String value) { 
      this.associatedEnterpriseSecurityID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGroupKeyEncryptionProfileID() {
      return associatedGroupKeyEncryptionProfileID;
   }

   @JsonIgnore
   public void setAssociatedGroupKeyEncryptionProfileID(String value) { 
      this.associatedGroupKeyEncryptionProfileID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedKeyServerMonitorID() {
      return associatedKeyServerMonitorID;
   }

   @JsonIgnore
   public void setAssociatedKeyServerMonitorID(String value) { 
      this.associatedKeyServerMonitorID = value;
   }
   
   
   @JsonIgnore
   public String getAvatarData() {
      return avatarData;
   }

   @JsonIgnore
   public void setAvatarData(String value) { 
      this.avatarData = value;
   }
   
   
   @JsonIgnore
   public EAvatarType getAvatarType() {
      return avatarType;
   }

   @JsonIgnore
   public void setAvatarType(EAvatarType value) { 
      this.avatarType = value;
   }
   
   
   @JsonIgnore
   public Long getCustomerID() {
      return customerID;
   }

   @JsonIgnore
   public void setCustomerID(Long value) { 
      this.customerID = value;
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
   public Long getDictionaryVersion() {
      return dictionaryVersion;
   }

   @JsonIgnore
   public void setDictionaryVersion(Long value) { 
      this.dictionaryVersion = value;
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
   public Boolean getEnableApplicationPerformanceManagement() {
      return enableApplicationPerformanceManagement;
   }

   @JsonIgnore
   public void setEnableApplicationPerformanceManagement(Boolean value) { 
      this.enableApplicationPerformanceManagement = value;
   }
   
   
   @JsonIgnore
   public EEncryptionManagementMode getEncryptionManagementMode() {
      return encryptionManagementMode;
   }

   @JsonIgnore
   public void setEncryptionManagementMode(EEncryptionManagementMode value) { 
      this.encryptionManagementMode = value;
   }
   
   
   @JsonIgnore
   public String getEnterpriseProfileID() {
      return enterpriseProfileID;
   }

   @JsonIgnore
   public void setEnterpriseProfileID(String value) { 
      this.enterpriseProfileID = value;
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
   public Long getFloatingIPsQuota() {
      return floatingIPsQuota;
   }

   @JsonIgnore
   public void setFloatingIPsQuota(Long value) { 
      this.floatingIPsQuota = value;
   }
   
   
   @JsonIgnore
   public Long getFloatingIPsUsed() {
      return floatingIPsUsed;
   }

   @JsonIgnore
   public void setFloatingIPsUsed(Long value) { 
      this.floatingIPsUsed = value;
   }
   
   
   @JsonIgnore
   public EFlowCollectionEnabled getFlowCollectionEnabled() {
      return flowCollectionEnabled;
   }

   @JsonIgnore
   public void setFlowCollectionEnabled(EFlowCollectionEnabled value) { 
      this.flowCollectionEnabled = value;
   }
   
   
   @JsonIgnore
   public java.util.List<ForwardingClass> getForwardingClass() {
      return forwardingClass;
   }

   @JsonIgnore
   public void setForwardingClass(java.util.List<ForwardingClass> value) { 
      this.forwardingClass = value;
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
   public Long getLocalAS() {
      return localAS;
   }

   @JsonIgnore
   public void setLocalAS(Long value) { 
      this.localAS = value;
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
   public String getReceiveMultiCastListID() {
      return receiveMultiCastListID;
   }

   @JsonIgnore
   public void setReceiveMultiCastListID(String value) { 
      this.receiveMultiCastListID = value;
   }
   
   
   @JsonIgnore
   public String getSendMultiCastListID() {
      return sendMultiCastListID;
   }

   @JsonIgnore
   public void setSendMultiCastListID(String value) { 
      this.sendMultiCastListID = value;
   }
   
   
   @JsonIgnore
   public Boolean getSharedEnterprise() {
      return sharedEnterprise;
   }

   @JsonIgnore
   public void setSharedEnterprise(Boolean value) { 
      this.sharedEnterprise = value;
   }
   
   
   @JsonIgnore
   public Boolean getUseGlobalMAC() {
      return useGlobalMAC;
   }

   @JsonIgnore
   public void setUseGlobalMAC(Boolean value) { 
      this.useGlobalMAC = value;
   }
   
   
   @JsonIgnore
   public Boolean getVirtualFirewallRulesEnabled() {
      return virtualFirewallRulesEnabled;
   }

   @JsonIgnore
   public void setVirtualFirewallRulesEnabled(Boolean value) { 
      this.virtualFirewallRulesEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getWebFilterEnabled() {
      return webFilterEnabled;
   }

   @JsonIgnore
   public void setWebFilterEnabled(Boolean value) { 
      this.webFilterEnabled = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public AllAlarmsFetcher getAllAlarms() {
      return allAlarms;
   }
   
   @JsonIgnore
   public ApplicationsFetcher getApplications() {
      return applications;
   }
   
   @JsonIgnore
   public ApplicationperformancemanagementsFetcher getApplicationperformancemanagements() {
      return applicationperformancemanagements;
   }
   
   @JsonIgnore
   public AvatarsFetcher getAvatars() {
      return avatars;
   }
   
   @JsonIgnore
   public AzureCloudsFetcher getAzureClouds() {
      return azureClouds;
   }
   
   @JsonIgnore
   public BGPProfilesFetcher getBGPProfiles() {
      return bGPProfiles;
   }
   
   @JsonIgnore
   public CaptivePortalProfilesFetcher getCaptivePortalProfiles() {
      return captivePortalProfiles;
   }
   
   @JsonIgnore
   public ContainersFetcher getContainers() {
      return containers;
   }
   
   @JsonIgnore
   public COSRemarkingPolicyTablesFetcher getCOSRemarkingPolicyTables() {
      return cOSRemarkingPolicyTables;
   }
   
   @JsonIgnore
   public DeploymentFailuresFetcher getDeploymentFailures() {
      return deploymentFailures;
   }
   
   @JsonIgnore
   public DomainsFetcher getDomains() {
      return domains;
   }
   
   @JsonIgnore
   public DomainKindSummariesFetcher getDomainKindSummaries() {
      return domainKindSummaries;
   }
   
   @JsonIgnore
   public DomainTemplatesFetcher getDomainTemplates() {
      return domainTemplates;
   }
   
   @JsonIgnore
   public DSCPForwardingClassTablesFetcher getDSCPForwardingClassTables() {
      return dSCPForwardingClassTables;
   }
   
   @JsonIgnore
   public DSCPRemarkingPolicyTablesFetcher getDSCPRemarkingPolicyTables() {
      return dSCPRemarkingPolicyTables;
   }
   
   @JsonIgnore
   public EgressQOSPoliciesFetcher getEgressQOSPolicies() {
      return egressQOSPolicies;
   }
   
   @JsonIgnore
   public EnterpriseNetworksFetcher getEnterpriseNetworks() {
      return enterpriseNetworks;
   }
   
   @JsonIgnore
   public EnterpriseSecuritiesFetcher getEnterpriseSecurities() {
      return enterpriseSecurities;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public FirewallAclsFetcher getFirewallAcls() {
      return firewallAcls;
   }
   
   @JsonIgnore
   public FirewallRulesFetcher getFirewallRules() {
      return firewallRules;
   }
   
   @JsonIgnore
   public GatewaysFetcher getGateways() {
      return gateways;
   }
   
   @JsonIgnore
   public GatewaysLocationsFetcher getGatewaysLocations() {
      return gatewaysLocations;
   }
   
   @JsonIgnore
   public GatewayTemplatesFetcher getGatewayTemplates() {
      return gatewayTemplates;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   @JsonIgnore
   public GroupKeyEncryptionProfilesFetcher getGroupKeyEncryptionProfiles() {
      return groupKeyEncryptionProfiles;
   }
   
   @JsonIgnore
   public IKECertificatesFetcher getIKECertificates() {
      return iKECertificates;
   }
   
   @JsonIgnore
   public IKEEncryptionprofilesFetcher getIKEEncryptionprofiles() {
      return iKEEncryptionprofiles;
   }
   
   @JsonIgnore
   public IKEGatewaysFetcher getIKEGateways() {
      return iKEGateways;
   }
   
   @JsonIgnore
   public IKEGatewayProfilesFetcher getIKEGatewayProfiles() {
      return iKEGatewayProfiles;
   }
   
   @JsonIgnore
   public IKEPSKsFetcher getIKEPSKs() {
      return iKEPSKs;
   }
   
   @JsonIgnore
   public IngressQOSPoliciesFetcher getIngressQOSPolicies() {
      return ingressQOSPolicies;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public KeyServerMonitorsFetcher getKeyServerMonitors() {
      return keyServerMonitors;
   }
   
   @JsonIgnore
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   @JsonIgnore
   public L2DomainTemplatesFetcher getL2DomainTemplates() {
      return l2DomainTemplates;
   }
   
   @JsonIgnore
   public L4ServicesFetcher getL4Services() {
      return l4Services;
   }
   
   @JsonIgnore
   public L4ServiceGroupsFetcher getL4ServiceGroups() {
      return l4ServiceGroups;
   }
   
   @JsonIgnore
   public L7applicationsignaturesFetcher getL7applicationsignatures() {
      return l7applicationsignatures;
   }
   
   @JsonIgnore
   public LDAPConfigurationsFetcher getLDAPConfigurations() {
      return lDAPConfigurations;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public MultiCastListsFetcher getMultiCastLists() {
      return multiCastLists;
   }
   
   @JsonIgnore
   public NetconfProfilesFetcher getNetconfProfiles() {
      return netconfProfiles;
   }
   
   @JsonIgnore
   public NetworkMacroGroupsFetcher getNetworkMacroGroups() {
      return networkMacroGroups;
   }
   
   @JsonIgnore
   public NetworkPerformanceMeasurementsFetcher getNetworkPerformanceMeasurements() {
      return networkPerformanceMeasurements;
   }
   
   @JsonIgnore
   public NSGatewaysFetcher getNSGateways() {
      return nSGateways;
   }
   
   @JsonIgnore
   public NSGatewaysCountsFetcher getNSGatewaysCounts() {
      return nSGatewaysCounts;
   }
   
   @JsonIgnore
   public NSGatewaySummariesFetcher getNSGatewaySummaries() {
      return nSGatewaySummaries;
   }
   
   @JsonIgnore
   public NSGatewayTemplatesFetcher getNSGatewayTemplates() {
      return nSGatewayTemplates;
   }
   
   @JsonIgnore
   public NSGGroupsFetcher getNSGGroups() {
      return nSGGroups;
   }
   
   @JsonIgnore
   public NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroups() {
      return nSRedundantGatewayGroups;
   }
   
   @JsonIgnore
   public OverlayManagementProfilesFetcher getOverlayManagementProfiles() {
      return overlayManagementProfiles;
   }
   
   @JsonIgnore
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   @JsonIgnore
   public PerformanceMonitorsFetcher getPerformanceMonitors() {
      return performanceMonitors;
   }
   
   @JsonIgnore
   public PolicyGroupCategoriesFetcher getPolicyGroupCategories() {
      return policyGroupCategories;
   }
   
   @JsonIgnore
   public PolicyObjectGroupsFetcher getPolicyObjectGroups() {
      return policyObjectGroups;
   }
   
   @JsonIgnore
   public PublicNetworkMacrosFetcher getPublicNetworkMacros() {
      return publicNetworkMacros;
   }
   
   @JsonIgnore
   public RateLimitersFetcher getRateLimiters() {
      return rateLimiters;
   }
   
   @JsonIgnore
   public RedundancyGroupsFetcher getRedundancyGroups() {
      return redundancyGroups;
   }
   
   @JsonIgnore
   public RoutingPoliciesFetcher getRoutingPolicies() {
      return routingPolicies;
   }
   
   @JsonIgnore
   public SaaSApplicationGroupsFetcher getSaaSApplicationGroups() {
      return saaSApplicationGroups;
   }
   
   @JsonIgnore
   public SaaSApplicationTypesFetcher getSaaSApplicationTypes() {
      return saaSApplicationTypes;
   }
   
   @JsonIgnore
   public SharedNetworkResourcesFetcher getSharedNetworkResources() {
      return sharedNetworkResources;
   }
   
   @JsonIgnore
   public SyslogDestinationsFetcher getSyslogDestinations() {
      return syslogDestinations;
   }
   
   @JsonIgnore
   public TestDefinitionsFetcher getTestDefinitions() {
      return testDefinitions;
   }
   
   @JsonIgnore
   public TestSuitesFetcher getTestSuites() {
      return testSuites;
   }
   
   @JsonIgnore
   public TrunksFetcher getTrunks() {
      return trunks;
   }
   
   @JsonIgnore
   public UsersFetcher getUsers() {
      return users;
   }
   
   @JsonIgnore
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   @JsonIgnore
   public VNFsFetcher getVNFs() {
      return vNFs;
   }
   
   @JsonIgnore
   public VNFMetadatasFetcher getVNFMetadatas() {
      return vNFMetadatas;
   }
   
   @JsonIgnore
   public VNFThresholdPoliciesFetcher getVNFThresholdPolicies() {
      return vNFThresholdPolicies;
   }
   
   @JsonIgnore
   public WebCategoriesFetcher getWebCategories() {
      return webCategories;
   }
   
   @JsonIgnore
   public WebDomainNamesFetcher getWebDomainNames() {
      return webDomainNames;
   }
   
   @JsonIgnore
   public ZFBRequestsFetcher getZFBRequests() {
      return zFBRequests;
   }
   

   public String toString() {
      return "Enterprise [" + "BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", LDAPAuthorizationEnabled=" + LDAPAuthorizationEnabled + ", LDAPEnabled=" + LDAPEnabled + ", VNFManagementEnabled=" + VNFManagementEnabled + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", allowedForwardingMode=" + allowedForwardingMode + ", associatedEnterpriseSecurityID=" + associatedEnterpriseSecurityID + ", associatedGroupKeyEncryptionProfileID=" + associatedGroupKeyEncryptionProfileID + ", associatedKeyServerMonitorID=" + associatedKeyServerMonitorID + ", avatarData=" + avatarData + ", avatarType=" + avatarType + ", customerID=" + customerID + ", description=" + description + ", dictionaryVersion=" + dictionaryVersion + ", embeddedMetadata=" + embeddedMetadata + ", enableApplicationPerformanceManagement=" + enableApplicationPerformanceManagement + ", encryptionManagementMode=" + encryptionManagementMode + ", enterpriseProfileID=" + enterpriseProfileID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", floatingIPsQuota=" + floatingIPsQuota + ", floatingIPsUsed=" + floatingIPsUsed + ", flowCollectionEnabled=" + flowCollectionEnabled + ", forwardingClass=" + forwardingClass + ", lastUpdatedBy=" + lastUpdatedBy + ", localAS=" + localAS + ", name=" + name + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", sharedEnterprise=" + sharedEnterprise + ", useGlobalMAC=" + useGlobalMAC + ", virtualFirewallRulesEnabled=" + virtualFirewallRulesEnabled + ", webFilterEnabled=" + webFilterEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}