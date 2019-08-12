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
import net.nuagenetworks.vspk.v6.fetchers.EgressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EgressAdvFwdTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressACLTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressAdvFwdTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L2DomainsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.OverlayMirrorDestinationTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PGExpressionTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PolicyGroupTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.RedirectionTargetTemplatesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VirtualFirewallPoliciesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "l2domaintemplate", resourceName = "l2domaintemplates")
public class L2DomainTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EDPI { DISABLED, ENABLED, INHERITED };
   public enum EIPType { DUALSTACK, IPV4, IPV6 };
   public enum EEncryption { DISABLED, ENABLED };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EEntityState { MARKED_FOR_DELETION, UNDER_CONSTRUCTION };
   public enum EMulticast { DISABLED, ENABLED, INHERITED };
   public enum EPolicyChangeStatus { APPLIED, DISCARDED, STARTED };
   public enum EUseGlobalMAC { DISABLED, ENABLED };

   
   @JsonProperty(value = "DHCPManaged")
   
   protected Boolean DHCPManaged;
   
   @JsonProperty(value = "DPI")
   
   protected EDPI DPI;
   
   @JsonProperty(value = "IPType")
   
   protected EIPType IPType;
   
   @JsonProperty(value = "IPv6Address")
   
   protected String IPv6Address;
   
   @JsonProperty(value = "IPv6Gateway")
   
   protected String IPv6Gateway;
   
   @JsonProperty(value = "address")
   
   protected String address;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "dualStackDynamicIPAllocation")
   
   protected Boolean dualStackDynamicIPAllocation;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enableDHCPv4")
   
   protected Boolean enableDHCPv4;
   
   @JsonProperty(value = "enableDHCPv6")
   
   protected Boolean enableDHCPv6;
   
   @JsonProperty(value = "encryption")
   
   protected EEncryption encryption;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "entityState")
   
   protected EEntityState entityState;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   
   protected String gateway;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "multicast")
   
   protected EMulticast multicast;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "netmask")
   
   protected String netmask;
   
   @JsonProperty(value = "policyChangeStatus")
   
   protected EPolicyChangeStatus policyChangeStatus;
   
   @JsonProperty(value = "useGlobalMAC")
   
   protected EUseGlobalMAC useGlobalMAC;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private EgressACLTemplatesFetcher egressACLTemplates;
   
   @JsonIgnore
   private EgressAdvFwdTemplatesFetcher egressAdvFwdTemplates;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private GroupsFetcher groups;
   
   @JsonIgnore
   private IngressACLTemplatesFetcher ingressACLTemplates;
   
   @JsonIgnore
   private IngressAdvFwdTemplatesFetcher ingressAdvFwdTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private OverlayMirrorDestinationTemplatesFetcher overlayMirrorDestinationTemplates;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private PGExpressionTemplatesFetcher pGExpressionTemplates;
   
   @JsonIgnore
   private PolicyGroupTemplatesFetcher policyGroupTemplates;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private RedirectionTargetTemplatesFetcher redirectionTargetTemplates;
   
   @JsonIgnore
   private VirtualFirewallPoliciesFetcher virtualFirewallPolicies;
   

   public L2DomainTemplate() {
      
      addressRanges = new AddressRangesFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      egressAdvFwdTemplates = new EgressAdvFwdTemplatesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      ingressACLTemplates = new IngressACLTemplatesFetcher(this);
      
      ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      overlayMirrorDestinationTemplates = new OverlayMirrorDestinationTemplatesFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      pGExpressionTemplates = new PGExpressionTemplatesFetcher(this);
      
      policyGroupTemplates = new PolicyGroupTemplatesFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      redirectionTargetTemplates = new RedirectionTargetTemplatesFetcher(this);
      
      virtualFirewallPolicies = new VirtualFirewallPoliciesFetcher(this);
      
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
   public EDPI getDPI() {
      return DPI;
   }

   @JsonIgnore
   public void setDPI(EDPI value) { 
      this.DPI = value;
   }
   
   
   @JsonIgnore
   public EIPType getIPType() {
      return IPType;
   }

   @JsonIgnore
   public void setIPType(EIPType value) { 
      this.IPType = value;
   }
   
   
   @JsonIgnore
   public String getIPv6Address() {
      return IPv6Address;
   }

   @JsonIgnore
   public void setIPv6Address(String value) { 
      this.IPv6Address = value;
   }
   
   
   @JsonIgnore
   public String getIPv6Gateway() {
      return IPv6Gateway;
   }

   @JsonIgnore
   public void setIPv6Gateway(String value) { 
      this.IPv6Gateway = value;
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
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   @JsonIgnore
   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
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
   public Boolean getDualStackDynamicIPAllocation() {
      return dualStackDynamicIPAllocation;
   }

   @JsonIgnore
   public void setDualStackDynamicIPAllocation(Boolean value) { 
      this.dualStackDynamicIPAllocation = value;
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
   public Boolean getEnableDHCPv4() {
      return enableDHCPv4;
   }

   @JsonIgnore
   public void setEnableDHCPv4(Boolean value) { 
      this.enableDHCPv4 = value;
   }
   
   
   @JsonIgnore
   public Boolean getEnableDHCPv6() {
      return enableDHCPv6;
   }

   @JsonIgnore
   public void setEnableDHCPv6(Boolean value) { 
      this.enableDHCPv6 = value;
   }
   
   
   @JsonIgnore
   public EEncryption getEncryption() {
      return encryption;
   }

   @JsonIgnore
   public void setEncryption(EEncryption value) { 
      this.encryption = value;
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
   public EEntityState getEntityState() {
      return entityState;
   }

   @JsonIgnore
   public void setEntityState(EEntityState value) { 
      this.entityState = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   
   @JsonIgnore
   public EMulticast getMulticast() {
      return multicast;
   }

   @JsonIgnore
   public void setMulticast(EMulticast value) { 
      this.multicast = value;
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
   public EPolicyChangeStatus getPolicyChangeStatus() {
      return policyChangeStatus;
   }

   @JsonIgnore
   public void setPolicyChangeStatus(EPolicyChangeStatus value) { 
      this.policyChangeStatus = value;
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
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   @JsonIgnore
   public EgressACLTemplatesFetcher getEgressACLTemplates() {
      return egressACLTemplates;
   }
   
   @JsonIgnore
   public EgressAdvFwdTemplatesFetcher getEgressAdvFwdTemplates() {
      return egressAdvFwdTemplates;
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
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   @JsonIgnore
   public IngressACLTemplatesFetcher getIngressACLTemplates() {
      return ingressACLTemplates;
   }
   
   @JsonIgnore
   public IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplates() {
      return ingressAdvFwdTemplates;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public OverlayMirrorDestinationTemplatesFetcher getOverlayMirrorDestinationTemplates() {
      return overlayMirrorDestinationTemplates;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public PGExpressionTemplatesFetcher getPGExpressionTemplates() {
      return pGExpressionTemplates;
   }
   
   @JsonIgnore
   public PolicyGroupTemplatesFetcher getPolicyGroupTemplates() {
      return policyGroupTemplates;
   }
   
   @JsonIgnore
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public RedirectionTargetTemplatesFetcher getRedirectionTargetTemplates() {
      return redirectionTargetTemplates;
   }
   
   @JsonIgnore
   public VirtualFirewallPoliciesFetcher getVirtualFirewallPolicies() {
      return virtualFirewallPolicies;
   }
   

   public String toString() {
      return "L2DomainTemplate [" + "DHCPManaged=" + DHCPManaged + ", DPI=" + DPI + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", IPv6Gateway=" + IPv6Gateway + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", description=" + description + ", dualStackDynamicIPAllocation=" + dualStackDynamicIPAllocation + ", embeddedMetadata=" + embeddedMetadata + ", enableDHCPv4=" + enableDHCPv4 + ", enableDHCPv6=" + enableDHCPv6 + ", encryption=" + encryption + ", entityScope=" + entityScope + ", entityState=" + entityState + ", externalID=" + externalID + ", gateway=" + gateway + ", lastUpdatedBy=" + lastUpdatedBy + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyChangeStatus=" + policyChangeStatus + ", useGlobalMAC=" + useGlobalMAC + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}