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
@RestEntity(restName = "systemconfig", resourceName = "systemconfigs")
public class SystemConfig extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum DomainTunnelType { DC_DEFAULT, GRE, VXLAN };
   public enum GroupKeyDefaultSEKPayloadEncryptionAlgorithm { RSA_1024 };
   public enum GroupKeyDefaultSEKPayloadSigningAlgorithm { SHA1withRSA, SHA224withRSA, SHA256withRSA, SHA384withRSA, SHA512withRSA };
   public enum GroupKeyDefaultSeedPayloadAuthenticationAlgorithm { HMAC_SHA1, HMAC_SHA256, HMAC_SHA512 };
   public enum GroupKeyDefaultSeedPayloadEncryptionAlgorithm { AES_128_CBC, AES_256_CBC, TRIPLE_DES_CBC };
   public enum GroupKeyDefaultSeedPayloadSigningAlgorithm { SHA1withRSA, SHA224withRSA, SHA256withRSA, SHA384withRSA, SHA512withRSA };
   public enum GroupKeyDefaultTrafficAuthenticationAlgorithm { HMAC_MD5, HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512 };
   public enum GroupKeyDefaultTrafficEncryptionAlgorithm { AES_128_CBC, AES_192_CBC, AES_256_CBC, TRIPLE_DES_CBC };

   
   @JsonProperty(value = "ACLAllowOrigin")
   protected String ACLAllowOrigin;
   
   @JsonProperty(value = "ECMPCount")
   protected Long ECMPCount;
   
   @JsonProperty(value = "LDAPSyncInterval")
   protected Long LDAPSyncInterval;
   
   @JsonProperty(value = "LDAPTrustStoreCertifcate")
   protected String LDAPTrustStoreCertifcate;
   
   @JsonProperty(value = "LDAPTrustStorePassword")
   protected String LDAPTrustStorePassword;
   
   @JsonProperty(value = "ADGatewayPurgeTime")
   protected Long ADGatewayPurgeTime;
   
   @JsonProperty(value = "RDLowerLimit")
   protected Long RDLowerLimit;
   
   @JsonProperty(value = "RDPublicNetworkLowerLimit")
   protected Long RDPublicNetworkLowerLimit;
   
   @JsonProperty(value = "RDPublicNetworkUpperLimit")
   protected Long RDPublicNetworkUpperLimit;
   
   @JsonProperty(value = "RDUpperLimit")
   protected Long RDUpperLimit;
   
   @JsonProperty(value = "DHCPOptionSize")
   protected Long DHCPOptionSize;
   
   @JsonProperty(value = "VMCacheSize")
   protected Long VMCacheSize;
   
   @JsonProperty(value = "VMPurgeTime")
   protected Long VMPurgeTime;
   
   @JsonProperty(value = "VMResyncDeletionWaitTime")
   protected Long VMResyncDeletionWaitTime;
   
   @JsonProperty(value = "VMResyncOutstandingInterval")
   protected Long VMResyncOutstandingInterval;
   
   @JsonProperty(value = "VMUnreachableCleanupTime")
   protected Long VMUnreachableCleanupTime;
   
   @JsonProperty(value = "VMUnreachableTime")
   protected Long VMUnreachableTime;
   
   @JsonProperty(value = "VNIDLowerLimit")
   protected Long VNIDLowerLimit;
   
   @JsonProperty(value = "VNIDPublicNetworkLowerLimit")
   protected Long VNIDPublicNetworkLowerLimit;
   
   @JsonProperty(value = "VNIDPublicNetworkUpperLimit")
   protected Long VNIDPublicNetworkUpperLimit;
   
   @JsonProperty(value = "VNIDUpperLimit")
   protected Long VNIDUpperLimit;
   
   @JsonProperty(value = "APIKeyRenewalInterval")
   protected Long APIKeyRenewalInterval;
   
   @JsonProperty(value = "APIKeyValidity")
   protected Long APIKeyValidity;
   
   @JsonProperty(value = "LRUCacheSizePerSubnet")
   protected Long LRUCacheSizePerSubnet;
   
   @JsonProperty(value = "VSCOnSameVersionAsVSD")
   protected Boolean VSCOnSameVersionAsVSD;
   
   @JsonProperty(value = "VSDReadOnlyMode")
   protected Boolean VSDReadOnlyMode;
   
   @JsonProperty(value = "VSDUpgradeIsComplete")
   protected Boolean VSDUpgradeIsComplete;
   
   @JsonProperty(value = "ASNumber")
   protected Long ASNumber;
   
   @JsonProperty(value = "RTLowerLimit")
   protected Long RTLowerLimit;
   
   @JsonProperty(value = "RTPublicNetworkLowerLimit")
   protected Long RTPublicNetworkLowerLimit;
   
   @JsonProperty(value = "RTPublicNetworkUpperLimit")
   protected Long RTPublicNetworkUpperLimit;
   
   @JsonProperty(value = "RTUpperLimit")
   protected Long RTUpperLimit;
   
   @JsonProperty(value = "EVPNBGPCommunityTagASNumber")
   protected Long EVPNBGPCommunityTagASNumber;
   
   @JsonProperty(value = "EVPNBGPCommunityTagLowerLimit")
   protected Long EVPNBGPCommunityTagLowerLimit;
   
   @JsonProperty(value = "EVPNBGPCommunityTagUpperLimit")
   protected Long EVPNBGPCommunityTagUpperLimit;
   
   @JsonProperty(value = "pageMaxSize")
   protected Long pageMaxSize;
   
   @JsonProperty(value = "pageSize")
   protected Long pageSize;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "maxFailedLogins")
   protected Long maxFailedLogins;
   
   @JsonProperty(value = "maxResponse")
   protected Long maxResponse;
   
   @JsonProperty(value = "reflexiveACLTimeout")
   protected Long reflexiveACLTimeout;
   
   @JsonProperty(value = "serviceIDUpperLimit")
   protected Long serviceIDUpperLimit;
   
   @JsonProperty(value = "keyServerMonitorEnabled")
   protected Boolean keyServerMonitorEnabled;
   
   @JsonProperty(value = "keyServerVSDDataSynchronizationInterval")
   protected Long keyServerVSDDataSynchronizationInterval;
   
   @JsonProperty(value = "offsetCustomerID")
   protected Long offsetCustomerID;
   
   @JsonProperty(value = "offsetServiceID")
   protected Long offsetServiceID;
   
   @JsonProperty(value = "ejbcaNSGCertificateProfile")
   protected String ejbcaNSGCertificateProfile;
   
   @JsonProperty(value = "ejbcaNSGEndEntityProfile")
   protected String ejbcaNSGEndEntityProfile;
   
   @JsonProperty(value = "ejbcaOCSPResponderCN")
   protected String ejbcaOCSPResponderCN;
   
   @JsonProperty(value = "ejbcaOCSPResponderURI")
   protected String ejbcaOCSPResponderURI;
   
   @JsonProperty(value = "ejbcaVspRootCa")
   protected String ejbcaVspRootCa;
   
   @JsonProperty(value = "alarmsMaxPerObject")
   protected Long alarmsMaxPerObject;
   
   @JsonProperty(value = "inactiveTimeout")
   protected Long inactiveTimeout;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "domainTunnelType")
   protected DomainTunnelType domainTunnelType;
   
   @JsonProperty(value = "postProcessorThreadsCount")
   protected Long postProcessorThreadsCount;
   
   @JsonProperty(value = "groupKeyDefaultSEKGenerationInterval")
   protected Long groupKeyDefaultSEKGenerationInterval;
   
   @JsonProperty(value = "groupKeyDefaultSEKLifetime")
   protected Long groupKeyDefaultSEKLifetime;
   
   @JsonProperty(value = "groupKeyDefaultSEKPayloadEncryptionAlgorithm")
   protected GroupKeyDefaultSEKPayloadEncryptionAlgorithm groupKeyDefaultSEKPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSEKPayloadSigningAlgorithm")
   protected GroupKeyDefaultSEKPayloadSigningAlgorithm groupKeyDefaultSEKPayloadSigningAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSeedGenerationInterval")
   protected Long groupKeyDefaultSeedGenerationInterval;
   
   @JsonProperty(value = "groupKeyDefaultSeedLifetime")
   protected Long groupKeyDefaultSeedLifetime;
   
   @JsonProperty(value = "groupKeyDefaultSeedPayloadAuthenticationAlgorithm")
   protected GroupKeyDefaultSeedPayloadAuthenticationAlgorithm groupKeyDefaultSeedPayloadAuthenticationAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSeedPayloadEncryptionAlgorithm")
   protected GroupKeyDefaultSeedPayloadEncryptionAlgorithm groupKeyDefaultSeedPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSeedPayloadSigningAlgorithm")
   protected GroupKeyDefaultSeedPayloadSigningAlgorithm groupKeyDefaultSeedPayloadSigningAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultTrafficAuthenticationAlgorithm")
   protected GroupKeyDefaultTrafficAuthenticationAlgorithm groupKeyDefaultTrafficAuthenticationAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultTrafficEncryptionAlgorithm")
   protected GroupKeyDefaultTrafficEncryptionAlgorithm groupKeyDefaultTrafficEncryptionAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultTrafficEncryptionKeyLifetime")
   protected Long groupKeyDefaultTrafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "groupKeyGenerationIntervalOnForcedReKey")
   protected Long groupKeyGenerationIntervalOnForcedReKey;
   
   @JsonProperty(value = "groupKeyGenerationIntervalOnRevoke")
   protected Long groupKeyGenerationIntervalOnRevoke;
   
   @JsonProperty(value = "groupKeyMinimumSEKGenerationInterval")
   protected Long groupKeyMinimumSEKGenerationInterval;
   
   @JsonProperty(value = "groupKeyMinimumSEKLifetime")
   protected Long groupKeyMinimumSEKLifetime;
   
   @JsonProperty(value = "groupKeyMinimumSeedGenerationInterval")
   protected Long groupKeyMinimumSeedGenerationInterval;
   
   @JsonProperty(value = "groupKeyMinimumSeedLifetime")
   protected Long groupKeyMinimumSeedLifetime;
   
   @JsonProperty(value = "groupKeyMinimumTrafficEncryptionKeyLifetime")
   protected Long groupKeyMinimumTrafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "nsgBootstrapEndpoint")
   protected String nsgBootstrapEndpoint;
   
   @JsonProperty(value = "nsgConfigEndpoint")
   protected String nsgConfigEndpoint;
   
   @JsonProperty(value = "nsgLocalUiUrl")
   protected String nsgLocalUiUrl;
   
   @JsonProperty(value = "esiID")
   protected Long esiID;
   
   @JsonProperty(value = "stackTraceEnabled")
   protected Boolean stackTraceEnabled;
   
   @JsonProperty(value = "staticWANServicePurgeTime")
   protected Long staticWANServicePurgeTime;
   
   @JsonProperty(value = "statsCollectorAddress")
   protected String statsCollectorAddress;
   
   @JsonProperty(value = "statsCollectorPort")
   protected String statsCollectorPort;
   
   @JsonProperty(value = "statsCollectorProtoBufPort")
   protected String statsCollectorProtoBufPort;
   
   @JsonProperty(value = "statsMaxDataPoints")
   protected Long statsMaxDataPoints;
   
   @JsonProperty(value = "statsMinDuration")
   protected Long statsMinDuration;
   
   @JsonProperty(value = "statsNumberOfDataPoints")
   protected Long statsNumberOfDataPoints;
   
   @JsonProperty(value = "statsTSDBServerAddress")
   protected String statsTSDBServerAddress;
   
   @JsonProperty(value = "subnetResyncInterval")
   protected Long subnetResyncInterval;
   
   @JsonProperty(value = "subnetResyncOutstandingInterval")
   protected Long subnetResyncOutstandingInterval;
   
   @JsonProperty(value = "customerIDUpperLimit")
   protected Long customerIDUpperLimit;
   
   @JsonProperty(value = "customerKey")
   protected String customerKey;
   
   @JsonProperty(value = "avatarBasePath")
   protected String avatarBasePath;
   
   @JsonProperty(value = "avatarBaseURL")
   protected String avatarBaseURL;
   
   @JsonProperty(value = "eventLogCleanupInterval")
   protected Long eventLogCleanupInterval;
   
   @JsonProperty(value = "eventLogEntryMaxAge")
   protected Long eventLogEntryMaxAge;
   
   @JsonProperty(value = "eventProcessorInterval")
   protected Long eventProcessorInterval;
   
   @JsonProperty(value = "eventProcessorMaxEventsCount")
   protected Long eventProcessorMaxEventsCount;
   
   @JsonProperty(value = "eventProcessorTimeout")
   protected Long eventProcessorTimeout;
   
   @JsonProperty(value = "twoFactorCodeExpiry")
   protected Long twoFactorCodeExpiry;
   
   @JsonProperty(value = "twoFactorCodeLength")
   protected Long twoFactorCodeLength;
   
   @JsonProperty(value = "twoFactorCodeSeedLength")
   protected Long twoFactorCodeSeedLength;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "dynamicWANServiceDiffTime")
   protected Long dynamicWANServiceDiffTime;
   
   @JsonProperty(value = "syslogDestinationHost")
   protected String syslogDestinationHost;
   
   @JsonProperty(value = "syslogDestinationPort")
   protected Long syslogDestinationPort;
   
   @JsonProperty(value = "sysmonCleanupTaskInterval")
   protected Long sysmonCleanupTaskInterval;
   
   @JsonProperty(value = "sysmonNodePresenceTimeout")
   protected Long sysmonNodePresenceTimeout;
   
   @JsonProperty(value = "sysmonProbeResponseTimeout")
   protected Long sysmonProbeResponseTimeout;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public SystemConfig() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public String getACLAllowOrigin() {
      return ACLAllowOrigin;
   }

   public void setACLAllowOrigin(String value) { 
      this.ACLAllowOrigin = value;
   }
   public Long getECMPCount() {
      return ECMPCount;
   }

   public void setECMPCount(Long value) { 
      this.ECMPCount = value;
   }
   public Long getLDAPSyncInterval() {
      return LDAPSyncInterval;
   }

   public void setLDAPSyncInterval(Long value) { 
      this.LDAPSyncInterval = value;
   }
   public String getLDAPTrustStoreCertifcate() {
      return LDAPTrustStoreCertifcate;
   }

   public void setLDAPTrustStoreCertifcate(String value) { 
      this.LDAPTrustStoreCertifcate = value;
   }
   public String getLDAPTrustStorePassword() {
      return LDAPTrustStorePassword;
   }

   public void setLDAPTrustStorePassword(String value) { 
      this.LDAPTrustStorePassword = value;
   }
   public Long getADGatewayPurgeTime() {
      return ADGatewayPurgeTime;
   }

   public void setADGatewayPurgeTime(Long value) { 
      this.ADGatewayPurgeTime = value;
   }
   public Long getRDLowerLimit() {
      return RDLowerLimit;
   }

   public void setRDLowerLimit(Long value) { 
      this.RDLowerLimit = value;
   }
   public Long getRDPublicNetworkLowerLimit() {
      return RDPublicNetworkLowerLimit;
   }

   public void setRDPublicNetworkLowerLimit(Long value) { 
      this.RDPublicNetworkLowerLimit = value;
   }
   public Long getRDPublicNetworkUpperLimit() {
      return RDPublicNetworkUpperLimit;
   }

   public void setRDPublicNetworkUpperLimit(Long value) { 
      this.RDPublicNetworkUpperLimit = value;
   }
   public Long getRDUpperLimit() {
      return RDUpperLimit;
   }

   public void setRDUpperLimit(Long value) { 
      this.RDUpperLimit = value;
   }
   public Long getDHCPOptionSize() {
      return DHCPOptionSize;
   }

   public void setDHCPOptionSize(Long value) { 
      this.DHCPOptionSize = value;
   }
   public Long getVMCacheSize() {
      return VMCacheSize;
   }

   public void setVMCacheSize(Long value) { 
      this.VMCacheSize = value;
   }
   public Long getVMPurgeTime() {
      return VMPurgeTime;
   }

   public void setVMPurgeTime(Long value) { 
      this.VMPurgeTime = value;
   }
   public Long getVMResyncDeletionWaitTime() {
      return VMResyncDeletionWaitTime;
   }

   public void setVMResyncDeletionWaitTime(Long value) { 
      this.VMResyncDeletionWaitTime = value;
   }
   public Long getVMResyncOutstandingInterval() {
      return VMResyncOutstandingInterval;
   }

   public void setVMResyncOutstandingInterval(Long value) { 
      this.VMResyncOutstandingInterval = value;
   }
   public Long getVMUnreachableCleanupTime() {
      return VMUnreachableCleanupTime;
   }

   public void setVMUnreachableCleanupTime(Long value) { 
      this.VMUnreachableCleanupTime = value;
   }
   public Long getVMUnreachableTime() {
      return VMUnreachableTime;
   }

   public void setVMUnreachableTime(Long value) { 
      this.VMUnreachableTime = value;
   }
   public Long getVNIDLowerLimit() {
      return VNIDLowerLimit;
   }

   public void setVNIDLowerLimit(Long value) { 
      this.VNIDLowerLimit = value;
   }
   public Long getVNIDPublicNetworkLowerLimit() {
      return VNIDPublicNetworkLowerLimit;
   }

   public void setVNIDPublicNetworkLowerLimit(Long value) { 
      this.VNIDPublicNetworkLowerLimit = value;
   }
   public Long getVNIDPublicNetworkUpperLimit() {
      return VNIDPublicNetworkUpperLimit;
   }

   public void setVNIDPublicNetworkUpperLimit(Long value) { 
      this.VNIDPublicNetworkUpperLimit = value;
   }
   public Long getVNIDUpperLimit() {
      return VNIDUpperLimit;
   }

   public void setVNIDUpperLimit(Long value) { 
      this.VNIDUpperLimit = value;
   }
   public Long getAPIKeyRenewalInterval() {
      return APIKeyRenewalInterval;
   }

   public void setAPIKeyRenewalInterval(Long value) { 
      this.APIKeyRenewalInterval = value;
   }
   public Long getAPIKeyValidity() {
      return APIKeyValidity;
   }

   public void setAPIKeyValidity(Long value) { 
      this.APIKeyValidity = value;
   }
   public Long getLRUCacheSizePerSubnet() {
      return LRUCacheSizePerSubnet;
   }

   public void setLRUCacheSizePerSubnet(Long value) { 
      this.LRUCacheSizePerSubnet = value;
   }
   public Boolean getVSCOnSameVersionAsVSD() {
      return VSCOnSameVersionAsVSD;
   }

   public void setVSCOnSameVersionAsVSD(Boolean value) { 
      this.VSCOnSameVersionAsVSD = value;
   }
   public Boolean getVSDReadOnlyMode() {
      return VSDReadOnlyMode;
   }

   public void setVSDReadOnlyMode(Boolean value) { 
      this.VSDReadOnlyMode = value;
   }
   public Boolean getVSDUpgradeIsComplete() {
      return VSDUpgradeIsComplete;
   }

   public void setVSDUpgradeIsComplete(Boolean value) { 
      this.VSDUpgradeIsComplete = value;
   }
   public Long getASNumber() {
      return ASNumber;
   }

   public void setASNumber(Long value) { 
      this.ASNumber = value;
   }
   public Long getRTLowerLimit() {
      return RTLowerLimit;
   }

   public void setRTLowerLimit(Long value) { 
      this.RTLowerLimit = value;
   }
   public Long getRTPublicNetworkLowerLimit() {
      return RTPublicNetworkLowerLimit;
   }

   public void setRTPublicNetworkLowerLimit(Long value) { 
      this.RTPublicNetworkLowerLimit = value;
   }
   public Long getRTPublicNetworkUpperLimit() {
      return RTPublicNetworkUpperLimit;
   }

   public void setRTPublicNetworkUpperLimit(Long value) { 
      this.RTPublicNetworkUpperLimit = value;
   }
   public Long getRTUpperLimit() {
      return RTUpperLimit;
   }

   public void setRTUpperLimit(Long value) { 
      this.RTUpperLimit = value;
   }
   public Long getEVPNBGPCommunityTagASNumber() {
      return EVPNBGPCommunityTagASNumber;
   }

   public void setEVPNBGPCommunityTagASNumber(Long value) { 
      this.EVPNBGPCommunityTagASNumber = value;
   }
   public Long getEVPNBGPCommunityTagLowerLimit() {
      return EVPNBGPCommunityTagLowerLimit;
   }

   public void setEVPNBGPCommunityTagLowerLimit(Long value) { 
      this.EVPNBGPCommunityTagLowerLimit = value;
   }
   public Long getEVPNBGPCommunityTagUpperLimit() {
      return EVPNBGPCommunityTagUpperLimit;
   }

   public void setEVPNBGPCommunityTagUpperLimit(Long value) { 
      this.EVPNBGPCommunityTagUpperLimit = value;
   }
   public Long getPageMaxSize() {
      return pageMaxSize;
   }

   public void setPageMaxSize(Long value) { 
      this.pageMaxSize = value;
   }
   public Long getPageSize() {
      return pageSize;
   }

   public void setPageSize(Long value) { 
      this.pageSize = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public Long getMaxFailedLogins() {
      return maxFailedLogins;
   }

   public void setMaxFailedLogins(Long value) { 
      this.maxFailedLogins = value;
   }
   public Long getMaxResponse() {
      return maxResponse;
   }

   public void setMaxResponse(Long value) { 
      this.maxResponse = value;
   }
   public Long getReflexiveACLTimeout() {
      return reflexiveACLTimeout;
   }

   public void setReflexiveACLTimeout(Long value) { 
      this.reflexiveACLTimeout = value;
   }
   public Long getServiceIDUpperLimit() {
      return serviceIDUpperLimit;
   }

   public void setServiceIDUpperLimit(Long value) { 
      this.serviceIDUpperLimit = value;
   }
   public Boolean getKeyServerMonitorEnabled() {
      return keyServerMonitorEnabled;
   }

   public void setKeyServerMonitorEnabled(Boolean value) { 
      this.keyServerMonitorEnabled = value;
   }
   public Long getKeyServerVSDDataSynchronizationInterval() {
      return keyServerVSDDataSynchronizationInterval;
   }

   public void setKeyServerVSDDataSynchronizationInterval(Long value) { 
      this.keyServerVSDDataSynchronizationInterval = value;
   }
   public Long getOffsetCustomerID() {
      return offsetCustomerID;
   }

   public void setOffsetCustomerID(Long value) { 
      this.offsetCustomerID = value;
   }
   public Long getOffsetServiceID() {
      return offsetServiceID;
   }

   public void setOffsetServiceID(Long value) { 
      this.offsetServiceID = value;
   }
   public String getEjbcaNSGCertificateProfile() {
      return ejbcaNSGCertificateProfile;
   }

   public void setEjbcaNSGCertificateProfile(String value) { 
      this.ejbcaNSGCertificateProfile = value;
   }
   public String getEjbcaNSGEndEntityProfile() {
      return ejbcaNSGEndEntityProfile;
   }

   public void setEjbcaNSGEndEntityProfile(String value) { 
      this.ejbcaNSGEndEntityProfile = value;
   }
   public String getEjbcaOCSPResponderCN() {
      return ejbcaOCSPResponderCN;
   }

   public void setEjbcaOCSPResponderCN(String value) { 
      this.ejbcaOCSPResponderCN = value;
   }
   public String getEjbcaOCSPResponderURI() {
      return ejbcaOCSPResponderURI;
   }

   public void setEjbcaOCSPResponderURI(String value) { 
      this.ejbcaOCSPResponderURI = value;
   }
   public String getEjbcaVspRootCa() {
      return ejbcaVspRootCa;
   }

   public void setEjbcaVspRootCa(String value) { 
      this.ejbcaVspRootCa = value;
   }
   public Long getAlarmsMaxPerObject() {
      return alarmsMaxPerObject;
   }

   public void setAlarmsMaxPerObject(Long value) { 
      this.alarmsMaxPerObject = value;
   }
   public Long getInactiveTimeout() {
      return inactiveTimeout;
   }

   public void setInactiveTimeout(Long value) { 
      this.inactiveTimeout = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public DomainTunnelType getDomainTunnelType() {
      return domainTunnelType;
   }

   public void setDomainTunnelType(DomainTunnelType value) { 
      this.domainTunnelType = value;
   }
   public Long getPostProcessorThreadsCount() {
      return postProcessorThreadsCount;
   }

   public void setPostProcessorThreadsCount(Long value) { 
      this.postProcessorThreadsCount = value;
   }
   public Long getGroupKeyDefaultSEKGenerationInterval() {
      return groupKeyDefaultSEKGenerationInterval;
   }

   public void setGroupKeyDefaultSEKGenerationInterval(Long value) { 
      this.groupKeyDefaultSEKGenerationInterval = value;
   }
   public Long getGroupKeyDefaultSEKLifetime() {
      return groupKeyDefaultSEKLifetime;
   }

   public void setGroupKeyDefaultSEKLifetime(Long value) { 
      this.groupKeyDefaultSEKLifetime = value;
   }
   public GroupKeyDefaultSEKPayloadEncryptionAlgorithm getGroupKeyDefaultSEKPayloadEncryptionAlgorithm() {
      return groupKeyDefaultSEKPayloadEncryptionAlgorithm;
   }

   public void setGroupKeyDefaultSEKPayloadEncryptionAlgorithm(GroupKeyDefaultSEKPayloadEncryptionAlgorithm value) { 
      this.groupKeyDefaultSEKPayloadEncryptionAlgorithm = value;
   }
   public GroupKeyDefaultSEKPayloadSigningAlgorithm getGroupKeyDefaultSEKPayloadSigningAlgorithm() {
      return groupKeyDefaultSEKPayloadSigningAlgorithm;
   }

   public void setGroupKeyDefaultSEKPayloadSigningAlgorithm(GroupKeyDefaultSEKPayloadSigningAlgorithm value) { 
      this.groupKeyDefaultSEKPayloadSigningAlgorithm = value;
   }
   public Long getGroupKeyDefaultSeedGenerationInterval() {
      return groupKeyDefaultSeedGenerationInterval;
   }

   public void setGroupKeyDefaultSeedGenerationInterval(Long value) { 
      this.groupKeyDefaultSeedGenerationInterval = value;
   }
   public Long getGroupKeyDefaultSeedLifetime() {
      return groupKeyDefaultSeedLifetime;
   }

   public void setGroupKeyDefaultSeedLifetime(Long value) { 
      this.groupKeyDefaultSeedLifetime = value;
   }
   public GroupKeyDefaultSeedPayloadAuthenticationAlgorithm getGroupKeyDefaultSeedPayloadAuthenticationAlgorithm() {
      return groupKeyDefaultSeedPayloadAuthenticationAlgorithm;
   }

   public void setGroupKeyDefaultSeedPayloadAuthenticationAlgorithm(GroupKeyDefaultSeedPayloadAuthenticationAlgorithm value) { 
      this.groupKeyDefaultSeedPayloadAuthenticationAlgorithm = value;
   }
   public GroupKeyDefaultSeedPayloadEncryptionAlgorithm getGroupKeyDefaultSeedPayloadEncryptionAlgorithm() {
      return groupKeyDefaultSeedPayloadEncryptionAlgorithm;
   }

   public void setGroupKeyDefaultSeedPayloadEncryptionAlgorithm(GroupKeyDefaultSeedPayloadEncryptionAlgorithm value) { 
      this.groupKeyDefaultSeedPayloadEncryptionAlgorithm = value;
   }
   public GroupKeyDefaultSeedPayloadSigningAlgorithm getGroupKeyDefaultSeedPayloadSigningAlgorithm() {
      return groupKeyDefaultSeedPayloadSigningAlgorithm;
   }

   public void setGroupKeyDefaultSeedPayloadSigningAlgorithm(GroupKeyDefaultSeedPayloadSigningAlgorithm value) { 
      this.groupKeyDefaultSeedPayloadSigningAlgorithm = value;
   }
   public GroupKeyDefaultTrafficAuthenticationAlgorithm getGroupKeyDefaultTrafficAuthenticationAlgorithm() {
      return groupKeyDefaultTrafficAuthenticationAlgorithm;
   }

   public void setGroupKeyDefaultTrafficAuthenticationAlgorithm(GroupKeyDefaultTrafficAuthenticationAlgorithm value) { 
      this.groupKeyDefaultTrafficAuthenticationAlgorithm = value;
   }
   public GroupKeyDefaultTrafficEncryptionAlgorithm getGroupKeyDefaultTrafficEncryptionAlgorithm() {
      return groupKeyDefaultTrafficEncryptionAlgorithm;
   }

   public void setGroupKeyDefaultTrafficEncryptionAlgorithm(GroupKeyDefaultTrafficEncryptionAlgorithm value) { 
      this.groupKeyDefaultTrafficEncryptionAlgorithm = value;
   }
   public Long getGroupKeyDefaultTrafficEncryptionKeyLifetime() {
      return groupKeyDefaultTrafficEncryptionKeyLifetime;
   }

   public void setGroupKeyDefaultTrafficEncryptionKeyLifetime(Long value) { 
      this.groupKeyDefaultTrafficEncryptionKeyLifetime = value;
   }
   public Long getGroupKeyGenerationIntervalOnForcedReKey() {
      return groupKeyGenerationIntervalOnForcedReKey;
   }

   public void setGroupKeyGenerationIntervalOnForcedReKey(Long value) { 
      this.groupKeyGenerationIntervalOnForcedReKey = value;
   }
   public Long getGroupKeyGenerationIntervalOnRevoke() {
      return groupKeyGenerationIntervalOnRevoke;
   }

   public void setGroupKeyGenerationIntervalOnRevoke(Long value) { 
      this.groupKeyGenerationIntervalOnRevoke = value;
   }
   public Long getGroupKeyMinimumSEKGenerationInterval() {
      return groupKeyMinimumSEKGenerationInterval;
   }

   public void setGroupKeyMinimumSEKGenerationInterval(Long value) { 
      this.groupKeyMinimumSEKGenerationInterval = value;
   }
   public Long getGroupKeyMinimumSEKLifetime() {
      return groupKeyMinimumSEKLifetime;
   }

   public void setGroupKeyMinimumSEKLifetime(Long value) { 
      this.groupKeyMinimumSEKLifetime = value;
   }
   public Long getGroupKeyMinimumSeedGenerationInterval() {
      return groupKeyMinimumSeedGenerationInterval;
   }

   public void setGroupKeyMinimumSeedGenerationInterval(Long value) { 
      this.groupKeyMinimumSeedGenerationInterval = value;
   }
   public Long getGroupKeyMinimumSeedLifetime() {
      return groupKeyMinimumSeedLifetime;
   }

   public void setGroupKeyMinimumSeedLifetime(Long value) { 
      this.groupKeyMinimumSeedLifetime = value;
   }
   public Long getGroupKeyMinimumTrafficEncryptionKeyLifetime() {
      return groupKeyMinimumTrafficEncryptionKeyLifetime;
   }

   public void setGroupKeyMinimumTrafficEncryptionKeyLifetime(Long value) { 
      this.groupKeyMinimumTrafficEncryptionKeyLifetime = value;
   }
   public String getNsgBootstrapEndpoint() {
      return nsgBootstrapEndpoint;
   }

   public void setNsgBootstrapEndpoint(String value) { 
      this.nsgBootstrapEndpoint = value;
   }
   public String getNsgConfigEndpoint() {
      return nsgConfigEndpoint;
   }

   public void setNsgConfigEndpoint(String value) { 
      this.nsgConfigEndpoint = value;
   }
   public String getNsgLocalUiUrl() {
      return nsgLocalUiUrl;
   }

   public void setNsgLocalUiUrl(String value) { 
      this.nsgLocalUiUrl = value;
   }
   public Long getEsiID() {
      return esiID;
   }

   public void setEsiID(Long value) { 
      this.esiID = value;
   }
   public Boolean getStackTraceEnabled() {
      return stackTraceEnabled;
   }

   public void setStackTraceEnabled(Boolean value) { 
      this.stackTraceEnabled = value;
   }
   public Long getStaticWANServicePurgeTime() {
      return staticWANServicePurgeTime;
   }

   public void setStaticWANServicePurgeTime(Long value) { 
      this.staticWANServicePurgeTime = value;
   }
   public String getStatsCollectorAddress() {
      return statsCollectorAddress;
   }

   public void setStatsCollectorAddress(String value) { 
      this.statsCollectorAddress = value;
   }
   public String getStatsCollectorPort() {
      return statsCollectorPort;
   }

   public void setStatsCollectorPort(String value) { 
      this.statsCollectorPort = value;
   }
   public String getStatsCollectorProtoBufPort() {
      return statsCollectorProtoBufPort;
   }

   public void setStatsCollectorProtoBufPort(String value) { 
      this.statsCollectorProtoBufPort = value;
   }
   public Long getStatsMaxDataPoints() {
      return statsMaxDataPoints;
   }

   public void setStatsMaxDataPoints(Long value) { 
      this.statsMaxDataPoints = value;
   }
   public Long getStatsMinDuration() {
      return statsMinDuration;
   }

   public void setStatsMinDuration(Long value) { 
      this.statsMinDuration = value;
   }
   public Long getStatsNumberOfDataPoints() {
      return statsNumberOfDataPoints;
   }

   public void setStatsNumberOfDataPoints(Long value) { 
      this.statsNumberOfDataPoints = value;
   }
   public String getStatsTSDBServerAddress() {
      return statsTSDBServerAddress;
   }

   public void setStatsTSDBServerAddress(String value) { 
      this.statsTSDBServerAddress = value;
   }
   public Long getSubnetResyncInterval() {
      return subnetResyncInterval;
   }

   public void setSubnetResyncInterval(Long value) { 
      this.subnetResyncInterval = value;
   }
   public Long getSubnetResyncOutstandingInterval() {
      return subnetResyncOutstandingInterval;
   }

   public void setSubnetResyncOutstandingInterval(Long value) { 
      this.subnetResyncOutstandingInterval = value;
   }
   public Long getCustomerIDUpperLimit() {
      return customerIDUpperLimit;
   }

   public void setCustomerIDUpperLimit(Long value) { 
      this.customerIDUpperLimit = value;
   }
   public String getCustomerKey() {
      return customerKey;
   }

   public void setCustomerKey(String value) { 
      this.customerKey = value;
   }
   public String getAvatarBasePath() {
      return avatarBasePath;
   }

   public void setAvatarBasePath(String value) { 
      this.avatarBasePath = value;
   }
   public String getAvatarBaseURL() {
      return avatarBaseURL;
   }

   public void setAvatarBaseURL(String value) { 
      this.avatarBaseURL = value;
   }
   public Long getEventLogCleanupInterval() {
      return eventLogCleanupInterval;
   }

   public void setEventLogCleanupInterval(Long value) { 
      this.eventLogCleanupInterval = value;
   }
   public Long getEventLogEntryMaxAge() {
      return eventLogEntryMaxAge;
   }

   public void setEventLogEntryMaxAge(Long value) { 
      this.eventLogEntryMaxAge = value;
   }
   public Long getEventProcessorInterval() {
      return eventProcessorInterval;
   }

   public void setEventProcessorInterval(Long value) { 
      this.eventProcessorInterval = value;
   }
   public Long getEventProcessorMaxEventsCount() {
      return eventProcessorMaxEventsCount;
   }

   public void setEventProcessorMaxEventsCount(Long value) { 
      this.eventProcessorMaxEventsCount = value;
   }
   public Long getEventProcessorTimeout() {
      return eventProcessorTimeout;
   }

   public void setEventProcessorTimeout(Long value) { 
      this.eventProcessorTimeout = value;
   }
   public Long getTwoFactorCodeExpiry() {
      return twoFactorCodeExpiry;
   }

   public void setTwoFactorCodeExpiry(Long value) { 
      this.twoFactorCodeExpiry = value;
   }
   public Long getTwoFactorCodeLength() {
      return twoFactorCodeLength;
   }

   public void setTwoFactorCodeLength(Long value) { 
      this.twoFactorCodeLength = value;
   }
   public Long getTwoFactorCodeSeedLength() {
      return twoFactorCodeSeedLength;
   }

   public void setTwoFactorCodeSeedLength(Long value) { 
      this.twoFactorCodeSeedLength = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public Long getDynamicWANServiceDiffTime() {
      return dynamicWANServiceDiffTime;
   }

   public void setDynamicWANServiceDiffTime(Long value) { 
      this.dynamicWANServiceDiffTime = value;
   }
   public String getSyslogDestinationHost() {
      return syslogDestinationHost;
   }

   public void setSyslogDestinationHost(String value) { 
      this.syslogDestinationHost = value;
   }
   public Long getSyslogDestinationPort() {
      return syslogDestinationPort;
   }

   public void setSyslogDestinationPort(Long value) { 
      this.syslogDestinationPort = value;
   }
   public Long getSysmonCleanupTaskInterval() {
      return sysmonCleanupTaskInterval;
   }

   public void setSysmonCleanupTaskInterval(Long value) { 
      this.sysmonCleanupTaskInterval = value;
   }
   public Long getSysmonNodePresenceTimeout() {
      return sysmonNodePresenceTimeout;
   }

   public void setSysmonNodePresenceTimeout(Long value) { 
      this.sysmonNodePresenceTimeout = value;
   }
   public Long getSysmonProbeResponseTimeout() {
      return sysmonProbeResponseTimeout;
   }

   public void setSysmonProbeResponseTimeout(Long value) { 
      this.sysmonProbeResponseTimeout = value;
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
      return "SystemConfig [" + "ACLAllowOrigin=" + ACLAllowOrigin + ", ECMPCount=" + ECMPCount + ", LDAPSyncInterval=" + LDAPSyncInterval + ", LDAPTrustStoreCertifcate=" + LDAPTrustStoreCertifcate + ", LDAPTrustStorePassword=" + LDAPTrustStorePassword + ", ADGatewayPurgeTime=" + ADGatewayPurgeTime + ", RDLowerLimit=" + RDLowerLimit + ", RDPublicNetworkLowerLimit=" + RDPublicNetworkLowerLimit + ", RDPublicNetworkUpperLimit=" + RDPublicNetworkUpperLimit + ", RDUpperLimit=" + RDUpperLimit + ", DHCPOptionSize=" + DHCPOptionSize + ", VMCacheSize=" + VMCacheSize + ", VMPurgeTime=" + VMPurgeTime + ", VMResyncDeletionWaitTime=" + VMResyncDeletionWaitTime + ", VMResyncOutstandingInterval=" + VMResyncOutstandingInterval + ", VMUnreachableCleanupTime=" + VMUnreachableCleanupTime + ", VMUnreachableTime=" + VMUnreachableTime + ", VNIDLowerLimit=" + VNIDLowerLimit + ", VNIDPublicNetworkLowerLimit=" + VNIDPublicNetworkLowerLimit + ", VNIDPublicNetworkUpperLimit=" + VNIDPublicNetworkUpperLimit + ", VNIDUpperLimit=" + VNIDUpperLimit + ", APIKeyRenewalInterval=" + APIKeyRenewalInterval + ", APIKeyValidity=" + APIKeyValidity + ", LRUCacheSizePerSubnet=" + LRUCacheSizePerSubnet + ", VSCOnSameVersionAsVSD=" + VSCOnSameVersionAsVSD + ", VSDReadOnlyMode=" + VSDReadOnlyMode + ", VSDUpgradeIsComplete=" + VSDUpgradeIsComplete + ", ASNumber=" + ASNumber + ", RTLowerLimit=" + RTLowerLimit + ", RTPublicNetworkLowerLimit=" + RTPublicNetworkLowerLimit + ", RTPublicNetworkUpperLimit=" + RTPublicNetworkUpperLimit + ", RTUpperLimit=" + RTUpperLimit + ", EVPNBGPCommunityTagASNumber=" + EVPNBGPCommunityTagASNumber + ", EVPNBGPCommunityTagLowerLimit=" + EVPNBGPCommunityTagLowerLimit + ", EVPNBGPCommunityTagUpperLimit=" + EVPNBGPCommunityTagUpperLimit + ", pageMaxSize=" + pageMaxSize + ", pageSize=" + pageSize + ", lastUpdatedBy=" + lastUpdatedBy + ", maxFailedLogins=" + maxFailedLogins + ", maxResponse=" + maxResponse + ", reflexiveACLTimeout=" + reflexiveACLTimeout + ", serviceIDUpperLimit=" + serviceIDUpperLimit + ", keyServerMonitorEnabled=" + keyServerMonitorEnabled + ", keyServerVSDDataSynchronizationInterval=" + keyServerVSDDataSynchronizationInterval + ", offsetCustomerID=" + offsetCustomerID + ", offsetServiceID=" + offsetServiceID + ", ejbcaNSGCertificateProfile=" + ejbcaNSGCertificateProfile + ", ejbcaNSGEndEntityProfile=" + ejbcaNSGEndEntityProfile + ", ejbcaOCSPResponderCN=" + ejbcaOCSPResponderCN + ", ejbcaOCSPResponderURI=" + ejbcaOCSPResponderURI + ", ejbcaVspRootCa=" + ejbcaVspRootCa + ", alarmsMaxPerObject=" + alarmsMaxPerObject + ", inactiveTimeout=" + inactiveTimeout + ", entityScope=" + entityScope + ", domainTunnelType=" + domainTunnelType + ", postProcessorThreadsCount=" + postProcessorThreadsCount + ", groupKeyDefaultSEKGenerationInterval=" + groupKeyDefaultSEKGenerationInterval + ", groupKeyDefaultSEKLifetime=" + groupKeyDefaultSEKLifetime + ", groupKeyDefaultSEKPayloadEncryptionAlgorithm=" + groupKeyDefaultSEKPayloadEncryptionAlgorithm + ", groupKeyDefaultSEKPayloadSigningAlgorithm=" + groupKeyDefaultSEKPayloadSigningAlgorithm + ", groupKeyDefaultSeedGenerationInterval=" + groupKeyDefaultSeedGenerationInterval + ", groupKeyDefaultSeedLifetime=" + groupKeyDefaultSeedLifetime + ", groupKeyDefaultSeedPayloadAuthenticationAlgorithm=" + groupKeyDefaultSeedPayloadAuthenticationAlgorithm + ", groupKeyDefaultSeedPayloadEncryptionAlgorithm=" + groupKeyDefaultSeedPayloadEncryptionAlgorithm + ", groupKeyDefaultSeedPayloadSigningAlgorithm=" + groupKeyDefaultSeedPayloadSigningAlgorithm + ", groupKeyDefaultTrafficAuthenticationAlgorithm=" + groupKeyDefaultTrafficAuthenticationAlgorithm + ", groupKeyDefaultTrafficEncryptionAlgorithm=" + groupKeyDefaultTrafficEncryptionAlgorithm + ", groupKeyDefaultTrafficEncryptionKeyLifetime=" + groupKeyDefaultTrafficEncryptionKeyLifetime + ", groupKeyGenerationIntervalOnForcedReKey=" + groupKeyGenerationIntervalOnForcedReKey + ", groupKeyGenerationIntervalOnRevoke=" + groupKeyGenerationIntervalOnRevoke + ", groupKeyMinimumSEKGenerationInterval=" + groupKeyMinimumSEKGenerationInterval + ", groupKeyMinimumSEKLifetime=" + groupKeyMinimumSEKLifetime + ", groupKeyMinimumSeedGenerationInterval=" + groupKeyMinimumSeedGenerationInterval + ", groupKeyMinimumSeedLifetime=" + groupKeyMinimumSeedLifetime + ", groupKeyMinimumTrafficEncryptionKeyLifetime=" + groupKeyMinimumTrafficEncryptionKeyLifetime + ", nsgBootstrapEndpoint=" + nsgBootstrapEndpoint + ", nsgConfigEndpoint=" + nsgConfigEndpoint + ", nsgLocalUiUrl=" + nsgLocalUiUrl + ", esiID=" + esiID + ", stackTraceEnabled=" + stackTraceEnabled + ", staticWANServicePurgeTime=" + staticWANServicePurgeTime + ", statsCollectorAddress=" + statsCollectorAddress + ", statsCollectorPort=" + statsCollectorPort + ", statsCollectorProtoBufPort=" + statsCollectorProtoBufPort + ", statsMaxDataPoints=" + statsMaxDataPoints + ", statsMinDuration=" + statsMinDuration + ", statsNumberOfDataPoints=" + statsNumberOfDataPoints + ", statsTSDBServerAddress=" + statsTSDBServerAddress + ", subnetResyncInterval=" + subnetResyncInterval + ", subnetResyncOutstandingInterval=" + subnetResyncOutstandingInterval + ", customerIDUpperLimit=" + customerIDUpperLimit + ", customerKey=" + customerKey + ", avatarBasePath=" + avatarBasePath + ", avatarBaseURL=" + avatarBaseURL + ", eventLogCleanupInterval=" + eventLogCleanupInterval + ", eventLogEntryMaxAge=" + eventLogEntryMaxAge + ", eventProcessorInterval=" + eventProcessorInterval + ", eventProcessorMaxEventsCount=" + eventProcessorMaxEventsCount + ", eventProcessorTimeout=" + eventProcessorTimeout + ", twoFactorCodeExpiry=" + twoFactorCodeExpiry + ", twoFactorCodeLength=" + twoFactorCodeLength + ", twoFactorCodeSeedLength=" + twoFactorCodeSeedLength + ", externalID=" + externalID + ", dynamicWANServiceDiffTime=" + dynamicWANServiceDiffTime + ", syslogDestinationHost=" + syslogDestinationHost + ", syslogDestinationPort=" + syslogDestinationPort + ", sysmonCleanupTaskInterval=" + sysmonCleanupTaskInterval + ", sysmonNodePresenceTimeout=" + sysmonNodePresenceTimeout + ", sysmonProbeResponseTimeout=" + sysmonProbeResponseTimeout + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}