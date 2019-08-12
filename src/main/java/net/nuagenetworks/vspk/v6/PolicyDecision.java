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
import net.nuagenetworks.vspk.v6.fetchers.QOSsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "policydecision", resourceName = "policydecisions")
public class PolicyDecision extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "egressACLs")
   
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> egressACLs;
   
   @JsonProperty(value = "egressQos")
   
   protected Object egressQos;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "fipACLs")
   
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> fipACLs;
   
   @JsonProperty(value = "ingressACLs")
   
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> ingressACLs;
   
   @JsonProperty(value = "ingressAdvFwd")
   
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> ingressAdvFwd;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "qos")
   
   protected Object qos;
   
   @JsonProperty(value = "stats")
   
   protected StatisticsPolicy stats;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   

   public PolicyDecision() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getEgressACLs() {
      return egressACLs;
   }

   @JsonIgnore
   public void setEgressACLs(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.egressACLs = value;
   }
   
   
   @JsonIgnore
   public Object getEgressQos() {
      return egressQos;
   }

   @JsonIgnore
   public void setEgressQos(Object value) { 
      this.egressQos = value;
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
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getFipACLs() {
      return fipACLs;
   }

   @JsonIgnore
   public void setFipACLs(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.fipACLs = value;
   }
   
   
   @JsonIgnore
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getIngressACLs() {
      return ingressACLs;
   }

   @JsonIgnore
   public void setIngressACLs(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.ingressACLs = value;
   }
   
   
   @JsonIgnore
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getIngressAdvFwd() {
      return ingressAdvFwd;
   }

   @JsonIgnore
   public void setIngressAdvFwd(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.ingressAdvFwd = value;
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
   public Object getQos() {
      return qos;
   }

   @JsonIgnore
   public void setQos(Object value) { 
      this.qos = value;
   }
   
   
   @JsonIgnore
   public StatisticsPolicy getStats() {
      return stats;
   }

   @JsonIgnore
   public void setStats(StatisticsPolicy value) { 
      this.stats = value;
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
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   

   public String toString() {
      return "PolicyDecision [" + "egressACLs=" + egressACLs + ", egressQos=" + egressQos + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", fipACLs=" + fipACLs + ", ingressACLs=" + ingressACLs + ", ingressAdvFwd=" + ingressAdvFwd + ", lastUpdatedBy=" + lastUpdatedBy + ", qos=" + qos + ", stats=" + stats + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}