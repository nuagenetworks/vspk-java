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
@RestEntity(restName = "deploymentfailure", resourceName = "deploymentfailures")
public class DeploymentFailure extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EEventType { CREATE, DELETE, UPDATE };

   
   @JsonProperty(value = "affectedEntityID")
   
   protected String affectedEntityID;
   
   @JsonProperty(value = "affectedEntityType")
   
   protected String affectedEntityType;
   
   @JsonProperty(value = "assocEntityId")
   
   protected String assocEntityId;
   
   @JsonProperty(value = "assocEntityType")
   
   protected String assocEntityType;
   
   @JsonProperty(value = "associatedDomainID")
   
   protected String associatedDomainID;
   
   @JsonProperty(value = "associatedDomainType")
   
   protected String associatedDomainType;
   
   @JsonProperty(value = "associatedNetworkEntityID")
   
   protected String associatedNetworkEntityID;
   
   @JsonProperty(value = "associatedNetworkEntityType")
   
   protected String associatedNetworkEntityType;
   
   @JsonProperty(value = "diffMap")
   
   protected String diffMap;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "errorCondition")
   
   protected Long errorCondition;
   
   @JsonProperty(value = "eventType")
   
   protected EEventType eventType;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastFailureReason")
   
   protected String lastFailureReason;
   
   @JsonProperty(value = "lastKnownError")
   
   protected String lastKnownError;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "numberOfOccurences")
   
   protected Long numberOfOccurences;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public DeploymentFailure() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAffectedEntityID() {
      return affectedEntityID;
   }

   @JsonIgnore
   public void setAffectedEntityID(String value) { 
      this.affectedEntityID = value;
   }
   
   
   @JsonIgnore
   public String getAffectedEntityType() {
      return affectedEntityType;
   }

   @JsonIgnore
   public void setAffectedEntityType(String value) { 
      this.affectedEntityType = value;
   }
   
   
   @JsonIgnore
   public String getAssocEntityId() {
      return assocEntityId;
   }

   @JsonIgnore
   public void setAssocEntityId(String value) { 
      this.assocEntityId = value;
   }
   
   
   @JsonIgnore
   public String getAssocEntityType() {
      return assocEntityType;
   }

   @JsonIgnore
   public void setAssocEntityType(String value) { 
      this.assocEntityType = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDomainID() {
      return associatedDomainID;
   }

   @JsonIgnore
   public void setAssociatedDomainID(String value) { 
      this.associatedDomainID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDomainType() {
      return associatedDomainType;
   }

   @JsonIgnore
   public void setAssociatedDomainType(String value) { 
      this.associatedDomainType = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNetworkEntityID() {
      return associatedNetworkEntityID;
   }

   @JsonIgnore
   public void setAssociatedNetworkEntityID(String value) { 
      this.associatedNetworkEntityID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNetworkEntityType() {
      return associatedNetworkEntityType;
   }

   @JsonIgnore
   public void setAssociatedNetworkEntityType(String value) { 
      this.associatedNetworkEntityType = value;
   }
   
   
   @JsonIgnore
   public String getDiffMap() {
      return diffMap;
   }

   @JsonIgnore
   public void setDiffMap(String value) { 
      this.diffMap = value;
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
   public Long getErrorCondition() {
      return errorCondition;
   }

   @JsonIgnore
   public void setErrorCondition(Long value) { 
      this.errorCondition = value;
   }
   
   
   @JsonIgnore
   public EEventType getEventType() {
      return eventType;
   }

   @JsonIgnore
   public void setEventType(EEventType value) { 
      this.eventType = value;
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
   public String getLastFailureReason() {
      return lastFailureReason;
   }

   @JsonIgnore
   public void setLastFailureReason(String value) { 
      this.lastFailureReason = value;
   }
   
   
   @JsonIgnore
   public String getLastKnownError() {
      return lastKnownError;
   }

   @JsonIgnore
   public void setLastKnownError(String value) { 
      this.lastKnownError = value;
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
   public Long getNumberOfOccurences() {
      return numberOfOccurences;
   }

   @JsonIgnore
   public void setNumberOfOccurences(Long value) { 
      this.numberOfOccurences = value;
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
      return "DeploymentFailure [" + "affectedEntityID=" + affectedEntityID + ", affectedEntityType=" + affectedEntityType + ", assocEntityId=" + assocEntityId + ", assocEntityType=" + assocEntityType + ", associatedDomainID=" + associatedDomainID + ", associatedDomainType=" + associatedDomainType + ", associatedNetworkEntityID=" + associatedNetworkEntityID + ", associatedNetworkEntityType=" + associatedNetworkEntityType + ", diffMap=" + diffMap + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", errorCondition=" + errorCondition + ", eventType=" + eventType + ", externalID=" + externalID + ", lastFailureReason=" + lastFailureReason + ", lastKnownError=" + lastKnownError + ", lastUpdatedBy=" + lastUpdatedBy + ", numberOfOccurences=" + numberOfOccurences + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}