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

import java.net.URI;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * To exchange data with external Websocket servers using Async Http Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class WsEndpoint {


    public static class WsCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        WsCommon(String path) {
            super("ahc-ws", path);
        }
        /**
         * The URI to use such as http://hostname:port/path. The option is a
         * java.net.URI type.
         */
        public T httpUri(URI httpUri) {
            this.properties.put("httpUri", httpUri);
            return (T) this;
        }
        /**
         * If the option is true, then the Exchange.HTTP_URI header is ignored,
         * and use the endpoint's URI for request. You may also set the
         * throwExceptionOnFailure to be false to let the AhcProducer send all
         * the fault response back. The option is a boolean type.
         */
        public T bridgeEndpoint(boolean bridgeEndpoint) {
            this.properties.put("bridgeEndpoint", bridgeEndpoint);
            return (T) this;
        }
        /**
         * The initial in-memory buffer size used when transferring data between
         * Camel and AHC Client. The option is a int type.
         */
        public T bufferSize(int bufferSize) {
            this.properties.put("bufferSize", bufferSize);
            return (T) this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message. The option is a
         * org.apache.camel.spi.HeaderFilterStrategy type.
         */
        public T headerFilterStrategy(HeaderFilterStrategy headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (T) this;
        }
        /**
         * Option to disable throwing the AhcOperationFailedException in case of
         * failed responses from the remote server. This allows you to get all
         * responses regardless of the HTTP status code. The option is a boolean
         * type.
         */
        public T throwExceptionOnFailure(boolean throwExceptionOnFailure) {
            this.properties.put("throwExceptionOnFailure", throwExceptionOnFailure);
            return (T) this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type (for example
         * using Jetty or Servlet Camel components). On the producer side the
         * exception will be deserialized and thrown as is, instead of the
         * AhcOperationFailedException. The caused exception is required to be
         * serialized. This is by default turned off. If you enable this then be
         * aware that Java will deserialize the incoming data from the request
         * to Java and that can be a potential security risk. The option is a
         * boolean type.
         */
        public T transferException(boolean transferException) {
            this.properties.put("transferException", transferException);
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
         * To use a custom AhcBinding which allows to control how to bind
         * between AHC and Camel. The option is a
         * org.apache.camel.component.ahc.AhcBinding type.
         */
        public T binding(Object binding) {
            this.properties.put("binding", binding);
            return (T) this;
        }
        /**
         * To configure the AsyncHttpClient to use a custom
         * com.ning.http.client.AsyncHttpClientConfig instance. The option is a
         * org.asynchttpclient.AsyncHttpClientConfig type.
         */
        public T clientConfig(Object clientConfig) {
            this.properties.put("clientConfig", clientConfig);
            return (T) this;
        }
        /**
         * To configure the AsyncHttpClientConfig using the key/values from the
         * Map. The option is a java.util.Map<java.lang.String,java.lang.Object>
         * type.
         */
        public T clientConfigOptions(Map<String, Object> clientConfigOptions) {
            this.properties.put("clientConfigOptions", clientConfigOptions);
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
        /**
         * To configure the AsyncHttpClientConfig Realm using the key/values
         * from the Map. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public T clientConfigRealmOptions(
                Map<String, Object> clientConfigRealmOptions) {
            this.properties.put("clientConfigRealmOptions", clientConfigRealmOptions);
            return (T) this;
        }
        /**
         * Reference to a org.apache.camel.support.jsse.SSLContextParameters in
         * the Registry. This reference overrides any configured
         * SSLContextParameters at the component level. See Using the JSSE
         * Configuration Utility. Note that configuring this option will
         * override any SSL/TLS configuration options provided through the
         * clientConfig option at the endpoint or component level. The option is
         * a org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
    }

    public static class WsConsumer
            extends
                WsCommon<WsConsumer>
            implements
                EndpointDefinition.Consumer {
        public WsConsumer(String path) {
            super(path);
        }
        /**
         * Whether to send an message if the web-socket listener received an
         * error. The option is a boolean type.
         */
        public WsConsumer sendMessageOnError(boolean sendMessageOnError) {
            this.properties.put("sendMessageOnError", sendMessageOnError);
            return (WsConsumer) this;
        }
    }

    public static class WsProducer
            extends
                WsCommon<WsProducer>
            implements
                EndpointDefinition.Producer {
        public WsProducer(String path) {
            super(path);
        }
        /**
         * To enable streaming to send data as multiple text fragments. The
         * option is a boolean type.
         */
        public WsProducer useStreaming(boolean useStreaming) {
            this.properties.put("useStreaming", useStreaming);
            return (WsProducer) this;
        }
        /**
         * Define if the Connection Close header has to be added to HTTP
         * Request. This parameter is false by default. The option is a boolean
         * type.
         */
        public WsProducer connectionClose(boolean connectionClose) {
            this.properties.put("connectionClose", connectionClose);
            return (WsProducer) this;
        }
        /**
         * Configure a cookie handler to maintain a HTTP session. The option is
         * a org.apache.camel.http.common.cookie.CookieHandler type.
         */
        public WsProducer cookieHandler(Object cookieHandler) {
            this.properties.put("cookieHandler", cookieHandler);
            return (WsProducer) this;
        }
    }
}