package com.mengyu.common.utils;

import java.text.Format;
import java.util.Random;

public class DateUtil {
    public static String created() {
    	String datea="";
    	int year = RandomUtil.random(2000, 2019);
    	datea+=year+"年";
    	int month = RandomUtil.random(1, 12);
    	datea+=month+"月";
    	int day;
    	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
    		day = RandomUtil.random(1, 31);
    	}else {
    		if(month==2&&year%4==0) {
    		  day = RandomUtil.random(1, 29);
    		}else {
    			if(month==2&&year%4!=0) {
    				day = RandomUtil.random(1, 28);
    			}else {
    			    day = RandomUtil.random(1, 30);
    			}
    		}
    	}
    	datea+=day+"日";
    	return datea;
    }
}
