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
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "esilmpolicy", resourceName = "esilmpolicies")
public class EsIlmPolicy extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EEsIlmPolicyType { CUSTOM, DEFAULT };

   
   @JsonProperty(value = "coldPhaseEnabled")
   
   protected Boolean coldPhaseEnabled;
   
   @JsonProperty(value = "coldTimer")
   
   protected Long coldTimer;
   
   @JsonProperty(value = "deletePhaseEnabled")
   
   protected Boolean deletePhaseEnabled;
   
   @JsonProperty(value = "deleteTimer")
   
   protected Long deleteTimer;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "esIlmPolicyType")
   
   protected EEsIlmPolicyType esIlmPolicyType;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "forceMergeEnabled")
   
   protected Boolean forceMergeEnabled;
   
   @JsonProperty(value = "forceMergeMaxNumSegments")
   
   protected Long forceMergeMaxNumSegments;
   
   @JsonProperty(value = "indexFreeze")
   
   protected Boolean indexFreeze;
   
   @JsonProperty(value = "indexReadOnly")
   
   protected Boolean indexReadOnly;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "rolloverMaxAge")
   
   protected Long rolloverMaxAge;
   
   @JsonProperty(value = "rolloverMaxDocs")
   
   protected Long rolloverMaxDocs;
   
   @JsonProperty(value = "rolloverMaxSize")
   
   protected Long rolloverMaxSize;
   
   @JsonProperty(value = "warmPhaseEnabled")
   
   protected Boolean warmPhaseEnabled;
   
   @JsonProperty(value = "warmTimer")
   
   protected Long warmTimer;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public EsIlmPolicy() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getColdPhaseEnabled() {
      return coldPhaseEnabled;
   }

   @JsonIgnore
   public void setColdPhaseEnabled(Boolean value) { 
      this.coldPhaseEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getColdTimer() {
      return coldTimer;
   }

   @JsonIgnore
   public void setColdTimer(Long value) { 
      this.coldTimer = value;
   }
   
   
   @JsonIgnore
   public Boolean getDeletePhaseEnabled() {
      return deletePhaseEnabled;
   }

   @JsonIgnore
   public void setDeletePhaseEnabled(Boolean value) { 
      this.deletePhaseEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getDeleteTimer() {
      return deleteTimer;
   }

   @JsonIgnore
   public void setDeleteTimer(Long value) { 
      this.deleteTimer = value;
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
   public EEsIlmPolicyType getEsIlmPolicyType() {
      return esIlmPolicyType;
   }

   @JsonIgnore
   public void setEsIlmPolicyType(EEsIlmPolicyType value) { 
      this.esIlmPolicyType = value;
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
   public Boolean getForceMergeEnabled() {
      return forceMergeEnabled;
   }

   @JsonIgnore
   public void setForceMergeEnabled(Boolean value) { 
      this.forceMergeEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getForceMergeMaxNumSegments() {
      return forceMergeMaxNumSegments;
   }

   @JsonIgnore
   public void setForceMergeMaxNumSegments(Long value) { 
      this.forceMergeMaxNumSegments = value;
   }
   
   
   @JsonIgnore
   public Boolean getIndexFreeze() {
      return indexFreeze;
   }

   @JsonIgnore
   public void setIndexFreeze(Boolean value) { 
      this.indexFreeze = value;
   }
   
   
   @JsonIgnore
   public Boolean getIndexReadOnly() {
      return indexReadOnly;
   }

   @JsonIgnore
   public void setIndexReadOnly(Boolean value) { 
      this.indexReadOnly = value;
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
   public Long getRolloverMaxAge() {
      return rolloverMaxAge;
   }

   @JsonIgnore
   public void setRolloverMaxAge(Long value) { 
      this.rolloverMaxAge = value;
   }
   
   
   @JsonIgnore
   public Long getRolloverMaxDocs() {
      return rolloverMaxDocs;
   }

   @JsonIgnore
   public void setRolloverMaxDocs(Long value) { 
      this.rolloverMaxDocs = value;
   }
   
   
   @JsonIgnore
   public Long getRolloverMaxSize() {
      return rolloverMaxSize;
   }

   @JsonIgnore
   public void setRolloverMaxSize(Long value) { 
      this.rolloverMaxSize = value;
   }
   
   
   @JsonIgnore
   public Boolean getWarmPhaseEnabled() {
      return warmPhaseEnabled;
   }

   @JsonIgnore
   public void setWarmPhaseEnabled(Boolean value) { 
      this.warmPhaseEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getWarmTimer() {
      return warmTimer;
   }

   @JsonIgnore
   public void setWarmTimer(Long value) { 
      this.warmTimer = value;
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
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   

   public String toString() {
      return "EsIlmPolicy [" + "coldPhaseEnabled=" + coldPhaseEnabled + ", coldTimer=" + coldTimer + ", deletePhaseEnabled=" + deletePhaseEnabled + ", deleteTimer=" + deleteTimer + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", esIlmPolicyType=" + esIlmPolicyType + ", externalID=" + externalID + ", forceMergeEnabled=" + forceMergeEnabled + ", forceMergeMaxNumSegments=" + forceMergeMaxNumSegments + ", indexFreeze=" + indexFreeze + ", indexReadOnly=" + indexReadOnly + ", name=" + name + ", rolloverMaxAge=" + rolloverMaxAge + ", rolloverMaxDocs=" + rolloverMaxDocs + ", rolloverMaxSize=" + rolloverMaxSize + ", warmPhaseEnabled=" + warmPhaseEnabled + ", warmTimer=" + warmTimer + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}