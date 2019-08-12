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


import net.nuagenetworks.vspk.v6.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VMsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "qos", resourceName = "qos")
public class QOS extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EServiceClass { A, B, C, D, E, F, G, H, NONE };

   
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
   
   @JsonProperty(value = "EgressFIPCommittedBurstSize")
   
   protected String EgressFIPCommittedBurstSize;
   
   @JsonProperty(value = "EgressFIPCommittedInformationRate")
   
   protected String EgressFIPCommittedInformationRate;
   
   @JsonProperty(value = "EgressFIPPeakBurstSize")
   
   protected String EgressFIPPeakBurstSize;
   
   @JsonProperty(value = "EgressFIPPeakInformationRate")
   
   protected String EgressFIPPeakInformationRate;
   
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
   
   @JsonProperty(value = "active")
   
   protected Boolean active;
   
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
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "peak")
   
   protected String peak;
   
   @JsonProperty(value = "rateLimitingActive")
   
   protected Boolean rateLimitingActive;
   
   @JsonProperty(value = "rewriteForwardingClass")
   
   protected Boolean rewriteForwardingClass;
   
   @JsonProperty(value = "serviceClass")
   
   protected EServiceClass serviceClass;
   
   @JsonProperty(value = "trustedForwardingClass")
   
   protected Boolean trustedForwardingClass;
   

   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   

   public QOS() {
      
      containers = new ContainersFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getBUMCommittedBurstSize() {
      return BUMCommittedBurstSize;
   }

   @JsonIgnore
   public void setBUMCommittedBurstSize(String value) { 
      this.BUMCommittedBurstSize = value;
   }
   
   
   @JsonIgnore
   public String getBUMCommittedInformationRate() {
      return BUMCommittedInformationRate;
   }

   @JsonIgnore
   public void setBUMCommittedInformationRate(String value) { 
      this.BUMCommittedInformationRate = value;
   }
   
   
   @JsonIgnore
   public String getBUMPeakBurstSize() {
      return BUMPeakBurstSize;
   }

   @JsonIgnore
   public void setBUMPeakBurstSize(String value) { 
      this.BUMPeakBurstSize = value;
   }
   
   
   @JsonIgnore
   public String getBUMPeakInformationRate() {
      return BUMPeakInformationRate;
   }

   @JsonIgnore
   public void setBUMPeakInformationRate(String value) { 
      this.BUMPeakInformationRate = value;
   }
   
   
   @JsonIgnore
   public Boolean getBUMRateLimitingActive() {
      return BUMRateLimitingActive;
   }

   @JsonIgnore
   public void setBUMRateLimitingActive(Boolean value) { 
      this.BUMRateLimitingActive = value;
   }
   
   
   @JsonIgnore
   public String getEgressFIPCommittedBurstSize() {
      return EgressFIPCommittedBurstSize;
   }

   @JsonIgnore
   public void setEgressFIPCommittedBurstSize(String value) { 
      this.EgressFIPCommittedBurstSize = value;
   }
   
   
   @JsonIgnore
   public String getEgressFIPCommittedInformationRate() {
      return EgressFIPCommittedInformationRate;
   }

   @JsonIgnore
   public void setEgressFIPCommittedInformationRate(String value) { 
      this.EgressFIPCommittedInformationRate = value;
   }
   
   
   @JsonIgnore
   public String getEgressFIPPeakBurstSize() {
      return EgressFIPPeakBurstSize;
   }

   @JsonIgnore
   public void setEgressFIPPeakBurstSize(String value) { 
      this.EgressFIPPeakBurstSize = value;
   }
   
   
   @JsonIgnore
   public String getEgressFIPPeakInformationRate() {
      return EgressFIPPeakInformationRate;
   }

   @JsonIgnore
   public void setEgressFIPPeakInformationRate(String value) { 
      this.EgressFIPPeakInformationRate = value;
   }
   
   
   @JsonIgnore
   public String getFIPCommittedBurstSize() {
      return FIPCommittedBurstSize;
   }

   @JsonIgnore
   public void setFIPCommittedBurstSize(String value) { 
      this.FIPCommittedBurstSize = value;
   }
   
   
   @JsonIgnore
   public String getFIPCommittedInformationRate() {
      return FIPCommittedInformationRate;
   }

   @JsonIgnore
   public void setFIPCommittedInformationRate(String value) { 
      this.FIPCommittedInformationRate = value;
   }
   
   
   @JsonIgnore
   public String getFIPPeakBurstSize() {
      return FIPPeakBurstSize;
   }

   @JsonIgnore
   public void setFIPPeakBurstSize(String value) { 
      this.FIPPeakBurstSize = value;
   }
   
   
   @JsonIgnore
   public String getFIPPeakInformationRate() {
      return FIPPeakInformationRate;
   }

   @JsonIgnore
   public void setFIPPeakInformationRate(String value) { 
      this.FIPPeakInformationRate = value;
   }
   
   
   @JsonIgnore
   public Boolean getFIPRateLimitingActive() {
      return FIPRateLimitingActive;
   }

   @JsonIgnore
   public void setFIPRateLimitingActive(Boolean value) { 
      this.FIPRateLimitingActive = value;
   }
   
   
   @JsonIgnore
   public Boolean getActive() {
      return active;
   }

   @JsonIgnore
   public void setActive(Boolean value) { 
      this.active = value;
   }
   
   
   @JsonIgnore
   public String getAssocQosId() {
      return assocQosId;
   }

   @JsonIgnore
   public void setAssocQosId(String value) { 
      this.assocQosId = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDSCPForwardingClassTableID() {
      return associatedDSCPForwardingClassTableID;
   }

   @JsonIgnore
   public void setAssociatedDSCPForwardingClassTableID(String value) { 
      this.associatedDSCPForwardingClassTableID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDSCPForwardingClassTableName() {
      return associatedDSCPForwardingClassTableName;
   }

   @JsonIgnore
   public void setAssociatedDSCPForwardingClassTableName(String value) { 
      this.associatedDSCPForwardingClassTableName = value;
   }
   
   
   @JsonIgnore
   public String getBurst() {
      return burst;
   }

   @JsonIgnore
   public void setBurst(String value) { 
      this.burst = value;
   }
   
   
   @JsonIgnore
   public String getCommittedBurstSize() {
      return committedBurstSize;
   }

   @JsonIgnore
   public void setCommittedBurstSize(String value) { 
      this.committedBurstSize = value;
   }
   
   
   @JsonIgnore
   public String getCommittedInformationRate() {
      return committedInformationRate;
   }

   @JsonIgnore
   public void setCommittedInformationRate(String value) { 
      this.committedInformationRate = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   
   
   @JsonIgnore
   public String getPeak() {
      return peak;
   }

   @JsonIgnore
   public void setPeak(String value) { 
      this.peak = value;
   }
   
   
   @JsonIgnore
   public Boolean getRateLimitingActive() {
      return rateLimitingActive;
   }

   @JsonIgnore
   public void setRateLimitingActive(Boolean value) { 
      this.rateLimitingActive = value;
   }
   
   
   @JsonIgnore
   public Boolean getRewriteForwardingClass() {
      return rewriteForwardingClass;
   }

   @JsonIgnore
   public void setRewriteForwardingClass(Boolean value) { 
      this.rewriteForwardingClass = value;
   }
   
   
   @JsonIgnore
   public EServiceClass getServiceClass() {
      return serviceClass;
   }

   @JsonIgnore
   public void setServiceClass(EServiceClass value) { 
      this.serviceClass = value;
   }
   
   
   @JsonIgnore
   public Boolean getTrustedForwardingClass() {
      return trustedForwardingClass;
   }

   @JsonIgnore
   public void setTrustedForwardingClass(Boolean value) { 
      this.trustedForwardingClass = value;
   }
   

   
   @JsonIgnore
   public ContainersFetcher getContainers() {
      return containers;
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
   public VMsFetcher getVMs() {
      return vMs;
   }
   

   public String toString() {
      return "QOS [" + "BUMCommittedBurstSize=" + BUMCommittedBurstSize + ", BUMCommittedInformationRate=" + BUMCommittedInformationRate + ", BUMPeakBurstSize=" + BUMPeakBurstSize + ", BUMPeakInformationRate=" + BUMPeakInformationRate + ", BUMRateLimitingActive=" + BUMRateLimitingActive + ", EgressFIPCommittedBurstSize=" + EgressFIPCommittedBurstSize + ", EgressFIPCommittedInformationRate=" + EgressFIPCommittedInformationRate + ", EgressFIPPeakBurstSize=" + EgressFIPPeakBurstSize + ", EgressFIPPeakInformationRate=" + EgressFIPPeakInformationRate + ", FIPCommittedBurstSize=" + FIPCommittedBurstSize + ", FIPCommittedInformationRate=" + FIPCommittedInformationRate + ", FIPPeakBurstSize=" + FIPPeakBurstSize + ", FIPPeakInformationRate=" + FIPPeakInformationRate + ", FIPRateLimitingActive=" + FIPRateLimitingActive + ", active=" + active + ", assocQosId=" + assocQosId + ", associatedDSCPForwardingClassTableID=" + associatedDSCPForwardingClassTableID + ", associatedDSCPForwardingClassTableName=" + associatedDSCPForwardingClassTableName + ", burst=" + burst + ", committedBurstSize=" + committedBurstSize + ", committedInformationRate=" + committedInformationRate + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", peak=" + peak + ", rateLimitingActive=" + rateLimitingActive + ", rewriteForwardingClass=" + rewriteForwardingClass + ", serviceClass=" + serviceClass + ", trustedForwardingClass=" + trustedForwardingClass + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}