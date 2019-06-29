package com.qiao.user.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
 * <p>
 * 日期工具类
 */

public class DateUtils {

    private static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前时间（格式 yyyy-MM-dd HH:mm:ss）
     *
     * @return 时间字符串
     */
    public static String now() {
        return convertDate2String(DATE_PATTERN);
    }

    /**
     * 获取昨天的时间（格式 yyyy-MM-dd HH:mm:ss）
     *
     * @return 时间字符串
     */
    public static String yesterday() {
        return add(Calendar.DATE, -1);
    }

    /**
     * 明天（格式 yyyy-MM-dd HH:mm:ss）
     *
     * @return 时间字符串
     */
    public static String tomorrow() {
        return add(Calendar.DATE, 1);
    }

    /**
     * 获取当前时间（格式 yyyy-MM-dd HH:mm:ss）
     *
     * @return 时间字符串
     */
    public static String today() {
        return convertDate2String("yyyy-MM-dd");
    }

    /**
     * 往后多少天
     *
     * @param field 日期类型
     * @param days  天数
     * @return 时间字符串
     */
    private static String add(int field, int days) {
        Calendar cal = getCalendar();
        cal.add(field, days);
        return convertDate2String(cal.getTime());
    }

    /**
     * 获取当前年份
     *
     * @return 当前年份
     */
    public static int year() {
        return getCalendar().get(Calendar.YEAR);
    }

    /**
     * 获取指定日期年份
     *
     * @param date 日期
     * @return 当前年份
     */
    public static int year(Date date) {
        return getCalendar(date).get(Calendar.YEAR);
    }

    /**
     * 获取当前月份
     *
     * @return 当前月份
     */
    public static int month() {
        return getCalendar().get(Calendar.MONTH) + 1;
    }

    /**
     * 获取指定日期月份
     *
     * @param date 日期
     * @return 当前月份
     */
    public static int month(Date date) {
        return getCalendar(date).get(Calendar.MONTH) + 1;
    }

    /**
     * 获取当前日
     *
     * @return 当前日
     */
    public static int day() {
        return getCalendar().get(Calendar.DATE);
    }

    /**
     * 获取指定日期月份
     *
     * @param date 日期
     * @return 当前日
     */
    public static int day(Date date) {
        return getCalendar(date).get(Calendar.DATE);
    }

