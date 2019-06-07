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

import java.math.BigInteger;
import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The web3j component uses the Web3j client API and allows you to add/read
 * nodes to/from a web3j compliant content repositories.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class Web3jEndpoint {


    public static class Web3jCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        Web3jCommon(String path) {
            super("web3j", path);
        }
        /**
         * Sets the node address used to communicate. The option is a
         * java.lang.String type.
         */
        public T nodeAddress(String nodeAddress) {
            this.properties.put("nodeAddress", nodeAddress);
            return (T) this;
        }
        /**
         * Contract address or a list of addresses. The option is a
         * java.util.List<java.lang.String> type.
         */
        public T addresses(List<String> addresses) {
            this.properties.put("addresses", addresses);
            return (T) this;
        }
        /**
         * The address the transaction is send from. The option is a
         * java.lang.String type.
         */
        public T fromAddress(String fromAddress) {
            this.properties.put("fromAddress", fromAddress);
            return (T) this;
        }
        /**
         * The block number, or the string latest for the last mined block or
         * pending, earliest for not yet mined transactions. The option is a
         * org.web3j.protocol.core.DefaultBlockParameter type.
         */
        public T fromBlock(Object fromBlock) {
            this.properties.put("fromBlock", fromBlock);
            return (T) this;
        }
        /**
         * If true it returns the full transaction objects, if false only the
         * hashes of the transactions. The option is a boolean type.
         */
        public T fullTransactionObjects(boolean fullTransactionObjects) {
            this.properties.put("fullTransactionObjects", fullTransactionObjects);
            return (T) this;
        }
        /**
         * The maximum gas allowed in this block. The option is a
         * java.math.BigInteger type.
         */
        public T gasLimit(BigInteger gasLimit) {
            this.properties.put("gasLimit", gasLimit);
            return (T) this;
        }
        /**
         * A transaction privateFor nodes with public keys in a Quorum network.
         * The option is a java.util.List<java.lang.String> type.
         */
        public T privateFor(List<String> privateFor) {
            this.properties.put("privateFor", privateFor);
            return (T) this;
        }
        /**
         * If true, this will support Quorum API. The option is a boolean type.
         */
        public T quorumAPI(boolean quorumAPI) {
            this.properties.put("quorumAPI", quorumAPI);
            return (T) this;
        }
        /**
         * The address the transaction is directed to. The option is a
         * java.lang.String type.
         */
        public T toAddress(String toAddress) {
            this.properties.put("toAddress", toAddress);
            return (T) this;
        }
        /**
         * The block number, or the string latest for the last mined block or
         * pending, earliest for not yet mined transactions. The option is a
         * org.web3j.protocol.core.DefaultBlockParameter type.
         */
        public T toBlock(Object toBlock) {
            this.properties.put("toBlock", toBlock);
            return (T) this;
        }
        /**
         * Topics are order-dependent. Each topic can also be a list of topics.
         * Specify multiple topics separated by comma. The option is a
         * java.lang.String type.
         */
        public T topics(List<String> topics) {
            this.properties.put("topics", topics);
            return (T) this;
        }
        /**
         * The preconfigured Web3j object. The option is a
         * org.web3j.protocol.Web3j type.
         */
        public T web3j(Object web3j) {
            this.properties.put("web3j", web3j);
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

    public static class Web3jConsumer
            extends
                Web3jCommon<Web3jConsumer>
            implements
                EndpointDefinition.Consumer {
        public Web3jConsumer(String path) {
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
        public Web3jConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (Web3jConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public Web3jConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (Web3jConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public Web3jConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (Web3jConsumer) this;
        }
    }

    public static class Web3jProducer
            extends
                Web3jCommon<Web3jProducer>
            implements
                EndpointDefinition.Producer {
        public Web3jProducer(String path) {
            super(path);
        }
        /**
         * Contract address. The option is a java.lang.String type.
         */
        public Web3jProducer address(String address) {
            this.properties.put("address", address);
            return (Web3jProducer) this;
        }
        /**
         * The block number, or the string latest for the last mined block or
         * pending, earliest for not yet mined transactions. The option is a
         * org.web3j.protocol.core.DefaultBlockParameter type.
         */
        public Web3jProducer atBlock(Object atBlock) {
            this.properties.put("atBlock", atBlock);
            return (Web3jProducer) this;
        }
        /**
         * Hash of the block where this transaction was in. The option is a
         * java.lang.String type.
         */
        public Web3jProducer blockHash(String blockHash) {
            this.properties.put("blockHash", blockHash);
            return (Web3jProducer) this;
        }
        /**
         * A random hexadecimal(32 bytes) ID identifying the client. The option
         * is a java.lang.String type.
         */
        public Web3jProducer clientId(String clientId) {
            this.properties.put("clientId", clientId);
            return (Web3jProducer) this;
        }
        /**
         * The compiled code of a contract OR the hash of the invoked method
         * signature and encoded parameters. The option is a java.lang.String
         * type.
         */
        public Web3jProducer data(String data) {
            this.properties.put("data", data);
            return (Web3jProducer) this;
        }
        /**
         * The local database name. The option is a java.lang.String type.
         */
        public Web3jProducer databaseName(String databaseName) {
            this.properties.put("databaseName", databaseName);
            return (Web3jProducer) this;
        }
        /**
         * The filter id to use. The option is a java.math.BigInteger type.
         */
        public Web3jProducer filterId(BigInteger filterId) {
            this.properties.put("filterId", filterId);
            return (Web3jProducer) this;
        }
        /**
         * Gas price used for each paid gas. The option is a
         * java.math.BigInteger type.
         */
        public Web3jProducer gasPrice(BigInteger gasPrice) {
            this.properties.put("gasPrice", gasPrice);
            return (Web3jProducer) this;
        }
        /**
         * A hexadecimal string representation (32 bytes) of the hash rate. The
         * option is a java.lang.String type.
         */
        public Web3jProducer hashrate(String hashrate) {
            this.properties.put("hashrate", hashrate);
            return (Web3jProducer) this;
        }
        /**
         * The header's pow-hash (256 bits) used for submitting a proof-of-work
         * solution. The option is a java.lang.String type.
         */
        public Web3jProducer headerPowHash(String headerPowHash) {
            this.properties.put("headerPowHash", headerPowHash);
            return (Web3jProducer) this;
        }
        /**
         * The transactions/uncle index position in the block. The option is a
         * java.math.BigInteger type.
         */
        public Web3jProducer index(BigInteger index) {
            this.properties.put("index", index);
            return (Web3jProducer) this;
        }
        /**
         * The key name in the database. The option is a java.lang.String type.
         */
        public Web3jProducer keyName(String keyName) {
            this.properties.put("keyName", keyName);
            return (Web3jProducer) this;
        }
        /**
         * The mix digest (256 bits) used for submitting a proof-of-work
         * solution. The option is a java.lang.String type.
         */
        public Web3jProducer mixDigest(String mixDigest) {
            this.properties.put("mixDigest", mixDigest);
            return (Web3jProducer) this;
        }
        /**
         * The nonce found (64 bits) used for submitting a proof-of-work
         * solution. The option is a java.lang.String type.
         */
        public Web3jProducer nonce(String nonce) {
            this.properties.put("nonce", nonce);
            return (Web3jProducer) this;
        }
        /**
         * Operation to use. The option is a java.lang.String type.
         */
        public Web3jProducer operation(String operation) {
            this.properties.put("operation", operation);
            return (Web3jProducer) this;
        }
        /**
         * The transaction index position withing a block. The option is a
         * java.math.BigInteger type.
         */
        public Web3jProducer position(BigInteger position) {
            this.properties.put("position", position);
            return (Web3jProducer) this;
        }
        /**
         * The priority of a whisper message. The option is a
         * java.math.BigInteger type.
         */
        public Web3jProducer priority(BigInteger priority) {
            this.properties.put("priority", priority);
            return (Web3jProducer) this;
        }
        /**
         * Message to sign by calculating an Ethereum specific signature. The
         * option is a java.lang.String type.
         */
        public Web3jProducer sha3HashOfDataToSign(String sha3HashOfDataToSign) {
            this.properties.put("sha3HashOfDataToSign", sha3HashOfDataToSign);
            return (Web3jProducer) this;
        }
        /**
         * The signed transaction data for a new message call transaction or a
         * contract creation for signed transactions. The option is a
         * java.lang.String type.
         */
        public Web3jProducer signedTransactionData(String signedTransactionData) {
            this.properties.put("signedTransactionData", signedTransactionData);
            return (Web3jProducer) this;
        }
        /**
         * The source code to compile. The option is a java.lang.String type.
         */
        public Web3jProducer sourceCode(String sourceCode) {
            this.properties.put("sourceCode", sourceCode);
            return (Web3jProducer) this;
        }
        /**
         * The information about a transaction requested by transaction hash.
         * The option is a java.lang.String type.
         */
        public Web3jProducer transactionHash(String transactionHash) {
            this.properties.put("transactionHash", transactionHash);
            return (Web3jProducer) this;
        }
        /**
         * The time to live in seconds of a whisper message. The option is a
         * java.math.BigInteger type.
         */
        public Web3jProducer ttl(BigInteger ttl) {
            this.properties.put("ttl", ttl);
            return (Web3jProducer) this;
        }
        /**
         * The value sent within a transaction. The option is a
         * java.math.BigInteger type.
         */
        public Web3jProducer value(BigInteger value) {
            this.properties.put("value", value);
            return (Web3jProducer) this;
        }
    }
}