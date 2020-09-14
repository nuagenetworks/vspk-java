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


import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VirtualIPsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "redirectiontarget", resourceName = "redirectiontargets")
public class RedirectionTarget extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EDestinationType { OVERLAY_MIRROR_DESTINATION, REDIRECTION_TARGET };
   public enum EEndPointType { L3, NSG_VNF, VIRTUAL_WIRE };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum ETriggerType { GARP, NONE };

   
   @JsonProperty(value = "ESI")
   
   protected String ESI;
   
   @JsonProperty(value = "autoCreated")
   
   protected Boolean autoCreated;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "destinationType")
   
   protected EDestinationType destinationType;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "endPointType")
   
   protected EEndPointType endPointType;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "redundancyEnabled")
   
   protected Boolean redundancyEnabled;
   
   @JsonProperty(value = "templateID")
   
   protected String templateID;
   
   @JsonProperty(value = "triggerType")
   
   protected ETriggerType triggerType;
   
   @JsonProperty(value = "virtualNetworkID")
   
   protected String virtualNetworkID;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private VirtualIPsFetcher virtualIPs;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   

   public RedirectionTarget() {
      endPointType = EEndPointType.L3;
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      virtualIPs = new VirtualIPsFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getESI() {
      return ESI;
   }

   @JsonIgnore
   public void setESI(String value) { 
      this.ESI = value;
   }
   
   
   @JsonIgnore
   public Boolean getAutoCreated() {
      return autoCreated;
   }

   @JsonIgnore
   public void setAutoCreated(Boolean value) { 
      this.autoCreated = value;
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
   public EDestinationType getDestinationType() {
      return destinationType;
   }

   @JsonIgnore
   public void setDestinationType(EDestinationType value) { 
      this.destinationType = value;
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
   public EEndPointType getEndPointType() {
      return endPointType;
   }

   @JsonIgnore
   public void setEndPointType(EEndPointType value) { 
      this.endPointType = value;
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
   public Boolean getRedundancyEnabled() {
      return redundancyEnabled;
   }

   @JsonIgnore
   public void setRedundancyEnabled(Boolean value) { 
      this.redundancyEnabled = value;
   }
   
   
   @JsonIgnore
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   
   
   @JsonIgnore
   public ETriggerType getTriggerType() {
      return triggerType;
   }

   @JsonIgnore
   public void setTriggerType(ETriggerType value) { 
      this.triggerType = value;
   }
   
   
   @JsonIgnore
   public String getVirtualNetworkID() {
      return virtualNetworkID;
   }

   @JsonIgnore
   public void setVirtualNetworkID(String value) { 
      this.virtualNetworkID = value;
   }
   

   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
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
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public VirtualIPsFetcher getVirtualIPs() {
      return virtualIPs;
   }
   
   @JsonIgnore
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "RedirectionTarget [" + "ESI=" + ESI + ", autoCreated=" + autoCreated + ", description=" + description + ", destinationType=" + destinationType + ", embeddedMetadata=" + embeddedMetadata + ", endPointType=" + endPointType + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", redundancyEnabled=" + redundancyEnabled + ", templateID=" + templateID + ", triggerType=" + triggerType + ", virtualNetworkID=" + virtualNetworkID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}