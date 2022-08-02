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
import net.nuagenetworks.vspk.v6.fetchers.TestRunsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "scheduledtestsuiterun", resourceName = "scheduledtestsuiteruns")
public class Scheduledtestsuiterun extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EOperationStatus { RUNNING, STARTED, UNKNOWN };

   
   @JsonProperty(value = "NSGatewayName")
   
   protected String NSGatewayName;
   
   @JsonProperty(value = "VPortName")
   
   protected String VPortName;
   
   @JsonProperty(value = "associatedScheduledTestSuiteID")
   
   protected String associatedScheduledTestSuiteID;
   
   @JsonProperty(value = "associatedScheduledTestSuiteName")
   
   protected String associatedScheduledTestSuiteName;
   
   @JsonProperty(value = "creationDate")
   
   protected String creationDate;
   
   @JsonProperty(value = "datapathID")
   
   protected String datapathID;
   
   @JsonProperty(value = "destination")
   
   protected String destination;
   
   @JsonProperty(value = "domainName")
   
   protected String domainName;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastUpdatedDate")
   
   protected String lastUpdatedDate;
   
   @JsonProperty(value = "macAddress")
   
   protected String macAddress;
   
   @JsonProperty(value = "operationStatus")
   
   protected EOperationStatus operationStatus;
   
   @JsonProperty(value = "owner")
   
   protected String owner;
   
   @JsonProperty(value = "secondaryDatapathID")
   
   protected String secondaryDatapathID;
   
   @JsonProperty(value = "secondaryNSGatewayName")
   
   protected String secondaryNSGatewayName;
   
   @JsonProperty(value = "secondarySystemID")
   
   protected String secondarySystemID;
   
   @JsonProperty(value = "sourceIP")
   
   protected String sourceIP;
   
   @JsonProperty(value = "subnetName")
   
   protected String subnetName;
   
   @JsonProperty(value = "systemID")
   
   protected String systemID;
   
   @JsonProperty(value = "vlanID")
   
   protected Long vlanID;
   
   @JsonProperty(value = "vportPortName")
   
   protected String vportPortName;
   
   @JsonProperty(value = "vportVlanID")
   
   protected Long vportVlanID;
   
   @JsonProperty(value = "zoneName")
   
   protected String zoneName;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private TestRunsFetcher testRuns;
   

   public Scheduledtestsuiterun() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      testRuns = new TestRunsFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getNSGatewayName() {
      return NSGatewayName;
   }

   @JsonIgnore
   public void setNSGatewayName(String value) { 
      this.NSGatewayName = value;
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
   public String getAssociatedScheduledTestSuiteID() {
      return associatedScheduledTestSuiteID;
   }

   @JsonIgnore
   public void setAssociatedScheduledTestSuiteID(String value) { 
      this.associatedScheduledTestSuiteID = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedScheduledTestSuiteName() {
      return associatedScheduledTestSuiteName;
   }

   @JsonIgnore
   public void setAssociatedScheduledTestSuiteName(String value) { 
      this.associatedScheduledTestSuiteName = value;
   }
   
   
   @JsonIgnore
   public String getCreationDate() {
      return creationDate;
   }

   @JsonIgnore
   public void setCreationDate(String value) { 
      this.creationDate = value;
   }
   
   
   @JsonIgnore
   public String getDatapathID() {
      return datapathID;
   }

   @JsonIgnore
   public void setDatapathID(String value) { 
      this.datapathID = value;
   }
   
   
   @JsonIgnore
   public String getDestination() {
      return destination;
   }

   @JsonIgnore
   public void setDestination(String value) { 
      this.destination = value;
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
   public String getLastUpdatedDate() {
      return lastUpdatedDate;
   }

   @JsonIgnore
   public void setLastUpdatedDate(String value) { 
      this.lastUpdatedDate = value;
   }
   
   
   @JsonIgnore
   public String getMacAddress() {
      return macAddress;
   }

   @JsonIgnore
   public void setMacAddress(String value) { 
      this.macAddress = value;
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
   public String getOwner() {
      return owner;
   }

   @JsonIgnore
   public void setOwner(String value) { 
      this.owner = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryDatapathID() {
      return secondaryDatapathID;
   }

   @JsonIgnore
   public void setSecondaryDatapathID(String value) { 
      this.secondaryDatapathID = value;
   }
   
   
   @JsonIgnore
   public String getSecondaryNSGatewayName() {
      return secondaryNSGatewayName;
   }

   @JsonIgnore
   public void setSecondaryNSGatewayName(String value) { 
      this.secondaryNSGatewayName = value;
   }
   
   
   @JsonIgnore
   public String getSecondarySystemID() {
      return secondarySystemID;
   }

   @JsonIgnore
   public void setSecondarySystemID(String value) { 
      this.secondarySystemID = value;
   }
   
   
   @JsonIgnore
   public String getSourceIP() {
      return sourceIP;
   }

   @JsonIgnore
   public void setSourceIP(String value) { 
      this.sourceIP = value;
   }
   
   
   @JsonIgnore
   public String getSubnetName() {
      return subnetName;
   }

   @JsonIgnore
   public void setSubnetName(String value) { 
      this.subnetName = value;
   }
   
   
   @JsonIgnore
   public String getSystemID() {
      return systemID;
   }

   @JsonIgnore
   public void setSystemID(String value) { 
      this.systemID = value;
   }
   
   
   @JsonIgnore
   public Long getVlanID() {
      return vlanID;
   }

   @JsonIgnore
   public void setVlanID(Long value) { 
      this.vlanID = value;
   }
   
   
   @JsonIgnore
   public String getVportPortName() {
      return vportPortName;
   }

   @JsonIgnore
   public void setVportPortName(String value) { 
      this.vportPortName = value;
   }
   
   
   @JsonIgnore
   public Long getVportVlanID() {
      return vportVlanID;
   }

   @JsonIgnore
   public void setVportVlanID(Long value) { 
      this.vportVlanID = value;
   }
   
   
   @JsonIgnore
   public String getZoneName() {
      return zoneName;
   }

   @JsonIgnore
   public void setZoneName(String value) { 
      this.zoneName = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public TestRunsFetcher getTestRuns() {
      return testRuns;
   }
   

   public String toString() {
      return "Scheduledtestsuiterun [" + "NSGatewayName=" + NSGatewayName + ", VPortName=" + VPortName + ", associatedScheduledTestSuiteID=" + associatedScheduledTestSuiteID + ", associatedScheduledTestSuiteName=" + associatedScheduledTestSuiteName + ", creationDate=" + creationDate + ", datapathID=" + datapathID + ", destination=" + destination + ", domainName=" + domainName + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate=" + lastUpdatedDate + ", macAddress=" + macAddress + ", operationStatus=" + operationStatus + ", owner=" + owner + ", secondaryDatapathID=" + secondaryDatapathID + ", secondaryNSGatewayName=" + secondaryNSGatewayName + ", secondarySystemID=" + secondarySystemID + ", sourceIP=" + sourceIP + ", subnetName=" + subnetName + ", systemID=" + systemID + ", vlanID=" + vlanID + ", vportPortName=" + vportPortName + ", vportVlanID=" + vportVlanID + ", zoneName=" + zoneName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType  + "]";
   }
   
   
}