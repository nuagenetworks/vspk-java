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

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "deploymentfailure", resourceName = "deploymentfailures")
public class DeploymentFailure extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum EventType { CREATE, DELETE, UPDATE };

   
   @JsonProperty(value = "affectedEntityID")
   protected String affectedEntityID;
   
   @JsonProperty(value = "affectedEntityType")
   protected String affectedEntityType;
   
   @JsonProperty(value = "errorCondition")
   protected Long errorCondition;
   
   @JsonProperty(value = "eventType")
   protected EventType eventType;
   
   @JsonProperty(value = "lastFailureReason")
   protected String lastFailureReason;
   
   @JsonProperty(value = "lastKnownError")
   protected String lastKnownError;
   
   @JsonProperty(value = "numberOfOccurences")
   protected Long numberOfOccurences;
   

   

   public DeploymentFailure() {
      
   }

   
   @JsonIgnore
   public String getAffectedEntityID() {
      return affectedEntityID;
   }

   @JsonIgnore
   public void setAffectedEntityID(String value) { 
      this.affectedEntityID = value;
   }
   
   @JsonIgnore
   public String getAffectedEntityType() {
      return affectedEntityType;
   }

   @JsonIgnore
   public void setAffectedEntityType(String value) { 
      this.affectedEntityType = value;
   }
   
   @JsonIgnore
   public Long getErrorCondition() {
      return errorCondition;
   }

   @JsonIgnore
   public void setErrorCondition(Long value) { 
      this.errorCondition = value;
   }
   
   @JsonIgnore
   public EventType getEventType() {
      return eventType;
   }

   @JsonIgnore
   public void setEventType(EventType value) { 
      this.eventType = value;
   }
   
   @JsonIgnore
   public String getLastFailureReason() {
      return lastFailureReason;
   }

   @JsonIgnore
   public void setLastFailureReason(String value) { 
      this.lastFailureReason = value;
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
   public Long getNumberOfOccurences() {
      return numberOfOccurences;
   }

   @JsonIgnore
   public void setNumberOfOccurences(Long value) { 
      this.numberOfOccurences = value;
   }
   

   

   public String toString() {
      return "DeploymentFailure [" + "affectedEntityID=" + affectedEntityID + ", affectedEntityType=" + affectedEntityType + ", errorCondition=" + errorCondition + ", eventType=" + eventType + ", lastFailureReason=" + lastFailureReason + ", lastKnownError=" + lastKnownError + ", numberOfOccurences=" + numberOfOccurences + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}