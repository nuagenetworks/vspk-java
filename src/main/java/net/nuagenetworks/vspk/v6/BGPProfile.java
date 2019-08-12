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
@RestEntity(restName = "bgpprofile", resourceName = "bgpprofiles")
public class BGPProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "associatedExportRoutingPolicyID")
   
   protected String associatedExportRoutingPolicyID;
   
   @JsonProperty(value = "associatedImportRoutingPolicyID")
   
   protected String associatedImportRoutingPolicyID;
   
   @JsonProperty(value = "dampeningHalfLife")
   
   protected Long dampeningHalfLife;
   
   @JsonProperty(value = "dampeningMaxSuppress")
   
   protected Long dampeningMaxSuppress;
   
   @JsonProperty(value = "dampeningName")
   
   protected String dampeningName;
   
   @JsonProperty(value = "dampeningReuse")
   
   protected Long dampeningReuse;
   
   @JsonProperty(value = "dampeningSuppress")
   
   protected Long dampeningSuppress;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "name")
   
   protected String name;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public BGPProfile() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssociatedExportRoutingPolicyID() {
      return associatedExportRoutingPolicyID;
   }

   @JsonIgnore
   public void setAssociatedExportRoutingPolicyID(String value) { 
      this.associatedExportRoutingPolicyID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedImportRoutingPolicyID() {
      return associatedImportRoutingPolicyID;
   }

   @JsonIgnore
   public void setAssociatedImportRoutingPolicyID(String value) { 
      this.associatedImportRoutingPolicyID = value;
   }
   
   
   @JsonIgnore
   public Long getDampeningHalfLife() {
      return dampeningHalfLife;
   }

   @JsonIgnore
   public void setDampeningHalfLife(Long value) { 
      this.dampeningHalfLife = value;
   }
   
   
   @JsonIgnore
   public Long getDampeningMaxSuppress() {
      return dampeningMaxSuppress;
   }

   @JsonIgnore
   public void setDampeningMaxSuppress(Long value) { 
      this.dampeningMaxSuppress = value;
   }
   
   
   @JsonIgnore
   public String getDampeningName() {
      return dampeningName;
   }

   @JsonIgnore
   public void setDampeningName(String value) { 
      this.dampeningName = value;
   }
   
   
   @JsonIgnore
   public Long getDampeningReuse() {
      return dampeningReuse;
   }

   @JsonIgnore
   public void setDampeningReuse(Long value) { 
      this.dampeningReuse = value;
   }
   
   
   @JsonIgnore
   public Long getDampeningSuppress() {
      return dampeningSuppress;
   }

   @JsonIgnore
   public void setDampeningSuppress(Long value) { 
      this.dampeningSuppress = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
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
      return "BGPProfile [" + "associatedExportRoutingPolicyID=" + associatedExportRoutingPolicyID + ", associatedImportRoutingPolicyID=" + associatedImportRoutingPolicyID + ", dampeningHalfLife=" + dampeningHalfLife + ", dampeningMaxSuppress=" + dampeningMaxSuppress + ", dampeningName=" + dampeningName + ", dampeningReuse=" + dampeningReuse + ", dampeningSuppress=" + dampeningSuppress + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", name=" + name + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}