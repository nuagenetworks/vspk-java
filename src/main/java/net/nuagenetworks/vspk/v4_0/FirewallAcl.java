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


import net.nuagenetworks.vspk.v4_0.fetchers.FirewallRulesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DomainsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "firewallacl", resourceName = "firewallacls")
public class FirewallAcl extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "active")
   protected Boolean active;
   
   @JsonProperty(value = "defaultAllowIP")
   protected Boolean defaultAllowIP;
   
   @JsonProperty(value = "defaultAllowNonIP")
   protected Boolean defaultAllowNonIP;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "ruleIds")
   protected java.util.List<String> ruleIds;
   

   
   @JsonIgnore
   private FirewallRulesFetcher firewallRules;
   
   @JsonIgnore
   private DomainsFetcher domains;
   

   public FirewallAcl() {
      
      firewallRules = new FirewallRulesFetcher(this);
      
      domains = new DomainsFetcher(this);
      
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
   public Boolean getActive() {
      return active;
   }

   @JsonIgnore
   public void setActive(Boolean value) { 
      this.active = value;
   }
   @JsonIgnore
   public Boolean getDefaultAllowIP() {
      return defaultAllowIP;
   }

   @JsonIgnore
   public void setDefaultAllowIP(Boolean value) { 
      this.defaultAllowIP = value;
   }
   @JsonIgnore
   public Boolean getDefaultAllowNonIP() {
      return defaultAllowNonIP;
   }

   @JsonIgnore
   public void setDefaultAllowNonIP(Boolean value) { 
      this.defaultAllowNonIP = value;
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
   public java.util.List<String> getRuleIds() {
      return ruleIds;
   }

   @JsonIgnore
   public void setRuleIds(java.util.List<String> value) { 
      this.ruleIds = value;
   }
   

   
   @JsonIgnore
   public FirewallRulesFetcher getFirewallRules() {
      return firewallRules;
   }
   
   @JsonIgnore
   public DomainsFetcher getDomains() {
      return domains;
   }
   

   public String toString() {
      return "FirewallAcl [" + "name=" + name + ", active=" + active + ", defaultAllowIP=" + defaultAllowIP + ", defaultAllowNonIP=" + defaultAllowNonIP + ", description=" + description + ", ruleIds=" + ruleIds + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}