package com.hspedu;

public class Cat {
	int iage = 20;
	private String name = "guozijie";
	
	public void hi(){
		System.out.println("name��"+name);
	}
	
	public Cat(int iage){
		this.iage = iage;
	}
	
	public boolean equals(Object obj){
		
		if(this==obj)//������ȱ�Ȼ���
			return true;
		
		if(obj==null|| !(obj instanceof Cat)){//���Ͳ�ͬ���ñȽ�
			return false;			
		}else{
			Cat cat = (Cat)obj;
			if(this.iage == cat.iage) //���������Ⱦ������
				return true;
			else 
				return false;
		}		
	}
}
