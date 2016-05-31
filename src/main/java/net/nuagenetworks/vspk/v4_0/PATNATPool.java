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

import net.nuagenetworks.vspk.v4_0.fetchers.NATMapEntriesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AddressMapsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EnterprisePermissionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "patnatpool", resourceName = "patnatpools")
public class PATNATPool extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum AssociatedGatewayId { AUTO_DISC_GATEWAY, GATEWAY, IKEV2_GATEWAY, NSGATEWAY };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "addressRange")
   protected String addressRange;
   
   @JsonProperty(value = "defaultPATIP")
   protected String defaultPATIP;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "endAddressRange")
   protected String endAddressRange;
   
   @JsonProperty(value = "endSourceAddress")
   protected String endSourceAddress;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "translationTimeout")
   protected Long translationTimeout;
   
   @JsonProperty(value = "associatedGatewayId")
   protected AssociatedGatewayId associatedGatewayId;
   
   @JsonProperty(value = "associatedGatewayType")
   protected String associatedGatewayType;
   
   @JsonProperty(value = "startAddressRange")
   protected String startAddressRange;
   
   @JsonProperty(value = "startSourceAddress")
   protected String startSourceAddress;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "dynamicSourceEnabled")
   protected Boolean dynamicSourceEnabled;
   

   
   @JsonIgnore
   private NATMapEntriesFetcher nATMapEntries;
   
   @JsonIgnore
   private AddressMapsFetcher addressMaps;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   

   public PATNATPool() {
      
      nATMapEntries = new NATMapEntriesFetcher(this);
      
      addressMaps = new AddressMapsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
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
   public String getAddressRange() {
      return addressRange;
   }

   public void setAddressRange(String value) { 
      this.addressRange = value;
   }
   public String getDefaultPATIP() {
      return defaultPATIP;
   }

   public void setDefaultPATIP(String value) { 
      this.defaultPATIP = value;
   }
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getEndAddressRange() {
      return endAddressRange;
   }

   public void setEndAddressRange(String value) { 
      this.endAddressRange = value;
   }
   public String getEndSourceAddress() {
      return endSourceAddress;
   }

   public void setEndSourceAddress(String value) { 
      this.endSourceAddress = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public Long getTranslationTimeout() {
      return translationTimeout;
   }

   public void setTranslationTimeout(Long value) { 
      this.translationTimeout = value;
   }
   public AssociatedGatewayId getAssociatedGatewayId() {
      return associatedGatewayId;
   }

   public void setAssociatedGatewayId(AssociatedGatewayId value) { 
      this.associatedGatewayId = value;
   }
   public String getAssociatedGatewayType() {
      return associatedGatewayType;
   }

   public void setAssociatedGatewayType(String value) { 
      this.associatedGatewayType = value;
   }
   public String getStartAddressRange() {
      return startAddressRange;
   }

   public void setStartAddressRange(String value) { 
      this.startAddressRange = value;
   }
   public String getStartSourceAddress() {
      return startSourceAddress;
   }

   public void setStartSourceAddress(String value) { 
      this.startSourceAddress = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public Boolean getDynamicSourceEnabled() {
      return dynamicSourceEnabled;
   }

   public void setDynamicSourceEnabled(Boolean value) { 
      this.dynamicSourceEnabled = value;
   }
   

   
   @JsonIgnore
   public NATMapEntriesFetcher getNATMapEntries() {
      return nATMapEntries;
   }
   
   @JsonIgnore
   public AddressMapsFetcher getAddressMaps() {
      return addressMaps;
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
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   

   public String toString() {
      return "PATNATPool [" + "name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", addressRange=" + addressRange + ", defaultPATIP=" + defaultPATIP + ", permittedAction=" + permittedAction + ", description=" + description + ", endAddressRange=" + endAddressRange + ", endSourceAddress=" + endSourceAddress + ", entityScope=" + entityScope + ", translationTimeout=" + translationTimeout + ", associatedGatewayId=" + associatedGatewayId + ", associatedGatewayType=" + associatedGatewayType + ", startAddressRange=" + startAddressRange + ", startSourceAddress=" + startSourceAddress + ", externalID=" + externalID + ", dynamicSourceEnabled=" + dynamicSourceEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}