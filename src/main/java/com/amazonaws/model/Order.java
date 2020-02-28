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

package com.amazonaws.model;

import java.math.BigDecimal;

public class Order {
    private String orderId;
    private String customerId;
    private BigDecimal preTaxAmount;
    private BigDecimal postTaxAmount;
    private Long version;

    public Order() {
    }

    public Order(String orderId, String customerId, BigDecimal preTaxAmount, BigDecimal postTaxAmount, Long version) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.preTaxAmount = preTaxAmount;
        this.postTaxAmount = postTaxAmount;
        this.version = version;
    }

    public Order withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public Order withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public Order withPreTaxAmount(BigDecimal preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
        return this;
    }

    public Order withPostTaxAmount(BigDecimal postTaxAmount) {
        this.postTaxAmount = postTaxAmount;
        return this;
    }

    public Order withVersion(Long version) {
        this.version = version;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public Order setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Order setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public BigDecimal getPreTaxAmount() {
        return preTaxAmount;
    }

    public Order setPreTaxAmount(BigDecimal preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
        return this;
    }

    public BigDecimal getPostTaxAmount() {
        return postTaxAmount;
    }

    public Order setPostTaxAmount(BigDecimal postTaxAmount) {
        this.postTaxAmount = postTaxAmount;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public Order setVersion(Long version) {
        this.version = version;
        return this;
    }
}
