package com.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ReflectionClass {
	public static void main(String[] args) {
		Class c;
		try {
			c = Class.forName("");
			Method m[]=c.getDeclaredMethods();
			Field[] f=c.getDeclaredFields();
			
			for(Method mm:m) {
				System.out.println("Methods : "+mm.getName());
			}
			
			for(Field ff:f) {
				System.out.println("Methods : "+ff.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
		

}
