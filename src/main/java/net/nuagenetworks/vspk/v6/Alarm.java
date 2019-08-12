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
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "alarm", resourceName = "alarms")
public class Alarm extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ESeverity { CRITICAL, INFO, MAJOR, MINOR, WARNING };

   
   @JsonProperty(value = "acknowledged")
   
   protected Boolean acknowledged;
   
   @JsonProperty(value = "alarmedObjectID")
   
   protected String alarmedObjectID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseID")
   
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "errorCondition")
   
   protected Long errorCondition;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "numberOfOccurances")
   
   protected Long numberOfOccurances;
   
   @JsonProperty(value = "remedy")
   
   protected String remedy;
   
   @JsonProperty(value = "severity")
   
   protected ESeverity severity;
   
   @JsonProperty(value = "targetObject")
   
   protected String targetObject;
   
   @JsonProperty(value = "timestamp")
   
   protected Long timestamp;
   
   @JsonProperty(value = "title")
   
   protected String title;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public Alarm() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getAcknowledged() {
      return acknowledged;
   }

   @JsonIgnore
   public void setAcknowledged(Boolean value) { 
      this.acknowledged = value;
   }
   
   
   @JsonIgnore
   public String getAlarmedObjectID() {
      return alarmedObjectID;
   }

   @JsonIgnore
   public void setAlarmedObjectID(String value) { 
      this.alarmedObjectID = value;
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
   public Long getErrorCondition() {
      return errorCondition;
   }

   @JsonIgnore
   public void setErrorCondition(Long value) { 
      this.errorCondition = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   
   @JsonIgnore
   public Long getNumberOfOccurances() {
      return numberOfOccurances;
   }

   @JsonIgnore
   public void setNumberOfOccurances(Long value) { 
      this.numberOfOccurances = value;
   }
   
   
   @JsonIgnore
   public String getRemedy() {
      return remedy;
   }

   @JsonIgnore
   public void setRemedy(String value) { 
      this.remedy = value;
   }
   
   
   @JsonIgnore
   public ESeverity getSeverity() {
      return severity;
   }

   @JsonIgnore
   public void setSeverity(ESeverity value) { 
      this.severity = value;
   }
   
   
   @JsonIgnore
   public String getTargetObject() {
      return targetObject;
   }

   @JsonIgnore
   public void setTargetObject(String value) { 
      this.targetObject = value;
   }
   
   
   @JsonIgnore
   public Long getTimestamp() {
      return timestamp;
   }

   @JsonIgnore
   public void setTimestamp(Long value) { 
      this.timestamp = value;
   }
   
   
   @JsonIgnore
   public String getTitle() {
      return title;
   }

   @JsonIgnore
   public void setTitle(String value) { 
      this.title = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "Alarm [" + "acknowledged=" + acknowledged + ", alarmedObjectID=" + alarmedObjectID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", errorCondition=" + errorCondition + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", numberOfOccurances=" + numberOfOccurances + ", remedy=" + remedy + ", severity=" + severity + ", targetObject=" + targetObject + ", timestamp=" + timestamp + ", title=" + title + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}