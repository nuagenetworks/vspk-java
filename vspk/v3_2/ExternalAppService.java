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
public class ExternalAppService extends RestObject {

   public final static String REST_NAME = "externalappservice";
   public final static String RESOURCE_NAME = "externalappservices";

   
   public enum EgressType { REDIRECT, ROUTE };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum IngressType { REDIRECT, ROUTE };

   
   @JsonProperty(value = "associatedServiceEgressGroupID")
   protected String associatedServiceEgressGroupID;
   
   @JsonProperty(value = "associatedServiceEgressRedirectID")
   protected String associatedServiceEgressRedirectID;
   
   @JsonProperty(value = "associatedServiceIngressGroupID")
   protected String associatedServiceIngressGroupID;
   
   @JsonProperty(value = "associatedServiceIngressRedirectID")
   protected String associatedServiceIngressRedirectID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "destinationNATAddress")
   protected String destinationNATAddress;
   
   @JsonProperty(value = "destinationNATEnabled")
   protected boolean destinationNATEnabled;
   
   @JsonProperty(value = "destinationNATMask")
   protected String destinationNATMask;
   
   @JsonProperty(value = "egressType")
   protected EgressType egressType;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "ingressType")
   protected IngressType ingressType;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "metadata")
   protected String metadata;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "sourceNATAddress")
   protected String sourceNATAddress;
   
   @JsonProperty(value = "sourceNATEnabled")
   protected boolean sourceNATEnabled;
   
   @JsonProperty(value = "virtualIP")
   protected String virtualIP;
   
   @JsonProperty(value = "virtualIPRequired")
   protected boolean virtualIPRequired;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public ExternalAppService() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public String getAssociatedServiceEgressGroupID() {
      return associatedServiceEgressGroupID;
   }

   public void setAssociatedServiceEgressGroupID(String value) { 
      this.associatedServiceEgressGroupID = value;
   }
   public String getAssociatedServiceEgressRedirectID() {
      return associatedServiceEgressRedirectID;
   }

   public void setAssociatedServiceEgressRedirectID(String value) { 
      this.associatedServiceEgressRedirectID = value;
   }
   public String getAssociatedServiceIngressGroupID() {
      return associatedServiceIngressGroupID;
   }

   public void setAssociatedServiceIngressGroupID(String value) { 
      this.associatedServiceIngressGroupID = value;
   }
   public String getAssociatedServiceIngressRedirectID() {
      return associatedServiceIngressRedirectID;
   }

   public void setAssociatedServiceIngressRedirectID(String value) { 
      this.associatedServiceIngressRedirectID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getDestinationNATAddress() {
      return destinationNATAddress;
   }

   public void setDestinationNATAddress(String value) { 
      this.destinationNATAddress = value;
   }
   public boolean getDestinationNATEnabled() {
      return destinationNATEnabled;
   }

   public void setDestinationNATEnabled(boolean value) { 
      this.destinationNATEnabled = value;
   }
   public String getDestinationNATMask() {
      return destinationNATMask;
   }

   public void setDestinationNATMask(String value) { 
      this.destinationNATMask = value;
   }
   public EgressType getEgressType() {
      return egressType;
   }

   public void setEgressType(EgressType value) { 
      this.egressType = value;
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
   public IngressType getIngressType() {
      return ingressType;
   }

   public void setIngressType(IngressType value) { 
      this.ingressType = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getMetadata() {
      return metadata;
   }

   public void setMetadata(String value) { 
      this.metadata = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getSourceNATAddress() {
      return sourceNATAddress;
   }

   public void setSourceNATAddress(String value) { 
      this.sourceNATAddress = value;
   }
   public boolean getSourceNATEnabled() {
      return sourceNATEnabled;
   }

   public void setSourceNATEnabled(boolean value) { 
      this.sourceNATEnabled = value;
   }
   public String getVirtualIP() {
      return virtualIP;
   }

   public void setVirtualIP(String value) { 
      this.virtualIP = value;
   }
   public boolean getVirtualIPRequired() {
      return virtualIPRequired;
   }

   public void setVirtualIPRequired(boolean value) { 
      this.virtualIPRequired = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "ExternalAppService [" + "associatedServiceEgressGroupID=" + associatedServiceEgressGroupID + ", associatedServiceEgressRedirectID=" + associatedServiceEgressRedirectID + ", associatedServiceIngressGroupID=" + associatedServiceIngressGroupID + ", associatedServiceIngressRedirectID=" + associatedServiceIngressRedirectID + ", description=" + description + ", destinationNATAddress=" + destinationNATAddress + ", destinationNATEnabled=" + destinationNATEnabled + ", destinationNATMask=" + destinationNATMask + ", egressType=" + egressType + ", entityScope=" + entityScope + ", externalID=" + externalID + ", ingressType=" + ingressType + ", lastUpdatedBy=" + lastUpdatedBy + ", metadata=" + metadata + ", name=" + name + ", sourceNATAddress=" + sourceNATAddress + ", sourceNATEnabled=" + sourceNATEnabled + ", virtualIP=" + virtualIP + ", virtualIPRequired=" + virtualIPRequired + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}