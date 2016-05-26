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

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "groupkeyencryptionprofile", resourceName = "groupkeyencryptionprofiles")
public class GroupKeyEncryptionProfile extends RestObject {

   
   public enum SEKPayloadEncryptionAlgorithm { RSA_1024 };
   public enum SEKPayloadSigningAlgorithm { SHA1withRSA, SHA224withRSA, SHA256withRSA, SHA384withRSA, SHA512withRSA };
   public enum SeedPayloadAuthenticationAlgorithm { HMAC_SHA1, HMAC_SHA256, HMAC_SHA512 };
   public enum SeedPayloadEncryptionAlgorithm { AES_128_CBC, AES_256_CBC, TRIPLE_DES_CBC };
   public enum SeedPayloadSigningAlgorithm { SHA1withRSA, SHA224withRSA, SHA256withRSA, SHA384withRSA, SHA512withRSA };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum TrafficAuthenticationAlgorithm { HMAC_MD5, HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512 };
   public enum TrafficEncryptionAlgorithm { AES_128_CBC, AES_192_CBC, AES_256_CBC, TRIPLE_DES_CBC };

   
   @JsonProperty(value = "SEKGenerationInterval")
   protected Long SEKGenerationInterval;
   
   @JsonProperty(value = "SEKLifetime")
   protected Long SEKLifetime;
   
