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
@RestEntity(restName = "None", resourceName = "None")
public class TCPConnectTestResult extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "averageRoundTripTime")
   
   protected Float averageRoundTripTime;
   
   @JsonProperty(value = "connectionAttempts")
   
   protected Long connectionAttempts;
   
   @JsonProperty(value = "failedAttempts")
   
   protected Long failedAttempts;
   
   @JsonProperty(value = "failedPercent")
   
   protected Float failedPercent;
   
   @JsonProperty(value = "maximumRoundTripTime")
   
   protected Float maximumRoundTripTime;
   
   @JsonProperty(value = "minimumRoundTripTime")
   
   protected Float minimumRoundTripTime;
   
   @JsonProperty(value = "successfulConnections")
   
   protected Long successfulConnections;
   

   

   public TCPConnectTestResult() {
      
   }

   
   
   @JsonIgnore
   public Float getAverageRoundTripTime() {
      return averageRoundTripTime;
   }

   @JsonIgnore
   public void setAverageRoundTripTime(Float value) { 
      this.averageRoundTripTime = value;
   }
   
   
   @JsonIgnore
   public Long getConnectionAttempts() {
      return connectionAttempts;
   }

   @JsonIgnore
   public void setConnectionAttempts(Long value) { 
      this.connectionAttempts = value;
   }
   
   
   @JsonIgnore
   public Long getFailedAttempts() {
      return failedAttempts;
   }

   @JsonIgnore
   public void setFailedAttempts(Long value) { 
      this.failedAttempts = value;
   }
   
   
   @JsonIgnore
   public Float getFailedPercent() {
      return failedPercent;
   }

   @JsonIgnore
   public void setFailedPercent(Float value) { 
      this.failedPercent = value;
   }
   
   
   @JsonIgnore
   public Float getMaximumRoundTripTime() {
      return maximumRoundTripTime;
   }

   @JsonIgnore
   public void setMaximumRoundTripTime(Float value) { 
      this.maximumRoundTripTime = value;
   }
   
   
   @JsonIgnore
   public Float getMinimumRoundTripTime() {
      return minimumRoundTripTime;
   }

   @JsonIgnore
   public void setMinimumRoundTripTime(Float value) { 
      this.minimumRoundTripTime = value;
   }
   
   
   @JsonIgnore
   public Long getSuccessfulConnections() {
      return successfulConnections;
   }

   @JsonIgnore
   public void setSuccessfulConnections(Long value) { 
      this.successfulConnections = value;
   }
   

   

   public String toString() {
      return "TCPConnectTestResult [" + "averageRoundTripTime=" + averageRoundTripTime + ", connectionAttempts=" + connectionAttempts + ", failedAttempts=" + failedAttempts + ", failedPercent=" + failedPercent + ", maximumRoundTripTime=" + maximumRoundTripTime + ", minimumRoundTripTime=" + minimumRoundTripTime + ", successfulConnections=" + successfulConnections + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}