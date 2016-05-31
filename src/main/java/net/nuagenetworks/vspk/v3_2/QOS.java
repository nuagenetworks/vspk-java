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

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "qos", resourceName = "qos")
public class QOS extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum ServiceClass { A, B, C, D, E, F, G, H, NONE };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "FIPCommittedBurstSize")
   protected String FIPCommittedBurstSize;
   
   @JsonProperty(value = "FIPCommittedInformationRate")
   protected String FIPCommittedInformationRate;
   
   @JsonProperty(value = "FIPPeakBurstSize")
   protected String FIPPeakBurstSize;
   
   @JsonProperty(value = "FIPPeakInformationRate")
   protected String FIPPeakInformationRate;
   
   @JsonProperty(value = "FIPRateLimitingActive")
   protected Boolean FIPRateLimitingActive;
   
   @JsonProperty(value = "BUMCommittedBurstSize")
   protected String BUMCommittedBurstSize;
   
   @JsonProperty(value = "BUMCommittedInformationRate")
   protected String BUMCommittedInformationRate;
   
   @JsonProperty(value = "BUMPeakBurstSize")
   protected String BUMPeakBurstSize;
   
   @JsonProperty(value = "BUMPeakInformationRate")
   protected String BUMPeakInformationRate;
   
   @JsonProperty(value = "BUMRateLimitingActive")
   protected Boolean BUMRateLimitingActive;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "rateLimitingActive")
   protected Boolean rateLimitingActive;
   
   @JsonProperty(value = "active")
   protected Boolean active;
   
   @JsonProperty(value = "peak")
   protected String peak;
   
   @JsonProperty(value = "serviceClass")
   protected ServiceClass serviceClass;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "rewriteForwardingClass")
   protected Boolean rewriteForwardingClass;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "committedBurstSize")
   protected String committedBurstSize;
   
   @JsonProperty(value = "committedInformationRate")
   protected String committedInformationRate;
   
   @JsonProperty(value = "trustedForwardingClass")
   protected Boolean trustedForwardingClass;
   
   @JsonProperty(value = "assocQosId")
   protected String assocQosId;
   
   @JsonProperty(value = "associatedDSCPForwardingClassTableID")
   protected String associatedDSCPForwardingClassTableID;
   
   @JsonProperty(value = "associatedDSCPForwardingClassTableName")
   protected String associatedDSCPForwardingClassTableName;
   
   @JsonProperty(value = "burst")
   protected String burst;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public QOS() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public String getFIPCommittedBurstSize() {
      return FIPCommittedBurstSize;
   }

   public void setFIPCommittedBurstSize(String value) { 
      this.FIPCommittedBurstSize = value;
   }
   public String getFIPCommittedInformationRate() {
      return FIPCommittedInformationRate;
   }

   public void setFIPCommittedInformationRate(String value) { 
      this.FIPCommittedInformationRate = value;
   }
   public String getFIPPeakBurstSize() {
      return FIPPeakBurstSize;
   }

   public void setFIPPeakBurstSize(String value) { 
      this.FIPPeakBurstSize = value;
   }
   public String getFIPPeakInformationRate() {
      return FIPPeakInformationRate;
   }

   public void setFIPPeakInformationRate(String value) { 
      this.FIPPeakInformationRate = value;
   }
   public Boolean getFIPRateLimitingActive() {
      return FIPRateLimitingActive;
   }

   public void setFIPRateLimitingActive(Boolean value) { 
      this.FIPRateLimitingActive = value;
   }
   public String getBUMCommittedBurstSize() {
      return BUMCommittedBurstSize;
   }

   public void setBUMCommittedBurstSize(String value) { 
      this.BUMCommittedBurstSize = value;
   }
   public String getBUMCommittedInformationRate() {
      return BUMCommittedInformationRate;
   }

   public void setBUMCommittedInformationRate(String value) { 
      this.BUMCommittedInformationRate = value;
   }
   public String getBUMPeakBurstSize() {
      return BUMPeakBurstSize;
   }

   public void setBUMPeakBurstSize(String value) { 
      this.BUMPeakBurstSize = value;
   }
   public String getBUMPeakInformationRate() {
      return BUMPeakInformationRate;
   }

   public void setBUMPeakInformationRate(String value) { 
      this.BUMPeakInformationRate = value;
   }
   public Boolean getBUMRateLimitingActive() {
      return BUMRateLimitingActive;
   }

   public void setBUMRateLimitingActive(Boolean value) { 
      this.BUMRateLimitingActive = value;
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
   public Boolean getRateLimitingActive() {
      return rateLimitingActive;
   }

   public void setRateLimitingActive(Boolean value) { 
      this.rateLimitingActive = value;
   }
   public Boolean getActive() {
      return active;
   }

   public void setActive(Boolean value) { 
      this.active = value;
   }
   public String getPeak() {
      return peak;
   }

   public void setPeak(String value) { 
      this.peak = value;
   }
   public ServiceClass getServiceClass() {
      return serviceClass;
   }

   public void setServiceClass(ServiceClass value) { 
      this.serviceClass = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public Boolean getRewriteForwardingClass() {
      return rewriteForwardingClass;
   }

   public void setRewriteForwardingClass(Boolean value) { 
      this.rewriteForwardingClass = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getCommittedBurstSize() {
      return committedBurstSize;
   }

   public void setCommittedBurstSize(String value) { 
      this.committedBurstSize = value;
   }
   public String getCommittedInformationRate() {
      return committedInformationRate;
   }

   public void setCommittedInformationRate(String value) { 
      this.committedInformationRate = value;
   }
   public Boolean getTrustedForwardingClass() {
      return trustedForwardingClass;
   }

   public void setTrustedForwardingClass(Boolean value) { 
      this.trustedForwardingClass = value;
   }
   public String getAssocQosId() {
      return assocQosId;
   }

   public void setAssocQosId(String value) { 
      this.assocQosId = value;
   }
   public String getAssociatedDSCPForwardingClassTableID() {
      return associatedDSCPForwardingClassTableID;
   }

   public void setAssociatedDSCPForwardingClassTableID(String value) { 
      this.associatedDSCPForwardingClassTableID = value;
   }
   public String getAssociatedDSCPForwardingClassTableName() {
      return associatedDSCPForwardingClassTableName;
   }

   public void setAssociatedDSCPForwardingClassTableName(String value) { 
      this.associatedDSCPForwardingClassTableName = value;
   }
   public String getBurst() {
      return burst;
   }

   public void setBurst(String value) { 
      this.burst = value;
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
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "QOS [" + "FIPCommittedBurstSize=" + FIPCommittedBurstSize + ", FIPCommittedInformationRate=" + FIPCommittedInformationRate + ", FIPPeakBurstSize=" + FIPPeakBurstSize + ", FIPPeakInformationRate=" + FIPPeakInformationRate + ", FIPRateLimitingActive=" + FIPRateLimitingActive + ", BUMCommittedBurstSize=" + BUMCommittedBurstSize + ", BUMCommittedInformationRate=" + BUMCommittedInformationRate + ", BUMPeakBurstSize=" + BUMPeakBurstSize + ", BUMPeakInformationRate=" + BUMPeakInformationRate + ", BUMRateLimitingActive=" + BUMRateLimitingActive + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", rateLimitingActive=" + rateLimitingActive + ", active=" + active + ", peak=" + peak + ", serviceClass=" + serviceClass + ", description=" + description + ", rewriteForwardingClass=" + rewriteForwardingClass + ", entityScope=" + entityScope + ", committedBurstSize=" + committedBurstSize + ", committedInformationRate=" + committedInformationRate + ", trustedForwardingClass=" + trustedForwardingClass + ", assocQosId=" + assocQosId + ", associatedDSCPForwardingClassTableID=" + associatedDSCPForwardingClassTableID + ", associatedDSCPForwardingClassTableName=" + associatedDSCPForwardingClassTableName + ", burst=" + burst + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}