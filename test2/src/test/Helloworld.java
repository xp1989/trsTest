package test;

import java.util.Arrays;
import java.util.List;

public class Helloworld {
private 	int age ;
	private String name;
		public static void main(String[] args) {
		 
			String str[] = {"1 1","1  2","1   3"};
			System.out.println("////////////////////////////////");
			
			List<String> asList = Arrays.asList(str);
			System.out.println(asList);
			String string = asList.toString();
			System.out.println(string);
			String replace = string.replace("[", "");
			System.out.println(replace);
			String replace2 = replace.replace("]", "");
			System.out.println(replace2);
			
			String replace3 = replace.replaceAll(" ", "");
			System.out.println(replace3);
			
			
			System.out.println("////////////////////////////////");
			
			
			
			
			
			
			System.out.println("22222222222222222222222222");
			System.out.println("333发生的范德萨");
			System.out.println("第二个eclipse项目添加文件");

			System.out.println("22");
			System.out.println("333发生的范德萨");
		

			System.out.println("第一个在第二个添加后重新修改后提交");
			Helloworld hl = new Helloworld();
		 
			System.out.println(hl.age);
			}

}
