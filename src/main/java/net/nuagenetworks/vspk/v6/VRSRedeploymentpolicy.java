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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vrsredeploymentpolicy", resourceName = "vrsredeploymentpolicies")
public class VRSRedeploymentpolicy extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "ALUbr0StatusRedeploymentEnabled")
   
   protected Boolean ALUbr0StatusRedeploymentEnabled;
   
   @JsonProperty(value = "CPUUtilizationRedeploymentEnabled")
   
   protected Boolean CPUUtilizationRedeploymentEnabled;
   
   @JsonProperty(value = "CPUUtilizationThreshold")
   
   protected Float CPUUtilizationThreshold;
   
   @JsonProperty(value = "VRSCorrectiveActionDelay")
   
   protected Long VRSCorrectiveActionDelay;
   
   @JsonProperty(value = "VRSProcessRedeploymentEnabled")
   
   protected Boolean VRSProcessRedeploymentEnabled;
   
   @JsonProperty(value = "VRSVSCStatusRedeploymentEnabled")
   
   protected Boolean VRSVSCStatusRedeploymentEnabled;
   
   @JsonProperty(value = "deploymentCountThreshold")
   
   protected Long deploymentCountThreshold;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "jesxmonProcessRedeploymentEnabled")
   
   protected Boolean jesxmonProcessRedeploymentEnabled;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "logDiskUtilizationRedeploymentEnabled")
   
   protected Boolean logDiskUtilizationRedeploymentEnabled;
   
   @JsonProperty(value = "logDiskUtilizationThreshold")
   
   protected Float logDiskUtilizationThreshold;
   
   @JsonProperty(value = "memoryUtilizationRedeploymentEnabled")
   
   protected Boolean memoryUtilizationRedeploymentEnabled;
   
   @JsonProperty(value = "memoryUtilizationThreshold")
   
   protected Float memoryUtilizationThreshold;
   
   @JsonProperty(value = "redeploymentDelay")
   
   protected Long redeploymentDelay;
   
   @JsonProperty(value = "rootDiskUtilizationRedeploymentEnabled")
   
   protected Boolean rootDiskUtilizationRedeploymentEnabled;
   
   @JsonProperty(value = "rootDiskUtilizationThreshold")
   
   protected Float rootDiskUtilizationThreshold;
   

   

   public VRSRedeploymentpolicy() {
      
   }

   
   
   @JsonIgnore
   public Boolean getALUbr0StatusRedeploymentEnabled() {
      return ALUbr0StatusRedeploymentEnabled;
   }

   @JsonIgnore
   public void setALUbr0StatusRedeploymentEnabled(Boolean value) { 
      this.ALUbr0StatusRedeploymentEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getCPUUtilizationRedeploymentEnabled() {
      return CPUUtilizationRedeploymentEnabled;
   }

   @JsonIgnore
   public void setCPUUtilizationRedeploymentEnabled(Boolean value) { 
      this.CPUUtilizationRedeploymentEnabled = value;
   }
   
   
   @JsonIgnore
   public Float getCPUUtilizationThreshold() {
      return CPUUtilizationThreshold;
   }

   @JsonIgnore
   public void setCPUUtilizationThreshold(Float value) { 
      this.CPUUtilizationThreshold = value;
   }
   
   
   @JsonIgnore
   public Long getVRSCorrectiveActionDelay() {
      return VRSCorrectiveActionDelay;
   }

   @JsonIgnore
   public void setVRSCorrectiveActionDelay(Long value) { 
      this.VRSCorrectiveActionDelay = value;
   }
   
   
   @JsonIgnore
   public Boolean getVRSProcessRedeploymentEnabled() {
      return VRSProcessRedeploymentEnabled;
   }

   @JsonIgnore
   public void setVRSProcessRedeploymentEnabled(Boolean value) { 
      this.VRSProcessRedeploymentEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getVRSVSCStatusRedeploymentEnabled() {
      return VRSVSCStatusRedeploymentEnabled;
   }

   @JsonIgnore
   public void setVRSVSCStatusRedeploymentEnabled(Boolean value) { 
      this.VRSVSCStatusRedeploymentEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getDeploymentCountThreshold() {
      return deploymentCountThreshold;
   }

   @JsonIgnore
   public void setDeploymentCountThreshold(Long value) { 
      this.deploymentCountThreshold = value;
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
   public Boolean getJesxmonProcessRedeploymentEnabled() {
      return jesxmonProcessRedeploymentEnabled;
   }

   @JsonIgnore
   public void setJesxmonProcessRedeploymentEnabled(Boolean value) { 
      this.jesxmonProcessRedeploymentEnabled = value;
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
   public Boolean getLogDiskUtilizationRedeploymentEnabled() {
      return logDiskUtilizationRedeploymentEnabled;
   }

   @JsonIgnore
   public void setLogDiskUtilizationRedeploymentEnabled(Boolean value) { 
      this.logDiskUtilizationRedeploymentEnabled = value;
   }
   
   
   @JsonIgnore
   public Float getLogDiskUtilizationThreshold() {
      return logDiskUtilizationThreshold;
   }

   @JsonIgnore
   public void setLogDiskUtilizationThreshold(Float value) { 
      this.logDiskUtilizationThreshold = value;
   }
   
   
   @JsonIgnore
   public Boolean getMemoryUtilizationRedeploymentEnabled() {
      return memoryUtilizationRedeploymentEnabled;
   }

   @JsonIgnore
   public void setMemoryUtilizationRedeploymentEnabled(Boolean value) { 
      this.memoryUtilizationRedeploymentEnabled = value;
   }
   
   
   @JsonIgnore
   public Float getMemoryUtilizationThreshold() {
      return memoryUtilizationThreshold;
   }

   @JsonIgnore
   public void setMemoryUtilizationThreshold(Float value) { 
      this.memoryUtilizationThreshold = value;
   }
   
   
   @JsonIgnore
   public Long getRedeploymentDelay() {
      return redeploymentDelay;
   }

   @JsonIgnore
   public void setRedeploymentDelay(Long value) { 
      this.redeploymentDelay = value;
   }
   
   
   @JsonIgnore
   public Boolean getRootDiskUtilizationRedeploymentEnabled() {
      return rootDiskUtilizationRedeploymentEnabled;
   }

   @JsonIgnore
   public void setRootDiskUtilizationRedeploymentEnabled(Boolean value) { 
      this.rootDiskUtilizationRedeploymentEnabled = value;
   }
   
   
   @JsonIgnore
   public Float getRootDiskUtilizationThreshold() {
      return rootDiskUtilizationThreshold;
   }

   @JsonIgnore
   public void setRootDiskUtilizationThreshold(Float value) { 
      this.rootDiskUtilizationThreshold = value;
   }
   

   

   public String toString() {
      return "VRSRedeploymentpolicy [" + "ALUbr0StatusRedeploymentEnabled=" + ALUbr0StatusRedeploymentEnabled + ", CPUUtilizationRedeploymentEnabled=" + CPUUtilizationRedeploymentEnabled + ", CPUUtilizationThreshold=" + CPUUtilizationThreshold + ", VRSCorrectiveActionDelay=" + VRSCorrectiveActionDelay + ", VRSProcessRedeploymentEnabled=" + VRSProcessRedeploymentEnabled + ", VRSVSCStatusRedeploymentEnabled=" + VRSVSCStatusRedeploymentEnabled + ", deploymentCountThreshold=" + deploymentCountThreshold + ", entityScope=" + entityScope + ", externalID=" + externalID + ", jesxmonProcessRedeploymentEnabled=" + jesxmonProcessRedeploymentEnabled + ", lastUpdatedBy=" + lastUpdatedBy + ", logDiskUtilizationRedeploymentEnabled=" + logDiskUtilizationRedeploymentEnabled + ", logDiskUtilizationThreshold=" + logDiskUtilizationThreshold + ", memoryUtilizationRedeploymentEnabled=" + memoryUtilizationRedeploymentEnabled + ", memoryUtilizationThreshold=" + memoryUtilizationThreshold + ", redeploymentDelay=" + redeploymentDelay + ", rootDiskUtilizationRedeploymentEnabled=" + rootDiskUtilizationRedeploymentEnabled + ", rootDiskUtilizationThreshold=" + rootDiskUtilizationThreshold + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}