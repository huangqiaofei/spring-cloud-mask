package com.qiao.mask.common.utils.page;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author huangqf
 * @mail: 244154988@qq.com
 */
@Data
public class Query implements Serializable {
	private static final long serialVersionUID = 8933019121780323520L;
	/**
	 * 当前页
	 */
	private int pageNum = 1;
	/**
	 * 每页的数量
	 */
	private int pageSize = 20;
}
