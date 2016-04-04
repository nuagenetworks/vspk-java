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

import bambou.RestRootObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.ApplicationServicesFetcher;
import vspk.v3_2.fetchers.AutoDiscoveredGatewaysFetcher;
import vspk.v3_2.fetchers.CertificatesFetcher;
import vspk.v3_2.fetchers.CloudMgmtSystemsFetcher;
import vspk.v3_2.fetchers.DomainsFetcher;
import vspk.v3_2.fetchers.VCenterEAMConfigsFetcher;
import vspk.v3_2.fetchers.EgressACLEntryTemplatesFetcher;
import vspk.v3_2.fetchers.EgressACLTemplatesFetcher;
import vspk.v3_2.fetchers.EgressQOSPoliciesFetcher;
import vspk.v3_2.fetchers.EnterprisesFetcher;
import vspk.v3_2.fetchers.EnterpriseProfilesFetcher;
import vspk.v3_2.fetchers.ExternalAppServicesFetcher;
import vspk.v3_2.fetchers.ExternalServicesFetcher;
import vspk.v3_2.fetchers.FloatingIpsFetcher;
import vspk.v3_2.fetchers.GatewaysFetcher;
import vspk.v3_2.fetchers.GatewayTemplatesFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.HostInterfacesFetcher;
import vspk.v3_2.fetchers.InfrastructureGatewayProfilesFetcher;
import vspk.v3_2.fetchers.InfrastructurePortProfilesFetcher;
import vspk.v3_2.fetchers.InfrastructureVscProfilesFetcher;
import vspk.v3_2.fetchers.IngressACLEntryTemplatesFetcher;
import vspk.v3_2.fetchers.IngressACLTemplatesFetcher;
import vspk.v3_2.fetchers.IngressAdvFwdEntryTemplatesFetcher;
import vspk.v3_2.fetchers.JobsFetcher;
import vspk.v3_2.fetchers.L2DomainsFetcher;
import vspk.v3_2.fetchers.LicensesFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.MetadataTagsFetcher;
import vspk.v3_2.fetchers.MirrorDestinationsFetcher;
import vspk.v3_2.fetchers.MultiCastChannelMapsFetcher;
import vspk.v3_2.fetchers.NetworkLayoutsFetcher;
import vspk.v3_2.fetchers.NSGatewaysFetcher;
import vspk.v3_2.fetchers.NSGatewayTemplatesFetcher;
import vspk.v3_2.fetchers.NSRedundantGatewayGroupsFetcher;
import vspk.v3_2.fetchers.NSPortStaticConfigurationsFetcher;
import vspk.v3_2.fetchers.PATNATPoolsFetcher;
import vspk.v3_2.fetchers.PolicyGroupsFetcher;
import vspk.v3_2.fetchers.RateLimitersFetcher;
import vspk.v3_2.fetchers.RedirectionTargetsFetcher;
import vspk.v3_2.fetchers.RedundancyGroupsFetcher;
import vspk.v3_2.fetchers.SharedNetworkResourcesFetcher;
import vspk.v3_2.fetchers.SiteInfosFetcher;
import vspk.v3_2.fetchers.StaticRoutesFetcher;
import vspk.v3_2.fetchers.StatsCollectorInfosFetcher;
import vspk.v3_2.fetchers.SubnetsFetcher;
import vspk.v3_2.fetchers.SystemConfigsFetcher;
import vspk.v3_2.fetchers.TCAsFetcher;
import vspk.v3_2.fetchers.UplinkRDsFetcher;
import vspk.v3_2.fetchers.UsersFetcher;
import vspk.v3_2.fetchers.VCentersFetcher;
import vspk.v3_2.fetchers.VCenterHypervisorsFetcher;
import vspk.v3_2.fetchers.VMsFetcher;
import vspk.v3_2.fetchers.VMInterfacesFetcher;
import vspk.v3_2.fetchers.VCenterVRSConfigsFetcher;
import vspk.v3_2.fetchers.VSPsFetcher;
import vspk.v3_2.fetchers.ZonesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Me extends RestRootObject {

   public final static String REST_NAME = "me";
   public final static String RESOURCE_NAME = "me";

   
   public enum AvatarType { BASE64, COMPUTEDURL, URL };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "avatarData")
   protected String avatarData;
   
   @JsonProperty(value = "avatarType")
   protected AvatarType avatarType;
   
   @JsonProperty(value = "disabled")
   protected boolean disabled;
   
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
   
   @JsonProperty(value = "userName")
   protected String userName;
   

   
   @JsonIgnore
   private ApplicationServicesFetcher applicationServices;
   
   @JsonIgnore
   private AutoDiscoveredGatewaysFetcher autoDiscoveredGateways;
   
   @JsonIgnore
   private CertificatesFetcher certificates;
   
   @JsonIgnore
   private CloudMgmtSystemsFetcher cloudMgmtSystems;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private VCenterEAMConfigsFetcher vCenterEAMConfigs;
   
   @JsonIgnore
   private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
   
   @JsonIgnore
   private EgressACLTemplatesFetcher egressACLTemplates;
   
   @JsonIgnore
   private EgressQOSPoliciesFetcher egressQOSPolicies;
   
   @JsonIgnore
   private EnterprisesFetcher enterprises;
   
   @JsonIgnore
   private EnterpriseProfilesFetcher enterpriseProfiles;
   
   @JsonIgnore
   private ExternalAppServicesFetcher externalAppServices;
   
   @JsonIgnore
   private ExternalServicesFetcher externalServices;
   
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
   private InfrastructureGatewayProfilesFetcher infrastructureGatewayProfiles;
   
   @JsonIgnore
   private InfrastructurePortProfilesFetcher infrastructurePortProfiles;
   
   @JsonIgnore
   private InfrastructureVscProfilesFetcher infrastructureVscProfiles;
   
   @JsonIgnore
   private IngressACLEntryTemplatesFetcher ingressACLEntryTemplates;
   
   @JsonIgnore
   private IngressACLTemplatesFetcher ingressACLTemplates;
   
   @JsonIgnore
   private IngressAdvFwdEntryTemplatesFetcher ingressAdvFwdEntryTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private LicensesFetcher licenses;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MetadataTagsFetcher metadataTags;
   
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
   private NSRedundantGatewayGroupsFetcher nSRedundantGatewayGroups;
   
   @JsonIgnore
   private NSPortStaticConfigurationsFetcher nSPortStaticConfigurations;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private RateLimitersFetcher rateLimiters;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private RedundancyGroupsFetcher redundancyGroups;
   
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
   private VCenterVRSConfigsFetcher vCenterVRSConfigs;
   
   @JsonIgnore
   private VSPsFetcher vSPs;
   
   @JsonIgnore
   private ZonesFetcher zones;
   

   public Me() {
      
      applicationServices = new ApplicationServicesFetcher(this);
      
      autoDiscoveredGateways = new AutoDiscoveredGatewaysFetcher(this);
      
      certificates = new CertificatesFetcher(this);
      
      cloudMgmtSystems = new CloudMgmtSystemsFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      vCenterEAMConfigs = new VCenterEAMConfigsFetcher(this);
      
      egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      egressQOSPolicies = new EgressQOSPoliciesFetcher(this);
      
      enterprises = new EnterprisesFetcher(this);
      
      enterpriseProfiles = new EnterpriseProfilesFetcher(this);
      
      externalAppServices = new ExternalAppServicesFetcher(this);
      
      externalServices = new ExternalServicesFetcher(this);
      
      floatingIps = new FloatingIpsFetcher(this);
      
      gateways = new GatewaysFetcher(this);
      
      gatewayTemplates = new GatewayTemplatesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      hostInterfaces = new HostInterfacesFetcher(this);
      
      infrastructureGatewayProfiles = new InfrastructureGatewayProfilesFetcher(this);
      
      infrastructurePortProfiles = new InfrastructurePortProfilesFetcher(this);
      
      infrastructureVscProfiles = new InfrastructureVscProfilesFetcher(this);
      
      ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
      
      ingressACLTemplates = new IngressACLTemplatesFetcher(this);
      
      ingressAdvFwdEntryTemplates = new IngressAdvFwdEntryTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      licenses = new LicensesFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      metadataTags = new MetadataTagsFetcher(this);
      
      mirrorDestinations = new MirrorDestinationsFetcher(this);
      
      multiCastChannelMaps = new MultiCastChannelMapsFetcher(this);
      
      networkLayouts = new NetworkLayoutsFetcher(this);
      
      nSGateways = new NSGatewaysFetcher(this);
      
      nSGatewayTemplates = new NSGatewayTemplatesFetcher(this);
      
      nSRedundantGatewayGroups = new NSRedundantGatewayGroupsFetcher(this);
      
      nSPortStaticConfigurations = new NSPortStaticConfigurationsFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      rateLimiters = new RateLimitersFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      redundancyGroups = new RedundancyGroupsFetcher(this);
      
      sharedNetworkResources = new SharedNetworkResourcesFetcher(this);
      
      siteInfos = new SiteInfosFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      statsCollectorInfos = new StatsCollectorInfosFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
      systemConfigs = new SystemConfigsFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      uplinkRDs = new UplinkRDsFetcher(this);
      
      users = new UsersFetcher(this);
      
      vCenters = new VCentersFetcher(this);
      
      vCenterHypervisors = new VCenterHypervisorsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vCenterVRSConfigs = new VCenterVRSConfigsFetcher(this);
      
      vSPs = new VSPsFetcher(this);
      
      zones = new ZonesFetcher(this);
      
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
   public boolean getDisabled() {
      return disabled;
   }

   public void setDisabled(boolean value) { 
      this.disabled = value;
   }
   public String getEmail() {
      return email;
   }

   public void setEmail(String value) { 
      this.email = value;
   }
   public String getEnterpriseID() {
      return enterpriseID;
   }

   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
   }
   public String getEnterpriseName() {
      return enterpriseName;
   }

   public void setEnterpriseName(String value) { 
      this.enterpriseName = value;
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
   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String value) { 
      this.firstName = value;
   }
   public String getLastName() {
      return lastName;
   }

   public void setLastName(String value) { 
      this.lastName = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getMobileNumber() {
      return mobileNumber;
   }

   public void setMobileNumber(String value) { 
      this.mobileNumber = value;
   }
   public String getPassword() {
      return password;
   }

   public void setPassword(String value) { 
      this.password = value;
   }
   public String getRole() {
      return role;
   }

   public void setRole(String value) { 
      this.role = value;
   }
   public String getUserName() {
      return userName;
   }

   public void setUserName(String value) { 
      this.userName = value;
   }
   

   
   public ApplicationServicesFetcher getApplicationServices() {
      return applicationServices;
   }
   
   public AutoDiscoveredGatewaysFetcher getAutoDiscoveredGateways() {
      return autoDiscoveredGateways;
   }
   
   public CertificatesFetcher getCertificates() {
      return certificates;
   }
   
   public CloudMgmtSystemsFetcher getCloudMgmtSystems() {
      return cloudMgmtSystems;
   }
   
   public DomainsFetcher getDomains() {
      return domains;
   }
   
   public VCenterEAMConfigsFetcher getVCenterEAMConfigs() {
      return vCenterEAMConfigs;
   }
   
   public EgressACLEntryTemplatesFetcher getEgressACLEntryTemplates() {
      return egressACLEntryTemplates;
   }
   
   public EgressACLTemplatesFetcher getEgressACLTemplates() {
      return egressACLTemplates;
   }
   
   public EgressQOSPoliciesFetcher getEgressQOSPolicies() {
      return egressQOSPolicies;
   }
   
   public EnterprisesFetcher getEnterprises() {
      return enterprises;
   }
   
   public EnterpriseProfilesFetcher getEnterpriseProfiles() {
      return enterpriseProfiles;
   }
   
   public ExternalAppServicesFetcher getExternalAppServices() {
      return externalAppServices;
   }
   
   public ExternalServicesFetcher getExternalServices() {
      return externalServices;
   }
   
   public FloatingIpsFetcher getFloatingIps() {
      return floatingIps;
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
   
   public HostInterfacesFetcher getHostInterfaces() {
      return hostInterfaces;
   }
   
   public InfrastructureGatewayProfilesFetcher getInfrastructureGatewayProfiles() {
      return infrastructureGatewayProfiles;
   }
   
   public InfrastructurePortProfilesFetcher getInfrastructurePortProfiles() {
      return infrastructurePortProfiles;
   }
   
   public InfrastructureVscProfilesFetcher getInfrastructureVscProfiles() {
      return infrastructureVscProfiles;
   }
   
   public IngressACLEntryTemplatesFetcher getIngressACLEntryTemplates() {
      return ingressACLEntryTemplates;
   }
   
   public IngressACLTemplatesFetcher getIngressACLTemplates() {
      return ingressACLTemplates;
   }
   
   public IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplates() {
      return ingressAdvFwdEntryTemplates;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   public LicensesFetcher getLicenses() {
      return licenses;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public MetadataTagsFetcher getMetadataTags() {
      return metadataTags;
   }
   
   public MirrorDestinationsFetcher getMirrorDestinations() {
      return mirrorDestinations;
   }
   
   public MultiCastChannelMapsFetcher getMultiCastChannelMaps() {
      return multiCastChannelMaps;
   }
   
   public NetworkLayoutsFetcher getNetworkLayouts() {
      return networkLayouts;
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
   
   public NSPortStaticConfigurationsFetcher getNSPortStaticConfigurations() {
      return nSPortStaticConfigurations;
   }
   
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   public RateLimitersFetcher getRateLimiters() {
      return rateLimiters;
   }
   
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   public RedundancyGroupsFetcher getRedundancyGroups() {
      return redundancyGroups;
   }
   
   public SharedNetworkResourcesFetcher getSharedNetworkResources() {
      return sharedNetworkResources;
   }
   
   public SiteInfosFetcher getSiteInfos() {
      return siteInfos;
   }
   
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   public StatsCollectorInfosFetcher getStatsCollectorInfos() {
      return statsCollectorInfos;
   }
   
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   
   public SystemConfigsFetcher getSystemConfigs() {
      return systemConfigs;
   }
   
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   public UplinkRDsFetcher getUplinkRDs() {
      return uplinkRDs;
   }
   
   public UsersFetcher getUsers() {
      return users;
   }
   
   public VCentersFetcher getVCenters() {
      return vCenters;
   }
   
   public VCenterHypervisorsFetcher getVCenterHypervisors() {
      return vCenterHypervisors;
   }
   
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
   }
   
   public VCenterVRSConfigsFetcher getVCenterVRSConfigs() {
      return vCenterVRSConfigs;
   }
   
   public VSPsFetcher getVSPs() {
      return vSPs;
   }
   
   public ZonesFetcher getZones() {
      return zones;
   }
   

   public String toString() {
      return "Me [" + "avatarData=" + avatarData + ", avatarType=" + avatarType + ", disabled=" + disabled + ", email=" + email + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdatedBy=" + lastUpdatedBy + ", mobileNumber=" + mobileNumber + ", password=" + password + ", role=" + role + ", userName=" + userName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + ", apiKey=" + apiKey  + "]";
   }
   
   
}