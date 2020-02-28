/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.amazonaws.services.lambda.runtime;

public class TestContext implements Context {
    private String awsRequestId;
    private String logGroupName;
    private String logStreamName;
    private String functionName;
    private String functionVersion;
    private String invokedFunctionArn;
    private CognitoIdentity identity;
    private ClientContext clientContext;
    private int remainingTimeInMillis;
    private int memoryLimitInMB;
    private LambdaLogger logger;

    public TestContext() {
    }

    public TestContext(String awsRequestId, String logGroupName, String logStreamName, String functionName, String functionVersion, String invokedFunctionArn, CognitoIdentity identity, ClientContext clientContext, int remainingTimeInMillis, int memoryLimitInMB, LambdaLogger logger) {
        this.awsRequestId = awsRequestId;
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
        this.functionName = functionName;
        this.functionVersion = functionVersion;
        this.invokedFunctionArn = invokedFunctionArn;
        this.identity = identity;
        this.clientContext = clientContext;
        this.remainingTimeInMillis = remainingTimeInMillis;
        this.memoryLimitInMB = memoryLimitInMB;
        this.logger = logger;
    }

    public void setAwsRequestId(String awsRequestId) {
        this.awsRequestId = awsRequestId;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    public void setInvokedFunctionArn(String invokedFunctionArn) {
        this.invokedFunctionArn = invokedFunctionArn;
    }

    public void setIdentity(CognitoIdentity identity) {
        this.identity = identity;
    }

    public void setClientContext(ClientContext clientContext) {
        this.clientContext = clientContext;
    }

    public void setRemainingTimeInMillis(int remainingTimeInMillis) {
        this.remainingTimeInMillis = remainingTimeInMillis;
    }

    public void setMemoryLimitInMB(int memoryLimitInMB) {
        this.memoryLimitInMB = memoryLimitInMB;
    }

    public void setLogger(LambdaLogger logger) {
        this.logger = logger;
    }

    public TestContext withAwsRequestId(String awsRequestId) {
        this.awsRequestId = awsRequestId;
        return this;
    }

    public TestContext withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    public TestContext withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    public TestContext withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    public TestContext withFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }

    public TestContext withInvokedFunctionArn(String invokedFunctionArn) {
        this.invokedFunctionArn = invokedFunctionArn;
        return this;
    }

    public TestContext withIdentity(CognitoIdentity identity) {
        this.identity = identity;
        return this;
    }

    public TestContext withClientContext(ClientContext clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    public TestContext withRemainingTimeInMillis(int remainingTimeInMillis) {
        this.remainingTimeInMillis = remainingTimeInMillis;
        return this;
    }

    public TestContext withMemoryLimitInMB(int memoryLimitInMB) {
        this.memoryLimitInMB = memoryLimitInMB;
        return this;
    }

    public TestContext withLogger(LambdaLogger logger) {
        this.logger = logger;
        return this;
    }

    @Override
    public String getAwsRequestId() {
        return null;
    }

    @Override
    public String getLogGroupName() {
        return null;
    }

    @Override
    public String getLogStreamName() {
        return null;
    }

    @Override
    public String getFunctionName() {
        return null;
    }

    @Override
    public String getFunctionVersion() {
        return null;
    }

    @Override
    public String getInvokedFunctionArn() {
        return null;
    }

    @Override
    public CognitoIdentity getIdentity() {
        return null;
    }

    @Override
    public ClientContext getClientContext() {
        return null;
    }

    @Override
    public int getRemainingTimeInMillis() {
        return 0;
    }

    @Override
    public int getMemoryLimitInMB() {
        return 0;
    }

    @Override
    public LambdaLogger getLogger() {
        return null;
    }
}
