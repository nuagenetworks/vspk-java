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


import net.nuagenetworks.vspk.v6.fetchers.IKEGatewayConnectionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "virtualuplink", resourceName = "virtualuplinks")
public class VirtualUplink extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAuxMode { COLD, HOT, NONE };
   public enum EFecEnabled { ACTIVE, DISABLED, PASSIVE };
   public enum ERole { NONE, PRIMARY, SECONDARY, TERTIARY, UNKNOWN };

   
   @JsonProperty(value = "associatedEgressQoSPolicyID")
   
   protected String associatedEgressQoSPolicyID;
   
   @JsonProperty(value = "associatedIngressOverlayQoSPolicerID")
   
   protected String associatedIngressOverlayQoSPolicerID;
   
   @JsonProperty(value = "associatedIngressQoSPolicyID")
   
   protected String associatedIngressQoSPolicyID;
   
   @JsonProperty(value = "associatedIngressUnderlayQoSPolicerID")
   
   protected String associatedIngressUnderlayQoSPolicerID;
   
   @JsonProperty(value = "associatedUplinkConnectionID")
   
   protected String associatedUplinkConnectionID;
   
   @JsonProperty(value = "associatedVSCProfileID")
   
   protected String associatedVSCProfileID;
   
   @JsonProperty(value = "auxMode")
   
   protected EAuxMode auxMode;
   
   @JsonProperty(value = "enableNATProbes")
   
   protected Boolean enableNATProbes;
   
   @JsonProperty(value = "fecEnabled")
   
   protected EFecEnabled fecEnabled;
   
   @JsonProperty(value = "peerEndpoint")
   
   protected String peerEndpoint;
   
   @JsonProperty(value = "peerGatewayID")
   
   protected String peerGatewayID;
   
   @JsonProperty(value = "peerGatewayName")
   
   protected String peerGatewayName;
   
   @JsonProperty(value = "peerGatewaySystemID")
   
   protected String peerGatewaySystemID;
   
   @JsonProperty(value = "peerPortID")
   
   protected String peerPortID;
   
   @JsonProperty(value = "peerUplinkID")
   
   protected Long peerUplinkID;
   
   @JsonProperty(value = "peerVLANID")
   
   protected String peerVLANID;
   
   @JsonProperty(value = "role")
   
   protected ERole role;
   
   @JsonProperty(value = "roleOrder")
   
   protected Long roleOrder;
   
   @JsonProperty(value = "shuntEndpoint")
   
   protected String shuntEndpoint;
   
   @JsonProperty(value = "shuntPortID")
   
   protected String shuntPortID;
   
   @JsonProperty(value = "shuntVLANID")
   
   protected String shuntVLANID;
   
   @JsonProperty(value = "trafficThroughUBROnly")
   
   protected Boolean trafficThroughUBROnly;
   
   @JsonProperty(value = "underlayID")
   
   protected Long underlayID;
   
   @JsonProperty(value = "underlayNAT")
   
   protected Boolean underlayNAT;
   
   @JsonProperty(value = "underlayName")
   
   protected String underlayName;
   
   @JsonProperty(value = "underlayRouting")
   
   protected Boolean underlayRouting;
   
   @JsonProperty(value = "virtualUplinkDatapathID")
   
   protected String virtualUplinkDatapathID;
   

   
   @JsonIgnore
   private IKEGatewayConnectionsFetcher iKEGatewayConnections;
   

   public VirtualUplink() {
      
      iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssociatedEgressQoSPolicyID() {
      return associatedEgressQoSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedEgressQoSPolicyID(String value) { 
      this.associatedEgressQoSPolicyID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIngressOverlayQoSPolicerID() {
      return associatedIngressOverlayQoSPolicerID;
   }

   @JsonIgnore
   public void setAssociatedIngressOverlayQoSPolicerID(String value) { 
      this.associatedIngressOverlayQoSPolicerID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIngressQoSPolicyID() {
      return associatedIngressQoSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedIngressQoSPolicyID(String value) { 
      this.associatedIngressQoSPolicyID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedIngressUnderlayQoSPolicerID() {
      return associatedIngressUnderlayQoSPolicerID;
   }

   @JsonIgnore
   public void setAssociatedIngressUnderlayQoSPolicerID(String value) { 
      this.associatedIngressUnderlayQoSPolicerID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedUplinkConnectionID() {
      return associatedUplinkConnectionID;
   }

   @JsonIgnore
   public void setAssociatedUplinkConnectionID(String value) { 
      this.associatedUplinkConnectionID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedVSCProfileID() {
      return associatedVSCProfileID;
   }

   @JsonIgnore
   public void setAssociatedVSCProfileID(String value) { 
      this.associatedVSCProfileID = value;
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
   public Boolean getEnableNATProbes() {
      return enableNATProbes;
   }

   @JsonIgnore
   public void setEnableNATProbes(Boolean value) { 
      this.enableNATProbes = value;
   }
   
   
   @JsonIgnore
   public EFecEnabled getFecEnabled() {
      return fecEnabled;
   }

   @JsonIgnore
   public void setFecEnabled(EFecEnabled value) { 
      this.fecEnabled = value;
   }
   
   
   @JsonIgnore
   public String getPeerEndpoint() {
      return peerEndpoint;
   }

   @JsonIgnore
   public void setPeerEndpoint(String value) { 
      this.peerEndpoint = value;
   }
   
   
   @JsonIgnore
   public String getPeerGatewayID() {
      return peerGatewayID;
   }

   @JsonIgnore
   public void setPeerGatewayID(String value) { 
      this.peerGatewayID = value;
   }
   
   
   @JsonIgnore
   public String getPeerGatewayName() {
      return peerGatewayName;
   }

   @JsonIgnore
   public void setPeerGatewayName(String value) { 
      this.peerGatewayName = value;
   }
   
   
   @JsonIgnore
   public String getPeerGatewaySystemID() {
      return peerGatewaySystemID;
   }

   @JsonIgnore
   public void setPeerGatewaySystemID(String value) { 
      this.peerGatewaySystemID = value;
   }
   
   
   @JsonIgnore
   public String getPeerPortID() {
      return peerPortID;
   }

   @JsonIgnore
   public void setPeerPortID(String value) { 
      this.peerPortID = value;
   }
   
   
   @JsonIgnore
   public Long getPeerUplinkID() {
      return peerUplinkID;
   }

   @JsonIgnore
   public void setPeerUplinkID(Long value) { 
      this.peerUplinkID = value;
   }
   
   
   @JsonIgnore
   public String getPeerVLANID() {
      return peerVLANID;
   }

   @JsonIgnore
   public void setPeerVLANID(String value) { 
      this.peerVLANID = value;
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
   public String getShuntEndpoint() {
      return shuntEndpoint;
   }

   @JsonIgnore
   public void setShuntEndpoint(String value) { 
      this.shuntEndpoint = value;
   }
   
   
   @JsonIgnore
   public String getShuntPortID() {
      return shuntPortID;
   }

   @JsonIgnore
   public void setShuntPortID(String value) { 
      this.shuntPortID = value;
   }
   
   
   @JsonIgnore
   public String getShuntVLANID() {
      return shuntVLANID;
   }

   @JsonIgnore
   public void setShuntVLANID(String value) { 
      this.shuntVLANID = value;
   }
   
   
   @JsonIgnore
   public Boolean getTrafficThroughUBROnly() {
      return trafficThroughUBROnly;
   }

   @JsonIgnore
   public void setTrafficThroughUBROnly(Boolean value) { 
      this.trafficThroughUBROnly = value;
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
   public Boolean getUnderlayNAT() {
      return underlayNAT;
   }

   @JsonIgnore
   public void setUnderlayNAT(Boolean value) { 
      this.underlayNAT = value;
   }
   
   
   @JsonIgnore
   public String getUnderlayName() {
      return underlayName;
   }

   @JsonIgnore
   public void setUnderlayName(String value) { 
      this.underlayName = value;
   }
   
   
   @JsonIgnore
   public Boolean getUnderlayRouting() {
      return underlayRouting;
   }

   @JsonIgnore
   public void setUnderlayRouting(Boolean value) { 
      this.underlayRouting = value;
   }
   
   
   @JsonIgnore
   public String getVirtualUplinkDatapathID() {
      return virtualUplinkDatapathID;
   }

   @JsonIgnore
   public void setVirtualUplinkDatapathID(String value) { 
      this.virtualUplinkDatapathID = value;
   }
   

   
   @JsonIgnore
   public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
      return iKEGatewayConnections;
   }
   

   public String toString() {
      return "VirtualUplink [" + "associatedEgressQoSPolicyID=" + associatedEgressQoSPolicyID + ", associatedIngressOverlayQoSPolicerID=" + associatedIngressOverlayQoSPolicerID + ", associatedIngressQoSPolicyID=" + associatedIngressQoSPolicyID + ", associatedIngressUnderlayQoSPolicerID=" + associatedIngressUnderlayQoSPolicerID + ", associatedUplinkConnectionID=" + associatedUplinkConnectionID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", auxMode=" + auxMode + ", enableNATProbes=" + enableNATProbes + ", fecEnabled=" + fecEnabled + ", peerEndpoint=" + peerEndpoint + ", peerGatewayID=" + peerGatewayID + ", peerGatewayName=" + peerGatewayName + ", peerGatewaySystemID=" + peerGatewaySystemID + ", peerPortID=" + peerPortID + ", peerUplinkID=" + peerUplinkID + ", peerVLANID=" + peerVLANID + ", role=" + role + ", roleOrder=" + roleOrder + ", shuntEndpoint=" + shuntEndpoint + ", shuntPortID=" + shuntPortID + ", shuntVLANID=" + shuntVLANID + ", trafficThroughUBROnly=" + trafficThroughUBROnly + ", underlayID=" + underlayID + ", underlayNAT=" + underlayNAT + ", underlayName=" + underlayName + ", underlayRouting=" + underlayRouting + ", virtualUplinkDatapathID=" + virtualUplinkDatapathID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}