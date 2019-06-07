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

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The websocket component provides websocket endpoints with Jetty for
 * communicating with clients using websocket.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class WebsocketEndpoint {


    public static class WebsocketCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        WebsocketCommon(String path) {
            super("websocket", path);
        }
        /**
         * The hostname. The default value is 0.0.0.0. Setting this option on
         * the component will use the component configured value as default. The
         * option is a java.lang.String type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * The port number. The default value is 9292. Setting this option on
         * the component will use the component configured value as default. The
         * option is a java.lang.Integer type.
         */
        public T port(Integer port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Name of the websocket channel to use. The option is a
         * java.lang.String type.
         */
        public T resourceUri(String resourceUri) {
            this.properties.put("resourceUri", resourceUri);
            return (T) this;
        }
        /**
         * Can be used to set the size in bytes that the websocket created by
         * the websocketServlet may be accept before closing. (Default is -1 -
         * or unlimited). The option is a java.lang.Integer type.
         */
        public T maxBinaryMessageSize(Integer maxBinaryMessageSize) {
            this.properties.put("maxBinaryMessageSize", maxBinaryMessageSize);
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
         * Set the buffer size of the websocketServlet, which is also the max
         * frame byte size (default 8192). The option is a java.lang.Integer
         * type.
         */
        public T bufferSize(Integer bufferSize) {
            this.properties.put("bufferSize", bufferSize);
            return (T) this;
        }
        /**
         * Set the time in ms that the websocket created by the websocketServlet
         * may be idle before closing. (default is 300000). The option is a
         * java.lang.Integer type.
         */
        public T maxIdleTime(Integer maxIdleTime) {
            this.properties.put("maxIdleTime", maxIdleTime);
            return (T) this;
        }
        /**
         * Can be used to set the size in characters that the websocket created
         * by the websocketServlet may be accept before closing. The option is a
         * java.lang.Integer type.
         */
        public T maxTextMessageSize(Integer maxTextMessageSize) {
            this.properties.put("maxTextMessageSize", maxTextMessageSize);
            return (T) this;
        }
        /**
         * Can be used to set the minimum protocol version accepted for the
         * websocketServlet. (Default 13 - the RFC6455 version). The option is a
         * java.lang.Integer type.
         */
        public T minVersion(Integer minVersion) {
            this.properties.put("minVersion", minVersion);
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
         * The CORS allowed origins. Use to allow all. The option is a
         * java.lang.String type.
         */
        public T allowedOrigins(String allowedOrigins) {
            this.properties.put("allowedOrigins", allowedOrigins);
            return (T) this;
        }
        /**
         * Whether to enable CORS. The option is a boolean type.
         */
        public T crossOriginFilterOn(boolean crossOriginFilterOn) {
            this.properties.put("crossOriginFilterOn", crossOriginFilterOn);
            return (T) this;
        }
        /**
         * Context path for filtering CORS. The option is a java.lang.String
         * type.
         */
        public T filterPath(String filterPath) {
            this.properties.put("filterPath", filterPath);
            return (T) this;
        }
        /**
         * If this option is true, Jetty JMX support will be enabled for this
         * endpoint. See Jetty JMX support for more details. The option is a
         * boolean type.
         */
        public T enableJmx(boolean enableJmx) {
            this.properties.put("enableJmx", enableJmx);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
    }

    public static class WebsocketConsumer
            extends
                WebsocketCommon<WebsocketConsumer>
            implements
                EndpointDefinition.Consumer {
        public WebsocketConsumer(String path) {
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
        public WebsocketConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (WebsocketConsumer) this;
        }
        /**
         * Whether to enable session support which enables HttpSession for each
         * http request. The option is a boolean type.
         */
        public WebsocketConsumer sessionSupport(boolean sessionSupport) {
            this.properties.put("sessionSupport", sessionSupport);
            return (WebsocketConsumer) this;
        }
        /**
         * Set a resource path for static resources (such as .html files etc).
         * The resources can be loaded from classpath, if you prefix with
         * classpath:, otherwise the resources is loaded from file system or
         * from JAR files. For example to load from root classpath use
         * classpath:., or classpath:WEB-INF/static If not configured (eg null)
         * then no static resource is in use. The option is a java.lang.String
         * type.
         */
        public WebsocketConsumer staticResources(String staticResources) {
            this.properties.put("staticResources", staticResources);
            return (WebsocketConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public WebsocketConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (WebsocketConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public WebsocketConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (WebsocketConsumer) this;
        }
    }

    public static class WebsocketProducer
            extends
                WebsocketCommon<WebsocketProducer>
            implements
                EndpointDefinition.Producer {
        public WebsocketProducer(String path) {
            super(path);
        }
        /**
         * Timeout in millis when sending to a websocket channel. The default
         * timeout is 30000 (30 seconds). The option is a java.lang.Integer
         * type.
         */
        public WebsocketProducer sendTimeout(Integer sendTimeout) {
            this.properties.put("sendTimeout", sendTimeout);
            return (WebsocketProducer) this;
        }
        /**
         * To send to all websocket subscribers. Can be used to configure on
         * endpoint level, instead of having to use the
         * WebsocketConstants.SEND_TO_ALL header on the message. The option is a
         * java.lang.Boolean type.
         */
        public WebsocketProducer sendToAll(Boolean sendToAll) {
            this.properties.put("sendToAll", sendToAll);
            return (WebsocketProducer) this;
        }
    }
}