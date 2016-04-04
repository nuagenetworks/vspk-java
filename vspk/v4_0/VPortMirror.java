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

import vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import vspk.v4_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VPortMirror extends RestObject {

   public final static String REST_NAME = "vportmirror";
   public final static String RESOURCE_NAME = "vportmirrors";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum MirrorDirection { BOTH, EGRESS, INGRESS };

   
   @JsonProperty(value = "VPortName")
   protected String VPortName;
   
   @JsonProperty(value = "attachedNetworkType")
   protected String attachedNetworkType;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "enterpiseName")
   protected String enterpiseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "mirrorDestinationID")
   protected String mirrorDestinationID;
   
   @JsonProperty(value = "mirrorDestinationName")
   protected String mirrorDestinationName;
   
   @JsonProperty(value = "mirrorDirection")
   protected MirrorDirection mirrorDirection;
   
   @JsonProperty(value = "networkName")
   protected String networkName;
   
   @JsonProperty(value = "vportId")
   protected String vportId;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public VPortMirror() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public String getVPortName() {
      return VPortName;
   }

   public void setVPortName(String value) { 
      this.VPortName = value;
   }
   public String getAttachedNetworkType() {
      return attachedNetworkType;
   }

   public void setAttachedNetworkType(String value) { 
      this.attachedNetworkType = value;
   }
   public String getDomainName() {
      return domainName;
   }

   public void setDomainName(String value) { 
      this.domainName = value;
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
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public String getNetworkName() {
      return networkName;
   }

   public void setNetworkName(String value) { 
      this.networkName = value;
   }
   public String getVportId() {
      return vportId;
   }

   public void setVportId(String value) { 
      this.vportId = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "VPortMirror [" + "VPortName=" + VPortName + ", attachedNetworkType=" + attachedNetworkType + ", domainName=" + domainName + ", enterpiseName=" + enterpiseName + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", mirrorDestinationID=" + mirrorDestinationID + ", mirrorDestinationName=" + mirrorDestinationName + ", mirrorDirection=" + mirrorDirection + ", networkName=" + networkName + ", vportId=" + vportId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}