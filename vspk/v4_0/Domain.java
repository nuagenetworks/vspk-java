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

import vspk.v4_0.fetchers.BridgeInterfacesFetcher;
import vspk.v4_0.fetchers.DHCPOptionsFetcher;
import vspk.v4_0.fetchers.DomainsFetcher;
import vspk.v4_0.fetchers.DomainTemplatesFetcher;
import vspk.v4_0.fetchers.EgressACLEntryTemplatesFetcher;
import vspk.v4_0.fetchers.EgressACLTemplatesFetcher;
import vspk.v4_0.fetchers.DomainFIPAclTemplatesFetcher;
import vspk.v4_0.fetchers.FloatingIPACLTemplatesFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.ExternalAppServicesFetcher;
import vspk.v4_0.fetchers.FloatingIpsFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.GroupsFetcher;
import vspk.v4_0.fetchers.HostInterfacesFetcher;
import vspk.v4_0.fetchers.IngressACLEntryTemplatesFetcher;
import vspk.v4_0.fetchers.IngressACLTemplatesFetcher;
import vspk.v4_0.fetchers.IngressAdvFwdTemplatesFetcher;
import vspk.v4_0.fetchers.IngressExternalServiceTemplatesFetcher;
import vspk.v4_0.fetchers.JobsFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.PermissionsFetcher;
import vspk.v4_0.fetchers.PolicyGroupsFetcher;
import vspk.v4_0.fetchers.QOSsFetcher;
import vspk.v4_0.fetchers.RedirectionTargetsFetcher;
import vspk.v4_0.fetchers.RoutingPoliciesFetcher;
import vspk.v4_0.fetchers.StaticRoutesFetcher;
import vspk.v4_0.fetchers.StatisticsFetcher;
import vspk.v4_0.fetchers.StatisticsPoliciesFetcher;
import vspk.v4_0.fetchers.SubnetsFetcher;
import vspk.v4_0.fetchers.TCAsFetcher;
import vspk.v4_0.fetchers.UplinkRDsFetcher;
import vspk.v4_0.fetchers.VMsFetcher;
import vspk.v4_0.fetchers.VMInterfacesFetcher;
import vspk.v4_0.fetchers.VPNConnectionsFetcher;
import vspk.v4_0.fetchers.VPortsFetcher;
import vspk.v4_0.fetchers.ZonesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Domain extends RestObject {

   public final static String REST_NAME = "domain";
   public final static String RESOURCE_NAME = "domains";

   
   public enum DHCPBehavior { CONSUME, FLOOD, RELAY };
   public enum PATEnabled { DISABLED, ENABLED, INHERITED };
   public enum ApplicationDeploymentPolicy { NONE, ZONE };
   public enum Encryption { DISABLED, ENABLED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum MaintenanceMode { DISABLED, ENABLED, ENABLED_INHERITED };
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum PolicyChangeStatus { APPLIED, DISCARDED, STARTED };
   public enum TunnelType { DC_DEFAULT, GRE, VXLAN };
   public enum UnderlayEnabled { DISABLED, ENABLED, INHERITED };
   public enum UplinkPreference { PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY, SYMMETRIC };

   
   @JsonProperty(value = "BGPEnabled")
   protected boolean BGPEnabled;
   
   @JsonProperty(value = "DHCPBehavior")
   protected DHCPBehavior DHCPBehavior;
   
   @JsonProperty(value = "DHCPServerAddress")
   protected String DHCPServerAddress;
   
   @JsonProperty(value = "ECMPCount")
   protected int ECMPCount;
   
   @JsonProperty(value = "PATEnabled")
   protected PATEnabled PATEnabled;
   
   @JsonProperty(value = "applicationDeploymentPolicy")
   protected ApplicationDeploymentPolicy applicationDeploymentPolicy;
   
   @JsonProperty(value = "associatedBGPProfileID")
   protected String associatedBGPProfileID;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedPATMapperID")
   protected String associatedPATMapperID;
   
   @JsonProperty(value = "backHaulRouteDistinguisher")
   protected String backHaulRouteDistinguisher;
   
   @JsonProperty(value = "backHaulRouteTarget")
   protected String backHaulRouteTarget;
   
   @JsonProperty(value = "backHaulVNID")
   protected int backHaulVNID;
   
   @JsonProperty(value = "customerID")
   protected int customerID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "dhcpServerAddresses")
   protected java.util.List<String> dhcpServerAddresses;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "exportRouteTarget")
   protected String exportRouteTarget;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "globalRoutingEnabled")
   protected boolean globalRoutingEnabled;
   
   @JsonProperty(value = "importRouteTarget")
   protected String importRouteTarget;
   
   @JsonProperty(value = "labelID")
   protected int labelID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "leakingEnabled")
   protected boolean leakingEnabled;
   
   @JsonProperty(value = "maintenanceMode")
   protected MaintenanceMode maintenanceMode;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "policyChangeStatus")
   protected PolicyChangeStatus policyChangeStatus;
   
   @JsonProperty(value = "routeDistinguisher")
   protected String routeDistinguisher;
   
   @JsonProperty(value = "routeTarget")
   protected String routeTarget;
   
   @JsonProperty(value = "secondaryDHCPServerAddress")
   protected String secondaryDHCPServerAddress;
   
   @JsonProperty(value = "serviceID")
   protected int serviceID;
   
   @JsonProperty(value = "stretched")
   protected boolean stretched;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "tunnelType")
   protected TunnelType tunnelType;
   
   @JsonProperty(value = "underlayEnabled")
   protected UnderlayEnabled underlayEnabled;
   
   @JsonProperty(value = "uplinkPreference")
   protected UplinkPreference uplinkPreference;
   

   
   @JsonIgnore
   private BridgeInterfacesFetcher bridgeInterfaces;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private DomainTemplatesFetcher domainTemplates;
   
   @JsonIgnore
   private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
   
   @JsonIgnore
   private EgressACLTemplatesFetcher egressACLTemplates;
   
   @JsonIgnore
   private DomainFIPAclTemplatesFetcher domainFIPAclTemplates;
   
   @JsonIgnore
   private FloatingIPACLTemplatesFetcher floatingIPACLTemplates;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private ExternalAppServicesFetcher externalAppServices;
   
   @JsonIgnore
   private FloatingIpsFetcher floatingIps;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private HostInterfacesFetcher hostInterfaces;
   
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
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private RoutingPoliciesFetcher routingPolicies;
   
   @JsonIgnore
   private StaticRoutesFetcher staticRoutes;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private UplinkRDsFetcher uplinkRDs;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private VPNConnectionsFetcher vPNConnections;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   
   @JsonIgnore
   private ZonesFetcher zones;
   

   public Domain() {
      
      bridgeInterfaces = new BridgeInterfacesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      domainTemplates = new DomainTemplatesFetcher(this);
      
      egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      domainFIPAclTemplates = new DomainFIPAclTemplatesFetcher(this);
      
      floatingIPACLTemplates = new FloatingIPACLTemplatesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      externalAppServices = new ExternalAppServicesFetcher(this);
      
      floatingIps = new FloatingIpsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      hostInterfaces = new HostInterfacesFetcher(this);
      
      ingressACLEntryTemplates = new IngressACLEntryTemplatesFetcher(this);
      
      ingressACLTemplates = new IngressACLTemplatesFetcher(this);
      
      ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
      
      ingressExternalServiceTemplates = new IngressExternalServiceTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      routingPolicies = new RoutingPoliciesFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      uplinkRDs = new UplinkRDsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vPNConnections = new VPNConnectionsFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
      zones = new ZonesFetcher(this);
      
   }

   public boolean getBGPEnabled() {
      return BGPEnabled;
   }

   public void setBGPEnabled(boolean value) { 
      this.BGPEnabled = value;
   }
   public DHCPBehavior getDHCPBehavior() {
      return DHCPBehavior;
   }

   public void setDHCPBehavior(DHCPBehavior value) { 
      this.DHCPBehavior = value;
   }
   public String getDHCPServerAddress() {
      return DHCPServerAddress;
   }

   public void setDHCPServerAddress(String value) { 
      this.DHCPServerAddress = value;
   }
   public int getECMPCount() {
      return ECMPCount;
   }

   public void setECMPCount(int value) { 
      this.ECMPCount = value;
   }
   public PATEnabled getPATEnabled() {
      return PATEnabled;
   }

   public void setPATEnabled(PATEnabled value) { 
      this.PATEnabled = value;
   }
   public ApplicationDeploymentPolicy getApplicationDeploymentPolicy() {
      return applicationDeploymentPolicy;
   }

   public void setApplicationDeploymentPolicy(ApplicationDeploymentPolicy value) { 
      this.applicationDeploymentPolicy = value;
   }
   public String getAssociatedBGPProfileID() {
      return associatedBGPProfileID;
   }

   public void setAssociatedBGPProfileID(String value) { 
      this.associatedBGPProfileID = value;
   }
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   public String getAssociatedPATMapperID() {
      return associatedPATMapperID;
   }

   public void setAssociatedPATMapperID(String value) { 
      this.associatedPATMapperID = value;
   }
   public String getBackHaulRouteDistinguisher() {
      return backHaulRouteDistinguisher;
   }

   public void setBackHaulRouteDistinguisher(String value) { 
      this.backHaulRouteDistinguisher = value;
   }
   public String getBackHaulRouteTarget() {
      return backHaulRouteTarget;
   }

   public void setBackHaulRouteTarget(String value) { 
      this.backHaulRouteTarget = value;
   }
   public int getBackHaulVNID() {
      return backHaulVNID;
   }

   public void setBackHaulVNID(int value) { 
      this.backHaulVNID = value;
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
   public java.util.List<String> getDhcpServerAddresses() {
      return dhcpServerAddresses;
   }

   public void setDhcpServerAddresses(java.util.List<String> value) { 
      this.dhcpServerAddresses = value;
   }
   public Encryption getEncryption() {
      return encryption;
   }

   public void setEncryption(Encryption value) { 
      this.encryption = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getExportRouteTarget() {
      return exportRouteTarget;
   }

   public void setExportRouteTarget(String value) { 
      this.exportRouteTarget = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public boolean getGlobalRoutingEnabled() {
      return globalRoutingEnabled;
   }

   public void setGlobalRoutingEnabled(boolean value) { 
      this.globalRoutingEnabled = value;
   }
   public String getImportRouteTarget() {
      return importRouteTarget;
   }

   public void setImportRouteTarget(String value) { 
      this.importRouteTarget = value;
   }
   public int getLabelID() {
      return labelID;
   }

   public void setLabelID(int value) { 
      this.labelID = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public boolean getLeakingEnabled() {
      return leakingEnabled;
   }

   public void setLeakingEnabled(boolean value) { 
      this.leakingEnabled = value;
   }
   public MaintenanceMode getMaintenanceMode() {
      return maintenanceMode;
   }

   public void setMaintenanceMode(MaintenanceMode value) { 
      this.maintenanceMode = value;
   }
   public Multicast getMulticast() {
      return multicast;
   }

   public void setMulticast(Multicast value) { 
      this.multicast = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   public PolicyChangeStatus getPolicyChangeStatus() {
      return policyChangeStatus;
   }

   public void setPolicyChangeStatus(PolicyChangeStatus value) { 
      this.policyChangeStatus = value;
   }
   public String getRouteDistinguisher() {
      return routeDistinguisher;
   }

   public void setRouteDistinguisher(String value) { 
      this.routeDistinguisher = value;
   }
   public String getRouteTarget() {
      return routeTarget;
   }

   public void setRouteTarget(String value) { 
      this.routeTarget = value;
   }
   public String getSecondaryDHCPServerAddress() {
      return secondaryDHCPServerAddress;
   }

   public void setSecondaryDHCPServerAddress(String value) { 
      this.secondaryDHCPServerAddress = value;
   }
   public int getServiceID() {
      return serviceID;
   }

   public void setServiceID(int value) { 
      this.serviceID = value;
   }
   public boolean getStretched() {
      return stretched;
   }

   public void setStretched(boolean value) { 
      this.stretched = value;
   }
   public String getTemplateID() {
      return templateID;
   }

   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   public TunnelType getTunnelType() {
      return tunnelType;
   }

   public void setTunnelType(TunnelType value) { 
      this.tunnelType = value;
   }
   public UnderlayEnabled getUnderlayEnabled() {
      return underlayEnabled;
   }

   public void setUnderlayEnabled(UnderlayEnabled value) { 
      this.underlayEnabled = value;
   }
   public UplinkPreference getUplinkPreference() {
      return uplinkPreference;
   }

   public void setUplinkPreference(UplinkPreference value) { 
      this.uplinkPreference = value;
   }
   

   
   public BridgeInterfacesFetcher getBridgeInterfaces() {
      return bridgeInterfaces;
   }
   
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   public DomainsFetcher getDomains() {
      return domains;
   }
   
   public DomainTemplatesFetcher getDomainTemplates() {
      return domainTemplates;
   }
   
   public EgressACLEntryTemplatesFetcher getEgressACLEntryTemplates() {
      return egressACLEntryTemplates;
   }
   
   public EgressACLTemplatesFetcher getEgressACLTemplates() {
      return egressACLTemplates;
   }
   
   public DomainFIPAclTemplatesFetcher getDomainFIPAclTemplates() {
      return domainFIPAclTemplates;
   }
   
   public FloatingIPACLTemplatesFetcher getFloatingIPACLTemplates() {
      return floatingIPACLTemplates;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public ExternalAppServicesFetcher getExternalAppServices() {
      return externalAppServices;
   }
   
   public FloatingIpsFetcher getFloatingIps() {
      return floatingIps;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   public HostInterfacesFetcher getHostInterfaces() {
      return hostInterfaces;
   }
   
   public IngressACLEntryTemplatesFetcher getIngressACLEntryTemplates() {
      return ingressACLEntryTemplates;
   }
   
   public IngressACLTemplatesFetcher getIngressACLTemplates() {
      return ingressACLTemplates;
   }
   
   public IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplates() {
      return ingressAdvFwdTemplates;
   }
   
   public IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplates() {
      return ingressExternalServiceTemplates;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   public RoutingPoliciesFetcher getRoutingPolicies() {
      return routingPolicies;
   }
   
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   public UplinkRDsFetcher getUplinkRDs() {
      return uplinkRDs;
   }
   
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
   }
   
   public VPNConnectionsFetcher getVPNConnections() {
      return vPNConnections;
   }
   
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   
   public ZonesFetcher getZones() {
      return zones;
   }
   

   public String toString() {
      return "Domain [" + "BGPEnabled=" + BGPEnabled + ", DHCPBehavior=" + DHCPBehavior + ", DHCPServerAddress=" + DHCPServerAddress + ", ECMPCount=" + ECMPCount + ", PATEnabled=" + PATEnabled + ", applicationDeploymentPolicy=" + applicationDeploymentPolicy + ", associatedBGPProfileID=" + associatedBGPProfileID + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedPATMapperID=" + associatedPATMapperID + ", backHaulRouteDistinguisher=" + backHaulRouteDistinguisher + ", backHaulRouteTarget=" + backHaulRouteTarget + ", backHaulVNID=" + backHaulVNID + ", customerID=" + customerID + ", description=" + description + ", dhcpServerAddresses=" + dhcpServerAddresses + ", encryption=" + encryption + ", entityScope=" + entityScope + ", exportRouteTarget=" + exportRouteTarget + ", externalID=" + externalID + ", globalRoutingEnabled=" + globalRoutingEnabled + ", importRouteTarget=" + importRouteTarget + ", labelID=" + labelID + ", lastUpdatedBy=" + lastUpdatedBy + ", leakingEnabled=" + leakingEnabled + ", maintenanceMode=" + maintenanceMode + ", multicast=" + multicast + ", name=" + name + ", permittedAction=" + permittedAction + ", policyChangeStatus=" + policyChangeStatus + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", secondaryDHCPServerAddress=" + secondaryDHCPServerAddress + ", serviceID=" + serviceID + ", stretched=" + stretched + ", templateID=" + templateID + ", tunnelType=" + tunnelType + ", underlayEnabled=" + underlayEnabled + ", uplinkPreference=" + uplinkPreference + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}