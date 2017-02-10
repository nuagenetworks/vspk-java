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

package net.nuagenetworks.vspk.v4_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v4_0.fetchers.NSGatewaysFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DUCGroupBindingsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsggroup", resourceName = "nsggroups")
public class NSGGroup extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "associatedNSGs")
   protected java.util.List<String> associatedNSGs;
   

   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   
   @JsonIgnore
   private DUCGroupBindingsFetcher dUCGroupBindings;
   

   public NSGGroup() {
      
      nSGateways = new NSGatewaysFetcher(this);
      
      dUCGroupBindings = new DUCGroupBindingsFetcher(this);
      
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   @JsonIgnore
   public java.util.List<String> getAssociatedNSGs() {
      return associatedNSGs;
   }

   @JsonIgnore
   public void setAssociatedNSGs(java.util.List<String> value) { 
      this.associatedNSGs = value;
   }
   

   
   @JsonIgnore
   public NSGatewaysFetcher getNSGateways() {
      return nSGateways;
   }
   
   @JsonIgnore
   public DUCGroupBindingsFetcher getDUCGroupBindings() {
      return dUCGroupBindings;
   }
   

   public String toString() {
      return "NSGGroup [" + "name=" + name + ", description=" + description + ", associatedNSGs=" + associatedNSGs + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}