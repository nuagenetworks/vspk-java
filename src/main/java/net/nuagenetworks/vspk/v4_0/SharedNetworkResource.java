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
   
   @JsonProperty(value = "associatedPATMapperID")
   protected String associatedPATMapperID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "dynamicPATAllocationEnabled")
   protected Boolean dynamicPATAllocationEnabled;
   
   @JsonProperty(value = "type")
   protected Type type;
   

   
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
      
      addressRanges = new AddressRangesFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      vPNConnections = new VPNConnectionsFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
   }

   public Long getECMPCount() {
      return ECMPCount;
   }

   public void setECMPCount(Long value) { 
      this.ECMPCount = value;
   }
   public Boolean getDHCPManaged() {
      return DHCPManaged;
   }

   public void setDHCPManaged(Boolean value) { 
      this.DHCPManaged = value;
   }
   public String getBackHaulRouteDistinguisher() {
      return backHaulRouteDistinguisher;
   }

   public void setBackHaulRouteDistinguisher(String value) { 
      this.backHaulRouteDistinguisher = value;
   }
   public String getBackHaulRouteTarget() {
      return backHaulRouteTarget;
   }

   public void setBackHaulRouteTarget(String value) { 
      this.backHaulRouteTarget = value;
   }
   public Long getBackHaulVNID() {
      return backHaulVNID;
   }

   public void setBackHaulVNID(Long value) { 
      this.backHaulVNID = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getGateway() {
      return gateway;
   }

   public void setGateway(String value) { 
      this.gateway = value;
   }
   public Boolean getAccessRestrictionEnabled() {
      return accessRestrictionEnabled;
   }

   public void setAccessRestrictionEnabled(Boolean value) { 
      this.accessRestrictionEnabled = value;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
   }
   public PermittedActionType getPermittedActionType() {
      return permittedActionType;
   }

   public void setPermittedActionType(PermittedActionType value) { 
      this.permittedActionType = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getNetmask() {
      return netmask;
   }

   public void setNetmask(String value) { 
      this.netmask = value;
   }
   public String getSharedResourceParentID() {
      return sharedResourceParentID;
   }

   public void setSharedResourceParentID(String value) { 
      this.sharedResourceParentID = value;
   }
   public Long getVnID() {
      return vnID;
   }

   public void setVnID(Long value) { 
      this.vnID = value;
   }
   public Boolean getUnderlay() {
      return underlay;
   }

   public void setUnderlay(Boolean value) { 
      this.underlay = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getDomainRouteDistinguisher() {
      return domainRouteDistinguisher;
   }

   public void setDomainRouteDistinguisher(String value) { 
      this.domainRouteDistinguisher = value;
   }
   public String getDomainRouteTarget() {
      return domainRouteTarget;
   }

   public void setDomainRouteTarget(String value) { 
      this.domainRouteTarget = value;
   }
   public String getUplinkGWVlanAttachmentID() {
      return uplinkGWVlanAttachmentID;
   }

   public void setUplinkGWVlanAttachmentID(String value) { 
      this.uplinkGWVlanAttachmentID = value;
   }
   public String getUplinkInterfaceIP() {
      return uplinkInterfaceIP;
   }

   public void setUplinkInterfaceIP(String value) { 
      this.uplinkInterfaceIP = value;
   }
   public String getUplinkInterfaceMAC() {
      return uplinkInterfaceMAC;
   }

   public void setUplinkInterfaceMAC(String value) { 
      this.uplinkInterfaceMAC = value;
   }
   public String getUplinkVPortName() {
      return uplinkVPortName;
   }

   public void setUplinkVPortName(String value) { 
      this.uplinkVPortName = value;
   }
   public String getAssociatedPATMapperID() {
      return associatedPATMapperID;
   }

   public void setAssociatedPATMapperID(String value) { 
      this.associatedPATMapperID = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public Boolean getDynamicPATAllocationEnabled() {
      return dynamicPATAllocationEnabled;
   }

   public void setDynamicPATAllocationEnabled(Boolean value) { 
      this.dynamicPATAllocationEnabled = value;
   }
   public Type getType() {
      return type;
   }

   public void setType(Type value) { 
      this.type = value;
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
      return "SharedNetworkResource [" + "ECMPCount=" + ECMPCount + ", DHCPManaged=" + DHCPManaged + ", backHaulRouteDistinguisher=" + backHaulRouteDistinguisher + ", backHaulRouteTarget=" + backHaulRouteTarget + ", backHaulVNID=" + backHaulVNID + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", gateway=" + gateway + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", address=" + address + ", permittedActionType=" + permittedActionType + ", description=" + description + ", netmask=" + netmask + ", sharedResourceParentID=" + sharedResourceParentID + ", vnID=" + vnID + ", underlay=" + underlay + ", entityScope=" + entityScope + ", domainRouteDistinguisher=" + domainRouteDistinguisher + ", domainRouteTarget=" + domainRouteTarget + ", uplinkGWVlanAttachmentID=" + uplinkGWVlanAttachmentID + ", uplinkInterfaceIP=" + uplinkInterfaceIP + ", uplinkInterfaceMAC=" + uplinkInterfaceMAC + ", uplinkVPortName=" + uplinkVPortName + ", associatedPATMapperID=" + associatedPATMapperID + ", externalID=" + externalID + ", dynamicPATAllocationEnabled=" + dynamicPATAllocationEnabled + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}