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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "aggregatemetadata", resourceName = "aggregatemetadatas")
public class AggregateMetadata extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "assocEntityType")
   
   protected String assocEntityType;
   
   @JsonProperty(value = "blob")
   
   protected String blob;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "global")
   
   protected Boolean globalMetadata;
   
   @JsonProperty(value = "metadataTagIDs")
   
   protected java.util.List<String> metadataTagIDs;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "networkNotificationDisabled")
   
   protected Boolean networkNotificationDisabled;
   

   

   public AggregateMetadata() {
      
   }

   
   
   @JsonIgnore
   public String getAssocEntityType() {
      return assocEntityType;
   }

   @JsonIgnore
   public void setAssocEntityType(String value) { 
      this.assocEntityType = value;
   }
   
   
   @JsonIgnore
   public String getBlob() {
      return blob;
   }

   @JsonIgnore
   public void setBlob(String value) { 
      this.blob = value;
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
   public Boolean getGlobalMetadata() {
      return globalMetadata;
   }

   @JsonIgnore
   public void setGlobalMetadata(Boolean value) { 
      this.globalMetadata = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getMetadataTagIDs() {
      return metadataTagIDs;
   }

   @JsonIgnore
   public void setMetadataTagIDs(java.util.List<String> value) { 
      this.metadataTagIDs = value;
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
   public Boolean getNetworkNotificationDisabled() {
      return networkNotificationDisabled;
   }

   @JsonIgnore
   public void setNetworkNotificationDisabled(Boolean value) { 
      this.networkNotificationDisabled = value;
   }
   

   

   public String toString() {
      return "AggregateMetadata [" + "assocEntityType=" + assocEntityType + ", blob=" + blob + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", globalMetadata=" + globalMetadata + ", metadataTagIDs=" + metadataTagIDs + ", name=" + name + ", networkNotificationDisabled=" + networkNotificationDisabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}