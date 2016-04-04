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

import vspk.v4_0.fetchers.EgressACLEntryTemplatesFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.JobsFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.VMsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EgressACLTemplate extends RestObject {

   public final static String REST_NAME = "egressacltemplate";
   public final static String RESOURCE_NAME = "egressacltemplates";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PolicyState { DRAFT, LIVE };
   public enum PriorityType { BOTTOM, NONE, TOP };

   
   @JsonProperty(value = "active")
   protected boolean active;
   
   @JsonProperty(value = "associatedLiveEntityID")
   protected String associatedLiveEntityID;
   
   @JsonProperty(value = "defaultAllowIP")
   protected boolean defaultAllowIP;
   
   @JsonProperty(value = "defaultAllowNonIP")
   protected boolean defaultAllowNonIP;
   
   @JsonProperty(value = "defaultInstallACLImplicitRules")
   protected boolean defaultInstallACLImplicitRules;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "policyState")
   protected PolicyState policyState;
   
   @JsonProperty(value = "priority")
   protected int priority;
   
   @JsonProperty(value = "priorityType")
   protected PriorityType priorityType;
   

   
   @JsonIgnore
   private EgressACLEntryTemplatesFetcher egressACLEntryTemplates;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   

   public EgressACLTemplate() {
      
      egressACLEntryTemplates = new EgressACLEntryTemplatesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
   }

   public boolean getActive() {
      return active;
   }

   public void setActive(boolean value) { 
      this.active = value;
   }
   public String getAssociatedLiveEntityID() {
      return associatedLiveEntityID;
   }

   public void setAssociatedLiveEntityID(String value) { 
      this.associatedLiveEntityID = value;
   }
   public boolean getDefaultAllowIP() {
      return defaultAllowIP;
   }

   public void setDefaultAllowIP(boolean value) { 
      this.defaultAllowIP = value;
   }
   public boolean getDefaultAllowNonIP() {
      return defaultAllowNonIP;
   }

   public void setDefaultAllowNonIP(boolean value) { 
      this.defaultAllowNonIP = value;
   }
   public boolean getDefaultInstallACLImplicitRules() {
      return defaultInstallACLImplicitRules;
   }

   public void setDefaultInstallACLImplicitRules(boolean value) { 
      this.defaultInstallACLImplicitRules = value;
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
   public PolicyState getPolicyState() {
      return policyState;
   }

   public void setPolicyState(PolicyState value) { 
      this.policyState = value;
   }
   public int getPriority() {
      return priority;
   }

   public void setPriority(int value) { 
      this.priority = value;
   }
   public PriorityType getPriorityType() {
      return priorityType;
   }

   public void setPriorityType(PriorityType value) { 
      this.priorityType = value;
   }
   

   
   public EgressACLEntryTemplatesFetcher getEgressACLEntryTemplates() {
      return egressACLEntryTemplates;
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
   
   public VMsFetcher getVMs() {
      return vMs;
   }
   

   public String toString() {
      return "EgressACLTemplate [" + "active=" + active + ", associatedLiveEntityID=" + associatedLiveEntityID + ", defaultAllowIP=" + defaultAllowIP + ", defaultAllowNonIP=" + defaultAllowNonIP + ", defaultInstallACLImplicitRules=" + defaultInstallACLImplicitRules + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", policyState=" + policyState + ", priority=" + priority + ", priorityType=" + priorityType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}