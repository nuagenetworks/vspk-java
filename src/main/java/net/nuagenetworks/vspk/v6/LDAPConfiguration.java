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


import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ldapconfiguration", resourceName = "ldapconfigurations")
public class LDAPConfiguration extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "SSLEnabled")
   
   protected Boolean SSLEnabled;
   
   @JsonProperty(value = "acceptAllCertificates")
   
   protected Boolean acceptAllCertificates;
   
   @JsonProperty(value = "authorizationEnabled")
   
   protected Boolean authorizationEnabled;
   
   @JsonProperty(value = "authorizingUserDN")
   
   protected String authorizingUserDN;
   
   @JsonProperty(value = "certificate")
   
   protected String certificate;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enabled")
   
   protected Boolean enabled;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "groupDN")
   
   protected String groupDN;
   
   @JsonProperty(value = "groupNamePrefix")
   
   protected String groupNamePrefix;
   
   @JsonProperty(value = "groupNameSuffix")
   
   protected String groupNameSuffix;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "password")
   
   protected String password;
   
   @JsonProperty(value = "port")
   
   protected String port;
   
   @JsonProperty(value = "server")
   
   protected String server;
   
   @JsonProperty(value = "userDNTemplate")
   
   protected String userDNTemplate;
   
   @JsonProperty(value = "userNameAttribute")
   
   protected String userNameAttribute;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public LDAPConfiguration() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getSSLEnabled() {
      return SSLEnabled;
   }

   @JsonIgnore
   public void setSSLEnabled(Boolean value) { 
      this.SSLEnabled = value;
   }
   
   
   @JsonIgnore
   public Boolean getAcceptAllCertificates() {
      return acceptAllCertificates;
   }

   @JsonIgnore
   public void setAcceptAllCertificates(Boolean value) { 
      this.acceptAllCertificates = value;
   }
   
   
   @JsonIgnore
   public Boolean getAuthorizationEnabled() {
      return authorizationEnabled;
   }

   @JsonIgnore
   public void setAuthorizationEnabled(Boolean value) { 
      this.authorizationEnabled = value;
   }
   
   
   @JsonIgnore
   public String getAuthorizingUserDN() {
      return authorizingUserDN;
   }

   @JsonIgnore
   public void setAuthorizingUserDN(String value) { 
      this.authorizingUserDN = value;
   }
   
   
   @JsonIgnore
   public String getCertificate() {
      return certificate;
   }

   @JsonIgnore
   public void setCertificate(String value) { 
      this.certificate = value;
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
   public Boolean getEnabled() {
      return enabled;
   }

   @JsonIgnore
   public void setEnabled(Boolean value) { 
      this.enabled = value;
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
   public String getGroupDN() {
      return groupDN;
   }

   @JsonIgnore
   public void setGroupDN(String value) { 
      this.groupDN = value;
   }
   
   
   @JsonIgnore
   public String getGroupNamePrefix() {
      return groupNamePrefix;
   }

   @JsonIgnore
   public void setGroupNamePrefix(String value) { 
      this.groupNamePrefix = value;
   }
   
   
   @JsonIgnore
   public String getGroupNameSuffix() {
      return groupNameSuffix;
   }

   @JsonIgnore
   public void setGroupNameSuffix(String value) { 
      this.groupNameSuffix = value;
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
   public String getPassword() {
      return password;
   }

   @JsonIgnore
   public void setPassword(String value) { 
      this.password = value;
   }
   
   
   @JsonIgnore
   public String getPort() {
      return port;
   }

   @JsonIgnore
   public void setPort(String value) { 
      this.port = value;
   }
   
   
   @JsonIgnore
   public String getServer() {
      return server;
   }

   @JsonIgnore
   public void setServer(String value) { 
      this.server = value;
   }
   
   
   @JsonIgnore
   public String getUserDNTemplate() {
      return userDNTemplate;
   }

   @JsonIgnore
   public void setUserDNTemplate(String value) { 
      this.userDNTemplate = value;
   }
   
   
   @JsonIgnore
   public String getUserNameAttribute() {
      return userNameAttribute;
   }

   @JsonIgnore
   public void setUserNameAttribute(String value) { 
      this.userNameAttribute = value;
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
      return "LDAPConfiguration [" + "SSLEnabled=" + SSLEnabled + ", acceptAllCertificates=" + acceptAllCertificates + ", authorizationEnabled=" + authorizationEnabled + ", authorizingUserDN=" + authorizingUserDN + ", certificate=" + certificate + ", embeddedMetadata=" + embeddedMetadata + ", enabled=" + enabled + ", entityScope=" + entityScope + ", externalID=" + externalID + ", groupDN=" + groupDN + ", groupNamePrefix=" + groupNamePrefix + ", groupNameSuffix=" + groupNameSuffix + ", lastUpdatedBy=" + lastUpdatedBy + ", password=" + password + ", port=" + port + ", server=" + server + ", userDNTemplate=" + userDNTemplate + ", userNameAttribute=" + userNameAttribute + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}