package com;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hspedu.Cat;

public class Test {
	public  static void main(String []args){
//		
//		Cat c1 = new Cat(13);
//		Cat c2 = new Cat(13);
//		Cat c3 = new Cat(20);
		
		
		MyString str1 = new MyString("abc");
		
		System.out.println(MyString.class.getClassLoader().getResource(arg0))
		
//		System.out.println(str1.equals("abc"));
//			System.out.println(str1.equals("abc"));
//		
//		String a = new String("bac");
//	
//		System.out.println(a.charAt(2));
//		String a = new String("bac");
//	
//		System.out.println(a.charAt(2));
		
//		char val [] = a.toCharArray();
//		int h = 0;
//		for (int i = 0; i < val.length; i++) {
//            h = 31*h + val[i];
//            System.out.println(h);
//        }
//		System.out.println(h);
		
//		System.out.println(a.hashCode());
		
//		Integer i1 = 30;
//		int i3 =40;
//		Integer i2 = new Integer(20);
//		System.out.println(i1.compareTo(i2));
//		
//		System.out.println(i2.compareTo(i3)==-1 ?"abc":"bcd");
//		
//		System.out.println(c1.getClass().getSimpleName());
//		System.out.println(c1);
		
//		Integer i1 = 1;
//		System.out.println(i1.toString());
//		
//		
//		int i2 = i1;
//		System.out.println(i2);
//		
		
		
//		
//		System.out.println(c1.getClass());
//		System.out.println(c2.getClass());
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i =0;i<10000000;i++){
//			if(c1.equals("abc")){
//				
//			}
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end - start);
//		
//		start = System.currentTimeMillis();
//		
//		for(int i =0;i<10000000;i++){
//			if(10==c1.hashCode()){
//				
//			}			
//		}
//		 end = System.currentTimeMillis();
//		 System.out.println(end - start);
		
//		String sreq = "/BAYX/2022/04/01/ZL2720220425000004/testabc.text";
//		
//		int index = sreq.lastIndexOf("/");
//		System.out.println(index);
//		System.out.println(sreq.substring(0,index));
		
	/*
		String tel = "132****3363";
		
		System.out.println(isMobile(tel));
		
		
		String str = "guozije";
		String str2 = "abcdedf";
		System.out.println(str.length());
		
		int iStr1 =str.length();
		int istr2 = str2.length();
		
		char v1 []=str.toCharArray();
		char v2 []=str2.toCharArray();
		if(iStr1 == istr2){
			while(iStr1--!=0){
				if(v1[iStr1]!=v2[iStr1]){
					System.out.println("倒数第"+iStr1+"个元素不相等");
					break;
				}
			}
			
		}else{
			System.out.println("个数不相等");
		}
		*/
		
	}
	
	/*
	 * 中国电信号段 133、149、153、173、177、180、181、189、199
中国联通号段 130、131、132、145、155、156、166、175、176、185、186
中国移动号段 134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188、198
其他号段
14号段以前为上网卡专属号段，如中国联通的是145，中国移动的是147等等。
虚拟运营商
电信：1700、1701、1702
移动：1703、1705、1706
联通：1704、1707、1708、1709、171
卫星通信：1349

	 */
    public static boolean isMobile(String mobile) {
        String regex = "^((13[0-9])|(14[0,1,4-9])|(15[0-3,5-9])|(16[2,5,6,7])|(17[0-8])|(18[0-9])|(19[0-3,5-9]))\\d{8}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobile);
        return m.matches();
    }
}
