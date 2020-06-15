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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "command", resourceName = "commands")
public class Command extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum ECommand { NSG_APPLY_PATCH, NSG_DELETE_PATCH, NSG_DOWNLOAD_OS_IMAGE, NSG_REBOOT, NSG_RENEW_CERT, NSG_UPDATE_INFO, NSG_UPGRADE_TO_IMAGE, UNKNOWN };
   public enum EEntityScope { ENTERPRISE, GLOBAL };
   public enum EOverride { ABANDON, UNSPECIFIED };
   public enum EStatus { ABANDONED, COMPLETED, FAILED, RUNNING, SKIPPED, STARTED, UNKNOWN };

   
   @JsonProperty(value = "assocEntityType")
   
   protected String assocEntityType;
   
   @JsonProperty(value = "associatedParam")
   
   protected String associatedParam;
   
   @JsonProperty(value = "associatedParamType")
   
   protected String associatedParamType;
   
   @JsonProperty(value = "command")
   
   protected ECommand command;
   
   @JsonProperty(value = "commandInformation")
   
   protected String commandInformation;
   
   @JsonProperty(value = "detail")
   
   protected String detail;
   
   @JsonProperty(value = "detailedStatus")
   
   protected String detailedStatus;
   
   @JsonProperty(value = "detailedStatusCode")
   
   protected Long detailedStatusCode;
   
   @JsonProperty(value = "entityScope")
   
   protected EEntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   
   protected String externalID;
   
   @JsonProperty(value = "fullCommand")
   
   protected String fullCommand;
   
   @JsonProperty(value = "lastUpdatedBy")
   
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "override")
   
   protected EOverride override;
   
   @JsonProperty(value = "progress")
   
   protected String progress;
   
   @JsonProperty(value = "status")
   
   protected EStatus status;
   
   @JsonProperty(value = "summary")
   
   protected String summary;
   

   

   public Command() {
      
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
   public String getAssociatedParam() {
      return associatedParam;
   }

   @JsonIgnore
   public void setAssociatedParam(String value) { 
      this.associatedParam = value;
   }
   
   
   @JsonIgnore
   public String getAssociatedParamType() {
      return associatedParamType;
   }

   @JsonIgnore
   public void setAssociatedParamType(String value) { 
      this.associatedParamType = value;
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
   public String getCommandInformation() {
      return commandInformation;
   }

   @JsonIgnore
   public void setCommandInformation(String value) { 
      this.commandInformation = value;
   }
   
   
   @JsonIgnore
   public String getDetail() {
      return detail;
   }

   @JsonIgnore
   public void setDetail(String value) { 
      this.detail = value;
   }
   
   
   @JsonIgnore
   public String getDetailedStatus() {
      return detailedStatus;
   }

   @JsonIgnore
   public void setDetailedStatus(String value) { 
      this.detailedStatus = value;
   }
   
   
   @JsonIgnore
   public Long getDetailedStatusCode() {
      return detailedStatusCode;
   }

   @JsonIgnore
   public void setDetailedStatusCode(Long value) { 
      this.detailedStatusCode = value;
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
   public String getFullCommand() {
      return fullCommand;
   }

   @JsonIgnore
   public void setFullCommand(String value) { 
      this.fullCommand = value;
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
   public EOverride getOverride() {
      return override;
   }

   @JsonIgnore
   public void setOverride(EOverride value) { 
      this.override = value;
   }
   
   
   @JsonIgnore
   public String getProgress() {
      return progress;
   }

   @JsonIgnore
   public void setProgress(String value) { 
      this.progress = value;
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
   public String getSummary() {
      return summary;
   }

   @JsonIgnore
   public void setSummary(String value) { 
      this.summary = value;
   }
   

   

   public String toString() {
      return "Command [" + "assocEntityType=" + assocEntityType + ", associatedParam=" + associatedParam + ", associatedParamType=" + associatedParamType + ", command=" + command + ", commandInformation=" + commandInformation + ", detail=" + detail + ", detailedStatus=" + detailedStatus + ", detailedStatusCode=" + detailedStatusCode + ", entityScope=" + entityScope + ", externalID=" + externalID + ", fullCommand=" + fullCommand + ", lastUpdatedBy=" + lastUpdatedBy + ", override=" + override + ", progress=" + progress + ", status=" + status + ", summary=" + summary + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}