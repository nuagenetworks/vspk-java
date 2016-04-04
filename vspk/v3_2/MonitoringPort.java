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


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MonitoringPort extends RestObject {

   public final static String REST_NAME = "monitoringport";
   public final static String RESOURCE_NAME = "monitoringports";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum ResiliencyState { BACKUP, MASTER, NONE };
   public enum State { ADMIN_DOWN, DOWN, UP };

   
   @JsonProperty(value = "access")
   protected boolean access;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastStateChange")
   protected int lastStateChange;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "resiliencyState")
   protected ResiliencyState resiliencyState;
   
   @JsonProperty(value = "resilient")
   protected boolean resilient;
   
   @JsonProperty(value = "state")
   protected State state;
   
   @JsonProperty(value = "uplink")
   protected boolean uplink;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public MonitoringPort() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public boolean getAccess() {
      return access;
   }

   public void setAccess(boolean value) { 
      this.access = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public int getLastStateChange() {
      return lastStateChange;
   }

   public void setLastStateChange(int value) { 
      this.lastStateChange = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public ResiliencyState getResiliencyState() {
      return resiliencyState;
   }

   public void setResiliencyState(ResiliencyState value) { 
      this.resiliencyState = value;
   }
   public boolean getResilient() {
      return resilient;
   }

   public void setResilient(boolean value) { 
      this.resilient = value;
   }
   public State getState() {
      return state;
   }

   public void setState(State value) { 
      this.state = value;
   }
   public boolean getUplink() {
      return uplink;
   }

   public void setUplink(boolean value) { 
      this.uplink = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "MonitoringPort [" + "access=" + access + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastStateChange=" + lastStateChange + ", name=" + name + ", resiliencyState=" + resiliencyState + ", resilient=" + resilient + ", state=" + state + ", uplink=" + uplink + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}