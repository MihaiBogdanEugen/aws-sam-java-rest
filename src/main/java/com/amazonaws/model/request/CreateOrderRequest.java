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

package com.amazonaws.model.request;

public class CreateOrderRequest {
    private String customerId;
    private Long preTaxAmount;
    private Long postTaxAmount;

    public CreateOrderRequest() {
    }

    public CreateOrderRequest(String customerId, Long preTaxAmount, Long postTaxAmount) {
        this.customerId = customerId;
        this.preTaxAmount = preTaxAmount;
        this.postTaxAmount = postTaxAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public CreateOrderRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public Long getPreTaxAmount() {
        return preTaxAmount;
    }

    public CreateOrderRequest setPreTaxAmount(Long preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
        return this;
    }

    public Long getPostTaxAmount() {
        return postTaxAmount;
    }

    public CreateOrderRequest setPostTaxAmount(Long postTaxAmount) {
        this.postTaxAmount = postTaxAmount;
        return this;
    }

    public CreateOrderRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public CreateOrderRequest withPreTaxAmount(Long preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
        return this;
    }

    public CreateOrderRequest withPostTaxAmount(Long postTaxAmount) {
        this.postTaxAmount = postTaxAmount;
        return this;
    }
}
