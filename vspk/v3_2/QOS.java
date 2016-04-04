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
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.VMsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QOS extends RestObject {

   public final static String REST_NAME = "qos";
   public final static String RESOURCE_NAME = "qos";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum ServiceClass { A, B, C, D, E, F, G, H, NONE };

   
   @JsonProperty(value = "BUMCommittedBurstSize")
   protected String BUMCommittedBurstSize;
   
   @JsonProperty(value = "BUMCommittedInformationRate")
   protected String BUMCommittedInformationRate;
   
   @JsonProperty(value = "BUMPeakBurstSize")
   protected String BUMPeakBurstSize;
   
   @JsonProperty(value = "BUMPeakInformationRate")
   protected String BUMPeakInformationRate;
   
   @JsonProperty(value = "BUMRateLimitingActive")
   protected boolean BUMRateLimitingActive;
   
   @JsonProperty(value = "FIPCommittedBurstSize")
   protected String FIPCommittedBurstSize;
   
   @JsonProperty(value = "FIPCommittedInformationRate")
   protected String FIPCommittedInformationRate;
   
   @JsonProperty(value = "FIPPeakBurstSize")
   protected String FIPPeakBurstSize;
   
   @JsonProperty(value = "FIPPeakInformationRate")
   protected String FIPPeakInformationRate;
   
   @JsonProperty(value = "FIPRateLimitingActive")
   protected boolean FIPRateLimitingActive;
   
   @JsonProperty(value = "active")
   protected boolean active;
   
   @JsonProperty(value = "assocQosId")
   protected String assocQosId;
   
   @JsonProperty(value = "associatedDSCPForwardingClassTableID")
   protected String associatedDSCPForwardingClassTableID;
   
   @JsonProperty(value = "associatedDSCPForwardingClassTableName")
   protected String associatedDSCPForwardingClassTableName;
   
   @JsonProperty(value = "burst")
   protected String burst;
   
   @JsonProperty(value = "committedBurstSize")
   protected String committedBurstSize;
   
   @JsonProperty(value = "committedInformationRate")
   protected String committedInformationRate;
   
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
   
   @JsonProperty(value = "peak")
   protected String peak;
   
   @JsonProperty(value = "rateLimitingActive")
   protected boolean rateLimitingActive;
   
   @JsonProperty(value = "rewriteForwardingClass")
   protected boolean rewriteForwardingClass;
   
   @JsonProperty(value = "serviceClass")
   protected ServiceClass serviceClass;
   
   @JsonProperty(value = "trustedForwardingClass")
   protected boolean trustedForwardingClass;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   

   public QOS() {
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
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
   public boolean getBUMRateLimitingActive() {
      return BUMRateLimitingActive;
   }

   public void setBUMRateLimitingActive(boolean value) { 
      this.BUMRateLimitingActive = value;
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
   public boolean getFIPRateLimitingActive() {
      return FIPRateLimitingActive;
   }

   public void setFIPRateLimitingActive(boolean value) { 
      this.FIPRateLimitingActive = value;
   }
   public boolean getActive() {
      return active;
   }

   public void setActive(boolean value) { 
      this.active = value;
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
   public String getPeak() {
      return peak;
   }

   public void setPeak(String value) { 
      this.peak = value;
   }
   public boolean getRateLimitingActive() {
      return rateLimitingActive;
   }

   public void setRateLimitingActive(boolean value) { 
      this.rateLimitingActive = value;
   }
   public boolean getRewriteForwardingClass() {
      return rewriteForwardingClass;
   }

   public void setRewriteForwardingClass(boolean value) { 
      this.rewriteForwardingClass = value;
   }
   public ServiceClass getServiceClass() {
      return serviceClass;
   }

   public void setServiceClass(ServiceClass value) { 
      this.serviceClass = value;
   }
   public boolean getTrustedForwardingClass() {
      return trustedForwardingClass;
   }

   public void setTrustedForwardingClass(boolean value) { 
      this.trustedForwardingClass = value;
   }
   

   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public VMsFetcher getVMs() {
      return vMs;
   }
   

   public String toString() {
      return "QOS [" + "BUMCommittedBurstSize=" + BUMCommittedBurstSize + ", BUMCommittedInformationRate=" + BUMCommittedInformationRate + ", BUMPeakBurstSize=" + BUMPeakBurstSize + ", BUMPeakInformationRate=" + BUMPeakInformationRate + ", BUMRateLimitingActive=" + BUMRateLimitingActive + ", FIPCommittedBurstSize=" + FIPCommittedBurstSize + ", FIPCommittedInformationRate=" + FIPCommittedInformationRate + ", FIPPeakBurstSize=" + FIPPeakBurstSize + ", FIPPeakInformationRate=" + FIPPeakInformationRate + ", FIPRateLimitingActive=" + FIPRateLimitingActive + ", active=" + active + ", assocQosId=" + assocQosId + ", associatedDSCPForwardingClassTableID=" + associatedDSCPForwardingClassTableID + ", associatedDSCPForwardingClassTableName=" + associatedDSCPForwardingClassTableName + ", burst=" + burst + ", committedBurstSize=" + committedBurstSize + ", committedInformationRate=" + committedInformationRate + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", peak=" + peak + ", rateLimitingActive=" + rateLimitingActive + ", rewriteForwardingClass=" + rewriteForwardingClass + ", serviceClass=" + serviceClass + ", trustedForwardingClass=" + trustedForwardingClass + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}