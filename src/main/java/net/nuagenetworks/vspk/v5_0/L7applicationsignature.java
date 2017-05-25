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


import net.nuagenetworks.vspk.v5_0.fetchers.ApplicationsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "l7applicationsignature", resourceName = "l7applicationsignatures")
public class L7applicationsignature extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "category")
   protected String category;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "dictionaryVersion")
   protected Long dictionaryVersion;
   
   @JsonProperty(value = "guidstring")
   protected String guidstring;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "readonly")
   protected Boolean readonly;
   

   
   @JsonIgnore
   private ApplicationsFetcher applications;
   

   public L7applicationsignature() {
      
      applications = new ApplicationsFetcher(this);
      
   }

   @JsonIgnore
   public String getCategory() {
      return category;
   }

   @JsonIgnore
   public void setCategory(String value) { 
      this.category = value;
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
   public Long getDictionaryVersion() {
      return dictionaryVersion;
   }

   @JsonIgnore
   public void setDictionaryVersion(Long value) { 
      this.dictionaryVersion = value;
   }
   @JsonIgnore
   public String getGuidstring() {
      return guidstring;
   }

   @JsonIgnore
   public void setGuidstring(String value) { 
      this.guidstring = value;
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
   public Boolean getReadonly() {
      return readonly;
   }

   @JsonIgnore
   public void setReadonly(Boolean value) { 
      this.readonly = value;
   }
   

   
   @JsonIgnore
   public ApplicationsFetcher getApplications() {
      return applications;
   }
   

   public String toString() {
      return "L7applicationsignature [" + "category=" + category + ", description=" + description + ", dictionaryVersion=" + dictionaryVersion + ", guidstring=" + guidstring + ", name=" + name + ", readonly=" + readonly + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}