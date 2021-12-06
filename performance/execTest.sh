#!/bin/bash
kotlinc-jvm -include-runtime -d newBackend.jar $1 >/dev/null 2>&1
kotlinc-jvm -Xuse-old-backend -include-runtime -d oldBackend.jar $1 >/dev/null 2>&1
oldBackendTime=$(/usr/bin/time -f "%e" java -jar oldBackend.jar 2>&1)
newBackendTime=$(/usr/bin/time -f "%e" java -jar newBackend.jar 2>&1)
echo "Execution times: $oldBackendTime and $newBackendTime"