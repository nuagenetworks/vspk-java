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
@RestEntity(restName = "bgpprofile", resourceName = "bgpprofiles")
public class BGPProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "name")
   protected String name;
   
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
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "associatedExportRoutingPolicyID")
   protected String associatedExportRoutingPolicyID;
   
   @JsonProperty(value = "associatedImportRoutingPolicyID")
   protected String associatedImportRoutingPolicyID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public BGPProfile() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public Long getDampeningHalfLife() {
      return dampeningHalfLife;
   }

   public void setDampeningHalfLife(Long value) { 
      this.dampeningHalfLife = value;
   }
   public Long getDampeningMaxSuppress() {
      return dampeningMaxSuppress;
   }

   public void setDampeningMaxSuppress(Long value) { 
      this.dampeningMaxSuppress = value;
   }
   public String getDampeningName() {
      return dampeningName;
   }

   public void setDampeningName(String value) { 
      this.dampeningName = value;
   }
   public Long getDampeningReuse() {
      return dampeningReuse;
   }

   public void setDampeningReuse(Long value) { 
      this.dampeningReuse = value;
   }
   public Long getDampeningSuppress() {
      return dampeningSuppress;
   }

   public void setDampeningSuppress(Long value) { 
      this.dampeningSuppress = value;
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
   public String getAssociatedExportRoutingPolicyID() {
      return associatedExportRoutingPolicyID;
   }

   public void setAssociatedExportRoutingPolicyID(String value) { 
      this.associatedExportRoutingPolicyID = value;
   }
   public String getAssociatedImportRoutingPolicyID() {
      return associatedImportRoutingPolicyID;
   }

   public void setAssociatedImportRoutingPolicyID(String value) { 
      this.associatedImportRoutingPolicyID = value;
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
      return "BGPProfile [" + "name=" + name + ", dampeningHalfLife=" + dampeningHalfLife + ", dampeningMaxSuppress=" + dampeningMaxSuppress + ", dampeningName=" + dampeningName + ", dampeningReuse=" + dampeningReuse + ", dampeningSuppress=" + dampeningSuppress + ", description=" + description + ", entityScope=" + entityScope + ", associatedExportRoutingPolicyID=" + associatedExportRoutingPolicyID + ", associatedImportRoutingPolicyID=" + associatedImportRoutingPolicyID + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}