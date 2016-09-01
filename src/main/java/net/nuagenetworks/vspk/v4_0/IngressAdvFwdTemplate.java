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
import net.nuagenetworks.vspk.v4_0.fetchers.IngressAdvFwdEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.JobsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ingressadvfwdtemplate", resourceName = "ingressadvfwdtemplates")
public class IngressAdvFwdTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PolicyState { DRAFT, LIVE };
   public enum PriorityType { BOTTOM, NONE, TOP };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "active")
   protected Boolean active;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "policyState")
   protected PolicyState policyState;
   
   @JsonProperty(value = "priority")
   protected Long priority;
   
   @JsonProperty(value = "priorityType")
   protected PriorityType priorityType;
   
   @JsonProperty(value = "associatedLiveEntityID")
   protected String associatedLiveEntityID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private IngressAdvFwdEntryTemplatesFetcher ingressAdvFwdEntryTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   

   public IngressAdvFwdTemplate() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      ingressAdvFwdEntryTemplates = new IngressAdvFwdEntryTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   @JsonIgnore
   public Boolean getActive() {
      return active;
   }

   @JsonIgnore
   public void setActive(Boolean value) { 
      this.active = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   @JsonIgnore
   public PolicyState getPolicyState() {
      return policyState;
   }

   @JsonIgnore
   public void setPolicyState(PolicyState value) { 
      this.policyState = value;
   }
   @JsonIgnore
   public Long getPriority() {
      return priority;
   }

   @JsonIgnore
   public void setPriority(Long value) { 
      this.priority = value;
   }
   @JsonIgnore
   public PriorityType getPriorityType() {
      return priorityType;
   }

   @JsonIgnore
   public void setPriorityType(PriorityType value) { 
      this.priorityType = value;
   }
   @JsonIgnore
   public String getAssociatedLiveEntityID() {
      return associatedLiveEntityID;
   }

   @JsonIgnore
   public void setAssociatedLiveEntityID(String value) { 
      this.associatedLiveEntityID = value;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public IngressAdvFwdEntryTemplatesFetcher getIngressAdvFwdEntryTemplates() {
      return ingressAdvFwdEntryTemplates;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   

   public String toString() {
      return "IngressAdvFwdTemplate [" + "name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", active=" + active + ", description=" + description + ", entityScope=" + entityScope + ", policyState=" + policyState + ", priority=" + priority + ", priorityType=" + priorityType + ", associatedLiveEntityID=" + associatedLiveEntityID + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}