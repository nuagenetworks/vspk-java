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


import net.nuagenetworks.vspk.v5_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.CaptivePortalProfilesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ssidconnection", resourceName = "ssidconnections")
public class SSIDConnection extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum AuthenticationMode { CAPTIVE_PORTAL, OPEN, WEP, WPA, WPA2, WPA_OTP, WPA_WPA2 };
   public enum RedirectOption { CONFIGURED_URL, ORIGINAL_REQUEST };

   
   @JsonProperty(value = "associatedCaptivePortalProfileID")
   protected String associatedCaptivePortalProfileID;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "authenticationMode")
   protected AuthenticationMode authenticationMode;
   
   @JsonProperty(value = "blackList")
   protected java.util.List<String> blackList;
   
   @JsonProperty(value = "broadcastSSID")
   protected Boolean broadcastSSID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "genericConfig")
   protected String genericConfig;
   
   @JsonProperty(value = "interfaceName")
   protected String interfaceName;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "passphrase")
   protected String passphrase;
   
   @JsonProperty(value = "redirectOption")
   protected RedirectOption redirectOption;
   
   @JsonProperty(value = "redirectURL")
   protected String redirectURL;
   
   @JsonProperty(value = "whiteList")
   protected java.util.List<String> whiteList;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private CaptivePortalProfilesFetcher captivePortalProfiles;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public SSIDConnection() {
      
      alarms = new AlarmsFetcher(this);
      
      captivePortalProfiles = new CaptivePortalProfilesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public String getAssociatedCaptivePortalProfileID() {
      return associatedCaptivePortalProfileID;
   }

   @JsonIgnore
   public void setAssociatedCaptivePortalProfileID(String value) { 
      this.associatedCaptivePortalProfileID = value;
   }
   @JsonIgnore
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   @JsonIgnore
   public AuthenticationMode getAuthenticationMode() {
      return authenticationMode;
   }

   @JsonIgnore
   public void setAuthenticationMode(AuthenticationMode value) { 
      this.authenticationMode = value;
   }
   @JsonIgnore
   public java.util.List<String> getBlackList() {
      return blackList;
   }

   @JsonIgnore
   public void setBlackList(java.util.List<String> value) { 
      this.blackList = value;
   }
   @JsonIgnore
   public Boolean getBroadcastSSID() {
      return broadcastSSID;
   }

   @JsonIgnore
   public void setBroadcastSSID(Boolean value) { 
      this.broadcastSSID = value;
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
   public String getGenericConfig() {
      return genericConfig;
   }

   @JsonIgnore
   public void setGenericConfig(String value) { 
      this.genericConfig = value;
   }
   @JsonIgnore
   public String getInterfaceName() {
      return interfaceName;
   }

   @JsonIgnore
   public void setInterfaceName(String value) { 
      this.interfaceName = value;
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
   public String getPassphrase() {
      return passphrase;
   }

   @JsonIgnore
   public void setPassphrase(String value) { 
      this.passphrase = value;
   }
   @JsonIgnore
   public RedirectOption getRedirectOption() {
      return redirectOption;
   }

   @JsonIgnore
   public void setRedirectOption(RedirectOption value) { 
      this.redirectOption = value;
   }
   @JsonIgnore
   public String getRedirectURL() {
      return redirectURL;
   }

   @JsonIgnore
   public void setRedirectURL(String value) { 
      this.redirectURL = value;
   }
   @JsonIgnore
   public java.util.List<String> getWhiteList() {
      return whiteList;
   }

   @JsonIgnore
   public void setWhiteList(java.util.List<String> value) { 
      this.whiteList = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public CaptivePortalProfilesFetcher getCaptivePortalProfiles() {
      return captivePortalProfiles;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "SSIDConnection [" + "associatedCaptivePortalProfileID=" + associatedCaptivePortalProfileID + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", authenticationMode=" + authenticationMode + ", blackList=" + blackList + ", broadcastSSID=" + broadcastSSID + ", description=" + description + ", genericConfig=" + genericConfig + ", interfaceName=" + interfaceName + ", name=" + name + ", passphrase=" + passphrase + ", redirectOption=" + redirectOption + ", redirectURL=" + redirectURL + ", whiteList=" + whiteList + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}