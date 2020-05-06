package com.wyf.until;

import java.util.Random;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class RandomUtil {

	public static int random(int min,int max) {
		Random random = new Random();
		int nextint=random.nextInt(max-min+1)+min;
		return nextint;
		
	}

	/*
	 * public static int random() { int[] i= {1,2,3,4,5,6,7,8,9,0}; return random(0,
	 * 9); }
	 */
	public static String random(int length) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			buffer.append(random(0, 9));
		}
		return buffer.toString();
	}
}
