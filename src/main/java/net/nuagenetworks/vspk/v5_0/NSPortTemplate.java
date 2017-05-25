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

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VLANTemplatesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsporttemplate", resourceName = "nsporttemplates")
public class NSPortTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PortType { ACCESS, NETWORK };
   public enum Speed { AUTONEGOTIATE, BASET10, BASET1000, BASETX100, BASEX10G };

   
   @JsonProperty(value = "VLANRange")
   protected String VLANRange;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
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
   
   @JsonProperty(value = "mtu")
   protected Long mtu;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "networkAccelerationEnabled")
   protected Boolean networkAccelerationEnabled;
   
   @JsonProperty(value = "physicalName")
   protected String physicalName;
   
   @JsonProperty(value = "portType")
   protected PortType portType;
   
   @JsonProperty(value = "speed")
   protected Speed speed;
   

   
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

   @JsonIgnore
   public String getVLANRange() {
      return VLANRange;
   }

   @JsonIgnore
   public void setVLANRange(String value) { 
      this.VLANRange = value;
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   @JsonIgnore
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
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
   public String getInfrastructureProfileID() {
      return infrastructureProfileID;
   }

   @JsonIgnore
   public void setInfrastructureProfileID(String value) { 
      this.infrastructureProfileID = value;
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
   public Long getMtu() {
      return mtu;
   }

   @JsonIgnore
   public void setMtu(Long value) { 
      this.mtu = value;
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
   public Boolean getNetworkAccelerationEnabled() {
      return networkAccelerationEnabled;
   }

   @JsonIgnore
   public void setNetworkAccelerationEnabled(Boolean value) { 
      this.networkAccelerationEnabled = value;
   }
   @JsonIgnore
   public String getPhysicalName() {
      return physicalName;
   }

   @JsonIgnore
   public void setPhysicalName(String value) { 
      this.physicalName = value;
   }
   @JsonIgnore
   public PortType getPortType() {
      return portType;
   }

   @JsonIgnore
   public void setPortType(PortType value) { 
      this.portType = value;
   }
   @JsonIgnore
   public Speed getSpeed() {
      return speed;
   }

   @JsonIgnore
   public void setSpeed(Speed value) { 
      this.speed = value;
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
   public VLANTemplatesFetcher getVLANTemplates() {
      return vLANTemplates;
   }
   

   public String toString() {
      return "NSPortTemplate [" + "VLANRange=" + VLANRange + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", infrastructureProfileID=" + infrastructureProfileID + ", lastUpdatedBy=" + lastUpdatedBy + ", mtu=" + mtu + ", name=" + name + ", networkAccelerationEnabled=" + networkAccelerationEnabled + ", physicalName=" + physicalName + ", portType=" + portType + ", speed=" + speed + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}