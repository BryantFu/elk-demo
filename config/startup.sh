#!/bin/bash
if !(which java 2>/dev/null); then
	echo '请安装java环境'
	exit
fi
PROJECT_NAME="elk-demo-1.0.0"
JAVALOG_DIR="/opt/project/logs"
DT=`date +"%Y%m%d_%H%M%S"`
export APPID='elk-demo'
gradle build
gradle bootJar


START_OPTS="$START_OPTS -Djava.io.tmpdir=${JAVALOG_DIR}"
#START_OPTS="$START_OPTS -DAPPID=${APPID}"
#START_OPTS="$START_OPTS -DAPPID=${APPID}"
java $JMX_OPTS $START_OPTS -DAPPID=ELK-DEMO -Dcom.sun.management.jmxremote -Djava.rmi.server.hostname=192.168.5.194 -Dcom.sun.management.jmxremote.port=12345 -Dcom.sun.management.jmxremote.authenticate=false  -Dcom.sun.management.jmxremote.ssl=false -jar -server /opt/code/elk-demo/build/libs/${PROJECT_NAME}.jar
