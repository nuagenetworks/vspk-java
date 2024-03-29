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
import net.nuagenetworks.vspk.v6.fetchers.BGPPeersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.ControllerVRSLinksFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MonitoringPortsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StatisticsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vsc", resourceName = "vscs")
public class VSC extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EStatus { ADMIN_DOWN, DOWN, UP };

   
   @JsonProperty(value = "addresses")
   
   protected java.util.List<String> addresses;
   
   @JsonProperty(value = "alreadyMarkedForUnavailable")
   
   protected Boolean alreadyMarkedForUnavailable;
   
   @JsonProperty(value = "averageCPUUsage")
   
   protected Float averageCPUUsage;
   
   @JsonProperty(value = "averageMemoryUsage")
   
   protected Float averageMemoryUsage;
   
   @JsonProperty(value = "communicationId")
   
   protected String communicationId;
   
   @JsonProperty(value = "creationDate")
   
   protected String creationDate;
   
   @JsonProperty(value = "currentCPUUsage")
   
   protected Float currentCPUUsage;
   
   @JsonProperty(value = "currentMemoryUsage")
   
   protected Float currentMemoryUsage;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "disks")
   
   protected java.util.List<DiskStat> disks;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastStateChange")
   
   protected Long lastStateChange;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUpdatedDate")
   
   protected String lastUpdatedDate;
   
   @JsonProperty(value = "location")
   
   protected String location;
   
   @JsonProperty(value = "managementIP")
   
   protected String managementIP;
   
   @JsonProperty(value = "messages")
   
   protected java.util.List<String> messages;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "numberOfConnections")
   
   protected Long numberOfConnections;
   
   @JsonProperty(value = "owner")
   
   protected String owner;
   
   @JsonProperty(value = "peakCPUUsage")
   
   protected Float peakCPUUsage;
   
   @JsonProperty(value = "peakMemoryUsage")
   
   protected Float peakMemoryUsage;
   
   @JsonProperty(value = "productVersion")
   
   protected String productVersion;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   
   @JsonProperty(value = "unavailableTimestamp")
   
   protected Long unavailableTimestamp;
   
   @JsonProperty(value = "vsds")
   
   protected java.util.List<String> vsds;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private BGPPeersFetcher bGPPeers;
   
   @JsonIgnore
   private ControllerVRSLinksFetcher controllerVRSLinks;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MonitoringPortsFetcher monitoringPorts;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   

   public VSC() {
      
      alarms = new AlarmsFetcher(this);
      
      bGPPeers = new BGPPeersFetcher(this);
      
      controllerVRSLinks = new ControllerVRSLinksFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      monitoringPorts = new MonitoringPortsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public java.util.List<String> getAddresses() {
      return addresses;
   }

   @JsonIgnore
   public void setAddresses(java.util.List<String> value) { 
      this.addresses = value;
   }
   
   
   @JsonIgnore
   public Boolean getAlreadyMarkedForUnavailable() {
      return alreadyMarkedForUnavailable;
   }

   @JsonIgnore
   public void setAlreadyMarkedForUnavailable(Boolean value) { 
      this.alreadyMarkedForUnavailable = value;
   }
   
   
   @JsonIgnore
   public Float getAverageCPUUsage() {
      return averageCPUUsage;
   }

   @JsonIgnore
   public void setAverageCPUUsage(Float value) { 
      this.averageCPUUsage = value;
   }
   
   
   @JsonIgnore
   public Float getAverageMemoryUsage() {
      return averageMemoryUsage;
   }

   @JsonIgnore
   public void setAverageMemoryUsage(Float value) { 
      this.averageMemoryUsage = value;
   }
   
   
   @JsonIgnore
   public String getCommunicationId() {
      return communicationId;
   }

   @JsonIgnore
   public void setCommunicationId(String value) { 
      this.communicationId = value;
   }
   
   
   @JsonIgnore
   public String getCreationDate() {
      return creationDate;
   }

   @JsonIgnore
   public void setCreationDate(String value) { 
      this.creationDate = value;
   }
   
   
   @JsonIgnore
   public Float getCurrentCPUUsage() {
      return currentCPUUsage;
   }

   @JsonIgnore
   public void setCurrentCPUUsage(Float value) { 
      this.currentCPUUsage = value;
   }
   
   
   @JsonIgnore
   public Float getCurrentMemoryUsage() {
      return currentMemoryUsage;
   }

   @JsonIgnore
   public void setCurrentMemoryUsage(Float value) { 
      this.currentMemoryUsage = value;
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
   public java.util.List<DiskStat> getDisks() {
      return disks;
   }

   @JsonIgnore
   public void setDisks(java.util.List<DiskStat> value) { 
      this.disks = value;
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
   public Long getLastStateChange() {
      return lastStateChange;
   }

   @JsonIgnore
   public void setLastStateChange(Long value) { 
      this.lastStateChange = value;
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
   public String getLastUpdatedDate() {
      return lastUpdatedDate;
   }

   @JsonIgnore
   public void setLastUpdatedDate(String value) { 
      this.lastUpdatedDate = value;
   }
   
   
   @JsonIgnore
   public String getLocation() {
      return location;
   }

   @JsonIgnore
   public void setLocation(String value) { 
      this.location = value;
   }
   
   
   @JsonIgnore
   public String getManagementIP() {
      return managementIP;
   }

   @JsonIgnore
   public void setManagementIP(String value) { 
      this.managementIP = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getMessages() {
      return messages;
   }

   @JsonIgnore
   public void setMessages(java.util.List<String> value) { 
      this.messages = value;
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
   public Long getNumberOfConnections() {
      return numberOfConnections;
   }

   @JsonIgnore
   public void setNumberOfConnections(Long value) { 
      this.numberOfConnections = value;
   }
   
   
   @JsonIgnore
   public String getOwner() {
      return owner;
   }

   @JsonIgnore
   public void setOwner(String value) { 
      this.owner = value;
   }
   
   
   @JsonIgnore
   public Float getPeakCPUUsage() {
      return peakCPUUsage;
   }

   @JsonIgnore
   public void setPeakCPUUsage(Float value) { 
      this.peakCPUUsage = value;
   }
   
   
   @JsonIgnore
   public Float getPeakMemoryUsage() {
      return peakMemoryUsage;
   }

   @JsonIgnore
   public void setPeakMemoryUsage(Float value) { 
      this.peakMemoryUsage = value;
   }
   
   
   @JsonIgnore
   public String getProductVersion() {
      return productVersion;
   }

   @JsonIgnore
   public void setProductVersion(String value) { 
      this.productVersion = value;
   }
   
   
   @JsonIgnore
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
   }
   
   
   @JsonIgnore
   public Long getUnavailableTimestamp() {
      return unavailableTimestamp;
   }

   @JsonIgnore
   public void setUnavailableTimestamp(Long value) { 
      this.unavailableTimestamp = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getVsds() {
      return vsds;
   }

   @JsonIgnore
   public void setVsds(java.util.List<String> value) { 
      this.vsds = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public BGPPeersFetcher getBGPPeers() {
      return bGPPeers;
   }
   
   @JsonIgnore
   public ControllerVRSLinksFetcher getControllerVRSLinks() {
      return controllerVRSLinks;
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
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public MonitoringPortsFetcher getMonitoringPorts() {
      return monitoringPorts;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   

   public String toString() {
      return "VSC [" + "addresses=" + addresses + ", alreadyMarkedForUnavailable=" + alreadyMarkedForUnavailable + ", averageCPUUsage=" + averageCPUUsage + ", averageMemoryUsage=" + averageMemoryUsage + ", communicationId=" + communicationId + ", creationDate=" + creationDate + ", currentCPUUsage=" + currentCPUUsage + ", currentMemoryUsage=" + currentMemoryUsage + ", description=" + description + ", disks=" + disks + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastStateChange=" + lastStateChange + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", location=" + location + ", managementIP=" + managementIP + ", messages=" + messages + ", name=" + name + ", numberOfConnections=" + numberOfConnections + ", owner=" + owner + ", peakCPUUsage=" + peakCPUUsage + ", peakMemoryUsage=" + peakMemoryUsage + ", productVersion=" + productVersion + ", status=" + status + ", unavailableTimestamp=" + unavailableTimestamp + ", vsds=" + vsds + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}