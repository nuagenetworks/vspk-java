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

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.AddressRangesFetcher;
import vspk.v3_2.fetchers.BridgeInterfacesFetcher;
import vspk.v3_2.fetchers.DHCPOptionsFetcher;
import vspk.v3_2.fetchers.EgressACLEntryTemplatesFetcher;
import vspk.v3_2.fetchers.EgressACLTemplatesFetcher;
import vspk.v3_2.fetchers.EventLogsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.GroupsFetcher;
import vspk.v3_2.fetchers.HostInterfacesFetcher;
import vspk.v3_2.fetchers.IngressACLEntryTemplatesFetcher;
import vspk.v3_2.fetchers.IngressACLTemplatesFetcher;
import vspk.v3_2.fetchers.IngressAdvFwdTemplatesFetcher;
import vspk.v3_2.fetchers.IngressExternalServiceTemplatesFetcher;
import vspk.v3_2.fetchers.JobsFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.PermissionsFetcher;
import vspk.v3_2.fetchers.PolicyGroupsFetcher;
import vspk.v3_2.fetchers.QOSsFetcher;
import vspk.v3_2.fetchers.RedirectionTargetsFetcher;
import vspk.v3_2.fetchers.StaticRoutesFetcher;
import vspk.v3_2.fetchers.StatisticsFetcher;
import vspk.v3_2.fetchers.StatisticsPoliciesFetcher;
import vspk.v3_2.fetchers.TCAsFetcher;
import vspk.v3_2.fetchers.UplinkRDsFetcher;
import vspk.v3_2.fetchers.VMsFetcher;
import vspk.v3_2.fetchers.VMInterfacesFetcher;
import vspk.v3_2.fetchers.VPNConnectionsFetcher;
import vspk.v3_2.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class L2Domain extends RestObject {

   public final static String REST_NAME = "l2domain";
   public final static String RESOURCE_NAME = "l2domains";

   
   public enum IPType { IPV4, IPV6 };
   public enum Encryption { DISABLED, ENABLED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum MaintenanceMode { DISABLED, ENABLED, ENABLED_INHERITED };
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   public enum PolicyChangeStatus { APPLIED, DISCARDED, STARTED };
   public enum UplinkPreference { PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY, SYMMETRIC };

   
   @JsonProperty(value = "DHCPManaged")
   protected boolean DHCPManaged;
   
   @JsonProperty(value = "IPType")
   protected IPType IPType;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSharedNetworkResourceID")
   protected String associatedSharedNetworkResourceID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "gatewayMACAddress")
   protected String gatewayMACAddress;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "maintenanceMode")
   protected MaintenanceMode maintenanceMode;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "policyChangeStatus")
   protected PolicyChangeStatus policyChangeStatus;
   
   @JsonProperty(value = "routeDistinguisher")
   protected String routeDistinguisher;
   
   @JsonProperty(value = "routeTarget")
   protected String routeTarget;
   
   @JsonProperty(value = "serviceID")
   protected int serviceID;
   
   @JsonProperty(value = "stretched")
   protected boolean stretched;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "uplinkPreference")
   protected UplinkPreference uplinkPreference;
   
   @JsonProperty(value = "vnId")
   protected int vnId;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private BridgeInterfacesFetcher bridgeInterfaces;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
   
   @JsonIgnore
   private EgressACLTemplatesFetcher egressACLTemplates;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
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
   private StaticRoutesFetcher staticRoutes;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
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
   

   public L2Domain() {
      
      addressRanges = new AddressRangesFetcher(this);
      
      bridgeInterfaces = new BridgeInterfacesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
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
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      uplinkRDs = new UplinkRDsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vPNConnections = new VPNConnectionsFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
   }

   public boolean getDHCPManaged() {
      return DHCPManaged;
   }

   public void setDHCPManaged(boolean value) { 
      this.DHCPManaged = value;
   }
   public IPType getIPType() {
      return IPType;
   }

   public void setIPType(IPType value) { 
      this.IPType = value;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
   }
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   public String getAssociatedSharedNetworkResourceID() {
      return associatedSharedNetworkResourceID;
   }

   public void setAssociatedSharedNetworkResourceID(String value) { 
      this.associatedSharedNetworkResourceID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
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
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getGateway() {
      return gateway;
   }

   public void setGateway(String value) { 
      this.gateway = value;
   }
   public String getGatewayMACAddress() {
      return gatewayMACAddress;
   }

   public void setGatewayMACAddress(String value) { 
      this.gatewayMACAddress = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public String getNetmask() {
      return netmask;
   }

   public void setNetmask(String value) { 
      this.netmask = value;
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
   public UplinkPreference getUplinkPreference() {
      return uplinkPreference;
   }

   public void setUplinkPreference(UplinkPreference value) { 
      this.uplinkPreference = value;
   }
   public int getVnId() {
      return vnId;
   }

   public void setVnId(int value) { 
      this.vnId = value;
   }
   

   
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   public BridgeInterfacesFetcher getBridgeInterfaces() {
      return bridgeInterfaces;
   }
   
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   public EgressACLEntryTemplatesFetcher getEgressACLEntryTemplates() {
      return egressACLEntryTemplates;
   }
   
   public EgressACLTemplatesFetcher getEgressACLTemplates() {
      return egressACLTemplates;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
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
   
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
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
   

   public String toString() {
      return "L2Domain [" + "DHCPManaged=" + DHCPManaged + ", IPType=" + IPType + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSharedNetworkResourceID=" + associatedSharedNetworkResourceID + ", description=" + description + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", lastUpdatedBy=" + lastUpdatedBy + ", maintenanceMode=" + maintenanceMode + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyChangeStatus=" + policyChangeStatus + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", serviceID=" + serviceID + ", stretched=" + stretched + ", templateID=" + templateID + ", uplinkPreference=" + uplinkPreference + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}