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


import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VNFInterfacesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VNFMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VNFThresholdPoliciesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vnf", resourceName = "vnfs")
public class VNF extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAllowedActions { DEPLOY, REDEPLOY, RESTART, START, STOP, UNDEPLOY };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ELastUserAction { DEPLOY, NONE, REDEPLOY, RESTART, START, STOP, UNDEPLOY };
   public enum EStatus { BLOCKED, CRASHED, DYING, IDLE, INIT, LAST, PAUSED, PMSUSPENDED, RUNNING, SHUTDOWN, SHUTOFF };
   public enum ETaskState { DEPLOYING, NONE, STARTING, STOPPING, UNDEPLOYING };
   public enum EType { FIREWALL, WAN_OPT };

   
   @JsonProperty(value = "CPUCount")
   
   protected Long CPUCount;
   
   @JsonProperty(value = "NSGName")
   
   protected String NSGName;
   
   @JsonProperty(value = "NSGSystemID")
   
   protected String NSGSystemID;
   
   @JsonProperty(value = "NSGatewayID")
   
   protected String NSGatewayID;
   
   @JsonProperty(value = "VNFDescriptorID")
   
   protected String VNFDescriptorID;
   
   @JsonProperty(value = "VNFDescriptorName")
   
   protected String VNFDescriptorName;
   
   @JsonProperty(value = "allowedActions")
   
   protected java.util.List<EAllowedActions> allowedActions;
   
   @JsonProperty(value = "associatedVNFMetadataID")
   
   protected String associatedVNFMetadataID;
   
   @JsonProperty(value = "associatedVNFThresholdPolicyID")
   
   protected String associatedVNFThresholdPolicyID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseID")
   
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "isAttachedToDescriptor")
   
   protected Boolean isAttachedToDescriptor;
   
   @JsonProperty(value = "lastKnownError")
   
   protected String lastKnownError;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUserAction")
   
   protected ELastUserAction lastUserAction;
   
   @JsonProperty(value = "memoryMB")
   
   protected Long memoryMB;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   
   @JsonProperty(value = "storageGB")
   
   protected Long storageGB;
   
   @JsonProperty(value = "taskState")
   
   protected ETaskState taskState;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   
   @JsonProperty(value = "vendor")
   
   protected String vendor;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VNFInterfacesFetcher vNFInterfaces;
   
   @JsonIgnore
   private VNFMetadatasFetcher vNFMetadatas;
   
   @JsonIgnore
   private VNFThresholdPoliciesFetcher vNFThresholdPolicies;
   

   public VNF() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vNFInterfaces = new VNFInterfacesFetcher(this);
      
      vNFMetadatas = new VNFMetadatasFetcher(this);
      
      vNFThresholdPolicies = new VNFThresholdPoliciesFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Long getCPUCount() {
      return CPUCount;
   }

   @JsonIgnore
   public void setCPUCount(Long value) { 
      this.CPUCount = value;
   }
   
   
   @JsonIgnore
   public String getNSGName() {
      return NSGName;
   }

   @JsonIgnore
   public void setNSGName(String value) { 
      this.NSGName = value;
   }
   
   
   @JsonIgnore
   public String getNSGSystemID() {
      return NSGSystemID;
   }

   @JsonIgnore
   public void setNSGSystemID(String value) { 
      this.NSGSystemID = value;
   }
   
   
   @JsonIgnore
   public String getNSGatewayID() {
      return NSGatewayID;
   }

   @JsonIgnore
   public void setNSGatewayID(String value) { 
      this.NSGatewayID = value;
   }
   
   
   @JsonIgnore
   public String getVNFDescriptorID() {
      return VNFDescriptorID;
   }

   @JsonIgnore
   public void setVNFDescriptorID(String value) { 
      this.VNFDescriptorID = value;
   }
   
   
   @JsonIgnore
   public String getVNFDescriptorName() {
      return VNFDescriptorName;
   }

   @JsonIgnore
   public void setVNFDescriptorName(String value) { 
      this.VNFDescriptorName = value;
   }
   
   
   @JsonIgnore
   public java.util.List<EAllowedActions> getAllowedActions() {
      return allowedActions;
   }

   @JsonIgnore
   public void setAllowedActions(java.util.List<EAllowedActions> value) { 
      this.allowedActions = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedVNFMetadataID() {
      return associatedVNFMetadataID;
   }

   @JsonIgnore
   public void setAssociatedVNFMetadataID(String value) { 
      this.associatedVNFMetadataID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedVNFThresholdPolicyID() {
      return associatedVNFThresholdPolicyID;
   }

   @JsonIgnore
   public void setAssociatedVNFThresholdPolicyID(String value) { 
      this.associatedVNFThresholdPolicyID = value;
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
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
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
   public Boolean getIsAttachedToDescriptor() {
      return isAttachedToDescriptor;
   }

   @JsonIgnore
   public void setIsAttachedToDescriptor(Boolean value) { 
      this.isAttachedToDescriptor = value;
   }
   
   
   @JsonIgnore
   public String getLastKnownError() {
      return lastKnownError;
   }

   @JsonIgnore
   public void setLastKnownError(String value) { 
      this.lastKnownError = value;
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
   public ELastUserAction getLastUserAction() {
      return lastUserAction;
   }

   @JsonIgnore
   public void setLastUserAction(ELastUserAction value) { 
      this.lastUserAction = value;
   }
   
   
   @JsonIgnore
   public Long getMemoryMB() {
      return memoryMB;
   }

   @JsonIgnore
   public void setMemoryMB(Long value) { 
      this.memoryMB = value;
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
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
   }
   
   
   @JsonIgnore
   public Long getStorageGB() {
      return storageGB;
   }

   @JsonIgnore
   public void setStorageGB(Long value) { 
      this.storageGB = value;
   }
   
   
   @JsonIgnore
   public ETaskState getTaskState() {
      return taskState;
   }

   @JsonIgnore
   public void setTaskState(ETaskState value) { 
      this.taskState = value;
   }
   
   
   @JsonIgnore
   public EType getType() {
      return type;
   }

   @JsonIgnore
   public void setType(EType value) { 
      this.type = value;
   }
   
   
   @JsonIgnore
   public String getVendor() {
      return vendor;
   }

   @JsonIgnore
   public void setVendor(String value) { 
      this.vendor = value;
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
   public VNFInterfacesFetcher getVNFInterfaces() {
      return vNFInterfaces;
   }
   
   @JsonIgnore
   public VNFMetadatasFetcher getVNFMetadatas() {
      return vNFMetadatas;
   }
   
   @JsonIgnore
   public VNFThresholdPoliciesFetcher getVNFThresholdPolicies() {
      return vNFThresholdPolicies;
   }
   

   public String toString() {
      return "VNF [" + "CPUCount=" + CPUCount + ", NSGName=" + NSGName + ", NSGSystemID=" + NSGSystemID + ", NSGatewayID=" + NSGatewayID + ", VNFDescriptorID=" + VNFDescriptorID + ", VNFDescriptorName=" + VNFDescriptorName + ", allowedActions=" + allowedActions + ", associatedVNFMetadataID=" + associatedVNFMetadataID + ", associatedVNFThresholdPolicyID=" + associatedVNFThresholdPolicyID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", isAttachedToDescriptor=" + isAttachedToDescriptor + ", lastKnownError=" + lastKnownError + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUserAction=" + lastUserAction + ", memoryMB=" + memoryMB + ", name=" + name + ", status=" + status + ", storageGB=" + storageGB + ", taskState=" + taskState + ", type=" + type + ", vendor=" + vendor + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}