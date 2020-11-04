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
import net.nuagenetworks.vspk.v6.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.VLANsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ethernetsegmentgroup", resourceName = "ethernetsegmentgroups")
public class EthernetSegmentGroup extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EPortType { ACCESS };

   
   @JsonProperty(value = "VLANRange")
   
   protected String VLANRange;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "ethernetSegmentID")
   
   protected String ethernetSegmentID;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "portType")
   
   protected EPortType portType;
   
   @JsonProperty(value = "virtual")
   
   protected Boolean virtual;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private VLANsFetcher vLANs;
   

   public EthernetSegmentGroup() {
      
      alarms = new AlarmsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      vLANs = new VLANsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getVLANRange() {
      return VLANRange;
   }

   @JsonIgnore
   public void setVLANRange(String value) { 
      this.VLANRange = value;
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
   public String getEthernetSegmentID() {
      return ethernetSegmentID;
   }

   @JsonIgnore
   public void setEthernetSegmentID(String value) { 
      this.ethernetSegmentID = value;
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
   public EPortType getPortType() {
      return portType;
   }

   @JsonIgnore
   public void setPortType(EPortType value) { 
      this.portType = value;
   }
   
   
   @JsonIgnore
   public Boolean getVirtual() {
      return virtual;
   }

   @JsonIgnore
   public void setVirtual(Boolean value) { 
      this.virtual = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public VLANsFetcher getVLANs() {
      return vLANs;
   }
   

   public String toString() {
      return "EthernetSegmentGroup [" + "VLANRange=" + VLANRange + ", description=" + description + ", ethernetSegmentID=" + ethernetSegmentID + ", name=" + name + ", portType=" + portType + ", virtual=" + virtual + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}