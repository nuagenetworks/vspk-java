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

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vportmirror", resourceName = "vportmirrors")
public class VPortMirror extends RestObject {

   
   public enum MirrorDirection { BOTH, EGRESS, INGRESS };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "VPortName")
   protected String VPortName;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "networkName")
   protected String networkName;
   
   @JsonProperty(value = "mirrorDestinationID")
   protected String mirrorDestinationID;
   
   @JsonProperty(value = "mirrorDestinationName")
   protected String mirrorDestinationName;
   
   @JsonProperty(value = "mirrorDirection")
   protected MirrorDirection mirrorDirection;
   
   @JsonProperty(value = "enterpiseName")
   protected String enterpiseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "vportId")
   protected String vportId;
   
   @JsonProperty(value = "attachedNetworkType")
   protected String attachedNetworkType;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public VPortMirror() {
      mirrorDirection = MirrorDirection.BOTH;
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public String getVPortName() {
      return VPortName;
   }

   public void setVPortName(String value) { 
      this.VPortName = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getNetworkName() {
      return networkName;
   }

   public void setNetworkName(String value) { 
      this.networkName = value;
   }
   public String getMirrorDestinationID() {
      return mirrorDestinationID;
   }

   public void setMirrorDestinationID(String value) { 
      this.mirrorDestinationID = value;
   }
   public String getMirrorDestinationName() {
      return mirrorDestinationName;
   }

   public void setMirrorDestinationName(String value) { 
      this.mirrorDestinationName = value;
   }
   public MirrorDirection getMirrorDirection() {
      return mirrorDirection;
   }

   public void setMirrorDirection(MirrorDirection value) { 
      this.mirrorDirection = value;
   }
   public String getEnterpiseName() {
      return enterpiseName;
   }

   public void setEnterpiseName(String value) { 
      this.enterpiseName = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getDomainName() {
      return domainName;
   }

   public void setDomainName(String value) { 
      this.domainName = value;
   }
   public String getVportId() {
      return vportId;
   }

   public void setVportId(String value) { 
      this.vportId = value;
   }
   public String getAttachedNetworkType() {
      return attachedNetworkType;
   }

   public void setAttachedNetworkType(String value) { 
      this.attachedNetworkType = value;
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
      return "VPortMirror [" + "VPortName=" + VPortName + ", lastUpdatedBy=" + lastUpdatedBy + ", networkName=" + networkName + ", mirrorDestinationID=" + mirrorDestinationID + ", mirrorDestinationName=" + mirrorDestinationName + ", mirrorDirection=" + mirrorDirection + ", enterpiseName=" + enterpiseName + ", entityScope=" + entityScope + ", domainName=" + domainName + ", vportId=" + vportId + ", attachedNetworkType=" + attachedNetworkType + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}