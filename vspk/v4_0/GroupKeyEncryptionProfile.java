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
public class GroupKeyEncryptionProfile extends RestObject {

   public final static String REST_NAME = "groupkeyencryptionprofile";
   public final static String RESOURCE_NAME = "groupkeyencryptionprofiles";

   
   public enum SEKPayloadEncryptionAlgorithm { RSA_1024 };
   public enum SEKPayloadSigningAlgorithm { SHA1WITHRSA, SHA224WITHRSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum SeedPayloadAuthenticationAlgorithm { HMAC_SHA1, HMAC_SHA256, HMAC_SHA512 };
   public enum SeedPayloadEncryptionAlgorithm { AES_128_CBC, AES_256_CBC, TRIPLE_DES_CBC };
   public enum SeedPayloadSigningAlgorithm { SHA1WITHRSA, SHA224WITHRSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA };
   public enum TrafficAuthenticationAlgorithm { HMAC_MD5, HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512 };
   public enum TrafficEncryptionAlgorithm { AES_128_CBC, AES_192_CBC, AES_256_CBC, TRIPLE_DES_CBC };

   
   @JsonProperty(value = "SEKGenerationInterval")
   protected int SEKGenerationInterval;
   
   @JsonProperty(value = "SEKLifetime")
   protected int SEKLifetime;
   
   @JsonProperty(value = "SEKPayloadEncryptionAlgorithm")
   protected SEKPayloadEncryptionAlgorithm SEKPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "SEKPayloadEncryptionBCAlgorithm")
   protected String SEKPayloadEncryptionBCAlgorithm;
   
   @JsonProperty(value = "SEKPayloadEncryptionKeyLength")
   protected int SEKPayloadEncryptionKeyLength;
   
   @JsonProperty(value = "SEKPayloadSigningAlgorithm")
   protected SEKPayloadSigningAlgorithm SEKPayloadSigningAlgorithm;
   
   @JsonProperty(value = "associatedEnterpriseID")
   protected String associatedEnterpriseID;
   
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
   
   @JsonProperty(value = "seedGenerationInterval")
   protected int seedGenerationInterval;
   
   @JsonProperty(value = "seedLifetime")
   protected int seedLifetime;
   
   @JsonProperty(value = "seedPayloadAuthenticationAlgorithm")
   protected SeedPayloadAuthenticationAlgorithm seedPayloadAuthenticationAlgorithm;
   
   @JsonProperty(value = "seedPayloadAuthenticationBCAlgorithm")
   protected String seedPayloadAuthenticationBCAlgorithm;
   
   @JsonProperty(value = "seedPayloadAuthenticationKeyLength")
   protected int seedPayloadAuthenticationKeyLength;
   
