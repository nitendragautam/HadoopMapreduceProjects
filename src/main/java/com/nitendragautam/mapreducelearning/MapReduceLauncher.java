package com.nitendragautam.mapreducelearning;

import org.apache.hadoop.util.ProgramDriver;


/*
 * Main Launcher Class which can launch different MapReduce Program
 */
public class MapReduceLauncher {
	
	public static void main(String... args) throws Throwable{
		
		ProgramDriver driver = new ProgramDriver();
		
		driver.addClass("WordCount",com.nitendragautam.mapreducelearning.wordcount.WordCount.class, "Launches Word Count Example");
		
		
		driver.driver(args); //Add  the Argument 
	}

}
