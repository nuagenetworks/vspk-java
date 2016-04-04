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


package vspk.v4_0;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyServerMonitorSEK extends RestObject {

   public final static String REST_NAME = "keyservermonitorsek";
   public final static String RESOURCE_NAME = "keyservermonitorseks";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum SeedPayloadAuthenticationAlgorithm { HMAC_SHA1, HMAC_SHA256, HMAC_SHA512 };
   public enum SeedPayloadEncryptionAlgorithm { AES_128_CBC, AES_256_CBC, TRIPLE_DES_CBC };

   
   @JsonProperty(value = "creationTime")
   protected int creationTime;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lifetime")
   protected int lifetime;
   
   @JsonProperty(value = "seedPayloadAuthenticationAlgorithm")
   protected SeedPayloadAuthenticationAlgorithm seedPayloadAuthenticationAlgorithm;
   
   @JsonProperty(value = "seedPayloadEncryptionAlgorithm")
   protected SeedPayloadEncryptionAlgorithm seedPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "startTime")
   protected int startTime;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public KeyServerMonitorSEK() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public int getCreationTime() {
      return creationTime;
   }

   public void setCreationTime(int value) { 
      this.creationTime = value;
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
   public int getLifetime() {
      return lifetime;
   }

   public void setLifetime(int value) { 
      this.lifetime = value;
   }
   public SeedPayloadAuthenticationAlgorithm getSeedPayloadAuthenticationAlgorithm() {
      return seedPayloadAuthenticationAlgorithm;
   }

   public void setSeedPayloadAuthenticationAlgorithm(SeedPayloadAuthenticationAlgorithm value) { 
      this.seedPayloadAuthenticationAlgorithm = value;
   }
   public SeedPayloadEncryptionAlgorithm getSeedPayloadEncryptionAlgorithm() {
      return seedPayloadEncryptionAlgorithm;
   }

   public void setSeedPayloadEncryptionAlgorithm(SeedPayloadEncryptionAlgorithm value) { 
      this.seedPayloadEncryptionAlgorithm = value;
   }
   public int getStartTime() {
      return startTime;
   }

   public void setStartTime(int value) { 
      this.startTime = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "KeyServerMonitorSEK [" + "creationTime=" + creationTime + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lifetime=" + lifetime + ", seedPayloadAuthenticationAlgorithm=" + seedPayloadAuthenticationAlgorithm + ", seedPayloadEncryptionAlgorithm=" + seedPayloadEncryptionAlgorithm + ", startTime=" + startTime + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}