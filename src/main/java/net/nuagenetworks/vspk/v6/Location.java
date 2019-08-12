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
@RestEntity(restName = "location", resourceName = "locations")
public class Location extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "address")
   
   protected String address;
   
   @JsonProperty(value = "associatedEntityName")
   
   protected String associatedEntityName;
   
   @JsonProperty(value = "associatedEntityType")
   
   protected String associatedEntityType;
   
   @JsonProperty(value = "country")
   
   protected String country;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "ignoreGeocode")
   
   protected Boolean ignoreGeocode;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "latitude")
   
   protected Float latitude;
   
   @JsonProperty(value = "locality")
   
   protected String locality;
   
   @JsonProperty(value = "longitude")
   
   protected Float longitude;
   
   @JsonProperty(value = "state")
   
   protected String state;
   
   @JsonProperty(value = "timeZoneID")
   
   protected String timeZoneID;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public Location() {
      timeZoneID = "UTC";
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(String value) { 
      this.address = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEntityName() {
      return associatedEntityName;
   }

   @JsonIgnore
   public void setAssociatedEntityName(String value) { 
      this.associatedEntityName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEntityType() {
      return associatedEntityType;
   }

   @JsonIgnore
   public void setAssociatedEntityType(String value) { 
      this.associatedEntityType = value;
   }
   
   
   @JsonIgnore
   public String getCountry() {
      return country;
   }

   @JsonIgnore
   public void setCountry(String value) { 
      this.country = value;
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
   public Boolean getIgnoreGeocode() {
      return ignoreGeocode;
   }

   @JsonIgnore
   public void setIgnoreGeocode(Boolean value) { 
      this.ignoreGeocode = value;
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
   public Float getLatitude() {
      return latitude;
   }

   @JsonIgnore
   public void setLatitude(Float value) { 
      this.latitude = value;
   }
   
   
   @JsonIgnore
   public String getLocality() {
      return locality;
   }

   @JsonIgnore
   public void setLocality(String value) { 
      this.locality = value;
   }
   
   
   @JsonIgnore
   public Float getLongitude() {
      return longitude;
   }

   @JsonIgnore
   public void setLongitude(Float value) { 
      this.longitude = value;
   }
   
   
   @JsonIgnore
   public String getState() {
      return state;
   }

   @JsonIgnore
   public void setState(String value) { 
      this.state = value;
   }
   
   
   @JsonIgnore
   public String getTimeZoneID() {
      return timeZoneID;
   }

   @JsonIgnore
   public void setTimeZoneID(String value) { 
      this.timeZoneID = value;
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
      return "Location [" + "address=" + address + ", associatedEntityName=" + associatedEntityName + ", associatedEntityType=" + associatedEntityType + ", country=" + country + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", ignoreGeocode=" + ignoreGeocode + ", lastUpdatedBy=" + lastUpdatedBy + ", latitude=" + latitude + ", locality=" + locality + ", longitude=" + longitude + ", state=" + state + ", timeZoneID=" + timeZoneID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}