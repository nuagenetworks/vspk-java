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
@RestEntity(restName = "ikegatewayprofile", resourceName = "ikegatewayprofiles")
public class IKEGatewayProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum IKEGatewayIdentifierType { ID_DER_ASN1_DN, ID_FQDN, ID_IPV4_ADDR, ID_KEY_ID, ID_RFC822_ADDR };
   
   public enum AssociatedIKEAuthenticationType { IKE_CERTIFICATE, IKE_PSK };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum ServiceClass { A, B, C, D, E, F, G, H, NONE };

   
   @JsonProperty(value = "IKEGatewayIdentifier")
   protected String IKEGatewayIdentifier;
   
   @JsonProperty(value = "IKEGatewayIdentifierType")
   protected IKEGatewayIdentifierType IKEGatewayIdentifierType;
   
   @JsonProperty(value = "antiReplayCheck")
   protected Boolean antiReplayCheck;
   
   @JsonProperty(value = "associatedEnterpriseID")
   protected String associatedEnterpriseID;
   
   @JsonProperty(value = "associatedIKEAuthenticationID")
   protected String associatedIKEAuthenticationID;
   
   @JsonProperty(value = "associatedIKEAuthenticationType")
   protected AssociatedIKEAuthenticationType associatedIKEAuthenticationType;
   
   @JsonProperty(value = "associatedIKEEncryptionProfileID")
   protected String associatedIKEEncryptionProfileID;
   
   @JsonProperty(value = "associatedIKEGatewayID")
   protected String associatedIKEGatewayID;
   
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
   
   @JsonProperty(value = "serviceClass")
   protected ServiceClass serviceClass;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public IKEGatewayProfile() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   @JsonIgnore
   public String getIKEGatewayIdentifier() {
      return IKEGatewayIdentifier;
   }

   @JsonIgnore
   public void setIKEGatewayIdentifier(String value) { 
      this.IKEGatewayIdentifier = value;
   }
   
   @JsonIgnore
   public IKEGatewayIdentifierType getIKEGatewayIdentifierType() {
      return IKEGatewayIdentifierType;
   }

   @JsonIgnore
   public void setIKEGatewayIdentifierType(IKEGatewayIdentifierType value) { 
      this.IKEGatewayIdentifierType = value;
   }
   
   @JsonIgnore
   public Boolean getAntiReplayCheck() {
      return antiReplayCheck;
   }

   @JsonIgnore
   public void setAntiReplayCheck(Boolean value) { 
      this.antiReplayCheck = value;
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
   public String getAssociatedIKEAuthenticationID() {
      return associatedIKEAuthenticationID;
   }

   @JsonIgnore
   public void setAssociatedIKEAuthenticationID(String value) { 
      this.associatedIKEAuthenticationID = value;
   }
   
   @JsonIgnore
   public AssociatedIKEAuthenticationType getAssociatedIKEAuthenticationType() {
      return associatedIKEAuthenticationType;
   }

   @JsonIgnore
   public void setAssociatedIKEAuthenticationType(AssociatedIKEAuthenticationType value) { 
      this.associatedIKEAuthenticationType = value;
   }
   
   @JsonIgnore
   public String getAssociatedIKEEncryptionProfileID() {
      return associatedIKEEncryptionProfileID;
   }

   @JsonIgnore
   public void setAssociatedIKEEncryptionProfileID(String value) { 
      this.associatedIKEEncryptionProfileID = value;
   }
   
   @JsonIgnore
   public String getAssociatedIKEGatewayID() {
      return associatedIKEGatewayID;
   }

   @JsonIgnore
   public void setAssociatedIKEGatewayID(String value) { 
      this.associatedIKEGatewayID = value;
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
   public ServiceClass getServiceClass() {
      return serviceClass;
   }

   @JsonIgnore
   public void setServiceClass(ServiceClass value) { 
      this.serviceClass = value;
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
      return "IKEGatewayProfile [" + "IKEGatewayIdentifier=" + IKEGatewayIdentifier + ", IKEGatewayIdentifierType=" + IKEGatewayIdentifierType + ", antiReplayCheck=" + antiReplayCheck + ", associatedEnterpriseID=" + associatedEnterpriseID + ", associatedIKEAuthenticationID=" + associatedIKEAuthenticationID + ", associatedIKEAuthenticationType=" + associatedIKEAuthenticationType + ", associatedIKEEncryptionProfileID=" + associatedIKEEncryptionProfileID + ", associatedIKEGatewayID=" + associatedIKEGatewayID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", serviceClass=" + serviceClass + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}