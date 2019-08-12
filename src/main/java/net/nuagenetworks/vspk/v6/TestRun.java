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


import net.nuagenetworks.vspk.v6.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v6.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "testrun", resourceName = "testruns")
public class TestRun extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EOperationStatus { COMPLETED, FAILED, STARTED, TIMED_OUT, UNKNOWN };

   
   @JsonProperty(value = "associatedTestID")
   
   protected String associatedTestID;
   
   @JsonProperty(value = "associatedTestSuiteRunID")
   
   protected String associatedTestSuiteRunID;
   
   @JsonProperty(value = "command")
   
   protected String command;
   
   @JsonProperty(value = "commandExitCode")
   
   protected Long commandExitCode;
   
   @JsonProperty(value = "commandOutput")
   
   protected String commandOutput;
   
   @JsonProperty(value = "commandOutputSummary")
   
   protected String commandOutputSummary;
   
   @JsonProperty(value = "duration")
   
   protected Long duration;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "operationStatus")
   
   protected EOperationStatus operationStatus;
   
   @JsonProperty(value = "startDateTime")
   
   protected Long startDateTime;
   
   @JsonProperty(value = "stopDateTime")
   
   protected Long stopDateTime;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public TestRun() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssociatedTestID() {
      return associatedTestID;
   }

   @JsonIgnore
   public void setAssociatedTestID(String value) { 
      this.associatedTestID = value;
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
   public String getCommand() {
      return command;
   }

   @JsonIgnore
   public void setCommand(String value) { 
      this.command = value;
   }
   
   
   @JsonIgnore
   public Long getCommandExitCode() {
      return commandExitCode;
   }

   @JsonIgnore
   public void setCommandExitCode(Long value) { 
      this.commandExitCode = value;
   }
   
   
   @JsonIgnore
   public String getCommandOutput() {
      return commandOutput;
   }

   @JsonIgnore
   public void setCommandOutput(String value) { 
      this.commandOutput = value;
   }
   
   
   @JsonIgnore
   public String getCommandOutputSummary() {
      return commandOutputSummary;
   }

   @JsonIgnore
   public void setCommandOutputSummary(String value) { 
      this.commandOutputSummary = value;
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
   public EOperationStatus getOperationStatus() {
      return operationStatus;
   }

   @JsonIgnore
   public void setOperationStatus(EOperationStatus value) { 
      this.operationStatus = value;
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
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "TestRun [" + "associatedTestID=" + associatedTestID + ", associatedTestSuiteRunID=" + associatedTestSuiteRunID + ", command=" + command + ", commandExitCode=" + commandExitCode + ", commandOutput=" + commandOutput + ", commandOutputSummary=" + commandOutputSummary + ", duration=" + duration + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", operationStatus=" + operationStatus + ", startDateTime=" + startDateTime + ", stopDateTime=" + stopDateTime + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}