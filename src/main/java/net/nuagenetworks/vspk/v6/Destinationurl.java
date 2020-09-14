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
@RestEntity(restName = "destinationurl", resourceName = "destinationurls")
public class Destinationurl extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EHTTPMethod { GET, HEAD };
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "HTTPMethod")
   
   protected EHTTPMethod HTTPMethod;
   
   @JsonProperty(value = "URL")
   
   protected String URL;
   
   @JsonProperty(value = "downThresholdCount")
   
   protected Long downThresholdCount;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "packetCount")
   
   protected Long packetCount;
   
   @JsonProperty(value = "percentageWeight")
   
   protected Long percentageWeight;
   
   @JsonProperty(value = "probeInterval")
   
   protected Long probeInterval;
   
   @JsonProperty(value = "timeout")
   
   protected Long timeout;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   

   public Destinationurl() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EHTTPMethod getHTTPMethod() {
      return HTTPMethod;
   }

   @JsonIgnore
   public void setHTTPMethod(EHTTPMethod value) { 
      this.HTTPMethod = value;
   }
   
   
   @JsonIgnore
   public String getURL() {
      return URL;
   }

   @JsonIgnore
   public void setURL(String value) { 
      this.URL = value;
   }
   
   
   @JsonIgnore
   public Long getDownThresholdCount() {
      return downThresholdCount;
   }

   @JsonIgnore
   public void setDownThresholdCount(Long value) { 
      this.downThresholdCount = value;
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
   public Long getPacketCount() {
      return packetCount;
   }

   @JsonIgnore
   public void setPacketCount(Long value) { 
      this.packetCount = value;
   }
   
   
   @JsonIgnore
   public Long getPercentageWeight() {
      return percentageWeight;
   }

   @JsonIgnore
   public void setPercentageWeight(Long value) { 
      this.percentageWeight = value;
   }
   
   
   @JsonIgnore
   public Long getProbeInterval() {
      return probeInterval;
   }

   @JsonIgnore
   public void setProbeInterval(Long value) { 
      this.probeInterval = value;
   }
   
   
   @JsonIgnore
   public Long getTimeout() {
      return timeout;
   }

   @JsonIgnore
   public void setTimeout(Long value) { 
      this.timeout = value;
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
      return "Destinationurl [" + "HTTPMethod=" + HTTPMethod + ", URL=" + URL + ", downThresholdCount=" + downThresholdCount + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", packetCount=" + packetCount + ", percentageWeight=" + percentageWeight + ", probeInterval=" + probeInterval + ", timeout=" + timeout + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}