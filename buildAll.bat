set basePath=..

call mvn clean install -Dmaven.test.skip=true -f %basePath%\kit\pom.xml
call mvn clean install -Dmaven.test.skip=true -f %basePath%\httpkit\pom.xml
call mvn clean install -Dmaven.test.skip=true -f %basePath%\dbkit\pom.xml

call mvn clean package -Dmaven.test.skip=true -f pom.xml

pause