package com.nitendragautam.mapreducelearning.main;

import org.apache.hadoop.util.ProgramDriver;

import com.nitendragautam.mapreducelearning.wordcountexample.*;
/*
 * Main Launcher Class which can launch different MapReduce Program
 */
public class MapReduceLauncher {
	
	public static void main(String... args) throws Throwable{
		
		ProgramDriver driver = new ProgramDriver();
		
		driver.addClass("WordCount",WordCountExample.class, "Launches Word Count Example");
		
		
		driver.driver(args); //Add  the Argument 
	}

}
