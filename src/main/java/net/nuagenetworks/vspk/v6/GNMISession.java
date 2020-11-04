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


import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "gnmisession", resourceName = "gnmisessions")
public class GNMISession extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EGatewayVendor { CISCO, NOKIA };
   public enum EStatus { CONNECTED, DISCONNECTED };
   public enum ESubscriptionState { COMPLETED, FAILED, INIT, IN_PROGRESS };

   
   @JsonProperty(value = "associatedGatewayID")
   
   protected String associatedGatewayID;
   
   @JsonProperty(value = "associatedGatewayName")
   
   protected String associatedGatewayName;
   
   @JsonProperty(value = "creationDate")
   
   protected String creationDate;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gatewayModel")
   
   protected String gatewayModel;
   
   @JsonProperty(value = "gatewayVendor")
   
   protected EGatewayVendor gatewayVendor;
   
   @JsonProperty(value = "gatewayVersion")
   
   protected String gatewayVersion;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUpdatedDate")
   
   protected String lastUpdatedDate;
   
   @JsonProperty(value = "owner")
   
   protected String owner;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   
   @JsonProperty(value = "subscriptionError")
   
   protected String subscriptionError;
   
   @JsonProperty(value = "subscriptionFailureReason")
   
   protected String subscriptionFailureReason;
   
   @JsonProperty(value = "subscriptionFailureRetryCount")
   
   protected Long subscriptionFailureRetryCount;
   
   @JsonProperty(value = "subscriptionState")
   
   protected ESubscriptionState subscriptionState;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public GNMISession() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssociatedGatewayID() {
      return associatedGatewayID;
   }

   @JsonIgnore
   public void setAssociatedGatewayID(String value) { 
      this.associatedGatewayID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedGatewayName() {
      return associatedGatewayName;
   }

   @JsonIgnore
   public void setAssociatedGatewayName(String value) { 
      this.associatedGatewayName = value;
   }
   
   
   @JsonIgnore
   public String getCreationDate() {
      return creationDate;
   }

   @JsonIgnore
   public void setCreationDate(String value) { 
      this.creationDate = value;
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
   public String getGatewayModel() {
      return gatewayModel;
   }

   @JsonIgnore
   public void setGatewayModel(String value) { 
      this.gatewayModel = value;
   }
   
   
   @JsonIgnore
   public EGatewayVendor getGatewayVendor() {
      return gatewayVendor;
   }

   @JsonIgnore
   public void setGatewayVendor(EGatewayVendor value) { 
      this.gatewayVendor = value;
   }
   
   
   @JsonIgnore
   public String getGatewayVersion() {
      return gatewayVersion;
   }

   @JsonIgnore
   public void setGatewayVersion(String value) { 
      this.gatewayVersion = value;
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
   public String getLastUpdatedDate() {
      return lastUpdatedDate;
   }

   @JsonIgnore
   public void setLastUpdatedDate(String value) { 
      this.lastUpdatedDate = value;
   }
   
   
   @JsonIgnore
   public String getOwner() {
      return owner;
   }

   @JsonIgnore
   public void setOwner(String value) { 
      this.owner = value;
   }
   
   
   @JsonIgnore
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
   }
   
   
   @JsonIgnore
   public String getSubscriptionError() {
      return subscriptionError;
   }

   @JsonIgnore
   public void setSubscriptionError(String value) { 
      this.subscriptionError = value;
   }
   
   
   @JsonIgnore
   public String getSubscriptionFailureReason() {
      return subscriptionFailureReason;
   }

   @JsonIgnore
   public void setSubscriptionFailureReason(String value) { 
      this.subscriptionFailureReason = value;
   }
   
   
   @JsonIgnore
   public Long getSubscriptionFailureRetryCount() {
      return subscriptionFailureRetryCount;
   }

   @JsonIgnore
   public void setSubscriptionFailureRetryCount(Long value) { 
      this.subscriptionFailureRetryCount = value;
   }
   
   
   @JsonIgnore
   public ESubscriptionState getSubscriptionState() {
      return subscriptionState;
   }

   @JsonIgnore
   public void setSubscriptionState(ESubscriptionState value) { 
      this.subscriptionState = value;
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
      return "GNMISession [" + "associatedGatewayID=" + associatedGatewayID + ", associatedGatewayName=" + associatedGatewayName + ", creationDate=" + creationDate + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayModel=" + gatewayModel + ", gatewayVendor=" + gatewayVendor + ", gatewayVersion=" + gatewayVersion + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", owner=" + owner + ", status=" + status + ", subscriptionError=" + subscriptionError + ", subscriptionFailureReason=" + subscriptionFailureReason + ", subscriptionFailureRetryCount=" + subscriptionFailureRetryCount + ", subscriptionState=" + subscriptionState + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}