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


import net.nuagenetworks.vspk.v6.fetchers.DdnsconfigbindingsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ddnsconfig", resourceName = "ddnsconfigs")
public class Ddnsconfig extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EConnectionStatus { FAILED, SUCCESS, UNKNOWN };
   public enum EProviderName { DYN_DNS, NO_IP };

   
   @JsonProperty(value = "assocGatewayId")
   
   protected String assocGatewayId;
   
   @JsonProperty(value = "connectionStatus")
   
   protected EConnectionStatus connectionStatus;
   
   @JsonProperty(value = "enableDDNSConfig")
   
   protected Boolean enableDDNSConfig;
   
   @JsonProperty(value = "hostname")
   
   protected String hostname;
   
   @JsonProperty(value = "password")
   
   protected String password;
   
   @JsonProperty(value = "providerName")
   
   protected EProviderName providerName;
   
   @JsonProperty(value = "username")
   
   protected String username;
   

   
   @JsonIgnore
   private DdnsconfigbindingsFetcher ddnsconfigbindings;
   

   public Ddnsconfig() {
      
      ddnsconfigbindings = new DdnsconfigbindingsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssocGatewayId() {
      return assocGatewayId;
   }

   @JsonIgnore
   public void setAssocGatewayId(String value) { 
      this.assocGatewayId = value;
   }
   
   
   @JsonIgnore
   public EConnectionStatus getConnectionStatus() {
      return connectionStatus;
   }

   @JsonIgnore
   public void setConnectionStatus(EConnectionStatus value) { 
      this.connectionStatus = value;
   }
   
   
   @JsonIgnore
   public Boolean getEnableDDNSConfig() {
      return enableDDNSConfig;
   }

   @JsonIgnore
   public void setEnableDDNSConfig(Boolean value) { 
      this.enableDDNSConfig = value;
   }
   
   
   @JsonIgnore
   public String getHostname() {
      return hostname;
   }

   @JsonIgnore
   public void setHostname(String value) { 
      this.hostname = value;
   }
   
   
   @JsonIgnore
   public String getPassword() {
      return password;
   }

   @JsonIgnore
   public void setPassword(String value) { 
      this.password = value;
   }
   
   
   @JsonIgnore
   public EProviderName getProviderName() {
      return providerName;
   }

   @JsonIgnore
   public void setProviderName(EProviderName value) { 
      this.providerName = value;
   }
   
   
   @JsonIgnore
   public String getUsername() {
      return username;
   }

   @JsonIgnore
   public void setUsername(String value) { 
      this.username = value;
   }
   

   
   @JsonIgnore
   public DdnsconfigbindingsFetcher getDdnsconfigbindings() {
      return ddnsconfigbindings;
   }
   

   public String toString() {
      return "Ddnsconfig [" + "assocGatewayId=" + assocGatewayId + ", connectionStatus=" + connectionStatus + ", enableDDNSConfig=" + enableDDNSConfig + ", hostname=" + hostname + ", password=" + password + ", providerName=" + providerName + ", username=" + username + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}