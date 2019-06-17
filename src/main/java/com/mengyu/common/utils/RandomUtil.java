package com.mengyu.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: (1)随机数工具类(RandomUtil.java)
 * @author: mengyu
 * @date: 2019年6月17日 上午8:41:31
 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），
	//例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
	//TODO 实现代码
		Random r=new Random();
		int i=r.nextInt(max-min+1)+min;
		return i;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static Set subRandom (int min, int max, int subs){
	//TODO 实现代码
		Random r=new Random();
		Set s=new HashSet();
		while(s.size()<subs) {
			int i=r.nextInt(max-min+1)+min;
			s.add(i);
		}
		return s;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
	//TODO 实现代码
		String str="123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		Random r=new Random();
		int i=r.nextInt(str.length())+1;
		return str.charAt(i);
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
	//TODO 实现代码
		String str="";
		for (int i = 0; i < length; i++) {
			char randomCharacter = randomCharacter();
			str+=randomCharacter;
		}
		return str;
	}
}
