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
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.HSCsFetcher;
import vspk.v4_0.fetchers.JobsFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.MonitoringPortsFetcher;
import vspk.v4_0.fetchers.MultiNICVPortsFetcher;
import vspk.v4_0.fetchers.VMsFetcher;
import vspk.v4_0.fetchers.VPortsFetcher;
import vspk.v4_0.fetchers.VSCsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VRS extends RestObject {

   public final static String REST_NAME = "vrs";
   public final static String RESOURCE_NAME = "vrss";

   
   public enum JSONRPCConnectionState { ADMIN_DOWN, DOWN, UP };
   public enum ClusterNodeRole { NONE, PRIMARY, SECONDARY };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum HypervisorConnectionState { ADMIN_DOWN, DOWN, UP };
   public enum Personality { HARDWARE_VTEP, NONE, NSG, VRS, VRSG };
   public enum Role { MASTER, NONE, SLAVE };
   public enum Status { ADMIN_DOWN, DOWN, UP };
   public enum VscConfigState { PRIMARY, SECONDARY };
   public enum VscCurrentState { PRIMARY, SECONDARY };

   
   @JsonProperty(value = "JSONRPCConnectionState")
   protected JSONRPCConnectionState JSONRPCConnectionState;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "averageCPUUsage")
   protected float averageCPUUsage;
   
   @JsonProperty(value = "averageMemoryUsage")
   protected float averageMemoryUsage;
   
   @JsonProperty(value = "clusterNodeRole")
   protected ClusterNodeRole clusterNodeRole;
   
   @JsonProperty(value = "currentCPUUsage")
   protected float currentCPUUsage;
   
   @JsonProperty(value = "currentMemoryUsage")
   protected float currentMemoryUsage;
   
   @JsonProperty(value = "dbSynced")
   protected boolean dbSynced;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "disks")
   protected java.util.List<String> disks;
   
   @JsonProperty(value = "dynamic")
   protected boolean dynamic;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "hypervisorConnectionState")
   protected HypervisorConnectionState hypervisorConnectionState;
   
   @JsonProperty(value = "hypervisorIdentifier")
   protected String hypervisorIdentifier;
   
   @JsonProperty(value = "hypervisorName")
   protected String hypervisorName;
   
   @JsonProperty(value = "hypervisorType")
   protected String hypervisorType;
   
   @JsonProperty(value = "isResilient")
   protected boolean isResilient;
   
   @JsonProperty(value = "lastEventName")
   protected String lastEventName;
   
   @JsonProperty(value = "lastEventObject")
   protected String lastEventObject;
   
   @JsonProperty(value = "lastEventTimestamp")
   protected int lastEventTimestamp;
   
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
   
   @JsonProperty(value = "multiNICVPortEnabled")
   protected boolean multiNICVPortEnabled;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "numberOfBridgeInterfaces")
   protected int numberOfBridgeInterfaces;
   
   @JsonProperty(value = "numberOfHostInterfaces")
   protected int numberOfHostInterfaces;
   
   @JsonProperty(value = "numberOfVirtualMachines")
   protected int numberOfVirtualMachines;
   
   @JsonProperty(value = "parentIDs")
   protected java.util.List<String> parentIDs;
   
   @JsonProperty(value = "peakCPUUsage")
   protected float peakCPUUsage;
   
   @JsonProperty(value = "peakMemoryUsage")
   protected float peakMemoryUsage;
   
   @JsonProperty(value = "peer")
   protected String peer;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "primaryVSCConnectionLost")
   protected boolean primaryVSCConnectionLost;
   
   @JsonProperty(value = "productVersion")
   protected String productVersion;
   
   @JsonProperty(value = "revertBehaviorEnabled")
   protected boolean revertBehaviorEnabled;
   
   @JsonProperty(value = "revertCompleted")
   protected boolean revertCompleted;
   
   @JsonProperty(value = "revertCount")
   protected int revertCount;
   
   @JsonProperty(value = "revertFailedCount")
   protected int revertFailedCount;
   
   @JsonProperty(value = "role")
   protected Role role;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "uptime")
   protected int uptime;
   
   @JsonProperty(value = "vscConfigState")
   protected VscConfigState vscConfigState;
   
   @JsonProperty(value = "vscCurrentState")
   protected VscCurrentState vscCurrentState;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private HSCsFetcher hSCs;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MonitoringPortsFetcher monitoringPorts;
   
   @JsonIgnore
   private MultiNICVPortsFetcher multiNICVPorts;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   
   @JsonIgnore
   private VSCsFetcher vSCs;
   

   public VRS() {
      
      alarms = new AlarmsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      hSCs = new HSCsFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      monitoringPorts = new MonitoringPortsFetcher(this);
      
      multiNICVPorts = new MultiNICVPortsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
      vSCs = new VSCsFetcher(this);
      
   }

   public JSONRPCConnectionState getJSONRPCConnectionState() {
      return JSONRPCConnectionState;
   }

   public void setJSONRPCConnectionState(JSONRPCConnectionState value) { 
      this.JSONRPCConnectionState = value;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
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
   public ClusterNodeRole getClusterNodeRole() {
      return clusterNodeRole;
   }

   public void setClusterNodeRole(ClusterNodeRole value) { 
      this.clusterNodeRole = value;
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
   public boolean getDbSynced() {
      return dbSynced;
   }

   public void setDbSynced(boolean value) { 
      this.dbSynced = value;
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
   public boolean getDynamic() {
      return dynamic;
   }

   public void setDynamic(boolean value) { 
      this.dynamic = value;
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
   public HypervisorConnectionState getHypervisorConnectionState() {
      return hypervisorConnectionState;
   }

   public void setHypervisorConnectionState(HypervisorConnectionState value) { 
      this.hypervisorConnectionState = value;
   }
   public String getHypervisorIdentifier() {
      return hypervisorIdentifier;
   }

   public void setHypervisorIdentifier(String value) { 
      this.hypervisorIdentifier = value;
   }
   public String getHypervisorName() {
      return hypervisorName;
   }

   public void setHypervisorName(String value) { 
      this.hypervisorName = value;
   }
   public String getHypervisorType() {
      return hypervisorType;
   }

   public void setHypervisorType(String value) { 
      this.hypervisorType = value;
   }
   public boolean getIsResilient() {
      return isResilient;
   }

   public void setIsResilient(boolean value) { 
      this.isResilient = value;
   }
   public String getLastEventName() {
      return lastEventName;
   }

   public void setLastEventName(String value) { 
      this.lastEventName = value;
   }
   public String getLastEventObject() {
      return lastEventObject;
   }

   public void setLastEventObject(String value) { 
      this.lastEventObject = value;
   }
   public int getLastEventTimestamp() {
      return lastEventTimestamp;
   }

   public void setLastEventTimestamp(int value) { 
      this.lastEventTimestamp = value;
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
   public boolean getMultiNICVPortEnabled() {
      return multiNICVPortEnabled;
   }

   public void setMultiNICVPortEnabled(boolean value) { 
      this.multiNICVPortEnabled = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public int getNumberOfBridgeInterfaces() {
      return numberOfBridgeInterfaces;
   }

   public void setNumberOfBridgeInterfaces(int value) { 
      this.numberOfBridgeInterfaces = value;
   }
   public int getNumberOfHostInterfaces() {
      return numberOfHostInterfaces;
   }

   public void setNumberOfHostInterfaces(int value) { 
      this.numberOfHostInterfaces = value;
   }
   public int getNumberOfVirtualMachines() {
      return numberOfVirtualMachines;
   }

   public void setNumberOfVirtualMachines(int value) { 
      this.numberOfVirtualMachines = value;
   }
   public java.util.List<String> getParentIDs() {
      return parentIDs;
   }

   public void setParentIDs(java.util.List<String> value) { 
      this.parentIDs = value;
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
   public String getPeer() {
      return peer;
   }

   public void setPeer(String value) { 
      this.peer = value;
   }
   public Personality getPersonality() {
      return personality;
   }

   public void setPersonality(Personality value) { 
      this.personality = value;
   }
   public boolean getPrimaryVSCConnectionLost() {
      return primaryVSCConnectionLost;
   }

   public void setPrimaryVSCConnectionLost(boolean value) { 
      this.primaryVSCConnectionLost = value;
   }
   public String getProductVersion() {
      return productVersion;
   }

   public void setProductVersion(String value) { 
      this.productVersion = value;
   }
   public boolean getRevertBehaviorEnabled() {
      return revertBehaviorEnabled;
   }

   public void setRevertBehaviorEnabled(boolean value) { 
      this.revertBehaviorEnabled = value;
   }
   public boolean getRevertCompleted() {
      return revertCompleted;
   }

   public void setRevertCompleted(boolean value) { 
      this.revertCompleted = value;
   }
   public int getRevertCount() {
      return revertCount;
   }

   public void setRevertCount(int value) { 
      this.revertCount = value;
   }
   public int getRevertFailedCount() {
      return revertFailedCount;
   }

   public void setRevertFailedCount(int value) { 
      this.revertFailedCount = value;
   }
   public Role getRole() {
      return role;
   }

   public void setRole(Role value) { 
      this.role = value;
   }
   public Status getStatus() {
      return status;
   }

   public void setStatus(Status value) { 
      this.status = value;
   }
   public int getUptime() {
      return uptime;
   }

   public void setUptime(int value) { 
      this.uptime = value;
   }
   public VscConfigState getVscConfigState() {
      return vscConfigState;
   }

   public void setVscConfigState(VscConfigState value) { 
      this.vscConfigState = value;
   }
   public VscCurrentState getVscCurrentState() {
      return vscCurrentState;
   }

   public void setVscCurrentState(VscCurrentState value) { 
      this.vscCurrentState = value;
   }
   

   
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public HSCsFetcher getHSCs() {
      return hSCs;
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
   
   public MultiNICVPortsFetcher getMultiNICVPorts() {
      return multiNICVPorts;
   }
   
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   
   public VSCsFetcher getVSCs() {
      return vSCs;
   }
   

   public String toString() {
      return "VRS [" + "JSONRPCConnectionState=" + JSONRPCConnectionState + ", address=" + address + ", averageCPUUsage=" + averageCPUUsage + ", averageMemoryUsage=" + averageMemoryUsage + ", clusterNodeRole=" + clusterNodeRole + ", currentCPUUsage=" + currentCPUUsage + ", currentMemoryUsage=" + currentMemoryUsage + ", dbSynced=" + dbSynced + ", description=" + description + ", disks=" + disks + ", dynamic=" + dynamic + ", entityScope=" + entityScope + ", externalID=" + externalID + ", hypervisorConnectionState=" + hypervisorConnectionState + ", hypervisorIdentifier=" + hypervisorIdentifier + ", hypervisorName=" + hypervisorName + ", hypervisorType=" + hypervisorType + ", isResilient=" + isResilient + ", lastEventName=" + lastEventName + ", lastEventObject=" + lastEventObject + ", lastEventTimestamp=" + lastEventTimestamp + ", lastStateChange=" + lastStateChange + ", lastUpdatedBy=" + lastUpdatedBy + ", location=" + location + ", managementIP=" + managementIP + ", messages=" + messages + ", multiNICVPortEnabled=" + multiNICVPortEnabled + ", name=" + name + ", numberOfBridgeInterfaces=" + numberOfBridgeInterfaces + ", numberOfHostInterfaces=" + numberOfHostInterfaces + ", numberOfVirtualMachines=" + numberOfVirtualMachines + ", parentIDs=" + parentIDs + ", peakCPUUsage=" + peakCPUUsage + ", peakMemoryUsage=" + peakMemoryUsage + ", peer=" + peer + ", personality=" + personality + ", primaryVSCConnectionLost=" + primaryVSCConnectionLost + ", productVersion=" + productVersion + ", revertBehaviorEnabled=" + revertBehaviorEnabled + ", revertCompleted=" + revertCompleted + ", revertCount=" + revertCount + ", revertFailedCount=" + revertFailedCount + ", role=" + role + ", status=" + status + ", uptime=" + uptime + ", vscConfigState=" + vscConfigState + ", vscCurrentState=" + vscCurrentState + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}