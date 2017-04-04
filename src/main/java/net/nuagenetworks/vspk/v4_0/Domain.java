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


import net.nuagenetworks.vspk.v4_0.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.RedirectionTargetsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.NetworkPerformanceBindingsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EgressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EgressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DomainFIPAclTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.FloatingIPACLTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.LinksFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.FirewallAclsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.FloatingIpsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IngressACLEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IngressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IngressAdvFwdTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.IngressExternalServiceTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.PolicyGroupsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DomainsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DomainTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ZonesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.HostInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.RoutingPoliciesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.UplinkRDsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VPNConnectionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VPortsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ApplicationperformancemanagementbindingsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.BridgeInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GroupsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.StaticRoutesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.SubnetsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ExternalAppServicesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "domain", resourceName = "domains")
public class Domain extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum PATEnabled { DISABLED, ENABLED, INHERITED };
   public enum DHCPBehavior { CONSUME, FLOOD, OVERLAY_RELAY, UNDERLAY_RELAY };
   public enum DPI { DISABLED, ENABLED };
   public enum MaintenanceMode { DISABLED, ENABLED, ENABLED_INHERITED };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Encryption { DISABLED, ENABLED };
   public enum UnderlayEnabled { DISABLED, ENABLED, INHERITED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PolicyChangeStatus { APPLIED, DISCARDED, STARTED };
   public enum UplinkPreference { PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY, SYMMETRIC };
   public enum ApplicationDeploymentPolicy { NONE, ZONE };
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   public enum TunnelType { DC_DEFAULT, GRE, VXLAN };

   
   @JsonProperty(value = "PATEnabled")
   protected PATEnabled PATEnabled;
   
   @JsonProperty(value = "ECMPCount")
   protected Long ECMPCount;
   
   @JsonProperty(value = "BGPEnabled")
   protected Boolean BGPEnabled;
   
   @JsonProperty(value = "DHCPBehavior")
   protected DHCPBehavior DHCPBehavior;
   
   @JsonProperty(value = "DHCPServerAddress")
   protected String DHCPServerAddress;
   
   @JsonProperty(value = "DPI")
   protected DPI DPI;
   
   @JsonProperty(value = "labelID")
   protected Long labelID;
   
   @JsonProperty(value = "backHaulRouteDistinguisher")
   protected String backHaulRouteDistinguisher;
   
   @JsonProperty(value = "backHaulRouteTarget")
   protected String backHaulRouteTarget;
   
   @JsonProperty(value = "backHaulSubnetIPAddress")
   protected String backHaulSubnetIPAddress;
   
   @JsonProperty(value = "backHaulSubnetMask")
   protected String backHaulSubnetMask;
   
   @JsonProperty(value = "backHaulVNID")
   protected Long backHaulVNID;
   
   @JsonProperty(value = "maintenanceMode")
   protected MaintenanceMode maintenanceMode;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "leakingEnabled")
   protected Boolean leakingEnabled;
   
   @JsonProperty(value = "secondaryDHCPServerAddress")
   protected String secondaryDHCPServerAddress;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "serviceID")
   protected Long serviceID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "dhcpServerAddresses")
   protected java.util.List<String> dhcpServerAddresses;
   
   @JsonProperty(value = "globalRoutingEnabled")
   protected Boolean globalRoutingEnabled;
   
   @JsonProperty(value = "importRouteTarget")
   protected String importRouteTarget;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "underlayEnabled")
   protected UnderlayEnabled underlayEnabled;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "policyChangeStatus")
   protected PolicyChangeStatus policyChangeStatus;
   
   @JsonProperty(value = "domainID")
   protected Long domainID;
   
   @JsonProperty(value = "domainVLANID")
   protected Long domainVLANID;
   
   @JsonProperty(value = "routeDistinguisher")
   protected String routeDistinguisher;
   
   @JsonProperty(value = "routeTarget")
   protected String routeTarget;
   
   @JsonProperty(value = "uplinkPreference")
   protected UplinkPreference uplinkPreference;
   
   @JsonProperty(value = "applicationDeploymentPolicy")
   protected ApplicationDeploymentPolicy applicationDeploymentPolicy;
   
   @JsonProperty(value = "associatedBGPProfileID")
   protected String associatedBGPProfileID;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedPATMapperID")
   protected String associatedPATMapperID;
   
   @JsonProperty(value = "stretched")
   protected Boolean stretched;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "tunnelType")
   protected TunnelType tunnelType;
   
   @JsonProperty(value = "customerID")
   protected Long customerID;
   
   @JsonProperty(value = "exportRouteTarget")
   protected String exportRouteTarget;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NetworkPerformanceBindingsFetcher networkPerformanceBindings;
   
   @JsonIgnore
   private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
   
   @JsonIgnore
   private EgressACLTemplatesFetcher egressACLTemplates;
   
   @JsonIgnore
   private DomainFIPAclTemplatesFetcher domainFIPAclTemplates;
   
   @JsonIgnore
   private FloatingIPACLTemplatesFetcher floatingIPACLTemplates;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private LinksFetcher links;
   
   @JsonIgnore
   private FirewallAclsFetcher firewallAcls;
   
   @JsonIgnore
   private FloatingIpsFetcher floatingIps;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private IngressACLEntryTemplatesFetcher ingressACLEntryTemplates;
   
   @JsonIgnore
   private IngressACLTemplatesFetcher ingressACLTemplates;
   
   @JsonIgnore
   private IngressAdvFwdTemplatesFetcher ingressAdvFwdTemplates;
   
   @JsonIgnore
   private IngressExternalServiceTemplatesFetcher ingressExternalServiceTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private DomainTemplatesFetcher domainTemplates;
   
   @JsonIgnore
   private ZonesFetcher zones;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private HostInterfacesFetcher hostInterfaces;
   
   @JsonIgnore
   private RoutingPoliciesFetcher routingPolicies;
   
   @JsonIgnore
   private UplinkRDsFetcher uplinkRDs;
   
   @JsonIgnore
   private VPNConnectionsFetcher vPNConnections;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   
   @JsonIgnore
   private ApplicationperformancemanagementbindingsFetcher applicationperformancemanagementbindings;
   
   @JsonIgnore
   private BridgeInterfacesFetcher bridgeInterfaces;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private StaticRoutesFetcher staticRoutes;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private ExternalAppServicesFetcher externalAppServices;
   
   @SuppressWarnings("static-access")
   public Domain() {
      PATEnabled = PATEnabled.INHERITED;
      DHCPBehavior = DHCPBehavior.CONSUME;
      tunnelType = TunnelType.DC_DEFAULT;
      applicationDeploymentPolicy = ApplicationDeploymentPolicy.ZONE;
      maintenanceMode = MaintenanceMode.DISABLED;
      
      tCAs = new TCAsFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      networkPerformanceBindings = new NetworkPerformanceBindingsFetcher(this);
      
      egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      domainFIPAclTemplates = new DomainFIPAclTemplatesFetcher(this);
      
      floatingIPACLTemplates = new FloatingIPACLTemplatesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      links = new LinksFetcher(this);
      
      firewallAcls = new FirewallAclsFetcher(this);
      
      floatingIps = new FloatingIpsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
      
      ingressACLTemplates = new IngressACLTemplatesFetcher(this);
      
      ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
      
      ingressExternalServiceTemplates = new IngressExternalServiceTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      domainTemplates = new DomainTemplatesFetcher(this);
      
      zones = new ZonesFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      hostInterfaces = new HostInterfacesFetcher(this);
      
      routingPolicies = new RoutingPoliciesFetcher(this);
      
      uplinkRDs = new UplinkRDsFetcher(this);
      
      vPNConnections = new VPNConnectionsFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
      applicationperformancemanagementbindings = new ApplicationperformancemanagementbindingsFetcher(this);
      
      bridgeInterfaces = new BridgeInterfacesFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      externalAppServices = new ExternalAppServicesFetcher(this);
      
   }

   @JsonIgnore
   public PATEnabled getPATEnabled() {
      return PATEnabled;
   }

   @JsonIgnore
   public void setPATEnabled(PATEnabled value) { 
      this.PATEnabled = value;
   }
   @JsonIgnore
   public Long getECMPCount() {
      return ECMPCount;
   }

   @JsonIgnore
   public void setECMPCount(Long value) { 
      this.ECMPCount = value;
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
   public DHCPBehavior getDHCPBehavior() {
      return DHCPBehavior;
   }

   @JsonIgnore
   public void setDHCPBehavior(DHCPBehavior value) { 
      this.DHCPBehavior = value;
   }
   @JsonIgnore
   public String getDHCPServerAddress() {
      return DHCPServerAddress;
   }

   @JsonIgnore
   public void setDHCPServerAddress(String value) { 
      this.DHCPServerAddress = value;
   }
   @JsonIgnore
   public DPI getDPI() {
      return DPI;
   }

   @JsonIgnore
   public void setDPI(DPI value) { 
      this.DPI = value;
   }
   @JsonIgnore
   public Long getLabelID() {
      return labelID;
   }

   @JsonIgnore
   public void setLabelID(Long value) { 
      this.labelID = value;
   }
   @JsonIgnore
   public String getBackHaulRouteDistinguisher() {
      return backHaulRouteDistinguisher;
   }

   @JsonIgnore
   public void setBackHaulRouteDistinguisher(String value) { 
      this.backHaulRouteDistinguisher = value;
   }
   @JsonIgnore
   public String getBackHaulRouteTarget() {
      return backHaulRouteTarget;
   }

   @JsonIgnore
   public void setBackHaulRouteTarget(String value) { 
      this.backHaulRouteTarget = value;
   }
   @JsonIgnore
   public String getBackHaulSubnetIPAddress() {
      return backHaulSubnetIPAddress;
   }

   @JsonIgnore
   public void setBackHaulSubnetIPAddress(String value) { 
      this.backHaulSubnetIPAddress = value;
   }
   @JsonIgnore
   public String getBackHaulSubnetMask() {
      return backHaulSubnetMask;
   }

   @JsonIgnore
   public void setBackHaulSubnetMask(String value) { 
      this.backHaulSubnetMask = value;
   }
   @JsonIgnore
   public Long getBackHaulVNID() {
      return backHaulVNID;
   }

   @JsonIgnore
   public void setBackHaulVNID(Long value) { 
      this.backHaulVNID = value;
   }
   @JsonIgnore
   public MaintenanceMode getMaintenanceMode() {
      return maintenanceMode;
   }

   @JsonIgnore
   public void setMaintenanceMode(MaintenanceMode value) { 
      this.maintenanceMode = value;
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
   public Boolean getLeakingEnabled() {
      return leakingEnabled;
   }

   @JsonIgnore
   public void setLeakingEnabled(Boolean value) { 
      this.leakingEnabled = value;
   }
   @JsonIgnore
   public String getSecondaryDHCPServerAddress() {
      return secondaryDHCPServerAddress;
   }

   @JsonIgnore
   public void setSecondaryDHCPServerAddress(String value) { 
      this.secondaryDHCPServerAddress = value;
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
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   @JsonIgnore
   public Long getServiceID() {
      return serviceID;
   }

   @JsonIgnore
   public void setServiceID(Long value) { 
      this.serviceID = value;
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
   public java.util.List<String> getDhcpServerAddresses() {
      return dhcpServerAddresses;
   }

   @JsonIgnore
   public void setDhcpServerAddresses(java.util.List<String> value) { 
      this.dhcpServerAddresses = value;
   }
   @JsonIgnore
   public Boolean getGlobalRoutingEnabled() {
      return globalRoutingEnabled;
   }

   @JsonIgnore
   public void setGlobalRoutingEnabled(Boolean value) { 
      this.globalRoutingEnabled = value;
   }
   @JsonIgnore
   public String getImportRouteTarget() {
      return importRouteTarget;
   }

   @JsonIgnore
   public void setImportRouteTarget(String value) { 
      this.importRouteTarget = value;
   }
   @JsonIgnore
   public Encryption getEncryption() {
      return encryption;
   }

   @JsonIgnore
   public void setEncryption(Encryption value) { 
      this.encryption = value;
   }
   @JsonIgnore
   public UnderlayEnabled getUnderlayEnabled() {
      return underlayEnabled;
   }

   @JsonIgnore
   public void setUnderlayEnabled(UnderlayEnabled value) { 
      this.underlayEnabled = value;
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
   public PolicyChangeStatus getPolicyChangeStatus() {
      return policyChangeStatus;
   }

   @JsonIgnore
   public void setPolicyChangeStatus(PolicyChangeStatus value) { 
      this.policyChangeStatus = value;
   }
   @JsonIgnore
   public Long getDomainID() {
      return domainID;
   }

   @JsonIgnore
   public void setDomainID(Long value) { 
      this.domainID = value;
   }
   @JsonIgnore
   public Long getDomainVLANID() {
      return domainVLANID;
   }

   @JsonIgnore
   public void setDomainVLANID(Long value) { 
      this.domainVLANID = value;
   }
   @JsonIgnore
   public String getRouteDistinguisher() {
      return routeDistinguisher;
   }

   @JsonIgnore
   public void setRouteDistinguisher(String value) { 
      this.routeDistinguisher = value;
   }
   @JsonIgnore
   public String getRouteTarget() {
      return routeTarget;
   }

   @JsonIgnore
   public void setRouteTarget(String value) { 
      this.routeTarget = value;
   }
   @JsonIgnore
   public UplinkPreference getUplinkPreference() {
      return uplinkPreference;
   }

   @JsonIgnore
   public void setUplinkPreference(UplinkPreference value) { 
      this.uplinkPreference = value;
   }
   @JsonIgnore
   public ApplicationDeploymentPolicy getApplicationDeploymentPolicy() {
      return applicationDeploymentPolicy;
   }

   @JsonIgnore
   public void setApplicationDeploymentPolicy(ApplicationDeploymentPolicy value) { 
      this.applicationDeploymentPolicy = value;
   }
   @JsonIgnore
   public String getAssociatedBGPProfileID() {
      return associatedBGPProfileID;
   }

   @JsonIgnore
   public void setAssociatedBGPProfileID(String value) { 
      this.associatedBGPProfileID = value;
   }
   @JsonIgnore
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   @JsonIgnore
   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   @JsonIgnore
   public String getAssociatedPATMapperID() {
      return associatedPATMapperID;
   }

   @JsonIgnore
   public void setAssociatedPATMapperID(String value) { 
      this.associatedPATMapperID = value;
   }
   @JsonIgnore
   public Boolean getStretched() {
      return stretched;
   }

   @JsonIgnore
   public void setStretched(Boolean value) { 
      this.stretched = value;
   }
   @JsonIgnore
   public Multicast getMulticast() {
      return multicast;
   }

   @JsonIgnore
   public void setMulticast(Multicast value) { 
      this.multicast = value;
   }
   @JsonIgnore
   public TunnelType getTunnelType() {
      return tunnelType;
   }

   @JsonIgnore
   public void setTunnelType(TunnelType value) { 
      this.tunnelType = value;
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
   public String getExportRouteTarget() {
      return exportRouteTarget;
   }

   @JsonIgnore
   public void setExportRouteTarget(String value) { 
      this.exportRouteTarget = value;
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
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   @JsonIgnore
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public NetworkPerformanceBindingsFetcher getNetworkPerformanceBindings() {
      return networkPerformanceBindings;
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
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   @JsonIgnore
   public LinksFetcher getLinks() {
      return links;
   }
   
   @JsonIgnore
   public FirewallAclsFetcher getFirewallAcls() {
      return firewallAcls;
   }
   
   @JsonIgnore
   public FloatingIpsFetcher getFloatingIps() {
      return floatingIps;
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
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
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
   public IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplates() {
      return ingressAdvFwdTemplates;
   }
   
   @JsonIgnore
   public IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplates() {
      return ingressExternalServiceTemplates;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
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
   public ZonesFetcher getZones() {
      return zones;
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
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public HostInterfacesFetcher getHostInterfaces() {
      return hostInterfaces;
   }
   
   @JsonIgnore
   public RoutingPoliciesFetcher getRoutingPolicies() {
      return routingPolicies;
   }
   
   @JsonIgnore
   public UplinkRDsFetcher getUplinkRDs() {
      return uplinkRDs;
   }
   
   @JsonIgnore
   public VPNConnectionsFetcher getVPNConnections() {
      return vPNConnections;
   }
   
   @JsonIgnore
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   
   @JsonIgnore
   public ApplicationperformancemanagementbindingsFetcher getApplicationperformancemanagementbindings() {
      return applicationperformancemanagementbindings;
   }
   
   @JsonIgnore
   public BridgeInterfacesFetcher getBridgeInterfaces() {
      return bridgeInterfaces;
   }
   
   @JsonIgnore
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   @JsonIgnore
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   @JsonIgnore
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   
   @JsonIgnore
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public ExternalAppServicesFetcher getExternalAppServices() {
      return externalAppServices;
   }
   

   public String toString() {
      return "Domain [" + "PATEnabled=" + PATEnabled + ", ECMPCount=" + ECMPCount + ", BGPEnabled=" + BGPEnabled + ", DHCPBehavior=" + DHCPBehavior + ", DHCPServerAddress=" + DHCPServerAddress + ", DPI=" + DPI + ", labelID=" + labelID + ", backHaulRouteDistinguisher=" + backHaulRouteDistinguisher + ", backHaulRouteTarget=" + backHaulRouteTarget + ", backHaulSubnetIPAddress=" + backHaulSubnetIPAddress + ", backHaulSubnetMask=" + backHaulSubnetMask + ", backHaulVNID=" + backHaulVNID + ", maintenanceMode=" + maintenanceMode + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", leakingEnabled=" + leakingEnabled + ", secondaryDHCPServerAddress=" + secondaryDHCPServerAddress + ", templateID=" + templateID + ", permittedAction=" + permittedAction + ", serviceID=" + serviceID + ", description=" + description + ", dhcpServerAddresses=" + dhcpServerAddresses + ", globalRoutingEnabled=" + globalRoutingEnabled + ", importRouteTarget=" + importRouteTarget + ", encryption=" + encryption + ", underlayEnabled=" + underlayEnabled + ", entityScope=" + entityScope + ", policyChangeStatus=" + policyChangeStatus + ", domainID=" + domainID + ", domainVLANID=" + domainVLANID + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", uplinkPreference=" + uplinkPreference + ", applicationDeploymentPolicy=" + applicationDeploymentPolicy + ", associatedBGPProfileID=" + associatedBGPProfileID + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedPATMapperID=" + associatedPATMapperID + ", stretched=" + stretched + ", multicast=" + multicast + ", tunnelType=" + tunnelType + ", customerID=" + customerID + ", exportRouteTarget=" + exportRouteTarget + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}