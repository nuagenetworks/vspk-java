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
@RestEntity(restName = "egressqospolicy", resourceName = "egressqospolicies")
public class EgressQOSPolicy extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EDefaultServiceClass { A, B, C, D, E, F, G, H };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EQueue1ForwardingClasses { A, B, C, D, E, F, G, H, NONE };
   public enum EQueue2ForwardingClasses { A, B, C, D, E, F, G, H, NONE };
   public enum EQueue3ForwardingClasses { A, B, C, D, E, F, G, H, NONE };
   public enum EQueue4ForwardingClasses { A, B, C, D, E, F, G, H, NONE };

   
   @JsonProperty(value = "assocEgressQosId")
   
   protected String assocEgressQosId;
   
   @JsonProperty(value = "associatedCOSRemarkingPolicyTableID")
   
   protected String associatedCOSRemarkingPolicyTableID;
   
   @JsonProperty(value = "associatedDSCPRemarkingPolicyTableID")
   
   protected String associatedDSCPRemarkingPolicyTableID;
   
   @JsonProperty(value = "defaultServiceClass")
   
   protected EDefaultServiceClass defaultServiceClass;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "mgmtQueueAssociatedRateLimiterID")
   
   protected String mgmtQueueAssociatedRateLimiterID;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "networkCtrlQueueAssociatedRateLimiterID")
   
   protected String networkCtrlQueueAssociatedRateLimiterID;
   
   @JsonProperty(value = "parentQueueAssociatedRateLimiterID")
   
   protected String parentQueueAssociatedRateLimiterID;
   
   @JsonProperty(value = "queue1AssociatedRateLimiterID")
   
   protected String queue1AssociatedRateLimiterID;
   
   @JsonProperty(value = "queue1ForwardingClasses")
   
   protected java.util.List<EQueue1ForwardingClasses> queue1ForwardingClasses;
   
   @JsonProperty(value = "queue2AssociatedRateLimiterID")
   
   protected String queue2AssociatedRateLimiterID;
   
   @JsonProperty(value = "queue2ForwardingClasses")
   
   protected java.util.List<EQueue2ForwardingClasses> queue2ForwardingClasses;
   
   @JsonProperty(value = "queue3AssociatedRateLimiterID")
   
   protected String queue3AssociatedRateLimiterID;
   
   @JsonProperty(value = "queue3ForwardingClasses")
   
   protected java.util.List<EQueue3ForwardingClasses> queue3ForwardingClasses;
   
   @JsonProperty(value = "queue4AssociatedRateLimiterID")
   
   protected String queue4AssociatedRateLimiterID;
   
   @JsonProperty(value = "queue4ForwardingClasses")
   
   protected java.util.List<EQueue4ForwardingClasses> queue4ForwardingClasses;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public EgressQOSPolicy() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssocEgressQosId() {
      return assocEgressQosId;
   }

   @JsonIgnore
   public void setAssocEgressQosId(String value) { 
      this.assocEgressQosId = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedCOSRemarkingPolicyTableID() {
      return associatedCOSRemarkingPolicyTableID;
   }

   @JsonIgnore
   public void setAssociatedCOSRemarkingPolicyTableID(String value) { 
      this.associatedCOSRemarkingPolicyTableID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedDSCPRemarkingPolicyTableID() {
      return associatedDSCPRemarkingPolicyTableID;
   }

   @JsonIgnore
   public void setAssociatedDSCPRemarkingPolicyTableID(String value) { 
      this.associatedDSCPRemarkingPolicyTableID = value;
   }
   
   
   @JsonIgnore
   public EDefaultServiceClass getDefaultServiceClass() {
      return defaultServiceClass;
   }

   @JsonIgnore
   public void setDefaultServiceClass(EDefaultServiceClass value) { 
      this.defaultServiceClass = value;
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
   public String getMgmtQueueAssociatedRateLimiterID() {
      return mgmtQueueAssociatedRateLimiterID;
   }

   @JsonIgnore
   public void setMgmtQueueAssociatedRateLimiterID(String value) { 
      this.mgmtQueueAssociatedRateLimiterID = value;
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
   public String getNetworkCtrlQueueAssociatedRateLimiterID() {
      return networkCtrlQueueAssociatedRateLimiterID;
   }

   @JsonIgnore
   public void setNetworkCtrlQueueAssociatedRateLimiterID(String value) { 
      this.networkCtrlQueueAssociatedRateLimiterID = value;
   }
   
   
   @JsonIgnore
   public String getParentQueueAssociatedRateLimiterID() {
      return parentQueueAssociatedRateLimiterID;
   }

   @JsonIgnore
   public void setParentQueueAssociatedRateLimiterID(String value) { 
      this.parentQueueAssociatedRateLimiterID = value;
   }
   
   
   @JsonIgnore
   public String getQueue1AssociatedRateLimiterID() {
      return queue1AssociatedRateLimiterID;
   }

   @JsonIgnore
   public void setQueue1AssociatedRateLimiterID(String value) { 
      this.queue1AssociatedRateLimiterID = value;
   }
   
   
   @JsonIgnore
   public java.util.List<EQueue1ForwardingClasses> getQueue1ForwardingClasses() {
      return queue1ForwardingClasses;
   }

   @JsonIgnore
   public void setQueue1ForwardingClasses(java.util.List<EQueue1ForwardingClasses> value) { 
      this.queue1ForwardingClasses = value;
   }
   
   
   @JsonIgnore
   public String getQueue2AssociatedRateLimiterID() {
      return queue2AssociatedRateLimiterID;
   }

   @JsonIgnore
   public void setQueue2AssociatedRateLimiterID(String value) { 
      this.queue2AssociatedRateLimiterID = value;
   }
   
   
   @JsonIgnore
   public java.util.List<EQueue2ForwardingClasses> getQueue2ForwardingClasses() {
      return queue2ForwardingClasses;
   }

   @JsonIgnore
   public void setQueue2ForwardingClasses(java.util.List<EQueue2ForwardingClasses> value) { 
      this.queue2ForwardingClasses = value;
   }
   
   
   @JsonIgnore
   public String getQueue3AssociatedRateLimiterID() {
      return queue3AssociatedRateLimiterID;
   }

   @JsonIgnore
   public void setQueue3AssociatedRateLimiterID(String value) { 
      this.queue3AssociatedRateLimiterID = value;
   }
   
   
   @JsonIgnore
   public java.util.List<EQueue3ForwardingClasses> getQueue3ForwardingClasses() {
      return queue3ForwardingClasses;
   }

   @JsonIgnore
   public void setQueue3ForwardingClasses(java.util.List<EQueue3ForwardingClasses> value) { 
      this.queue3ForwardingClasses = value;
   }
   
   
   @JsonIgnore
   public String getQueue4AssociatedRateLimiterID() {
      return queue4AssociatedRateLimiterID;
   }

   @JsonIgnore
   public void setQueue4AssociatedRateLimiterID(String value) { 
      this.queue4AssociatedRateLimiterID = value;
   }
   
   
   @JsonIgnore
   public java.util.List<EQueue4ForwardingClasses> getQueue4ForwardingClasses() {
      return queue4ForwardingClasses;
   }

   @JsonIgnore
   public void setQueue4ForwardingClasses(java.util.List<EQueue4ForwardingClasses> value) { 
      this.queue4ForwardingClasses = value;
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
      return "EgressQOSPolicy [" + "assocEgressQosId=" + assocEgressQosId + ", associatedCOSRemarkingPolicyTableID=" + associatedCOSRemarkingPolicyTableID + ", associatedDSCPRemarkingPolicyTableID=" + associatedDSCPRemarkingPolicyTableID + ", defaultServiceClass=" + defaultServiceClass + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", mgmtQueueAssociatedRateLimiterID=" + mgmtQueueAssociatedRateLimiterID + ", name=" + name + ", networkCtrlQueueAssociatedRateLimiterID=" + networkCtrlQueueAssociatedRateLimiterID + ", parentQueueAssociatedRateLimiterID=" + parentQueueAssociatedRateLimiterID + ", queue1AssociatedRateLimiterID=" + queue1AssociatedRateLimiterID + ", queue1ForwardingClasses=" + queue1ForwardingClasses + ", queue2AssociatedRateLimiterID=" + queue2AssociatedRateLimiterID + ", queue2ForwardingClasses=" + queue2ForwardingClasses + ", queue3AssociatedRateLimiterID=" + queue3AssociatedRateLimiterID + ", queue3ForwardingClasses=" + queue3ForwardingClasses + ", queue4AssociatedRateLimiterID=" + queue4AssociatedRateLimiterID + ", queue4ForwardingClasses=" + queue4ForwardingClasses + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}