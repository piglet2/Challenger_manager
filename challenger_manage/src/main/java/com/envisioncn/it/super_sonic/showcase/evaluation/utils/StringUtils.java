package com.envisioncn.it.super_sonic.showcase.evaluation.utils;

public class StringUtils {
   
   public static String tranString(Object obj){
		
		if(obj==null){
			return "";
		}
		return (String) obj;
	}
   
   public static String string(){
		
		
		return "";
	}
   
   public static String cutString(String date){
	   
	   int index=date.indexOf(" ");
	   String str = date.substring(0, index);
	   
	   return str;
   }
}
