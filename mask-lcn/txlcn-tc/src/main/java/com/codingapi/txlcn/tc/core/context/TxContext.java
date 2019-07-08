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
package com.codingapi.txlcn.tc.core.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * Date: 19-1-16 下午9:23
 *
 * @author ujued
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TxContext {

    /**
     * 事务组锁
     */
    private Object lock = new Object();

    /**
     * 事务组ID
     */
    private String groupId;

    /**
     * 分布式事务发起方
     */
    private boolean dtxStart;

    /**
     * 事务创建时间
     */
    private long createTime = System.currentTimeMillis();

    /**
     * 上下文内分布式事务类型
     */
    private Set<String> transactionTypes = new HashSet<>(6);
}
