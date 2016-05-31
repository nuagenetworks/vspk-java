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

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "externalappservice", resourceName = "externalappservices")
public class ExternalAppService extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EgressType { REDIRECT, ROUTE };
   public enum IngressType { REDIRECT, ROUTE };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "destinationNATAddress")
   protected String destinationNATAddress;
   
   @JsonProperty(value = "destinationNATEnabled")
   protected Boolean destinationNATEnabled;
   
   @JsonProperty(value = "destinationNATMask")
   protected String destinationNATMask;
   
   @JsonProperty(value = "metadata")
   protected String metadata;
   
   @JsonProperty(value = "egressType")
   protected EgressType egressType;
   
   @JsonProperty(value = "virtualIP")
   protected String virtualIP;
   
   @JsonProperty(value = "virtualIPRequired")
   protected Boolean virtualIPRequired;
   
   @JsonProperty(value = "ingressType")
   protected IngressType ingressType;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "sourceNATAddress")
   protected String sourceNATAddress;
   
   @JsonProperty(value = "sourceNATEnabled")
   protected Boolean sourceNATEnabled;
   
   @JsonProperty(value = "associatedServiceEgressGroupID")
   protected String associatedServiceEgressGroupID;
   
   @JsonProperty(value = "associatedServiceEgressRedirectID")
   protected String associatedServiceEgressRedirectID;
   
   @JsonProperty(value = "associatedServiceIngressGroupID")
   protected String associatedServiceIngressGroupID;
   
   @JsonProperty(value = "associatedServiceIngressRedirectID")
   protected String associatedServiceIngressRedirectID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public ExternalAppService() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
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
   public Boolean getDestinationNATEnabled() {
      return destinationNATEnabled;
   }

   public void setDestinationNATEnabled(Boolean value) { 
      this.destinationNATEnabled = value;
   }
   public String getDestinationNATMask() {
      return destinationNATMask;
   }

   public void setDestinationNATMask(String value) { 
      this.destinationNATMask = value;
   }
   public String getMetadata() {
      return metadata;
   }

   public void setMetadata(String value) { 
      this.metadata = value;
   }
   public EgressType getEgressType() {
      return egressType;
   }

   public void setEgressType(EgressType value) { 
      this.egressType = value;
   }
   public String getVirtualIP() {
      return virtualIP;
   }

   public void setVirtualIP(String value) { 
      this.virtualIP = value;
   }
   public Boolean getVirtualIPRequired() {
      return virtualIPRequired;
   }

   public void setVirtualIPRequired(Boolean value) { 
      this.virtualIPRequired = value;
   }
   public IngressType getIngressType() {
      return ingressType;
   }

   public void setIngressType(IngressType value) { 
      this.ingressType = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getSourceNATAddress() {
      return sourceNATAddress;
   }

   public void setSourceNATAddress(String value) { 
      this.sourceNATAddress = value;
   }
   public Boolean getSourceNATEnabled() {
      return sourceNATEnabled;
   }

   public void setSourceNATEnabled(Boolean value) { 
      this.sourceNATEnabled = value;
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
   

   public String toString() {
      return "ExternalAppService [" + "name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", description=" + description + ", destinationNATAddress=" + destinationNATAddress + ", destinationNATEnabled=" + destinationNATEnabled + ", destinationNATMask=" + destinationNATMask + ", metadata=" + metadata + ", egressType=" + egressType + ", virtualIP=" + virtualIP + ", virtualIPRequired=" + virtualIPRequired + ", ingressType=" + ingressType + ", entityScope=" + entityScope + ", sourceNATAddress=" + sourceNATAddress + ", sourceNATEnabled=" + sourceNATEnabled + ", associatedServiceEgressGroupID=" + associatedServiceEgressGroupID + ", associatedServiceEgressRedirectID=" + associatedServiceEgressRedirectID + ", associatedServiceIngressGroupID=" + associatedServiceIngressGroupID + ", associatedServiceIngressRedirectID=" + associatedServiceIngressRedirectID + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}