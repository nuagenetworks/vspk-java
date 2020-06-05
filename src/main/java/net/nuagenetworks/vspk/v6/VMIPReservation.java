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
@RestEntity(restName = "vmipreservation", resourceName = "vmipreservations")
public class VMIPReservation extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EIPType { DUALSTACK, IPV4, IPV6 };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EState { ASSIGNED, ASSIGNED_DELETE_PENDING, UNASSIGNED };

   
   @JsonProperty(value = "IPType")
   
   protected EIPType IPType;
   
   @JsonProperty(value = "IPV4Address")
   
   protected String IPV4Address;
   
   @JsonProperty(value = "IPV6Address")
   
   protected String IPV6Address;
   
   @JsonProperty(value = "IPV6AllocationPools")
   
   protected java.util.List<AllocationPool> IPV6AllocationPools;
   
   @JsonProperty(value = "allocationPools")
   
   protected java.util.List<AllocationPool> allocationPools;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "state")
   
   protected EState state;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public VMIPReservation() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EIPType getIPType() {
      return IPType;
   }

   @JsonIgnore
   public void setIPType(EIPType value) { 
      this.IPType = value;
   }
   
   
   @JsonIgnore
   public String getIPV4Address() {
      return IPV4Address;
   }

   @JsonIgnore
   public void setIPV4Address(String value) { 
      this.IPV4Address = value;
   }
   
   
   @JsonIgnore
   public String getIPV6Address() {
      return IPV6Address;
   }

   @JsonIgnore
   public void setIPV6Address(String value) { 
      this.IPV6Address = value;
   }
   
   
   @JsonIgnore
   public java.util.List<AllocationPool> getIPV6AllocationPools() {
      return IPV6AllocationPools;
   }

   @JsonIgnore
   public void setIPV6AllocationPools(java.util.List<AllocationPool> value) { 
      this.IPV6AllocationPools = value;
   }
   
   
   @JsonIgnore
   public java.util.List<AllocationPool> getAllocationPools() {
      return allocationPools;
   }

   @JsonIgnore
   public void setAllocationPools(java.util.List<AllocationPool> value) { 
      this.allocationPools = value;
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
   public EState getState() {
      return state;
   }

   @JsonIgnore
   public void setState(EState value) { 
      this.state = value;
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
      return "VMIPReservation [" + "IPType=" + IPType + ", IPV4Address=" + IPV4Address + ", IPV6Address=" + IPV6Address + ", IPV6AllocationPools=" + IPV6AllocationPools + ", allocationPools=" + allocationPools + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", state=" + state + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}