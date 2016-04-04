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

import vspk.v3_2.fetchers.EnterprisePermissionsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.NATMapEntriesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PATNATPool extends RestObject {

   public final static String REST_NAME = "patnatpool";
   public final static String RESOURCE_NAME = "patnatpools";

   
   public enum AssociatedGatewayType { AUTO_DISC_GATEWAY, GATEWAY, IKEV2_GATEWAY, NSGATEWAY };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };

   
   @JsonProperty(value = "addressRange")
   protected String addressRange;
   
   @JsonProperty(value = "associatedGatewayId")
   protected String associatedGatewayId;
   
   @JsonProperty(value = "associatedGatewayType")
   protected AssociatedGatewayType associatedGatewayType;
   
   @JsonProperty(value = "defaultPATIP")
   protected String defaultPATIP;
   
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
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   

   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NATMapEntriesFetcher nATMapEntries;
   

   public PATNATPool() {
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nATMapEntries = new NATMapEntriesFetcher(this);
      
   }

   public String getAddressRange() {
      return addressRange;
   }

   public void setAddressRange(String value) { 
      this.addressRange = value;
   }
   public String getAssociatedGatewayId() {
      return associatedGatewayId;
   }

   public void setAssociatedGatewayId(String value) { 
      this.associatedGatewayId = value;
   }
   public AssociatedGatewayType getAssociatedGatewayType() {
      return associatedGatewayType;
   }

   public void setAssociatedGatewayType(AssociatedGatewayType value) { 
      this.associatedGatewayType = value;
   }
   public String getDefaultPATIP() {
      return defaultPATIP;
   }

   public void setDefaultPATIP(String value) { 
      this.defaultPATIP = value;
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
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   

   
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public NATMapEntriesFetcher getNATMapEntries() {
      return nATMapEntries;
   }
   

   public String toString() {
      return "PATNATPool [" + "addressRange=" + addressRange + ", associatedGatewayId=" + associatedGatewayId + ", associatedGatewayType=" + associatedGatewayType + ", defaultPATIP=" + defaultPATIP + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}