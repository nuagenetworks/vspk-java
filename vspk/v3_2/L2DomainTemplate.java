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
import vspk.v3_2.fetchers.EgressACLTemplatesFetcher;
import vspk.v3_2.fetchers.EventLogsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.GroupsFetcher;
import vspk.v3_2.fetchers.IngressACLTemplatesFetcher;
import vspk.v3_2.fetchers.IngressAdvFwdTemplatesFetcher;
import vspk.v3_2.fetchers.IngressExternalServiceTemplatesFetcher;
import vspk.v3_2.fetchers.JobsFetcher;
import vspk.v3_2.fetchers.L2DomainsFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.PermissionsFetcher;
import vspk.v3_2.fetchers.PolicyGroupTemplatesFetcher;
import vspk.v3_2.fetchers.QOSsFetcher;
import vspk.v3_2.fetchers.RedirectionTargetTemplatesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class L2DomainTemplate extends RestObject {

   public final static String REST_NAME = "l2domaintemplate";
   public final static String RESOURCE_NAME = "l2domaintemplates";

   
   public enum IPType { IPV4, IPV6 };
   public enum Encryption { DISABLED, ENABLED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   public enum PolicyChangeStatus { APPLIED, DISCARDED, STARTED };

   
   @JsonProperty(value = "DHCPManaged")
   protected boolean DHCPManaged;
   
   @JsonProperty(value = "IPType")
   protected IPType IPType;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "policyChangeStatus")
   protected PolicyChangeStatus policyChangeStatus;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private EgressACLTemplatesFetcher egressACLTemplates;
   
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
   private IngressExternalServiceTemplatesFetcher ingressExternalServiceTemplates;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private PolicyGroupTemplatesFetcher policyGroupTemplates;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private RedirectionTargetTemplatesFetcher redirectionTargetTemplates;
   

   public L2DomainTemplate() {
      
      addressRanges = new AddressRangesFetcher(this);
      
      egressACLTemplates = new EgressACLTemplatesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      groups = new GroupsFetcher(this);
      
      ingressACLTemplates = new IngressACLTemplatesFetcher(this);
      
      ingressAdvFwdTemplates = new IngressAdvFwdTemplatesFetcher(this);
      
      ingressExternalServiceTemplates = new IngressExternalServiceTemplatesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      policyGroupTemplates = new PolicyGroupTemplatesFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      redirectionTargetTemplates = new RedirectionTargetTemplatesFetcher(this);
      
   }

   public boolean getDHCPManaged() {
      return DHCPManaged;
   }

   public void setDHCPManaged(boolean value) { 
      this.DHCPManaged = value;
   }
   public IPType getIPType() {
      return IPType;
   }

   public void setIPType(IPType value) { 
      this.IPType = value;
   }
   public String getAddress() {
      return address;
   }

   public void setAddress(String value) { 
      this.address = value;
   }
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public Encryption getEncryption() {
      return encryption;
   }

   public void setEncryption(Encryption value) { 
      this.encryption = value;
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
   public Multicast getMulticast() {
      return multicast;
   }

   public void setMulticast(Multicast value) { 
      this.multicast = value;
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
   public PolicyChangeStatus getPolicyChangeStatus() {
      return policyChangeStatus;
   }

   public void setPolicyChangeStatus(PolicyChangeStatus value) { 
      this.policyChangeStatus = value;
   }
   

   
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   public EgressACLTemplatesFetcher getEgressACLTemplates() {
      return egressACLTemplates;
   }
   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public GroupsFetcher getGroups() {
      return groups;
   }
   
   public IngressACLTemplatesFetcher getIngressACLTemplates() {
      return ingressACLTemplates;
   }
   
   public IngressAdvFwdTemplatesFetcher getIngressAdvFwdTemplates() {
      return ingressAdvFwdTemplates;
   }
   
   public IngressExternalServiceTemplatesFetcher getIngressExternalServiceTemplates() {
      return ingressExternalServiceTemplates;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public L2DomainsFetcher getL2Domains() {
      return l2Domains;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   public PolicyGroupTemplatesFetcher getPolicyGroupTemplates() {
      return policyGroupTemplates;
   }
   
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   public RedirectionTargetTemplatesFetcher getRedirectionTargetTemplates() {
      return redirectionTargetTemplates;
   }
   

   public String toString() {
      return "L2DomainTemplate [" + "DHCPManaged=" + DHCPManaged + ", IPType=" + IPType + ", address=" + address + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", description=" + description + ", encryption=" + encryption + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gateway=" + gateway + ", lastUpdatedBy=" + lastUpdatedBy + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyChangeStatus=" + policyChangeStatus + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}