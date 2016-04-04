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


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.AddressRangesFetcher;
import vspk.v3_2.fetchers.DHCPOptionsFetcher;
import vspk.v3_2.fetchers.EnterprisePermissionsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.StaticRoutesFetcher;
import vspk.v3_2.fetchers.VPNConnectionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharedNetworkResource extends RestObject {

   public final static String REST_NAME = "sharednetworkresource";
   public final static String RESOURCE_NAME = "sharednetworkresources";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum PermittedActionType { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Type { FLOATING, L2DOMAIN, PUBLIC, UPLINK_SUBNET };

   
   @JsonProperty(value = "DHCPManaged")
   protected boolean DHCPManaged;
   
   @JsonProperty(value = "ECMPCount")
   protected int ECMPCount;
   
   @JsonProperty(value = "accessRestrictionEnabled")
   protected boolean accessRestrictionEnabled;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "backHaulRouteDistinguisher")
   protected String backHaulRouteDistinguisher;
   
   @JsonProperty(value = "backHaulRouteTarget")
   protected String backHaulRouteTarget;
   
   @JsonProperty(value = "backHaulVNID")
   protected int backHaulVNID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "domainRouteDistinguisher")
   protected String domainRouteDistinguisher;
   
   @JsonProperty(value = "domainRouteTarget")
   protected String domainRouteTarget;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "permittedActionType")
   protected PermittedActionType permittedActionType;
   
   @JsonProperty(value = "sharedResourceParentID")
   protected String sharedResourceParentID;
   
   @JsonProperty(value = "type")
   protected Type type;
   
   @JsonProperty(value = "underlay")
   protected boolean underlay;
   
   @JsonProperty(value = "uplinkGWVlanAttachmentID")
   protected String uplinkGWVlanAttachmentID;
   
   @JsonProperty(value = "uplinkInterfaceIP")
   protected String uplinkInterfaceIP;
   
   @JsonProperty(value = "uplinkInterfaceMAC")
   protected String uplinkInterfaceMAC;
   
   @JsonProperty(value = "uplinkVPortName")
   protected String uplinkVPortName;
   
   @JsonProperty(value = "vnID")
   protected int vnID;
   

   
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
   private StaticRoutesFetcher staticRoutes;
   
   @JsonIgnore
   private VPNConnectionsFetcher vPNConnections;
   

   public SharedNetworkResource() {
      
      addressRanges = new AddressRangesFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      staticRoutes = new StaticRoutesFetcher(this);
      
      vPNConnections = new VPNConnectionsFetcher(this);
      
   }

   public boolean getDHCPManaged() {
      return DHCPManaged;
   }

   public void setDHCPManaged(boolean value) { 
      this.DHCPManaged = value;
   }
   public int getECMPCount() {
      return ECMPCount;
   }

   public void setECMPCount(int value) { 
      this.ECMPCount = value;
   }
   public boolean getAccessRestrictionEnabled() {
      return accessRestrictionEnabled;
   }

   public void setAccessRestrictionEnabled(boolean value) { 
      this.accessRestrictionEnabled = value;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
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
   public int getBackHaulVNID() {
      return backHaulVNID;
   }

   public void setBackHaulVNID(int value) { 
      this.backHaulVNID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getGateway() {
      return gateway;
   }

   public void setGateway(String value) { 
      this.gateway = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getNetmask() {
      return netmask;
   }

   public void setNetmask(String value) { 
      this.netmask = value;
   }
   public PermittedActionType getPermittedActionType() {
      return permittedActionType;
   }

   public void setPermittedActionType(PermittedActionType value) { 
      this.permittedActionType = value;
   }
   public String getSharedResourceParentID() {
      return sharedResourceParentID;
   }

   public void setSharedResourceParentID(String value) { 
      this.sharedResourceParentID = value;
   }
   public Type getType() {
      return type;
   }

   public void setType(Type value) { 
      this.type = value;
   }
   public boolean getUnderlay() {
      return underlay;
   }

   public void setUnderlay(boolean value) { 
      this.underlay = value;
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
   public int getVnID() {
      return vnID;
   }

   public void setVnID(int value) { 
      this.vnID = value;
   }
   

   
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public StaticRoutesFetcher getStaticRoutes() {
      return staticRoutes;
   }
   
   public VPNConnectionsFetcher getVPNConnections() {
      return vPNConnections;
   }
   

   public String toString() {
      return "SharedNetworkResource [" + "DHCPManaged=" + DHCPManaged + ", ECMPCount=" + ECMPCount + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", address=" + address + ", backHaulRouteDistinguisher=" + backHaulRouteDistinguisher + ", backHaulRouteTarget=" + backHaulRouteTarget + ", backHaulVNID=" + backHaulVNID + ", description=" + description + ", domainRouteDistinguisher=" + domainRouteDistinguisher + ", domainRouteTarget=" + domainRouteTarget + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", netmask=" + netmask + ", permittedActionType=" + permittedActionType + ", sharedResourceParentID=" + sharedResourceParentID + ", type=" + type + ", underlay=" + underlay + ", uplinkGWVlanAttachmentID=" + uplinkGWVlanAttachmentID + ", uplinkInterfaceIP=" + uplinkInterfaceIP + ", uplinkInterfaceMAC=" + uplinkInterfaceMAC + ", uplinkVPortName=" + uplinkVPortName + ", vnID=" + vnID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}