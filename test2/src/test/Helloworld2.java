package test;

import java.io.IOException;
import java.util.Date;

public class Helloworld2 {
		public static void main(String[] args) {
			System.out.println("hhhhhh");
			System.out.println("hhhhhh");
			System.out.println("而纷所发生的纷发出");
			String ids = "1,2,3,";
			String[] split = ids.split(",");
			System.out.println("isd====" +split.length);
			int a = 10 ;
			int b = 3 ;
			System.out.println(a/b);
			Date da1 = new Date();
			long time = da1.getTime();
			
			
			///////////////////////////////
				String str=null;
			   try {
				   System.out.println("111111");
				 // throw   new RuntimeException("编号已经存在");
				  
			   } catch (Exception e) {
					e.printStackTrace();
				}
			
			   try {
				   System.out.println("3333333");
			   } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			   Date da2 = new Date();
			
			long time2 = da2.getTime();
			   System.out.println("3333333==="+(time2-time));
			   System.out.println("1==="+time);
			   System.out.println("2==="+time2);
			
			
		} 
}
