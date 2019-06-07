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
import org.apache.camel.model.EndpointDefinition;

/**
 * The aws-mq is used for managing Amazon MQ instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class MQEndpoint {


    public static class MQCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        MQCommon(String path) {
            super("aws-mq", path);
        }
        /**
         * Logical name. The option is a java.lang.String type.
         */
        public T label(String label) {
            this.properties.put("label", label);
            return (T) this;
        }
        /**
         * The region in which MQ client needs to work. The option is a
         * java.lang.String type.
         */
        public T region(String region) {
            this.properties.put("region", region);
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

    public static class MQProducer
            extends
                MQCommon<MQProducer>
            implements
                EndpointDefinition.Producer {
        public MQProducer(String path) {
            super(path);
        }
        /**
         * Amazon AWS Access Key. The option is a java.lang.String type.
         */
        public MQProducer accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (MQProducer) this;
        }
        /**
         * To use a existing configured AmazonMQClient as client. The option is
         * a com.amazonaws.services.mq.AmazonMQ type.
         */
        public MQProducer amazonMqClient(Object amazonMqClient) {
            this.properties.put("amazonMqClient", amazonMqClient);
            return (MQProducer) this;
        }
        /**
         * The operation to perform. It can be
         * listBrokers,createBroker,deleteBroker. The option is a
         * org.apache.camel.component.aws.mq.MQOperations type.
         */
        public MQProducer operation(MQOperations operation) {
            this.properties.put("operation", operation);
            return (MQProducer) this;
        }
        /**
         * To define a proxy host when instantiating the MQ client. The option
         * is a java.lang.String type.
         */
        public MQProducer proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (MQProducer) this;
        }
        /**
         * To define a proxy port when instantiating the MQ client. The option
         * is a java.lang.Integer type.
         */
        public MQProducer proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (MQProducer) this;
        }
        /**
         * Amazon AWS Secret Key. The option is a java.lang.String type.
         */
        public MQProducer secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (MQProducer) this;
        }
    }

    public static enum MQOperations {
        listBrokers, createBroker, deleteBroker, rebootBroker, updateBroker, describeBroker;
    }
}