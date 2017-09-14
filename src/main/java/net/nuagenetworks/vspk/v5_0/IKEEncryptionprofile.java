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

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ikeencryptionprofile", resourceName = "ikeencryptionprofiles")
public class IKEEncryptionprofile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum DPDMode { ON_DEMAND, REPLY_ONLY };
   
   public enum IPsecAuthenticationAlgorithm { HMAC_SHA1, HMAC_SHA256, HMAC_SHA512 };
   
   public enum IPsecEncryptionAlgorithm { AES128, AES192, AES256, TRIPLE_DES };
   
   public enum IPsecSAReplayWindowSize { WINDOW_SIZE_0, WINDOW_SIZE_1024, WINDOW_SIZE_128, WINDOW_SIZE_256, WINDOW_SIZE_32, WINDOW_SIZE_512, WINDOW_SIZE_64 };
   
   public enum ISAKMPAuthenticationMode { PRE_SHARED_KEY };
   
   public enum ISAKMPDiffieHelmanGroupIdentifier { GROUP_14_2048_BIT_DH, GROUP_15_3072_BIT_DH, GROUP_16_4096_BIT_DH, GROUP_17_6144_BIT_DH, GROUP_18_8192_BIT_DH, GROUP_1_768_BIT_DH, GROUP_2_1024_BIT_DH, GROUP_5_1536_BIT_DH };
   
   public enum ISAKMPEncryptionAlgorithm { AES128, AES192, AES256, TRIPLE_DES };
   
   public enum ISAKMPHashAlgorithm { SHA1, SHA256 };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "DPDInterval")
   protected Long DPDInterval;
   
   @JsonProperty(value = "DPDMode")
   protected DPDMode DPDMode;
   
   @JsonProperty(value = "DPDTimeout")
   protected Long DPDTimeout;
   
   @JsonProperty(value = "IPsecAuthenticationAlgorithm")
   protected IPsecAuthenticationAlgorithm IPsecAuthenticationAlgorithm;
   
   @JsonProperty(value = "IPsecDontFragment")
   protected Boolean IPsecDontFragment;
   
   @JsonProperty(value = "IPsecEnablePFS")
   protected Boolean IPsecEnablePFS;
   
   @JsonProperty(value = "IPsecEncryptionAlgorithm")
   protected IPsecEncryptionAlgorithm IPsecEncryptionAlgorithm;
   
   @JsonProperty(value = "IPsecPreFragment")
   protected Boolean IPsecPreFragment;
   
   @JsonProperty(value = "IPsecSALifetime")
   protected Long IPsecSALifetime;
   
   @JsonProperty(value = "IPsecSAReplayWindowSize")
   protected IPsecSAReplayWindowSize IPsecSAReplayWindowSize;
   
   @JsonProperty(value = "ISAKMPAuthenticationMode")
   protected ISAKMPAuthenticationMode ISAKMPAuthenticationMode;
   
   @JsonProperty(value = "ISAKMPDiffieHelmanGroupIdentifier")
   protected ISAKMPDiffieHelmanGroupIdentifier ISAKMPDiffieHelmanGroupIdentifier;
   
   @JsonProperty(value = "ISAKMPEncryptionAlgorithm")
   protected ISAKMPEncryptionAlgorithm ISAKMPEncryptionAlgorithm;
   
   @JsonProperty(value = "ISAKMPEncryptionKeyLifetime")
   protected Long ISAKMPEncryptionKeyLifetime;
   
   @JsonProperty(value = "ISAKMPHashAlgorithm")
   protected ISAKMPHashAlgorithm ISAKMPHashAlgorithm;
   
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
   
   @JsonProperty(value = "sequence")
   protected Long sequence;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public IKEEncryptionprofile() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   @JsonIgnore
   public Long getDPDInterval() {
      return DPDInterval;
   }

   @JsonIgnore
   public void setDPDInterval(Long value) { 
      this.DPDInterval = value;
   }
   
   @JsonIgnore
   public DPDMode getDPDMode() {
      return DPDMode;
   }

   @JsonIgnore
   public void setDPDMode(DPDMode value) { 
      this.DPDMode = value;
   }
   
   @JsonIgnore
   public Long getDPDTimeout() {
      return DPDTimeout;
   }

   @JsonIgnore
   public void setDPDTimeout(Long value) { 
      this.DPDTimeout = value;
   }
   
   @JsonIgnore
   public IPsecAuthenticationAlgorithm getIPsecAuthenticationAlgorithm() {
      return IPsecAuthenticationAlgorithm;
   }

   @JsonIgnore
   public void setIPsecAuthenticationAlgorithm(IPsecAuthenticationAlgorithm value) { 
      this.IPsecAuthenticationAlgorithm = value;
   }
   
   @JsonIgnore
   public Boolean getIPsecDontFragment() {
      return IPsecDontFragment;
   }

   @JsonIgnore
   public void setIPsecDontFragment(Boolean value) { 
      this.IPsecDontFragment = value;
   }
   
   @JsonIgnore
   public Boolean getIPsecEnablePFS() {
      return IPsecEnablePFS;
   }

   @JsonIgnore
   public void setIPsecEnablePFS(Boolean value) { 
      this.IPsecEnablePFS = value;
   }
   
   @JsonIgnore
   public IPsecEncryptionAlgorithm getIPsecEncryptionAlgorithm() {
      return IPsecEncryptionAlgorithm;
   }

   @JsonIgnore
   public void setIPsecEncryptionAlgorithm(IPsecEncryptionAlgorithm value) { 
      this.IPsecEncryptionAlgorithm = value;
   }
   
   @JsonIgnore
   public Boolean getIPsecPreFragment() {
      return IPsecPreFragment;
   }

   @JsonIgnore
   public void setIPsecPreFragment(Boolean value) { 
      this.IPsecPreFragment = value;
   }
   
   @JsonIgnore
   public Long getIPsecSALifetime() {
      return IPsecSALifetime;
   }

   @JsonIgnore
   public void setIPsecSALifetime(Long value) { 
      this.IPsecSALifetime = value;
   }
   
   @JsonIgnore
   public IPsecSAReplayWindowSize getIPsecSAReplayWindowSize() {
      return IPsecSAReplayWindowSize;
   }

   @JsonIgnore
   public void setIPsecSAReplayWindowSize(IPsecSAReplayWindowSize value) { 
      this.IPsecSAReplayWindowSize = value;
   }
   
   @JsonIgnore
   public ISAKMPAuthenticationMode getISAKMPAuthenticationMode() {
      return ISAKMPAuthenticationMode;
   }

   @JsonIgnore
   public void setISAKMPAuthenticationMode(ISAKMPAuthenticationMode value) { 
      this.ISAKMPAuthenticationMode = value;
   }
   
   @JsonIgnore
   public ISAKMPDiffieHelmanGroupIdentifier getISAKMPDiffieHelmanGroupIdentifier() {
      return ISAKMPDiffieHelmanGroupIdentifier;
   }

   @JsonIgnore
   public void setISAKMPDiffieHelmanGroupIdentifier(ISAKMPDiffieHelmanGroupIdentifier value) { 
      this.ISAKMPDiffieHelmanGroupIdentifier = value;
   }
   
   @JsonIgnore
   public ISAKMPEncryptionAlgorithm getISAKMPEncryptionAlgorithm() {
      return ISAKMPEncryptionAlgorithm;
   }

   @JsonIgnore
   public void setISAKMPEncryptionAlgorithm(ISAKMPEncryptionAlgorithm value) { 
      this.ISAKMPEncryptionAlgorithm = value;
   }
   
   @JsonIgnore
   public Long getISAKMPEncryptionKeyLifetime() {
      return ISAKMPEncryptionKeyLifetime;
   }

   @JsonIgnore
   public void setISAKMPEncryptionKeyLifetime(Long value) { 
      this.ISAKMPEncryptionKeyLifetime = value;
   }
   
   @JsonIgnore
   public ISAKMPHashAlgorithm getISAKMPHashAlgorithm() {
      return ISAKMPHashAlgorithm;
   }

   @JsonIgnore
   public void setISAKMPHashAlgorithm(ISAKMPHashAlgorithm value) { 
      this.ISAKMPHashAlgorithm = value;
   }
   
   @JsonIgnore
   public String getAssociatedEnterpriseID() {
      return associatedEnterpriseID;
   }

   @JsonIgnore
   public void setAssociatedEnterpriseID(String value) { 
      this.associatedEnterpriseID = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
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
   public Long getSequence() {
      return sequence;
   }

   @JsonIgnore
   public void setSequence(Long value) { 
      this.sequence = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "IKEEncryptionprofile [" + "DPDInterval=" + DPDInterval + ", DPDMode=" + DPDMode + ", DPDTimeout=" + DPDTimeout + ", IPsecAuthenticationAlgorithm=" + IPsecAuthenticationAlgorithm + ", IPsecDontFragment=" + IPsecDontFragment + ", IPsecEnablePFS=" + IPsecEnablePFS + ", IPsecEncryptionAlgorithm=" + IPsecEncryptionAlgorithm + ", IPsecPreFragment=" + IPsecPreFragment + ", IPsecSALifetime=" + IPsecSALifetime + ", IPsecSAReplayWindowSize=" + IPsecSAReplayWindowSize + ", ISAKMPAuthenticationMode=" + ISAKMPAuthenticationMode + ", ISAKMPDiffieHelmanGroupIdentifier=" + ISAKMPDiffieHelmanGroupIdentifier + ", ISAKMPEncryptionAlgorithm=" + ISAKMPEncryptionAlgorithm + ", ISAKMPEncryptionKeyLifetime=" + ISAKMPEncryptionKeyLifetime + ", ISAKMPHashAlgorithm=" + ISAKMPHashAlgorithm + ", associatedEnterpriseID=" + associatedEnterpriseID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", sequence=" + sequence + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}