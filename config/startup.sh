#!/bin/bash
if !(which java 2>/dev/null); then
	echo '请安装java环境'
	exit
fi
PROJECT_NAME="elk-demo-1.0.0"
JAVALOG_DIR="/opt/project/logs"
DT=`date +"%Y%m%d_%H%M%S"`

START_OPTS="$START_OPTS -Djava.io.tmpdir=${JAVALOG_DIR}"
java $JMX_OPTS $START_OPTS -Dcom.sun.management.jmxremote -Djava.rmi.server.hostname=192.168.5.120 -Dcom.sun.management.jmxremote.port=12345 -Dcom.sun.management.jmxremote.authenticate=false  -Dcom.sun.management.jmxremote.ssl=false -jar -server /opt/code/elk-demo/build/libs/${PROJECT_NAME}.jar