   @JsonProperty(value = "SEKPayloadEncryptionAlgorithm")
   protected SEKPayloadEncryptionAlgorithm SEKPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "SEKPayloadEncryptionBCAlgorithm")
   protected String SEKPayloadEncryptionBCAlgorithm;
   
   @JsonProperty(value = "SEKPayloadEncryptionKeyLength")
   protected Long SEKPayloadEncryptionKeyLength;
   
   @JsonProperty(value = "SEKPayloadSigningAlgorithm")
   protected SEKPayloadSigningAlgorithm SEKPayloadSigningAlgorithm;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "seedGenerationInterval")
   protected Long seedGenerationInterval;
   
   @JsonProperty(value = "seedLifetime")
   protected Long seedLifetime;
   
   @JsonProperty(value = "seedPayloadAuthenticationAlgorithm")
   protected SeedPayloadAuthenticationAlgorithm seedPayloadAuthenticationAlgorithm;
   
   @JsonProperty(value = "seedPayloadAuthenticationBCAlgorithm")
   protected String seedPayloadAuthenticationBCAlgorithm;
   
   @JsonProperty(value = "seedPayloadAuthenticationKeyLength")
   protected Long seedPayloadAuthenticationKeyLength;
   
   @JsonProperty(value = "seedPayloadEncryptionAlgorithm")
   protected SeedPayloadEncryptionAlgorithm seedPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "seedPayloadEncryptionBCAlgorithm")
   protected String seedPayloadEncryptionBCAlgorithm;
   
   @JsonProperty(value = "seedPayloadEncryptionKeyLength")
   protected Long seedPayloadEncryptionKeyLength;
   
   @JsonProperty(value = "seedPayloadSigningAlgorithm")
   protected SeedPayloadSigningAlgorithm seedPayloadSigningAlgorithm;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "trafficAuthenticationAlgorithm")
   protected TrafficAuthenticationAlgorithm trafficAuthenticationAlgorithm;
   
   @JsonProperty(value = "trafficEncryptionAlgorithm")
   protected TrafficEncryptionAlgorithm trafficEncryptionAlgorithm;
   
   @JsonProperty(value = "trafficEncryptionKeyLifetime")
   protected Long trafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public GroupKeyEncryptionProfile() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public Long getSEKGenerationInterval() {
      return SEKGenerationInterval;
   }

   public void setSEKGenerationInterval(Long value) { 
      this.SEKGenerationInterval = value;
   }
   public Long getSEKLifetime() {
      return SEKLifetime;
   }

   public void setSEKLifetime(Long value) { 
      this.SEKLifetime = value;
   }
   public SEKPayloadEncryptionAlgorithm getSEKPayloadEncryptionAlgorithm() {
      return SEKPayloadEncryptionAlgorithm;
   }

   public void setSEKPayloadEncryptionAlgorithm(SEKPayloadEncryptionAlgorithm value) { 
      this.SEKPayloadEncryptionAlgorithm = value;
   }
   public String getSEKPayloadEncryptionBCAlgorithm() {
      return SEKPayloadEncryptionBCAlgorithm;
   }

   public void setSEKPayloadEncryptionBCAlgorithm(String value) { 
      this.SEKPayloadEncryptionBCAlgorithm = value;
   }
   public Long getSEKPayloadEncryptionKeyLength() {
      return SEKPayloadEncryptionKeyLength;
   }

   public void setSEKPayloadEncryptionKeyLength(Long value) { 
      this.SEKPayloadEncryptionKeyLength = value;
   }
   public SEKPayloadSigningAlgorithm getSEKPayloadSigningAlgorithm() {
      return SEKPayloadSigningAlgorithm;
   }

   public void setSEKPayloadSigningAlgorithm(SEKPayloadSigningAlgorithm value) { 
      this.SEKPayloadSigningAlgorithm = value;
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
   public Long getSeedGenerationInterval() {
      return seedGenerationInterval;
   }

   public void setSeedGenerationInterval(Long value) { 
      this.seedGenerationInterval = value;
   }
   public Long getSeedLifetime() {
      return seedLifetime;
   }

   public void setSeedLifetime(Long value) { 
      this.seedLifetime = value;
   }
   public SeedPayloadAuthenticationAlgorithm getSeedPayloadAuthenticationAlgorithm() {
      return seedPayloadAuthenticationAlgorithm;
   }

   public void setSeedPayloadAuthenticationAlgorithm(SeedPayloadAuthenticationAlgorithm value) { 
      this.seedPayloadAuthenticationAlgorithm = value;
   }
   public String getSeedPayloadAuthenticationBCAlgorithm() {
      return seedPayloadAuthenticationBCAlgorithm;
   }

   public void setSeedPayloadAuthenticationBCAlgorithm(String value) { 
      this.seedPayloadAuthenticationBCAlgorithm = value;
   }
   public Long getSeedPayloadAuthenticationKeyLength() {
      return seedPayloadAuthenticationKeyLength;
   }

   public void setSeedPayloadAuthenticationKeyLength(Long value) { 
      this.seedPayloadAuthenticationKeyLength = value;
   }
   public SeedPayloadEncryptionAlgorithm getSeedPayloadEncryptionAlgorithm() {
      return seedPayloadEncryptionAlgorithm;
   }

   public void setSeedPayloadEncryptionAlgorithm(SeedPayloadEncryptionAlgorithm value) { 
      this.seedPayloadEncryptionAlgorithm = value;
   }
   public String getSeedPayloadEncryptionBCAlgorithm() {
      return seedPayloadEncryptionBCAlgorithm;
   }

   public void setSeedPayloadEncryptionBCAlgorithm(String value) { 
      this.seedPayloadEncryptionBCAlgorithm = value;
   }
   public Long getSeedPayloadEncryptionKeyLength() {
      return seedPayloadEncryptionKeyLength;
   }

   public void setSeedPayloadEncryptionKeyLength(Long value) { 
      this.seedPayloadEncryptionKeyLength = value;
   }
   public SeedPayloadSigningAlgorithm getSeedPayloadSigningAlgorithm() {
      return seedPayloadSigningAlgorithm;
   }

   public void setSeedPayloadSigningAlgorithm(SeedPayloadSigningAlgorithm value) { 
      this.seedPayloadSigningAlgorithm = value;
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
   public TrafficAuthenticationAlgorithm getTrafficAuthenticationAlgorithm() {
      return trafficAuthenticationAlgorithm;
   }

   public void setTrafficAuthenticationAlgorithm(TrafficAuthenticationAlgorithm value) { 
      this.trafficAuthenticationAlgorithm = value;
   }
   public TrafficEncryptionAlgorithm getTrafficEncryptionAlgorithm() {
      return trafficEncryptionAlgorithm;
   }

   public void setTrafficEncryptionAlgorithm(TrafficEncryptionAlgorithm value) { 
      this.trafficEncryptionAlgorithm = value;
   }
   public Long getTrafficEncryptionKeyLifetime() {
      return trafficEncryptionKeyLifetime;
   }

   public void setTrafficEncryptionKeyLifetime(Long value) { 
      this.trafficEncryptionKeyLifetime = value;
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
   

   public String toString() {
      return "GroupKeyEncryptionProfile [" + "SEKGenerationInterval=" + SEKGenerationInterval + ", SEKLifetime=" + SEKLifetime + ", SEKPayloadEncryptionAlgorithm=" + SEKPayloadEncryptionAlgorithm + ", SEKPayloadEncryptionBCAlgorithm=" + SEKPayloadEncryptionBCAlgorithm + ", SEKPayloadEncryptionKeyLength=" + SEKPayloadEncryptionKeyLength + ", SEKPayloadSigningAlgorithm=" + SEKPayloadSigningAlgorithm + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", seedGenerationInterval=" + seedGenerationInterval + ", seedLifetime=" + seedLifetime + ", seedPayloadAuthenticationAlgorithm=" + seedPayloadAuthenticationAlgorithm + ", seedPayloadAuthenticationBCAlgorithm=" + seedPayloadAuthenticationBCAlgorithm + ", seedPayloadAuthenticationKeyLength=" + seedPayloadAuthenticationKeyLength + ", seedPayloadEncryptionAlgorithm=" + seedPayloadEncryptionAlgorithm + ", seedPayloadEncryptionBCAlgorithm=" + seedPayloadEncryptionBCAlgorithm + ", seedPayloadEncryptionKeyLength=" + seedPayloadEncryptionKeyLength + ", seedPayloadSigningAlgorithm=" + seedPayloadSigningAlgorithm + ", description=" + description + ", entityScope=" + entityScope + ", trafficAuthenticationAlgorithm=" + trafficAuthenticationAlgorithm + ", trafficEncryptionAlgorithm=" + trafficEncryptionAlgorithm + ", trafficEncryptionKeyLifetime=" + trafficEncryptionKeyLifetime + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}