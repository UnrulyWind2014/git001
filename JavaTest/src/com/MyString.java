package com;

public class MyString  {
	
	private char [] values;
	
	public MyString(String str){
		this.values = str.toCharArray();
	}
	
	public boolean equals(Object obj){
		
		if(obj ==null){
			return false;
		}
		
		if( obj instanceof String){
			char otherStr []= ((String)obj).toCharArray();
			
			int iSize = this.values.length;
			int oISize = otherStr.length;
			if(iSize!=oISize){
				return false;
			}
			int i =0;
			while(iSize-- != 0){
				if(this.values[i]!=otherStr[i]){
					return false;
				}
				i++;
			}
			return true;
			
		}
		
		return false;		
	}
}
