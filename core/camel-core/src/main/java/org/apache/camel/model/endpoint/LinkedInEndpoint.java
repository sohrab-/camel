/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The linkedin component is used for retrieving LinkedIn user profiles,
 * connections, companies, groups, posts, etc.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class LinkedInEndpoint {


    public static class LinkedInCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        LinkedInCommon(String path) {
            super("linkedin", path);
        }
        /**
         * What kind of operation to perform. The option is a
         * org.apache.camel.component.linkedin.internal.LinkedInApiName type.
         */
        public T apiName(LinkedInApiName apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * What sub operation to use for the selected operation. The option is a
         * java.lang.String type.
         */
        public T methodName(String methodName) {
            this.properties.put("methodName", methodName);
            return (T) this;
        }
        /**
         * LinkedIn access token to avoid username and password login procedure.
         * LinkedIn responds to login forms by using a CAPTCHA. This makes it
         * impossible for a standalone, headless process to log in to LinkedIn
         * by specifying a username and password. To work around this, obtain a
         * LinkedIn access token and provide the token as the setting of the
         * accessToken parameter. Obtaining a LinkedIn access token is a
         * multi-step procedure. You must configure your LinkedIn application,
         * obtain a LinkedIn authorization code, and exchange that code for the
         * LinkedIn access token. For details, see:
         * https://developer.linkedin.com/docs/oauth2 The default behavior is
         * that the access token expires after 60 days. To change this, specify
         * a value for the expiryTime paramter. If the access token expires, the
         * LinkedIn component tries to log in to LinkedIn by providing a
         * username and password, which results in a CAPTCHA so the login fails.
         * The LinkedIn component cannot refresh the access token. You must
         * manually obtain a new access token each time an access token expires.
         * When you update the access token you must restart the application so
         * that it uses the new token. The option is a java.lang.String type.
         */
        public T accessToken(String accessToken) {
            this.properties.put("accessToken", accessToken);
            return (T) this;
        }
        /**
         * LinkedIn application client ID. The option is a java.lang.String
         * type.
         */
        public T clientId(String clientId) {
            this.properties.put("clientId", clientId);
            return (T) this;
        }
        /**
         * LinkedIn application client secret. The option is a java.lang.String
         * type.
         */
        public T clientSecret(String clientSecret) {
            this.properties.put("clientSecret", clientSecret);
            return (T) this;
        }
        /**
         * A number of milliseconds since the UNIX Epoch. The default is 60
         * days. A LinkedIn access token expires when this amount of time
         * elapses after the token is in use. The option is a java.lang.Long
         * type.
         */
        public T expiryTime(Long expiryTime) {
            this.properties.put("expiryTime", expiryTime);
            return (T) this;
        }
        /**
         * Custom HTTP parameters, for example, proxy host and port. Use
         * constants from AllClientPNames. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public T httpParams(Map<String, Object> httpParams) {
            this.properties.put("httpParams", httpParams);
            return (T) this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a java.lang.String type.
         */
        public T inBody(String inBody) {
            this.properties.put("inBody", inBody);
            return (T) this;
        }
        /**
         * Flag to enable/disable lazy OAuth, default is true. When enabled,
         * OAuth token retrieval or generation is not done until the first REST
         * call. The option is a boolean type.
         */
        public T lazyAuth(boolean lazyAuth) {
            this.properties.put("lazyAuth", lazyAuth);
            return (T) this;
        }
        /**
         * Application redirect URI, although the component never redirects to
         * this page to avoid having to have a functioning redirect server. For
         * testing, one could use https://localhost. The option is a
         * java.lang.String type.
         */
        public T redirectUri(String redirectUri) {
            this.properties.put("redirectUri", redirectUri);
            return (T) this;
        }
        /**
         * List of LinkedIn scopes as specified at
         * https://developer.linkedin.com/documents/authentication#granting. The
         * option is a org.apache.camel.component.linkedin.api.OAuthScope[]
         * type.
         */
        public T scopes(Object[] scopes) {
            this.properties.put("scopes", scopes);
            return (T) this;
        }
        /**
         * Callback interface for providing an OAuth token or to store the token
         * generated by the component. The callback should return null on the
         * first call and then save the created token in the saveToken()
         * callback. If the callback returns null the first time, a userPassword
         * MUST be provided. The option is a
         * org.apache.camel.component.linkedin.api.OAuthSecureStorage type.
         */
        public T secureStorage(Object secureStorage) {
            this.properties.put("secureStorage", secureStorage);
            return (T) this;
        }
        /**
         * LinkedIn user account name, MUST be provided. The option is a
         * java.lang.String type.
         */
        public T userName(String userName) {
            this.properties.put("userName", userName);
            return (T) this;
        }
        /**
         * LinkedIn account password. The option is a java.lang.String type.
         */
        public T userPassword(String userPassword) {
            this.properties.put("userPassword", userPassword);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class LinkedInConsumer
            extends
                LinkedInCommon<LinkedInConsumer>
            implements
                EndpointDefinition.Consumer {
        public LinkedInConsumer(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public LinkedInConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (LinkedInConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public LinkedInConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (LinkedInConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public LinkedInConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (LinkedInConsumer) this;
        }
    }

    public static class LinkedInProducer
            extends
                LinkedInCommon<LinkedInProducer>
            implements
                EndpointDefinition.Producer {
        public LinkedInProducer(String path) {
            super(path);
        }
    }

    public static enum LinkedInApiName {
        comments, companies, groups, jobs, people, posts, search;
    }
}