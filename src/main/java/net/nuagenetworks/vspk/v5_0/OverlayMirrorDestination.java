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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "overlaymirrordestination", resourceName = "overlaymirrordestinations")
public class OverlayMirrorDestination extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EndPointType { VIRTUAL_WIRE };
   public enum TriggerType { GARP, NONE };

   
   @JsonProperty(value = "ESI")
   protected String ESI;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "endPointType")
   protected EndPointType endPointType;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "redundancyEnabled")
   protected Boolean redundancyEnabled;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "triggerType")
   protected TriggerType triggerType;
   
   @JsonProperty(value = "virtualNetworkID")
   protected String virtualNetworkID;
   

   

   public OverlayMirrorDestination() {
      
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   @JsonIgnore
   public EndPointType getEndPointType() {
      return endPointType;
   }

   @JsonIgnore
   public void setEndPointType(EndPointType value) { 
      this.endPointType = value;
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
   public TriggerType getTriggerType() {
      return triggerType;
   }

   @JsonIgnore
   public void setTriggerType(TriggerType value) { 
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
   

   

   public String toString() {
      return "OverlayMirrorDestination [" + "ESI=" + ESI + ", description=" + description + ", endPointType=" + endPointType + ", name=" + name + ", redundancyEnabled=" + redundancyEnabled + ", templateID=" + templateID + ", triggerType=" + triggerType + ", virtualNetworkID=" + virtualNetworkID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}