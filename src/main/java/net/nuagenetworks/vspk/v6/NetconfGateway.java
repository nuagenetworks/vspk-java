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
import net.nuagenetworks.vspk.v6.fetchers.DeploymentFailuresFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DomainsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EgressProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GatewaySecuritiesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.InfrastructureConfigsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IPFilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IPv6FilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L2DomainsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.LocationsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MACFilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PortsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SAPEgressQoSProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SAPIngressQoSProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.WANServicesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SubnetsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "netconfgateway", resourceName = "netconfgateways")
public class NetconfGateway extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EZFBMatchAttribute { HOSTNAME, IP_ADDRESS, MAC_ADDRESS, NONE, SERIAL_NUMBER, UUID };
   public enum EBootstrapStatus { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT, QUARANTINED, REVOKED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EFamily { ANY, NSG_AMI, NSG_AZ, NSG_C, NSG_E, NSG_E200, NSG_E300, NSG_V, NSG_X, NSG_X200, VRS };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EPersonality { DC7X50, EVDF, EVDFB, HARDWARE_VTEP, NETCONF_7X50, NETCONF_THIRDPARTY_HW_VTEP, NUAGE_210_WBX_32_Q, NUAGE_210_WBX_48_S, OTHER, VDFG, VRSB, VRSG, VSA, VSG };
   public enum EVendor { CISCO, NOKIA };

   
   @JsonProperty(value = "BIOSReleaseDate")
   
   protected String BIOSReleaseDate;
   
   @JsonProperty(value = "BIOSVersion")
   
   protected String BIOSVersion;
   
   @JsonProperty(value = "CPUType")
   
   protected String CPUType;
   
   @JsonProperty(value = "MACAddress")
   
   protected String MACAddress;
   
   @JsonProperty(value = "UUID")
   
   protected String UUID;
   
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
   
   @JsonProperty(value = "associatedNetconfProfileID")
   
   protected String associatedNetconfProfileID;
   
   @JsonProperty(value = "autoDiscGatewayID")
   
   protected String autoDiscGatewayID;
   
   @JsonProperty(value = "bootstrapID")
   
   protected String bootstrapID;
   
   @JsonProperty(value = "bootstrapStatus")
   
   protected EBootstrapStatus bootstrapStatus;
   
   @JsonProperty(value = "datapathID")
   
   protected String datapathID;
   
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
   
   @JsonProperty(value = "gatewayConnected")
   
   protected Boolean gatewayConnected;
   
   @JsonProperty(value = "gatewayModel")
   
   protected String gatewayModel;
   
   @JsonProperty(value = "gatewayVersion")
   
   protected String gatewayVersion;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "libraries")
   
   protected String libraries;
   
   @JsonProperty(value = "locationID")
   
   protected String locationID;
   
   @JsonProperty(value = "managementID")
   
   protected String managementID;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "patches")
   
   protected String patches;
   
   @JsonProperty(value = "peer")
   
   protected String peer;
   
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
   
   @JsonProperty(value = "systemID")
   
   protected String systemID;
   
   @JsonProperty(value = "templateID")
   
   protected String templateID;
   
   @JsonProperty(value = "useGatewayVLANVNID")
   
   protected Boolean useGatewayVLANVNID;
   
   @JsonProperty(value = "vendor")
   
   protected EVendor vendor;
   
   @JsonProperty(value = "vtep")
   
   protected String vtep;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private BootstrapsFetcher bootstraps;
   
   @JsonIgnore
   private BootstrapActivationsFetcher bootstrapActivations;
   
   @JsonIgnore
   private DeploymentFailuresFetcher deploymentFailures;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private EgressProfilesFetcher egressProfiles;
   
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
   private IngressProfilesFetcher ingressProfiles;
   
   @JsonIgnore
   private IPFilterProfilesFetcher iPFilterProfiles;
   
   @JsonIgnore
   private IPv6FilterProfilesFetcher iPv6FilterProfiles;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private LocationsFetcher locations;
   
   @JsonIgnore
   private MACFilterProfilesFetcher mACFilterProfiles;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private PortsFetcher ports;
   
   @JsonIgnore
   private SAPEgressQoSProfilesFetcher sAPEgressQoSProfiles;
   
   @JsonIgnore
   private SAPIngressQoSProfilesFetcher sAPIngressQoSProfiles;
   
   @JsonIgnore
   private WANServicesFetcher wANServices;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   

   public NetconfGateway() {
      
      alarms = new AlarmsFetcher(this);
      
      bootstraps = new BootstrapsFetcher(this);
      
      bootstrapActivations = new BootstrapActivationsFetcher(this);
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      egressProfiles = new EgressProfilesFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      gatewaySecurities = new GatewaySecuritiesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      infrastructureConfigs = new InfrastructureConfigsFetcher(this);
      
      ingressProfiles = new IngressProfilesFetcher(this);
      
      iPFilterProfiles = new IPFilterProfilesFetcher(this);
      
      iPv6FilterProfiles = new IPv6FilterProfilesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      locations = new LocationsFetcher(this);
      
      mACFilterProfiles = new MACFilterProfilesFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      ports = new PortsFetcher(this);
      
      sAPEgressQoSProfiles = new SAPEgressQoSProfilesFetcher(this);
      
      sAPIngressQoSProfiles = new SAPIngressQoSProfilesFetcher(this);
      
      wANServices = new WANServicesFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
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
   public String getUUID() {
      return UUID;
   }

   @JsonIgnore
   public void setUUID(String value) { 
      this.UUID = value;
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
   public String getAssociatedNetconfProfileID() {
      return associatedNetconfProfileID;
   }

   @JsonIgnore
   public void setAssociatedNetconfProfileID(String value) { 
      this.associatedNetconfProfileID = value;
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
   public String getDatapathID() {
      return datapathID;
   }

   @JsonIgnore
   public void setDatapathID(String value) { 
      this.datapathID = value;
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
   public Boolean getGatewayConnected() {
      return gatewayConnected;
   }

   @JsonIgnore
   public void setGatewayConnected(Boolean value) { 
      this.gatewayConnected = value;
   }
   
   
   @JsonIgnore
   public String getGatewayModel() {
      return gatewayModel;
   }

   @JsonIgnore
   public void setGatewayModel(String value) { 
      this.gatewayModel = value;
   }
   
   
   @JsonIgnore
   public String getGatewayVersion() {
      return gatewayVersion;
   }

   @JsonIgnore
   public void setGatewayVersion(String value) { 
      this.gatewayVersion = value;
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
   public String getManagementID() {
      return managementID;
   }

   @JsonIgnore
   public void setManagementID(String value) { 
      this.managementID = value;
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
   public String getPatches() {
      return patches;
   }

   @JsonIgnore
   public void setPatches(String value) { 
      this.patches = value;
   }
   
   
   @JsonIgnore
   public String getPeer() {
      return peer;
   }

   @JsonIgnore
   public void setPeer(String value) { 
      this.peer = value;
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
   public Boolean getUseGatewayVLANVNID() {
      return useGatewayVLANVNID;
   }

   @JsonIgnore
   public void setUseGatewayVLANVNID(Boolean value) { 
      this.useGatewayVLANVNID = value;
   }
   
   
   @JsonIgnore
   public EVendor getVendor() {
      return vendor;
   }

   @JsonIgnore
   public void setVendor(EVendor value) { 
      this.vendor = value;
   }
   
   
   @JsonIgnore
   public String getVtep() {
      return vtep;
   }

   @JsonIgnore
   public void setVtep(String value) { 
      this.vtep = value;
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
   public DeploymentFailuresFetcher getDeploymentFailures() {
      return deploymentFailures;
   }
   
   @JsonIgnore
   public DomainsFetcher getDomains() {
      return domains;
   }
   
   @JsonIgnore
   public EgressProfilesFetcher getEgressProfiles() {
      return egressProfiles;
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
   public IngressProfilesFetcher getIngressProfiles() {
      return ingressProfiles;
   }
   
   @JsonIgnore
   public IPFilterProfilesFetcher getIPFilterProfiles() {
      return iPFilterProfiles;
   }
   
   @JsonIgnore
   public IPv6FilterProfilesFetcher getIPv6FilterProfiles() {
      return iPv6FilterProfiles;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   @JsonIgnore
   public LocationsFetcher getLocations() {
      return locations;
   }
   
   @JsonIgnore
   public MACFilterProfilesFetcher getMACFilterProfiles() {
      return mACFilterProfiles;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
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
   public PortsFetcher getPorts() {
      return ports;
   }
   
   @JsonIgnore
   public SAPEgressQoSProfilesFetcher getSAPEgressQoSProfiles() {
      return sAPEgressQoSProfiles;
   }
   
   @JsonIgnore
   public SAPIngressQoSProfilesFetcher getSAPIngressQoSProfiles() {
      return sAPIngressQoSProfiles;
   }
   
   @JsonIgnore
   public WANServicesFetcher getWANServices() {
      return wANServices;
   }
   
   @JsonIgnore
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   

   public String toString() {
      return "NetconfGateway [" + "BIOSReleaseDate=" + BIOSReleaseDate + ", BIOSVersion=" + BIOSVersion + ", CPUType=" + CPUType + ", MACAddress=" + MACAddress + ", UUID=" + UUID + ", ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchValue=" + ZFBMatchValue + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", associatedNSGInfoID=" + associatedNSGInfoID + ", associatedNetconfProfileID=" + associatedNetconfProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", datapathID=" + datapathID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", family=" + family + ", gatewayConnected=" + gatewayConnected + ", gatewayModel=" + gatewayModel + ", gatewayVersion=" + gatewayVersion + ", lastUpdatedBy=" + lastUpdatedBy + ", libraries=" + libraries + ", locationID=" + locationID + ", managementID=" + managementID + ", name=" + name + ", patches=" + patches + ", peer=" + peer + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", productName=" + productName + ", redundancyGroupID=" + redundancyGroupID + ", serialNumber=" + serialNumber + ", systemID=" + systemID + ", templateID=" + templateID + ", useGatewayVLANVNID=" + useGatewayVLANVNID + ", vendor=" + vendor + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}