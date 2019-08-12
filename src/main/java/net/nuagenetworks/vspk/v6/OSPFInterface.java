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
@RestEntity(restName = "ospfinterface", resourceName = "ospfinterfaces")
public class OSPFInterface extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAdminState { DOWN, UP };
   public enum EAuthenticationType { MESSAGE_DIGEST, NONE, PASSWORD };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EInterfaceType { BROADCAST, POINT_TO_POINT };

   
   @JsonProperty(value = "adminState")
   
   protected EAdminState adminState;
   
   @JsonProperty(value = "associatedSubnetID")
   
   protected String associatedSubnetID;
   
   @JsonProperty(value = "authenticationKey")
   
   protected String authenticationKey;
   
   @JsonProperty(value = "authenticationType")
   
   protected EAuthenticationType authenticationType;
   
   @JsonProperty(value = "deadInterval")
   
   protected Long deadInterval;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "helloInterval")
   
   protected Long helloInterval;
   
   @JsonProperty(value = "interfaceType")
   
   protected EInterfaceType interfaceType;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "messageDigestKeys")
   
   protected java.util.List<String> messageDigestKeys;
   
   @JsonProperty(value = "metric")
   
   protected Long metric;
   
   @JsonProperty(value = "mtu")
   
   protected Long mtu;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "passiveEnabled")
   
   protected Boolean passiveEnabled;
   
   @JsonProperty(value = "priority")
   
   protected Long priority;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public OSPFInterface() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public EAdminState getAdminState() {
      return adminState;
   }

   @JsonIgnore
   public void setAdminState(EAdminState value) { 
      this.adminState = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedSubnetID() {
      return associatedSubnetID;
   }

   @JsonIgnore
   public void setAssociatedSubnetID(String value) { 
      this.associatedSubnetID = value;
   }
   
   
   @JsonIgnore
   public String getAuthenticationKey() {
      return authenticationKey;
   }

   @JsonIgnore
   public void setAuthenticationKey(String value) { 
      this.authenticationKey = value;
   }
   
   
   @JsonIgnore
   public EAuthenticationType getAuthenticationType() {
      return authenticationType;
   }

   @JsonIgnore
   public void setAuthenticationType(EAuthenticationType value) { 
      this.authenticationType = value;
   }
   
   
   @JsonIgnore
   public Long getDeadInterval() {
      return deadInterval;
   }

   @JsonIgnore
   public void setDeadInterval(Long value) { 
      this.deadInterval = value;
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
   public Long getHelloInterval() {
      return helloInterval;
   }

   @JsonIgnore
   public void setHelloInterval(Long value) { 
      this.helloInterval = value;
   }
   
   
   @JsonIgnore
   public EInterfaceType getInterfaceType() {
      return interfaceType;
   }

   @JsonIgnore
   public void setInterfaceType(EInterfaceType value) { 
      this.interfaceType = value;
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
   public java.util.List<String> getMessageDigestKeys() {
      return messageDigestKeys;
   }

   @JsonIgnore
   public void setMessageDigestKeys(java.util.List<String> value) { 
      this.messageDigestKeys = value;
   }
   
   
   @JsonIgnore
   public Long getMetric() {
      return metric;
   }

   @JsonIgnore
   public void setMetric(Long value) { 
      this.metric = value;
   }
   
   
   @JsonIgnore
   public Long getMtu() {
      return mtu;
   }

   @JsonIgnore
   public void setMtu(Long value) { 
      this.mtu = value;
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
   public Boolean getPassiveEnabled() {
      return passiveEnabled;
   }

   @JsonIgnore
   public void setPassiveEnabled(Boolean value) { 
      this.passiveEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getPriority() {
      return priority;
   }

   @JsonIgnore
   public void setPriority(Long value) { 
      this.priority = value;
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
      return "OSPFInterface [" + "adminState=" + adminState + ", associatedSubnetID=" + associatedSubnetID + ", authenticationKey=" + authenticationKey + ", authenticationType=" + authenticationType + ", deadInterval=" + deadInterval + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", helloInterval=" + helloInterval + ", interfaceType=" + interfaceType + ", lastUpdatedBy=" + lastUpdatedBy + ", messageDigestKeys=" + messageDigestKeys + ", metric=" + metric + ", mtu=" + mtu + ", name=" + name + ", passiveEnabled=" + passiveEnabled + ", priority=" + priority + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}