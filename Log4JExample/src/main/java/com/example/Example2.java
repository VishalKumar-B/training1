package com.example;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example2 {
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		
		properties.setProperty("log4j.rootLogger", "Debug,stdout,MyFile");
		properties.setProperty("log4j.rootCategory", "Debug"); 

		properties.setProperty("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
		properties.setProperty("log4j.appender.stdout.layout", "org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender.stdout.layout.ConversionPattern",
				"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");

		properties.setProperty("log4j.appender.MyFile", "org.apache.log4j.RollingFileAppender");
		properties.setProperty("log4j.appender.MyFile.File", "C:/Users/Home/Desktop/abc/example2.log");
		properties.setProperty("log4j.appender.MyFile.MaxFileSize", "1mb");
		properties.setProperty("log4j.appender.MyFile.MaxBackupIndex", "2");
		properties.setProperty("log4j.appender.MyFile.layout", "org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender.MyFile.layout.ConversionPattern",
				"%d{yyyy/MM/dd HH:mm:ss.SSS} [%5p] %t (%F) - %m%n");
		
		PropertyConfigurator.configure(properties);

		Logger logger = Logger.getLogger(Example2.class.getName());
		
		System.out.println("--- start ---");
		logger.fatal("This is a FATAL message.");
		logger.error("This is an ERROR message.");
		logger.warn("This is a WARN message.");
		logger.info("This is an INFO message.");
		logger.debug("This is a DEBUG message.");
		logger.trace("This is a TRACE message.");
		System.out.println("---end---");
	}
}
