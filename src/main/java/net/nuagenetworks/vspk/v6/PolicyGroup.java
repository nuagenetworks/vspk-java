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


import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyGroupCategoriesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "policygroup", resourceName = "policygroups")
public class PolicyGroup extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EEntityState { MARKED_FOR_DELETION, UNDER_CONSTRUCTION };
   public enum EType { HARDWARE, SOFTWARE };

   
   @JsonProperty(value = "EVPNCommunityTag")
   
   protected String EVPNCommunityTag;
   
   @JsonProperty(value = "assocPolicyGroupCategoryID")
   
   protected String assocPolicyGroupCategoryID;
   
   @JsonProperty(value = "assocPolicyGroupCategoryName")
   
   protected String assocPolicyGroupCategoryName;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "entityState")
   
   protected EEntityState entityState;
   
   @JsonProperty(value = "external")
   
   protected Boolean external;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "policyGroupID")
   
   protected Long policyGroupID;
   
   @JsonProperty(value = "templateID")
   
   protected String templateID;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PolicyGroupCategoriesFetcher policyGroupCategories;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   

   public PolicyGroup() {
      type = EType.SOFTWARE;
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      policyGroupCategories = new PolicyGroupCategoriesFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getEVPNCommunityTag() {
      return EVPNCommunityTag;
   }

   @JsonIgnore
   public void setEVPNCommunityTag(String value) { 
      this.EVPNCommunityTag = value;
   }
   
   
   @JsonIgnore
   public String getAssocPolicyGroupCategoryID() {
      return assocPolicyGroupCategoryID;
   }

   @JsonIgnore
   public void setAssocPolicyGroupCategoryID(String value) { 
      this.assocPolicyGroupCategoryID = value;
   }
   
   
   @JsonIgnore
   public String getAssocPolicyGroupCategoryName() {
      return assocPolicyGroupCategoryName;
   }

   @JsonIgnore
   public void setAssocPolicyGroupCategoryName(String value) { 
      this.assocPolicyGroupCategoryName = value;
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
   public EEntityState getEntityState() {
      return entityState;
   }

   @JsonIgnore
   public void setEntityState(EEntityState value) { 
      this.entityState = value;
   }
   
   
   @JsonIgnore
   public Boolean getExternal() {
      return external;
   }

   @JsonIgnore
   public void setExternal(Boolean value) { 
      this.external = value;
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
   public Long getPolicyGroupID() {
      return policyGroupID;
   }

   @JsonIgnore
   public void setPolicyGroupID(Long value) { 
      this.policyGroupID = value;
   }
   
   
   @JsonIgnore
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   
   
   @JsonIgnore
   public EType getType() {
      return type;
   }

   @JsonIgnore
   public void setType(EType value) { 
      this.type = value;
   }
   

   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PolicyGroupCategoriesFetcher getPolicyGroupCategories() {
      return policyGroupCategories;
   }
   
   @JsonIgnore
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "PolicyGroup [" + "EVPNCommunityTag=" + EVPNCommunityTag + ", assocPolicyGroupCategoryID=" + assocPolicyGroupCategoryID + ", assocPolicyGroupCategoryName=" + assocPolicyGroupCategoryName + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", entityState=" + entityState + ", external=" + external + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", policyGroupID=" + policyGroupID + ", templateID=" + templateID + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}