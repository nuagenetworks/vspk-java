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
@RestEntity(restName = "nsgatewaysmonitor", resourceName = "nsgatewaysmonitors")
public class NSGatewayMonitor extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "controllervrslinks")
   
   protected java.util.List<ControllerVRSLink> controllervrslinks;
   
   @JsonProperty(value = "nsginfo")
   
   protected Object nsginfo;
   
   @JsonProperty(value = "nsgstate")
   
   protected Object nsgstate;
   
   @JsonProperty(value = "nsgsummary")
   
   protected Object nsgsummary;
   
   @JsonProperty(value = "vrsinfo")
   
   protected Object vrsinfo;
   
   @JsonProperty(value = "vscs")
   
   protected java.util.List<VSC> vscs;
   

   

   public NSGatewayMonitor() {
      
   }

   
   
   @JsonIgnore
   public java.util.List<ControllerVRSLink> getControllervrslinks() {
      return controllervrslinks;
   }

   @JsonIgnore
   public void setControllervrslinks(java.util.List<ControllerVRSLink> value) { 
      this.controllervrslinks = value;
   }
   
   
   @JsonIgnore
   public Object getNsginfo() {
      return nsginfo;
   }

   @JsonIgnore
   public void setNsginfo(Object value) { 
      this.nsginfo = value;
   }
   
   
   @JsonIgnore
   public Object getNsgstate() {
      return nsgstate;
   }

   @JsonIgnore
   public void setNsgstate(Object value) { 
      this.nsgstate = value;
   }
   
   
   @JsonIgnore
   public Object getNsgsummary() {
      return nsgsummary;
   }

   @JsonIgnore
   public void setNsgsummary(Object value) { 
      this.nsgsummary = value;
   }
   
   
   @JsonIgnore
   public Object getVrsinfo() {
      return vrsinfo;
   }

   @JsonIgnore
   public void setVrsinfo(Object value) { 
      this.vrsinfo = value;
   }
   
   
   @JsonIgnore
   public java.util.List<VSC> getVscs() {
      return vscs;
   }

   @JsonIgnore
   public void setVscs(java.util.List<VSC> value) { 
      this.vscs = value;
   }
   

   

   public String toString() {
      return "NSGatewayMonitor [" + "controllervrslinks=" + controllervrslinks + ", nsginfo=" + nsginfo + ", nsgstate=" + nsgstate + ", nsgsummary=" + nsgsummary + ", vrsinfo=" + vrsinfo + ", vscs=" + vscs + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}