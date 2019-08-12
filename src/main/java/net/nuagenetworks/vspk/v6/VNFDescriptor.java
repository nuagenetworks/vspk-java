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
import net.nuagenetworks.vspk.v6.fetchers.VNFInterfaceDescriptorsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vnfdescriptor", resourceName = "vnfdescriptors")
public class VNFDescriptor extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EType { FIREWALL, WAN_OPT };

   
   @JsonProperty(value = "CPUCount")
   
   protected Long CPUCount;
   
   @JsonProperty(value = "associatedVNFThresholdPolicyID")
   
   protected String associatedVNFThresholdPolicyID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "memoryMB")
   
   protected Long memoryMB;
   
   @JsonProperty(value = "metadataID")
   
   protected String metadataID;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "storageGB")
   
   protected Long storageGB;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   
   @JsonProperty(value = "vendor")
   
   protected String vendor;
   
   @JsonProperty(value = "visible")
   
   protected Boolean visible;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VNFInterfaceDescriptorsFetcher vNFInterfaceDescriptors;
   

   public VNFDescriptor() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vNFInterfaceDescriptors = new VNFInterfaceDescriptorsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Long getCPUCount() {
      return CPUCount;
   }

   @JsonIgnore
   public void setCPUCount(Long value) { 
      this.CPUCount = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedVNFThresholdPolicyID() {
      return associatedVNFThresholdPolicyID;
   }

   @JsonIgnore
   public void setAssociatedVNFThresholdPolicyID(String value) { 
      this.associatedVNFThresholdPolicyID = value;
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
   public Long getMemoryMB() {
      return memoryMB;
   }

   @JsonIgnore
   public void setMemoryMB(Long value) { 
      this.memoryMB = value;
   }
   
   
   @JsonIgnore
   public String getMetadataID() {
      return metadataID;
   }

   @JsonIgnore
   public void setMetadataID(String value) { 
      this.metadataID = value;
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
   public Long getStorageGB() {
      return storageGB;
   }

   @JsonIgnore
   public void setStorageGB(Long value) { 
      this.storageGB = value;
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
   public String getVendor() {
      return vendor;
   }

   @JsonIgnore
   public void setVendor(String value) { 
      this.vendor = value;
   }
   
   
   @JsonIgnore
   public Boolean getVisible() {
      return visible;
   }

   @JsonIgnore
   public void setVisible(Boolean value) { 
      this.visible = value;
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
   public VNFInterfaceDescriptorsFetcher getVNFInterfaceDescriptors() {
      return vNFInterfaceDescriptors;
   }
   

   public String toString() {
      return "VNFDescriptor [" + "CPUCount=" + CPUCount + ", associatedVNFThresholdPolicyID=" + associatedVNFThresholdPolicyID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", memoryMB=" + memoryMB + ", metadataID=" + metadataID + ", name=" + name + ", storageGB=" + storageGB + ", type=" + type + ", vendor=" + vendor + ", visible=" + visible + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}