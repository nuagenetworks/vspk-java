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
import net.nuagenetworks.vspk.v6.fetchers.IngressAdvFwdEntryTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ingressadvfwdtemplate", resourceName = "ingressadvfwdtemplates")
public class IngressAdvFwdTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPolicyState { DRAFT, LIVE };
   public enum EPriorityType { BOTTOM, NONE, TOP };

   
   @JsonProperty(value = "active")
   
   protected Boolean active;
   
   @JsonProperty(value = "associatedLiveEntityID")
   
   protected String associatedLiveEntityID;
   
   @JsonProperty(value = "autoGeneratePriority")
   
   protected Boolean autoGeneratePriority;
   
   @JsonProperty(value = "defaultAllowIP")
   
   protected Boolean defaultAllowIP;
   
   @JsonProperty(value = "defaultAllowNonIP")
   
   protected Boolean defaultAllowNonIP;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "policyState")
   
   protected EPolicyState policyState;
   
   @JsonProperty(value = "priority")
   
   protected Long priority;
   
   @JsonProperty(value = "priorityType")
   
   protected EPriorityType priorityType;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private IngressAdvFwdEntryTemplatesFetcher ingressAdvFwdEntryTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public IngressAdvFwdTemplate() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      ingressAdvFwdEntryTemplates = new IngressAdvFwdEntryTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
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
   public String getAssociatedLiveEntityID() {
      return associatedLiveEntityID;
   }

   @JsonIgnore
   public void setAssociatedLiveEntityID(String value) { 
      this.associatedLiveEntityID = value;
   }
   
   
   @JsonIgnore
   public Boolean getAutoGeneratePriority() {
      return autoGeneratePriority;
   }

   @JsonIgnore
   public void setAutoGeneratePriority(Boolean value) { 
      this.autoGeneratePriority = value;
   }
   
   
   @JsonIgnore
   public Boolean getDefaultAllowIP() {
      return defaultAllowIP;
   }

   @JsonIgnore
   public void setDefaultAllowIP(Boolean value) { 
      this.defaultAllowIP = value;
   }
   
   
   @JsonIgnore
   public Boolean getDefaultAllowNonIP() {
      return defaultAllowNonIP;
   }

   @JsonIgnore
   public void setDefaultAllowNonIP(Boolean value) { 
      this.defaultAllowNonIP = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public EPolicyState getPolicyState() {
      return policyState;
   }

   @JsonIgnore
   public void setPolicyState(EPolicyState value) { 
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
   public EPriorityType getPriorityType() {
      return priorityType;
   }

   @JsonIgnore
   public void setPriorityType(EPriorityType value) { 
      this.priorityType = value;
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
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "IngressAdvFwdTemplate [" + "active=" + active + ", associatedLiveEntityID=" + associatedLiveEntityID + ", autoGeneratePriority=" + autoGeneratePriority + ", defaultAllowIP=" + defaultAllowIP + ", defaultAllowNonIP=" + defaultAllowNonIP + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", policyState=" + policyState + ", priority=" + priority + ", priorityType=" + priorityType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}