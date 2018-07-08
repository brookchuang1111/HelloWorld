#!/bin/bash
export CLASSPATH=`pwd`/libs/stdlib.jar:`pwd`/code/out/production/code
classpath_stmt="$(echo export CLASSPATH=$CLASSPATH)"
echo "Cut and paste the following line:"
echo $classpath_stmt
