/*
 * Copyright 2017-2019 CodingApi .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codingapi.txlcn.tc.support.resouce;

import com.codingapi.txlcn.tc.aspect.weave.ConnectionCallback;

import java.sql.Connection;

/**
 * @author lorne
 */
public interface TransactionResourceProxy {

    /**
     * 获取资源连接
     *
     * @param connectionCallback Connection提供者
     * @return  Connection Connection
     * @throws Throwable Throwable
     */
    Connection proxyConnection(ConnectionCallback connectionCallback) throws Throwable;

}
