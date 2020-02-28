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

package com.amazonaws.model.response;

import com.amazonaws.model.Order;

import java.util.List;

public class GetOrdersResponse {
    private String lastEvaluatedKey;
    private List<Order> orders;

    public GetOrdersResponse() {
    }

    public GetOrdersResponse(String lastEvaluatedKey, List<Order> orders) {
        this.lastEvaluatedKey = lastEvaluatedKey;
        this.orders = orders;
    }

    public String getLastEvaluatedKey() {
        return lastEvaluatedKey;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public GetOrdersResponse setLastEvaluatedKey(String lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
        return this;
    }

    public GetOrdersResponse setOrders(List<Order> orders) {
        this.orders = orders;
        return this;
    }

    public GetOrdersResponse withLastEvaluatedKey(String lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
        return this;
    }

    public GetOrdersResponse withOrders(List<Order> orders) {
        this.orders = orders;
        return this;
    }
}
