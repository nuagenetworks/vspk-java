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

import java.security.KeyManagementException;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.nuagenetworks.bambou.RestSession;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.ssl.DynamicKeystoreGenerator;
import net.nuagenetworks.bambou.service.RestClientTemplate;
import net.nuagenetworks.bambou.spring.SpringConfig;

public class VSDSession extends RestSession<Me> {
    
   public final static double VERSION = 6;
   
   @Autowired
   private RestClientTemplate restClientTemplate;

   public VSDSession() {
      super(Me.class);
   
      try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class)) {
         applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
      }
   }

   public VSDSession(String username, String password, String enterprise, String apiUrl) {
      this();
 
      setUsername(username);
      setPassword(password);
      setEnterprise(enterprise);
      setApiUrl(apiUrl);
      setApiPrefix("nuage/api");
      setVersion(VERSION);
      setCertificate(null);
      setPrivateKey(null);
   }

   public VSDSession(String username, String enterprise, String apiUrl, String certificateContent, String privateKeyContent) {
      this();
 
      setUsername(username);
      setEnterprise(enterprise);
      setApiUrl(apiUrl);
      setApiPrefix("nuage/api");
      setVersion(VERSION);
      setCertificate(certificateContent);
      setPrivateKey(privateKeyContent);
   }

   public VSDSession(String username, String enterprise, String apiUrl, File pathToCertificatePEMFile, File pathToPrivateKeyPEMFile) throws RestException {
      this();
        
      try {
         String certificateContent = DynamicKeystoreGenerator.getContentsOfPEMFile(pathToCertificatePEMFile);
         String privateKeyContent = DynamicKeystoreGenerator.getContentsOfPEMFile(pathToPrivateKeyPEMFile);
                       
         setUsername(username);
         setEnterprise(enterprise);
         setApiUrl(apiUrl);
         setApiPrefix("nuage/api");
         setVersion(VERSION);
         setCertificate(certificateContent);
         setPrivateKey(privateKeyContent);        
      } catch (KeyManagementException ex) {
         throw new RestException(ex);
      }
   }

   public double getVersion() {
      return VERSION;
   }
   
   public RestClientTemplate getClientTemplate() {
      return restClientTemplate;
   }

   public Me getMe() {
      return super.getRootObject();
   }

   
}