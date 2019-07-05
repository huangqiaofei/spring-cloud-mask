package com.qiao.mask.user.common;

import com.qiao.mask.user.common.constant.ResultCode;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 */

@SuppressWarnings("unchecked")
public class BaseResultFactory {

    /**
     * 构建成功并返回的数据
     *
     * @param data 返回数据
     * @return
     */
    public static <T> BaseResult<T> createSuccessResult(Object data) {
        return new BaseResult(ResultCode.SUCCESS, data);
    }

    /**
     * 成功但不返回的数据
     *
     * @return
     */
    public static <T> BaseResult<T> createEmptyResult() {
        return new BaseResult<>(ResultCode.SUCCESS);
    }
}
