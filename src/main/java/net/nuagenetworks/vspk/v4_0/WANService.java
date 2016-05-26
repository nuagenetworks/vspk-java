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

import net.nuagenetworks.vspk.v4_0.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "service", resourceName = "services")
public class WANService extends RestObject {

   
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum ServiceType { L2, L3 };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum ConfigType { DYNAMIC, STATIC };
   public enum TunnelType { DC_DEFAULT, GRE, VXLAN };

   
   @JsonProperty(value = "WANServiceIdentifier")
   protected String WANServiceIdentifier;
   
   @JsonProperty(value = "IRBEnabled")
   protected Boolean IRBEnabled;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "servicePolicy")
   protected String servicePolicy;
   
   @JsonProperty(value = "serviceType")
   protected ServiceType serviceType;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "vnId")
   protected Long vnId;
   
   @JsonProperty(value = "enterpriseName")
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "configType")
   protected ConfigType configType;
   
   @JsonProperty(value = "orphan")
   protected Boolean orphan;
   
   @JsonProperty(value = "useUserMnemonic")
   protected Boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   protected String userMnemonic;
   
   @JsonProperty(value = "associatedDomainID")
   protected String associatedDomainID;
   
   @JsonProperty(value = "associatedVPNConnectID")
   protected String associatedVPNConnectID;
   
   @JsonProperty(value = "tunnelType")
   protected TunnelType tunnelType;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "externalRouteTarget")
   protected String externalRouteTarget;
   

   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public WANService() {
      configType = ConfigType.STATIC;
      serviceType = ServiceType.L3;
      
      permissions = new PermissionsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public String getWANServiceIdentifier() {
      return WANServiceIdentifier;
   }

   public void setWANServiceIdentifier(String value) { 
      this.WANServiceIdentifier = value;
   }
   public Boolean getIRBEnabled() {
      return IRBEnabled;
   }

   public void setIRBEnabled(Boolean value) { 
      this.IRBEnabled = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public Long getVnId() {
      return vnId;
   }

   public void setVnId(Long value) { 
      this.vnId = value;
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
   public String getDomainName() {
      return domainName;
   }

   public void setDomainName(String value) { 
      this.domainName = value;
   }
   public ConfigType getConfigType() {
      return configType;
   }

   public void setConfigType(ConfigType value) { 
      this.configType = value;
   }
   public Boolean getOrphan() {
      return orphan;
   }

   public void setOrphan(Boolean value) { 
      this.orphan = value;
   }
   public Boolean getUseUserMnemonic() {
      return useUserMnemonic;
   }

   public void setUseUserMnemonic(Boolean value) { 
      this.useUserMnemonic = value;
   }
   public String getUserMnemonic() {
      return userMnemonic;
   }

   public void setUserMnemonic(String value) { 
      this.userMnemonic = value;
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
   public TunnelType getTunnelType() {
      return tunnelType;
   }

   public void setTunnelType(TunnelType value) { 
      this.tunnelType = value;
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
   

   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "WANService [" + "WANServiceIdentifier=" + WANServiceIdentifier + ", IRBEnabled=" + IRBEnabled + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", permittedAction=" + permittedAction + ", servicePolicy=" + servicePolicy + ", serviceType=" + serviceType + ", description=" + description + ", vnId=" + vnId + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", domainName=" + domainName + ", configType=" + configType + ", orphan=" + orphan + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", associatedDomainID=" + associatedDomainID + ", associatedVPNConnectID=" + associatedVPNConnectID + ", tunnelType=" + tunnelType + ", externalID=" + externalID + ", externalRouteTarget=" + externalRouteTarget + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}