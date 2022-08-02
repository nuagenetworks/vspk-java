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
@RestEntity(restName = "ddnsconfigbinding", resourceName = "ddnsconfigbindings")
public class Ddnsconfigbinding extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "assocDDNSConfigId")
   
   protected String assocDDNSConfigId;
   
   @JsonProperty(value = "associatedUplinkID")
   
   protected String associatedUplinkID;
   
   @JsonProperty(value = "uplinkName")
   
   protected String uplinkName;
   
   @JsonProperty(value = "uplinkPriority")
   
   protected Long uplinkPriority;
   

   

   public Ddnsconfigbinding() {
      
   }

   
   
   @JsonIgnore
   public String getAssocDDNSConfigId() {
      return assocDDNSConfigId;
   }

   @JsonIgnore
   public void setAssocDDNSConfigId(String value) { 
      this.assocDDNSConfigId = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedUplinkID() {
      return associatedUplinkID;
   }

   @JsonIgnore
   public void setAssociatedUplinkID(String value) { 
      this.associatedUplinkID = value;
   }
   
   
   @JsonIgnore
   public String getUplinkName() {
      return uplinkName;
   }

   @JsonIgnore
   public void setUplinkName(String value) { 
      this.uplinkName = value;
   }
   
   
   @JsonIgnore
   public Long getUplinkPriority() {
      return uplinkPriority;
   }

   @JsonIgnore
   public void setUplinkPriority(Long value) { 
      this.uplinkPriority = value;
   }
   

   

   public String toString() {
      return "Ddnsconfigbinding [" + "assocDDNSConfigId=" + assocDDNSConfigId + ", associatedUplinkID=" + associatedUplinkID + ", uplinkName=" + uplinkName + ", uplinkPriority=" + uplinkPriority + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}