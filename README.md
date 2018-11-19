# Milestones

## To compile test files:
javac -cp .:junit-4.12.jar EdgeConnectorTest.java
javac EdgeConnector.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \
    org.junit.runner.JUnitCore EdgeConnectorTest

javac -cp .:junit-4.12.jar EdgeFieldTest.java
javac EdgeField.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \
    org.junit.runner.JUnitCore EdgeFieldTest

javac -cp .:junit-4.12.jar EdgeTableTest.java
javac EdgeTable.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \
    org.junit.runner.JUnitCore EdgeTableTest

javac -cp .:junit-4.12.jar EdgeConvertFileParserTest.java
javac EdgeConvertFileParser.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \
    org.junit.runner.JUnitCore EdgeConvertFileParserTest

javac -cp .:junit-4.12.jar MainTester.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \
    org.junit.runner.JUnitCore MainTester -n "1,2,3,test1,test2"
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \
    org.junit.runner.JUnitCore MainTester -f "testObjectFile.txt"
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \
    org.junit.runner.JUnitCore MainTester -h

## To run distribution file:
1. Install java if not installed
2. Download Milestones.jar
3. Navigate to downloads folder (or to wherever file was downloaded)
4. Double-click Milestones.jar
