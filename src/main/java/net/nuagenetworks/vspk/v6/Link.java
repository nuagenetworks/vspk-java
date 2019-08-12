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


import net.nuagenetworks.vspk.v6.fetchers.CSNATPoolsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DemarcationServicesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.NextHopsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.OverlayAddressPoolsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyStatementsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PSNATPoolsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "link", resourceName = "links")
public class Link extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAcceptanceCriteria { ALL, SUBNETS_ONLY };
   public enum EAssociatedDestinationType { DOMAIN };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EType { BIDIR, BORDER_ROUTER, HUB_AND_SPOKE, OVERLAY_ADDRESS_TRANSLATION, SERVICE_CHAINING };

   
   @JsonProperty(value = "acceptanceCriteria")
   
   protected EAcceptanceCriteria acceptanceCriteria;
   
   @JsonProperty(value = "associatedDestinationID")
   
   protected String associatedDestinationID;
   
   @JsonProperty(value = "associatedDestinationName")
   
   protected String associatedDestinationName;
   
   @JsonProperty(value = "associatedDestinationType")
   
   protected EAssociatedDestinationType associatedDestinationType;
   
   @JsonProperty(value = "associatedSourceID")
   
   protected String associatedSourceID;
   
   @JsonProperty(value = "associatedSourceName")
   
   protected String associatedSourceName;
   
   @JsonProperty(value = "associatedSourceType")
   
   protected String associatedSourceType;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "readOnly")
   
   protected Boolean readOnly;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   

   
   @JsonIgnore
   private CSNATPoolsFetcher cSNATPools;
   
   @JsonIgnore
   private DemarcationServicesFetcher demarcationServices;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NextHopsFetcher nextHops;
   
   @JsonIgnore
   private OverlayAddressPoolsFetcher overlayAddressPools;
   
   @JsonIgnore
   private PolicyStatementsFetcher policyStatements;
   
   @JsonIgnore
   private PSNATPoolsFetcher pSNATPools;
   

   public Link() {
      
      cSNATPools = new CSNATPoolsFetcher(this);
      
      demarcationServices = new DemarcationServicesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nextHops = new NextHopsFetcher(this);
      
      overlayAddressPools = new OverlayAddressPoolsFetcher(this);
      
      policyStatements = new PolicyStatementsFetcher(this);
      
      pSNATPools = new PSNATPoolsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EAcceptanceCriteria getAcceptanceCriteria() {
      return acceptanceCriteria;
   }

   @JsonIgnore
   public void setAcceptanceCriteria(EAcceptanceCriteria value) { 
      this.acceptanceCriteria = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDestinationID() {
      return associatedDestinationID;
   }

   @JsonIgnore
   public void setAssociatedDestinationID(String value) { 
      this.associatedDestinationID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDestinationName() {
      return associatedDestinationName;
   }

   @JsonIgnore
   public void setAssociatedDestinationName(String value) { 
      this.associatedDestinationName = value;
   }
   
   
   @JsonIgnore
   public EAssociatedDestinationType getAssociatedDestinationType() {
      return associatedDestinationType;
   }

   @JsonIgnore
   public void setAssociatedDestinationType(EAssociatedDestinationType value) { 
      this.associatedDestinationType = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedSourceID() {
      return associatedSourceID;
   }

   @JsonIgnore
   public void setAssociatedSourceID(String value) { 
      this.associatedSourceID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedSourceName() {
      return associatedSourceName;
   }

   @JsonIgnore
   public void setAssociatedSourceName(String value) { 
      this.associatedSourceName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedSourceType() {
      return associatedSourceType;
   }

   @JsonIgnore
   public void setAssociatedSourceType(String value) { 
      this.associatedSourceType = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   
   @JsonIgnore
   public Boolean getReadOnly() {
      return readOnly;
   }

   @JsonIgnore
   public void setReadOnly(Boolean value) { 
      this.readOnly = value;
   }
   
   
   @JsonIgnore
   public EType getType() {
      return type;
   }

   @JsonIgnore
   public void setType(EType value) { 
      this.type = value;
   }
   

   
   @JsonIgnore
   public CSNATPoolsFetcher getCSNATPools() {
      return cSNATPools;
   }
   
   @JsonIgnore
   public DemarcationServicesFetcher getDemarcationServices() {
      return demarcationServices;
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
   public NextHopsFetcher getNextHops() {
      return nextHops;
   }
   
   @JsonIgnore
   public OverlayAddressPoolsFetcher getOverlayAddressPools() {
      return overlayAddressPools;
   }
   
   @JsonIgnore
   public PolicyStatementsFetcher getPolicyStatements() {
      return policyStatements;
   }
   
   @JsonIgnore
   public PSNATPoolsFetcher getPSNATPools() {
      return pSNATPools;
   }
   

   public String toString() {
      return "Link [" + "acceptanceCriteria=" + acceptanceCriteria + ", associatedDestinationID=" + associatedDestinationID + ", associatedDestinationName=" + associatedDestinationName + ", associatedDestinationType=" + associatedDestinationType + ", associatedSourceID=" + associatedSourceID + ", associatedSourceName=" + associatedSourceName + ", associatedSourceType=" + associatedSourceType + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", readOnly=" + readOnly + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}