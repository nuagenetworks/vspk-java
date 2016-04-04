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


package vspk.v4_0;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v4_0.fetchers.EventLogsFetcher;
import vspk.v4_0.fetchers.MetadataTagsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata extends RestObject {

   public final static String REST_NAME = "metadata";
   public final static String RESOURCE_NAME = "metadatas";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "blob")
   protected String blob;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "globalMetadata")
   protected boolean globalMetadata;
   
   @JsonProperty(value = "metadataTagIDs")
   protected java.util.List<String> metadataTagIDs;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "networkNotificationDisabled")
   protected boolean networkNotificationDisabled;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private MetadataTagsFetcher metadataTags;
   

   public Metadata() {
      
      eventLogs = new EventLogsFetcher(this);
      
      metadataTags = new MetadataTagsFetcher(this);
      
   }

   public String getBlob() {
      return blob;
   }

   public void setBlob(String value) { 
      this.blob = value;
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
   public boolean getGlobalMetadata() {
      return globalMetadata;
   }

   public void setGlobalMetadata(boolean value) { 
      this.globalMetadata = value;
   }
   public java.util.List<String> getMetadataTagIDs() {
      return metadataTagIDs;
   }

   public void setMetadataTagIDs(java.util.List<String> value) { 
      this.metadataTagIDs = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public boolean getNetworkNotificationDisabled() {
      return networkNotificationDisabled;
   }

   public void setNetworkNotificationDisabled(boolean value) { 
      this.networkNotificationDisabled = value;
   }
   

   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public MetadataTagsFetcher getMetadataTags() {
      return metadataTags;
   }
   

   public String toString() {
      return "Metadata [" + "blob=" + blob + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", globalMetadata=" + globalMetadata + ", metadataTagIDs=" + metadataTagIDs + ", name=" + name + ", networkNotificationDisabled=" + networkNotificationDisabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}