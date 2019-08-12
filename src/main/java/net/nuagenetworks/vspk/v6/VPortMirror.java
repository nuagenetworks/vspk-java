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
@RestEntity(restName = "vportmirror", resourceName = "vportmirrors")
public class VPortMirror extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EMirrorDirection { BOTH, EGRESS, INGRESS };

   
   @JsonProperty(value = "attachedNetworkType")
   
   protected String attachedNetworkType;
   
   @JsonProperty(value = "domainName")
   
   protected String domainName;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpiseName")
   
   protected String enterpiseName;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "mirrorDestinationID")
   
   protected String mirrorDestinationID;
   
   @JsonProperty(value = "mirrorDestinationName")
   
   protected String mirrorDestinationName;
   
   @JsonProperty(value = "mirrorDirection")
   
   protected EMirrorDirection mirrorDirection;
   
   @JsonProperty(value = "networkName")
   
   protected String networkName;
   
   @JsonProperty(value = "vportId")
   
   protected String vportId;
   
   @JsonProperty(value = "vportName")
   
   protected String vportName;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public VPortMirror() {
      mirrorDirection = EMirrorDirection.BOTH;
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAttachedNetworkType() {
      return attachedNetworkType;
   }

   @JsonIgnore
   public void setAttachedNetworkType(String value) { 
      this.attachedNetworkType = value;
   }
   
   
   @JsonIgnore
   public String getDomainName() {
      return domainName;
   }

   @JsonIgnore
   public void setDomainName(String value) { 
      this.domainName = value;
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
   public String getEnterpiseName() {
      return enterpiseName;
   }

   @JsonIgnore
   public void setEnterpiseName(String value) { 
      this.enterpiseName = value;
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
   public String getMirrorDestinationID() {
      return mirrorDestinationID;
   }

   @JsonIgnore
   public void setMirrorDestinationID(String value) { 
      this.mirrorDestinationID = value;
   }
   
   
   @JsonIgnore
   public String getMirrorDestinationName() {
      return mirrorDestinationName;
   }

   @JsonIgnore
   public void setMirrorDestinationName(String value) { 
      this.mirrorDestinationName = value;
   }
   
   
   @JsonIgnore
   public EMirrorDirection getMirrorDirection() {
      return mirrorDirection;
   }

   @JsonIgnore
   public void setMirrorDirection(EMirrorDirection value) { 
      this.mirrorDirection = value;
   }
   
   
   @JsonIgnore
   public String getNetworkName() {
      return networkName;
   }

   @JsonIgnore
   public void setNetworkName(String value) { 
      this.networkName = value;
   }
   
   
   @JsonIgnore
   public String getVportId() {
      return vportId;
   }

   @JsonIgnore
   public void setVportId(String value) { 
      this.vportId = value;
   }
   
   
   @JsonIgnore
   public String getVportName() {
      return vportName;
   }

   @JsonIgnore
   public void setVportName(String value) { 
      this.vportName = value;
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
      return "VPortMirror [" + "attachedNetworkType=" + attachedNetworkType + ", domainName=" + domainName + ", embeddedMetadata=" + embeddedMetadata + ", enterpiseName=" + enterpiseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", mirrorDestinationID=" + mirrorDestinationID + ", mirrorDestinationName=" + mirrorDestinationName + ", mirrorDirection=" + mirrorDirection + ", networkName=" + networkName + ", vportId=" + vportId + ", vportName=" + vportName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}