package com.wyf.until;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	
	/**
	 * 
	    * @Title: closeAll
	    * @Description: TODO批量关闭流
	    * @param @param autoCloseables   
	    * @return void    
	    * @throws
	 */
	public static void closeAll(AutoCloseable...autoCloseables) {
		if(autoCloseables==null||autoCloseables.length==0) {
			throw new RuntimeException("参数异常");
		}
		for (AutoCloseable autoCloseable : autoCloseables) {
			try {
				autoCloseable.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	/**
	 * 
	    * @Title: readTextFile
	    * @Description: TODO读取文件到集合
	    * @param @param src
	    * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	    * @param @return   
	    * @return String    
	    * @throws
	 */
	public static String readTextFile(InputStream src) {
		
		byte[] b=new byte[1024];
		int len;
		try {
			while ((len=src.read(b))!=-1) {
				return	new String(b, 0, len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法
	    * @Title: readTextFile
	    * @Description: TODO
	    * @param @param file
	    * @param @return   
	    * @return String    
	    * @throws
	 */
	public static String  readTextFile(File file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			String str = readTextFile(fis);
			return str;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	    * @Title: readTextFileList
	    * @Description: TODO
	    * @param @param 将文件内容存入集合
	    * @param @return   
	    * @return List<String>    
	    * @throws
	 */
	public static List<String> readTextFileList(File file){
		
		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String str="";
			while ((str=br.readLine())!=null) {
				list.add(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
