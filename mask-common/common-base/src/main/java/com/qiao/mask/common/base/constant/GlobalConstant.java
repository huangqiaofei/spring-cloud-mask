package com.qiao.mask.common.base.constant;

/**
 * @author huangqf
 * @description:
 * @mail: mr.huangqf@gmail.com
 */
public class GlobalConstant {

    /**
     * The constant FILE_MAX_SIZE.
     */
    public static final long FILE_MAX_SIZE = 5 * 1024 * 1024;
    public static final String UNKNOWN = "unknown";

    public static final String X_FORWARDED_FOR = "X-Forwarded-For";
    public static final String X_REAL_IP = "X-Real-IP";
    public static final String PROXY_CLIENT_IP = "Proxy-Client-IP";
    public static final String WL_PROXY_CLIENT_IP = "WL-Proxy-Client-IP";
    public static final String HTTP_CLIENT_IP = "HTTP_CLIENT_IP";
    public static final String HTTP_X_FORWARDED_FOR = "HTTP_X_FORWARDED_FOR";


    public static final String LOCALHOST_IP = "127.0.0.1";
    public static final String LOCALHOST_IP_16 = "0:0:0:0:0:0:0:1";
    public static final int MAX_IP_LENGTH = 15;


    /**
     * 系统常量
     */
    public static final class Sys {

        private Sys() {
        }

        /**
         * 全局用户名
         */
        public static final String TOKEN_AUTH_DTO = "CURRENT_USER_DTO";

        /**
         * 超级管理员的用户ID
         */
        public static final Long SUPER_MANAGER_USER_ID = 1L;
        /**
         * 超级管理员的用户编号
         */
        public static final String SUPER_MANAGER_LOGIN_NAME = "admin";
        /**
         * 超级管理员角色ID
         */
        public static final Long SUPER_MANAGER_ROLE_ID = 1L;
        /**
         * 超级管理员组织ID
         */
        public static final Long SUPER_MANAGER_GROUP_ID = 1L;
        /**
         * 运营工作台ID
         */
        public static final Long OPER_APPLICATION_ID = 1L;

        /**
         * The constant MENU_ROOT.
         */
        public static final String MENU_ROOT = "root";

        /**
         * The constant DEFAULT_FILE_PATH.
         */
        public static final String DEFAULT_FILE_PATH = "mask/file/";

        /**
         * redis key default expire = 1MINUTES
         */
        public static final long REDIS_DEFAULT_EXPIRE = 1L;
    }


    public static final class Symbol {
        private Symbol() {
        }

        /**
         * The constant COMMA.
         */
        public static final String COMMA = ",";
        public static final String SPOT = ".";
        /**
         * The constant UNDER_LINE.
         */
        public final static String UNDER_LINE = "_";
        /**
         * The constant PER_CENT.
         */
        public final static String PER_CENT = "%";
        /**
         * The constant AT.
         */
        public final static String AT = "@";
        /**
         * The constant PIPE.
         */
        public final static String PIPE = "||";
        public final static String SHORT_LINE = "-";
        public final static String SPACE = " ";
        public static final String SLASH = "/";
        public static final String MH = ":";

    }


    public static final class Oss {
        private Oss() {
        }

        /**
         * The constant DEFAULT_FILE_PATH.
         */
        public static final String DEFAULT_FILE_PATH = "/default/";
    }


    /**
     * 图片压缩高度和宽度
     */
    public static final int IMAGE_WIDTH = 1920;
    /**
     * The constant IMAGE_HEIGHT.
     */
    public static final int IMAGE_HEIGHT = 1280;

    /**
     * The constant Y.
     */
    public static final Integer Y = 1;
    /**
     * The constant N.
     */
    public static final Integer N = 0;

}
