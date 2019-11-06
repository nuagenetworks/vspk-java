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
import net.nuagenetworks.vspk.v6.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "tca", resourceName = "tcas")
public class TCA extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EAction { Alert, Alert_Add_Policy_Group, Alert_PolicyGroupChange };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EMetric { ACL_DENY_EVENT_COUNT, ANTI_SPOOF_EVENT_COUNT, BYTES_IN, BYTES_OUT, FIP_PRE_RATE_LIMIT_BYTES, FIP_PRE_RATE_LIMIT_PACKETS, FIP_RATE_LIMIT_DROPPED_BYTES, FIP_RATE_LIMIT_DROPPED_PACKETS, L7_BYTES_IN, L7_BYTES_OUT, L7_PACKETS_IN, L7_PACKETS_OUT, PACKETS_DROPPED_BY_RATE_LIMIT, PACKETS_IN, PACKETS_IN_DROPPED, PACKETS_IN_ERROR, PACKETS_OUT, PACKETS_OUT_DROPPED, PACKETS_OUT_ERROR, PORT_SCAN_PORT_COUNT, PORT_SWEEP_IP_COUNT, TCP_FLAG_ACK_IN, TCP_FLAG_ACK_OUT, TCP_FLAG_NULL_IN, TCP_FLAG_NULL_OUT, TCP_FLAG_RST_IN, TCP_FLAG_RST_OUT, TCP_FLAG_SYN_IN, TCP_FLAG_SYN_OUT };
   public enum EType { BREACH, ROLLING_AVERAGE, UNIQUE_COUNT };

   
   @JsonProperty(value = "URLEndPoint")
   
   protected String URLEndPoint;
   
   @JsonProperty(value = "action")
   
   protected EAction action;
   
   @JsonProperty(value = "count")
   
   protected Long count;
   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "disable")
   
   protected Boolean disable;
   
   @JsonProperty(value = "displayStatus")
   
   protected String displayStatus;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "metric")
   
   protected EMetric metric;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "period")
   
   protected Long period;
   
   @JsonProperty(value = "status")
   
   protected Boolean status;
   
   @JsonProperty(value = "targetPolicyGroupID")
   
   protected String targetPolicyGroupID;
   
   @JsonProperty(value = "threshold")
   
   protected Long threshold;
   
   @JsonProperty(value = "throttleTime")
   
   protected Long throttleTime;
   
   @JsonProperty(value = "type")
   
   protected EType type;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public TCA() {
      metric = EMetric.BYTES_IN;
      type = EType.ROLLING_AVERAGE;
      
      alarms = new AlarmsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getURLEndPoint() {
      return URLEndPoint;
   }

   @JsonIgnore
   public void setURLEndPoint(String value) { 
      this.URLEndPoint = value;
   }
   
   
   @JsonIgnore
   public EAction getAction() {
      return action;
   }

   @JsonIgnore
   public void setAction(EAction value) { 
      this.action = value;
   }
   
   
   @JsonIgnore
   public Long getCount() {
      return count;
   }

   @JsonIgnore
   public void setCount(Long value) { 
      this.count = value;
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
   public Boolean getDisable() {
      return disable;
   }

   @JsonIgnore
   public void setDisable(Boolean value) { 
      this.disable = value;
   }
   
   
   @JsonIgnore
   public String getDisplayStatus() {
      return displayStatus;
   }

   @JsonIgnore
   public void setDisplayStatus(String value) { 
      this.displayStatus = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   
   
   @JsonIgnore
   public EMetric getMetric() {
      return metric;
   }

   @JsonIgnore
   public void setMetric(EMetric value) { 
      this.metric = value;
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
   public Long getPeriod() {
      return period;
   }

   @JsonIgnore
   public void setPeriod(Long value) { 
      this.period = value;
   }
   
   
   @JsonIgnore
   public Boolean getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(Boolean value) { 
      this.status = value;
   }
   
   
   @JsonIgnore
   public String getTargetPolicyGroupID() {
      return targetPolicyGroupID;
   }

   @JsonIgnore
   public void setTargetPolicyGroupID(String value) { 
      this.targetPolicyGroupID = value;
   }
   
   
   @JsonIgnore
   public Long getThreshold() {
      return threshold;
   }

   @JsonIgnore
   public void setThreshold(Long value) { 
      this.threshold = value;
   }
   
   
   @JsonIgnore
   public Long getThrottleTime() {
      return throttleTime;
   }

   @JsonIgnore
   public void setThrottleTime(Long value) { 
      this.throttleTime = value;
   }
   
   
   @JsonIgnore
   public EType getType() {
      return type;
   }

   @JsonIgnore
   public void setType(EType value) { 
      this.type = value;
   }
   

   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "TCA [" + "URLEndPoint=" + URLEndPoint + ", action=" + action + ", count=" + count + ", description=" + description + ", disable=" + disable + ", displayStatus=" + displayStatus + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", metric=" + metric + ", name=" + name + ", period=" + period + ", status=" + status + ", targetPolicyGroupID=" + targetPolicyGroupID + ", threshold=" + threshold + ", throttleTime=" + throttleTime + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}