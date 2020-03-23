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


import net.nuagenetworks.vspk.v6.fetchers.BFDSessionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.CustomPropertiesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "uplinkconnection", resourceName = "uplinkconnections")
public class UplinkConnection extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAddressFamily { IPV4, IPV6 };
   public enum EAdvertisementCriteria { BFD, CONTROL_SESSION, OPERATIONAL_LINK };
   public enum EAuxMode { COLD, HOT, NONE };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EInterfaceConnectionType { AUTOMATIC, EMBEDDED, PCI_EXPRESS, USB_ETHERNET, USB_MODEM };
   public enum EMode { Any, Dynamic, LTE, PPPoE, Static };
   public enum ERole { NONE, PRIMARY, SECONDARY, TERTIARY, UNKNOWN };

   
   @JsonProperty(value = "DNSAddress")
   
   protected String DNSAddress;
   
   @JsonProperty(value = "DNSAddressV6")
   
   protected String DNSAddressV6;
   
   @JsonProperty(value = "PATEnabled")
   
   protected Boolean PATEnabled;
   
   @JsonProperty(value = "address")
   
   protected String address;
   
   @JsonProperty(value = "addressFamily")
   
   protected EAddressFamily addressFamily;
   
   @JsonProperty(value = "addressV6")
   
   protected String addressV6;
   
   @JsonProperty(value = "advertisementCriteria")
   
   protected EAdvertisementCriteria advertisementCriteria;
   
   @JsonProperty(value = "assocUnderlayID")
   
   protected String assocUnderlayID;
   
   @JsonProperty(value = "associatedBGPNeighborID")
   
   protected String associatedBGPNeighborID;
   
   @JsonProperty(value = "associatedUnderlayName")
   
   protected String associatedUnderlayName;
   
   @JsonProperty(value = "auxMode")
   
   protected EAuxMode auxMode;
   
   @JsonProperty(value = "auxiliaryLink")
   
   protected Boolean auxiliaryLink;
   
   @JsonProperty(value = "downloadRateLimit")
   
   protected Float downloadRateLimit;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   
   protected String gateway;
   
   @JsonProperty(value = "gatewayV6")
   
   protected String gatewayV6;
   
   @JsonProperty(value = "inherited")
   
   protected Boolean inherited;
   
   @JsonProperty(value = "installerManaged")
   
   protected Boolean installerManaged;
   
   @JsonProperty(value = "interfaceConnectionType")
   
   protected EInterfaceConnectionType interfaceConnectionType;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "mode")
   
   protected EMode mode;
   
   @JsonProperty(value = "netmask")
   
   protected String netmask;
   
   @JsonProperty(value = "password")
   
   protected String password;
   
   @JsonProperty(value = "portName")
   
   protected String portName;
   
   @JsonProperty(value = "primaryDataPathID")
   
   protected String primaryDataPathID;
   
   @JsonProperty(value = "role")
   
   protected ERole role;
   
   @JsonProperty(value = "roleOrder")
   
   protected Long roleOrder;
   
   @JsonProperty(value = "secondaryAddress")
   
   protected String secondaryAddress;
   
   @JsonProperty(value = "underlayEnabled")
   
   protected Boolean underlayEnabled;
   
   @JsonProperty(value = "underlayID")
   
   protected Long underlayID;
   
   @JsonProperty(value = "uplinkID")
   
   protected Long uplinkID;
   
   @JsonProperty(value = "username")
   
   protected String username;
   
   @JsonProperty(value = "vlan")
   
   protected Long vlan;
   

   
   @JsonIgnore
   private BFDSessionsFetcher bFDSessions;
   
   @JsonIgnore
   private CustomPropertiesFetcher customProperties;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public UplinkConnection() {
      
      bFDSessions = new BFDSessionsFetcher(this);
      
      customProperties = new CustomPropertiesFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getDNSAddress() {
      return DNSAddress;
   }

   @JsonIgnore
   public void setDNSAddress(String value) { 
      this.DNSAddress = value;
   }
   
   
   @JsonIgnore
   public String getDNSAddressV6() {
      return DNSAddressV6;
   }

   @JsonIgnore
   public void setDNSAddressV6(String value) { 
      this.DNSAddressV6 = value;
   }
   
   
   @JsonIgnore
   public Boolean getPATEnabled() {
      return PATEnabled;
   }

   @JsonIgnore
   public void setPATEnabled(Boolean value) { 
      this.PATEnabled = value;
   }
   
   
   @JsonIgnore
   public String getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(String value) { 
      this.address = value;
   }
   
   
   @JsonIgnore
   public EAddressFamily getAddressFamily() {
      return addressFamily;
   }

   @JsonIgnore
   public void setAddressFamily(EAddressFamily value) { 
      this.addressFamily = value;
   }
   
   
   @JsonIgnore
   public String getAddressV6() {
      return addressV6;
   }

   @JsonIgnore
   public void setAddressV6(String value) { 
      this.addressV6 = value;
   }
   
   
   @JsonIgnore
   public EAdvertisementCriteria getAdvertisementCriteria() {
      return advertisementCriteria;
   }

   @JsonIgnore
   public void setAdvertisementCriteria(EAdvertisementCriteria value) { 
      this.advertisementCriteria = value;
   }
   
   
   @JsonIgnore
   public String getAssocUnderlayID() {
      return assocUnderlayID;
   }

   @JsonIgnore
   public void setAssocUnderlayID(String value) { 
      this.assocUnderlayID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedBGPNeighborID() {
      return associatedBGPNeighborID;
   }

   @JsonIgnore
   public void setAssociatedBGPNeighborID(String value) { 
      this.associatedBGPNeighborID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedUnderlayName() {
      return associatedUnderlayName;
   }

   @JsonIgnore
   public void setAssociatedUnderlayName(String value) { 
      this.associatedUnderlayName = value;
   }
   
   
   @JsonIgnore
   public EAuxMode getAuxMode() {
      return auxMode;
   }

   @JsonIgnore
   public void setAuxMode(EAuxMode value) { 
      this.auxMode = value;
   }
   
   
   @JsonIgnore
   public Boolean getAuxiliaryLink() {
      return auxiliaryLink;
   }

   @JsonIgnore
   public void setAuxiliaryLink(Boolean value) { 
      this.auxiliaryLink = value;
   }
   
   
   @JsonIgnore
   public Float getDownloadRateLimit() {
      return downloadRateLimit;
   }

   @JsonIgnore
   public void setDownloadRateLimit(Float value) { 
      this.downloadRateLimit = value;
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
   public String getGateway() {
      return gateway;
   }

   @JsonIgnore
   public void setGateway(String value) { 
      this.gateway = value;
   }
   
   
   @JsonIgnore
   public String getGatewayV6() {
      return gatewayV6;
   }

   @JsonIgnore
   public void setGatewayV6(String value) { 
      this.gatewayV6 = value;
   }
   
   
   @JsonIgnore
   public Boolean getInherited() {
      return inherited;
   }

   @JsonIgnore
   public void setInherited(Boolean value) { 
      this.inherited = value;
   }
   
   
   @JsonIgnore
   public Boolean getInstallerManaged() {
      return installerManaged;
   }

   @JsonIgnore
   public void setInstallerManaged(Boolean value) { 
      this.installerManaged = value;
   }
   
   
   @JsonIgnore
   public EInterfaceConnectionType getInterfaceConnectionType() {
      return interfaceConnectionType;
   }

   @JsonIgnore
   public void setInterfaceConnectionType(EInterfaceConnectionType value) { 
      this.interfaceConnectionType = value;
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
   public EMode getMode() {
      return mode;
   }

   @JsonIgnore
   public void setMode(EMode value) { 
      this.mode = value;
   }
   
   
   @JsonIgnore
   public String getNetmask() {
      return netmask;
   }

   @JsonIgnore
   public void setNetmask(String value) { 
      this.netmask = value;
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
   public String getPortName() {
      return portName;
   }

   @JsonIgnore
   public void setPortName(String value) { 
      this.portName = value;
   }
   
   
   @JsonIgnore
   public String getPrimaryDataPathID() {
      return primaryDataPathID;
   }

   @JsonIgnore
   public void setPrimaryDataPathID(String value) { 
      this.primaryDataPathID = value;
   }
   
   
   @JsonIgnore
   public ERole getRole() {
      return role;
   }

   @JsonIgnore
   public void setRole(ERole value) { 
      this.role = value;
   }
   
   
   @JsonIgnore
   public Long getRoleOrder() {
      return roleOrder;
   }

   @JsonIgnore
   public void setRoleOrder(Long value) { 
      this.roleOrder = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryAddress() {
      return secondaryAddress;
   }

   @JsonIgnore
   public void setSecondaryAddress(String value) { 
      this.secondaryAddress = value;
   }
   
   
   @JsonIgnore
   public Boolean getUnderlayEnabled() {
      return underlayEnabled;
   }

   @JsonIgnore
   public void setUnderlayEnabled(Boolean value) { 
      this.underlayEnabled = value;
   }
   
   
   @JsonIgnore
   public Long getUnderlayID() {
      return underlayID;
   }

   @JsonIgnore
   public void setUnderlayID(Long value) { 
      this.underlayID = value;
   }
   
   
   @JsonIgnore
   public Long getUplinkID() {
      return uplinkID;
   }

   @JsonIgnore
   public void setUplinkID(Long value) { 
      this.uplinkID = value;
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
   public Long getVlan() {
      return vlan;
   }

   @JsonIgnore
   public void setVlan(Long value) { 
      this.vlan = value;
   }
   

   
   @JsonIgnore
   public BFDSessionsFetcher getBFDSessions() {
      return bFDSessions;
   }
   
   @JsonIgnore
   public CustomPropertiesFetcher getCustomProperties() {
      return customProperties;
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
      return "UplinkConnection [" + "DNSAddress=" + DNSAddress + ", DNSAddressV6=" + DNSAddressV6 + ", PATEnabled=" + PATEnabled + ", address=" + address + ", addressFamily=" + addressFamily + ", addressV6=" + addressV6 + ", advertisementCriteria=" + advertisementCriteria + ", assocUnderlayID=" + assocUnderlayID + ", associatedBGPNeighborID=" + associatedBGPNeighborID + ", associatedUnderlayName=" + associatedUnderlayName + ", auxMode=" + auxMode + ", auxiliaryLink=" + auxiliaryLink + ", downloadRateLimit=" + downloadRateLimit + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", gatewayV6=" + gatewayV6 + ", inherited=" + inherited + ", installerManaged=" + installerManaged + ", interfaceConnectionType=" + interfaceConnectionType + ", lastUpdatedBy=" + lastUpdatedBy + ", mode=" + mode + ", netmask=" + netmask + ", password=" + password + ", portName=" + portName + ", primaryDataPathID=" + primaryDataPathID + ", role=" + role + ", roleOrder=" + roleOrder + ", secondaryAddress=" + secondaryAddress + ", underlayEnabled=" + underlayEnabled + ", underlayID=" + underlayID + ", uplinkID=" + uplinkID + ", username=" + username + ", vlan=" + vlan + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}