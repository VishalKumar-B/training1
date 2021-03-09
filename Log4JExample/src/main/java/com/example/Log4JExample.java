package com.example;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  
   
public class Log4JExample {  
   
  public static final Logger logger = LogManager.getLogger(Log4JExample.class);  
	//public static final Logger logger = Logger.getLogger(Log4JExample.class);  
 
	public static void main(String[] args) {  
  // basic log4j configurator  
  BasicConfigurator.configure();  
  logger.info("Hello world");  
  logger.info("we are in logger info mode");
  
  String s = "abc";
  int a =10,b=20;
  System.out.println(a+b);
  System.out.println(a+s);
  logger.info("the addition is: " +(a+b));
}
	
	/*
	 * public static void main(String[] args) { BasicConfigurator.configure();
	 * Log4JExample obj = new Log4JExample();
	 * 
	 * try{ obj.divide(); }catch(ArithmeticException ex){
	 * logger.info("Sorry, something wrong!", ex); }
	 * 
	 * 
	 * }
	 * 
	 * private void divide(){
	 * 
	 * int i = 10 /0;
	 * 
	 * }
	 * 
	 */	
   
}  