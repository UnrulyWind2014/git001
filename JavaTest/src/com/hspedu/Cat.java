package com.hspedu;

public class Cat {
	int iage = 20;
	private String name = "guozijie";
	
	public void hi(){
		System.out.println("name："+name);
	}
	
	public Cat(int iage){
		this.iage = iage;
	}
	
	public boolean equals(Object obj){
		
		if(this==obj)//引用相等必然相等
			return true;
		
		if(obj==null|| !(obj instanceof Cat)){//类型不同不用比较
			return false;			
		}else{
			Cat cat = (Cat)obj;
			if(this.iage == cat.iage) //如果年龄相等就算相等
				return true;
			else 
				return false;
		}		
	}
}
