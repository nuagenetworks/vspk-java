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

import vspk.v4_0.fetchers.EnterprisesFetcher;
import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.ExternalServicesFetcher;
import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;
import vspk.v4_0.fetchers.MultiCastListsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnterpriseProfile extends RestObject {

   public final static String REST_NAME = "enterpriseprofile";
   public final static String RESOURCE_NAME = "enterpriseprofiles";

   
   public enum EncryptionManagementMode { DISABLED, MANAGED };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "BGPEnabled")
   protected boolean BGPEnabled;
   
   @JsonProperty(value = "DHCPLeaseInterval")
   protected int DHCPLeaseInterval;
   
   @JsonProperty(value = "allowAdvancedQOSConfiguration")
   protected boolean allowAdvancedQOSConfiguration;
   
   @JsonProperty(value = "allowGatewayManagement")
   protected boolean allowGatewayManagement;
   
   @JsonProperty(value = "allowTrustedForwardingClass")
   protected boolean allowTrustedForwardingClass;
   
   @JsonProperty(value = "allowedForwardingClasses")
   protected java.util.List<String> allowedForwardingClasses;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "encryptionManagementMode")
   protected EncryptionManagementMode encryptionManagementMode;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "floatingIPsQuota")
   protected int floatingIPsQuota;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "receiveMultiCastListID")
   protected String receiveMultiCastListID;
   
   @JsonProperty(value = "sendMultiCastListID")
   protected String sendMultiCastListID;
   

   
   @JsonIgnore
   private EnterprisesFetcher enterprises;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private ExternalServicesFetcher externalServices;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private MultiCastListsFetcher multiCastLists;
   

   public EnterpriseProfile() {
      
      enterprises = new EnterprisesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      externalServices = new ExternalServicesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      multiCastLists = new MultiCastListsFetcher(this);
      
   }

   public boolean getBGPEnabled() {
      return BGPEnabled;
   }

   public void setBGPEnabled(boolean value) { 
      this.BGPEnabled = value;
   }
   public int getDHCPLeaseInterval() {
      return DHCPLeaseInterval;
   }

   public void setDHCPLeaseInterval(int value) { 
      this.DHCPLeaseInterval = value;
   }
   public boolean getAllowAdvancedQOSConfiguration() {
      return allowAdvancedQOSConfiguration;
   }

   public void setAllowAdvancedQOSConfiguration(boolean value) { 
      this.allowAdvancedQOSConfiguration = value;
   }
   public boolean getAllowGatewayManagement() {
      return allowGatewayManagement;
   }

   public void setAllowGatewayManagement(boolean value) { 
      this.allowGatewayManagement = value;
   }
   public boolean getAllowTrustedForwardingClass() {
      return allowTrustedForwardingClass;
   }

   public void setAllowTrustedForwardingClass(boolean value) { 
      this.allowTrustedForwardingClass = value;
   }
   public java.util.List<String> getAllowedForwardingClasses() {
      return allowedForwardingClasses;
   }

   public void setAllowedForwardingClasses(java.util.List<String> value) { 
      this.allowedForwardingClasses = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
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
   public int getFloatingIPsQuota() {
      return floatingIPsQuota;
   }

   public void setFloatingIPsQuota(int value) { 
      this.floatingIPsQuota = value;
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
   

   
   public EnterprisesFetcher getEnterprises() {
      return enterprises;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public ExternalServicesFetcher getExternalServices() {
      return externalServices;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public MultiCastListsFetcher getMultiCastLists() {
      return multiCastLists;
   }
   

   public String toString() {
      return "EnterpriseProfile [" + "BGPEnabled=" + BGPEnabled + ", DHCPLeaseInterval=" + DHCPLeaseInterval + ", allowAdvancedQOSConfiguration=" + allowAdvancedQOSConfiguration + ", allowGatewayManagement=" + allowGatewayManagement + ", allowTrustedForwardingClass=" + allowTrustedForwardingClass + ", allowedForwardingClasses=" + allowedForwardingClasses + ", description=" + description + ", encryptionManagementMode=" + encryptionManagementMode + ", entityScope=" + entityScope + ", externalID=" + externalID + ", floatingIPsQuota=" + floatingIPsQuota + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", receiveMultiCastListID=" + receiveMultiCastListID + ", sendMultiCastListID=" + sendMultiCastListID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}