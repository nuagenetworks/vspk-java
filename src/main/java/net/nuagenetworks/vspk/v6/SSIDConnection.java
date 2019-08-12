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


import net.nuagenetworks.vspk.v6.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ssidconnection", resourceName = "ssidconnections")
public class SSIDConnection extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAuthenticationMode { CAPTIVE_PORTAL, OPEN, WEP, WPA, WPA2, WPA_OTP, WPA_WPA2 };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPermittedAction { USE, READ, ALL, INSTANTIATE, EXTEND, DEPLOY };
   public enum ERedirectOption { CONFIGURED_URL, ORIGINAL_REQUEST };
   public enum EStatus { INITIALIZED, ORPHAN, READY, MISMATCH };

   
   @JsonProperty(value = "associatedCaptivePortalProfileID")
   
   protected String associatedCaptivePortalProfileID;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "authenticationMode")
   
   protected EAuthenticationMode authenticationMode;
   
   @JsonProperty(value = "blackList")
   
   protected java.util.List<String> blackList;
   
   @JsonProperty(value = "broadcastSSID")
   
   protected Boolean broadcastSSID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gatewayID")
   
   protected String gatewayID;
   
   @JsonProperty(value = "genericConfig")
   
   protected String genericConfig;
   
   @JsonProperty(value = "interfaceName")
   
   protected String interfaceName;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "passphrase")
   
   protected String passphrase;
   
   @JsonProperty(value = "permittedAction")
   
   protected EPermittedAction permittedAction;
   
   @JsonProperty(value = "readonly")
   
   protected Boolean readonly;
   
   @JsonProperty(value = "redirectOption")
   
   protected ERedirectOption redirectOption;
   
   @JsonProperty(value = "redirectURL")
   
   protected String redirectURL;
   
   @JsonProperty(value = "restricted")
   
   protected Boolean restricted;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   
   @JsonProperty(value = "vlanID")
   
   protected Long vlanID;
   
   @JsonProperty(value = "vportID")
   
   protected String vportID;
   
   @JsonProperty(value = "whiteList")
   
   protected java.util.List<String> whiteList;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public SSIDConnection() {
      
      alarms = new AlarmsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
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
   public EAuthenticationMode getAuthenticationMode() {
      return authenticationMode;
   }

   @JsonIgnore
   public void setAuthenticationMode(EAuthenticationMode value) { 
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
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
   }
   
   
   @JsonIgnore
   public EEntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EEntityScope value) { 
      this.entityScope = value;
   }
   
   
   @JsonIgnore
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   
   
   @JsonIgnore
   public String getGatewayID() {
      return gatewayID;
   }

   @JsonIgnore
   public void setGatewayID(String value) { 
      this.gatewayID = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
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
   public EPermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(EPermittedAction value) { 
      this.permittedAction = value;
   }
   
   
   @JsonIgnore
   public Boolean getReadonly() {
      return readonly;
   }

   @JsonIgnore
   public void setReadonly(Boolean value) { 
      this.readonly = value;
   }
   
   
   @JsonIgnore
   public ERedirectOption getRedirectOption() {
      return redirectOption;
   }

   @JsonIgnore
   public void setRedirectOption(ERedirectOption value) { 
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
   public Boolean getRestricted() {
      return restricted;
   }

   @JsonIgnore
   public void setRestricted(Boolean value) { 
      this.restricted = value;
   }
   
   
   @JsonIgnore
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
   }
   
   
   @JsonIgnore
   public Long getVlanID() {
      return vlanID;
   }

   @JsonIgnore
   public void setVlanID(Long value) { 
      this.vlanID = value;
   }
   
   
   @JsonIgnore
   public String getVportID() {
      return vportID;
   }

   @JsonIgnore
   public void setVportID(String value) { 
      this.vportID = value;
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
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "SSIDConnection [" + "associatedCaptivePortalProfileID=" + associatedCaptivePortalProfileID + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", authenticationMode=" + authenticationMode + ", blackList=" + blackList + ", broadcastSSID=" + broadcastSSID + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayID=" + gatewayID + ", genericConfig=" + genericConfig + ", interfaceName=" + interfaceName + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", passphrase=" + passphrase + ", permittedAction=" + permittedAction + ", readonly=" + readonly + ", redirectOption=" + redirectOption + ", redirectURL=" + redirectURL + ", restricted=" + restricted + ", status=" + status + ", vlanID=" + vlanID + ", vportID=" + vportID + ", whiteList=" + whiteList + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}