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
import net.nuagenetworks.vspk.v6.fetchers.OSPFInterfacesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ospfarea", resourceName = "ospfareas")
public class OSPFArea extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAreaType { NORMAL, NSSA, STUB };
   public enum EDefaultOriginateOption { NONE, TYPE3, TYPE7 };
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "aggregateAreaRange")
   
   protected java.util.List<String> aggregateAreaRange;
   
   @JsonProperty(value = "aggregateAreaRangeNSSA")
   
   protected java.util.List<String> aggregateAreaRangeNSSA;
   
   @JsonProperty(value = "areaID")
   
   protected Long areaID;
   
   @JsonProperty(value = "areaType")
   
   protected EAreaType areaType;
   
   @JsonProperty(value = "defaultMetric")
   
   protected Long defaultMetric;
   
   @JsonProperty(value = "defaultOriginateOption")
   
   protected EDefaultOriginateOption defaultOriginateOption;
   
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
   
   @JsonProperty(value = "redistributeExternalEnabled")
   
   protected Boolean redistributeExternalEnabled;
   
   @JsonProperty(value = "summariesEnabled")
   
   protected Boolean summariesEnabled;
   
   @JsonProperty(value = "suppressAreaRange")
   
   protected java.util.List<String> suppressAreaRange;
   
   @JsonProperty(value = "suppressAreaRangeNSSA")
   
   protected java.util.List<String> suppressAreaRangeNSSA;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private OSPFInterfacesFetcher oSPFInterfaces;
   

   public OSPFArea() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      oSPFInterfaces = new OSPFInterfacesFetcher(this);
      
   }

   
   
   @JsonIgnore
   public java.util.List<String> getAggregateAreaRange() {
      return aggregateAreaRange;
   }

   @JsonIgnore
   public void setAggregateAreaRange(java.util.List<String> value) { 
      this.aggregateAreaRange = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getAggregateAreaRangeNSSA() {
      return aggregateAreaRangeNSSA;
   }

   @JsonIgnore
   public void setAggregateAreaRangeNSSA(java.util.List<String> value) { 
      this.aggregateAreaRangeNSSA = value;
   }
   
   
   @JsonIgnore
   public Long getAreaID() {
      return areaID;
   }

   @JsonIgnore
   public void setAreaID(Long value) { 
      this.areaID = value;
   }
   
   
   @JsonIgnore
   public EAreaType getAreaType() {
      return areaType;
   }

   @JsonIgnore
   public void setAreaType(EAreaType value) { 
      this.areaType = value;
   }
   
   
   @JsonIgnore
   public Long getDefaultMetric() {
      return defaultMetric;
   }

   @JsonIgnore
   public void setDefaultMetric(Long value) { 
      this.defaultMetric = value;
   }
   
   
   @JsonIgnore
   public EDefaultOriginateOption getDefaultOriginateOption() {
      return defaultOriginateOption;
   }

   @JsonIgnore
   public void setDefaultOriginateOption(EDefaultOriginateOption value) { 
      this.defaultOriginateOption = value;
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
   public Boolean getRedistributeExternalEnabled() {
      return redistributeExternalEnabled;
   }

   @JsonIgnore
   public void setRedistributeExternalEnabled(Boolean value) { 
      this.redistributeExternalEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getSummariesEnabled() {
      return summariesEnabled;
   }

   @JsonIgnore
   public void setSummariesEnabled(Boolean value) { 
      this.summariesEnabled = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getSuppressAreaRange() {
      return suppressAreaRange;
   }

   @JsonIgnore
   public void setSuppressAreaRange(java.util.List<String> value) { 
      this.suppressAreaRange = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getSuppressAreaRangeNSSA() {
      return suppressAreaRangeNSSA;
   }

   @JsonIgnore
   public void setSuppressAreaRangeNSSA(java.util.List<String> value) { 
      this.suppressAreaRangeNSSA = value;
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
   public OSPFInterfacesFetcher getOSPFInterfaces() {
      return oSPFInterfaces;
   }
   

   public String toString() {
      return "OSPFArea [" + "aggregateAreaRange=" + aggregateAreaRange + ", aggregateAreaRangeNSSA=" + aggregateAreaRangeNSSA + ", areaID=" + areaID + ", areaType=" + areaType + ", defaultMetric=" + defaultMetric + ", defaultOriginateOption=" + defaultOriginateOption + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", redistributeExternalEnabled=" + redistributeExternalEnabled + ", summariesEnabled=" + summariesEnabled + ", suppressAreaRange=" + suppressAreaRange + ", suppressAreaRangeNSSA=" + suppressAreaRangeNSSA + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}