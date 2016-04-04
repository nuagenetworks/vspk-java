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
import vspk.v4_0.fetchers.BGPPeersFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.JobsFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.MonitoringPortsFetcher;
import vspk.v4_0.fetchers.VRSsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HSC extends RestObject {

   public final static String REST_NAME = "hsc";
   public final static String RESOURCE_NAME = "hscs";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Status { ADMIN_DOWN, DOWN, UP };
   public enum Type { DC7X50, NONE, VSA, VSG };

   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "alreadyMarkedForUnavailable")
   protected boolean alreadyMarkedForUnavailable;
   
   @JsonProperty(value = "averageCPUUsage")
   protected float averageCPUUsage;
   
   @JsonProperty(value = "averageMemoryUsage")
   protected float averageMemoryUsage;
   
   @JsonProperty(value = "currentCPUUsage")
   protected float currentCPUUsage;
   
   @JsonProperty(value = "currentMemoryUsage")
   protected float currentMemoryUsage;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "disks")
   protected java.util.List<String> disks;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastStateChange")
   protected int lastStateChange;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "location")
   protected String location;
   
   @JsonProperty(value = "managementIP")
   protected String managementIP;
   
   @JsonProperty(value = "messages")
   protected java.util.List<String> messages;
   
   @JsonProperty(value = "model")
   protected String model;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "peakCPUUsage")
   protected float peakCPUUsage;
   
   @JsonProperty(value = "peakMemoryUsage")
   protected float peakMemoryUsage;
   
   @JsonProperty(value = "productVersion")
   protected String productVersion;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "type")
   protected Type type;
   
   @JsonProperty(value = "unavailableTimestamp")
   protected int unavailableTimestamp;
   
   @JsonProperty(value = "vsds")
   protected java.util.List<String> vsds;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private BGPPeersFetcher bGPPeers;
   
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
   private VRSsFetcher vRSs;
   

   public HSC() {
      
      alarms = new AlarmsFetcher(this);
      
      bGPPeers = new BGPPeersFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      monitoringPorts = new MonitoringPortsFetcher(this);
      
      vRSs = new VRSsFetcher(this);
      
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
   }
   public boolean getAlreadyMarkedForUnavailable() {
      return alreadyMarkedForUnavailable;
   }

   public void setAlreadyMarkedForUnavailable(boolean value) { 
      this.alreadyMarkedForUnavailable = value;
   }
   public float getAverageCPUUsage() {
      return averageCPUUsage;
   }

   public void setAverageCPUUsage(float value) { 
      this.averageCPUUsage = value;
   }
   public float getAverageMemoryUsage() {
      return averageMemoryUsage;
   }

   public void setAverageMemoryUsage(float value) { 
      this.averageMemoryUsage = value;
   }
   public float getCurrentCPUUsage() {
      return currentCPUUsage;
   }

   public void setCurrentCPUUsage(float value) { 
      this.currentCPUUsage = value;
   }
   public float getCurrentMemoryUsage() {
      return currentMemoryUsage;
   }

   public void setCurrentMemoryUsage(float value) { 
      this.currentMemoryUsage = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public java.util.List<String> getDisks() {
      return disks;
   }

   public void setDisks(java.util.List<String> value) { 
      this.disks = value;
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
   public int getLastStateChange() {
      return lastStateChange;
   }

   public void setLastStateChange(int value) { 
      this.lastStateChange = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getLocation() {
      return location;
   }

   public void setLocation(String value) { 
      this.location = value;
   }
   public String getManagementIP() {
      return managementIP;
   }

   public void setManagementIP(String value) { 
      this.managementIP = value;
   }
   public java.util.List<String> getMessages() {
      return messages;
   }

   public void setMessages(java.util.List<String> value) { 
      this.messages = value;
   }
   public String getModel() {
      return model;
   }

   public void setModel(String value) { 
      this.model = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public float getPeakCPUUsage() {
      return peakCPUUsage;
   }

   public void setPeakCPUUsage(float value) { 
      this.peakCPUUsage = value;
   }
   public float getPeakMemoryUsage() {
      return peakMemoryUsage;
   }

   public void setPeakMemoryUsage(float value) { 
      this.peakMemoryUsage = value;
   }
   public String getProductVersion() {
      return productVersion;
   }

   public void setProductVersion(String value) { 
      this.productVersion = value;
   }
   public Status getStatus() {
      return status;
   }

   public void setStatus(Status value) { 
      this.status = value;
   }
   public Type getType() {
      return type;
   }

   public void setType(Type value) { 
      this.type = value;
   }
   public int getUnavailableTimestamp() {
      return unavailableTimestamp;
   }

   public void setUnavailableTimestamp(int value) { 
      this.unavailableTimestamp = value;
   }
   public java.util.List<String> getVsds() {
      return vsds;
   }

   public void setVsds(java.util.List<String> value) { 
      this.vsds = value;
   }
   

   
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   public BGPPeersFetcher getBGPPeers() {
      return bGPPeers;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public MonitoringPortsFetcher getMonitoringPorts() {
      return monitoringPorts;
   }
   
   public VRSsFetcher getVRSs() {
      return vRSs;
   }
   

   public String toString() {
      return "HSC [" + "address=" + address + ", alreadyMarkedForUnavailable=" + alreadyMarkedForUnavailable + ", averageCPUUsage=" + averageCPUUsage + ", averageMemoryUsage=" + averageMemoryUsage + ", currentCPUUsage=" + currentCPUUsage + ", currentMemoryUsage=" + currentMemoryUsage + ", description=" + description + ", disks=" + disks + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastStateChange=" + lastStateChange + ", lastUpdatedBy=" + lastUpdatedBy + ", location=" + location + ", managementIP=" + managementIP + ", messages=" + messages + ", model=" + model + ", name=" + name + ", peakCPUUsage=" + peakCPUUsage + ", peakMemoryUsage=" + peakMemoryUsage + ", productVersion=" + productVersion + ", status=" + status + ", type=" + type + ", unavailableTimestamp=" + unavailableTimestamp + ", vsds=" + vsds + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}