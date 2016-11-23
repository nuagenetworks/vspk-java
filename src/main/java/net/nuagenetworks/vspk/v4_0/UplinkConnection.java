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


import net.nuagenetworks.vspk.v4_0.fetchers.UnderlaysFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "uplinkconnection", resourceName = "uplinkconnections")
public class UplinkConnection extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum Address { IPv4, IPv6 };
   public enum AdvertisementCriteria { CONTROL_SESSION, GATEWAY_PING, OPERATIONAL_LINK };
   public enum Mode { Any, Dynamic, PPPoE, Static };
   public enum Role { NONE, PRIMARY, SECONDARY, TERTIARY, UNKNOWN };

   
   @JsonProperty(value = "DNSAddress")
   protected String DNSAddress;
   
   @JsonProperty(value = "password")
   protected String password;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "address")
   protected Address address;
   
   @JsonProperty(value = "advertisementCriteria")
   protected AdvertisementCriteria advertisementCriteria;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "mode")
   protected Mode mode;
   
   @JsonProperty(value = "role")
   protected Role role;
   
   @JsonProperty(value = "uplinkID")
   protected String uplinkID;
   
   @JsonProperty(value = "username")
   protected String username;
   
   @JsonProperty(value = "assocUnderlayID")
   protected String assocUnderlayID;
   
   @JsonProperty(value = "associatedVSCProfileID")
   protected String associatedVSCProfileID;
   

   
   @JsonIgnore
   private UnderlaysFetcher underlays;
   

   public UplinkConnection() {
      
      underlays = new UnderlaysFetcher(this);
      
   }

   @JsonIgnore
   public String getDNSAddress() {
      return DNSAddress;
   }

   @JsonIgnore
   public void setDNSAddress(String value) { 
      this.DNSAddress = value;
   }
   @JsonIgnore
   public String getPassword() {
      return password;
   }

   @JsonIgnore
   public void setPassword(String value) { 
      this.password = value;
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
   public Address getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(Address value) { 
      this.address = value;
   }
   @JsonIgnore
   public AdvertisementCriteria getAdvertisementCriteria() {
      return advertisementCriteria;
   }

   @JsonIgnore
   public void setAdvertisementCriteria(AdvertisementCriteria value) { 
      this.advertisementCriteria = value;
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
   public Mode getMode() {
      return mode;
   }

   @JsonIgnore
   public void setMode(Mode value) { 
      this.mode = value;
   }
   @JsonIgnore
   public Role getRole() {
      return role;
   }

   @JsonIgnore
   public void setRole(Role value) { 
      this.role = value;
   }
   @JsonIgnore
   public String getUplinkID() {
      return uplinkID;
   }

   @JsonIgnore
   public void setUplinkID(String value) { 
      this.uplinkID = value;
   }
   @JsonIgnore
   public String getUsername() {
      return username;
   }

   @JsonIgnore
   public void setUsername(String value) { 
      this.username = value;
   }
   @JsonIgnore
   public String getAssocUnderlayID() {
      return assocUnderlayID;
   }

   @JsonIgnore
   public void setAssocUnderlayID(String value) { 
      this.assocUnderlayID = value;
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
   public UnderlaysFetcher getUnderlays() {
      return underlays;
   }
   

   public String toString() {
      return "UplinkConnection [" + "DNSAddress=" + DNSAddress + ", password=" + password + ", gateway=" + gateway + ", address=" + address + ", advertisementCriteria=" + advertisementCriteria + ", netmask=" + netmask + ", mode=" + mode + ", role=" + role + ", uplinkID=" + uplinkID + ", username=" + username + ", assocUnderlayID=" + assocUnderlayID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}