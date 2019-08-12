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


import net.nuagenetworks.vspk.v6.fetchers.BRConnectionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.UplinkConnectionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vlantemplate", resourceName = "vlantemplates")
public class VLANTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAssociatedConnectionType { BR_CONNECTION, UPLINK_CONNECTION };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EType { ACCESS, BR, DUC, UPLINK };

   
   @JsonProperty(value = "associatedConnectionType")
   
   protected EAssociatedConnectionType associatedConnectionType;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "associatedIngressOverlayQoSPolicerID")
   
   protected String associatedIngressOverlayQoSPolicerID;
   
   @JsonProperty(value = "associatedIngressQOSPolicyID")
   
   protected String associatedIngressQOSPolicyID;
   
   @JsonProperty(value = "associatedIngressUnderlayQoSPolicerID")
   
   protected String associatedIngressUnderlayQoSPolicerID;
   
   @JsonProperty(value = "associatedUplinkConnectionID")
   
   protected String associatedUplinkConnectionID;
   
   @JsonProperty(value = "associatedVSCProfileID")
   
   protected String associatedVSCProfileID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "ducVlan")
   
   protected Boolean ducVlan;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "isUplink")
   
   protected Boolean isUplink;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   
   @JsonProperty(value = "value")
   
   protected Long value;
   

   
   @JsonIgnore
   private BRConnectionsFetcher bRConnections;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private UplinkConnectionsFetcher uplinkConnections;
   

   public VLANTemplate() {
      
      bRConnections = new BRConnectionsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      uplinkConnections = new UplinkConnectionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EAssociatedConnectionType getAssociatedConnectionType() {
      return associatedConnectionType;
   }

   @JsonIgnore
   public void setAssociatedConnectionType(EAssociatedConnectionType value) { 
      this.associatedConnectionType = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIngressOverlayQoSPolicerID() {
      return associatedIngressOverlayQoSPolicerID;
   }

   @JsonIgnore
   public void setAssociatedIngressOverlayQoSPolicerID(String value) { 
      this.associatedIngressOverlayQoSPolicerID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIngressQOSPolicyID() {
      return associatedIngressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedIngressQOSPolicyID(String value) { 
      this.associatedIngressQOSPolicyID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIngressUnderlayQoSPolicerID() {
      return associatedIngressUnderlayQoSPolicerID;
   }

   @JsonIgnore
   public void setAssociatedIngressUnderlayQoSPolicerID(String value) { 
      this.associatedIngressUnderlayQoSPolicerID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedUplinkConnectionID() {
      return associatedUplinkConnectionID;
   }

   @JsonIgnore
   public void setAssociatedUplinkConnectionID(String value) { 
      this.associatedUplinkConnectionID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedVSCProfileID() {
      return associatedVSCProfileID;
   }

   @JsonIgnore
   public void setAssociatedVSCProfileID(String value) { 
      this.associatedVSCProfileID = value;
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
   public Boolean getDucVlan() {
      return ducVlan;
   }

   @JsonIgnore
   public void setDucVlan(Boolean value) { 
      this.ducVlan = value;
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
   public Boolean getIsUplink() {
      return isUplink;
   }

   @JsonIgnore
   public void setIsUplink(Boolean value) { 
      this.isUplink = value;
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
   public EType getType() {
      return type;
   }

   @JsonIgnore
   public void setType(EType value) { 
      this.type = value;
   }
   
   
   @JsonIgnore
   public Long getValue() {
      return value;
   }

   @JsonIgnore
   public void setValue(Long value) { 
      this.value = value;
   }
   

   
   @JsonIgnore
   public BRConnectionsFetcher getBRConnections() {
      return bRConnections;
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
   public UplinkConnectionsFetcher getUplinkConnections() {
      return uplinkConnections;
   }
   

   public String toString() {
      return "VLANTemplate [" + "associatedConnectionType=" + associatedConnectionType + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedIngressOverlayQoSPolicerID=" + associatedIngressOverlayQoSPolicerID + ", associatedIngressQOSPolicyID=" + associatedIngressQOSPolicyID + ", associatedIngressUnderlayQoSPolicerID=" + associatedIngressUnderlayQoSPolicerID + ", associatedUplinkConnectionID=" + associatedUplinkConnectionID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", description=" + description + ", ducVlan=" + ducVlan + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", isUplink=" + isUplink + ", lastUpdatedBy=" + lastUpdatedBy + ", type=" + type + ", value=" + value + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}