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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "licensestatus", resourceName = "licensestatus")
public class LicenseStatus extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "totalLicensedNICsCount")
   protected String totalLicensedNICsCount;
   
   @JsonProperty(value = "totalLicensedNSGsCount")
   protected String totalLicensedNSGsCount;
   
   @JsonProperty(value = "totalLicensedUsedNICsCount")
   protected String totalLicensedUsedNICsCount;
   
   @JsonProperty(value = "totalLicensedUsedNSGsCount")
   protected String totalLicensedUsedNSGsCount;
   
   @JsonProperty(value = "totalLicensedUsedVMsCount")
   protected String totalLicensedUsedVMsCount;
   
   @JsonProperty(value = "totalLicensedUsedVRSGsCount")
   protected String totalLicensedUsedVRSGsCount;
   
   @JsonProperty(value = "totalLicensedUsedVRSsCount")
   protected String totalLicensedUsedVRSsCount;
   
   @JsonProperty(value = "totalLicensedVMsCount")
   protected String totalLicensedVMsCount;
   
   @JsonProperty(value = "totalLicensedVRSGsCount")
   protected String totalLicensedVRSGsCount;
   
   @JsonProperty(value = "totalLicensedVRSsCount")
   protected String totalLicensedVRSsCount;
   

   

   public LicenseStatus() {
      
   }

   @JsonIgnore
   public String getTotalLicensedNICsCount() {
      return totalLicensedNICsCount;
   }

   @JsonIgnore
   public void setTotalLicensedNICsCount(String value) { 
      this.totalLicensedNICsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedNSGsCount() {
      return totalLicensedNSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedNSGsCount(String value) { 
      this.totalLicensedNSGsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedUsedNICsCount() {
      return totalLicensedUsedNICsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedNICsCount(String value) { 
      this.totalLicensedUsedNICsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedUsedNSGsCount() {
      return totalLicensedUsedNSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedNSGsCount(String value) { 
      this.totalLicensedUsedNSGsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedUsedVMsCount() {
      return totalLicensedUsedVMsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedVMsCount(String value) { 
      this.totalLicensedUsedVMsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedUsedVRSGsCount() {
      return totalLicensedUsedVRSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedVRSGsCount(String value) { 
      this.totalLicensedUsedVRSGsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedUsedVRSsCount() {
      return totalLicensedUsedVRSsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedVRSsCount(String value) { 
      this.totalLicensedUsedVRSsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedVMsCount() {
      return totalLicensedVMsCount;
   }

   @JsonIgnore
   public void setTotalLicensedVMsCount(String value) { 
      this.totalLicensedVMsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedVRSGsCount() {
      return totalLicensedVRSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedVRSGsCount(String value) { 
      this.totalLicensedVRSGsCount = value;
   }
   @JsonIgnore
   public String getTotalLicensedVRSsCount() {
      return totalLicensedVRSsCount;
   }

   @JsonIgnore
   public void setTotalLicensedVRSsCount(String value) { 
      this.totalLicensedVRSsCount = value;
   }
   

   

   public String toString() {
      return "LicenseStatus [" + "totalLicensedNICsCount=" + totalLicensedNICsCount + ", totalLicensedNSGsCount=" + totalLicensedNSGsCount + ", totalLicensedUsedNICsCount=" + totalLicensedUsedNICsCount + ", totalLicensedUsedNSGsCount=" + totalLicensedUsedNSGsCount + ", totalLicensedUsedVMsCount=" + totalLicensedUsedVMsCount + ", totalLicensedUsedVRSGsCount=" + totalLicensedUsedVRSGsCount + ", totalLicensedUsedVRSsCount=" + totalLicensedUsedVRSsCount + ", totalLicensedVMsCount=" + totalLicensedVMsCount + ", totalLicensedVRSGsCount=" + totalLicensedVRSGsCount + ", totalLicensedVRSsCount=" + totalLicensedVRSsCount + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}