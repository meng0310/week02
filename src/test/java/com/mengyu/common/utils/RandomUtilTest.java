package com.mengyu.common.utils;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
/**
 * 
 * @ClassName: RandomUtilTest 
 * @Description:测试随机数工具类
 * @author: mengyu
 * @date: 2019年6月17日 上午8:42:56
 */
public class RandomUtilTest {
    /**
     * 
     * @Title: test 
     * @Description: 方法1：返回min-max之间的随机整数（包含min和max值），
	            例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
     * @return: void
     */
	@Test
	public void test() {
		int i = RandomUtil.random(1, 3);
		System.out.println(i);
	}
	/**
     * 
     * @Title: test 
     * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数
     * @return: void
     */
	@Test
	public void test1() {
		Set s = RandomUtil.subRandom(1, 4, 4);
		System.out.println(s);
	}
	/**
     * 
     * @Title: test 
     * @Description: 返回1个1-9,a-Z之间的随机字符
     * @return: void
     */
	@Test
	public void test2() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}
	/**
     * 
     * @Title: test 
     * @Description: 返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 
     * @return: void
     */
	@Test
	public void test3() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}
}
