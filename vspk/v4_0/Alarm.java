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

import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Alarm extends RestObject {

   public final static String REST_NAME = "alarm";
   public final static String RESOURCE_NAME = "alarms";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Severity { CRITICAL, INFO, MAJOR, MINOR, WARNING };

   
   @JsonProperty(value = "acknowledged")
   protected boolean acknowledged;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "errorCondition")
   protected int errorCondition;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "numberOfOccurances")
   protected int numberOfOccurances;
   
   @JsonProperty(value = "reason")
   protected String reason;
   
   @JsonProperty(value = "severity")
   protected Severity severity;
   
   @JsonProperty(value = "targetObject")
   protected String targetObject;
   
   @JsonProperty(value = "timestamp")
   protected int timestamp;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public Alarm() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public boolean getAcknowledged() {
      return acknowledged;
   }

   public void setAcknowledged(boolean value) { 
      this.acknowledged = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getEnterpriseID() {
      return enterpriseID;
   }

   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public int getErrorCondition() {
      return errorCondition;
   }

   public void setErrorCondition(int value) { 
      this.errorCondition = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public int getNumberOfOccurances() {
      return numberOfOccurances;
   }

   public void setNumberOfOccurances(int value) { 
      this.numberOfOccurances = value;
   }
   public String getReason() {
      return reason;
   }

   public void setReason(String value) { 
      this.reason = value;
   }
   public Severity getSeverity() {
      return severity;
   }

   public void setSeverity(Severity value) { 
      this.severity = value;
   }
   public String getTargetObject() {
      return targetObject;
   }

   public void setTargetObject(String value) { 
      this.targetObject = value;
   }
   public int getTimestamp() {
      return timestamp;
   }

   public void setTimestamp(int value) { 
      this.timestamp = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "Alarm [" + "acknowledged=" + acknowledged + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", errorCondition=" + errorCondition + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", numberOfOccurances=" + numberOfOccurances + ", reason=" + reason + ", severity=" + severity + ", targetObject=" + targetObject + ", timestamp=" + timestamp + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}