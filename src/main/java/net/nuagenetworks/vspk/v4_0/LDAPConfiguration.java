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

import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ldapconfiguration", resourceName = "ldapconfigurations")
public class LDAPConfiguration extends RestObject {

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "SSLEnabled")
   protected Boolean SSLEnabled;
   
   @JsonProperty(value = "password")
   protected String password;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "acceptAllCertificates")
   protected Boolean acceptAllCertificates;
   
   @JsonProperty(value = "certificate")
   protected String certificate;
   
   @JsonProperty(value = "server")
   protected String server;
   
   @JsonProperty(value = "enabled")
   protected Boolean enabled;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "port")
   protected String port;
   
   @JsonProperty(value = "groupDN")
   protected String groupDN;
   
   @JsonProperty(value = "userDNTemplate")
   protected String userDNTemplate;
   
   @JsonProperty(value = "authorizationEnabled")
   protected Boolean authorizationEnabled;
   
   @JsonProperty(value = "authorizingUserDN")
   protected String authorizingUserDN;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public LDAPConfiguration() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   public Boolean getSSLEnabled() {
      return SSLEnabled;
   }

   public void setSSLEnabled(Boolean value) { 
      this.SSLEnabled = value;
   }
   public String getPassword() {
      return password;
   }

   public void setPassword(String value) { 
      this.password = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public Boolean getAcceptAllCertificates() {
      return acceptAllCertificates;
   }

   public void setAcceptAllCertificates(Boolean value) { 
      this.acceptAllCertificates = value;
   }
   public String getCertificate() {
      return certificate;
   }

   public void setCertificate(String value) { 
      this.certificate = value;
   }
   public String getServer() {
      return server;
   }

   public void setServer(String value) { 
      this.server = value;
   }
   public Boolean getEnabled() {
      return enabled;
   }

   public void setEnabled(Boolean value) { 
      this.enabled = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getPort() {
      return port;
   }

   public void setPort(String value) { 
      this.port = value;
   }
   public String getGroupDN() {
      return groupDN;
   }

   public void setGroupDN(String value) { 
      this.groupDN = value;
   }
   public String getUserDNTemplate() {
      return userDNTemplate;
   }

   public void setUserDNTemplate(String value) { 
      this.userDNTemplate = value;
   }
   public Boolean getAuthorizationEnabled() {
      return authorizationEnabled;
   }

   public void setAuthorizationEnabled(Boolean value) { 
      this.authorizationEnabled = value;
   }
   public String getAuthorizingUserDN() {
      return authorizingUserDN;
   }

   public void setAuthorizingUserDN(String value) { 
      this.authorizingUserDN = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "LDAPConfiguration [" + "SSLEnabled=" + SSLEnabled + ", password=" + password + ", lastUpdatedBy=" + lastUpdatedBy + ", acceptAllCertificates=" + acceptAllCertificates + ", certificate=" + certificate + ", server=" + server + ", enabled=" + enabled + ", entityScope=" + entityScope + ", port=" + port + ", groupDN=" + groupDN + ", userDNTemplate=" + userDNTemplate + ", authorizationEnabled=" + authorizationEnabled + ", authorizingUserDN=" + authorizingUserDN + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}