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

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "bgpneighbor", resourceName = "bgpneighbors")
public class BGPNeighbor extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EIPType { IPV4, IPV6 };
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "BFDEnabled")
   
   protected Boolean BFDEnabled;
   
   @JsonProperty(value = "IPType")
   
   protected EIPType IPType;
   
   @JsonProperty(value = "IPv6Address")
   
   protected String IPv6Address;
   
   @JsonProperty(value = "associatedExportRoutingPolicyID")
   
   protected String associatedExportRoutingPolicyID;
   
   @JsonProperty(value = "associatedImportRoutingPolicyID")
   
   protected String associatedImportRoutingPolicyID;
   
   @JsonProperty(value = "dampeningEnabled")
   
   protected Boolean dampeningEnabled;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "domainServiceLabel")
   
   protected String domainServiceLabel;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "peerAS")
   
   protected Long peerAS;
   
   @JsonProperty(value = "peerConfiguration")
   
   protected String peerConfiguration;
   
   @JsonProperty(value = "peerIP")
   
   protected String peerIP;
   
   @JsonProperty(value = "session")
   
   protected String session;
   

   
   @JsonIgnore
   private DeploymentFailuresFetcher deploymentFailures;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public BGPNeighbor() {
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getBFDEnabled() {
      return BFDEnabled;
   }

   @JsonIgnore
   public void setBFDEnabled(Boolean value) { 
      this.BFDEnabled = value;
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
   public String getIPv6Address() {
      return IPv6Address;
   }

   @JsonIgnore
   public void setIPv6Address(String value) { 
      this.IPv6Address = value;
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
   public Boolean getDampeningEnabled() {
      return dampeningEnabled;
   }

   @JsonIgnore
   public void setDampeningEnabled(Boolean value) { 
      this.dampeningEnabled = value;
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
   public String getDomainServiceLabel() {
      return domainServiceLabel;
   }

   @JsonIgnore
   public void setDomainServiceLabel(String value) { 
      this.domainServiceLabel = value;
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
   public Long getPeerAS() {
      return peerAS;
   }

   @JsonIgnore
   public void setPeerAS(Long value) { 
      this.peerAS = value;
   }
   
   
   @JsonIgnore
   public String getPeerConfiguration() {
      return peerConfiguration;
   }

   @JsonIgnore
   public void setPeerConfiguration(String value) { 
      this.peerConfiguration = value;
   }
   
   
   @JsonIgnore
   public String getPeerIP() {
      return peerIP;
   }

   @JsonIgnore
   public void setPeerIP(String value) { 
      this.peerIP = value;
   }
   
   
   @JsonIgnore
   public String getSession() {
      return session;
   }

   @JsonIgnore
   public void setSession(String value) { 
      this.session = value;
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
   

   public String toString() {
      return "BGPNeighbor [" + "BFDEnabled=" + BFDEnabled + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", associatedExportRoutingPolicyID=" + associatedExportRoutingPolicyID + ", associatedImportRoutingPolicyID=" + associatedImportRoutingPolicyID + ", dampeningEnabled=" + dampeningEnabled + ", description=" + description + ", domainServiceLabel=" + domainServiceLabel + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", name=" + name + ", peerAS=" + peerAS + ", peerConfiguration=" + peerConfiguration + ", peerIP=" + peerIP + ", session=" + session + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}