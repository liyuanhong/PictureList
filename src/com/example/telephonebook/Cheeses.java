package com.example.telephonebook;

public class Cheeses {
	
  //  public static String[] sCheeseStrings = {"1","2","3","4","5","6","7","8"};	
  public  static String[] sCheeseStrings = new String[100];
  
  public static String[] addValue(){
	  	for(int i = 0;i < 100;i++){
	  		sCheeseStrings[i] = "cat" + (i + 1);
	  	}
	  	return sCheeseStrings;
	  }
  
  

}

