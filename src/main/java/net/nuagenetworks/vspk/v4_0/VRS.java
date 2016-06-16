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


import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MonitoringPortsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VPortsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.HSCsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VSCsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MultiNICVPortsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vrs", resourceName = "vrss")
public class VRS extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum JSONRPCConnectionState { ADMIN_DOWN, DOWN, UP };
   public enum Personality { HARDWARE_VTEP, NONE, NSG, VRS, VRSG };
   public enum ClusterNodeRole { NONE, PRIMARY, SECONDARY };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Role { MASTER, NONE, SLAVE };
   public enum VscConfigState { PRIMARY, SECONDARY };
   public enum VscCurrentState { PRIMARY, SECONDARY };
   public enum Status { ADMIN_DOWN, DOWN, UP };
   public enum HypervisorConnectionState { ADMIN_DOWN, DOWN, UP };

   
   @JsonProperty(value = "JSONRPCConnectionState")
   protected JSONRPCConnectionState JSONRPCConnectionState;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "managementIP")
   protected String managementIP;
   
   @JsonProperty(value = "parentIDs")
   protected java.util.List<String> parentIDs;
   
   @JsonProperty(value = "lastEventName")
   protected String lastEventName;
   
   @JsonProperty(value = "lastEventObject")
   protected String lastEventObject;
   
   @JsonProperty(value = "lastEventTimestamp")
   protected Long lastEventTimestamp;
   
   @JsonProperty(value = "lastStateChange")
   protected Long lastStateChange;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "dbSynced")
   protected Boolean dbSynced;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "peakCPUUsage")
   protected Float peakCPUUsage;
   
   @JsonProperty(value = "peakMemoryUsage")
   protected Float peakMemoryUsage;
   
   @JsonProperty(value = "peer")
   protected String peer;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "messages")
   protected java.util.List<String> messages;
   
   @JsonProperty(value = "revertBehaviorEnabled")
   protected Boolean revertBehaviorEnabled;
   
   @JsonProperty(value = "revertCompleted")
   protected Boolean revertCompleted;
   
   @JsonProperty(value = "revertCount")
   protected Long revertCount;
   
   @JsonProperty(value = "revertFailedCount")
   protected Long revertFailedCount;
   
   @JsonProperty(value = "disks")
   protected java.util.List<DiskStat> disks;
   
   @JsonProperty(value = "clusterNodeRole")
   protected ClusterNodeRole clusterNodeRole;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "location")
   protected String location;
   
   @JsonProperty(value = "role")
   protected Role role;
   
   @JsonProperty(value = "uptime")
   protected Long uptime;
   
   @JsonProperty(value = "primaryVSCConnectionLost")
   protected Boolean primaryVSCConnectionLost;
   
   @JsonProperty(value = "productVersion")
   protected String productVersion;
   
   @JsonProperty(value = "isResilient")
   protected Boolean isResilient;
   
   @JsonProperty(value = "vscConfigState")
   protected VscConfigState vscConfigState;
   
   @JsonProperty(value = "vscCurrentState")
   protected VscCurrentState vscCurrentState;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "multiNICVPortEnabled")
   protected Boolean multiNICVPortEnabled;
   
   @JsonProperty(value = "numberOfBridgeInterfaces")
   protected Long numberOfBridgeInterfaces;
   
   @JsonProperty(value = "numberOfHostInterfaces")
   protected Long numberOfHostInterfaces;
   
   @JsonProperty(value = "numberOfVirtualMachines")
   protected Long numberOfVirtualMachines;
   
   @JsonProperty(value = "currentCPUUsage")
   protected Float currentCPUUsage;
   
   @JsonProperty(value = "currentMemoryUsage")
   protected Float currentMemoryUsage;
   
   @JsonProperty(value = "averageCPUUsage")
   protected Float averageCPUUsage;
   
   @JsonProperty(value = "averageMemoryUsage")
   protected Float averageMemoryUsage;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "dynamic")
   protected Boolean dynamic;
   
   @JsonProperty(value = "hypervisorConnectionState")
   protected HypervisorConnectionState hypervisorConnectionState;
   
   @JsonProperty(value = "hypervisorIdentifier")
   protected String hypervisorIdentifier;
   
   @JsonProperty(value = "hypervisorName")
   protected String hypervisorName;
   
   @JsonProperty(value = "hypervisorType")
   protected String hypervisorType;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MonitoringPortsFetcher monitoringPorts;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   
   @JsonIgnore
   private HSCsFetcher hSCs;
   
   @JsonIgnore
   private VSCsFetcher vSCs;
   
   @JsonIgnore
   private MultiNICVPortsFetcher multiNICVPorts;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public VRS() {
      
      metadatas = new MetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      monitoringPorts = new MonitoringPortsFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
      hSCs = new HSCsFetcher(this);
      
      vSCs = new VSCsFetcher(this);
      
      multiNICVPorts = new MultiNICVPortsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public JSONRPCConnectionState getJSONRPCConnectionState() {
      return JSONRPCConnectionState;
   }

   @JsonIgnore
   public void setJSONRPCConnectionState(JSONRPCConnectionState value) { 
      this.JSONRPCConnectionState = value;
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
   public String getManagementIP() {
      return managementIP;
   }

   @JsonIgnore
   public void setManagementIP(String value) { 
      this.managementIP = value;
   }
   @JsonIgnore
   public java.util.List<String> getParentIDs() {
      return parentIDs;
   }

   @JsonIgnore
   public void setParentIDs(java.util.List<String> value) { 
      this.parentIDs = value;
   }
   @JsonIgnore
   public String getLastEventName() {
      return lastEventName;
   }

   @JsonIgnore
   public void setLastEventName(String value) { 
      this.lastEventName = value;
   }
   @JsonIgnore
   public String getLastEventObject() {
      return lastEventObject;
   }

   @JsonIgnore
   public void setLastEventObject(String value) { 
      this.lastEventObject = value;
   }
   @JsonIgnore
   public Long getLastEventTimestamp() {
      return lastEventTimestamp;
   }

   @JsonIgnore
   public void setLastEventTimestamp(Long value) { 
      this.lastEventTimestamp = value;
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
   public Boolean getDbSynced() {
      return dbSynced;
   }

   @JsonIgnore
   public void setDbSynced(Boolean value) { 
      this.dbSynced = value;
   }
   @JsonIgnore
   public String getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(String value) { 
      this.address = value;
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
   public String getPeer() {
      return peer;
   }

   @JsonIgnore
   public void setPeer(String value) { 
      this.peer = value;
   }
   @JsonIgnore
   public Personality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(Personality value) { 
      this.personality = value;
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
   public java.util.List<String> getMessages() {
      return messages;
   }

   @JsonIgnore
   public void setMessages(java.util.List<String> value) { 
      this.messages = value;
   }
   @JsonIgnore
   public Boolean getRevertBehaviorEnabled() {
      return revertBehaviorEnabled;
   }

   @JsonIgnore
   public void setRevertBehaviorEnabled(Boolean value) { 
      this.revertBehaviorEnabled = value;
   }
   @JsonIgnore
   public Boolean getRevertCompleted() {
      return revertCompleted;
   }

   @JsonIgnore
   public void setRevertCompleted(Boolean value) { 
      this.revertCompleted = value;
   }
   @JsonIgnore
   public Long getRevertCount() {
      return revertCount;
   }

   @JsonIgnore
   public void setRevertCount(Long value) { 
      this.revertCount = value;
   }
   @JsonIgnore
   public Long getRevertFailedCount() {
      return revertFailedCount;
   }

   @JsonIgnore
   public void setRevertFailedCount(Long value) { 
      this.revertFailedCount = value;
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
   public ClusterNodeRole getClusterNodeRole() {
      return clusterNodeRole;
   }

   @JsonIgnore
   public void setClusterNodeRole(ClusterNodeRole value) { 
      this.clusterNodeRole = value;
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
   public String getLocation() {
      return location;
   }

   @JsonIgnore
   public void setLocation(String value) { 
      this.location = value;
   }
   @JsonIgnore
   public Role getRole() {
      return role;
   }

   @JsonIgnore
   public void setRole(Role value) { 
      this.role = value;
   }
   @JsonIgnore
   public Long getUptime() {
      return uptime;
   }

   @JsonIgnore
   public void setUptime(Long value) { 
      this.uptime = value;
   }
   @JsonIgnore
   public Boolean getPrimaryVSCConnectionLost() {
      return primaryVSCConnectionLost;
   }

   @JsonIgnore
   public void setPrimaryVSCConnectionLost(Boolean value) { 
      this.primaryVSCConnectionLost = value;
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
   public Boolean getIsResilient() {
      return isResilient;
   }

   @JsonIgnore
   public void setIsResilient(Boolean value) { 
      this.isResilient = value;
   }
   @JsonIgnore
   public VscConfigState getVscConfigState() {
      return vscConfigState;
   }

   @JsonIgnore
   public void setVscConfigState(VscConfigState value) { 
      this.vscConfigState = value;
   }
   @JsonIgnore
   public VscCurrentState getVscCurrentState() {
      return vscCurrentState;
   }

   @JsonIgnore
   public void setVscCurrentState(VscCurrentState value) { 
      this.vscCurrentState = value;
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
   public Boolean getMultiNICVPortEnabled() {
      return multiNICVPortEnabled;
   }

   @JsonIgnore
   public void setMultiNICVPortEnabled(Boolean value) { 
      this.multiNICVPortEnabled = value;
   }
   @JsonIgnore
   public Long getNumberOfBridgeInterfaces() {
      return numberOfBridgeInterfaces;
   }

   @JsonIgnore
   public void setNumberOfBridgeInterfaces(Long value) { 
      this.numberOfBridgeInterfaces = value;
   }
   @JsonIgnore
   public Long getNumberOfHostInterfaces() {
      return numberOfHostInterfaces;
   }

   @JsonIgnore
   public void setNumberOfHostInterfaces(Long value) { 
      this.numberOfHostInterfaces = value;
   }
   @JsonIgnore
   public Long getNumberOfVirtualMachines() {
      return numberOfVirtualMachines;
   }

   @JsonIgnore
   public void setNumberOfVirtualMachines(Long value) { 
      this.numberOfVirtualMachines = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   @JsonIgnore
   public Boolean getDynamic() {
      return dynamic;
   }

   @JsonIgnore
   public void setDynamic(Boolean value) { 
      this.dynamic = value;
   }
   @JsonIgnore
   public HypervisorConnectionState getHypervisorConnectionState() {
      return hypervisorConnectionState;
   }

   @JsonIgnore
   public void setHypervisorConnectionState(HypervisorConnectionState value) { 
      this.hypervisorConnectionState = value;
   }
   @JsonIgnore
   public String getHypervisorIdentifier() {
      return hypervisorIdentifier;
   }

   @JsonIgnore
   public void setHypervisorIdentifier(String value) { 
      this.hypervisorIdentifier = value;
   }
   @JsonIgnore
   public String getHypervisorName() {
      return hypervisorName;
   }

   @JsonIgnore
   public void setHypervisorName(String value) { 
      this.hypervisorName = value;
   }
   @JsonIgnore
   public String getHypervisorType() {
      return hypervisorType;
   }

   @JsonIgnore
   public void setHypervisorType(String value) { 
      this.hypervisorType = value;
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
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public MonitoringPortsFetcher getMonitoringPorts() {
      return monitoringPorts;
   }
   
   @JsonIgnore
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   
   @JsonIgnore
   public HSCsFetcher getHSCs() {
      return hSCs;
   }
   
   @JsonIgnore
   public VSCsFetcher getVSCs() {
      return vSCs;
   }
   
   @JsonIgnore
   public MultiNICVPortsFetcher getMultiNICVPorts() {
      return multiNICVPorts;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "VRS [" + "JSONRPCConnectionState=" + JSONRPCConnectionState + ", name=" + name + ", managementIP=" + managementIP + ", parentIDs=" + parentIDs + ", lastEventName=" + lastEventName + ", lastEventObject=" + lastEventObject + ", lastEventTimestamp=" + lastEventTimestamp + ", lastStateChange=" + lastStateChange + ", lastUpdatedBy=" + lastUpdatedBy + ", dbSynced=" + dbSynced + ", address=" + address + ", peakCPUUsage=" + peakCPUUsage + ", peakMemoryUsage=" + peakMemoryUsage + ", peer=" + peer + ", personality=" + personality + ", description=" + description + ", messages=" + messages + ", revertBehaviorEnabled=" + revertBehaviorEnabled + ", revertCompleted=" + revertCompleted + ", revertCount=" + revertCount + ", revertFailedCount=" + revertFailedCount + ", disks=" + disks + ", clusterNodeRole=" + clusterNodeRole + ", entityScope=" + entityScope + ", location=" + location + ", role=" + role + ", uptime=" + uptime + ", primaryVSCConnectionLost=" + primaryVSCConnectionLost + ", productVersion=" + productVersion + ", isResilient=" + isResilient + ", vscConfigState=" + vscConfigState + ", vscCurrentState=" + vscCurrentState + ", status=" + status + ", multiNICVPortEnabled=" + multiNICVPortEnabled + ", numberOfBridgeInterfaces=" + numberOfBridgeInterfaces + ", numberOfHostInterfaces=" + numberOfHostInterfaces + ", numberOfVirtualMachines=" + numberOfVirtualMachines + ", currentCPUUsage=" + currentCPUUsage + ", currentMemoryUsage=" + currentMemoryUsage + ", averageCPUUsage=" + averageCPUUsage + ", averageMemoryUsage=" + averageMemoryUsage + ", externalID=" + externalID + ", dynamic=" + dynamic + ", hypervisorConnectionState=" + hypervisorConnectionState + ", hypervisorIdentifier=" + hypervisorIdentifier + ", hypervisorName=" + hypervisorName + ", hypervisorType=" + hypervisorType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}