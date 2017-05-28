package com.nitendragautam.mapreducelearning.wordcount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/*
 *  Input :Object is the Key{line of the input file} and Text is content in that Line
 *  Output :Text is the Key{Word} and IntWritable is the Hadoop Data type which holds the count 
 *          for no of words that occured in that line
 * 
 */
public class WordCountMapper extends Mapper<Object ,Text ,Text ,IntWritable>{

	private final static IntWritable one = new IntWritable(1); //Hadoop supported Numeric Data Type
	
	private  Text wordInstance = new Text(); //Hadoop Data Type for Text
	
	//Tokenizes the line and frame initial Key/Value Pair
	public void map(Object key ,Text value ,Context context) throws IOException ,InterruptedException{
		
		
		
	}
	
}