    /**
     * 获取今天是这个月第几天，即几号了
     *
     * @return 几号
     */
    public static int dayInMonth() {
        return getCalendar().get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取指定日期这个月第几天，即几号了
     *
     * @param date 日期
     * @return 几号
     */
    public static int dayInMonth(Date date) {
        return getCalendar(date).get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取今天是星期几
     *
     * @return 星期几
     */
    public static int week() {
        return getCalendar().get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * 获取指定日期是星期几
     *
     * @param date 日期
     * @return 星期几
     */
    public static int week(Date date) {
        return getCalendar(date).get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * 获取这个月是第几周
     *
     * @return 第几周
     */
    public static int dayOfWeekInMonth() {
        return getCalendar().get(Calendar.DAY_OF_WEEK_IN_MONTH);
    }

    /**
     * 获取指定日期是第几周
     *
     * @param date 日期
     * @return 第几周
     */
    public static int dayOfWeekInMonth(Date date) {
        return getCalendar(date).get(Calendar.DAY_OF_WEEK_IN_MONTH);
    }

    /**
     * 获取今天是今年第几天
     *
     * @return 第几天
     */
    public static int dayInYear() {
        return getCalendar().get(Calendar.DAY_OF_YEAR);
    }

    /**
     * 获取指定日期是第几天
     *
     * @param date 日期
     * @return 第几天
     */
    public static int dayInYear(Date date) {
        return getCalendar(date).get(Calendar.DAY_OF_YEAR);
    }

    /**
     * 转换日期格式为yyyy-MM-dd
     *
     * @param date 待转换的日期
     * @return 日期字符串
     */
    public static String convertDate2String(Date date) {
        return convertDate2String(date, DATE_PATTERN);
    }

    /**
     * 转换当前日期为指定的格式
     *
     * @param pattern 格式
     * @return 日期字符串
     */
    public static String convertDate2String(String pattern) {
        return convertDate2String(new Date(), pattern);
    }

    /**
     * 转换格式为yyyy-mm-dd HH:mm:ss的日期字符串转化为指定格式的字符串
     *
     * @param strDate 待转换的日期，格式为：yyyy-mm-dd HH:mm:ss
     * @param pattern 结果所需的格式
     * @return 字符串
     */
    public static String convertDate2String(String strDate, String pattern) {
        return convertDate2String(strDate, DATE_PATTERN, pattern);
    }

    /**
     * 转换格式为yyyy-mm-dd HH:mm:ss的日期字符串转化为指定格式的字符串
     *
     * @param strDate    待转换的日期，格式为：yyyy-mm-dd HH:mm:ss
     * @param patternSrc 待转日期格式
     * @param patternDes 结果所需的格式
     * @return 日期字符串
     */
    public static String convertDate2String(String strDate, String patternSrc, String patternDes) {
        return convertDate2String(convertString2Date(strDate, patternSrc), patternDes);
    }

    /**
     * 转换日期为指定的格式
     *
     * @param date    待转换的日期对象
     * @param pattern 格式
     * @return 日期字符串
     */
    public static String convertDate2String(Date date, String pattern) {
        SimpleDateFormat df;
        String returnValue = "";

        if (date != null) {
            df = new SimpleDateFormat(pattern);
            returnValue = df.format(date);
        }

        return returnValue;
    }

    /**
     * 转换yyyy-MM-dd格式的字符串转化为日期
     *
     * @param strDate 待转换的字符串
     * @return 日期
     */
    public static Date convertString2Date(String strDate) {
        return convertString2Date(strDate, DATE_PATTERN);
    }

    /**
     * 转换指定的格式字符串转化为日期
     *
     * @param strDate 待转换的字符串
     * @param pattern 格式
     * @return 日期
     */
    public static Date convertString2Date(String strDate, String pattern) {
        SimpleDateFormat df;
        Date date = null;

        if (strDate != null) {
            df = new SimpleDateFormat(pattern);
            try {
                date = df.parse(strDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return date;
    }

    /**
     * 获取日历
     *
     * @return 日历
     */
    public static Calendar getCalendar() {
        return Calendar.getInstance();
    }

    /**
     * 获取日历
     *
     * @param date 日历
     */
    public static Calendar getCalendar(Date date) {
        Calendar c = getCalendar();
        c.setTime(date);
        return c;
    }

    /**
     * 获取日期
     *
     * @return 日期
     */
    public static Date getDate(int year, int month, int day) {
        Calendar c = getCalendar();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DATE, day);
        return c.getTime();
    }

    /**
     * 获取日期绝对差
     *
     * @param d1    日期1
     * @param d2    日期2
     * @param field Calendar字段，YEAR、MONTH等
     * @return 日期差
     */
    public static long diff(Date d1, Date d2, int field) {
        long ms = d2.getTime() - d1.getTime();
        //如果d2在d1前面
        if (getCalendar(d2).before(getCalendar(d1))) {
            //记录后一个日期
            Date d0 = d2;
            d2 = d1;
            d1 = d0;
        }
        long res = 0;
        switch (field) {
            case Calendar.YEAR:
                Calendar c = getCalendar(d2);
                //将年设置成相同的
                c.set(Calendar.YEAR, year(d1));
                //然后比较日期前后关系，如果d0在d1前面，年份-1
                res = year(d2) - year(d1) - (c.before(getCalendar(d1)) ? 1 : 0);
                break;

            case Calendar.MONTH:
                int years = year(d2) - year(d1);
                Calendar c1 = getCalendar(d2);
                //将年设置成相同的
                c1.set(Calendar.YEAR, year(d1));
                //然后比较日期前后关系，如果d0在d1前面，月份-1
                c1.set(Calendar.MONTH, month(d1) - 1);
                res = (month(d2) >= month(d1) ? (month(d2) - month(d1)) : (month(d2) + 12 - month(d1)) % 12) + years * 12 - (c1.before(getCalendar(d1)) ? 1 : 0);
                break;

            case Calendar.WEEK_OF_YEAR:
                res = ms / (7 * 24 * 60 * 60 * 1000);
                break;

            case Calendar.DATE:
                res = ms / (24 * 60 * 60 * 1000);
                break;

            case Calendar.HOUR:
                res = ms / (60 * 60 * 1000);
                break;

            case Calendar.MINUTE:
                res = ms / (60 * 1000);
                break;

            case Calendar.SECOND:
                res = ms / (1000);
                break;

            case Calendar.MILLISECOND:
                res = ms;
                break;

            default:
                break;
        }
        return res;
    }


    /**
     * 农历
     *
     * @version 1.0
     * @date 2015年12月23日 下午1:54:19
     */
    public static class Lunar {
        /**
         * 支持转换的最小农历年份
         */
        private static int MIN_YEAR = 1900;
        /**
         * 支持转换的最大农历年份
         */
        private static int MAX_YEAR = 2049;

        /**
         * 农历信息1900-2099
         * 数据结构如下，共使用17位数据
         * 第17位：表示闰月天数，0表示29天   1表示30天
         * 第16位-第5位（共12位）表示12个月，其中第16位表示第一月，如果该月为30天则为1，29天为0
         * 第4位-第1位（共4位）表示闰月是哪个月，如果当年没有闰月，则置0
         */
        private static long[] LUNAR_INFO = new long[]{0x04bd8, 0x04ae0, 0x0a570, 0x054d5,
                0x0d260, 0x0d950, 0x16554, 0x056a0, 0x09ad0, 0x055d2, 0x04ae0,
                0x0a5b6, 0x0a4d0, 0x0d250, 0x1d255, 0x0b540, 0x0d6a0, 0x0ada2,
                0x095b0, 0x14977, 0x04970, 0x0a4b0, 0x0b4b5, 0x06a50, 0x06d40,
                0x1ab54, 0x02b60, 0x09570, 0x052f2, 0x04970, 0x06566, 0x0d4a0,
                0x0ea50, 0x06e95, 0x05ad0, 0x02b60, 0x186e3, 0x092e0, 0x1c8d7,
                0x0c950, 0x0d4a0, 0x1d8a6, 0x0b550, 0x056a0, 0x1a5b4, 0x025d0,
                0x092d0, 0x0d2b2, 0x0a950, 0x0b557, 0x06ca0, 0x0b550, 0x15355,
                0x04da0, 0x0a5d0, 0x14573, 0x052d0, 0x0a9a8, 0x0e950, 0x06aa0,
                0x0aea6, 0x0ab50, 0x04b60, 0x0aae4, 0x0a570, 0x05260, 0x0f263,
                0x0d950, 0x05b57, 0x056a0, 0x096d0, 0x04dd5, 0x04ad0, 0x0a4d0,
                0x0d4d4, 0x0d250, 0x0d558, 0x0b540, 0x0b5a0, 0x195a6, 0x095b0,
                0x049b0, 0x0a974, 0x0a4b0, 0x0b27a, 0x06a50, 0x06d40, 0x0af46,
                0x0ab60, 0x09570, 0x04af5, 0x04970, 0x064b0, 0x074a3, 0x0ea50,
                0x06b58, 0x055c0, 0x0ab60, 0x096d5, 0x092e0, 0x0c960, 0x0d954,
                0x0d4a0, 0x0da50, 0x07552, 0x056a0, 0x0abb7, 0x025d0, 0x092d0,
                0x0cab5, 0x0a950, 0x0b4a0, 0x0baa4, 0x0ad50, 0x055d9, 0x04ba0,
                0x0a5b0, 0x15176, 0x052b0, 0x0a930, 0x07954, 0x06aa0, 0x0ad50,
                0x05b52, 0x04b60, 0x0a6e6, 0x0a4e0, 0x0d260, 0x0ea65, 0x0d530,
                0x05aa0, 0x076a3, 0x096d0, 0x04bd7, 0x04ad0, 0x0a4d0, 0x1d0b6,
                0x0d250, 0x0d520, 0x0dd45, 0x0b5a0, 0x056d0, 0x055b2, 0x049b0,
                0x0a577, 0x0a4b0, 0x0aa50, 0x1b255, 0x06d20, 0x0ada0
        };

        /**
         * 天干、地支、属相
         */
        private static String[] GAN = new String[]{"甲", "乙", "丙", "丁",
                "戊", "己", "庚", "辛", "壬", "癸"};
        private static String[] ZHI = new String[]{"子", "丑", "寅", "卯",
                "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
        private static String[] ANIMALS = new String[]{"鼠", "牛", "虎",
                "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};

        /**
         * 月份日期
         */
        private static String[] CHINESE_TEN = {"初", "十", "廿", "卅"};
        private static String[] CHINESE_DAY = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
        private static String[] CHINESE_MONTH = {"正月", "二月", "三月", "四月",
                "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "腊月"};

        /**
         * 获取指定农历年的总天数
         *
         * @param year 年份
         * @return 天数
         */
        public static int days4YearInLunar(int year) {
            int i, sum = 348;
            for (i = 0x8000; i > 0x8; i >>= 1) {
                if ((LUNAR_INFO[year - MIN_YEAR] & i) != 0) {
                    sum += 1;
                }
            }
            return (sum + days4LeapInLunar(year));
        }

        /**
         * 获取指定农历年闰月的天数
         *
         * @param year 年份
         * @return 天数
         */
        public static int days4LeapInLunar(int year) {
            if (leapMonth(year) != 0) {
                if ((LUNAR_INFO[year - MIN_YEAR] & 0x10000) != 0) {
                    return 30;
                } else {
                    return 29;
                }
            } else {
                return 0;
            }
        }

        /**
         * 获取指定农历年某月的总天数
         *
         * @param year  年份
         * @param month 月份
         * @return 天数
         */
        public static int days4MonthInLunar(int year, int month) {
            if ((LUNAR_INFO[year - MIN_YEAR] & (0x10000 >> month)) == 0) {
                return 29;
            } else {
                return 30;
            }
        }

        /**
         * 获取指定农历年闰月月份，没闰月返回 0
         *
         * @param year 年份
         * @return 天数
         */
        public static int leapMonth(int year) {
            return (int) (LUNAR_INFO[year - MIN_YEAR] & 0xf);
        }

        /**
         * ########################################
         * ########### 公历 转 农历计算 ###############
         * ########################################
         * ====================================== 算出农历, 传入日期物件, 传回农历日期物件
         * <p>
         * 该物件属性有 .year .month .day .isLeap .yearCyl .dayCyl .monCyl
         *
         * @param date 日期
         */
        public static String getLunar(Date date) {
            return getLunar(date, false);
        }

        public static String getLunar(Date date, boolean showTGDZ) {
            // 记录农历日期
            int year, month, day;
            // 记录闰月
            int leap;
            int temp = 0;
            int yearCyl, monCyl, dayCyl;//天干地支年月日

            int i;
            boolean isLeap = false;

            // 1900-01-31是农历1900年正月初一
            // 获取毫秒数
            Date baseDate = getCalendar(convertString2Date("1900-01-31", "yyyy-mm-dd")).getTime();

            // 计算当前日期距1900-01-31的天数
            // 天数
            int offset = (int) ((date.getTime() - baseDate.getTime()) / (24 * 60 * 60 * 1000));
            //1899-12-21是农历1899年腊月甲子日
            dayCyl = offset + 40;
            //1898-10-01是农历甲子月
            monCyl = 14;

            // 计算当前日期距1900-01-31的年数
            for (i = MIN_YEAR; i <= MAX_YEAR && offset > 0; i++) {
                // 农历每年天数
                temp = days4YearInLunar(i);
                offset -= temp;
                monCyl += 12;
            }
            if (offset < 0) {
                offset += temp;
                i--;
                monCyl -= 12;
            }
            // 记录农历年
            year = i;
            yearCyl = year - MIN_YEAR + 36;
            // 计算闰哪个月
            leap = leapMonth(i);

            for (i = 1; i <= 12 && offset > 0; i++) {
                // 是闰月
                if (leap > 0 && i == (leap + 1) && !isLeap) {
                    --i;
                    isLeap = true;
                    // 计算农历闰月天数
                    temp = days4LeapInLunar(year);
                } else {
                    // 计算农历某月天数
                    temp = days4MonthInLunar(year, i);
                }
                // 解除闰月
                if (isLeap && i == (leap + 1)) {
                    isLeap = false;
                }
                offset -= temp;
                if (!isLeap) {
                    monCyl++;
                }
            }

            // 正好是闰月
            if (offset == 0 && leap > 0 && i == leap + 1) {
                if (isLeap) {
                    isLeap = false;
                } else {
                    isLeap = true;
                    --i;
                    --monCyl;
                }
            }
            if (offset < 0) {
                offset += temp;
                --i;
                --monCyl;
            }
            // 农历月份
            month = i;
            // 农历天份
            day = offset + 1;
            return getChinaString(year, month, day, yearCyl, monCyl, dayCyl, isLeap, showTGDZ);
        }

        // ########################################
        // ########### 生肖、天干、地支 ###############
        // ########################################

        /**
         * 获取农历 y年的生肖
         *
         * @return 生肖
         */
        public static String animalsYear(int year) {
            return ANIMALS[(year - 4) % 12];
        }

        /**
         * 传入月日的offset 获取干支, 0=甲子
         *
         * @param num 偏移量
         * @return 干支
         */
        public static String animalsCycle(int num) {
            return (GAN[num % 10] + ZHI[num % 12]);
        }

        // #################################################
        // ########### 下面是转汉字部分 ###############
        // #################################################

        /**
         * 农历转汉字
         *
         * @param year     农历年份
         * @param month    农历月份
         * @param day      农历日
         * @param monthCyl 天干地支月份
         * @param dayCyl   天干地支日
         * @param isLeap   是否是闰月
         * @param showTGDZ 是否显示天干地支
         * @return 农历
         */
        private static String getChinaString(int year, int month, int day, int yearCyl, int monthCyl, int dayCyl, boolean isLeap, boolean showTGDZ) {
            StringBuilder res = new StringBuilder();
            //显示天干地支
            if (showTGDZ) {
                res.append(animalsCycle(yearCyl))
                        .append("年【")
                        .append(getYearInChinese(year))
                        .append("】")
                        .append((isLeap ? "闰" : "")).append(getMonthInChinese(month))
                        .append(getDayInChinese(day))
                        .append("（")
                        .append(animalsCycle(monthCyl))
                        .append("月 ")
                        .append(animalsCycle(dayCyl))
                        .append("日")
                        .append("）");
            } else {
                res.append(getYearInChinese(year))
                        .append((isLeap ? " 闰" : " ")).append(getMonthInChinese(month))
                        .append(getDayInChinese(day));
            }
            return res.toString();
        }

        /**
         * 农历月份转汉字
         *
         * @param year 农历年份
         * @return 月份
         */
        private static String getYearInChinese(int year) {
            if (year <= MIN_YEAR || year > MAX_YEAR) {
                return "出错";
            }
            return animalsYear(year) + "年";
        }

        /**
         * 农历月份转汉字
         *
         * @param month 农历月份
         * @return 月份
         */
        private static String getMonthInChinese(int month) {
            if (month <= 0 || month > 12) {
                return "出错";
            }
            return CHINESE_MONTH[month - 1];
        }

        /**
         * 农历日期转汉字
         *
         * @param day 农历日
         * @return 日期
         */
        private static String getDayInChinese(int day) {
            int n = day % 10 == 0 ? 9 : day % 10 - 1;
            if (day > 30) {
                return "出错";
            }
            if (day == 10) {
                return "初十";
            } else {
                return CHINESE_TEN[day / 10] + CHINESE_DAY[n];
            }
        }
    }


    /**
     * 获取时间戳当天0时0分0秒的时间戳
     *
     * @param timestamp 时间戳
     * @return 时间戳
     */
    public static long getDayFirstTime(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTimeInMillis();
    }

    public static long getDayOfAnyTime(long timestamp, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        return calendar.getTimeInMillis();
    }

    public static String getDayOfTimestamp(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static String getDayOfTimestamp(String timestamp) {
        return getDayOfTimestamp(new Long(timestamp));
    }

}
