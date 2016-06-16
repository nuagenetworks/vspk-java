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
import net.nuagenetworks.vspk.v4_0.fetchers.VLANsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.NSPortStaticConfigurationsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsport", resourceName = "nsports")
public class NSPort extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum NATTraversal { FULL_NAT, NONE, ONE_TO_ONE_NAT };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PortType { ACCESS, NETWORK };
   public enum Status { INITIALIZED, MISMATCH, ORPHAN, READY };

   
   @JsonProperty(value = "NATTraversal")
   protected NATTraversal NATTraversal;
   
   @JsonProperty(value = "VLANRange")
   protected String VLANRange;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "physicalName")
   protected String physicalName;
   
   @JsonProperty(value = "infrastructureProfileID")
   protected String infrastructureProfileID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "portType")
   protected PortType portType;
   
   @JsonProperty(value = "useUserMnemonic")
   protected Boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   protected String userMnemonic;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "associatedRedundantPortID")
   protected String associatedRedundantPortID;
   
   @JsonProperty(value = "associatedVSCProfileID")
   protected String associatedVSCProfileID;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VLANsFetcher vLANs;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private NSPortStaticConfigurationsFetcher nSPortStaticConfigurations;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public NSPort() {
      
      permissions = new PermissionsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vLANs = new VLANsFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      nSPortStaticConfigurations = new NSPortStaticConfigurationsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public NATTraversal getNATTraversal() {
      return NATTraversal;
   }

   @JsonIgnore
   public void setNATTraversal(NATTraversal value) { 
      this.NATTraversal = value;
   }
   @JsonIgnore
   public String getVLANRange() {
      return VLANRange;
   }

   @JsonIgnore
   public void setVLANRange(String value) { 
      this.VLANRange = value;
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   @JsonIgnore
   public String getPhysicalName() {
      return physicalName;
   }

   @JsonIgnore
   public void setPhysicalName(String value) { 
      this.physicalName = value;
   }
   @JsonIgnore
   public String getInfrastructureProfileID() {
      return infrastructureProfileID;
   }

   @JsonIgnore
   public void setInfrastructureProfileID(String value) { 
      this.infrastructureProfileID = value;
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
   public PortType getPortType() {
      return portType;
   }

   @JsonIgnore
   public void setPortType(PortType value) { 
      this.portType = value;
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
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   @JsonIgnore
   public String getAssociatedRedundantPortID() {
      return associatedRedundantPortID;
   }

   @JsonIgnore
   public void setAssociatedRedundantPortID(String value) { 
      this.associatedRedundantPortID = value;
   }
   @JsonIgnore
   public String getAssociatedVSCProfileID() {
      return associatedVSCProfileID;
   }

   @JsonIgnore
   public void setAssociatedVSCProfileID(String value) { 
      this.associatedVSCProfileID = value;
   }
   @JsonIgnore
   public Status getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(Status value) { 
      this.status = value;
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
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public VLANsFetcher getVLANs() {
      return vLANs;
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
   public NSPortStaticConfigurationsFetcher getNSPortStaticConfigurations() {
      return nSPortStaticConfigurations;
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
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "NSPort [" + "NATTraversal=" + NATTraversal + ", VLANRange=" + VLANRange + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", templateID=" + templateID + ", permittedAction=" + permittedAction + ", description=" + description + ", physicalName=" + physicalName + ", infrastructureProfileID=" + infrastructureProfileID + ", entityScope=" + entityScope + ", portType=" + portType + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedRedundantPortID=" + associatedRedundantPortID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", status=" + status + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}