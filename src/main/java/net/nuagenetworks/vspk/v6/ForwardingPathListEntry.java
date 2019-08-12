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
@RestEntity(restName = "forwardingpathlistentry", resourceName = "forwardingpathlistentries")
public class ForwardingPathListEntry extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EFCOverride { A, B, C, D, E, F, G, H, NONE };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EForwardingAction { IKE, OVERLAY, UNDERLAY_PAT, UNDERLAY_ROUTE };
   public enum ERemoteUplinkPreference { DEFAULT, PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY };
   public enum EUplinkPreference { DEFAULT, PRIMARY, PRIMARY_SECONDARY, SECONDARY, SECONDARY_PRIMARY };

   
   @JsonProperty(value = "DSCPRemarking")
   
   protected String DSCPRemarking;
   
   @JsonProperty(value = "FCOverride")
   
   protected EFCOverride FCOverride;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "forwardingAction")
   
   protected EForwardingAction forwardingAction;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "priority")
   
   protected Long priority;
   
   @JsonProperty(value = "remoteUplinkPreference")
   
   protected ERemoteUplinkPreference remoteUplinkPreference;
   
   @JsonProperty(value = "slaAware")
   
   protected Boolean slaAware;
   
   @JsonProperty(value = "uplinkPreference")
   
   protected EUplinkPreference uplinkPreference;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public ForwardingPathListEntry() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getDSCPRemarking() {
      return DSCPRemarking;
   }

   @JsonIgnore
   public void setDSCPRemarking(String value) { 
      this.DSCPRemarking = value;
   }
   
   
   @JsonIgnore
   public EFCOverride getFCOverride() {
      return FCOverride;
   }

   @JsonIgnore
   public void setFCOverride(EFCOverride value) { 
      this.FCOverride = value;
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
   public EForwardingAction getForwardingAction() {
      return forwardingAction;
   }

   @JsonIgnore
   public void setForwardingAction(EForwardingAction value) { 
      this.forwardingAction = value;
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
   public Long getPriority() {
      return priority;
   }

   @JsonIgnore
   public void setPriority(Long value) { 
      this.priority = value;
   }
   
   
   @JsonIgnore
   public ERemoteUplinkPreference getRemoteUplinkPreference() {
      return remoteUplinkPreference;
   }

   @JsonIgnore
   public void setRemoteUplinkPreference(ERemoteUplinkPreference value) { 
      this.remoteUplinkPreference = value;
   }
   
   
   @JsonIgnore
   public Boolean getSlaAware() {
      return slaAware;
   }

   @JsonIgnore
   public void setSlaAware(Boolean value) { 
      this.slaAware = value;
   }
   
   
   @JsonIgnore
   public EUplinkPreference getUplinkPreference() {
      return uplinkPreference;
   }

   @JsonIgnore
   public void setUplinkPreference(EUplinkPreference value) { 
      this.uplinkPreference = value;
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
      return "ForwardingPathListEntry [" + "DSCPRemarking=" + DSCPRemarking + ", FCOverride=" + FCOverride + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", forwardingAction=" + forwardingAction + ", lastUpdatedBy=" + lastUpdatedBy + ", priority=" + priority + ", remoteUplinkPreference=" + remoteUplinkPreference + ", slaAware=" + slaAware + ", uplinkPreference=" + uplinkPreference + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}