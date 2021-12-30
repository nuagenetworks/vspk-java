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
@RestEntity(restName = "icmpechotestdefinition", resourceName = "icmpechotestdefinitions")
public class ICMPEchoTestDefinition extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "donotFragment")
   
   protected Boolean donotFragment;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "packetCount")
   
   protected Long packetCount;
   
   @JsonProperty(value = "packetInterval")
   
   protected Long packetInterval;
   
   @JsonProperty(value = "packetSize")
   
   protected Long packetSize;
   
   @JsonProperty(value = "slaMonitoring")
   
   protected Boolean slaMonitoring;
   
   @JsonProperty(value = "thresholdAverageRoundTripTime")
   
   protected Float thresholdAverageRoundTripTime;
   
   @JsonProperty(value = "thresholdPacketLoss")
   
   protected Float thresholdPacketLoss;
   
   @JsonProperty(value = "timeout")
   
   protected Long timeout;
   
   @JsonProperty(value = "tos")
   
   protected Long tos;
   

   

   public ICMPEchoTestDefinition() {
      
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
   public Boolean getDonotFragment() {
      return donotFragment;
   }

   @JsonIgnore
   public void setDonotFragment(Boolean value) { 
      this.donotFragment = value;
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
   public Long getPacketCount() {
      return packetCount;
   }

   @JsonIgnore
   public void setPacketCount(Long value) { 
      this.packetCount = value;
   }
   
   
   @JsonIgnore
   public Long getPacketInterval() {
      return packetInterval;
   }

   @JsonIgnore
   public void setPacketInterval(Long value) { 
      this.packetInterval = value;
   }
   
   
   @JsonIgnore
   public Long getPacketSize() {
      return packetSize;
   }

   @JsonIgnore
   public void setPacketSize(Long value) { 
      this.packetSize = value;
   }
   
   
   @JsonIgnore
   public Boolean getSlaMonitoring() {
      return slaMonitoring;
   }

   @JsonIgnore
   public void setSlaMonitoring(Boolean value) { 
      this.slaMonitoring = value;
   }
   
   
   @JsonIgnore
   public Float getThresholdAverageRoundTripTime() {
      return thresholdAverageRoundTripTime;
   }

   @JsonIgnore
   public void setThresholdAverageRoundTripTime(Float value) { 
      this.thresholdAverageRoundTripTime = value;
   }
   
   
   @JsonIgnore
   public Float getThresholdPacketLoss() {
      return thresholdPacketLoss;
   }

   @JsonIgnore
   public void setThresholdPacketLoss(Float value) { 
      this.thresholdPacketLoss = value;
   }
   
   
   @JsonIgnore
   public Long getTimeout() {
      return timeout;
   }

   @JsonIgnore
   public void setTimeout(Long value) { 
      this.timeout = value;
   }
   
   
   @JsonIgnore
   public Long getTos() {
      return tos;
   }

   @JsonIgnore
   public void setTos(Long value) { 
      this.tos = value;
   }
   

   

   public String toString() {
      return "ICMPEchoTestDefinition [" + "description=" + description + ", donotFragment=" + donotFragment + ", name=" + name + ", packetCount=" + packetCount + ", packetInterval=" + packetInterval + ", packetSize=" + packetSize + ", slaMonitoring=" + slaMonitoring + ", thresholdAverageRoundTripTime=" + thresholdAverageRoundTripTime + ", thresholdPacketLoss=" + thresholdPacketLoss + ", timeout=" + timeout + ", tos=" + tos + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}