#### Steps to run the application
(a)Go to root folder of the project 
and type "mvn clean install" without the quotes
It will produce the jar file named "mapreducelearning-1.jar"
in the target directory.

Copy this jar file to Hadoop cluster depending upon whether 
it is a windows or unix based installation

(b)Make sure Hadoop daemons is running in the background .
   To run Hadoop Daemons use the following commands from the Hadoop Path.
   $HADOOP_HOME/sbin/start-dfs.sh
   $HADOOP_HOME/sbin/start-yarn.sh


(c)use that jar file to run Hadoop Job
to run WordCount job use the following command.


$hadoop jar /home/hduser/mapreducelearning-1.jar com.nitendragautam.mapreducelearning.wordcount.WordCount /user/hduser/input /user/hduser/output/

Make sure that input file is copied to input HDFS directory and output directory does not exists

for more HDFS commands Visit my blog https://nitendragautam.com/bigdata/apache-hadoop-hdfs-commands/
