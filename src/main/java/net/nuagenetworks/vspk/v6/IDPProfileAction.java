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
@RestEntity(restName = "idpprofileaction", resourceName = "idpprofileactions")
public class IDPProfileAction extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAction { AUDIT, PROTECT };

   
   @JsonProperty(value = "IDPSignatures")
   
   protected java.util.List<String> IDPSignatures;
   
   @JsonProperty(value = "action")
   
   protected EAction action;
   
   @JsonProperty(value = "associatedIDPProfileID")
   
   protected String associatedIDPProfileID;
   
   @JsonProperty(value = "priority")
   
   protected Long priority;
   

   

   public IDPProfileAction() {
      
   }

   
   
   @JsonIgnore
   public java.util.List<String> getIDPSignatures() {
      return IDPSignatures;
   }

   @JsonIgnore
   public void setIDPSignatures(java.util.List<String> value) { 
      this.IDPSignatures = value;
   }
   
   
   @JsonIgnore
   public EAction getAction() {
      return action;
   }

   @JsonIgnore
   public void setAction(EAction value) { 
      this.action = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIDPProfileID() {
      return associatedIDPProfileID;
   }

   @JsonIgnore
   public void setAssociatedIDPProfileID(String value) { 
      this.associatedIDPProfileID = value;
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
      return "IDPProfileAction [" + "IDPSignatures=" + IDPSignatures + ", action=" + action + ", associatedIDPProfileID=" + associatedIDPProfileID + ", priority=" + priority + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}