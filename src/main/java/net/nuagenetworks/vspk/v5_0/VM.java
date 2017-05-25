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

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v5_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMResyncsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VRSsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vm", resourceName = "vms")
public class VM extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum DeleteMode { TIMER };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum ReasonType { BLOCKED_LAST, BLOCKED_UNKNOWN, CRASHED_LAST, CRASHED_UNKNOWN, NOSTATE_LAST, NOSTATE_UNKNOWN, PAUSED_DUMP, PAUSED_FROM_SNAPSHOT, PAUSED_IOERROR, PAUSED_LAST, PAUSED_MIGRATION, PAUSED_SAVE, PAUSED_SHUTTING_DOWN, PAUSED_UNKNOWN, PAUSED_USER, PAUSED_WATCHDOG, RUNNING_BOOTED, RUNNING_FROM_SNAPSHOT, RUNNING_LAST, RUNNING_MIGRATED, RUNNING_MIGRATION_CANCELED, RUNNING_RESTORED, RUNNING_SAVE_CANCELED, RUNNING_UNKNOWN, RUNNING_UNPAUSED, SHUTDOWN_LAST, SHUTDOWN_UNKNOWN, SHUTDOWN_USER, SHUTOFF_CRASHED, SHUTOFF_DESTROYED, SHUTOFF_FAILED, SHUTOFF_FROM_SNAPSHOT, SHUTOFF_LAST, SHUTOFF_MIGRATED, SHUTOFF_SAVED, SHUTOFF_SHUTDOWN, SHUTOFF_UNKNOWN, UNKNOWN };
   public enum Status { BLOCKED, CRASHED, DELETE_PENDING, INIT, LAST, NOSTATE, PAUSED, RUNNING, SHUTDOWN, SHUTOFF, UNKNOWN, UNREACHABLE };

   
   @JsonProperty(value = "UUID")
   protected String UUID;
   
   @JsonProperty(value = "VRSID")
   protected String VRSID;
   
   @JsonProperty(value = "deleteExpiry")
   protected Long deleteExpiry;
   
   @JsonProperty(value = "deleteMode")
   protected DeleteMode deleteMode;
   
   @JsonProperty(value = "domainIDs")
   protected java.util.List<String> domainIDs;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "enterpriseName")
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "hypervisorIP")
   protected String hypervisorIP;
   
   @JsonProperty(value = "interfaces")
   protected java.util.List<VMInterface> interfaces;
   
   @JsonProperty(value = "l2DomainIDs")
   protected java.util.List<String> l2DomainIDs;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "orchestrationID")
   protected String orchestrationID;
   
   @JsonProperty(value = "reasonType")
   protected ReasonType reasonType;
   
   @JsonProperty(value = "resyncInfo")
   protected VMResync resyncInfo;
   
   @JsonProperty(value = "siteIdentifier")
   protected String siteIdentifier;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "subnetIDs")
   protected java.util.List<String> subnetIDs;
   
   @JsonProperty(value = "userID")
   protected String userID;
   
   @JsonProperty(value = "userName")
   protected String userName;
   
   @JsonProperty(value = "zoneIDs")
   protected java.util.List<String> zoneIDs;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VMResyncsFetcher vMResyncs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private VRSsFetcher vRSs;
   

   public VM() {
      
      alarms = new AlarmsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vMResyncs = new VMResyncsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vRSs = new VRSsFetcher(this);
      
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
   public String getVRSID() {
      return VRSID;
   }

   @JsonIgnore
   public void setVRSID(String value) { 
      this.VRSID = value;
   }
   @JsonIgnore
   public Long getDeleteExpiry() {
      return deleteExpiry;
   }

   @JsonIgnore
   public void setDeleteExpiry(Long value) { 
      this.deleteExpiry = value;
   }
   @JsonIgnore
   public DeleteMode getDeleteMode() {
      return deleteMode;
   }

   @JsonIgnore
   public void setDeleteMode(DeleteMode value) { 
      this.deleteMode = value;
   }
   @JsonIgnore
   public java.util.List<String> getDomainIDs() {
      return domainIDs;
   }

   @JsonIgnore
   public void setDomainIDs(java.util.List<String> value) { 
      this.domainIDs = value;
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
   public String getEnterpriseName() {
      return enterpriseName;
   }

   @JsonIgnore
   public void setEnterpriseName(String value) { 
      this.enterpriseName = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   @JsonIgnore
   public String getHypervisorIP() {
      return hypervisorIP;
   }

   @JsonIgnore
   public void setHypervisorIP(String value) { 
      this.hypervisorIP = value;
   }
   @JsonIgnore
   public java.util.List<VMInterface> getInterfaces() {
      return interfaces;
   }

   @JsonIgnore
   public void setInterfaces(java.util.List<VMInterface> value) { 
      this.interfaces = value;
   }
   @JsonIgnore
   public java.util.List<String> getL2DomainIDs() {
      return l2DomainIDs;
   }

   @JsonIgnore
   public void setL2DomainIDs(java.util.List<String> value) { 
      this.l2DomainIDs = value;
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
   public String getOrchestrationID() {
      return orchestrationID;
   }

   @JsonIgnore
   public void setOrchestrationID(String value) { 
      this.orchestrationID = value;
   }
   @JsonIgnore
   public ReasonType getReasonType() {
      return reasonType;
   }

   @JsonIgnore
   public void setReasonType(ReasonType value) { 
      this.reasonType = value;
   }
   @JsonIgnore
   public VMResync getResyncInfo() {
      return resyncInfo;
   }

   @JsonIgnore
   public void setResyncInfo(VMResync value) { 
      this.resyncInfo = value;
   }
   @JsonIgnore
   public String getSiteIdentifier() {
      return siteIdentifier;
   }

   @JsonIgnore
   public void setSiteIdentifier(String value) { 
      this.siteIdentifier = value;
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
   public java.util.List<String> getSubnetIDs() {
      return subnetIDs;
   }

   @JsonIgnore
   public void setSubnetIDs(java.util.List<String> value) { 
      this.subnetIDs = value;
   }
   @JsonIgnore
   public String getUserID() {
      return userID;
   }

   @JsonIgnore
   public void setUserID(String value) { 
      this.userID = value;
   }
   @JsonIgnore
   public String getUserName() {
      return userName;
   }

   @JsonIgnore
   public void setUserName(String value) { 
      this.userName = value;
   }
   @JsonIgnore
   public java.util.List<String> getZoneIDs() {
      return zoneIDs;
   }

   @JsonIgnore
   public void setZoneIDs(java.util.List<String> value) { 
      this.zoneIDs = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
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
   public VMResyncsFetcher getVMResyncs() {
      return vMResyncs;
   }
   
   @JsonIgnore
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
   }
   
   @JsonIgnore
   public VRSsFetcher getVRSs() {
      return vRSs;
   }
   

   public String toString() {
      return "VM [" + "UUID=" + UUID + ", VRSID=" + VRSID + ", deleteExpiry=" + deleteExpiry + ", deleteMode=" + deleteMode + ", domainIDs=" + domainIDs + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", hypervisorIP=" + hypervisorIP + ", interfaces=" + interfaces + ", l2DomainIDs=" + l2DomainIDs + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", orchestrationID=" + orchestrationID + ", reasonType=" + reasonType + ", resyncInfo=" + resyncInfo + ", siteIdentifier=" + siteIdentifier + ", status=" + status + ", subnetIDs=" + subnetIDs + ", userID=" + userID + ", userName=" + userName + ", zoneIDs=" + zoneIDs + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}