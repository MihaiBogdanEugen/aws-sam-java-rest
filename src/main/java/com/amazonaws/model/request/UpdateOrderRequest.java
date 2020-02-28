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

import java.math.BigDecimal;

public class UpdateOrderRequest {
    private String orderId;
    private String customerId;
    private BigDecimal preTaxAmount;
    private BigDecimal postTaxAmount;
    private Long version;

    public UpdateOrderRequest() {
    }

    public UpdateOrderRequest(String orderId, String customerId, BigDecimal preTaxAmount, BigDecimal postTaxAmount, Long version) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.preTaxAmount = preTaxAmount;
        this.postTaxAmount = postTaxAmount;
        this.version = version;
    }

    public UpdateOrderRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public UpdateOrderRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public UpdateOrderRequest withPreTaxAmount(BigDecimal preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
        return this;
    }

    public UpdateOrderRequest withPostTaxAmount(BigDecimal postTaxAmount) {
        this.postTaxAmount = postTaxAmount;
        return this;
    }

    public UpdateOrderRequest withVersion(Long version) {
        this.version = version;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public UpdateOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public UpdateOrderRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public BigDecimal getPreTaxAmount() {
        return preTaxAmount;
    }

    public UpdateOrderRequest setPreTaxAmount(BigDecimal preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
        return this;
    }

    public BigDecimal getPostTaxAmount() {
        return postTaxAmount;
    }

    public UpdateOrderRequest setPostTaxAmount(BigDecimal postTaxAmount) {
        this.postTaxAmount = postTaxAmount;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public UpdateOrderRequest setVersion(Long version) {
        this.version = version;
        return this;
    }
}
