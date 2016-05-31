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

package net.nuagenetworks.vspk.v4_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.QOSsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "policydecision", resourceName = "policydecisions")
public class PolicyDecision extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "egressACLs")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> egressACLs;
   
   @JsonProperty(value = "egressQos")
   protected Object egressQos;
   
   @JsonProperty(value = "fipACLs")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> fipACLs;
   
   @JsonProperty(value = "ingressACLs")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> ingressACLs;
   
   @JsonProperty(value = "ingressAdvFwd")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> ingressAdvFwd;
   
   @JsonProperty(value = "ingressExternalServiceACLs")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> ingressExternalServiceACLs;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "qos")
   protected Object qos;
   
   @JsonProperty(value = "stats")
   protected StatisticsPolicy stats;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   

   public PolicyDecision() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
   }

   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getEgressACLs() {
      return egressACLs;
   }

   public void setEgressACLs(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.egressACLs = value;
   }
   public Object getEgressQos() {
      return egressQos;
   }

   public void setEgressQos(Object value) { 
      this.egressQos = value;
   }
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getFipACLs() {
      return fipACLs;
   }

   public void setFipACLs(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.fipACLs = value;
   }
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getIngressACLs() {
      return ingressACLs;
   }

   public void setIngressACLs(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.ingressACLs = value;
   }
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getIngressAdvFwd() {
      return ingressAdvFwd;
   }

   public void setIngressAdvFwd(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.ingressAdvFwd = value;
   }
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getIngressExternalServiceACLs() {
      return ingressExternalServiceACLs;
   }

   public void setIngressExternalServiceACLs(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.ingressExternalServiceACLs = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public Object getQos() {
      return qos;
   }

   public void setQos(Object value) { 
      this.qos = value;
   }
   public StatisticsPolicy getStats() {
      return stats;
   }

   public void setStats(StatisticsPolicy value) { 
      this.stats = value;
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
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   

   public String toString() {
      return "PolicyDecision [" + "lastUpdatedBy=" + lastUpdatedBy + ", egressACLs=" + egressACLs + ", egressQos=" + egressQos + ", fipACLs=" + fipACLs + ", ingressACLs=" + ingressACLs + ", ingressAdvFwd=" + ingressAdvFwd + ", ingressExternalServiceACLs=" + ingressExternalServiceACLs + ", entityScope=" + entityScope + ", qos=" + qos + ", stats=" + stats + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}