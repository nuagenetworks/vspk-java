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
@RestEntity(restName = "vnfdomainmapping", resourceName = "vnfdomainmappings")
public class VNFDomainMapping extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum SegmentationType { VLAN };

   
   @JsonProperty(value = "associatedNSGatewayID")
   protected String associatedNSGatewayID;
   
   @JsonProperty(value = "associatedNSGatewayName")
   protected String associatedNSGatewayName;
   
   @JsonProperty(value = "segmentationID")
   protected Long segmentationID;
   
   @JsonProperty(value = "segmentationType")
   protected SegmentationType segmentationType;
   

   

   public VNFDomainMapping() {
      
   }

   @JsonIgnore
   public String getAssociatedNSGatewayID() {
      return associatedNSGatewayID;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayID(String value) { 
      this.associatedNSGatewayID = value;
   }
   @JsonIgnore
   public String getAssociatedNSGatewayName() {
      return associatedNSGatewayName;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayName(String value) { 
      this.associatedNSGatewayName = value;
   }
   @JsonIgnore
   public Long getSegmentationID() {
      return segmentationID;
   }

   @JsonIgnore
   public void setSegmentationID(Long value) { 
      this.segmentationID = value;
   }
   @JsonIgnore
   public SegmentationType getSegmentationType() {
      return segmentationType;
   }

   @JsonIgnore
   public void setSegmentationType(SegmentationType value) { 
      this.segmentationType = value;
   }
   

   

   public String toString() {
      return "VNFDomainMapping [" + "associatedNSGatewayID=" + associatedNSGatewayID + ", associatedNSGatewayName=" + associatedNSGatewayName + ", segmentationID=" + segmentationID + ", segmentationType=" + segmentationType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}