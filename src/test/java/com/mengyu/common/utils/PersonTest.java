package com.mengyu.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() throws UnsupportedEncodingException {
		for (int i = 0; i < 10000; i++) {
			Person p=new Person(StringUtil.generateChineseName(),
					RandomUtil.random(1, 120), 
					StringUtil.randomChineseString(1),DateUtil.created()+"");
			System.out.println(p);
		}
		
	}

}
