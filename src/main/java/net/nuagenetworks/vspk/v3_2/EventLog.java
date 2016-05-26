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

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "eventlog", resourceName = "eventlogs")
public class EventLog extends RestObject {

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "diff")
   protected Object diff;
   
   @JsonProperty(value = "enterprise")
   protected String enterprise;
   
   @JsonProperty(value = "entities")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> entities;
   
   @JsonProperty(value = "entityID")
   protected String entityID;
   
   @JsonProperty(value = "entityParentID")
   protected String entityParentID;
   
   @JsonProperty(value = "entityParentType")
   protected String entityParentType;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "entityType")
   protected String entityType;
   
   @JsonProperty(value = "user")
   protected String user;
   
   @JsonProperty(value = "eventReceivedTime")
   protected Float eventReceivedTime;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "type")
   protected String type;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public EventLog() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public Object getDiff() {
      return diff;
   }

   public void setDiff(Object value) { 
      this.diff = value;
   }
   public String getEnterprise() {
      return enterprise;
   }

   public void setEnterprise(String value) { 
      this.enterprise = value;
   }
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getEntities() {
      return entities;
   }

   public void setEntities(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.entities = value;
   }
   public String getEntityID() {
      return entityID;
   }

   public void setEntityID(String value) { 
      this.entityID = value;
   }
   public String getEntityParentID() {
      return entityParentID;
   }

   public void setEntityParentID(String value) { 
      this.entityParentID = value;
   }
   public String getEntityParentType() {
      return entityParentType;
   }

   public void setEntityParentType(String value) { 
      this.entityParentType = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getEntityType() {
      return entityType;
   }

   public void setEntityType(String value) { 
      this.entityType = value;
   }
   public String getUser() {
      return user;
   }

   public void setUser(String value) { 
      this.user = value;
   }
   public Float getEventReceivedTime() {
      return eventReceivedTime;
   }

   public void setEventReceivedTime(Float value) { 
      this.eventReceivedTime = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getType() {
      return type;
   }

   public void setType(String value) { 
      this.type = value;
   }
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "EventLog [" + "diff=" + diff + ", enterprise=" + enterprise + ", entities=" + entities + ", entityID=" + entityID + ", entityParentID=" + entityParentID + ", entityParentType=" + entityParentType + ", entityScope=" + entityScope + ", entityType=" + entityType + ", user=" + user + ", eventReceivedTime=" + eventReceivedTime + ", externalID=" + externalID + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}