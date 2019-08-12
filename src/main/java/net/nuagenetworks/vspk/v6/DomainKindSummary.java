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
@RestEntity(restName = "domainkindsummary", resourceName = "domainkindsummaries")
public class DomainKindSummary extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "criticalAlarmsCount")
   
   protected Long criticalAlarmsCount;
   
   @JsonProperty(value = "domainKindDescription")
   
   protected String domainKindDescription;
   
   @JsonProperty(value = "domainKindName")
   
   protected String domainKindName;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gatewayCount")
   
   protected Long gatewayCount;
   
   @JsonProperty(value = "infoAlarmsCount")
   
   protected Long infoAlarmsCount;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "majorAlarmsCount")
   
   protected Long majorAlarmsCount;
   
   @JsonProperty(value = "meshGroupCount")
   
   protected Long meshGroupCount;
   
   @JsonProperty(value = "minorAlarmsCount")
   
   protected Long minorAlarmsCount;
   
   @JsonProperty(value = "nsgCount")
   
   protected Long nsgCount;
   
   @JsonProperty(value = "subNetworkCount")
   
   protected Long subNetworkCount;
   
   @JsonProperty(value = "trafficVolume")
   
   protected Long trafficVolume;
   
   @JsonProperty(value = "zoneCount")
   
   protected Long zoneCount;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public DomainKindSummary() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Long getCriticalAlarmsCount() {
      return criticalAlarmsCount;
   }

   @JsonIgnore
   public void setCriticalAlarmsCount(Long value) { 
      this.criticalAlarmsCount = value;
   }
   
   
   @JsonIgnore
   public String getDomainKindDescription() {
      return domainKindDescription;
   }

   @JsonIgnore
   public void setDomainKindDescription(String value) { 
      this.domainKindDescription = value;
   }
   
   
   @JsonIgnore
   public String getDomainKindName() {
      return domainKindName;
   }

   @JsonIgnore
   public void setDomainKindName(String value) { 
      this.domainKindName = value;
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
   public Long getGatewayCount() {
      return gatewayCount;
   }

   @JsonIgnore
   public void setGatewayCount(Long value) { 
      this.gatewayCount = value;
   }
   
   
   @JsonIgnore
   public Long getInfoAlarmsCount() {
      return infoAlarmsCount;
   }

   @JsonIgnore
   public void setInfoAlarmsCount(Long value) { 
      this.infoAlarmsCount = value;
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
   public Long getMajorAlarmsCount() {
      return majorAlarmsCount;
   }

   @JsonIgnore
   public void setMajorAlarmsCount(Long value) { 
      this.majorAlarmsCount = value;
   }
   
   
   @JsonIgnore
   public Long getMeshGroupCount() {
      return meshGroupCount;
   }

   @JsonIgnore
   public void setMeshGroupCount(Long value) { 
      this.meshGroupCount = value;
   }
   
   
   @JsonIgnore
   public Long getMinorAlarmsCount() {
      return minorAlarmsCount;
   }

   @JsonIgnore
   public void setMinorAlarmsCount(Long value) { 
      this.minorAlarmsCount = value;
   }
   
   
   @JsonIgnore
   public Long getNsgCount() {
      return nsgCount;
   }

   @JsonIgnore
   public void setNsgCount(Long value) { 
      this.nsgCount = value;
   }
   
   
   @JsonIgnore
   public Long getSubNetworkCount() {
      return subNetworkCount;
   }

   @JsonIgnore
   public void setSubNetworkCount(Long value) { 
      this.subNetworkCount = value;
   }
   
   
   @JsonIgnore
   public Long getTrafficVolume() {
      return trafficVolume;
   }

   @JsonIgnore
   public void setTrafficVolume(Long value) { 
      this.trafficVolume = value;
   }
   
   
   @JsonIgnore
   public Long getZoneCount() {
      return zoneCount;
   }

   @JsonIgnore
   public void setZoneCount(Long value) { 
      this.zoneCount = value;
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
      return "DomainKindSummary [" + "criticalAlarmsCount=" + criticalAlarmsCount + ", domainKindDescription=" + domainKindDescription + ", domainKindName=" + domainKindName + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayCount=" + gatewayCount + ", infoAlarmsCount=" + infoAlarmsCount + ", lastUpdatedBy=" + lastUpdatedBy + ", majorAlarmsCount=" + majorAlarmsCount + ", meshGroupCount=" + meshGroupCount + ", minorAlarmsCount=" + minorAlarmsCount + ", nsgCount=" + nsgCount + ", subNetworkCount=" + subNetworkCount + ", trafficVolume=" + trafficVolume + ", zoneCount=" + zoneCount + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}