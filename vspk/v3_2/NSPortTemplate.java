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
import vspk.v3_2.fetchers.VLANTemplatesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NSPortTemplate extends RestObject {

   public final static String REST_NAME = "nsporttemplate";
   public final static String RESOURCE_NAME = "nsporttemplates";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PortType { ACCESS, NETWORK };

   
   @JsonProperty(value = "VLANRange")
   protected String VLANRange;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "associatedVSCProfileID")
   protected String associatedVSCProfileID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "infrastructureProfileID")
   protected String infrastructureProfileID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "physicalName")
   protected String physicalName;
   
   @JsonProperty(value = "portType")
   protected PortType portType;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VLANTemplatesFetcher vLANTemplates;
   

   public NSPortTemplate() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vLANTemplates = new VLANTemplatesFetcher(this);
      
   }

   public String getVLANRange() {
      return VLANRange;
   }

   public void setVLANRange(String value) { 
      this.VLANRange = value;
   }
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   public String getAssociatedVSCProfileID() {
      return associatedVSCProfileID;
   }

   public void setAssociatedVSCProfileID(String value) { 
      this.associatedVSCProfileID = value;
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
   public String getInfrastructureProfileID() {
      return infrastructureProfileID;
   }

   public void setInfrastructureProfileID(String value) { 
      this.infrastructureProfileID = value;
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
   public String getPhysicalName() {
      return physicalName;
   }

   public void setPhysicalName(String value) { 
      this.physicalName = value;
   }
   public PortType getPortType() {
      return portType;
   }

   public void setPortType(PortType value) { 
      this.portType = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public VLANTemplatesFetcher getVLANTemplates() {
      return vLANTemplates;
   }
   

   public String toString() {
      return "NSPortTemplate [" + "VLANRange=" + VLANRange + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", infrastructureProfileID=" + infrastructureProfileID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", physicalName=" + physicalName + ", portType=" + portType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}