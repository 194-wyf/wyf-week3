 package com.wyf.until;

import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class DateUtil {

	public static Date random(Date min,Date max) {
		long t1=min.getTime();
		long t2=max.getTime();
		long t = (long) (Math.random()*((t2-t1)+t1));
		return new Date(t);
	}
	/**
	 * 
	    * @Title: getIntMonth
	    * @Description: 根据日期返回月初值
	    * @param @param date
	    * @param @return   
	    * @return Date    
	    * @throws
	 */
	public static Date getIntMonth(Date date) {
		
		//初始化一个日历类,可以设置日期，也可以加减日期，方便对日期进行运算
		Calendar c = Calendar.getInstance();
		//用传入的日期去初始化日历类
		c.setTime(date);
		//设置月初即改变日期为第一天
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	/**
	 * 
	    * @Title: getIntMonth
	    * @Description: 根据日期返回月末值
	    * @param @param date
	    * @param @return   
	    * @return Date    
	    * @throws
	 */
	public static Date getEndMonth(Date date) {
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, 1);
		Date intMonth = getIntMonth(c.getTime());
		c.setTime(intMonth);
		c.add(Calendar.SECOND, -1);
		//让月加1，下个月初-1
		return c.getTime();
	}
	/**
	 * 
	    * @Title: getAgeByBrithday
	    * @Description: TODO 根据日期计算年龄
	    * @param @param date
	    * @param @return   
	    * @return int    
	    * @throws
	 */
	public static int getAgeByBrithday(Date date) {
		Calendar c1 = Calendar.getInstance();
		int now = c1.get(Calendar.YEAR);
		int nowMonth = c1.get(Calendar.MONTH);
		int nowDate = c1.get(Calendar.DAY_OF_MONTH);
		//获取传入日期说的年
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date);
		int birthday = c2.get(Calendar.YEAR);
		int BirthMonth = c2.get(Calendar.MONTH);
		int BirthDate = c1.get(Calendar.DAY_OF_MONTH);
		//年份相减得到年龄
		if(now<birthday) {
			throw new RuntimeException("日期错误");
		}
		int age=now-birthday;
		if(nowMonth<BirthMonth) {
			//如果当前月份小于出生月扥
			age--;
		}else if(nowMonth==BirthMonth && nowDate<BirthDate) {
			age--;
		}
		return age;
		
	}
}
