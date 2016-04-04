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


@JsonIgnoreProperties(ignoreUnknown = true)
public class VrsMetrics extends RestObject {

   public final static String REST_NAME = "vrsmetrics";
   public final static String RESOURCE_NAME = "vrsmetrics";

   

   
   @JsonProperty(value = "ALUbr0Status")
   protected boolean ALUbr0Status;
   
   @JsonProperty(value = "CPUUtilization")
   protected float CPUUtilization;
   
   @JsonProperty(value = "VRSProcess")
   protected boolean VRSProcess;
   
   @JsonProperty(value = "VRSVSCStatus")
   protected boolean VRSVSCStatus;
   
   @JsonProperty(value = "agentName")
   protected String agentName;
   
   @JsonProperty(value = "assocVCenterHypervisorID")
   protected String assocVCenterHypervisorID;
   
   @JsonProperty(value = "jesxmonProcess")
   protected boolean jesxmonProcess;
   
   @JsonProperty(value = "memoryUtilization")
   protected float memoryUtilization;
   
   @JsonProperty(value = "receivingMetrics")
   protected boolean receivingMetrics;
   

   

   public VrsMetrics() {
      
   }

   public boolean getALUbr0Status() {
      return ALUbr0Status;
   }

   public void setALUbr0Status(boolean value) { 
      this.ALUbr0Status = value;
   }
   public float getCPUUtilization() {
      return CPUUtilization;
   }

   public void setCPUUtilization(float value) { 
      this.CPUUtilization = value;
   }
   public boolean getVRSProcess() {
      return VRSProcess;
   }

   public void setVRSProcess(boolean value) { 
      this.VRSProcess = value;
   }
   public boolean getVRSVSCStatus() {
      return VRSVSCStatus;
   }

   public void setVRSVSCStatus(boolean value) { 
      this.VRSVSCStatus = value;
   }
   public String getAgentName() {
      return agentName;
   }

   public void setAgentName(String value) { 
      this.agentName = value;
   }
   public String getAssocVCenterHypervisorID() {
      return assocVCenterHypervisorID;
   }

   public void setAssocVCenterHypervisorID(String value) { 
      this.assocVCenterHypervisorID = value;
   }
   public boolean getJesxmonProcess() {
      return jesxmonProcess;
   }

   public void setJesxmonProcess(boolean value) { 
      this.jesxmonProcess = value;
   }
   public float getMemoryUtilization() {
      return memoryUtilization;
   }

   public void setMemoryUtilization(float value) { 
      this.memoryUtilization = value;
   }
   public boolean getReceivingMetrics() {
      return receivingMetrics;
   }

   public void setReceivingMetrics(boolean value) { 
      this.receivingMetrics = value;
   }
   

   

   public String toString() {
      return "VrsMetrics [" + "ALUbr0Status=" + ALUbr0Status + ", CPUUtilization=" + CPUUtilization + ", VRSProcess=" + VRSProcess + ", VRSVSCStatus=" + VRSVSCStatus + ", agentName=" + agentName + ", assocVCenterHypervisorID=" + assocVCenterHypervisorID + ", jesxmonProcess=" + jesxmonProcess + ", memoryUtilization=" + memoryUtilization + ", receivingMetrics=" + receivingMetrics + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}