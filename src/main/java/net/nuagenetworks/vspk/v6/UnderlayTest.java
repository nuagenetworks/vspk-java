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


import net.nuagenetworks.vspk.v6.fetchers.TestRunsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "underlaytest", resourceName = "underlaytests")
public class UnderlayTest extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum ETestResult { DEGRADED, FAIL, NOT_APPLICABLE, PASS };
   public enum EUnderlayTestType { BIRTH_CERTIFICATE, ON_DEMAND, PRE_BOOTSTRAP };

   
   @JsonProperty(value = "associatedDataPathID")
   
   protected String associatedDataPathID;
   
   @JsonProperty(value = "associatedNSGatewayID")
   
   protected String associatedNSGatewayID;
   
   @JsonProperty(value = "associatedNSGatewayName")
   
   protected String associatedNSGatewayName;
   
   @JsonProperty(value = "associatedSystemID")
   
   protected String associatedSystemID;
   
   @JsonProperty(value = "associatedTestSuiteRunID")
   
   protected String associatedTestSuiteRunID;
   
   @JsonProperty(value = "associatedUplinkConnectionID")
   
   protected String associatedUplinkConnectionID;
   
   @JsonProperty(value = "associatedUplinkInterface")
   
   protected String associatedUplinkInterface;
   
   @JsonProperty(value = "createOnly")
   
   protected Boolean createOnly;
   
   @JsonProperty(value = "duration")
   
   protected Long duration;
   
   @JsonProperty(value = "name")
   
   protected String name;
   
   @JsonProperty(value = "runBandwidthTest")
   
   protected Boolean runBandwidthTest;
   
   @JsonProperty(value = "runConnectivityTest")
   
   protected Boolean runConnectivityTest;
   
   @JsonProperty(value = "runMTUDiscoveryTest")
   
   protected Boolean runMTUDiscoveryTest;
   
   @JsonProperty(value = "startDateTime")
   
   protected Long startDateTime;
   
   @JsonProperty(value = "stopDateTime")
   
   protected Long stopDateTime;
   
   @JsonProperty(value = "testResult")
   
   protected ETestResult testResult;
   
   @JsonProperty(value = "underlayTestServer")
   
   protected String underlayTestServer;
   
   @JsonProperty(value = "underlayTestType")
   
   protected EUnderlayTestType underlayTestType;
   

   
   @JsonIgnore
   private TestRunsFetcher testRuns;
   

   public UnderlayTest() {
      
      testRuns = new TestRunsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssociatedDataPathID() {
      return associatedDataPathID;
   }

   @JsonIgnore
   public void setAssociatedDataPathID(String value) { 
      this.associatedDataPathID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNSGatewayID() {
      return associatedNSGatewayID;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayID(String value) { 
      this.associatedNSGatewayID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedNSGatewayName() {
      return associatedNSGatewayName;
   }

   @JsonIgnore
   public void setAssociatedNSGatewayName(String value) { 
      this.associatedNSGatewayName = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedSystemID() {
      return associatedSystemID;
   }

   @JsonIgnore
   public void setAssociatedSystemID(String value) { 
      this.associatedSystemID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedTestSuiteRunID() {
      return associatedTestSuiteRunID;
   }

   @JsonIgnore
   public void setAssociatedTestSuiteRunID(String value) { 
      this.associatedTestSuiteRunID = value;
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
   public String getAssociatedUplinkInterface() {
      return associatedUplinkInterface;
   }

   @JsonIgnore
   public void setAssociatedUplinkInterface(String value) { 
      this.associatedUplinkInterface = value;
   }
   
   
   @JsonIgnore
   public Boolean getCreateOnly() {
      return createOnly;
   }

   @JsonIgnore
   public void setCreateOnly(Boolean value) { 
      this.createOnly = value;
   }
   
   
   @JsonIgnore
   public Long getDuration() {
      return duration;
   }

   @JsonIgnore
   public void setDuration(Long value) { 
      this.duration = value;
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
   public Boolean getRunBandwidthTest() {
      return runBandwidthTest;
   }

   @JsonIgnore
   public void setRunBandwidthTest(Boolean value) { 
      this.runBandwidthTest = value;
   }
   
   
   @JsonIgnore
   public Boolean getRunConnectivityTest() {
      return runConnectivityTest;
   }

   @JsonIgnore
   public void setRunConnectivityTest(Boolean value) { 
      this.runConnectivityTest = value;
   }
   
   
   @JsonIgnore
   public Boolean getRunMTUDiscoveryTest() {
      return runMTUDiscoveryTest;
   }

   @JsonIgnore
   public void setRunMTUDiscoveryTest(Boolean value) { 
      this.runMTUDiscoveryTest = value;
   }
   
   
   @JsonIgnore
   public Long getStartDateTime() {
      return startDateTime;
   }

   @JsonIgnore
   public void setStartDateTime(Long value) { 
      this.startDateTime = value;
   }
   
   
   @JsonIgnore
   public Long getStopDateTime() {
      return stopDateTime;
   }

   @JsonIgnore
   public void setStopDateTime(Long value) { 
      this.stopDateTime = value;
   }
   
   
   @JsonIgnore
   public ETestResult getTestResult() {
      return testResult;
   }

   @JsonIgnore
   public void setTestResult(ETestResult value) { 
      this.testResult = value;
   }
   
   
   @JsonIgnore
   public String getUnderlayTestServer() {
      return underlayTestServer;
   }

   @JsonIgnore
   public void setUnderlayTestServer(String value) { 
      this.underlayTestServer = value;
   }
   
   
   @JsonIgnore
   public EUnderlayTestType getUnderlayTestType() {
      return underlayTestType;
   }

   @JsonIgnore
   public void setUnderlayTestType(EUnderlayTestType value) { 
      this.underlayTestType = value;
   }
   

   
   @JsonIgnore
   public TestRunsFetcher getTestRuns() {
      return testRuns;
   }
   

   public String toString() {
      return "UnderlayTest [" + "associatedDataPathID=" + associatedDataPathID + ", associatedNSGatewayID=" + associatedNSGatewayID + ", associatedNSGatewayName=" + associatedNSGatewayName + ", associatedSystemID=" + associatedSystemID + ", associatedTestSuiteRunID=" + associatedTestSuiteRunID + ", associatedUplinkConnectionID=" + associatedUplinkConnectionID + ", associatedUplinkInterface=" + associatedUplinkInterface + ", createOnly=" + createOnly + ", duration=" + duration + ", name=" + name + ", runBandwidthTest=" + runBandwidthTest + ", runConnectivityTest=" + runConnectivityTest + ", runMTUDiscoveryTest=" + runMTUDiscoveryTest + ", startDateTime=" + startDateTime + ", stopDateTime=" + stopDateTime + ", testResult=" + testResult + ", underlayTestServer=" + underlayTestServer + ", underlayTestType=" + underlayTestType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}