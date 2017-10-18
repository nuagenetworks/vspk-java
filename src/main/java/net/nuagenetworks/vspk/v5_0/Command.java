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
@RestEntity(restName = "command", resourceName = "commands")
public class Command extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum ECommand { NSG_DOWNLOAD_OS_IMAGE, NSG_UPGRADE_TO_IMAGE, UNKNOWN };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum Status { COMPLETE, FAILED, STARTED, UNKNOWN };

   
   @JsonProperty(value = "command")
   protected ECommand command;
   
   @JsonProperty(value = "commandInformation")
   protected String commandInformation;
   
   @JsonProperty(value = "detailedStatus")
   protected String detailedStatus;
   
   @JsonProperty(value = "detailedStatusCode")
   protected Long detailedStatusCode;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "summary")
   protected String summary;
   

   

   public Command() {
      
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
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
   public Status getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(Status value) { 
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
      return "Command [" + "command=" + command + ", commandInformation=" + commandInformation + ", detailedStatus=" + detailedStatus + ", detailedStatusCode=" + detailedStatusCode + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", status=" + status + ", summary=" + summary + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}