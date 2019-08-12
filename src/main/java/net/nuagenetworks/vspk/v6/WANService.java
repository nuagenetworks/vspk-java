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
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "service", resourceName = "services")
public class WANService extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EConfigType { DYNAMIC, STATIC };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EServiceType { L2, L3 };
   public enum ETunnelType { DC_DEFAULT, GRE, VXLAN };

   
   @JsonProperty(value = "IRBEnabled")
   
   protected Boolean IRBEnabled;
   
   @JsonProperty(value = "WANServiceIdentifier")
   
   protected String WANServiceIdentifier;
   
   @JsonProperty(value = "associatedDomainID")
   
   protected String associatedDomainID;
   
   @JsonProperty(value = "associatedVPNConnectID")
   
   protected String associatedVPNConnectID;
   
   @JsonProperty(value = "configType")
   
   protected EConfigType configType;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "domainName")
   
   protected String domainName;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseName")
   
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "externalRouteTarget")
   
   protected String externalRouteTarget;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "orphan")
   
   protected Boolean orphan;
   
   @JsonProperty(value = "permittedAction")
   
   protected EPermittedAction permittedAction;
   
   @JsonProperty(value = "servicePolicy")
   
   protected String servicePolicy;
   
   @JsonProperty(value = "serviceType")
   
   protected EServiceType serviceType;
   
   @JsonProperty(value = "tunnelType")
   
   protected ETunnelType tunnelType;
   
   @JsonProperty(value = "useUserMnemonic")
   
   protected Boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   
   protected String userMnemonic;
   
   @JsonProperty(value = "vnId")
   
   protected Long vnId;
   

   
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
      configType = EConfigType.STATIC;
      serviceType = EServiceType.L3;
      
      alarms = new AlarmsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getIRBEnabled() {
      return IRBEnabled;
   }

   @JsonIgnore
   public void setIRBEnabled(Boolean value) { 
      this.IRBEnabled = value;
   }
   
   
   @JsonIgnore
   public String getWANServiceIdentifier() {
      return WANServiceIdentifier;
   }

   @JsonIgnore
   public void setWANServiceIdentifier(String value) { 
      this.WANServiceIdentifier = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDomainID() {
      return associatedDomainID;
   }

   @JsonIgnore
   public void setAssociatedDomainID(String value) { 
      this.associatedDomainID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedVPNConnectID() {
      return associatedVPNConnectID;
   }

   @JsonIgnore
   public void setAssociatedVPNConnectID(String value) { 
      this.associatedVPNConnectID = value;
   }
   
   
   @JsonIgnore
   public EConfigType getConfigType() {
      return configType;
   }

   @JsonIgnore
   public void setConfigType(EConfigType value) { 
      this.configType = value;
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
   public String getDomainName() {
      return domainName;
   }

   @JsonIgnore
   public void setDomainName(String value) { 
      this.domainName = value;
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
   public String getEnterpriseName() {
      return enterpriseName;
   }

   @JsonIgnore
   public void setEnterpriseName(String value) { 
      this.enterpriseName = value;
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
   public String getExternalRouteTarget() {
      return externalRouteTarget;
   }

   @JsonIgnore
   public void setExternalRouteTarget(String value) { 
      this.externalRouteTarget = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   
   
   @JsonIgnore
   public Boolean getOrphan() {
      return orphan;
   }

   @JsonIgnore
   public void setOrphan(Boolean value) { 
      this.orphan = value;
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
   public String getServicePolicy() {
      return servicePolicy;
   }

   @JsonIgnore
   public void setServicePolicy(String value) { 
      this.servicePolicy = value;
   }
   
   
   @JsonIgnore
   public EServiceType getServiceType() {
      return serviceType;
   }

   @JsonIgnore
   public void setServiceType(EServiceType value) { 
      this.serviceType = value;
   }
   
   
   @JsonIgnore
   public ETunnelType getTunnelType() {
      return tunnelType;
   }

   @JsonIgnore
   public void setTunnelType(ETunnelType value) { 
      this.tunnelType = value;
   }
   
   
   @JsonIgnore
   public Boolean getUseUserMnemonic() {
      return useUserMnemonic;
   }

   @JsonIgnore
   public void setUseUserMnemonic(Boolean value) { 
      this.useUserMnemonic = value;
   }
   
   
   @JsonIgnore
   public String getUserMnemonic() {
      return userMnemonic;
   }

   @JsonIgnore
   public void setUserMnemonic(String value) { 
      this.userMnemonic = value;
   }
   
   
   @JsonIgnore
   public Long getVnId() {
      return vnId;
   }

   @JsonIgnore
   public void setVnId(Long value) { 
      this.vnId = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
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
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   

   public String toString() {
      return "WANService [" + "IRBEnabled=" + IRBEnabled + ", WANServiceIdentifier=" + WANServiceIdentifier + ", associatedDomainID=" + associatedDomainID + ", associatedVPNConnectID=" + associatedVPNConnectID + ", configType=" + configType + ", description=" + description + ", domainName=" + domainName + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", externalRouteTarget=" + externalRouteTarget + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", orphan=" + orphan + ", permittedAction=" + permittedAction + ", servicePolicy=" + servicePolicy + ", serviceType=" + serviceType + ", tunnelType=" + tunnelType + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}