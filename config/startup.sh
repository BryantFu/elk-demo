#!/bin/bash
if !(which java 2>/dev/null); then
	echo '请安装java环境'
	exit
fi
PROJECT_NAME="$1"
JAVALOG_DIR="/opt/project/logs"
DT=`date +"%Y%m%d_%H%M%S"`

START_OPTS="$START_OPTS -Djava.io.tmpdir=${JAVALOG_DIR}"
java $JMX_OPTS $START_OPTS -jar -server ${PROJECT_NAME}.jar
