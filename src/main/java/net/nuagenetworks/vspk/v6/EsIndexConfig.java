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
@RestEntity(restName = "esindexconfig", resourceName = "esindexconfigs")
public class EsIndexConfig extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EConfigStatus { FAILED, IN_PROGRESS, SUCCESS };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EIlmStatus { FAILED, SUCCESS };
   public enum EIndexType { NUAGE_ACL, NUAGE_ADDRESSMAP, NUAGE_DPI_FLOWSTATS, NUAGE_DPI_PROBESTATS, NUAGE_DPI_SLASTATS, NUAGE_EVENT, NUAGE_FEC, NUAGE_FLOW, NUAGE_GW_SEL_STATS, NUAGE_IKE_PROBESTATS, NUAGE_IKE_PROBE_STATUS, NUAGE_IKE_STATS, NUAGE_LTE, NUAGE_NATT, NUAGE_OAM, NUAGE_SYSMON, NUAGE_VLAN, NUAGE_VNF, NUAGE_VPORT, NUAGE_VPORT_QOS, NUAGE_WIFI };

   
   @JsonProperty(value = "associatedEsIlmPolicyId")
   
   protected String associatedEsIlmPolicyId;
   
   @JsonProperty(value = "configStatus")
   
   protected EConfigStatus configStatus;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "ilmStatus")
   
   protected EIlmStatus ilmStatus;
   
   @JsonProperty(value = "indexPattern")
   
   protected String indexPattern;
   
   @JsonProperty(value = "indexType")
   
   protected EIndexType indexType;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "numShards")
   
   protected Long numShards;
   
   @JsonProperty(value = "policyName")
   
   protected String policyName;
   
   @JsonProperty(value = "rolloverAlias")
   
   protected String rolloverAlias;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public EsIndexConfig() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssociatedEsIlmPolicyId() {
      return associatedEsIlmPolicyId;
   }

   @JsonIgnore
   public void setAssociatedEsIlmPolicyId(String value) { 
      this.associatedEsIlmPolicyId = value;
   }
   
   
   @JsonIgnore
   public EConfigStatus getConfigStatus() {
      return configStatus;
   }

   @JsonIgnore
   public void setConfigStatus(EConfigStatus value) { 
      this.configStatus = value;
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
   public EIlmStatus getIlmStatus() {
      return ilmStatus;
   }

   @JsonIgnore
   public void setIlmStatus(EIlmStatus value) { 
      this.ilmStatus = value;
   }
   
   
   @JsonIgnore
   public String getIndexPattern() {
      return indexPattern;
   }

   @JsonIgnore
   public void setIndexPattern(String value) { 
      this.indexPattern = value;
   }
   
   
   @JsonIgnore
   public EIndexType getIndexType() {
      return indexType;
   }

   @JsonIgnore
   public void setIndexType(EIndexType value) { 
      this.indexType = value;
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
   public Long getNumShards() {
      return numShards;
   }

   @JsonIgnore
   public void setNumShards(Long value) { 
      this.numShards = value;
   }
   
   
   @JsonIgnore
   public String getPolicyName() {
      return policyName;
   }

   @JsonIgnore
   public void setPolicyName(String value) { 
      this.policyName = value;
   }
   
   
   @JsonIgnore
   public String getRolloverAlias() {
      return rolloverAlias;
   }

   @JsonIgnore
   public void setRolloverAlias(String value) { 
      this.rolloverAlias = value;
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
      return "EsIndexConfig [" + "associatedEsIlmPolicyId=" + associatedEsIlmPolicyId + ", configStatus=" + configStatus + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", ilmStatus=" + ilmStatus + ", indexPattern=" + indexPattern + ", indexType=" + indexType + ", name=" + name + ", numShards=" + numShards + ", policyName=" + policyName + ", rolloverAlias=" + rolloverAlias + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}