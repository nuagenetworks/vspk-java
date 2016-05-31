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
import net.nuagenetworks.vspk.v4_0.fetchers.EnterprisesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MultiCastListsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ExternalServicesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "enterpriseprofile", resourceName = "enterpriseprofiles")
public class EnterpriseProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum AllowedForwardingClasses { A, B, C, D, E, F, G, H, NONE };
   public enum EncryptionManagementMode { DISABLED, MANAGED };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "BGPEnabled")
   protected Boolean BGPEnabled;
   
   @JsonProperty(value = "DHCPLeaseInterval")
   protected Long DHCPLeaseInterval;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "receiveMultiCastListID")
   protected String receiveMultiCastListID;
   
   @JsonProperty(value = "sendMultiCastListID")
   protected String sendMultiCastListID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "allowAdvancedQOSConfiguration")
   protected Boolean allowAdvancedQOSConfiguration;
   
   @JsonProperty(value = "allowGatewayManagement")
   protected Boolean allowGatewayManagement;
   
   @JsonProperty(value = "allowTrustedForwardingClass")
   protected Boolean allowTrustedForwardingClass;
   
   @JsonProperty(value = "allowedForwardingClasses")
   protected java.util.List<AllowedForwardingClasses> allowedForwardingClasses;
   
   @JsonProperty(value = "floatingIPsQuota")
   protected Long floatingIPsQuota;
   
   @JsonProperty(value = "encryptionManagementMode")
   protected EncryptionManagementMode encryptionManagementMode;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EnterprisesFetcher enterprises;
   
   @JsonIgnore
   private MultiCastListsFetcher multiCastLists;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private ExternalServicesFetcher externalServices;
   

   public EnterpriseProfile() {
      floatingIPsQuota = 100L;
      DHCPLeaseInterval = 24L;
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      enterprises = new EnterprisesFetcher(this);
      
      multiCastLists = new MultiCastListsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      externalServices = new ExternalServicesFetcher(this);
      
   }

   public Boolean getBGPEnabled() {
      return BGPEnabled;
   }

   public void setBGPEnabled(Boolean value) { 
      this.BGPEnabled = value;
   }
   public Long getDHCPLeaseInterval() {
      return DHCPLeaseInterval;
   }

   public void setDHCPLeaseInterval(Long value) { 
      this.DHCPLeaseInterval = value;
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
   public String getReceiveMultiCastListID() {
      return receiveMultiCastListID;
   }

   public void setReceiveMultiCastListID(String value) { 
      this.receiveMultiCastListID = value;
   }
   public String getSendMultiCastListID() {
      return sendMultiCastListID;
   }

   public void setSendMultiCastListID(String value) { 
      this.sendMultiCastListID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public Boolean getAllowAdvancedQOSConfiguration() {
      return allowAdvancedQOSConfiguration;
   }

   public void setAllowAdvancedQOSConfiguration(Boolean value) { 
      this.allowAdvancedQOSConfiguration = value;
   }
   public Boolean getAllowGatewayManagement() {
      return allowGatewayManagement;
   }

   public void setAllowGatewayManagement(Boolean value) { 
      this.allowGatewayManagement = value;
   }
   public Boolean getAllowTrustedForwardingClass() {
      return allowTrustedForwardingClass;
   }

   public void setAllowTrustedForwardingClass(Boolean value) { 
      this.allowTrustedForwardingClass = value;
   }
   public java.util.List<AllowedForwardingClasses> getAllowedForwardingClasses() {
      return allowedForwardingClasses;
   }

   public void setAllowedForwardingClasses(java.util.List<AllowedForwardingClasses> value) { 
      this.allowedForwardingClasses = value;
   }
   public Long getFloatingIPsQuota() {
      return floatingIPsQuota;
   }

   public void setFloatingIPsQuota(Long value) { 
      this.floatingIPsQuota = value;
   }
   public EncryptionManagementMode getEncryptionManagementMode() {
      return encryptionManagementMode;
   }

   public void setEncryptionManagementMode(EncryptionManagementMode value) { 
      this.encryptionManagementMode = value;
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
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public EnterprisesFetcher getEnterprises() {
      return enterprises;
   }
   
   @JsonIgnore
   public MultiCastListsFetcher getMultiCastLists() {
      return multiCastLists;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public ExternalServicesFetcher getExternalServices() {
      return externalServices;
   }
   

   public String toString() {
      return "EnterpriseProfile [" + "BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", description=" + description + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", floatingIPsQuota=" + floatingIPsQuota + ", encryptionManagementMode=" + encryptionManagementMode + ", entityScope=" + entityScope + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}