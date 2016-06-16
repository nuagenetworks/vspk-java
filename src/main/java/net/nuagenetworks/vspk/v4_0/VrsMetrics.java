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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vrsmetrics", resourceName = "vrsmetrics")
public class VrsMetrics extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "ALUbr0Status")
   protected Boolean ALUbr0Status;
   
   @JsonProperty(value = "CPUUtilization")
   protected Float CPUUtilization;
   
   @JsonProperty(value = "VRSProcess")
   protected Boolean VRSProcess;
   
   @JsonProperty(value = "VRSVSCStatus")
   protected Boolean VRSVSCStatus;
   
   @JsonProperty(value = "receivingMetrics")
   protected Boolean receivingMetrics;
   
   @JsonProperty(value = "memoryUtilization")
   protected Float memoryUtilization;
   
   @JsonProperty(value = "jesxmonProcess")
   protected Boolean jesxmonProcess;
   
   @JsonProperty(value = "agentName")
   protected String agentName;
   
   @JsonProperty(value = "assocVCenterHypervisorID")
   protected String assocVCenterHypervisorID;
   

   

   public VrsMetrics() {
      
   }

   @JsonIgnore
   public Boolean getALUbr0Status() {
      return ALUbr0Status;
   }

   @JsonIgnore
   public void setALUbr0Status(Boolean value) { 
      this.ALUbr0Status = value;
   }
   @JsonIgnore
   public Float getCPUUtilization() {
      return CPUUtilization;
   }

   @JsonIgnore
   public void setCPUUtilization(Float value) { 
      this.CPUUtilization = value;
   }
   @JsonIgnore
   public Boolean getVRSProcess() {
      return VRSProcess;
   }

   @JsonIgnore
   public void setVRSProcess(Boolean value) { 
      this.VRSProcess = value;
   }
   @JsonIgnore
   public Boolean getVRSVSCStatus() {
      return VRSVSCStatus;
   }

   @JsonIgnore
   public void setVRSVSCStatus(Boolean value) { 
      this.VRSVSCStatus = value;
   }
   @JsonIgnore
   public Boolean getReceivingMetrics() {
      return receivingMetrics;
   }

   @JsonIgnore
   public void setReceivingMetrics(Boolean value) { 
      this.receivingMetrics = value;
   }
   @JsonIgnore
   public Float getMemoryUtilization() {
      return memoryUtilization;
   }

   @JsonIgnore
   public void setMemoryUtilization(Float value) { 
      this.memoryUtilization = value;
   }
   @JsonIgnore
   public Boolean getJesxmonProcess() {
      return jesxmonProcess;
   }

   @JsonIgnore
   public void setJesxmonProcess(Boolean value) { 
      this.jesxmonProcess = value;
   }
   @JsonIgnore
   public String getAgentName() {
      return agentName;
   }

   @JsonIgnore
   public void setAgentName(String value) { 
      this.agentName = value;
   }
   @JsonIgnore
   public String getAssocVCenterHypervisorID() {
      return assocVCenterHypervisorID;
   }

   @JsonIgnore
   public void setAssocVCenterHypervisorID(String value) { 
      this.assocVCenterHypervisorID = value;
   }
   

   

   public String toString() {
      return "VrsMetrics [" + "ALUbr0Status=" + ALUbr0Status + ", CPUUtilization=" + CPUUtilization + ", VRSProcess=" + VRSProcess + ", VRSVSCStatus=" + VRSVSCStatus + ", receivingMetrics=" + receivingMetrics + ", memoryUtilization=" + memoryUtilization + ", jesxmonProcess=" + jesxmonProcess + ", agentName=" + agentName + ", assocVCenterHypervisorID=" + assocVCenterHypervisorID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}