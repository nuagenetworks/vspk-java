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


import net.nuagenetworks.vspk.v6.fetchers.ScheduledtestsuiterunsFetcher;
import net.nuagenetworks.vspk.v6.fetchers.TestsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "scheduledtestsuite", resourceName = "scheduledtestsuites")
public class ScheduledTestSuite extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EScheduleIntervalUnits { DAYS, HOURS, MINUTES, MONTHS };

   
   @JsonProperty(value = "description")
   
   protected String description;
   
   @JsonProperty(value = "endDateTime")
   
   protected Float endDateTime;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "scheduleInterval")
   
   protected Long scheduleInterval;
   
   @JsonProperty(value = "scheduleIntervalUnits")
   
   protected EScheduleIntervalUnits scheduleIntervalUnits;
   
   @JsonProperty(value = "startDateTime")
   
   protected Float startDateTime;
   

   
   @JsonIgnore
   private ScheduledtestsuiterunsFetcher scheduledtestsuiteruns;
   
   @JsonIgnore
   private TestsFetcher tests;
   

   public ScheduledTestSuite() {
      
      scheduledtestsuiteruns = new ScheduledtestsuiterunsFetcher(this);
      
      tests = new TestsFetcher(this);
      
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
   public Float getEndDateTime() {
      return endDateTime;
   }

   @JsonIgnore
   public void setEndDateTime(Float value) { 
      this.endDateTime = value;
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
   public Long getScheduleInterval() {
      return scheduleInterval;
   }

   @JsonIgnore
   public void setScheduleInterval(Long value) { 
      this.scheduleInterval = value;
   }
   
   
   @JsonIgnore
   public EScheduleIntervalUnits getScheduleIntervalUnits() {
      return scheduleIntervalUnits;
   }

   @JsonIgnore
   public void setScheduleIntervalUnits(EScheduleIntervalUnits value) { 
      this.scheduleIntervalUnits = value;
   }
   
   
   @JsonIgnore
   public Float getStartDateTime() {
      return startDateTime;
   }

   @JsonIgnore
   public void setStartDateTime(Float value) { 
      this.startDateTime = value;
   }
   

   
   @JsonIgnore
   public ScheduledtestsuiterunsFetcher getScheduledtestsuiteruns() {
      return scheduledtestsuiteruns;
   }
   
   @JsonIgnore
   public TestsFetcher getTests() {
      return tests;
   }
   

   public String toString() {
      return "ScheduledTestSuite [" + "description=" + description + ", endDateTime=" + endDateTime + ", name=" + name + ", scheduleInterval=" + scheduleInterval + ", scheduleIntervalUnits=" + scheduleIntervalUnits + ", startDateTime=" + startDateTime + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}