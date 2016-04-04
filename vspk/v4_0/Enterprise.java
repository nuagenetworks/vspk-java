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


package vspk.v4_0;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v4_0.fetchers.AlarmsFetcher;
import vspk.v4_0.fetchers.AppsFetcher;
import vspk.v4_0.fetchers.ApplicationServicesFetcher;
import vspk.v4_0.fetchers.BGPProfilesFetcher;
import vspk.v4_0.fetchers.DomainsFetcher;
import vspk.v4_0.fetchers.DomainTemplatesFetcher;
import vspk.v4_0.fetchers.DSCPForwardingClassTablesFetcher;
import vspk.v4_0.fetchers.EgressQOSPoliciesFetcher;
import vspk.v4_0.fetchers.EnterpriseNetworksFetcher;
import vspk.v4_0.fetchers.EnterpriseSecuritiesFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.ExternalAppServicesFetcher;
import vspk.v4_0.fetchers.ExternalServicesFetcher;
import vspk.v4_0.fetchers.GatewaysFetcher;
import vspk.v4_0.fetchers.GatewayTemplatesFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.GroupsFetcher;
import vspk.v4_0.fetchers.GroupKeyEncryptionProfilesFetcher;
import vspk.v4_0.fetchers.IKECertificatesFetcher;
import vspk.v4_0.fetchers.IKEEncryptionprofilesFetcher;
import vspk.v4_0.fetchers.IKEGatewaysFetcher;
import vspk.v4_0.fetchers.IKEGatewayProfilesFetcher;
import vspk.v4_0.fetchers.IKEPSKsFetcher;
import vspk.v4_0.fetchers.InfrastructurePortProfilesFetcher;
import vspk.v4_0.fetchers.JobsFetcher;
import vspk.v4_0.fetchers.KeyServerMonitorsFetcher;
import vspk.v4_0.fetchers.L2DomainsFetcher;
import vspk.v4_0.fetchers.L2DomainTemplatesFetcher;
import vspk.v4_0.fetchers.LDAPConfigurationsFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.MetadataTagsFetcher;
import vspk.v4_0.fetchers.MultiCastListsFetcher;
import vspk.v4_0.fetchers.NetworkMacroGroupsFetcher;
import vspk.v4_0.fetchers.NSGatewaysFetcher;
import vspk.v4_0.fetchers.NSGatewayTemplatesFetcher;
import vspk.v4_0.fetchers.NSRedundantGatewayGroupsFetcher;
import vspk.v4_0.fetchers.PATNATPoolsFetcher;
import vspk.v4_0.fetchers.PublicNetworkMacrosFetcher;
import vspk.v4_0.fetchers.RateLimitersFetcher;
import vspk.v4_0.fetchers.RedundancyGroupsFetcher;
import vspk.v4_0.fetchers.RoutingPoliciesFetcher;
import vspk.v4_0.fetchers.SharedNetworkResourcesFetcher;
import vspk.v4_0.fetchers.UsersFetcher;
import vspk.v4_0.fetchers.VMsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Enterprise extends RestObject {

   public final static String REST_NAME = "enterprise";
   public final static String RESOURCE_NAME = "enterprises";

   
   public enum AvatarType { BASE64, COMPUTEDURL, URL };
   public enum EncryptionManagementMode { DISABLED, MANAGED };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "BGPEnabled")
   protected boolean BGPEnabled;
   
   @JsonProperty(value = "DHCPLeaseInterval")
   protected int DHCPLeaseInterval;
   
   @JsonProperty(value = "LDAPAuthorizationEnabled")
   protected boolean LDAPAuthorizationEnabled;
   
   @JsonProperty(value = "LDAPEnabled")
   protected boolean LDAPEnabled;
   
   @JsonProperty(value = "allowAdvancedQOSConfiguration")
   protected boolean allowAdvancedQOSConfiguration;
   
   @JsonProperty(value = "allowGatewayManagement")
   protected boolean allowGatewayManagement;
   
   @JsonProperty(value = "allowTrustedForwardingClass")
   protected boolean allowTrustedForwardingClass;
   
   @JsonProperty(value = "allowedForwardingClasses")
   protected java.util.List<String> allowedForwardingClasses;
   
   @JsonProperty(value = "associatedEnterpriseSecurityID")
   protected String associatedEnterpriseSecurityID;
   
   @JsonProperty(value = "associatedGroupKeyEncryptionProfileID")
   protected String associatedGroupKeyEncryptionProfileID;
   
   @JsonProperty(value = "associatedKeyServerMonitorID")
   protected String associatedKeyServerMonitorID;
   
   @JsonProperty(value = "avatarData")
   protected String avatarData;
   
   @JsonProperty(value = "avatarType")
   protected AvatarType avatarType;
   
   @JsonProperty(value = "customerID")
   protected int customerID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "encryptionManagementMode")
   protected EncryptionManagementMode encryptionManagementMode;
   
   @JsonProperty(value = "enterpriseProfileID")
   protected String enterpriseProfileID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "floatingIPsQuota")
   protected int floatingIPsQuota;
   
   @JsonProperty(value = "floatingIPsUsed")
   protected int floatingIPsUsed;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "localAS")
   protected int localAS;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "receiveMultiCastListID")
   protected String receiveMultiCastListID;
   
   @JsonProperty(value = "sendMultiCastListID")
   protected String sendMultiCastListID;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private AppsFetcher apps;
   
   @JsonIgnore
   private ApplicationServicesFetcher applicationServices;
   
   @JsonIgnore
   private BGPProfilesFetcher bGPProfiles;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private DomainTemplatesFetcher domainTemplates;
   
   @JsonIgnore
   private DSCPForwardingClassTablesFetcher dSCPForwardingClassTables;
   
   @JsonIgnore
   private EgressQOSPoliciesFetcher egressQOSPolicies;
   
   @JsonIgnore
   private EnterpriseNetworksFetcher enterpriseNetworks;
   
   @JsonIgnore
   private EnterpriseSecuritiesFetcher enterpriseSecurities;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private ExternalAppServicesFetcher externalAppServices;
   
   @JsonIgnore
   private ExternalServicesFetcher externalServices;
   
   @JsonIgnore
   private GatewaysFetcher gateways;
   
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
   private InfrastructurePortProfilesFetcher infrastructurePortProfiles;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private KeyServerMonitorsFetcher keyServerMonitors;
   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private L2DomainTemplatesFetcher l2DomainTemplates;
   
   @JsonIgnore
   private LDAPConfigurationsFetcher lDAPConfigurations;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MetadataTagsFetcher metadataTags;
   
   @JsonIgnore
   private MultiCastListsFetcher multiCastLists;
   
   @JsonIgnore
   private NetworkMacroGroupsFetcher networkMacroGroups;
   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   
   @JsonIgnore
   private NSGatewayTemplatesFetcher nSGatewayTemplates;
   
   @JsonIgnore
   private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PublicNetworkMacrosFetcher publicNetworkMacros;
   
   @JsonIgnore
   private RateLimitersFetcher rateLimiters;
   
   @JsonIgnore
   private RedundancyGroupsFetcher redundancyGroups;
   
   @JsonIgnore
   private RoutingPoliciesFetcher routingPolicies;
   
   @JsonIgnore
   private SharedNetworkResourcesFetcher sharedNetworkResources;
   
   @JsonIgnore
   private UsersFetcher users;
   
   @JsonIgnore
   private VMsFetcher vMs;
   

   public Enterprise() {
      
      alarms = new AlarmsFetcher(this);
      
      apps = new AppsFetcher(this);
      
      applicationServices = new ApplicationServicesFetcher(this);
      
      bGPProfiles = new BGPProfilesFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      domainTemplates = new DomainTemplatesFetcher(this);
      
      dSCPForwardingClassTables = new DSCPForwardingClassTablesFetcher(this);
      
      egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
      
      enterpriseNetworks = new EnterpriseNetworksFetcher(this);
      
      enterpriseSecurities = new EnterpriseSecuritiesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      externalAppServices = new ExternalAppServicesFetcher(this);
      
      externalServices = new ExternalServicesFetcher(this);
      
      gateways = new GatewaysFetcher(this);
      
      gatewayTemplates = new GatewayTemplatesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      groupKeyEncryptionProfiles = new GroupKeyEncryptionProfilesFetcher(this);
      
      iKECertificates = new IKECertificatesFetcher(this);
      
      iKEEncryptionprofiles = new IKEEncryptionprofilesFetcher(this);
      
      iKEGateways = new IKEGatewaysFetcher(this);
      
      iKEGatewayProfiles = new IKEGatewayProfilesFetcher(this);
      
      iKEPSKs = new IKEPSKsFetcher(this);
      
      infrastructurePortProfiles = new InfrastructurePortProfilesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      keyServerMonitors = new KeyServerMonitorsFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      l2DomainTemplates = new L2DomainTemplatesFetcher(this);
      
      lDAPConfigurations = new LDAPConfigurationsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      metadataTags = new MetadataTagsFetcher(this);
      
      multiCastLists = new MultiCastListsFetcher(this);
      
      networkMacroGroups = new NetworkMacroGroupsFetcher(this);
      
      nSGateways = new NSGatewaysFetcher(this);
      
      nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
      
      nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      publicNetworkMacros = new PublicNetworkMacrosFetcher(this);
      
      rateLimiters = new RateLimitersFetcher(this);
      
      redundancyGroups = new RedundancyGroupsFetcher(this);
      
      routingPolicies = new RoutingPoliciesFetcher(this);
      
      sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
      
      users = new UsersFetcher(this);
      
      vMs = new VMsFetcher(this);
      
   }

   public boolean getBGPEnabled() {
      return BGPEnabled;
   }

   public void setBGPEnabled(boolean value) { 
      this.BGPEnabled = value;
   }
   public int getDHCPLeaseInterval() {
      return DHCPLeaseInterval;
   }

   public void setDHCPLeaseInterval(int value) { 
      this.DHCPLeaseInterval = value;
   }
   public boolean getLDAPAuthorizationEnabled() {
      return LDAPAuthorizationEnabled;
   }

   public void setLDAPAuthorizationEnabled(boolean value) { 
      this.LDAPAuthorizationEnabled = value;
   }
   public boolean getLDAPEnabled() {
      return LDAPEnabled;
   }

   public void setLDAPEnabled(boolean value) { 
      this.LDAPEnabled = value;
   }
   public boolean getAllowAdvancedQOSConfiguration() {
      return allowAdvancedQOSConfiguration;
   }

   public void setAllowAdvancedQOSConfiguration(boolean value) { 
      this.allowAdvancedQOSConfiguration = value;
   }
   public boolean getAllowGatewayManagement() {
      return allowGatewayManagement;
   }

   public void setAllowGatewayManagement(boolean value) { 
      this.allowGatewayManagement = value;
   }
   public boolean getAllowTrustedForwardingClass() {
      return allowTrustedForwardingClass;
   }

   public void setAllowTrustedForwardingClass(boolean value) { 
      this.allowTrustedForwardingClass = value;
   }
   public java.util.List<String> getAllowedForwardingClasses() {
      return allowedForwardingClasses;
   }

   public void setAllowedForwardingClasses(java.util.List<String> value) { 
      this.allowedForwardingClasses = value;
   }
   public String getAssociatedEnterpriseSecurityID() {
      return associatedEnterpriseSecurityID;
   }

   public void setAssociatedEnterpriseSecurityID(String value) { 
      this.associatedEnterpriseSecurityID = value;
   }
   public String getAssociatedGroupKeyEncryptionProfileID() {
      return associatedGroupKeyEncryptionProfileID;
   }

   public void setAssociatedGroupKeyEncryptionProfileID(String value) { 
      this.associatedGroupKeyEncryptionProfileID = value;
   }
   public String getAssociatedKeyServerMonitorID() {
      return associatedKeyServerMonitorID;
   }

   public void setAssociatedKeyServerMonitorID(String value) { 
      this.associatedKeyServerMonitorID = value;
   }
   public String getAvatarData() {
      return avatarData;
   }

   public void setAvatarData(String value) { 
      this.avatarData = value;
   }
   public AvatarType getAvatarType() {
      return avatarType;
   }

   public void setAvatarType(AvatarType value) { 
      this.avatarType = value;
   }
   public int getCustomerID() {
      return customerID;
   }

   public void setCustomerID(int value) { 
      this.customerID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public EncryptionManagementMode getEncryptionManagementMode() {
      return encryptionManagementMode;
   }

   public void setEncryptionManagementMode(EncryptionManagementMode value) { 
      this.encryptionManagementMode = value;
   }
   public String getEnterpriseProfileID() {
      return enterpriseProfileID;
   }

   public void setEnterpriseProfileID(String value) { 
      this.enterpriseProfileID = value;
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
   public int getFloatingIPsQuota() {
      return floatingIPsQuota;
   }

   public void setFloatingIPsQuota(int value) { 
      this.floatingIPsQuota = value;
   }
   public int getFloatingIPsUsed() {
      return floatingIPsUsed;
   }

   public void setFloatingIPsUsed(int value) { 
      this.floatingIPsUsed = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public int getLocalAS() {
      return localAS;
   }

   public void setLocalAS(int value) { 
      this.localAS = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getReceiveMultiCastListID() {
      return receiveMultiCastListID;
   }

   public void setReceiveMultiCastListID(String value) { 
      this.receiveMultiCastListID = value;
   }
   public String getSendMultiCastListID() {
      return sendMultiCastListID;
   }

   public void setSendMultiCastListID(String value) { 
      this.sendMultiCastListID = value;
   }
   

   
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   public AppsFetcher getApps() {
      return apps;
   }
   
   public ApplicationServicesFetcher getApplicationServices() {
      return applicationServices;
   }
   
   public BGPProfilesFetcher getBGPProfiles() {
      return bGPProfiles;
   }
   
   public DomainsFetcher getDomains() {
      return domains;
   }
   
   public DomainTemplatesFetcher getDomainTemplates() {
      return domainTemplates;
   }
   
   public DSCPForwardingClassTablesFetcher getDSCPForwardingClassTables() {
      return dSCPForwardingClassTables;
   }
   
   public EgressQOSPoliciesFetcher getEgressQOSPolicies() {
      return egressQOSPolicies;
   }
   
   public EnterpriseNetworksFetcher getEnterpriseNetworks() {
      return enterpriseNetworks;
   }
   
   public EnterpriseSecuritiesFetcher getEnterpriseSecurities() {
      return enterpriseSecurities;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public ExternalAppServicesFetcher getExternalAppServices() {
      return externalAppServices;
   }
   
   public ExternalServicesFetcher getExternalServices() {
      return externalServices;
   }
   
   public GatewaysFetcher getGateways() {
      return gateways;
   }
   
   public GatewayTemplatesFetcher getGatewayTemplates() {
      return gatewayTemplates;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   public GroupKeyEncryptionProfilesFetcher getGroupKeyEncryptionProfiles() {
      return groupKeyEncryptionProfiles;
   }
   
   public IKECertificatesFetcher getIKECertificates() {
      return iKECertificates;
   }
   
   public IKEEncryptionprofilesFetcher getIKEEncryptionprofiles() {
      return iKEEncryptionprofiles;
   }
   
   public IKEGatewaysFetcher getIKEGateways() {
      return iKEGateways;
   }
   
   public IKEGatewayProfilesFetcher getIKEGatewayProfiles() {
      return iKEGatewayProfiles;
   }
   
   public IKEPSKsFetcher getIKEPSKs() {
      return iKEPSKs;
   }
   
   public InfrastructurePortProfilesFetcher getInfrastructurePortProfiles() {
      return infrastructurePortProfiles;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public KeyServerMonitorsFetcher getKeyServerMonitors() {
      return keyServerMonitors;
   }
   
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   public L2DomainTemplatesFetcher getL2DomainTemplates() {
      return l2DomainTemplates;
   }
   
   public LDAPConfigurationsFetcher getLDAPConfigurations() {
      return lDAPConfigurations;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public MetadataTagsFetcher getMetadataTags() {
      return metadataTags;
   }
   
   public MultiCastListsFetcher getMultiCastLists() {
      return multiCastLists;
   }
   
   public NetworkMacroGroupsFetcher getNetworkMacroGroups() {
      return networkMacroGroups;
   }
   
   public NSGatewaysFetcher getNSGateways() {
      return nSGateways;
   }
   
   public NSGatewayTemplatesFetcher getNSGatewayTemplates() {
      return nSGatewayTemplates;
   }
   
   public NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroups() {
      return nSRedundantGatewayGroups;
   }
   
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   public PublicNetworkMacrosFetcher getPublicNetworkMacros() {
      return publicNetworkMacros;
   }
   
   public RateLimitersFetcher getRateLimiters() {
      return rateLimiters;
   }
   
   public RedundancyGroupsFetcher getRedundancyGroups() {
      return redundancyGroups;
   }
   
   public RoutingPoliciesFetcher getRoutingPolicies() {
      return routingPolicies;
   }
   
   public SharedNetworkResourcesFetcher getSharedNetworkResources() {
      return sharedNetworkResources;
   }
   
   public UsersFetcher getUsers() {
      return users;
   }
   
   public VMsFetcher getVMs() {
      return vMs;
   }
   

   public String toString() {
      return "Enterprise [" + "BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", LDAPAuthorizationEnabled=" + LDAPAuthorizationEnabled + ", LDAPEnabled=" + LDAPEnabled + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", associatedEnterpriseSecurityID=" + associatedEnterpriseSecurityID + ", associatedGroupKeyEncryptionProfileID=" + associatedGroupKeyEncryptionProfileID + ", associatedKeyServerMonitorID=" + associatedKeyServerMonitorID + ", avatarData=" + avatarData + ", avatarType=" + avatarType + ", customerID=" + customerID + ", description=" + description + ", encryptionManagementMode=" + encryptionManagementMode + ", enterpriseProfileID=" + enterpriseProfileID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", floatingIPsQuota=" + floatingIPsQuota + ", floatingIPsUsed=" + floatingIPsUsed + ", lastUpdatedBy=" + lastUpdatedBy + ", localAS=" + localAS + ", name=" + name + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}