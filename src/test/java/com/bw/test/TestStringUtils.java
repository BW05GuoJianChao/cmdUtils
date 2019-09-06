package com.bw.test;

import org.junit.Test;

import com.bw.util.StringUtils;

/**
 * 
 * @author zhuzg
 *
 */
public class TestStringUtils {
	
	@Test
	public void testTel() {
		String tel1="13583679291";
		String tel2="14583679291";
		boolean b1 = StringUtils.isTelephone(tel1);
		boolean b2 = StringUtils.isTelephone(tel2);
		
		System.out.println(" b1 is : " + b1);
		System.out.println(" b2 is : " + b2);
		
	}
	
	
	@Test
	public void testEmail() {
		
		String e1="zhuzg@sohu.com";
		String e2="zhang@zhang@zhang.tttt";
		boolean b1 = StringUtils.isEmail(e1);
		boolean b2 = StringUtils.isEmail(e2);
		
		System.out.println(" b1 is : " + b1);
		System.out.println(" b2 is : " + b2);
		
	}
	
	@Test
	public void TestCnStr() {
		System.out.println("ÖÐÎÄ×Ö·ûÊÇ£º" + StringUtils.getRandonCnStr(6));		
	}
		
}
