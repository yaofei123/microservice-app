/*
 * Copyright (C) 2017 北京好药师大药房连锁有限公司(www.ehaoyao.com) , All Rights Reserved.
 */

package com.ehaoyao.ordercenter.framework.exception;

/**
 * @Description 异常常量定义
 * @Author cuiyaosheng
 * @Date 2017-12-23 10:32
 * @Modified by:
 **/
public abstract  class ExceptionConstants {
    public static final String SUCCESS = "success";
    public static final String FAILURE = "failure";

    public static final Integer STATUS_CODE_PAGE_EXCEPTION = 400;
    public static final String STATUS_CODE_PAGE_EXCEPTION_MESSAGE = "客户端分页请求参数错误!";
}