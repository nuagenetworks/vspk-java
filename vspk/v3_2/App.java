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
import vspk.v3_2.fetchers.FlowsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.JobsFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.TiersFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class App extends RestObject {

   public final static String REST_NAME = "application";
   public final static String RESOURCE_NAME = "applications";

   
   public enum AssociatedDomainType { DOMAIN, L2DOMAIN };
   public enum AssociatedNetworkObjectType { DOMAIN, ENTERPRISE };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "assocEgressACLTemplateId")
   protected String assocEgressACLTemplateId;
   
   @JsonProperty(value = "assocIngressACLTemplateId")
   protected String assocIngressACLTemplateId;
   
   @JsonProperty(value = "associatedDomainID")
   protected String associatedDomainID;
   
   @JsonProperty(value = "associatedDomainType")
   protected AssociatedDomainType associatedDomainType;
   
   @JsonProperty(value = "associatedNetworkObjectID")
   protected String associatedNetworkObjectID;
   
   @JsonProperty(value = "associatedNetworkObjectType")
   protected AssociatedNetworkObjectType associatedNetworkObjectType;
   
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
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private FlowsFetcher flows;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private TiersFetcher tiers;
   

   public App() {
      
      eventLogs = new EventLogsFetcher(this);
      
      flows = new FlowsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      tiers = new TiersFetcher(this);
      
   }

   public String getAssocEgressACLTemplateId() {
      return assocEgressACLTemplateId;
   }

   public void setAssocEgressACLTemplateId(String value) { 
      this.assocEgressACLTemplateId = value;
   }
   public String getAssocIngressACLTemplateId() {
      return assocIngressACLTemplateId;
   }

   public void setAssocIngressACLTemplateId(String value) { 
      this.assocIngressACLTemplateId = value;
   }
   public String getAssociatedDomainID() {
      return associatedDomainID;
   }

   public void setAssociatedDomainID(String value) { 
      this.associatedDomainID = value;
   }
   public AssociatedDomainType getAssociatedDomainType() {
      return associatedDomainType;
   }

   public void setAssociatedDomainType(AssociatedDomainType value) { 
      this.associatedDomainType = value;
   }
   public String getAssociatedNetworkObjectID() {
      return associatedNetworkObjectID;
   }

   public void setAssociatedNetworkObjectID(String value) { 
      this.associatedNetworkObjectID = value;
   }
   public AssociatedNetworkObjectType getAssociatedNetworkObjectType() {
      return associatedNetworkObjectType;
   }

   public void setAssociatedNetworkObjectType(AssociatedNetworkObjectType value) { 
      this.associatedNetworkObjectType = value;
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
   

   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public FlowsFetcher getFlows() {
      return flows;
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
   
   public TiersFetcher getTiers() {
      return tiers;
   }
   

   public String toString() {
      return "App [" + "assocEgressACLTemplateId=" + assocEgressACLTemplateId + ", assocIngressACLTemplateId=" + assocIngressACLTemplateId + ", associatedDomainID=" + associatedDomainID + ", associatedDomainType=" + associatedDomainType + ", associatedNetworkObjectID=" + associatedNetworkObjectID + ", associatedNetworkObjectType=" + associatedNetworkObjectType + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}