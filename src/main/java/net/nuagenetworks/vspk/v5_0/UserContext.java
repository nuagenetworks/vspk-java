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
@RestEntity(restName = "usercontext", resourceName = "usercontexts")
public class UserContext extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "AARFlowStatsInterval")
   protected Long AARFlowStatsInterval;
   
   @JsonProperty(value = "AARProbeStatsInterval")
   protected Long AARProbeStatsInterval;
   
   @JsonProperty(value = "VSSStatsInterval")
   protected Long VSSStatsInterval;
   
   @JsonProperty(value = "flowCollectionEnabled")
   protected Boolean flowCollectionEnabled;
   
   @JsonProperty(value = "statisticsEnabled")
   protected Boolean statisticsEnabled;
   
   @JsonProperty(value = "statsTSDBServerAddress")
   protected String statsTSDBServerAddress;
   

   

   public UserContext() {
      
   }

   
   @JsonIgnore
   public Long getAARFlowStatsInterval() {
      return AARFlowStatsInterval;
   }

   @JsonIgnore
   public void setAARFlowStatsInterval(Long value) { 
      this.AARFlowStatsInterval = value;
   }
   
   @JsonIgnore
   public Long getAARProbeStatsInterval() {
      return AARProbeStatsInterval;
   }

   @JsonIgnore
   public void setAARProbeStatsInterval(Long value) { 
      this.AARProbeStatsInterval = value;
   }
   
   @JsonIgnore
   public Long getVSSStatsInterval() {
      return VSSStatsInterval;
   }

   @JsonIgnore
   public void setVSSStatsInterval(Long value) { 
      this.VSSStatsInterval = value;
   }
   
   @JsonIgnore
   public Boolean getFlowCollectionEnabled() {
      return flowCollectionEnabled;
   }

   @JsonIgnore
   public void setFlowCollectionEnabled(Boolean value) { 
      this.flowCollectionEnabled = value;
   }
   
   @JsonIgnore
   public Boolean getStatisticsEnabled() {
      return statisticsEnabled;
   }

   @JsonIgnore
   public void setStatisticsEnabled(Boolean value) { 
      this.statisticsEnabled = value;
   }
   
   @JsonIgnore
   public String getStatsTSDBServerAddress() {
      return statsTSDBServerAddress;
   }

   @JsonIgnore
   public void setStatsTSDBServerAddress(String value) { 
      this.statsTSDBServerAddress = value;
   }
   

   

   public String toString() {
      return "UserContext [" + "AARFlowStatsInterval=" + AARFlowStatsInterval + ", AARProbeStatsInterval=" + AARProbeStatsInterval + ", VSSStatsInterval=" + VSSStatsInterval + ", flowCollectionEnabled=" + flowCollectionEnabled + ", statisticsEnabled=" + statisticsEnabled + ", statsTSDBServerAddress=" + statsTSDBServerAddress + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}