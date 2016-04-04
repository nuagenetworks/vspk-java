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
import vspk.v4_0.fetchers.BootstrapsFetcher;
import vspk.v4_0.fetchers.BootstrapActivationsFetcher;
import vspk.v4_0.fetchers.EnterprisePermissionsFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.GatewaySecuritiesFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.InfrastructureConfigsFetcher;
import vspk.v4_0.fetchers.JobsFetcher;
import vspk.v4_0.fetchers.LocationsFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.NSPortsFetcher;
import vspk.v4_0.fetchers.PATNATPoolsFetcher;
import vspk.v4_0.fetchers.PermissionsFetcher;
import vspk.v4_0.fetchers.SubnetsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NSGateway extends RestObject {

   public final static String REST_NAME = "nsgateway";
   public final static String RESOURCE_NAME = "nsgateways";

   
   public enum TPMStatus { DISABLED, ENABLED_NOT_OPERATIONAL, ENABLED_OPERATIONAL, UNKNOWN };
   public enum BootstrapStatus { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT };
   public enum ConfigurationReloadState { APPLIED, PENDING, SENT, UNKNOWN };
   public enum ConfigurationStatus { FAILURE, SUCCESS, UNKNOWN };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Personality { DC7X50, HARDWARE_VTEP, NSG, OTHER, VRSG, VSA, VSG };

   
   @JsonProperty(value = "NATTraversalEnabled")
   protected boolean NATTraversalEnabled;
   
   @JsonProperty(value = "TPMStatus")
   protected TPMStatus TPMStatus;
   
   @JsonProperty(value = "associatedGatewaySecurityID")
   protected String associatedGatewaySecurityID;
   
   @JsonProperty(value = "associatedGatewaySecurityProfileID")
   protected String associatedGatewaySecurityProfileID;
   
   @JsonProperty(value = "autoDiscGatewayID")
   protected String autoDiscGatewayID;
   
   @JsonProperty(value = "bootstrapID")
   protected String bootstrapID;
   
   @JsonProperty(value = "bootstrapStatus")
   protected BootstrapStatus bootstrapStatus;
   
   @JsonProperty(value = "configurationReloadState")
   protected ConfigurationReloadState configurationReloadState;
   
   @JsonProperty(value = "configurationStatus")
   protected ConfigurationStatus configurationStatus;
   
   @JsonProperty(value = "datapathID")
   protected String datapathID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastConfigurationReloadTimestamp")
   protected int lastConfigurationReloadTimestamp;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "locationID")
   protected String locationID;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "pending")
   protected boolean pending;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "redundancyGroupID")
   protected String redundancyGroupID;
   
   @JsonProperty(value = "systemID")
   protected String systemID;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private BootstrapsFetcher bootstraps;
   
   @JsonIgnore
   private BootstrapActivationsFetcher bootstrapActivations;
   
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
   private JobsFetcher jobs;
   
   @JsonIgnore
   private LocationsFetcher locations;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NSPortsFetcher nSPorts;
   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private SubnetsFetcher subnets;
   

   public NSGateway() {
      
      alarms = new AlarmsFetcher(this);
      
      bootstraps = new BootstrapsFetcher(this);
      
      bootstrapActivations = new BootstrapActivationsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      gatewaySecurities = new GatewaySecuritiesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      infrastructureConfigs = new InfrastructureConfigsFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      locations = new LocationsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nSPorts = new NSPortsFetcher(this);
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      subnets = new SubnetsFetcher(this);
      
   }

   public boolean getNATTraversalEnabled() {
      return NATTraversalEnabled;
   }

   public void setNATTraversalEnabled(boolean value) { 
      this.NATTraversalEnabled = value;
   }
   public TPMStatus getTPMStatus() {
      return TPMStatus;
   }

   public void setTPMStatus(TPMStatus value) { 
      this.TPMStatus = value;
   }
   public String getAssociatedGatewaySecurityID() {
      return associatedGatewaySecurityID;
   }

   public void setAssociatedGatewaySecurityID(String value) { 
      this.associatedGatewaySecurityID = value;
   }
   public String getAssociatedGatewaySecurityProfileID() {
      return associatedGatewaySecurityProfileID;
   }

   public void setAssociatedGatewaySecurityProfileID(String value) { 
      this.associatedGatewaySecurityProfileID = value;
   }
   public String getAutoDiscGatewayID() {
      return autoDiscGatewayID;
   }

   public void setAutoDiscGatewayID(String value) { 
      this.autoDiscGatewayID = value;
   }
   public String getBootstrapID() {
      return bootstrapID;
   }

   public void setBootstrapID(String value) { 
      this.bootstrapID = value;
   }
   public BootstrapStatus getBootstrapStatus() {
      return bootstrapStatus;
   }

   public void setBootstrapStatus(BootstrapStatus value) { 
      this.bootstrapStatus = value;
   }
   public ConfigurationReloadState getConfigurationReloadState() {
      return configurationReloadState;
   }

   public void setConfigurationReloadState(ConfigurationReloadState value) { 
      this.configurationReloadState = value;
   }
   public ConfigurationStatus getConfigurationStatus() {
      return configurationStatus;
   }

   public void setConfigurationStatus(ConfigurationStatus value) { 
      this.configurationStatus = value;
   }
   public String getDatapathID() {
      return datapathID;
   }

   public void setDatapathID(String value) { 
      this.datapathID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getEnterpriseID() {
      return enterpriseID;
   }

   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
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
   public int getLastConfigurationReloadTimestamp() {
      return lastConfigurationReloadTimestamp;
   }

   public void setLastConfigurationReloadTimestamp(int value) { 
      this.lastConfigurationReloadTimestamp = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getLocationID() {
      return locationID;
   }

   public void setLocationID(String value) { 
      this.locationID = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public boolean getPending() {
      return pending;
   }

   public void setPending(boolean value) { 
      this.pending = value;
   }
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   public Personality getPersonality() {
      return personality;
   }

   public void setPersonality(Personality value) { 
      this.personality = value;
   }
   public String getRedundancyGroupID() {
      return redundancyGroupID;
   }

   public void setRedundancyGroupID(String value) { 
      this.redundancyGroupID = value;
   }
   public String getSystemID() {
      return systemID;
   }

   public void setSystemID(String value) { 
      this.systemID = value;
   }
   public String getTemplateID() {
      return templateID;
   }

   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   

   
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   public BootstrapsFetcher getBootstraps() {
      return bootstraps;
   }
   
   public BootstrapActivationsFetcher getBootstrapActivations() {
      return bootstrapActivations;
   }
   
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GatewaySecuritiesFetcher getGatewaySecurities() {
      return gatewaySecurities;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public InfrastructureConfigsFetcher getInfrastructureConfigs() {
      return infrastructureConfigs;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public LocationsFetcher getLocations() {
      return locations;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public NSPortsFetcher getNSPorts() {
      return nSPorts;
   }
   
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   public SubnetsFetcher getSubnets() {
      return subnets;
   }
   

   public String toString() {
      return "NSGateway [" + "NATTraversalEnabled=" + NATTraversalEnabled + ", TPMStatus=" + TPMStatus + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", configurationReloadState=" + configurationReloadState + ", configurationStatus=" + configurationStatus + ", datapathID=" + datapathID + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastConfigurationReloadTimestamp=" + lastConfigurationReloadTimestamp + ", lastUpdatedBy=" + lastUpdatedBy + ", locationID=" + locationID + ", name=" + name + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", redundancyGroupID=" + redundancyGroupID + ", systemID=" + systemID + ", templateID=" + templateID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}