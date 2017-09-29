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

import net.nuagenetworks.bambou.RestRootObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v5_0.fetchers.AutoDiscoveredGatewaysFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.BGPNeighborsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.BGPProfilesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.CertificatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.CloudMgmtSystemsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.COSRemarkingPolicyTablesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.DomainsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.DSCPRemarkingPolicyTablesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.DUCGroupsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VCenterEAMConfigsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EgressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EgressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.DomainFIPAclTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.FloatingIPACLTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EgressQOSPoliciesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EnterprisesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EnterpriseProfilesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.FloatingIpsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GatewaysFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GatewayTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.HostInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.InfrastructureAccessProfilesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.InfrastructureGatewayProfilesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.InfrastructureVscProfilesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IngressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IngressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IngressAdvFwdEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IngressQOSPoliciesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.KeyServerMembersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.L2DomainsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.L4ServicesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.LicensesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.LicenseStatusFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MirrorDestinationsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MultiCastChannelMapsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NetworkLayoutsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NSGatewaysFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NSGatewayTemplatesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NSGGroupsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NSRedundantGatewayGroupsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.NSGUpgradeProfilesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PATMappersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PerformanceMonitorsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PolicyGroupsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.RateLimitersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.RedirectionTargetsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.RedundancyGroupsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.RoutingPoliciesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.SharedNetworkResourcesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.SiteInfosFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StaticRoutesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatsCollectorInfosFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.SubnetsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.SystemConfigsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.UnderlaysFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.UplinkRDsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.UsersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VCentersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VCenterHypervisorsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VNFCatalogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VNFMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VCenterVRSConfigsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VSPsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ZFBAutoAssignmentsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ZFBRequestsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ZonesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "me", resourceName = "me")
public class Me extends RestRootObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum AvatarType { BASE64, COMPUTEDURL, URL };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "AARFlowStatsInterval")
   protected Long AARFlowStatsInterval;
   
   @JsonProperty(value = "AARProbeStatsInterval")
   protected Long AARProbeStatsInterval;
   
   @JsonProperty(value = "VSSStatsInterval")
   protected Long VSSStatsInterval;
   
   @JsonProperty(value = "avatarData")
   protected String avatarData;
   
   @JsonProperty(value = "avatarType")
   protected AvatarType avatarType;
   
   @JsonProperty(value = "disabled")
   protected Boolean disabled;
   
   @JsonProperty(value = "elasticSearchAddress")
   protected String elasticSearchAddress;
   
   @JsonProperty(value = "email")
   protected String email;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "enterpriseName")
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "firstName")
   protected String firstName;
   
   @JsonProperty(value = "flowCollectionEnabled")
   protected Boolean flowCollectionEnabled;
   
   @JsonProperty(value = "lastName")
   protected String lastName;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "mobileNumber")
   protected String mobileNumber;
   
   @JsonProperty(value = "password")
   protected String password;
   
   @JsonProperty(value = "role")
   protected String role;
   
   @JsonProperty(value = "statisticsEnabled")
   protected Boolean statisticsEnabled;
   
   @JsonProperty(value = "userName")
   protected String userName;
   

   
   @JsonIgnore
   private AutoDiscoveredGatewaysFetcher autoDiscoveredGateways;
   
   @JsonIgnore
   private BGPNeighborsFetcher bGPNeighbors;
   
   @JsonIgnore
   private BGPProfilesFetcher bGPProfiles;
   
   @JsonIgnore
   private CertificatesFetcher certificates;
   
   @JsonIgnore
   private CloudMgmtSystemsFetcher cloudMgmtSystems;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private COSRemarkingPolicyTablesFetcher cOSRemarkingPolicyTables;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private DSCPRemarkingPolicyTablesFetcher dSCPRemarkingPolicyTables;
   
   @JsonIgnore
   private DUCGroupsFetcher dUCGroups;
   
   @JsonIgnore
   private VCenterEAMConfigsFetcher vCenterEAMConfigs;
   
   @JsonIgnore
   private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
   
   @JsonIgnore
   private EgressACLTemplatesFetcher egressACLTemplates;
   
   @JsonIgnore
   private DomainFIPAclTemplatesFetcher domainFIPAclTemplates;
   
   @JsonIgnore
   private FloatingIPACLTemplatesFetcher floatingIPACLTemplates;
   
   @JsonIgnore
   private EgressQOSPoliciesFetcher egressQOSPolicies;
   
   @JsonIgnore
   private EnterprisesFetcher enterprises;
   
   @JsonIgnore
   private EnterpriseProfilesFetcher enterpriseProfiles;
   
   @JsonIgnore
   private FloatingIpsFetcher floatingIps;
   
   @JsonIgnore
   private GatewaysFetcher gateways;
   
   @JsonIgnore
   private GatewayTemplatesFetcher gatewayTemplates;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private HostInterfacesFetcher hostInterfaces;
   
   @JsonIgnore
   private InfrastructureAccessProfilesFetcher infrastructureAccessProfiles;
   
   @JsonIgnore
   private InfrastructureGatewayProfilesFetcher infrastructureGatewayProfiles;
   
   @JsonIgnore
   private InfrastructureVscProfilesFetcher infrastructureVscProfiles;
   
   @JsonIgnore
   private IngressACLEntryTemplatesFetcher ingressACLEntryTemplates;
   
   @JsonIgnore
   private IngressACLTemplatesFetcher ingressACLTemplates;
   
   @JsonIgnore
   private IngressAdvFwdEntryTemplatesFetcher ingressAdvFwdEntryTemplates;
   
   @JsonIgnore
   private IngressQOSPoliciesFetcher ingressQOSPolicies;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private KeyServerMembersFetcher keyServerMembers;
   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private L4ServicesFetcher l4Services;
   
   @JsonIgnore
   private LicensesFetcher licenses;
   
   @JsonIgnore
   private LicenseStatusFetcher licenseStatus;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MirrorDestinationsFetcher mirrorDestinations;
   
   @JsonIgnore
   private MultiCastChannelMapsFetcher multiCastChannelMaps;
   
   @JsonIgnore
   private NetworkLayoutsFetcher networkLayouts;
   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   
   @JsonIgnore
   private NSGatewayTemplatesFetcher nSGatewayTemplates;
   
   @JsonIgnore
   private NSGGroupsFetcher nSGGroups;
   
   @JsonIgnore
   private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
   
   @JsonIgnore
   private NSGUpgradeProfilesFetcher nSGUpgradeProfiles;
   
   @JsonIgnore
   private PATMappersFetcher pATMappers;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PerformanceMonitorsFetcher performanceMonitors;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private RateLimitersFetcher rateLimiters;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private RedundancyGroupsFetcher redundancyGroups;
   
   @JsonIgnore
   private RoutingPoliciesFetcher routingPolicies;
   
   @JsonIgnore
   private SharedNetworkResourcesFetcher sharedNetworkResources;
   
   @JsonIgnore
   private SiteInfosFetcher siteInfos;
   
   @JsonIgnore
   private StaticRoutesFetcher staticRoutes;
   
   @JsonIgnore
   private StatsCollectorInfosFetcher statsCollectorInfos;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   
   @JsonIgnore
   private SystemConfigsFetcher systemConfigs;
   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private UnderlaysFetcher underlays;
   
   @JsonIgnore
   private UplinkRDsFetcher uplinkRDs;
   
   @JsonIgnore
   private UsersFetcher users;
   
   @JsonIgnore
   private VCentersFetcher vCenters;
   
   @JsonIgnore
   private VCenterHypervisorsFetcher vCenterHypervisors;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private VNFCatalogsFetcher vNFCatalogs;
   
   @JsonIgnore
   private VNFMetadatasFetcher vNFMetadatas;
   
   @JsonIgnore
   private VCenterVRSConfigsFetcher vCenterVRSConfigs;
   
   @JsonIgnore
   private VSPsFetcher vSPs;
   
   @JsonIgnore
   private ZFBAutoAssignmentsFetcher zFBAutoAssignments;
   
   @JsonIgnore
   private ZFBRequestsFetcher zFBRequests;
   
   @JsonIgnore
   private ZonesFetcher zones;
   

   public Me() {
      
      autoDiscoveredGateways = new AutoDiscoveredGatewaysFetcher(this);
      
      bGPNeighbors = new BGPNeighborsFetcher(this);
      
      bGPProfiles = new BGPProfilesFetcher(this);
      
      certificates = new CertificatesFetcher(this);
      
      cloudMgmtSystems = new CloudMgmtSystemsFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      cOSRemarkingPolicyTables = new COSRemarkingPolicyTablesFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      dSCPRemarkingPolicyTables = new DSCPRemarkingPolicyTablesFetcher(this);
      
      dUCGroups = new DUCGroupsFetcher(this);
      
      vCenterEAMConfigs = new VCenterEAMConfigsFetcher(this);
      
      egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      domainFIPAclTemplates = new DomainFIPAclTemplatesFetcher(this);
      
      floatingIPACLTemplates = new FloatingIPACLTemplatesFetcher(this);
      
      egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
      
      enterprises = new EnterprisesFetcher(this);
      
      enterpriseProfiles = new EnterpriseProfilesFetcher(this);
      
      floatingIps = new FloatingIpsFetcher(this);
      
      gateways = new GatewaysFetcher(this);
      
      gatewayTemplates = new GatewayTemplatesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      hostInterfaces = new HostInterfacesFetcher(this);
      
      infrastructureAccessProfiles = new InfrastructureAccessProfilesFetcher(this);
      
      infrastructureGatewayProfiles = new InfrastructureGatewayProfilesFetcher(this);
      
      infrastructureVscProfiles = new InfrastructureVscProfilesFetcher(this);
      
      ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
      
      ingressACLTemplates = new IngressACLTemplatesFetcher(this);
      
      ingressAdvFwdEntryTemplates = new IngressAdvFwdEntryTemplatesFetcher(this);
      
      ingressQOSPolicies = new IngressQOSPoliciesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      keyServerMembers = new KeyServerMembersFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      l4Services = new L4ServicesFetcher(this);
      
      licenses = new LicensesFetcher(this);
      
      licenseStatus = new LicenseStatusFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      mirrorDestinations = new MirrorDestinationsFetcher(this);
      
      multiCastChannelMaps = new MultiCastChannelMapsFetcher(this);
      
      networkLayouts = new NetworkLayoutsFetcher(this);
      
      nSGateways = new NSGatewaysFetcher(this);
      
      nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
      
      nSGGroups = new NSGGroupsFetcher(this);
      
      nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
      
      nSGUpgradeProfiles = new NSGUpgradeProfilesFetcher(this);
      
      pATMappers = new PATMappersFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      performanceMonitors = new PerformanceMonitorsFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      rateLimiters = new RateLimitersFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      redundancyGroups = new RedundancyGroupsFetcher(this);
      
      routingPolicies = new RoutingPoliciesFetcher(this);
      
      sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
      
      siteInfos = new SiteInfosFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      statsCollectorInfos = new StatsCollectorInfosFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
      systemConfigs = new SystemConfigsFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      underlays = new UnderlaysFetcher(this);
      
      uplinkRDs = new UplinkRDsFetcher(this);
      
      users = new UsersFetcher(this);
      
      vCenters = new VCentersFetcher(this);
      
      vCenterHypervisors = new VCenterHypervisorsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vNFCatalogs = new VNFCatalogsFetcher(this);
      
      vNFMetadatas = new VNFMetadatasFetcher(this);
      
      vCenterVRSConfigs = new VCenterVRSConfigsFetcher(this);
      
      vSPs = new VSPsFetcher(this);
      
      zFBAutoAssignments = new ZFBAutoAssignmentsFetcher(this);
      
      zFBRequests = new ZFBRequestsFetcher(this);
      
      zones = new ZonesFetcher(this);
      
   }

   
   @JsonIgnore
   public Long getAARFlowStatsInterval() {
      return AARFlowStatsInterval;
   }

   @JsonIgnore
   public void setAARFlowStatsInterval(Long value) { 
      this.AARFlowStatsInterval = value;
   }
   
   @JsonIgnore
   public Long getAARProbeStatsInterval() {
      return AARProbeStatsInterval;
   }

   @JsonIgnore
   public void setAARProbeStatsInterval(Long value) { 
      this.AARProbeStatsInterval = value;
   }
   
   @JsonIgnore
   public Long getVSSStatsInterval() {
      return VSSStatsInterval;
   }

   @JsonIgnore
   public void setVSSStatsInterval(Long value) { 
      this.VSSStatsInterval = value;
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
   public Boolean getDisabled() {
      return disabled;
   }

   @JsonIgnore
   public void setDisabled(Boolean value) { 
      this.disabled = value;
   }
   
   @JsonIgnore
   public String getElasticSearchAddress() {
      return elasticSearchAddress;
   }

   @JsonIgnore
   public void setElasticSearchAddress(String value) { 
      this.elasticSearchAddress = value;
   }
   
   @JsonIgnore
   public String getEmail() {
      return email;
   }

   @JsonIgnore
   public void setEmail(String value) { 
      this.email = value;
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
   public String getEnterpriseName() {
      return enterpriseName;
   }

   @JsonIgnore
   public void setEnterpriseName(String value) { 
      this.enterpriseName = value;
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
   public String getFirstName() {
      return firstName;
   }

   @JsonIgnore
   public void setFirstName(String value) { 
      this.firstName = value;
   }
   
   @JsonIgnore
   public Boolean getFlowCollectionEnabled() {
      return flowCollectionEnabled;
   }

   @JsonIgnore
   public void setFlowCollectionEnabled(Boolean value) { 
      this.flowCollectionEnabled = value;
   }
   
   @JsonIgnore
   public String getLastName() {
      return lastName;
   }

   @JsonIgnore
   public void setLastName(String value) { 
      this.lastName = value;
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
   public String getMobileNumber() {
      return mobileNumber;
   }

   @JsonIgnore
   public void setMobileNumber(String value) { 
      this.mobileNumber = value;
   }
   
   @JsonIgnore
   public String getPassword() {
      return password;
   }

   @JsonIgnore
   public void setPassword(String value) { 
      this.password = value;
   }
   
   @JsonIgnore
   public String getRole() {
      return role;
   }

   @JsonIgnore
   public void setRole(String value) { 
      this.role = value;
   }
   
   @JsonIgnore
   public Boolean getStatisticsEnabled() {
      return statisticsEnabled;
   }

   @JsonIgnore
   public void setStatisticsEnabled(Boolean value) { 
      this.statisticsEnabled = value;
   }
   
   @JsonIgnore
   public String getUserName() {
      return userName;
   }

   @JsonIgnore
   public void setUserName(String value) { 
      this.userName = value;
   }
   

   
   @JsonIgnore
   public AutoDiscoveredGatewaysFetcher getAutoDiscoveredGateways() {
      return autoDiscoveredGateways;
   }
   
   @JsonIgnore
   public BGPNeighborsFetcher getBGPNeighbors() {
      return bGPNeighbors;
   }
   
   @JsonIgnore
   public BGPProfilesFetcher getBGPProfiles() {
      return bGPProfiles;
   }
   
   @JsonIgnore
   public CertificatesFetcher getCertificates() {
      return certificates;
   }
   
   @JsonIgnore
   public CloudMgmtSystemsFetcher getCloudMgmtSystems() {
      return cloudMgmtSystems;
   }
   
   @JsonIgnore
   public ContainersFetcher getContainers() {
      return containers;
   }
   
   @JsonIgnore
   public ContainerInterfacesFetcher getContainerInterfaces() {
      return containerInterfaces;
   }
   
   @JsonIgnore
   public COSRemarkingPolicyTablesFetcher getCOSRemarkingPolicyTables() {
      return cOSRemarkingPolicyTables;
   }
   
   @JsonIgnore
   public DomainsFetcher getDomains() {
      return domains;
   }
   
   @JsonIgnore
   public DSCPRemarkingPolicyTablesFetcher getDSCPRemarkingPolicyTables() {
      return dSCPRemarkingPolicyTables;
   }
   
   @JsonIgnore
   public DUCGroupsFetcher getDUCGroups() {
      return dUCGroups;
   }
   
   @JsonIgnore
   public VCenterEAMConfigsFetcher getVCenterEAMConfigs() {
      return vCenterEAMConfigs;
   }
   
   @JsonIgnore
   public EgressACLEntryTemplatesFetcher getEgressACLEntryTemplates() {
      return egressACLEntryTemplates;
   }
   
   @JsonIgnore
   public EgressACLTemplatesFetcher getEgressACLTemplates() {
      return egressACLTemplates;
   }
   
   @JsonIgnore
   public DomainFIPAclTemplatesFetcher getDomainFIPAclTemplates() {
      return domainFIPAclTemplates;
   }
   
   @JsonIgnore
   public FloatingIPACLTemplatesFetcher getFloatingIPACLTemplates() {
      return floatingIPACLTemplates;
   }
   
   @JsonIgnore
   public EgressQOSPoliciesFetcher getEgressQOSPolicies() {
      return egressQOSPolicies;
   }
   
   @JsonIgnore
   public EnterprisesFetcher getEnterprises() {
      return enterprises;
   }
   
   @JsonIgnore
   public EnterpriseProfilesFetcher getEnterpriseProfiles() {
      return enterpriseProfiles;
   }
   
   @JsonIgnore
   public FloatingIpsFetcher getFloatingIps() {
      return floatingIps;
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
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public HostInterfacesFetcher getHostInterfaces() {
      return hostInterfaces;
   }
   
   @JsonIgnore
   public InfrastructureAccessProfilesFetcher getInfrastructureAccessProfiles() {
      return infrastructureAccessProfiles;
   }
   
   @JsonIgnore
   public InfrastructureGatewayProfilesFetcher getInfrastructureGatewayProfiles() {
      return infrastructureGatewayProfiles;
   }
   
   @JsonIgnore
   public InfrastructureVscProfilesFetcher getInfrastructureVscProfiles() {
      return infrastructureVscProfiles;
   }
   
   @JsonIgnore
   public IngressACLEntryTemplatesFetcher getIngressACLEntryTemplates() {
      return ingressACLEntryTemplates;
   }
   
   @JsonIgnore
   public IngressACLTemplatesFetcher getIngressACLTemplates() {
      return ingressACLTemplates;
   }
   
   @JsonIgnore
   public IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplates() {
      return ingressAdvFwdEntryTemplates;
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
   public KeyServerMembersFetcher getKeyServerMembers() {
      return keyServerMembers;
   }
   
   @JsonIgnore
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   @JsonIgnore
   public L4ServicesFetcher getL4Services() {
      return l4Services;
   }
   
   @JsonIgnore
   public LicensesFetcher getLicenses() {
      return licenses;
   }
   
   @JsonIgnore
   public LicenseStatusFetcher getLicenseStatus() {
      return licenseStatus;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public MirrorDestinationsFetcher getMirrorDestinations() {
      return mirrorDestinations;
   }
   
   @JsonIgnore
   public MultiCastChannelMapsFetcher getMultiCastChannelMaps() {
      return multiCastChannelMaps;
   }
   
   @JsonIgnore
   public NetworkLayoutsFetcher getNetworkLayouts() {
      return networkLayouts;
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
   public NSGGroupsFetcher getNSGGroups() {
      return nSGGroups;
   }
   
   @JsonIgnore
   public NSRedundantGatewayGroupsFetcher getNSRedundantGatewayGroups() {
      return nSRedundantGatewayGroups;
   }
   
   @JsonIgnore
   public NSGUpgradeProfilesFetcher getNSGUpgradeProfiles() {
      return nSGUpgradeProfiles;
   }
   
   @JsonIgnore
   public PATMappersFetcher getPATMappers() {
      return pATMappers;
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
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   @JsonIgnore
   public RateLimitersFetcher getRateLimiters() {
      return rateLimiters;
   }
   
   @JsonIgnore
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
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
   public SharedNetworkResourcesFetcher getSharedNetworkResources() {
      return sharedNetworkResources;
   }
   
   @JsonIgnore
   public SiteInfosFetcher getSiteInfos() {
      return siteInfos;
   }
   
   @JsonIgnore
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   @JsonIgnore
   public StatsCollectorInfosFetcher getStatsCollectorInfos() {
      return statsCollectorInfos;
   }
   
   @JsonIgnore
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   
   @JsonIgnore
   public SystemConfigsFetcher getSystemConfigs() {
      return systemConfigs;
   }
   
   @JsonIgnore
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   @JsonIgnore
   public UnderlaysFetcher getUnderlays() {
      return underlays;
   }
   
   @JsonIgnore
   public UplinkRDsFetcher getUplinkRDs() {
      return uplinkRDs;
   }
   
   @JsonIgnore
   public UsersFetcher getUsers() {
      return users;
   }
   
   @JsonIgnore
   public VCentersFetcher getVCenters() {
      return vCenters;
   }
   
   @JsonIgnore
   public VCenterHypervisorsFetcher getVCenterHypervisors() {
      return vCenterHypervisors;
   }
   
   @JsonIgnore
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   @JsonIgnore
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
   }
   
   @JsonIgnore
   public VNFCatalogsFetcher getVNFCatalogs() {
      return vNFCatalogs;
   }
   
   @JsonIgnore
   public VNFMetadatasFetcher getVNFMetadatas() {
      return vNFMetadatas;
   }
   
   @JsonIgnore
   public VCenterVRSConfigsFetcher getVCenterVRSConfigs() {
      return vCenterVRSConfigs;
   }
   
   @JsonIgnore
   public VSPsFetcher getVSPs() {
      return vSPs;
   }
   
   @JsonIgnore
   public ZFBAutoAssignmentsFetcher getZFBAutoAssignments() {
      return zFBAutoAssignments;
   }
   
   @JsonIgnore
   public ZFBRequestsFetcher getZFBRequests() {
      return zFBRequests;
   }
   
   @JsonIgnore
   public ZonesFetcher getZones() {
      return zones;
   }
   

   public String toString() {
      return "Me [" + "AARFlowStatsInterval=" + AARFlowStatsInterval + ", AARProbeStatsInterval=" + AARProbeStatsInterval + ", VSSStatsInterval=" + VSSStatsInterval + ", avatarData=" + avatarData + ", avatarType=" + avatarType + ", disabled=" + disabled + ", elasticSearchAddress=" + elasticSearchAddress + ", email=" + email + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", firstName=" + firstName + ", flowCollectionEnabled=" + flowCollectionEnabled + ", lastName=" + lastName + ", lastUpdatedBy=" + lastUpdatedBy + ", mobileNumber=" + mobileNumber + ", password=" + password + ", role=" + role + ", statisticsEnabled=" + statisticsEnabled + ", userName=" + userName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + ", apiKey=" + apiKey  + "]";
   }
   
   
}