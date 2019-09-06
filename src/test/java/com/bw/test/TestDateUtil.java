package com.bw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.bw.util.DateUtil;

public class TestDateUtil {
	
	@Test
	public void testLastDate() throws ParseException {
		
		Date end = DateUtil.getMonthEnd(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(" end is " + end );
		System.out.println(" end is " + format.format(end) );
		
	}

}
