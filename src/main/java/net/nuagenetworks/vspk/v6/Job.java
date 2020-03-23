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
@RestEntity(restName = "job", resourceName = "jobs")
public class Job extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum ECommand { APPLICATION_SIGNATURE_IMPORT, APPLY_POLICY_CHANGES, ASSIGN_SELF_REBOOTSTRAP_REQ, BATCH_CRUD_REQUEST, BEGIN_POLICY_CHANGES, CERTIFICATE_NSG_RENEW, CERTIFICATE_NSG_REVOKE, CLEAR_IPSEC_DATA, CLEAR_MAC_MOVE_ALARMS, CLOUD_FORCE_CONFIG, CLOUD_SYNC, DEPLOY, DISCARD_POLICY_CHANGES, EXPORT, FORCE_KEYSERVER_UPDATE, FORCE_KEYSERVER_UPDATE_ACK, FORCE_KEYSERVER_VSD_RESYNC, GATEWAY_AUDIT, GET_ZFB_INFO, IMPORT, KEYSERVER_NOTIFICATION_TEST, NETCONF_FORCE_DEPLOY, NETCONF_SYNC, NOTIFY_NSG_REGISTRATION, NOTIFY_NSG_REGISTRATION_ACK, NOTIFY_NSG_REGISTRATION_TEST, NSG_LIFT_QUARANTINE, NSG_NOTIFICATION_TEST, NSG_QUARANTINE, NSG_REGISTRATION_INFO, RECOVER_NSG, REDEPLOY, REJECT_ZFB_REQUEST, RELOAD, RELOAD_GEO_REDUNDANT_INFO, RELOAD_NSG_CONFIG, RESTART, RETRIEVE_ACTIVE_NSGS, SAAS_APPLICATION_TYPE, START, STATUS, STOP, SYNC, UNDEPLOY, VCENTER_ADD_COMPUTERESOURCE_INSCOPE, VCENTER_DELETE_AGENCY, VCENTER_MARK_AGENT_VM_AVAILABLE, VCENTER_RECONNECT, VCENTER_RELOAD, VCENTER_REMOVE_COMPUTERESOURCE_INSCOPE, VCENTER_SCRIPT_UPGRADE_VRS, VCENTER_SYNC, VCENTER_UPGRADE_VRS };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EStatus { FAILED, RUNNING, SUCCESS };

   
   @JsonProperty(value = "assocEntityType")
   
   protected String assocEntityType;
   
   @JsonProperty(value = "command")
   
   protected ECommand command;
   
   @JsonProperty(value = "embeddedMetadata")
   
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "parameters")
   
   protected Object parameters;
   
   @JsonProperty(value = "progress")
   
   protected Float progress;
   
   @JsonProperty(value = "result")
   
   protected Object result;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public Job() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   
   @JsonIgnore
   public String getAssocEntityType() {
      return assocEntityType;
   }

   @JsonIgnore
   public void setAssocEntityType(String value) { 
      this.assocEntityType = value;
   }
   
   
   @JsonIgnore
   public ECommand getCommand() {
      return command;
   }

   @JsonIgnore
   public void setCommand(ECommand value) { 
      this.command = value;
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
   public Object getParameters() {
      return parameters;
   }

   @JsonIgnore
   public void setParameters(Object value) { 
      this.parameters = value;
   }
   
   
   @JsonIgnore
   public Float getProgress() {
      return progress;
   }

   @JsonIgnore
   public void setProgress(Float value) { 
      this.progress = value;
   }
   
   
   @JsonIgnore
   public Object getResult() {
      return result;
   }

   @JsonIgnore
   public void setResult(Object value) { 
      this.result = value;
   }
   
   
   @JsonIgnore
   public EStatus getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(EStatus value) { 
      this.status = value;
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
      return "Job [" + "assocEntityType=" + assocEntityType + ", command=" + command + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", parameters=" + parameters + ", progress=" + progress + ", result=" + result + ", status=" + status + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}