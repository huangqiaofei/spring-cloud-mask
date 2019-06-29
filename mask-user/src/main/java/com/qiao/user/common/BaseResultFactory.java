package com.qiao.user.common;


import com.qiao.user.common.constant.Code;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
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
        return new BaseResult(Code.SUCCESS, data);
    }

    /**
     * 成功但不返回的数据
     *
     * @return
     */
    public static <T> BaseResult<T> createEmptyResult() {
        return new BaseResult<>(Code.SUCCESS);
    }
}
