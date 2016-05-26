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

import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "monitoringport", resourceName = "monitoringports")
public class MonitoringPort extends RestObject {

   
   public enum ResiliencyState { backup, master, none };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum State { ADMIN_DOWN, DOWN, UP };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastStateChange")
   protected Long lastStateChange;
   
   @JsonProperty(value = "access")
   protected Boolean access;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "resiliencyState")
   protected ResiliencyState resiliencyState;
   
   @JsonProperty(value = "resilient")
   protected Boolean resilient;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "uplink")
   protected Boolean uplink;
   
   @JsonProperty(value = "state")
   protected State state;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public MonitoringPort() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public Long getLastStateChange() {
      return lastStateChange;
   }

   public void setLastStateChange(Long value) { 
      this.lastStateChange = value;
   }
   public Boolean getAccess() {
      return access;
   }

   public void setAccess(Boolean value) { 
      this.access = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public ResiliencyState getResiliencyState() {
      return resiliencyState;
   }

   public void setResiliencyState(ResiliencyState value) { 
      this.resiliencyState = value;
   }
   public Boolean getResilient() {
      return resilient;
   }

   public void setResilient(Boolean value) { 
      this.resilient = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public Boolean getUplink() {
      return uplink;
   }

   public void setUplink(Boolean value) { 
      this.uplink = value;
   }
   public State getState() {
      return state;
   }

   public void setState(State value) { 
      this.state = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
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
      return "MonitoringPort [" + "name=" + name + ", lastStateChange=" + lastStateChange + ", access=" + access + ", description=" + description + ", resiliencyState=" + resiliencyState + ", resilient=" + resilient + ", entityScope=" + entityScope + ", uplink=" + uplink + ", state=" + state + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}