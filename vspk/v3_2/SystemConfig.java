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


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemConfig extends RestObject {

   public final static String REST_NAME = "systemconfig";
   public final static String RESOURCE_NAME = "systemconfigs";

   
   public enum DomainTunnelType { DC_DEFAULT, GRE, VXLAN };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum GroupKeyDefaultSEKPayloadEncryptionAlgorithm { RSA_1024 };
   public enum GroupKeyDefaultSEKPayloadSigningAlgorithm { SHA1WITHRSA, SHA224WITHRSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA };
   public enum GroupKeyDefaultSeedPayloadAuthenticationAlgorithm { HMAC_SHA1, HMAC_SHA256, HMAC_SHA512 };
   public enum GroupKeyDefaultSeedPayloadEncryptionAlgorithm { AES_128_CBC, AES_256_CBC, TRIPLE_DES_CBC };
   public enum GroupKeyDefaultSeedPayloadSigningAlgorithm { SHA1WITHRSA, SHA224WITHRSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA };
   public enum GroupKeyDefaultTrafficAuthenticationAlgorithm { HMAC_MD5, HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512 };
   public enum GroupKeyDefaultTrafficEncryptionAlgorithm { AES_128_CBC, AES_192_CBC, AES_256_CBC, TRIPLE_DES_CBC };

   
   @JsonProperty(value = "ACLAllowOrigin")
   protected String ACLAllowOrigin;
   
   @JsonProperty(value = "ADGatewayPurgeTime")
   protected int ADGatewayPurgeTime;
   
   @JsonProperty(value = "APIKeyRenewalInterval")
   protected int APIKeyRenewalInterval;
   
   @JsonProperty(value = "APIKeyValidity")
   protected int APIKeyValidity;
   
   @JsonProperty(value = "ASNumber")
   protected int ASNumber;
   
   @JsonProperty(value = "DHCPOptionSize")
   protected int DHCPOptionSize;
   
   @JsonProperty(value = "ECMPCount")
   protected int ECMPCount;
   
   @JsonProperty(value = "EVPNBGPCommunityTagASNumber")
   protected int EVPNBGPCommunityTagASNumber;
   
   @JsonProperty(value = "EVPNBGPCommunityTagLowerLimit")
   protected int EVPNBGPCommunityTagLowerLimit;
   
   @JsonProperty(value = "EVPNBGPCommunityTagUpperLimit")
   protected int EVPNBGPCommunityTagUpperLimit;
   
   @JsonProperty(value = "LDAPSyncInterval")
   protected int LDAPSyncInterval;
   
   @JsonProperty(value = "LDAPTrustStoreCertifcate")
   protected String LDAPTrustStoreCertifcate;
   
   @JsonProperty(value = "LDAPTrustStorePassword")
   protected String LDAPTrustStorePassword;
   
   @JsonProperty(value = "LRUCacheSizePerSubnet")
   protected int LRUCacheSizePerSubnet;
   
   @JsonProperty(value = "RDLowerLimit")
   protected int RDLowerLimit;
   
   @JsonProperty(value = "RDPublicNetworkLowerLimit")
   protected int RDPublicNetworkLowerLimit;
   
   @JsonProperty(value = "RDPublicNetworkUpperLimit")
   protected int RDPublicNetworkUpperLimit;
   
   @JsonProperty(value = "RDUpperLimit")
   protected int RDUpperLimit;
   
   @JsonProperty(value = "RTLowerLimit")
   protected int RTLowerLimit;
   
   @JsonProperty(value = "RTPublicNetworkLowerLimit")
   protected int RTPublicNetworkLowerLimit;
   
   @JsonProperty(value = "RTPublicNetworkUpperLimit")
   protected int RTPublicNetworkUpperLimit;
   
   @JsonProperty(value = "RTUpperLimit")
   protected int RTUpperLimit;
   
   @JsonProperty(value = "VMCacheSize")
   protected int VMCacheSize;
   
   @JsonProperty(value = "VMPurgeTime")
   protected int VMPurgeTime;
   
   @JsonProperty(value = "VMResyncDeletionWaitTime")
   protected int VMResyncDeletionWaitTime;
   
   @JsonProperty(value = "VMResyncOutstandingInterval")
   protected int VMResyncOutstandingInterval;
   
   @JsonProperty(value = "VMUnreachableCleanupTime")
   protected int VMUnreachableCleanupTime;
   
   @JsonProperty(value = "VMUnreachableTime")
   protected int VMUnreachableTime;
   
   @JsonProperty(value = "VNIDLowerLimit")
   protected int VNIDLowerLimit;
   
   @JsonProperty(value = "VNIDPublicNetworkLowerLimit")
   protected int VNIDPublicNetworkLowerLimit;
   
   @JsonProperty(value = "VNIDPublicNetworkUpperLimit")
   protected int VNIDPublicNetworkUpperLimit;
   
   @JsonProperty(value = "VNIDUpperLimit")
   protected int VNIDUpperLimit;
   
   @JsonProperty(value = "VSCOnSameVersionAsVSD")
   protected boolean VSCOnSameVersionAsVSD;
   
   @JsonProperty(value = "VSDReadOnlyMode")
   protected boolean VSDReadOnlyMode;
   
   @JsonProperty(value = "VSDUpgradeIsComplete")
   protected boolean VSDUpgradeIsComplete;
   
   @JsonProperty(value = "alarmsMaxPerObject")
   protected int alarmsMaxPerObject;
   
   @JsonProperty(value = "avatarBasePath")
   protected String avatarBasePath;
   
   @JsonProperty(value = "avatarBaseURL")
   protected String avatarBaseURL;
   
   @JsonProperty(value = "customerIDUpperLimit")
   protected int customerIDUpperLimit;
   
   @JsonProperty(value = "customerKey")
   protected String customerKey;
   
   @JsonProperty(value = "domainTunnelType")
   protected DomainTunnelType domainTunnelType;
   
   @JsonProperty(value = "dynamicWANServiceDiffTime")
   protected int dynamicWANServiceDiffTime;
   
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
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "esiID")
   protected int esiID;
   
   @JsonProperty(value = "eventLogCleanupInterval")
   protected int eventLogCleanupInterval;
   
   @JsonProperty(value = "eventLogEntryMaxAge")
   protected int eventLogEntryMaxAge;
   
   @JsonProperty(value = "eventProcessorInterval")
   protected int eventProcessorInterval;
   
   @JsonProperty(value = "eventProcessorMaxEventsCount")
   protected int eventProcessorMaxEventsCount;
   
   @JsonProperty(value = "eventProcessorTimeout")
   protected int eventProcessorTimeout;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "groupKeyDefaultSEKGenerationInterval")
   protected int groupKeyDefaultSEKGenerationInterval;
   
   @JsonProperty(value = "groupKeyDefaultSEKLifetime")
   protected int groupKeyDefaultSEKLifetime;
   
   @JsonProperty(value = "groupKeyDefaultSEKPayloadEncryptionAlgorithm")
   protected GroupKeyDefaultSEKPayloadEncryptionAlgorithm groupKeyDefaultSEKPayloadEncryptionAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSEKPayloadSigningAlgorithm")
   protected GroupKeyDefaultSEKPayloadSigningAlgorithm groupKeyDefaultSEKPayloadSigningAlgorithm;
   
   @JsonProperty(value = "groupKeyDefaultSeedGenerationInterval")
   protected int groupKeyDefaultSeedGenerationInterval;
   
   @JsonProperty(value = "groupKeyDefaultSeedLifetime")
   protected int groupKeyDefaultSeedLifetime;
   
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
   protected int groupKeyDefaultTrafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "groupKeyGenerationIntervalOnForcedReKey")
   protected int groupKeyGenerationIntervalOnForcedReKey;
   
   @JsonProperty(value = "groupKeyGenerationIntervalOnRevoke")
   protected int groupKeyGenerationIntervalOnRevoke;
   
   @JsonProperty(value = "groupKeyMinimumSEKGenerationInterval")
   protected int groupKeyMinimumSEKGenerationInterval;
   
   @JsonProperty(value = "groupKeyMinimumSEKLifetime")
   protected int groupKeyMinimumSEKLifetime;
   
   @JsonProperty(value = "groupKeyMinimumSeedGenerationInterval")
   protected int groupKeyMinimumSeedGenerationInterval;
   
   @JsonProperty(value = "groupKeyMinimumSeedLifetime")
   protected int groupKeyMinimumSeedLifetime;
   
   @JsonProperty(value = "groupKeyMinimumTrafficEncryptionKeyLifetime")
   protected int groupKeyMinimumTrafficEncryptionKeyLifetime;
   
   @JsonProperty(value = "inactiveTimeout")
   protected int inactiveTimeout;
   
   @JsonProperty(value = "keyServerMonitorEnabled")
   protected boolean keyServerMonitorEnabled;
   
   @JsonProperty(value = "keyServerVSDDataSynchronizationInterval")
   protected int keyServerVSDDataSynchronizationInterval;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "maxFailedLogins")
   protected int maxFailedLogins;
   
   @JsonProperty(value = "maxResponse")
   protected int maxResponse;
   
   @JsonProperty(value = "nsgBootstrapEndpoint")
   protected String nsgBootstrapEndpoint;
   
   @JsonProperty(value = "nsgConfigEndpoint")
   protected String nsgConfigEndpoint;
   
   @JsonProperty(value = "nsgLocalUiUrl")
   protected String nsgLocalUiUrl;
   
   @JsonProperty(value = "offsetCustomerID")
   protected int offsetCustomerID;
   
   @JsonProperty(value = "offsetServiceID")
   protected int offsetServiceID;
   
   @JsonProperty(value = "pageMaxSize")
   protected int pageMaxSize;
   
   @JsonProperty(value = "pageSize")
   protected int pageSize;
   
   @JsonProperty(value = "postProcessorThreadsCount")
   protected int postProcessorThreadsCount;
   
   @JsonProperty(value = "reflexiveACLTimeout")
   protected int reflexiveACLTimeout;
   
   @JsonProperty(value = "serviceIDUpperLimit")
   protected int serviceIDUpperLimit;
   
   @JsonProperty(value = "stackTraceEnabled")
   protected boolean stackTraceEnabled;
   
   @JsonProperty(value = "staticWANServicePurgeTime")
   protected int staticWANServicePurgeTime;
   
   @JsonProperty(value = "statsCollectorAddress")
   protected String statsCollectorAddress;
   
   @JsonProperty(value = "statsCollectorPort")
   protected String statsCollectorPort;
   
   @JsonProperty(value = "statsCollectorProtoBufPort")
   protected String statsCollectorProtoBufPort;
   
   @JsonProperty(value = "statsMaxDataPoints")
   protected int statsMaxDataPoints;
   
   @JsonProperty(value = "statsMinDuration")
   protected int statsMinDuration;
   
   @JsonProperty(value = "statsNumberOfDataPoints")
   protected int statsNumberOfDataPoints;
   
   @JsonProperty(value = "statsTSDBServerAddress")
   protected String statsTSDBServerAddress;
   
   @JsonProperty(value = "subnetResyncInterval")
   protected int subnetResyncInterval;
   
   @JsonProperty(value = "subnetResyncOutstandingInterval")
   protected int subnetResyncOutstandingInterval;
   
   @JsonProperty(value = "syslogDestinationHost")
   protected String syslogDestinationHost;
   
   @JsonProperty(value = "syslogDestinationPort")
   protected int syslogDestinationPort;
   
   @JsonProperty(value = "sysmonCleanupTaskInterval")
   protected int sysmonCleanupTaskInterval;
   
   @JsonProperty(value = "sysmonNodePresenceTimeout")
   protected int sysmonNodePresenceTimeout;
   
   @JsonProperty(value = "sysmonProbeResponseTimeout")
   protected int sysmonProbeResponseTimeout;
   
   @JsonProperty(value = "twoFactorCodeExpiry")
   protected int twoFactorCodeExpiry;
   
   @JsonProperty(value = "twoFactorCodeLength")
   protected int twoFactorCodeLength;
   
   @JsonProperty(value = "twoFactorCodeSeedLength")
   protected int twoFactorCodeSeedLength;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public SystemConfig() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public String getACLAllowOrigin() {
      return ACLAllowOrigin;
   }

   public void setACLAllowOrigin(String value) { 
      this.ACLAllowOrigin = value;
   }
   public int getADGatewayPurgeTime() {
      return ADGatewayPurgeTime;
   }

   public void setADGatewayPurgeTime(int value) { 
      this.ADGatewayPurgeTime = value;
   }
   public int getAPIKeyRenewalInterval() {
      return APIKeyRenewalInterval;
   }

   public void setAPIKeyRenewalInterval(int value) { 
      this.APIKeyRenewalInterval = value;
   }
   public int getAPIKeyValidity() {
      return APIKeyValidity;
   }

   public void setAPIKeyValidity(int value) { 
      this.APIKeyValidity = value;
   }
   public int getASNumber() {
      return ASNumber;
   }

   public void setASNumber(int value) { 
      this.ASNumber = value;
   }
   public int getDHCPOptionSize() {
      return DHCPOptionSize;
   }

   public void setDHCPOptionSize(int value) { 
      this.DHCPOptionSize = value;
   }
   public int getECMPCount() {
      return ECMPCount;
   }

   public void setECMPCount(int value) { 
      this.ECMPCount = value;
   }
   public int getEVPNBGPCommunityTagASNumber() {
      return EVPNBGPCommunityTagASNumber;
   }

   public void setEVPNBGPCommunityTagASNumber(int value) { 
      this.EVPNBGPCommunityTagASNumber = value;
   }
   public int getEVPNBGPCommunityTagLowerLimit() {
      return EVPNBGPCommunityTagLowerLimit;
   }

   public void setEVPNBGPCommunityTagLowerLimit(int value) { 
      this.EVPNBGPCommunityTagLowerLimit = value;
   }
   public int getEVPNBGPCommunityTagUpperLimit() {
      return EVPNBGPCommunityTagUpperLimit;
   }

   public void setEVPNBGPCommunityTagUpperLimit(int value) { 
      this.EVPNBGPCommunityTagUpperLimit = value;
   }
   public int getLDAPSyncInterval() {
      return LDAPSyncInterval;
   }

   public void setLDAPSyncInterval(int value) { 
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
   public int getLRUCacheSizePerSubnet() {
      return LRUCacheSizePerSubnet;
   }

   public void setLRUCacheSizePerSubnet(int value) { 
      this.LRUCacheSizePerSubnet = value;
   }
   public int getRDLowerLimit() {
      return RDLowerLimit;
   }

   public void setRDLowerLimit(int value) { 
      this.RDLowerLimit = value;
   }
   public int getRDPublicNetworkLowerLimit() {
      return RDPublicNetworkLowerLimit;
   }

   public void setRDPublicNetworkLowerLimit(int value) { 
      this.RDPublicNetworkLowerLimit = value;
   }
   public int getRDPublicNetworkUpperLimit() {
      return RDPublicNetworkUpperLimit;
   }

   public void setRDPublicNetworkUpperLimit(int value) { 
      this.RDPublicNetworkUpperLimit = value;
   }
   public int getRDUpperLimit() {
      return RDUpperLimit;
   }

   public void setRDUpperLimit(int value) { 
      this.RDUpperLimit = value;
   }
   public int getRTLowerLimit() {
      return RTLowerLimit;
   }

   public void setRTLowerLimit(int value) { 
      this.RTLowerLimit = value;
   }
   public int getRTPublicNetworkLowerLimit() {
      return RTPublicNetworkLowerLimit;
   }

   public void setRTPublicNetworkLowerLimit(int value) { 
      this.RTPublicNetworkLowerLimit = value;
   }
   public int getRTPublicNetworkUpperLimit() {
      return RTPublicNetworkUpperLimit;
   }

   public void setRTPublicNetworkUpperLimit(int value) { 
      this.RTPublicNetworkUpperLimit = value;
   }
   public int getRTUpperLimit() {
      return RTUpperLimit;
   }

   public void setRTUpperLimit(int value) { 
      this.RTUpperLimit = value;
   }
   public int getVMCacheSize() {
      return VMCacheSize;
   }

   public void setVMCacheSize(int value) { 
      this.VMCacheSize = value;
   }
   public int getVMPurgeTime() {
      return VMPurgeTime;
   }

   public void setVMPurgeTime(int value) { 
      this.VMPurgeTime = value;
   }
   public int getVMResyncDeletionWaitTime() {
      return VMResyncDeletionWaitTime;
   }

   public void setVMResyncDeletionWaitTime(int value) { 
      this.VMResyncDeletionWaitTime = value;
   }
   public int getVMResyncOutstandingInterval() {
      return VMResyncOutstandingInterval;
   }

   public void setVMResyncOutstandingInterval(int value) { 
      this.VMResyncOutstandingInterval = value;
   }
   public int getVMUnreachableCleanupTime() {
      return VMUnreachableCleanupTime;
   }

   public void setVMUnreachableCleanupTime(int value) { 
      this.VMUnreachableCleanupTime = value;
   }
   public int getVMUnreachableTime() {
      return VMUnreachableTime;
   }

   public void setVMUnreachableTime(int value) { 
      this.VMUnreachableTime = value;
   }
   public int getVNIDLowerLimit() {
      return VNIDLowerLimit;
   }

   public void setVNIDLowerLimit(int value) { 
      this.VNIDLowerLimit = value;
   }
   public int getVNIDPublicNetworkLowerLimit() {
      return VNIDPublicNetworkLowerLimit;
   }

   public void setVNIDPublicNetworkLowerLimit(int value) { 
      this.VNIDPublicNetworkLowerLimit = value;
   }
   public int getVNIDPublicNetworkUpperLimit() {
      return VNIDPublicNetworkUpperLimit;
   }

   public void setVNIDPublicNetworkUpperLimit(int value) { 
      this.VNIDPublicNetworkUpperLimit = value;
   }
   public int getVNIDUpperLimit() {
      return VNIDUpperLimit;
   }

   public void setVNIDUpperLimit(int value) { 
      this.VNIDUpperLimit = value;
   }
   public boolean getVSCOnSameVersionAsVSD() {
      return VSCOnSameVersionAsVSD;
   }

   public void setVSCOnSameVersionAsVSD(boolean value) { 
      this.VSCOnSameVersionAsVSD = value;
   }
   public boolean getVSDReadOnlyMode() {
      return VSDReadOnlyMode;
   }

   public void setVSDReadOnlyMode(boolean value) { 
      this.VSDReadOnlyMode = value;
   }
   public boolean getVSDUpgradeIsComplete() {
      return VSDUpgradeIsComplete;
   }

   public void setVSDUpgradeIsComplete(boolean value) { 
      this.VSDUpgradeIsComplete = value;
   }
   public int getAlarmsMaxPerObject() {
      return alarmsMaxPerObject;
   }

   public void setAlarmsMaxPerObject(int value) { 
      this.alarmsMaxPerObject = value;
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
   public int getCustomerIDUpperLimit() {
      return customerIDUpperLimit;
   }

   public void setCustomerIDUpperLimit(int value) { 
      this.customerIDUpperLimit = value;
   }
   public String getCustomerKey() {
      return customerKey;
   }

   public void setCustomerKey(String value) { 
      this.customerKey = value;
   }
   public DomainTunnelType getDomainTunnelType() {
      return domainTunnelType;
   }

   public void setDomainTunnelType(DomainTunnelType value) { 
      this.domainTunnelType = value;
   }
   public int getDynamicWANServiceDiffTime() {
      return dynamicWANServiceDiffTime;
   }

   public void setDynamicWANServiceDiffTime(int value) { 
      this.dynamicWANServiceDiffTime = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public int getEsiID() {
      return esiID;
   }

   public void setEsiID(int value) { 
      this.esiID = value;
   }
   public int getEventLogCleanupInterval() {
      return eventLogCleanupInterval;
   }

   public void setEventLogCleanupInterval(int value) { 
      this.eventLogCleanupInterval = value;
   }
   public int getEventLogEntryMaxAge() {
      return eventLogEntryMaxAge;
   }

   public void setEventLogEntryMaxAge(int value) { 
      this.eventLogEntryMaxAge = value;
   }
   public int getEventProcessorInterval() {
      return eventProcessorInterval;
   }

   public void setEventProcessorInterval(int value) { 
      this.eventProcessorInterval = value;
   }
   public int getEventProcessorMaxEventsCount() {
      return eventProcessorMaxEventsCount;
   }

   public void setEventProcessorMaxEventsCount(int value) { 
      this.eventProcessorMaxEventsCount = value;
   }
   public int getEventProcessorTimeout() {
      return eventProcessorTimeout;
   }

   public void setEventProcessorTimeout(int value) { 
      this.eventProcessorTimeout = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public int getGroupKeyDefaultSEKGenerationInterval() {
      return groupKeyDefaultSEKGenerationInterval;
   }

   public void setGroupKeyDefaultSEKGenerationInterval(int value) { 
      this.groupKeyDefaultSEKGenerationInterval = value;
   }
   public int getGroupKeyDefaultSEKLifetime() {
      return groupKeyDefaultSEKLifetime;
   }

   public void setGroupKeyDefaultSEKLifetime(int value) { 
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
   public int getGroupKeyDefaultSeedGenerationInterval() {
      return groupKeyDefaultSeedGenerationInterval;
   }

   public void setGroupKeyDefaultSeedGenerationInterval(int value) { 
      this.groupKeyDefaultSeedGenerationInterval = value;
   }
   public int getGroupKeyDefaultSeedLifetime() {
      return groupKeyDefaultSeedLifetime;
   }

   public void setGroupKeyDefaultSeedLifetime(int value) { 
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
   public int getGroupKeyDefaultTrafficEncryptionKeyLifetime() {
      return groupKeyDefaultTrafficEncryptionKeyLifetime;
   }

   public void setGroupKeyDefaultTrafficEncryptionKeyLifetime(int value) { 
      this.groupKeyDefaultTrafficEncryptionKeyLifetime = value;
   }
   public int getGroupKeyGenerationIntervalOnForcedReKey() {
      return groupKeyGenerationIntervalOnForcedReKey;
   }

   public void setGroupKeyGenerationIntervalOnForcedReKey(int value) { 
      this.groupKeyGenerationIntervalOnForcedReKey = value;
   }
   public int getGroupKeyGenerationIntervalOnRevoke() {
      return groupKeyGenerationIntervalOnRevoke;
   }

   public void setGroupKeyGenerationIntervalOnRevoke(int value) { 
      this.groupKeyGenerationIntervalOnRevoke = value;
   }
   public int getGroupKeyMinimumSEKGenerationInterval() {
      return groupKeyMinimumSEKGenerationInterval;
   }

   public void setGroupKeyMinimumSEKGenerationInterval(int value) { 
      this.groupKeyMinimumSEKGenerationInterval = value;
   }
   public int getGroupKeyMinimumSEKLifetime() {
      return groupKeyMinimumSEKLifetime;
   }

   public void setGroupKeyMinimumSEKLifetime(int value) { 
      this.groupKeyMinimumSEKLifetime = value;
   }
   public int getGroupKeyMinimumSeedGenerationInterval() {
      return groupKeyMinimumSeedGenerationInterval;
   }

   public void setGroupKeyMinimumSeedGenerationInterval(int value) { 
      this.groupKeyMinimumSeedGenerationInterval = value;
   }
   public int getGroupKeyMinimumSeedLifetime() {
      return groupKeyMinimumSeedLifetime;
   }

   public void setGroupKeyMinimumSeedLifetime(int value) { 
      this.groupKeyMinimumSeedLifetime = value;
   }
   public int getGroupKeyMinimumTrafficEncryptionKeyLifetime() {
      return groupKeyMinimumTrafficEncryptionKeyLifetime;
   }

   public void setGroupKeyMinimumTrafficEncryptionKeyLifetime(int value) { 
      this.groupKeyMinimumTrafficEncryptionKeyLifetime = value;
   }
   public int getInactiveTimeout() {
      return inactiveTimeout;
   }

   public void setInactiveTimeout(int value) { 
      this.inactiveTimeout = value;
   }
   public boolean getKeyServerMonitorEnabled() {
      return keyServerMonitorEnabled;
   }

   public void setKeyServerMonitorEnabled(boolean value) { 
      this.keyServerMonitorEnabled = value;
   }
   public int getKeyServerVSDDataSynchronizationInterval() {
      return keyServerVSDDataSynchronizationInterval;
   }

   public void setKeyServerVSDDataSynchronizationInterval(int value) { 
      this.keyServerVSDDataSynchronizationInterval = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public int getMaxFailedLogins() {
      return maxFailedLogins;
   }

   public void setMaxFailedLogins(int value) { 
      this.maxFailedLogins = value;
   }
   public int getMaxResponse() {
      return maxResponse;
   }

   public void setMaxResponse(int value) { 
      this.maxResponse = value;
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
   public int getOffsetCustomerID() {
      return offsetCustomerID;
   }

   public void setOffsetCustomerID(int value) { 
      this.offsetCustomerID = value;
   }
   public int getOffsetServiceID() {
      return offsetServiceID;
   }

   public void setOffsetServiceID(int value) { 
      this.offsetServiceID = value;
   }
   public int getPageMaxSize() {
      return pageMaxSize;
   }

   public void setPageMaxSize(int value) { 
      this.pageMaxSize = value;
   }
   public int getPageSize() {
      return pageSize;
   }

   public void setPageSize(int value) { 
      this.pageSize = value;
   }
   public int getPostProcessorThreadsCount() {
      return postProcessorThreadsCount;
   }

   public void setPostProcessorThreadsCount(int value) { 
      this.postProcessorThreadsCount = value;
   }
   public int getReflexiveACLTimeout() {
      return reflexiveACLTimeout;
   }

   public void setReflexiveACLTimeout(int value) { 
      this.reflexiveACLTimeout = value;
   }
   public int getServiceIDUpperLimit() {
      return serviceIDUpperLimit;
   }

   public void setServiceIDUpperLimit(int value) { 
      this.serviceIDUpperLimit = value;
   }
   public boolean getStackTraceEnabled() {
      return stackTraceEnabled;
   }

   public void setStackTraceEnabled(boolean value) { 
      this.stackTraceEnabled = value;
   }
   public int getStaticWANServicePurgeTime() {
      return staticWANServicePurgeTime;
   }

   public void setStaticWANServicePurgeTime(int value) { 
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
   public int getStatsMaxDataPoints() {
      return statsMaxDataPoints;
   }

   public void setStatsMaxDataPoints(int value) { 
      this.statsMaxDataPoints = value;
   }
   public int getStatsMinDuration() {
      return statsMinDuration;
   }

   public void setStatsMinDuration(int value) { 
      this.statsMinDuration = value;
   }
   public int getStatsNumberOfDataPoints() {
      return statsNumberOfDataPoints;
   }

   public void setStatsNumberOfDataPoints(int value) { 
      this.statsNumberOfDataPoints = value;
   }
   public String getStatsTSDBServerAddress() {
      return statsTSDBServerAddress;
   }

   public void setStatsTSDBServerAddress(String value) { 
      this.statsTSDBServerAddress = value;
   }
   public int getSubnetResyncInterval() {
      return subnetResyncInterval;
   }

   public void setSubnetResyncInterval(int value) { 
      this.subnetResyncInterval = value;
   }
   public int getSubnetResyncOutstandingInterval() {
      return subnetResyncOutstandingInterval;
   }

   public void setSubnetResyncOutstandingInterval(int value) { 
      this.subnetResyncOutstandingInterval = value;
   }
   public String getSyslogDestinationHost() {
      return syslogDestinationHost;
   }

   public void setSyslogDestinationHost(String value) { 
      this.syslogDestinationHost = value;
   }
   public int getSyslogDestinationPort() {
      return syslogDestinationPort;
   }

   public void setSyslogDestinationPort(int value) { 
      this.syslogDestinationPort = value;
   }
   public int getSysmonCleanupTaskInterval() {
      return sysmonCleanupTaskInterval;
   }

   public void setSysmonCleanupTaskInterval(int value) { 
      this.sysmonCleanupTaskInterval = value;
   }
   public int getSysmonNodePresenceTimeout() {
      return sysmonNodePresenceTimeout;
   }

   public void setSysmonNodePresenceTimeout(int value) { 
      this.sysmonNodePresenceTimeout = value;
   }
   public int getSysmonProbeResponseTimeout() {
      return sysmonProbeResponseTimeout;
   }

   public void setSysmonProbeResponseTimeout(int value) { 
      this.sysmonProbeResponseTimeout = value;
   }
   public int getTwoFactorCodeExpiry() {
      return twoFactorCodeExpiry;
   }

   public void setTwoFactorCodeExpiry(int value) { 
      this.twoFactorCodeExpiry = value;
   }
   public int getTwoFactorCodeLength() {
      return twoFactorCodeLength;
   }

   public void setTwoFactorCodeLength(int value) { 
      this.twoFactorCodeLength = value;
   }
   public int getTwoFactorCodeSeedLength() {
      return twoFactorCodeSeedLength;
   }

   public void setTwoFactorCodeSeedLength(int value) { 
      this.twoFactorCodeSeedLength = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "SystemConfig [" + "ACLAllowOrigin=" + ACLAllowOrigin + ", ADGatewayPurgeTime=" + ADGatewayPurgeTime + ", APIKeyRenewalInterval=" + APIKeyRenewalInterval + ", APIKeyValidity=" + APIKeyValidity + ", ASNumber=" + ASNumber + ", DHCPOptionSize=" + DHCPOptionSize + ", ECMPCount=" + ECMPCount + ", EVPNBGPCommunityTagASNumber=" + EVPNBGPCommunityTagASNumber + ", EVPNBGPCommunityTagLowerLimit=" + EVPNBGPCommunityTagLowerLimit + ", EVPNBGPCommunityTagUpperLimit=" + EVPNBGPCommunityTagUpperLimit + ", LDAPSyncInterval=" + LDAPSyncInterval + ", LDAPTrustStoreCertifcate=" + LDAPTrustStoreCertifcate + ", LDAPTrustStorePassword=" + LDAPTrustStorePassword + ", LRUCacheSizePerSubnet=" + LRUCacheSizePerSubnet + ", RDLowerLimit=" + RDLowerLimit + ", RDPublicNetworkLowerLimit=" + RDPublicNetworkLowerLimit + ", RDPublicNetworkUpperLimit=" + RDPublicNetworkUpperLimit + ", RDUpperLimit=" + RDUpperLimit + ", RTLowerLimit=" + RTLowerLimit + ", RTPublicNetworkLowerLimit=" + RTPublicNetworkLowerLimit + ", RTPublicNetworkUpperLimit=" + RTPublicNetworkUpperLimit + ", RTUpperLimit=" + RTUpperLimit + ", VMCacheSize=" + VMCacheSize + ", VMPurgeTime=" + VMPurgeTime + ", VMResyncDeletionWaitTime=" + VMResyncDeletionWaitTime + ", VMResyncOutstandingInterval=" + VMResyncOutstandingInterval + ", VMUnreachableCleanupTime=" + VMUnreachableCleanupTime + ", VMUnreachableTime=" + VMUnreachableTime + ", VNIDLowerLimit=" + VNIDLowerLimit + ", VNIDPublicNetworkLowerLimit=" + VNIDPublicNetworkLowerLimit + ", VNIDPublicNetworkUpperLimit=" + VNIDPublicNetworkUpperLimit + ", VNIDUpperLimit=" + VNIDUpperLimit + ", VSCOnSameVersionAsVSD=" + VSCOnSameVersionAsVSD + ", VSDReadOnlyMode=" + VSDReadOnlyMode + ", VSDUpgradeIsComplete=" + VSDUpgradeIsComplete + ", alarmsMaxPerObject=" + alarmsMaxPerObject + ", avatarBasePath=" + avatarBasePath + ", avatarBaseURL=" + avatarBaseURL + ", customerIDUpperLimit=" + customerIDUpperLimit + ", customerKey=" + customerKey + ", domainTunnelType=" + domainTunnelType + ", dynamicWANServiceDiffTime=" + dynamicWANServiceDiffTime + ", ejbcaNSGCertificateProfile=" + ejbcaNSGCertificateProfile + ", ejbcaNSGEndEntityProfile=" + ejbcaNSGEndEntityProfile + ", ejbcaOCSPResponderCN=" + ejbcaOCSPResponderCN + ", ejbcaOCSPResponderURI=" + ejbcaOCSPResponderURI + ", ejbcaVspRootCa=" + ejbcaVspRootCa + ", entityScope=" + entityScope + ", esiID=" + esiID + ", eventLogCleanupInterval=" + eventLogCleanupInterval + ", eventLogEntryMaxAge=" + eventLogEntryMaxAge + ", eventProcessorInterval=" + eventProcessorInterval + ", eventProcessorMaxEventsCount=" + eventProcessorMaxEventsCount + ", eventProcessorTimeout=" + eventProcessorTimeout + ", externalID=" + externalID + ", groupKeyDefaultSEKGenerationInterval=" + groupKeyDefaultSEKGenerationInterval + ", groupKeyDefaultSEKLifetime=" + groupKeyDefaultSEKLifetime + ", groupKeyDefaultSEKPayloadEncryptionAlgorithm=" + groupKeyDefaultSEKPayloadEncryptionAlgorithm + ", groupKeyDefaultSEKPayloadSigningAlgorithm=" + groupKeyDefaultSEKPayloadSigningAlgorithm + ", groupKeyDefaultSeedGenerationInterval=" + groupKeyDefaultSeedGenerationInterval + ", groupKeyDefaultSeedLifetime=" + groupKeyDefaultSeedLifetime + ", groupKeyDefaultSeedPayloadAuthenticationAlgorithm=" + groupKeyDefaultSeedPayloadAuthenticationAlgorithm + ", groupKeyDefaultSeedPayloadEncryptionAlgorithm=" + groupKeyDefaultSeedPayloadEncryptionAlgorithm + ", groupKeyDefaultSeedPayloadSigningAlgorithm=" + groupKeyDefaultSeedPayloadSigningAlgorithm + ", groupKeyDefaultTrafficAuthenticationAlgorithm=" + groupKeyDefaultTrafficAuthenticationAlgorithm + ", groupKeyDefaultTrafficEncryptionAlgorithm=" + groupKeyDefaultTrafficEncryptionAlgorithm + ", groupKeyDefaultTrafficEncryptionKeyLifetime=" + groupKeyDefaultTrafficEncryptionKeyLifetime + ", groupKeyGenerationIntervalOnForcedReKey=" + groupKeyGenerationIntervalOnForcedReKey + ", groupKeyGenerationIntervalOnRevoke=" + groupKeyGenerationIntervalOnRevoke + ", groupKeyMinimumSEKGenerationInterval=" + groupKeyMinimumSEKGenerationInterval + ", groupKeyMinimumSEKLifetime=" + groupKeyMinimumSEKLifetime + ", groupKeyMinimumSeedGenerationInterval=" + groupKeyMinimumSeedGenerationInterval + ", groupKeyMinimumSeedLifetime=" + groupKeyMinimumSeedLifetime + ", groupKeyMinimumTrafficEncryptionKeyLifetime=" + groupKeyMinimumTrafficEncryptionKeyLifetime + ", inactiveTimeout=" + inactiveTimeout + ", keyServerMonitorEnabled=" + keyServerMonitorEnabled + ", keyServerVSDDataSynchronizationInterval=" + keyServerVSDDataSynchronizationInterval + ", lastUpdatedBy=" + lastUpdatedBy + ", maxFailedLogins=" + maxFailedLogins + ", maxResponse=" + maxResponse + ", nsgBootstrapEndpoint=" + nsgBootstrapEndpoint + ", nsgConfigEndpoint=" + nsgConfigEndpoint + ", nsgLocalUiUrl=" + nsgLocalUiUrl + ", offsetCustomerID=" + offsetCustomerID + ", offsetServiceID=" + offsetServiceID + ", pageMaxSize=" + pageMaxSize + ", pageSize=" + pageSize + ", postProcessorThreadsCount=" + postProcessorThreadsCount + ", reflexiveACLTimeout=" + reflexiveACLTimeout + ", serviceIDUpperLimit=" + serviceIDUpperLimit + ", stackTraceEnabled=" + stackTraceEnabled + ", staticWANServicePurgeTime=" + staticWANServicePurgeTime + ", statsCollectorAddress=" + statsCollectorAddress + ", statsCollectorPort=" + statsCollectorPort + ", statsCollectorProtoBufPort=" + statsCollectorProtoBufPort + ", statsMaxDataPoints=" + statsMaxDataPoints + ", statsMinDuration=" + statsMinDuration + ", statsNumberOfDataPoints=" + statsNumberOfDataPoints + ", statsTSDBServerAddress=" + statsTSDBServerAddress + ", subnetResyncInterval=" + subnetResyncInterval + ", subnetResyncOutstandingInterval=" + subnetResyncOutstandingInterval + ", syslogDestinationHost=" + syslogDestinationHost + ", syslogDestinationPort=" + syslogDestinationPort + ", sysmonCleanupTaskInterval=" + sysmonCleanupTaskInterval + ", sysmonNodePresenceTimeout=" + sysmonNodePresenceTimeout + ", sysmonProbeResponseTimeout=" + sysmonProbeResponseTimeout + ", twoFactorCodeExpiry=" + twoFactorCodeExpiry + ", twoFactorCodeLength=" + twoFactorCodeLength + ", twoFactorCodeSeedLength=" + twoFactorCodeSeedLength + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}