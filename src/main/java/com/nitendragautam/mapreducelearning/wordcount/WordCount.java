package com.nitendragautam.mapreducelearning.wordcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;

/*
 * WordCount MapReduce 
Main Class
 */

public class WordCount {

	/*
	 * Driver Implmenetation
	 */
	public static void main( String[] args) throws Exception{
		Configuration conf = new Configuration();
		Job mapreduceJob = Job.getInstance(conf ,"Word Count");
		mapreduceJob.setJarByClass(com.nitendragautam.mapreducelearning.wordcount.WordCount.class);
		
		mapreduceJob.setMapperClass(com.nitendragautam.mapreducelearning.wordcount.WordCountMapper.class);
		
		
	}
	
   
}
