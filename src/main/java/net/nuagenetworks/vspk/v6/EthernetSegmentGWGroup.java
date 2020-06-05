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


import net.nuagenetworks.vspk.v6.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DeploymentFailuresFetcher;
import net.nuagenetworks.vspk.v6.fetchers.DomainsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EgressProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EthernetSegmentGroupsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IPFilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IPv6FilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L2DomainsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MACFilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SAPEgressQoSProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SAPIngressQoSProfilesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ethernetsegmentgwgroup", resourceName = "ethernetsegmentgwgroups")
public class EthernetSegmentGWGroup extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EPersonality { NETCONF_7X50 };

   
   @JsonProperty(value = "assocGatewaysNames")
   
   protected java.util.List<String> assocGatewaysNames;
   
   @JsonProperty(value = "assocGatewaysStatus")
   
   protected java.util.List<String> assocGatewaysStatus;
   
   @JsonProperty(value = "associatedGatewayIDs")
   
   protected java.util.List<String> associatedGatewayIDs;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "personality")
   
   protected EPersonality personality;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private DeploymentFailuresFetcher deploymentFailures;
   
   @JsonIgnore
   private DomainsFetcher domains;
   
   @JsonIgnore
   private EgressProfilesFetcher egressProfiles;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EthernetSegmentGroupsFetcher ethernetSegmentGroups;
   
   @JsonIgnore
   private IngressProfilesFetcher ingressProfiles;
   
   @JsonIgnore
   private IPFilterProfilesFetcher iPFilterProfiles;
   
   @JsonIgnore
   private IPv6FilterProfilesFetcher iPv6FilterProfiles;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private L2DomainsFetcher l2Domains;
   
   @JsonIgnore
   private MACFilterProfilesFetcher mACFilterProfiles;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private SAPEgressQoSProfilesFetcher sAPEgressQoSProfiles;
   
   @JsonIgnore
   private SAPIngressQoSProfilesFetcher sAPIngressQoSProfiles;
   

   public EthernetSegmentGWGroup() {
      
      alarms = new AlarmsFetcher(this);
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      domains = new DomainsFetcher(this);
      
      egressProfiles = new EgressProfilesFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      ethernetSegmentGroups = new EthernetSegmentGroupsFetcher(this);
      
      ingressProfiles = new IngressProfilesFetcher(this);
      
      iPFilterProfiles = new IPFilterProfilesFetcher(this);
      
      iPv6FilterProfiles = new IPv6FilterProfilesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      mACFilterProfiles = new MACFilterProfilesFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      sAPEgressQoSProfiles = new SAPEgressQoSProfilesFetcher(this);
      
      sAPIngressQoSProfiles = new SAPIngressQoSProfilesFetcher(this);
      
   }

   
   
   @JsonIgnore
   public java.util.List<String> getAssocGatewaysNames() {
      return assocGatewaysNames;
   }

   @JsonIgnore
   public void setAssocGatewaysNames(java.util.List<String> value) { 
      this.assocGatewaysNames = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getAssocGatewaysStatus() {
      return assocGatewaysStatus;
   }

   @JsonIgnore
   public void setAssocGatewaysStatus(java.util.List<String> value) { 
      this.assocGatewaysStatus = value;
   }
   
   
   @JsonIgnore
   public java.util.List<String> getAssociatedGatewayIDs() {
      return associatedGatewayIDs;
   }

   @JsonIgnore
   public void setAssociatedGatewayIDs(java.util.List<String> value) { 
      this.associatedGatewayIDs = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   
   
   @JsonIgnore
   public EPersonality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(EPersonality value) { 
      this.personality = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public DeploymentFailuresFetcher getDeploymentFailures() {
      return deploymentFailures;
   }
   
   @JsonIgnore
   public DomainsFetcher getDomains() {
      return domains;
   }
   
   @JsonIgnore
   public EgressProfilesFetcher getEgressProfiles() {
      return egressProfiles;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public EthernetSegmentGroupsFetcher getEthernetSegmentGroups() {
      return ethernetSegmentGroups;
   }
   
   @JsonIgnore
   public IngressProfilesFetcher getIngressProfiles() {
      return ingressProfiles;
   }
   
   @JsonIgnore
   public IPFilterProfilesFetcher getIPFilterProfiles() {
      return iPFilterProfiles;
   }
   
   @JsonIgnore
   public IPv6FilterProfilesFetcher getIPv6FilterProfiles() {
      return iPv6FilterProfiles;
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
   public MACFilterProfilesFetcher getMACFilterProfiles() {
      return mACFilterProfiles;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public SAPEgressQoSProfilesFetcher getSAPEgressQoSProfiles() {
      return sAPEgressQoSProfiles;
   }
   
   @JsonIgnore
   public SAPIngressQoSProfilesFetcher getSAPIngressQoSProfiles() {
      return sAPIngressQoSProfiles;
   }
   

   public String toString() {
      return "EthernetSegmentGWGroup [" + "assocGatewaysNames=" + assocGatewaysNames + ", assocGatewaysStatus=" + assocGatewaysStatus + ", associatedGatewayIDs=" + associatedGatewayIDs + ", description=" + description + ", name=" + name + ", personality=" + personality + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}