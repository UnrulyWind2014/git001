package com.reflection.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.hspedu.Cat;

public class ReflectionQuestion {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
		
		//传统方式
//		Cat cat = new Cat();
//		cat.hi();
		
		
		Properties p = new Properties();
		p.load(new FileInputStream("src\\re.properities"));
		
		String sPath = p.getProperty("classFullPath").toString();
		String shi = p.getProperty("method").toString();
		
		System.out.println(sPath+"\n"+shi);
		
		Class c = Class.forName(sPath);
		
		Object o = c.newInstance();
		System.out.println(o.getClass());
		
		Method m = c.getMethod(shi);
		
		m.invoke(o);

	}
}
