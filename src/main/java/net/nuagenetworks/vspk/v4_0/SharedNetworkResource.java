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


import net.nuagenetworks.vspk.v4_0.fetchers.PATIPEntriesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AddressRangesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VPNConnectionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.StaticRoutesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "sharednetworkresource", resourceName = "sharednetworkresources")
public class SharedNetworkResource extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum PermittedActionType { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum UseGlobalMAC { DISABLED, ENABLED };
   public enum Type { FLOATING, L2DOMAIN, PUBLIC, UPLINK_SUBNET };

   
   @JsonProperty(value = "ECMPCount")
   protected Long ECMPCount;
   
   @JsonProperty(value = "DHCPManaged")
   protected Boolean DHCPManaged;
   
   @JsonProperty(value = "backHaulRouteDistinguisher")
   protected String backHaulRouteDistinguisher;
   
   @JsonProperty(value = "backHaulRouteTarget")
   protected String backHaulRouteTarget;
   
   @JsonProperty(value = "backHaulVNID")
   protected Long backHaulVNID;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "gatewayMACAddress")
   protected String gatewayMACAddress;
   
   @JsonProperty(value = "accessRestrictionEnabled")
   protected Boolean accessRestrictionEnabled;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "permittedActionType")
   protected PermittedActionType permittedActionType;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "sharedResourceParentID")
   protected String sharedResourceParentID;
   
   @JsonProperty(value = "vnID")
   protected Long vnID;
   
   @JsonProperty(value = "underlay")
   protected Boolean underlay;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "domainRouteDistinguisher")
   protected String domainRouteDistinguisher;
   
   @JsonProperty(value = "domainRouteTarget")
   protected String domainRouteTarget;
   
   @JsonProperty(value = "uplinkGWVlanAttachmentID")
   protected String uplinkGWVlanAttachmentID;
   
   @JsonProperty(value = "uplinkInterfaceIP")
   protected String uplinkInterfaceIP;
   
   @JsonProperty(value = "uplinkInterfaceMAC")
   protected String uplinkInterfaceMAC;
   
   @JsonProperty(value = "uplinkVPortName")
   protected String uplinkVPortName;
   
   @JsonProperty(value = "useGlobalMAC")
   protected UseGlobalMAC useGlobalMAC;
   
   @JsonProperty(value = "associatedPATMapperID")
   protected String associatedPATMapperID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "dynamicPATAllocationEnabled")
   protected Boolean dynamicPATAllocationEnabled;
   
   @JsonProperty(value = "type")
   protected Type type;
   

   
   @JsonIgnore
   private PATIPEntriesFetcher pATIPEntries;
   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private VPNConnectionsFetcher vPNConnections;
   
   @JsonIgnore
   private StaticRoutesFetcher staticRoutes;
   

   public SharedNetworkResource() {
      type = Type.PUBLIC;
      DHCPManaged = true;
      
      pATIPEntries = new PATIPEntriesFetcher(this);
      
      addressRanges = new AddressRangesFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      vPNConnections = new VPNConnectionsFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
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
   public Boolean getDHCPManaged() {
      return DHCPManaged;
   }

   @JsonIgnore
   public void setDHCPManaged(Boolean value) { 
      this.DHCPManaged = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
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
   public PermittedActionType getPermittedActionType() {
      return permittedActionType;
   }

   @JsonIgnore
   public void setPermittedActionType(PermittedActionType value) { 
      this.permittedActionType = value;
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
   public String getNetmask() {
      return netmask;
   }

   @JsonIgnore
   public void setNetmask(String value) { 
      this.netmask = value;
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
   public Long getVnID() {
      return vnID;
   }

   @JsonIgnore
   public void setVnID(Long value) { 
      this.vnID = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
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
   public UseGlobalMAC getUseGlobalMAC() {
      return useGlobalMAC;
   }

   @JsonIgnore
   public void setUseGlobalMAC(UseGlobalMAC value) { 
      this.useGlobalMAC = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
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
   public Type getType() {
      return type;
   }

   @JsonIgnore
   public void setType(Type value) { 
      this.type = value;
   }
   

   
   @JsonIgnore
   public PATIPEntriesFetcher getPATIPEntries() {
      return pATIPEntries;
   }
   
   @JsonIgnore
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public VPNConnectionsFetcher getVPNConnections() {
      return vPNConnections;
   }
   
   @JsonIgnore
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   

   public String toString() {
      return "SharedNetworkResource [" + "ECMPCount=" + ECMPCount + ", DHCPManaged=" + DHCPManaged + ", backHaulRouteDistinguisher=" + backHaulRouteDistinguisher + ", backHaulRouteTarget=" + backHaulRouteTarget + ", backHaulVNID=" + backHaulVNID + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", address=" + address + ", permittedActionType=" + permittedActionType + ", description=" + description + ", netmask=" + netmask + ", sharedResourceParentID=" + sharedResourceParentID + ", vnID=" + vnID + ", underlay=" + underlay + ", entityScope=" + entityScope + ", domainRouteDistinguisher=" + domainRouteDistinguisher + ", domainRouteTarget=" + domainRouteTarget + ", uplinkGWVlanAttachmentID=" + uplinkGWVlanAttachmentID + ", uplinkInterfaceIP=" + uplinkInterfaceIP + ", uplinkInterfaceMAC=" + uplinkInterfaceMAC + ", uplinkVPortName=" + uplinkVPortName + ", useGlobalMAC=" + useGlobalMAC + ", associatedPATMapperID=" + associatedPATMapperID + ", externalID=" + externalID + ", dynamicPATAllocationEnabled=" + dynamicPATAllocationEnabled + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}