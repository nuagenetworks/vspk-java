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
@RestEntity(restName = "monitoringport", resourceName = "monitoringports")
public class MonitoringPort extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EResiliencyState { backup, master, none };
   public enum EState { ADMIN_DOWN, DOWN, UP };

   
   @JsonProperty(value = "access")
   
   protected Boolean access;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "dpdkEnabled")
   
   protected Boolean dpdkEnabled;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastStateChange")
   
   protected Long lastStateChange;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "resiliencyState")
   
   protected EResiliencyState resiliencyState;
   
   @JsonProperty(value = "resilient")
   
   protected Boolean resilient;
   
   @JsonProperty(value = "state")
   
   protected EState state;
   
   @JsonProperty(value = "uplink")
   
   protected Boolean uplink;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public MonitoringPort() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getAccess() {
      return access;
   }

   @JsonIgnore
   public void setAccess(Boolean value) { 
      this.access = value;
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
   public Boolean getDpdkEnabled() {
      return dpdkEnabled;
   }

   @JsonIgnore
   public void setDpdkEnabled(Boolean value) { 
      this.dpdkEnabled = value;
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
   public EEntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EEntityScope value) { 
      this.entityScope = value;
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
   public Long getLastStateChange() {
      return lastStateChange;
   }

   @JsonIgnore
   public void setLastStateChange(Long value) { 
      this.lastStateChange = value;
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
   public EResiliencyState getResiliencyState() {
      return resiliencyState;
   }

   @JsonIgnore
   public void setResiliencyState(EResiliencyState value) { 
      this.resiliencyState = value;
   }
   
   
   @JsonIgnore
   public Boolean getResilient() {
      return resilient;
   }

   @JsonIgnore
   public void setResilient(Boolean value) { 
      this.resilient = value;
   }
   
   
   @JsonIgnore
   public EState getState() {
      return state;
   }

   @JsonIgnore
   public void setState(EState value) { 
      this.state = value;
   }
   
   
   @JsonIgnore
   public Boolean getUplink() {
      return uplink;
   }

   @JsonIgnore
   public void setUplink(Boolean value) { 
      this.uplink = value;
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
      return "MonitoringPort [" + "access=" + access + ", description=" + description + ", dpdkEnabled=" + dpdkEnabled + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastStateChange=" + lastStateChange + ", name=" + name + ", resiliencyState=" + resiliencyState + ", resilient=" + resilient + ", state=" + state + ", uplink=" + uplink + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}