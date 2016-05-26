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
import net.nuagenetworks.vspk.v3_2.fetchers.KeyServerMonitorEncryptedSeedsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "keyservermonitorseed", resourceName = "keyservermonitorseeds")
public class KeyServerMonitorSeed extends RestObject {

   
   public enum SeedTrafficAuthenticationAlgorithm { HMAC_MD5, HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512 };
   public enum SeedTrafficEncryptionAlgorithm { AES_128_CBC, AES_192_CBC, AES_256_CBC, TRIPLE_DES_CBC };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "seedTrafficAuthenticationAlgorithm")
   protected SeedTrafficAuthenticationAlgorithm seedTrafficAuthenticationAlgorithm;
   
   @JsonProperty(value = "seedTrafficEncryptionAlgorithm")
   protected SeedTrafficEncryptionAlgorithm seedTrafficEncryptionAlgorithm;
   
   @JsonProperty(value = "seedTrafficEncryptionKeyLifetime")
   protected Long seedTrafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "lifetime")
   protected Long lifetime;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "creationTime")
   protected Long creationTime;
   
   @JsonProperty(value = "startTime")
   protected Long startTime;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private KeyServerMonitorEncryptedSeedsFetcher keyServerMonitorEncryptedSeeds;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public KeyServerMonitorSeed() {
      
      metadatas = new MetadatasFetcher(this);
      
      keyServerMonitorEncryptedSeeds = new KeyServerMonitorEncryptedSeedsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public SeedTrafficAuthenticationAlgorithm getSeedTrafficAuthenticationAlgorithm() {
      return seedTrafficAuthenticationAlgorithm;
   }

   public void setSeedTrafficAuthenticationAlgorithm(SeedTrafficAuthenticationAlgorithm value) { 
      this.seedTrafficAuthenticationAlgorithm = value;
   }
   public SeedTrafficEncryptionAlgorithm getSeedTrafficEncryptionAlgorithm() {
      return seedTrafficEncryptionAlgorithm;
   }

   public void setSeedTrafficEncryptionAlgorithm(SeedTrafficEncryptionAlgorithm value) { 
      this.seedTrafficEncryptionAlgorithm = value;
   }
   public Long getSeedTrafficEncryptionKeyLifetime() {
      return seedTrafficEncryptionKeyLifetime;
   }

   public void setSeedTrafficEncryptionKeyLifetime(Long value) { 
      this.seedTrafficEncryptionKeyLifetime = value;
   }
   public Long getLifetime() {
      return lifetime;
   }

   public void setLifetime(Long value) { 
      this.lifetime = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public Long getCreationTime() {
      return creationTime;
   }

   public void setCreationTime(Long value) { 
      this.creationTime = value;
   }
   public Long getStartTime() {
      return startTime;
   }

   public void setStartTime(Long value) { 
      this.startTime = value;
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
   public KeyServerMonitorEncryptedSeedsFetcher getKeyServerMonitorEncryptedSeeds() {
      return keyServerMonitorEncryptedSeeds;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "KeyServerMonitorSeed [" + "lastUpdatedBy=" + lastUpdatedBy + ", seedTrafficAuthenticationAlgorithm=" + seedTrafficAuthenticationAlgorithm + ", seedTrafficEncryptionAlgorithm=" + seedTrafficEncryptionAlgorithm + ", seedTrafficEncryptionKeyLifetime=" + seedTrafficEncryptionKeyLifetime + ", lifetime=" + lifetime + ", entityScope=" + entityScope + ", creationTime=" + creationTime + ", startTime=" + startTime + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}