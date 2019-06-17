package com.mengyu.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
/**
 * 
 * @ClassName: StringUtilTest 
 * @Description: 测试字符串工具类
 * @author: mengyu
 * @date: 2019年6月17日 上午8:43:22
 */
public class StringUtilTest {
    /**
     * 
     * @Title: test 
     * @Description: 判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
     * @return: void
     */
	@Test
	public void test() {
		String src=" ";
		boolean l = StringUtil.hasLength(src);
		System.out.println(l);
	}
	 /**
     * 
     * @Title: test 
     * @Description: 判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
     * @return: void
     */
	@Test
	public void test1() {
		String src="ds ";
		boolean l = StringUtil.hasText(src);
		System.out.println(l);
	}
	 /**
     * 
     * @Title: test 
     * @Description: 返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内
     * @return: void
	 * @throws UnsupportedEncodingException 
     */
	@Test
	public void test2() throws UnsupportedEncodingException {
		String string = StringUtil.randomChineseString(7);
		System.out.println(string);
	}
	/**
     * 
     * @Title: test 
     * @Description: 返返回中文姓名，必须以真实姓开头，
     * @return: void
	 * @throws UnsupportedEncodingException 
     */
	@Test
	public void test3() throws UnsupportedEncodingException {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
}
