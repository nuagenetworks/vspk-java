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

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vnfinterface", resourceName = "vnfinterfaces")
public class VNFInterface extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum AttachedNetworkType { L2DOMAIN, SUBNET };

   
   @JsonProperty(value = "IPAddress")
   protected String IPAddress;
   
   @JsonProperty(value = "MAC")
   protected String MAC;
   
   @JsonProperty(value = "VNFUUID")
   protected String VNFUUID;
   
   @JsonProperty(value = "VPortID")
   protected String VPortID;
   
   @JsonProperty(value = "VPortName")
   protected String VPortName;
   
   @JsonProperty(value = "attachedNetworkID")
   protected String attachedNetworkID;
   
   @JsonProperty(value = "attachedNetworkType")
   protected AttachedNetworkType attachedNetworkType;
   
   @JsonProperty(value = "domainID")
   protected String domainID;
   
   @JsonProperty(value = "domainName")
   protected String domainName;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "isManagementInterface")
   protected Boolean isManagementInterface;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "networkName")
   protected String networkName;
   
   @JsonProperty(value = "policyDecisionID")
   protected String policyDecisionID;
   
   @JsonProperty(value = "zoneID")
   protected String zoneID;
   
   @JsonProperty(value = "zoneName")
   protected String zoneName;
   

   

   public VNFInterface() {
      
   }

   
   @JsonIgnore
   public String getIPAddress() {
      return IPAddress;
   }

   @JsonIgnore
   public void setIPAddress(String value) { 
      this.IPAddress = value;
   }
   
   @JsonIgnore
   public String getMAC() {
      return MAC;
   }

   @JsonIgnore
   public void setMAC(String value) { 
      this.MAC = value;
   }
   
   @JsonIgnore
   public String getVNFUUID() {
      return VNFUUID;
   }

   @JsonIgnore
   public void setVNFUUID(String value) { 
      this.VNFUUID = value;
   }
   
   @JsonIgnore
   public String getVPortID() {
      return VPortID;
   }

   @JsonIgnore
   public void setVPortID(String value) { 
      this.VPortID = value;
   }
   
   @JsonIgnore
   public String getVPortName() {
      return VPortName;
   }

   @JsonIgnore
   public void setVPortName(String value) { 
      this.VPortName = value;
   }
   
   @JsonIgnore
   public String getAttachedNetworkID() {
      return attachedNetworkID;
   }

   @JsonIgnore
   public void setAttachedNetworkID(String value) { 
      this.attachedNetworkID = value;
   }
   
   @JsonIgnore
   public AttachedNetworkType getAttachedNetworkType() {
      return attachedNetworkType;
   }

   @JsonIgnore
   public void setAttachedNetworkType(AttachedNetworkType value) { 
      this.attachedNetworkType = value;
   }
   
   @JsonIgnore
   public String getDomainID() {
      return domainID;
   }

   @JsonIgnore
   public void setDomainID(String value) { 
      this.domainID = value;
   }
   
   @JsonIgnore
   public String getDomainName() {
      return domainName;
   }

   @JsonIgnore
   public void setDomainName(String value) { 
      this.domainName = value;
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
   public Boolean getIsManagementInterface() {
      return isManagementInterface;
   }

   @JsonIgnore
   public void setIsManagementInterface(Boolean value) { 
      this.isManagementInterface = value;
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
   public String getNetworkName() {
      return networkName;
   }

   @JsonIgnore
   public void setNetworkName(String value) { 
      this.networkName = value;
   }
   
   @JsonIgnore
   public String getPolicyDecisionID() {
      return policyDecisionID;
   }

   @JsonIgnore
   public void setPolicyDecisionID(String value) { 
      this.policyDecisionID = value;
   }
   
   @JsonIgnore
   public String getZoneID() {
      return zoneID;
   }

   @JsonIgnore
   public void setZoneID(String value) { 
      this.zoneID = value;
   }
   
   @JsonIgnore
   public String getZoneName() {
      return zoneName;
   }

   @JsonIgnore
   public void setZoneName(String value) { 
      this.zoneName = value;
   }
   

   

   public String toString() {
      return "VNFInterface [" + "IPAddress=" + IPAddress + ", MAC=" + MAC + ", VNFUUID=" + VNFUUID + ", VPortID=" + VPortID + ", VPortName=" + VPortName + ", attachedNetworkID=" + attachedNetworkID + ", attachedNetworkType=" + attachedNetworkType + ", domainID=" + domainID + ", domainName=" + domainName + ", gateway=" + gateway + ", isManagementInterface=" + isManagementInterface + ", name=" + name + ", netmask=" + netmask + ", networkName=" + networkName + ", policyDecisionID=" + policyDecisionID + ", zoneID=" + zoneID + ", zoneName=" + zoneName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}