   @JsonProperty(value = "seedPayloadEncryptionAlgorithm")
   protected SeedPayloadEncryptionAlgorithm seedPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "seedPayloadEncryptionBCAlgorithm")
   protected String seedPayloadEncryptionBCAlgorithm;
   
   @JsonProperty(value = "seedPayloadEncryptionKeyLength")
   protected int seedPayloadEncryptionKeyLength;
   
   @JsonProperty(value = "seedPayloadSigningAlgorithm")
   protected SeedPayloadSigningAlgorithm seedPayloadSigningAlgorithm;
   
   @JsonProperty(value = "trafficAuthenticationAlgorithm")
   protected TrafficAuthenticationAlgorithm trafficAuthenticationAlgorithm;
   
   @JsonProperty(value = "trafficEncryptionAlgorithm")
   protected TrafficEncryptionAlgorithm trafficEncryptionAlgorithm;
   
   @JsonProperty(value = "trafficEncryptionKeyLifetime")
   protected int trafficEncryptionKeyLifetime;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public GroupKeyEncryptionProfile() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public int getSEKGenerationInterval() {
      return SEKGenerationInterval;
   }

   public void setSEKGenerationInterval(int value) { 
      this.SEKGenerationInterval = value;
   }
   public int getSEKLifetime() {
      return SEKLifetime;
   }

   public void setSEKLifetime(int value) { 
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
   public int getSEKPayloadEncryptionKeyLength() {
      return SEKPayloadEncryptionKeyLength;
   }

   public void setSEKPayloadEncryptionKeyLength(int value) { 
      this.SEKPayloadEncryptionKeyLength = value;
   }
   public SEKPayloadSigningAlgorithm getSEKPayloadSigningAlgorithm() {
      return SEKPayloadSigningAlgorithm;
   }

   public void setSEKPayloadSigningAlgorithm(SEKPayloadSigningAlgorithm value) { 
      this.SEKPayloadSigningAlgorithm = value;
   }
   public String getAssociatedEnterpriseID() {
      return associatedEnterpriseID;
   }

   public void setAssociatedEnterpriseID(String value) { 
      this.associatedEnterpriseID = value;
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
   public int getSeedGenerationInterval() {
      return seedGenerationInterval;
   }

   public void setSeedGenerationInterval(int value) { 
      this.seedGenerationInterval = value;
   }
   public int getSeedLifetime() {
      return seedLifetime;
   }

   public void setSeedLifetime(int value) { 
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
   public int getSeedPayloadAuthenticationKeyLength() {
      return seedPayloadAuthenticationKeyLength;
   }

   public void setSeedPayloadAuthenticationKeyLength(int value) { 
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
   public int getSeedPayloadEncryptionKeyLength() {
      return seedPayloadEncryptionKeyLength;
   }

   public void setSeedPayloadEncryptionKeyLength(int value) { 
      this.seedPayloadEncryptionKeyLength = value;
   }
   public SeedPayloadSigningAlgorithm getSeedPayloadSigningAlgorithm() {
      return seedPayloadSigningAlgorithm;
   }

   public void setSeedPayloadSigningAlgorithm(SeedPayloadSigningAlgorithm value) { 
      this.seedPayloadSigningAlgorithm = value;
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
   public int getTrafficEncryptionKeyLifetime() {
      return trafficEncryptionKeyLifetime;
   }

   public void setTrafficEncryptionKeyLifetime(int value) { 
      this.trafficEncryptionKeyLifetime = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "GroupKeyEncryptionProfile [" + "SEKGenerationInterval=" + SEKGenerationInterval + ", SEKLifetime=" + SEKLifetime + ", SEKPayloadEncryptionAlgorithm=" + SEKPayloadEncryptionAlgorithm + ", SEKPayloadEncryptionBCAlgorithm=" + SEKPayloadEncryptionBCAlgorithm + ", SEKPayloadEncryptionKeyLength=" + SEKPayloadEncryptionKeyLength + ", SEKPayloadSigningAlgorithm=" + SEKPayloadSigningAlgorithm + ", associatedEnterpriseID=" + associatedEnterpriseID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", seedGenerationInterval=" + seedGenerationInterval + ", seedLifetime=" + seedLifetime + ", seedPayloadAuthenticationAlgorithm=" + seedPayloadAuthenticationAlgorithm + ", seedPayloadAuthenticationBCAlgorithm=" + seedPayloadAuthenticationBCAlgorithm + ", seedPayloadAuthenticationKeyLength=" + seedPayloadAuthenticationKeyLength + ", seedPayloadEncryptionAlgorithm=" + seedPayloadEncryptionAlgorithm + ", seedPayloadEncryptionBCAlgorithm=" + seedPayloadEncryptionBCAlgorithm + ", seedPayloadEncryptionKeyLength=" + seedPayloadEncryptionKeyLength + ", seedPayloadSigningAlgorithm=" + seedPayloadSigningAlgorithm + ", trafficAuthenticationAlgorithm=" + trafficAuthenticationAlgorithm + ", trafficEncryptionAlgorithm=" + trafficEncryptionAlgorithm + ", trafficEncryptionKeyLifetime=" + trafficEncryptionKeyLifetime + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}