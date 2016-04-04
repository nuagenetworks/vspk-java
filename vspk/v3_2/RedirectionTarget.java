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

import vspk.v3_2.fetchers.EventLogsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.JobsFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.VirtualIPsFetcher;
import vspk.v3_2.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedirectionTarget extends RestObject {

   public final static String REST_NAME = "redirectiontarget";
   public final static String RESOURCE_NAME = "redirectiontargets";

   
   public enum EndPointType { L3, NONE, VIRTUAL_WIRE };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum TriggerType { GARP, NONE };

   
   @JsonProperty(value = "ESI")
   protected String ESI;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "endPointType")
   protected EndPointType endPointType;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "redundancyEnabled")
   protected boolean redundancyEnabled;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "triggerType")
   protected TriggerType triggerType;
   
   @JsonProperty(value = "virtualNetworkID")
   protected String virtualNetworkID;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VirtualIPsFetcher virtualIPs;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   

   public RedirectionTarget() {
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      virtualIPs = new VirtualIPsFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
   }

   public String getESI() {
      return ESI;
   }

   public void setESI(String value) { 
      this.ESI = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public EndPointType getEndPointType() {
      return endPointType;
   }

   public void setEndPointType(EndPointType value) { 
      this.endPointType = value;
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
   public boolean getRedundancyEnabled() {
      return redundancyEnabled;
   }

   public void setRedundancyEnabled(boolean value) { 
      this.redundancyEnabled = value;
   }
   public String getTemplateID() {
      return templateID;
   }

   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   public TriggerType getTriggerType() {
      return triggerType;
   }

   public void setTriggerType(TriggerType value) { 
      this.triggerType = value;
   }
   public String getVirtualNetworkID() {
      return virtualNetworkID;
   }

   public void setVirtualNetworkID(String value) { 
      this.virtualNetworkID = value;
   }
   

   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public VirtualIPsFetcher getVirtualIPs() {
      return virtualIPs;
   }
   
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "RedirectionTarget [" + "ESI=" + ESI + ", description=" + description + ", endPointType=" + endPointType + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", redundancyEnabled=" + redundancyEnabled + ", templateID=" + templateID + ", triggerType=" + triggerType + ", virtualNetworkID=" + virtualNetworkID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}