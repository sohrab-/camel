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
 * Messaging client for Google Cloud Platform PubSub Service
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class GooglePubsubEndpoint {


    public static class GooglePubsubCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        GooglePubsubCommon(String path) {
            super("google-pubsub", path);
        }
        /**
         * Project Id. The option is a java.lang.String type.
         */
        public T projectId(String projectId) {
            this.properties.put("projectId", projectId);
            return (T) this;
        }
        /**
         * Destination Name. The option is a java.lang.String type.
         */
        public T destinationName(String destinationName) {
            this.properties.put("destinationName", destinationName);
            return (T) this;
        }
        /**
         * AUTO = exchange gets ack'ed/nack'ed on completion. NONE = downstream
         * process has to ack/nack explicitly. The option is a
         * org.apache.camel.component.google.pubsub.GooglePubsubConstants.AckMode type.
         */
        public T ackMode(AckMode ackMode) {
            this.properties.put("ackMode", ackMode);
            return (T) this;
        }
        /**
         * The number of parallel streams consuming from the subscription. The
         * option is a java.lang.Integer type.
         */
        public T concurrentConsumers(Integer concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (T) this;
        }
        /**
         * ConnectionFactory to obtain connection to PubSub Service. If non
         * provided the default will be used. The option is a
         * org.apache.camel.component.google.pubsub.GooglePubsubConnectionFactory type.
         */
        public T connectionFactory(Object connectionFactory) {
            this.properties.put("connectionFactory", connectionFactory);
            return (T) this;
        }
        /**
         * Logger ID to use when a match to the parent route required. The
         * option is a java.lang.String type.
         */
        public T loggerId(String loggerId) {
            this.properties.put("loggerId", loggerId);
            return (T) this;
        }
        /**
         * The max number of messages to receive from the server in a single API
         * call. The option is a java.lang.Integer type.
         */
        public T maxMessagesPerPoll(Integer maxMessagesPerPoll) {
            this.properties.put("maxMessagesPerPoll", maxMessagesPerPoll);
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

    public static class GooglePubsubConsumer
            extends
                GooglePubsubCommon<GooglePubsubConsumer>
            implements
                EndpointDefinition.Consumer {
        public GooglePubsubConsumer(String path) {
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
        public GooglePubsubConsumer bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (GooglePubsubConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public GooglePubsubConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (GooglePubsubConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public GooglePubsubConsumer exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (GooglePubsubConsumer) this;
        }
    }

    public static class GooglePubsubProducer
            extends
                GooglePubsubCommon<GooglePubsubProducer>
            implements
                EndpointDefinition.Producer {
        public GooglePubsubProducer(String path) {
            super(path);
        }
    }

    public static enum AckMode {
        AUTO, NONE;
    }
}