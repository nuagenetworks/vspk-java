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


import net.nuagenetworks.vspk.v6.fetchers.EnterprisesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MultiCastListsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "enterpriseprofile", resourceName = "enterpriseprofiles")
public class EnterpriseProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAllowedForwardingClasses { A, B, C, D, E, F, G, H, NONE };
   public enum EEncryptionManagementMode { DISABLED, MANAGED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "BGPEnabled")
   
   protected Boolean BGPEnabled;
   
   @JsonProperty(value = "DHCPLeaseInterval")
   
   protected Long DHCPLeaseInterval;
   
   @JsonProperty(value = "VNFManagementEnabled")
   
   protected Boolean VNFManagementEnabled;
   
   @JsonProperty(value = "allowAdvancedQOSConfiguration")
   
   protected Boolean allowAdvancedQOSConfiguration;
   
   @JsonProperty(value = "allowGatewayManagement")
   
   protected Boolean allowGatewayManagement;
   
   @JsonProperty(value = "allowTrustedForwardingClass")
   
   protected Boolean allowTrustedForwardingClass;
   
   @JsonProperty(value = "allowedForwardingClasses")
   
   protected java.util.List<EAllowedForwardingClasses> allowedForwardingClasses;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enableApplicationPerformanceManagement")
   
   protected Boolean enableApplicationPerformanceManagement;
   
   @JsonProperty(value = "encryptionManagementMode")
   
   protected EEncryptionManagementMode encryptionManagementMode;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "floatingIPsQuota")
   
   protected Long floatingIPsQuota;
   
   @JsonProperty(value = "forwardingClass")
   
   protected java.util.List<ForwardingClass> forwardingClass;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "receiveMultiCastListID")
   
   protected String receiveMultiCastListID;
   
   @JsonProperty(value = "sendMultiCastListID")
   
   protected String sendMultiCastListID;
   
   @JsonProperty(value = "webFilterEnabled")
   
   protected Boolean webFilterEnabled;
   

   
   @JsonIgnore
   private EnterprisesFetcher enterprises;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MultiCastListsFetcher multiCastLists;
   

   public EnterpriseProfile() {
      floatingIPsQuota = 100L;
      DHCPLeaseInterval = 24L;
      
      enterprises = new EnterprisesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      multiCastLists = new MultiCastListsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getBGPEnabled() {
      return BGPEnabled;
   }

   @JsonIgnore
   public void setBGPEnabled(Boolean value) { 
      this.BGPEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getDHCPLeaseInterval() {
      return DHCPLeaseInterval;
   }

   @JsonIgnore
   public void setDHCPLeaseInterval(Long value) { 
      this.DHCPLeaseInterval = value;
   }
   
   
   @JsonIgnore
   public Boolean getVNFManagementEnabled() {
      return VNFManagementEnabled;
   }

   @JsonIgnore
   public void setVNFManagementEnabled(Boolean value) { 
      this.VNFManagementEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowAdvancedQOSConfiguration() {
      return allowAdvancedQOSConfiguration;
   }

   @JsonIgnore
   public void setAllowAdvancedQOSConfiguration(Boolean value) { 
      this.allowAdvancedQOSConfiguration = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowGatewayManagement() {
      return allowGatewayManagement;
   }

   @JsonIgnore
   public void setAllowGatewayManagement(Boolean value) { 
      this.allowGatewayManagement = value;
   }
   
   
   @JsonIgnore
   public Boolean getAllowTrustedForwardingClass() {
      return allowTrustedForwardingClass;
   }

   @JsonIgnore
   public void setAllowTrustedForwardingClass(Boolean value) { 
      this.allowTrustedForwardingClass = value;
   }
   
   
   @JsonIgnore
   public java.util.List<EAllowedForwardingClasses> getAllowedForwardingClasses() {
      return allowedForwardingClasses;
   }

   @JsonIgnore
   public void setAllowedForwardingClasses(java.util.List<EAllowedForwardingClasses> value) { 
      this.allowedForwardingClasses = value;
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
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
   }
   
   
   @JsonIgnore
   public Boolean getEnableApplicationPerformanceManagement() {
      return enableApplicationPerformanceManagement;
   }

   @JsonIgnore
   public void setEnableApplicationPerformanceManagement(Boolean value) { 
      this.enableApplicationPerformanceManagement = value;
   }
   
   
   @JsonIgnore
   public EEncryptionManagementMode getEncryptionManagementMode() {
      return encryptionManagementMode;
   }

   @JsonIgnore
   public void setEncryptionManagementMode(EEncryptionManagementMode value) { 
      this.encryptionManagementMode = value;
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
   public Long getFloatingIPsQuota() {
      return floatingIPsQuota;
   }

   @JsonIgnore
   public void setFloatingIPsQuota(Long value) { 
      this.floatingIPsQuota = value;
   }
   
   
   @JsonIgnore
   public java.util.List<ForwardingClass> getForwardingClass() {
      return forwardingClass;
   }

   @JsonIgnore
   public void setForwardingClass(java.util.List<ForwardingClass> value) { 
      this.forwardingClass = value;
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
   public String getReceiveMultiCastListID() {
      return receiveMultiCastListID;
   }

   @JsonIgnore
   public void setReceiveMultiCastListID(String value) { 
      this.receiveMultiCastListID = value;
   }
   
   
   @JsonIgnore
   public String getSendMultiCastListID() {
      return sendMultiCastListID;
   }

   @JsonIgnore
   public void setSendMultiCastListID(String value) { 
      this.sendMultiCastListID = value;
   }
   
   
   @JsonIgnore
   public Boolean getWebFilterEnabled() {
      return webFilterEnabled;
   }

   @JsonIgnore
   public void setWebFilterEnabled(Boolean value) { 
      this.webFilterEnabled = value;
   }
   

   
   @JsonIgnore
   public EnterprisesFetcher getEnterprises() {
      return enterprises;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
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
   public MultiCastListsFetcher getMultiCastLists() {
      return multiCastLists;
   }
   

   public String toString() {
      return "EnterpriseProfile [" + "BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", VNFManagementEnabled=" + VNFManagementEnabled + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enableApplicationPerformanceManagement=" + enableApplicationPerformanceManagement + ", encryptionManagementMode=" + encryptionManagementMode + ", entityScope=" + entityScope + ", externalID=" + externalID + ", floatingIPsQuota=" + floatingIPsQuota + ", forwardingClass=" + forwardingClass + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", webFilterEnabled=" + webFilterEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}