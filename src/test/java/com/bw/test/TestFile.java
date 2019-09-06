package com.bw.test;

import java.util.Properties;

import org.junit.Test;

import com.bw.util.FileUtil;

public class TestFile {
	
	@Test
	public void testDel() {
		FileUtil.delFilePath("D:\\ec4 - ¸±±¾");
	}
	
	
	@Test
	public void TestPro() {
		
		Properties properties = System.getProperties();
		
		properties.forEach((key,value)->{
			System.out.println("key is : " + key);
			System.out.println("value is : " + value);
		});
	}
	
	
	
}
