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


import net.nuagenetworks.vspk.v6.fetchers.DeploymentFailuresFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ingressprofile", resourceName = "ingressprofiles")
public class IngressProfile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "assocEntityType")
   
   protected String assocEntityType;
   
   @JsonProperty(value = "associatedIPFilterProfileID")
   
   protected String associatedIPFilterProfileID;
   
   @JsonProperty(value = "associatedIPFilterProfileName")
   
   protected String associatedIPFilterProfileName;
   
   @JsonProperty(value = "associatedIPv6FilterProfileID")
   
   protected String associatedIPv6FilterProfileID;
   
   @JsonProperty(value = "associatedIPv6FilterProfileName")
   
   protected String associatedIPv6FilterProfileName;
   
   @JsonProperty(value = "associatedMACFilterProfileID")
   
   protected String associatedMACFilterProfileID;
   
   @JsonProperty(value = "associatedMACFilterProfileName")
   
   protected String associatedMACFilterProfileName;
   
   @JsonProperty(value = "associatedSAPIngressQoSProfileID")
   
   protected String associatedSAPIngressQoSProfileID;
   
   @JsonProperty(value = "associatedSAPIngressQoSProfileName")
   
   protected String associatedSAPIngressQoSProfileName;
   
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
   
   @JsonProperty(value = "name")
   
   protected String name;
   

   
   @JsonIgnore
   private DeploymentFailuresFetcher deploymentFailures;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   

   public IngressProfile() {
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
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
   public String getAssociatedIPFilterProfileID() {
      return associatedIPFilterProfileID;
   }

   @JsonIgnore
   public void setAssociatedIPFilterProfileID(String value) { 
      this.associatedIPFilterProfileID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIPFilterProfileName() {
      return associatedIPFilterProfileName;
   }

   @JsonIgnore
   public void setAssociatedIPFilterProfileName(String value) { 
      this.associatedIPFilterProfileName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIPv6FilterProfileID() {
      return associatedIPv6FilterProfileID;
   }

   @JsonIgnore
   public void setAssociatedIPv6FilterProfileID(String value) { 
      this.associatedIPv6FilterProfileID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIPv6FilterProfileName() {
      return associatedIPv6FilterProfileName;
   }

   @JsonIgnore
   public void setAssociatedIPv6FilterProfileName(String value) { 
      this.associatedIPv6FilterProfileName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedMACFilterProfileID() {
      return associatedMACFilterProfileID;
   }

   @JsonIgnore
   public void setAssociatedMACFilterProfileID(String value) { 
      this.associatedMACFilterProfileID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedMACFilterProfileName() {
      return associatedMACFilterProfileName;
   }

   @JsonIgnore
   public void setAssociatedMACFilterProfileName(String value) { 
      this.associatedMACFilterProfileName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedSAPIngressQoSProfileID() {
      return associatedSAPIngressQoSProfileID;
   }

   @JsonIgnore
   public void setAssociatedSAPIngressQoSProfileID(String value) { 
      this.associatedSAPIngressQoSProfileID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedSAPIngressQoSProfileName() {
      return associatedSAPIngressQoSProfileName;
   }

   @JsonIgnore
   public void setAssociatedSAPIngressQoSProfileName(String value) { 
      this.associatedSAPIngressQoSProfileName = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   

   
   @JsonIgnore
   public DeploymentFailuresFetcher getDeploymentFailures() {
      return deploymentFailures;
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
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "IngressProfile [" + "assocEntityType=" + assocEntityType + ", associatedIPFilterProfileID=" + associatedIPFilterProfileID + ", associatedIPFilterProfileName=" + associatedIPFilterProfileName + ", associatedIPv6FilterProfileID=" + associatedIPv6FilterProfileID + ", associatedIPv6FilterProfileName=" + associatedIPv6FilterProfileName + ", associatedMACFilterProfileID=" + associatedMACFilterProfileID + ", associatedMACFilterProfileName=" + associatedMACFilterProfileName + ", associatedSAPIngressQoSProfileID=" + associatedSAPIngressQoSProfileID + ", associatedSAPIngressQoSProfileName=" + associatedSAPIngressQoSProfileName + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}