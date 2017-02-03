@echo off
cd ..
set MAVEN_OPTS=%MAVEN_OPTS%
call mvn clean jetty:run -Dmaven.test.skip=true -Djetty.port=8081
cd ./bin
