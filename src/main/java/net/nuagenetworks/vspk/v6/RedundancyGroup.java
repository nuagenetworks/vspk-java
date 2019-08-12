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
import net.nuagenetworks.vspk.v6.fetchers.EgressProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GatewaysFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GatewayRedundantPortsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IngressProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IPFilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.IPv6FilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.L2DomainsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MACFilterProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PortsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SAPEgressQoSProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.SAPIngressQoSProfilesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.WANServicesFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VsgRedundantPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "redundancygroup", resourceName = "redundancygroups")
public class RedundancyGroup extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EPermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum EPersonality { DC7X50, HARDWARE_VTEP, NETCONF_7X50, NETCONF_THIRDPARTY_HW_VTEP, NUAGE_210_WBX_32_Q, NUAGE_210_WBX_48_S, OTHER, VDFG, VRSB, VRSG, VSA, VSG };
   public enum ERedundantGatewayStatus { FAILED, SUCCESS };

   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "enterpriseID")
   
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "gatewayPeer1AutodiscoveredGatewayID")
   
   protected String gatewayPeer1AutodiscoveredGatewayID;
   
   @JsonProperty(value = "gatewayPeer1Connected")
   
   protected Boolean gatewayPeer1Connected;
   
   @JsonProperty(value = "gatewayPeer1ID")
   
   protected String gatewayPeer1ID;
   
   @JsonProperty(value = "gatewayPeer1Name")
   
   protected String gatewayPeer1Name;
   
   @JsonProperty(value = "gatewayPeer2AutodiscoveredGatewayID")
   
   protected String gatewayPeer2AutodiscoveredGatewayID;
   
   @JsonProperty(value = "gatewayPeer2Connected")
   
   protected Boolean gatewayPeer2Connected;
   
   @JsonProperty(value = "gatewayPeer2ID")
   
   protected String gatewayPeer2ID;
   
   @JsonProperty(value = "gatewayPeer2Name")
   
   protected String gatewayPeer2Name;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "permittedAction")
   
   protected EPermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   
   protected EPersonality personality;
   
   @JsonProperty(value = "redundantGatewayStatus")
   
   protected ERedundantGatewayStatus redundantGatewayStatus;
   
   @JsonProperty(value = "vtep")
   
   protected String vtep;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private DeploymentFailuresFetcher deploymentFailures;
   
   @JsonIgnore
   private EgressProfilesFetcher egressProfiles;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GatewaysFetcher gateways;
   
   @JsonIgnore
   private GatewayRedundantPortsFetcher gatewayRedundantPorts;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
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
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private PortsFetcher ports;
   
   @JsonIgnore
   private SAPEgressQoSProfilesFetcher sAPEgressQoSProfiles;
   
   @JsonIgnore
   private SAPIngressQoSProfilesFetcher sAPIngressQoSProfiles;
   
   @JsonIgnore
   private WANServicesFetcher wANServices;
   
   @JsonIgnore
   private VsgRedundantPortsFetcher vsgRedundantPorts;
   

   public RedundancyGroup() {
      
      alarms = new AlarmsFetcher(this);
      
      deploymentFailures = new DeploymentFailuresFetcher(this);
      
      egressProfiles = new EgressProfilesFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      gateways = new GatewaysFetcher(this);
      
      gatewayRedundantPorts = new GatewayRedundantPortsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      ingressProfiles = new IngressProfilesFetcher(this);
      
      iPFilterProfiles = new IPFilterProfilesFetcher(this);
      
      iPv6FilterProfiles = new IPv6FilterProfilesFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      l2Domains = new L2DomainsFetcher(this);
      
      mACFilterProfiles = new MACFilterProfilesFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      ports = new PortsFetcher(this);
      
      sAPEgressQoSProfiles = new SAPEgressQoSProfilesFetcher(this);
      
      sAPIngressQoSProfiles = new SAPIngressQoSProfilesFetcher(this);
      
      wANServices = new WANServicesFetcher(this);
      
      vsgRedundantPorts = new VsgRedundantPortsFetcher(this);
      
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
   public String getGatewayPeer1AutodiscoveredGatewayID() {
      return gatewayPeer1AutodiscoveredGatewayID;
   }

   @JsonIgnore
   public void setGatewayPeer1AutodiscoveredGatewayID(String value) { 
      this.gatewayPeer1AutodiscoveredGatewayID = value;
   }
   
   
   @JsonIgnore
   public Boolean getGatewayPeer1Connected() {
      return gatewayPeer1Connected;
   }

   @JsonIgnore
   public void setGatewayPeer1Connected(Boolean value) { 
      this.gatewayPeer1Connected = value;
   }
   
   
   @JsonIgnore
   public String getGatewayPeer1ID() {
      return gatewayPeer1ID;
   }

   @JsonIgnore
   public void setGatewayPeer1ID(String value) { 
      this.gatewayPeer1ID = value;
   }
   
   
   @JsonIgnore
   public String getGatewayPeer1Name() {
      return gatewayPeer1Name;
   }

   @JsonIgnore
   public void setGatewayPeer1Name(String value) { 
      this.gatewayPeer1Name = value;
   }
   
   
   @JsonIgnore
   public String getGatewayPeer2AutodiscoveredGatewayID() {
      return gatewayPeer2AutodiscoveredGatewayID;
   }

   @JsonIgnore
   public void setGatewayPeer2AutodiscoveredGatewayID(String value) { 
      this.gatewayPeer2AutodiscoveredGatewayID = value;
   }
   
   
   @JsonIgnore
   public Boolean getGatewayPeer2Connected() {
      return gatewayPeer2Connected;
   }

   @JsonIgnore
   public void setGatewayPeer2Connected(Boolean value) { 
      this.gatewayPeer2Connected = value;
   }
   
   
   @JsonIgnore
   public String getGatewayPeer2ID() {
      return gatewayPeer2ID;
   }

   @JsonIgnore
   public void setGatewayPeer2ID(String value) { 
      this.gatewayPeer2ID = value;
   }
   
   
   @JsonIgnore
   public String getGatewayPeer2Name() {
      return gatewayPeer2Name;
   }

   @JsonIgnore
   public void setGatewayPeer2Name(String value) { 
      this.gatewayPeer2Name = value;
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
   public EPermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(EPermittedAction value) { 
      this.permittedAction = value;
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
   public ERedundantGatewayStatus getRedundantGatewayStatus() {
      return redundantGatewayStatus;
   }

   @JsonIgnore
   public void setRedundantGatewayStatus(ERedundantGatewayStatus value) { 
      this.redundantGatewayStatus = value;
   }
   
   
   @JsonIgnore
   public String getVtep() {
      return vtep;
   }

   @JsonIgnore
   public void setVtep(String value) { 
      this.vtep = value;
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
   public EgressProfilesFetcher getEgressProfiles() {
      return egressProfiles;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public GatewaysFetcher getGateways() {
      return gateways;
   }
   
   @JsonIgnore
   public GatewayRedundantPortsFetcher getGatewayRedundantPorts() {
      return gatewayRedundantPorts;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public PortsFetcher getPorts() {
      return ports;
   }
   
   @JsonIgnore
   public SAPEgressQoSProfilesFetcher getSAPEgressQoSProfiles() {
      return sAPEgressQoSProfiles;
   }
   
   @JsonIgnore
   public SAPIngressQoSProfilesFetcher getSAPIngressQoSProfiles() {
      return sAPIngressQoSProfiles;
   }
   
   @JsonIgnore
   public WANServicesFetcher getWANServices() {
      return wANServices;
   }
   
   @JsonIgnore
   public VsgRedundantPortsFetcher getVsgRedundantPorts() {
      return vsgRedundantPorts;
   }
   

   public String toString() {
      return "RedundancyGroup [" + "description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayPeer1AutodiscoveredGatewayID=" + gatewayPeer1AutodiscoveredGatewayID + ", gatewayPeer1Connected=" + gatewayPeer1Connected + ", gatewayPeer1ID=" + gatewayPeer1ID + ", gatewayPeer1Name=" + gatewayPeer1Name + ", gatewayPeer2AutodiscoveredGatewayID=" + gatewayPeer2AutodiscoveredGatewayID + ", gatewayPeer2Connected=" + gatewayPeer2Connected + ", gatewayPeer2ID=" + gatewayPeer2ID + ", gatewayPeer2Name=" + gatewayPeer2Name + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", personality=" + personality + ", redundantGatewayStatus=" + redundantGatewayStatus + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}