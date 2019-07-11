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
import net.nuagenetworks.vspk.v6.fetchers.SSIDConnectionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "wirelessport", resourceName = "wirelessports")
public class WirelessPort extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum ChannelWidth { WIDTH_20_MHZ, WIDTH_80_MHZ, WIDTH_LESS_40_MHZ, WIDTH_PLUS_40_MHZ };
   
   public enum CountryCode { AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BM, BN, BO, BR, BS, BT, BV, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CS, CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, EH, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GF, GH, GI, GL, GM, GN, GP, GQ, GR, GS, GT, GU, GW, GY, HK, HM, HN, HR, HT, HU, ID, IE, IL, IN, IO, IQ, IR, IS, IT, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, MG, MH, MK, ML, MM, MN, MO, MP, MQ, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NF, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PS, PT, PW, PY, QA, RE, RO, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SJ, SK, SL, SM, SN, SO, SR, ST, SV, SY, SZ, TC, TD, TF, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, UM, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum FrequencyChannel { CH_0, CH_1, CH_10, CH_100, CH_104, CH_108, CH_11, CH_112, CH_116, CH_12, CH_120, CH_124, CH_128, CH_13, CH_132, CH_136, CH_14, CH_140, CH_144, CH_149, CH_153, CH_157, CH_161, CH_165, CH_2, CH_3, CH_36, CH_4, CH_40, CH_44, CH_48, CH_5, CH_52, CH_56, CH_6, CH_60, CH_64, CH_7, CH_8, CH_9 };
   
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   
   public enum PortType { ACCESS };
   
   public enum Status { INITIALIZED, MISMATCH, ORPHAN, READY };
   
   public enum WifiFrequencyBand { FREQ_2_4_GHZ, FREQ_5_0_GHZ };
   
   public enum WifiMode { WIFI_A, WIFI_A_AC, WIFI_A_N, WIFI_A_N_AC, WIFI_B_G, WIFI_B_G_N };

   
   @JsonProperty(value = "VLANRange")
   protected String VLANRange;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "channelWidth")
   protected ChannelWidth channelWidth;
   
   @JsonProperty(value = "countryCode")
   protected CountryCode countryCode;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "embeddedMetadata")
   protected java.util.List<Metadata> embeddedMetadata;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "frequencyChannel")
   protected FrequencyChannel frequencyChannel;
   
   @JsonProperty(value = "genericConfig")
   protected String genericConfig;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "physicalName")
   protected String physicalName;
   
   @JsonProperty(value = "portType")
   protected PortType portType;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "useUserMnemonic")
   protected Boolean useUserMnemonic;
   
   @JsonProperty(value = "userMnemonic")
   protected String userMnemonic;
   
   @JsonProperty(value = "wifiFrequencyBand")
   protected WifiFrequencyBand wifiFrequencyBand;
   
   @JsonProperty(value = "wifiMode")
   protected WifiMode wifiMode;
   

   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private SSIDConnectionsFetcher sSIDConnections;
   

   public WirelessPort() {
      
      alarms = new AlarmsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      sSIDConnections = new SSIDConnectionsFetcher(this);
      
   }

   
   @JsonIgnore
   public String getVLANRange() {
      return VLANRange;
   }

   @JsonIgnore
   public void setVLANRange(String value) { 
      this.VLANRange = value;
   }
   
   @JsonIgnore
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   
   @JsonIgnore
   public ChannelWidth getChannelWidth() {
      return channelWidth;
   }

   @JsonIgnore
   public void setChannelWidth(ChannelWidth value) { 
      this.channelWidth = value;
   }
   
   @JsonIgnore
   public CountryCode getCountryCode() {
      return countryCode;
   }

   @JsonIgnore
   public void setCountryCode(CountryCode value) { 
      this.countryCode = value;
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
   public java.util.List<Metadata> getEmbeddedMetadata() {
      return embeddedMetadata;
   }

   @JsonIgnore
   public void setEmbeddedMetadata(java.util.List<Metadata> value) { 
      this.embeddedMetadata = value;
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
   public FrequencyChannel getFrequencyChannel() {
      return frequencyChannel;
   }

   @JsonIgnore
   public void setFrequencyChannel(FrequencyChannel value) { 
      this.frequencyChannel = value;
   }
   
   @JsonIgnore
   public String getGenericConfig() {
      return genericConfig;
   }

   @JsonIgnore
   public void setGenericConfig(String value) { 
      this.genericConfig = value;
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
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   
   @JsonIgnore
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   
   @JsonIgnore
   public String getPhysicalName() {
      return physicalName;
   }

   @JsonIgnore
   public void setPhysicalName(String value) { 
      this.physicalName = value;
   }
   
   @JsonIgnore
   public PortType getPortType() {
      return portType;
   }

   @JsonIgnore
   public void setPortType(PortType value) { 
      this.portType = value;
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
   public Boolean getUseUserMnemonic() {
      return useUserMnemonic;
   }

   @JsonIgnore
   public void setUseUserMnemonic(Boolean value) { 
      this.useUserMnemonic = value;
   }
   
   @JsonIgnore
   public String getUserMnemonic() {
      return userMnemonic;
   }

   @JsonIgnore
   public void setUserMnemonic(String value) { 
      this.userMnemonic = value;
   }
   
   @JsonIgnore
   public WifiFrequencyBand getWifiFrequencyBand() {
      return wifiFrequencyBand;
   }

   @JsonIgnore
   public void setWifiFrequencyBand(WifiFrequencyBand value) { 
      this.wifiFrequencyBand = value;
   }
   
   @JsonIgnore
   public WifiMode getWifiMode() {
      return wifiMode;
   }

   @JsonIgnore
   public void setWifiMode(WifiMode value) { 
      this.wifiMode = value;
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
   
   @JsonIgnore
   public SSIDConnectionsFetcher getSSIDConnections() {
      return sSIDConnections;
   }
   

   public String toString() {
      return "WirelessPort [" + "VLANRange=" + VLANRange + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", channelWidth=" + channelWidth + ", countryCode=" + countryCode + ", description=" + description + ", embeddedMetadata=" + embeddedMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", frequencyChannel=" + frequencyChannel + ", genericConfig=" + genericConfig + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", permittedAction=" + permittedAction + ", physicalName=" + physicalName + ", portType=" + portType + ", status=" + status + ", useUserMnemonic=" + useUserMnemonic + ", userMnemonic=" + userMnemonic + ", wifiFrequencyBand=" + wifiFrequencyBand + ", wifiMode=" + wifiMode + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}