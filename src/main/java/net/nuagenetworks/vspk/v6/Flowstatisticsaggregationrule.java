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
@RestEntity(restName = "flowstatisticsaggregationrule", resourceName = "flowstatisticsaggregationrules")
public class Flowstatisticsaggregationrule extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAggregationCriteria { FORWARD_AND_REVERSE_TRAFFIC_PORT_AGG };
   public enum EMatchingCriteria { L4_SERVICE, L4_SERVICE_GROUP };

   
   @JsonProperty(value = "aggregationCriteria")
   
   protected EAggregationCriteria aggregationCriteria;
   
   @JsonProperty(value = "associatedTrafficTypeID")
   
   protected String associatedTrafficTypeID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "matchingCriteria")
   
   protected EMatchingCriteria matchingCriteria;
   
   @JsonProperty(value = "name")
   
   protected String name;
   

   

   public Flowstatisticsaggregationrule() {
      
   }

   
   
   @JsonIgnore
   public EAggregationCriteria getAggregationCriteria() {
      return aggregationCriteria;
   }

   @JsonIgnore
   public void setAggregationCriteria(EAggregationCriteria value) { 
      this.aggregationCriteria = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedTrafficTypeID() {
      return associatedTrafficTypeID;
   }

   @JsonIgnore
   public void setAssociatedTrafficTypeID(String value) { 
      this.associatedTrafficTypeID = value;
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
   public EMatchingCriteria getMatchingCriteria() {
      return matchingCriteria;
   }

   @JsonIgnore
   public void setMatchingCriteria(EMatchingCriteria value) { 
      this.matchingCriteria = value;
   }
   
   
   @JsonIgnore
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   

   

   public String toString() {
      return "Flowstatisticsaggregationrule [" + "aggregationCriteria=" + aggregationCriteria + ", associatedTrafficTypeID=" + associatedTrafficTypeID + ", description=" + description + ", matchingCriteria=" + matchingCriteria + ", name=" + name + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}