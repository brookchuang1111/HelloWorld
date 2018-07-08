#!/bin/bash
CLASSPATH=`pwd`/libs/stdlib.jar
for i in `pwd`/code/out/production/* 
do 
  CLASSPATH=$CLASSPATH:$i
done
classpath_stmt="$(echo export CLASSPATH=$CLASSPATH)"
echo "Cut and paste the following line:"
echo $classpath_stmt
