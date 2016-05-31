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
import net.nuagenetworks.vspk.v4_0.fetchers.TiersFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.FlowsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "application", resourceName = "applications")
public class App extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum AssociatedDomainType { DOMAIN, L2DOMAIN };
   public enum AssociatedNetworkObjectType { DOMAIN, ENTERPRISE };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
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
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private TiersFetcher tiers;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private FlowsFetcher flows;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public App() {
      
      metadatas = new MetadatasFetcher(this);
      
      tiers = new TiersFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      flows = new FlowsFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public TiersFetcher getTiers() {
      return tiers;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public FlowsFetcher getFlows() {
      return flows;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "App [" + "name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", description=" + description + ", entityScope=" + entityScope + ", assocEgressACLTemplateId=" + assocEgressACLTemplateId + ", assocIngressACLTemplateId=" + assocIngressACLTemplateId + ", associatedDomainID=" + associatedDomainID + ", associatedDomainType=" + associatedDomainType + ", associatedNetworkObjectID=" + associatedNetworkObjectID + ", associatedNetworkObjectType=" + associatedNetworkObjectType + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}