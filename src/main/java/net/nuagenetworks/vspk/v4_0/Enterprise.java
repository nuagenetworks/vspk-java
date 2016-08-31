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


import net.nuagenetworks.vspk.v4_0.fetchers.L2DomainsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.L2DomainTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.RateLimitersFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GatewaysFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GatewayTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.LDAPConfigurationsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.RedundancyGroupsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadataTagsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.NetworkMacroGroupsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.KeyServerMonitorsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ZFBRequestsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.BGPProfilesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EgressQOSPoliciesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.SharedNetworkResourcesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IKECertificatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IKEEncryptionprofilesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IKEGatewaysFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IKEGatewayProfilesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IKEPSKsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AllAlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.InfrastructurePortProfilesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EnterpriseNetworksFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EnterpriseSecuritiesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DomainsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DomainTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.RoutingPoliciesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AppsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ApplicationServicesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GroupsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GroupKeyEncryptionProfilesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DSCPForwardingClassTablesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.UsersFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.NSGatewaysFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.NSGatewayTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.NSRedundantGatewayGroupsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.PublicNetworkMacrosFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MultiCastListsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AvatarsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ExternalAppServicesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ExternalServicesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "enterprise", resourceName = "enterprises")
public class Enterprise extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum AllowedForwardingClasses { A, B, C, D, E, F, G, H, NONE };
   public enum EncryptionManagementMode { DISABLED, MANAGED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum AvatarType { BASE64, COMPUTEDURL, URL };

   
   @JsonProperty(value = "LDAPAuthorizationEnabled")
   protected Boolean LDAPAuthorizationEnabled;
   
   @JsonProperty(value = "LDAPEnabled")
   protected Boolean LDAPEnabled;
   
   @JsonProperty(value = "BGPEnabled")
   protected Boolean BGPEnabled;
   
   @JsonProperty(value = "DHCPLeaseInterval")
   protected Long DHCPLeaseInterval;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "receiveMultiCastListID")
   protected String receiveMultiCastListID;
   
   @JsonProperty(value = "sendMultiCastListID")
   protected String sendMultiCastListID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "allowAdvancedQOSConfiguration")
   protected Boolean allowAdvancedQOSConfiguration;
   
   @JsonProperty(value = "allowGatewayManagement")
   protected Boolean allowGatewayManagement;
   
   @JsonProperty(value = "allowTrustedForwardingClass")
   protected Boolean allowTrustedForwardingClass;
   
   @JsonProperty(value = "allowedForwardingClasses")
   protected java.util.List<AllowedForwardingClasses> allowedForwardingClasses;
   
   @JsonProperty(value = "floatingIPsQuota")
   protected Long floatingIPsQuota;
   
   @JsonProperty(value = "floatingIPsUsed")
   protected Long floatingIPsUsed;
   
   @JsonProperty(value = "encryptionManagementMode")
   protected EncryptionManagementMode encryptionManagementMode;
   
   @JsonProperty(value = "enterpriseProfileID")
   protected String enterpriseProfileID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "localAS")
   protected Long localAS;
   
   @JsonProperty(value = "associatedEnterpriseSecurityID")
   protected String associatedEnterpriseSecurityID;
   
   @JsonProperty(value = "associatedGroupKeyEncryptionProfileID")
   protected String associatedGroupKeyEncryptionProfileID;
   
   @JsonProperty(value = "associatedKeyServerMonitorID")
   protected String associatedKeyServerMonitorID;
   
   @JsonProperty(value = "customerID")
   protected Long customerID;
   
   @JsonProperty(value = "avatarData")
   protected String avatarData;
   
   @JsonProperty(value = "avatarType")
   protected AvatarType avatarType;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private L2DomainTemplatesFetcher l2DomainTemplates;
   
   @JsonIgnore
   private RateLimitersFetcher rateLimiters;
   
   @JsonIgnore
   private GatewaysFetcher gateways;
   
   @JsonIgnore
   private GatewayTemplatesFetcher gatewayTemplates;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private LDAPConfigurationsFetcher lDAPConfigurations;
   
   @JsonIgnore
   private RedundancyGroupsFetcher redundancyGroups;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MetadataTagsFetcher metadataTags;
   
   @JsonIgnore
   private NetworkMacroGroupsFetcher networkMacroGroups;
   
   @JsonIgnore
   private KeyServerMonitorsFetcher keyServerMonitors;
   
   @JsonIgnore
   private ZFBRequestsFetcher zFBRequests;
   
   @JsonIgnore
   private BGPProfilesFetcher bGPProfiles;
   
   @JsonIgnore
   private EgressQOSPoliciesFetcher egressQOSPolicies;
   
   @JsonIgnore
   private SharedNetworkResourcesFetcher sharedNetworkResources;
   
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
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private AllAlarmsFetcher allAlarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private InfrastructurePortProfilesFetcher infrastructurePortProfiles;
   
   @JsonIgnore
   private EnterpriseNetworksFetcher enterpriseNetworks;
   
   @JsonIgnore
   private EnterpriseSecuritiesFetcher enterpriseSecurities;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private DomainTemplatesFetcher domainTemplates;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private RoutingPoliciesFetcher routingPolicies;
   
   @JsonIgnore
   private AppsFetcher apps;
   
   @JsonIgnore
   private ApplicationServicesFetcher applicationServices;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private GroupKeyEncryptionProfilesFetcher groupKeyEncryptionProfiles;
   
   @JsonIgnore
   private DSCPForwardingClassTablesFetcher dSCPForwardingClassTables;
   
   @JsonIgnore
   private UsersFetcher users;
   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   
   @JsonIgnore
   private NSGatewayTemplatesFetcher nSGatewayTemplates;
   
   @JsonIgnore
   private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
   
   @JsonIgnore
   private PublicNetworkMacrosFetcher publicNetworkMacros;
   
   @JsonIgnore
   private MultiCastListsFetcher multiCastLists;
   
   @JsonIgnore
   private AvatarsFetcher avatars;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private ExternalAppServicesFetcher externalAppServices;
   
   @JsonIgnore
   private ExternalServicesFetcher externalServices;
   

   public Enterprise() {
      
      l2Domains = new L2DomainsFetcher(this);
      
      l2DomainTemplates = new L2DomainTemplatesFetcher(this);
      
      rateLimiters = new RateLimitersFetcher(this);
      
      gateways = new GatewaysFetcher(this);
      
      gatewayTemplates = new GatewayTemplatesFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      lDAPConfigurations = new LDAPConfigurationsFetcher(this);
      
      redundancyGroups = new RedundancyGroupsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      metadataTags = new MetadataTagsFetcher(this);
      
      networkMacroGroups = new NetworkMacroGroupsFetcher(this);
      
      keyServerMonitors = new KeyServerMonitorsFetcher(this);
      
      zFBRequests = new ZFBRequestsFetcher(this);
      
      bGPProfiles = new BGPProfilesFetcher(this);
      
      egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
      
      sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
      
      iKECertificates = new IKECertificatesFetcher(this);
      
      iKEEncryptionprofiles = new IKEEncryptionprofilesFetcher(this);
      
      iKEGateways = new IKEGatewaysFetcher(this);
      
      iKEGatewayProfiles = new IKEGatewayProfilesFetcher(this);
      
      iKEPSKs = new IKEPSKsFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      allAlarms = new AllAlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      infrastructurePortProfiles = new InfrastructurePortProfilesFetcher(this);
      
      enterpriseNetworks = new EnterpriseNetworksFetcher(this);
      
      enterpriseSecurities = new EnterpriseSecuritiesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      domainTemplates = new DomainTemplatesFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      routingPolicies = new RoutingPoliciesFetcher(this);
      
      apps = new AppsFetcher(this);
      
      applicationServices = new ApplicationServicesFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      groupKeyEncryptionProfiles = new GroupKeyEncryptionProfilesFetcher(this);
      
      dSCPForwardingClassTables = new DSCPForwardingClassTablesFetcher(this);
      
      users = new UsersFetcher(this);
      
      nSGateways = new NSGatewaysFetcher(this);
      
      nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
      
      nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
      
      publicNetworkMacros = new PublicNetworkMacrosFetcher(this);
      
      multiCastLists = new MultiCastListsFetcher(this);
      
      avatars = new AvatarsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      externalAppServices = new ExternalAppServicesFetcher(this);
      
      externalServices = new ExternalServicesFetcher(this);
      
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
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
   public java.util.List<AllowedForwardingClasses> getAllowedForwardingClasses() {
      return allowedForwardingClasses;
   }

   @JsonIgnore
   public void setAllowedForwardingClasses(java.util.List<AllowedForwardingClasses> value) { 
      this.allowedForwardingClasses = value;
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
   public EncryptionManagementMode getEncryptionManagementMode() {
      return encryptionManagementMode;
   }

   @JsonIgnore
   public void setEncryptionManagementMode(EncryptionManagementMode value) { 
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
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
   public Long getCustomerID() {
      return customerID;
   }

   @JsonIgnore
   public void setCustomerID(Long value) { 
      this.customerID = value;
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
   public AvatarType getAvatarType() {
      return avatarType;
   }

   @JsonIgnore
   public void setAvatarType(AvatarType value) { 
      this.avatarType = value;
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
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   @JsonIgnore
   public L2DomainTemplatesFetcher getL2DomainTemplates() {
      return l2DomainTemplates;
   }
   
   @JsonIgnore
   public RateLimitersFetcher getRateLimiters() {
      return rateLimiters;
   }
   
   @JsonIgnore
   public GatewaysFetcher getGateways() {
      return gateways;
   }
   
   @JsonIgnore
   public GatewayTemplatesFetcher getGatewayTemplates() {
      return gatewayTemplates;
   }
   
   @JsonIgnore
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   @JsonIgnore
   public LDAPConfigurationsFetcher getLDAPConfigurations() {
      return lDAPConfigurations;
   }
   
   @JsonIgnore
   public RedundancyGroupsFetcher getRedundancyGroups() {
      return redundancyGroups;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public MetadataTagsFetcher getMetadataTags() {
      return metadataTags;
   }
   
   @JsonIgnore
   public NetworkMacroGroupsFetcher getNetworkMacroGroups() {
      return networkMacroGroups;
   }
   
   @JsonIgnore
   public KeyServerMonitorsFetcher getKeyServerMonitors() {
      return keyServerMonitors;
   }
   
   @JsonIgnore
   public ZFBRequestsFetcher getZFBRequests() {
      return zFBRequests;
   }
   
   @JsonIgnore
   public BGPProfilesFetcher getBGPProfiles() {
      return bGPProfiles;
   }
   
   @JsonIgnore
   public EgressQOSPoliciesFetcher getEgressQOSPolicies() {
      return egressQOSPolicies;
   }
   
   @JsonIgnore
   public SharedNetworkResourcesFetcher getSharedNetworkResources() {
      return sharedNetworkResources;
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
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public AllAlarmsFetcher getAllAlarms() {
      return allAlarms;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   @JsonIgnore
   public InfrastructurePortProfilesFetcher getInfrastructurePortProfiles() {
      return infrastructurePortProfiles;
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
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public DomainsFetcher getDomains() {
      return domains;
   }
   
   @JsonIgnore
   public DomainTemplatesFetcher getDomainTemplates() {
      return domainTemplates;
   }
   
   @JsonIgnore
   public ContainersFetcher getContainers() {
      return containers;
   }
   
   @JsonIgnore
   public RoutingPoliciesFetcher getRoutingPolicies() {
      return routingPolicies;
   }
   
   @JsonIgnore
   public AppsFetcher getApps() {
      return apps;
   }
   
   @JsonIgnore
   public ApplicationServicesFetcher getApplicationServices() {
      return applicationServices;
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
   public DSCPForwardingClassTablesFetcher getDSCPForwardingClassTables() {
      return dSCPForwardingClassTables;
   }
   
   @JsonIgnore
   public UsersFetcher getUsers() {
      return users;
   }
   
   @JsonIgnore
   public NSGatewaysFetcher getNSGateways() {
      return nSGateways;
   }
   
   @JsonIgnore
   public NSGatewayTemplatesFetcher getNSGatewayTemplates() {
      return nSGatewayTemplates;
   }
   
   @JsonIgnore
   public NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroups() {
      return nSRedundantGatewayGroups;
   }
   
   @JsonIgnore
   public PublicNetworkMacrosFetcher getPublicNetworkMacros() {
      return publicNetworkMacros;
   }
   
   @JsonIgnore
   public MultiCastListsFetcher getMultiCastLists() {
      return multiCastLists;
   }
   
   @JsonIgnore
   public AvatarsFetcher getAvatars() {
      return avatars;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public ExternalAppServicesFetcher getExternalAppServices() {
      return externalAppServices;
   }
   
   @JsonIgnore
   public ExternalServicesFetcher getExternalServices() {
      return externalServices;
   }
   

   public String toString() {
      return "Enterprise [" + "LDAPAuthorizationEnabled=" + LDAPAuthorizationEnabled + ", LDAPEnabled=" + LDAPEnabled + ", BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", description=" + description + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", floatingIPsQuota=" + floatingIPsQuota + ", floatingIPsUsed=" + floatingIPsUsed + ", encryptionManagementMode=" + encryptionManagementMode + ", enterpriseProfileID=" + enterpriseProfileID + ", entityScope=" + entityScope + ", localAS=" + localAS + ", associatedEnterpriseSecurityID=" + associatedEnterpriseSecurityID + ", associatedGroupKeyEncryptionProfileID=" + associatedGroupKeyEncryptionProfileID + ", associatedKeyServerMonitorID=" + associatedKeyServerMonitorID + ", customerID=" + customerID + ", avatarData=" + avatarData + ", avatarType=" + avatarType + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}