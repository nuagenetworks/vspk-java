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

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ducgroup", resourceName = "ducgroups")
public class DUCGroup extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "id")
   protected String id;
   
   @JsonProperty(value = "Description ")
   protected String Description ;
   
   @JsonProperty(value = "associatedDUCs")
   protected java.util.List<String> associatedDUCs;
   
   @JsonProperty(value = "associatedPerformanceMonitorID")
   protected String associatedPerformanceMonitorID;
   

   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   

   public DUCGroup() {
      
      nSGateways = new NSGatewaysFetcher(this);
      
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
   public String getId() {
      return id;
   }

   @JsonIgnore
   public void setId(String value) { 
      this.id = value;
   }
   @JsonIgnore
   public String getDescription () {
      return Description ;
   }

   @JsonIgnore
   public void setDescription (String value) { 
      this.Description  = value;
   }
   @JsonIgnore
   public java.util.List<String> getAssociatedDUCs() {
      return associatedDUCs;
   }

   @JsonIgnore
   public void setAssociatedDUCs(java.util.List<String> value) { 
      this.associatedDUCs = value;
   }
   @JsonIgnore
   public String getAssociatedPerformanceMonitorID() {
      return associatedPerformanceMonitorID;
   }

   @JsonIgnore
   public void setAssociatedPerformanceMonitorID(String value) { 
      this.associatedPerformanceMonitorID = value;
   }
   

   
   @JsonIgnore
   public NSGatewaysFetcher getNSGateways() {
      return nSGateways;
   }
   

   public String toString() {
      return "DUCGroup [" + "name=" + name + ", id=" + id + ", Description =" + Description  + ", associatedDUCs=" + associatedDUCs + ", associatedPerformanceMonitorID=" + associatedPerformanceMonitorID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}