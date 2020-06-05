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
@RestEntity(restName = "threatpreventionserverconnection", resourceName = "threatpreventionserverconnections")
public class ThreatPreventionServerConnection extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EStatus { AUTHENTICATION_FAILED, CONNECTED, DISCONNECTED };

   
   @JsonProperty(value = "FQDN")
   
   protected String FQDN;
   
   @JsonProperty(value = "VSDName")
   
   protected String VSDName;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   

   

   public ThreatPreventionServerConnection() {
      
   }

   
   
   @JsonIgnore
   public String getFQDN() {
      return FQDN;
   }

   @JsonIgnore
   public void setFQDN(String value) { 
      this.FQDN = value;
   }
   
   
   @JsonIgnore
   public String getVSDName() {
      return VSDName;
   }

   @JsonIgnore
   public void setVSDName(String value) { 
      this.VSDName = value;
   }
   
   
   @JsonIgnore
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
   }
   

   

   public String toString() {
      return "ThreatPreventionServerConnection [" + "FQDN=" + FQDN + ", VSDName=" + VSDName + ", status=" + status + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}