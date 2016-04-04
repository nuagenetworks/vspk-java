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

import vspk.v3_2.fetchers.AlarmsFetcher;
import vspk.v3_2.fetchers.EnterprisePermissionsFetcher;
import vspk.v3_2.fetchers.EventLogsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.PermissionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WANService extends RestObject {

   public final static String REST_NAME = "service";
   public final static String RESOURCE_NAME = "services";

   
   public enum ConfigType { DYNAMIC, STATIC };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum ServiceType { L2, L3 };
   public enum TunnelType { DC_DEFAULT, GRE, VXLAN };

   
   @JsonProperty(value = "IRBEnabled")
   protected boolean IRBEnabled;
   
   @JsonProperty(value = "WANServiceIdentifier")
   protected String WANServiceIdentifier;
   
   @JsonProperty(value = "associatedDomainID")
   protected String associatedDomainID;
   
   @JsonProperty(value = "associatedVPNConnectID")
   protected String associatedVPNConnectID;
   
   @JsonProperty(value = "configType")
   protected ConfigType configType;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "enterpriseName")
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "externalRouteTarget")
   protected String externalRouteTarget;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "orphan")
   protected boolean orphan;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "servicePolicy")
   protected String servicePolicy;
   
   @JsonProperty(value = "serviceType")
   protected ServiceType serviceType;
   
   @JsonProperty(value = "tunnelType")
   protected TunnelType tunnelType;
   
   @JsonProperty(value = "useUserMnemonic")
   protected boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   protected String userMnemonic;
   
   @JsonProperty(value = "vnId")
   protected int vnId;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public WANService() {
      
      alarms = new AlarmsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   public boolean getIRBEnabled() {
      return IRBEnabled;
   }

   public void setIRBEnabled(boolean value) { 
      this.IRBEnabled = value;
   }
   public String getWANServiceIdentifier() {
      return WANServiceIdentifier;
   }

   public void setWANServiceIdentifier(String value) { 
      this.WANServiceIdentifier = value;
   }
   public String getAssociatedDomainID() {
      return associatedDomainID;
   }

   public void setAssociatedDomainID(String value) { 
      this.associatedDomainID = value;
   }
   public String getAssociatedVPNConnectID() {
      return associatedVPNConnectID;
   }

   public void setAssociatedVPNConnectID(String value) { 
      this.associatedVPNConnectID = value;
   }
   public ConfigType getConfigType() {
      return configType;
   }

   public void setConfigType(ConfigType value) { 
      this.configType = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getDomainName() {
      return domainName;
   }

   public void setDomainName(String value) { 
      this.domainName = value;
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
   public String getExternalRouteTarget() {
      return externalRouteTarget;
   }

   public void setExternalRouteTarget(String value) { 
      this.externalRouteTarget = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public boolean getOrphan() {
      return orphan;
   }

   public void setOrphan(boolean value) { 
      this.orphan = value;
   }
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   public String getServicePolicy() {
      return servicePolicy;
   }

   public void setServicePolicy(String value) { 
      this.servicePolicy = value;
   }
   public ServiceType getServiceType() {
      return serviceType;
   }

   public void setServiceType(ServiceType value) { 
      this.serviceType = value;
   }
   public TunnelType getTunnelType() {
      return tunnelType;
   }

   public void setTunnelType(TunnelType value) { 
      this.tunnelType = value;
   }
   public boolean getUseUserMnemonic() {
      return useUserMnemonic;
   }

   public void setUseUserMnemonic(boolean value) { 
      this.useUserMnemonic = value;
   }
   public String getUserMnemonic() {
      return userMnemonic;
   }

   public void setUserMnemonic(String value) { 
      this.userMnemonic = value;
   }
   public int getVnId() {
      return vnId;
   }

   public void setVnId(int value) { 
      this.vnId = value;
   }
   

   
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   

   public String toString() {
      return "WANService [" + "IRBEnabled=" + IRBEnabled + ", WANServiceIdentifier=" + WANServiceIdentifier + ", associatedDomainID=" + associatedDomainID + ", associatedVPNConnectID=" + associatedVPNConnectID + ", configType=" + configType + ", description=" + description + ", domainName=" + domainName + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", externalRouteTarget=" + externalRouteTarget + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", orphan=" + orphan + ", permittedAction=" + permittedAction + ", servicePolicy=" + servicePolicy + ", serviceType=" + serviceType + ", tunnelType=" + tunnelType + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}