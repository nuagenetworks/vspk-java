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


import net.nuagenetworks.vspk.v6.fetchers.AddressRangesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PATIPEntriesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.StaticRoutesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VPNConnectionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "sharednetworkresource", resourceName = "sharednetworkresources")
public class SharedNetworkResource extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPermittedActionType { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EType { FLOATING, L2DOMAIN, PUBLIC, UPLINK_SUBNET };
   public enum EUseGlobalMAC { DISABLED, ENABLED };

   
   @JsonProperty(value = "DHCPManaged")
   
   protected Boolean DHCPManaged;
   
   @JsonProperty(value = "ECMPCount")
   
   protected Long ECMPCount;
   
   @JsonProperty(value = "accessRestrictionEnabled")
   
   protected Boolean accessRestrictionEnabled;
   
   @JsonProperty(value = "address")
   
   protected String address;
   
   @JsonProperty(value = "associatedPATMapperID")
   
   protected String associatedPATMapperID;
   
   @JsonProperty(value = "backHaulRouteDistinguisher")
   
   protected String backHaulRouteDistinguisher;
   
   @JsonProperty(value = "backHaulRouteTarget")
   
   protected String backHaulRouteTarget;
   
   @JsonProperty(value = "backHaulVNID")
   
   protected Long backHaulVNID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "domainRouteDistinguisher")
   
   protected String domainRouteDistinguisher;
   
   @JsonProperty(value = "domainRouteTarget")
   
   protected String domainRouteTarget;
   
   @JsonProperty(value = "dynamicPATAllocationEnabled")
   
   protected Boolean dynamicPATAllocationEnabled;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseID")
   
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   
   protected String gateway;
   
   @JsonProperty(value = "gatewayMACAddress")
   
   protected String gatewayMACAddress;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "netmask")
   
   protected String netmask;
   
   @JsonProperty(value = "permittedActionType")
   
   protected EPermittedActionType permittedActionType;
   
   @JsonProperty(value = "sharedResourceParentID")
   
   protected String sharedResourceParentID;
   
   @JsonProperty(value = "subnetRouteDistinguisher")
   
   protected String subnetRouteDistinguisher;
   
   @JsonProperty(value = "subnetRouteTarget")
   
   protected String subnetRouteTarget;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   
   @JsonProperty(value = "underlay")
   
   protected Boolean underlay;
   
   @JsonProperty(value = "uplinkGWVlanAttachmentID")
   
   protected String uplinkGWVlanAttachmentID;
   
   @JsonProperty(value = "uplinkInterfaceIP")
   
   protected String uplinkInterfaceIP;
   
   @JsonProperty(value = "uplinkInterfaceMAC")
   
   protected String uplinkInterfaceMAC;
   
   @JsonProperty(value = "uplinkVPortName")
   
   protected String uplinkVPortName;
   
   @JsonProperty(value = "useGlobalMAC")
   
   protected EUseGlobalMAC useGlobalMAC;
   
   @JsonProperty(value = "vnID")
   
   protected Long vnID;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PATIPEntriesFetcher pATIPEntries;
   
   @JsonIgnore
   private StaticRoutesFetcher staticRoutes;
   
   @JsonIgnore
   private VPNConnectionsFetcher vPNConnections;
   

   public SharedNetworkResource() {
      type = EType.PUBLIC;
      DHCPManaged = true;
      
      addressRanges = new AddressRangesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      pATIPEntries = new PATIPEntriesFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      vPNConnections = new VPNConnectionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public Boolean getDHCPManaged() {
      return DHCPManaged;
   }

   @JsonIgnore
   public void setDHCPManaged(Boolean value) { 
      this.DHCPManaged = value;
   }
   
   
   @JsonIgnore
   public Long getECMPCount() {
      return ECMPCount;
   }

   @JsonIgnore
   public void setECMPCount(Long value) { 
      this.ECMPCount = value;
   }
   
   
   @JsonIgnore
   public Boolean getAccessRestrictionEnabled() {
      return accessRestrictionEnabled;
   }

   @JsonIgnore
   public void setAccessRestrictionEnabled(Boolean value) { 
      this.accessRestrictionEnabled = value;
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
   public String getAssociatedPATMapperID() {
      return associatedPATMapperID;
   }

   @JsonIgnore
   public void setAssociatedPATMapperID(String value) { 
      this.associatedPATMapperID = value;
   }
   
   
   @JsonIgnore
   public String getBackHaulRouteDistinguisher() {
      return backHaulRouteDistinguisher;
   }

   @JsonIgnore
   public void setBackHaulRouteDistinguisher(String value) { 
      this.backHaulRouteDistinguisher = value;
   }
   
   
   @JsonIgnore
   public String getBackHaulRouteTarget() {
      return backHaulRouteTarget;
   }

   @JsonIgnore
   public void setBackHaulRouteTarget(String value) { 
      this.backHaulRouteTarget = value;
   }
   
   
   @JsonIgnore
   public Long getBackHaulVNID() {
      return backHaulVNID;
   }

   @JsonIgnore
   public void setBackHaulVNID(Long value) { 
      this.backHaulVNID = value;
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
   public String getDomainRouteDistinguisher() {
      return domainRouteDistinguisher;
   }

   @JsonIgnore
   public void setDomainRouteDistinguisher(String value) { 
      this.domainRouteDistinguisher = value;
   }
   
   
   @JsonIgnore
   public String getDomainRouteTarget() {
      return domainRouteTarget;
   }

   @JsonIgnore
   public void setDomainRouteTarget(String value) { 
      this.domainRouteTarget = value;
   }
   
   
   @JsonIgnore
   public Boolean getDynamicPATAllocationEnabled() {
      return dynamicPATAllocationEnabled;
   }

   @JsonIgnore
   public void setDynamicPATAllocationEnabled(Boolean value) { 
      this.dynamicPATAllocationEnabled = value;
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
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
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
   public String getGatewayMACAddress() {
      return gatewayMACAddress;
   }

   @JsonIgnore
   public void setGatewayMACAddress(String value) { 
      this.gatewayMACAddress = value;
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
   public String getNetmask() {
      return netmask;
   }

   @JsonIgnore
   public void setNetmask(String value) { 
      this.netmask = value;
   }
   
   
   @JsonIgnore
   public EPermittedActionType getPermittedActionType() {
      return permittedActionType;
   }

   @JsonIgnore
   public void setPermittedActionType(EPermittedActionType value) { 
      this.permittedActionType = value;
   }
   
   
   @JsonIgnore
   public String getSharedResourceParentID() {
      return sharedResourceParentID;
   }

   @JsonIgnore
   public void setSharedResourceParentID(String value) { 
      this.sharedResourceParentID = value;
   }
   
   
   @JsonIgnore
   public String getSubnetRouteDistinguisher() {
      return subnetRouteDistinguisher;
   }

   @JsonIgnore
   public void setSubnetRouteDistinguisher(String value) { 
      this.subnetRouteDistinguisher = value;
   }
   
   
   @JsonIgnore
   public String getSubnetRouteTarget() {
      return subnetRouteTarget;
   }

   @JsonIgnore
   public void setSubnetRouteTarget(String value) { 
      this.subnetRouteTarget = value;
   }
   
   
   @JsonIgnore
   public EType getType() {
      return type;
   }

   @JsonIgnore
   public void setType(EType value) { 
      this.type = value;
   }
   
   
   @JsonIgnore
   public Boolean getUnderlay() {
      return underlay;
   }

   @JsonIgnore
   public void setUnderlay(Boolean value) { 
      this.underlay = value;
   }
   
   
   @JsonIgnore
   public String getUplinkGWVlanAttachmentID() {
      return uplinkGWVlanAttachmentID;
   }

   @JsonIgnore
   public void setUplinkGWVlanAttachmentID(String value) { 
      this.uplinkGWVlanAttachmentID = value;
   }
   
   
   @JsonIgnore
   public String getUplinkInterfaceIP() {
      return uplinkInterfaceIP;
   }

   @JsonIgnore
   public void setUplinkInterfaceIP(String value) { 
      this.uplinkInterfaceIP = value;
   }
   
   
   @JsonIgnore
   public String getUplinkInterfaceMAC() {
      return uplinkInterfaceMAC;
   }

   @JsonIgnore
   public void setUplinkInterfaceMAC(String value) { 
      this.uplinkInterfaceMAC = value;
   }
   
   
   @JsonIgnore
   public String getUplinkVPortName() {
      return uplinkVPortName;
   }

   @JsonIgnore
   public void setUplinkVPortName(String value) { 
      this.uplinkVPortName = value;
   }
   
   
   @JsonIgnore
   public EUseGlobalMAC getUseGlobalMAC() {
      return useGlobalMAC;
   }

   @JsonIgnore
   public void setUseGlobalMAC(EUseGlobalMAC value) { 
      this.useGlobalMAC = value;
   }
   
   
   @JsonIgnore
   public Long getVnID() {
      return vnID;
   }

   @JsonIgnore
   public void setVnID(Long value) { 
      this.vnID = value;
   }
   

   
   @JsonIgnore
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   @JsonIgnore
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PATIPEntriesFetcher getPATIPEntries() {
      return pATIPEntries;
   }
   
   @JsonIgnore
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   @JsonIgnore
   public VPNConnectionsFetcher getVPNConnections() {
      return vPNConnections;
   }
   

   public String toString() {
      return "SharedNetworkResource [" + "DHCPManaged=" + DHCPManaged + ", ECMPCount=" + ECMPCount + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", address=" + address + ", associatedPATMapperID=" + associatedPATMapperID + ", backHaulRouteDistinguisher=" + backHaulRouteDistinguisher + ", backHaulRouteTarget=" + backHaulRouteTarget + ", backHaulVNID=" + backHaulVNID + ", description=" + description + ", domainRouteDistinguisher=" + domainRouteDistinguisher + ", domainRouteTarget=" + domainRouteTarget + ", dynamicPATAllocationEnabled=" + dynamicPATAllocationEnabled + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", netmask=" + netmask + ", permittedActionType=" + permittedActionType + ", sharedResourceParentID=" + sharedResourceParentID + ", subnetRouteDistinguisher=" + subnetRouteDistinguisher + ", subnetRouteTarget=" + subnetRouteTarget + ", type=" + type + ", underlay=" + underlay + ", uplinkGWVlanAttachmentID=" + uplinkGWVlanAttachmentID + ", uplinkInterfaceIP=" + uplinkInterfaceIP + ", uplinkInterfaceMAC=" + uplinkInterfaceMAC + ", uplinkVPortName=" + uplinkVPortName + ", useGlobalMAC=" + useGlobalMAC + ", vnID=" + vnID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}