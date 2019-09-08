package com.bw.util;

import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author zhuzg
 *
 */
public class StringUtils {
	
	
	
	/**
	 *  依赖日考工具包工程中添加  toHtml ()，方法，用于将前端<textarea>框
                 中的传来的字符转成 html 文本，遇到“\n”符时，要用<p></p>将这一段
                 字符包起来
	 * @param src
	 * @return
	 */
	public static String toHtml(String src) {
		
		String[] strings = src.split("\\\r");
		StringBuilder sb = new StringBuilder();
		for (String string : strings) {
			sb.append("<p>").append(string).append("</p>");
		}
		return sb.toString();
		
	}
	
	/**
	 *  
	 * @param str
	 * @return  
	 */
	public static  boolean isEmpty(String str) {
		
		return (null==str||"".equals(str.trim()));
	}
	
	
	/**
	 * 是否有值
	判断源字符串是否有值，空引号和空格也算没值
	 * @param str
	 * @return
	 */
	public static boolean isHasValue(String str) {
		
		// 以下两种写法都对
		//return !(null ==str || "".equals(str.trim()));
		return (null !=str && !"".equals(str.trim()));
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isTelephone(String str) {
		String pattern = "^(136|135|137)\\d{8}$";
		return str.matches(pattern);
	}
	
	/**
	 *  
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		
		String pattern = "^\\w+@\\w+\\.[a-zA-Z]{2,3}$";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 验证全为字母
	 * @param str
	 * @return
	 */
	public static boolean isLetter(String str) {
		String pattern = "^[a-zA-Z]+$";
		return str.matches(pattern);
	}
	
	/**
	 * 
	 * 获取n位随机英文字符串
	 * @param n
	 * @return
	 */
	public String randomLetterStr(int n) {
		
		if(n<=0)
			return "";
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			char letter = (char)('A' + random.nextInt(26));
			sb.append(letter);
		}		
		return sb.toString();
	}
	
	/**
	 * 获取n位随机英文和数字字符串
	 * @param n
	 * @return
	 */
	public String randomStr(int n) {
		
		char chars[]= {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N'};
		
		// 定义个随机对象
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			// 随机得到一个下标，根据下标从数组当中获取值，拼接到字符串上
			
			// 随机获取一个下标
			int index = random.nextInt(chars.length);
			char c = chars[index];
			sb.append(c);//向后拼接
			
			/*sb.append( chars[random.nextInt(chars.length)]
					);*/
			
		}
		return sb.toString();
		
	}
	
	//获取n个随机中文字符串
	public static String getRandonCnStr(int n) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(getOneCn());
		}
		return sb.toString();
		
	} 
	
	/**
	 * 随机获取一个中文字符
	 * @return
	 */
	private static String getOneCn(){
		
		String str = "";
        int hightPos; //
        int lowPos;
        Random random = new Random();

        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("错误");
        }

        return str;
	}
	
	
	
	
	
	
	
}
