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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "zfbautoassignment", resourceName = "zfbautoassignments")
public class ZFBAutoAssignment extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EZFBMatchAttribute { HOSTNAME, IP_ADDRESS, MAC_ADDRESS, NSGATEWAY_ID, SERIAL_NUMBER, UUID };
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "ZFBMatchAttribute")
   
   protected EZFBMatchAttribute ZFBMatchAttribute;
   
   @JsonProperty(value = "ZFBMatchAttributeValues")
   
   protected java.util.List<String> ZFBMatchAttributeValues;
   
   @JsonProperty(value = "associatedEnterpriseID")
   
   protected String associatedEnterpriseID;
   
   @JsonProperty(value = "associatedEnterpriseName")
   
   protected String associatedEnterpriseName;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "priority")
   
   protected Long priority;
   

   

   public ZFBAutoAssignment() {
      
   }

   
   
   @JsonIgnore
   public EZFBMatchAttribute getZFBMatchAttribute() {
      return ZFBMatchAttribute;
   }

   @JsonIgnore
   public void setZFBMatchAttribute(EZFBMatchAttribute value) { 
      this.ZFBMatchAttribute = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getZFBMatchAttributeValues() {
      return ZFBMatchAttributeValues;
   }

   @JsonIgnore
   public void setZFBMatchAttributeValues(java.util.List<String> value) { 
      this.ZFBMatchAttributeValues = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEnterpriseID() {
      return associatedEnterpriseID;
   }

   @JsonIgnore
   public void setAssociatedEnterpriseID(String value) { 
      this.associatedEnterpriseID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedEnterpriseName() {
      return associatedEnterpriseName;
   }

   @JsonIgnore
   public void setAssociatedEnterpriseName(String value) { 
      this.associatedEnterpriseName = value;
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
   public Long getPriority() {
      return priority;
   }

   @JsonIgnore
   public void setPriority(Long value) { 
      this.priority = value;
   }
   

   

   public String toString() {
      return "ZFBAutoAssignment [" + "ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchAttributeValues=" + ZFBMatchAttributeValues + ", associatedEnterpriseID=" + associatedEnterpriseID + ", associatedEnterpriseName=" + associatedEnterpriseName + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", priority=" + priority + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}