package com.qiao.mask.user.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 * <p>
 * 日志工具类
 */

public class LogUtils {

    public static final Log ERRORLOG = LogFactory.getLog("error");
    public static final Log WARNLOG = LogFactory.getLog("warn");
    public static final Log INFOLOG = LogFactory.getLog("info");
    public static final Log DEBUGLOG = LogFactory.getLog("debug");


    public LogUtils() {
    }

    public static void error(Object obj) {
        try {
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            location = stacks[2].getClassName() + "." + stacks[2].getMethodName() + "(" + stacks[2].getLineNumber() + ")";
            if (obj instanceof Exception) {
                Exception e = (Exception) obj;
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw, true));
                String str = sw.toString();
                ERRORLOG.error(location + str);
            } else {
                ERRORLOG.error(location + obj.toString());
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    public static void warn(Object obj) {
        try {
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            location = stacks[2].getClassName() + "." + stacks[2].getMethodName() + "(" + stacks[2].getLineNumber() + ")";
            if (obj instanceof Exception) {
                Exception e = (Exception) obj;
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw, true));
                String str = sw.toString();
                WARNLOG.warn(location + str);
            } else {
                WARNLOG.warn(location + obj.toString());
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    public static void info(Object obj) {
        try {
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            location = stacks[2].getClassName() + "." + stacks[2].getMethodName() + "(" + stacks[2].getLineNumber() + ")";
            if (obj instanceof Exception) {
                Exception e = (Exception) obj;
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw, true));
                String str = sw.toString();
                INFOLOG.info(location + str);
            } else {
                INFOLOG.info(location + obj.toString());
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    public static void debug(Object obj) {
        try {
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            location = stacks[2].getClassName() + "." + stacks[2].getMethodName() + "(" + stacks[2].getLineNumber() + ")";
            if (obj instanceof Exception) {
                Exception e = (Exception) obj;
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw, true));
                String str = sw.toString();
                DEBUGLOG.debug(location + str);
            } else {
                DEBUGLOG.debug(location + obj.toString());
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    public static String getCodeLocation() {
        try {
            String location = "";
            StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
            location = stacks[2].getClassName() + "." + stacks[2].getMethodName() + "(" + stacks[2].getLineNumber() + ")";
            return location;
        } catch (Exception var2) {
            error(var2);
            return "";
        }
    }
}
