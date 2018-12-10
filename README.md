# Milestones - Team IDK
### Henry Kirk, Ryan Sweeney
### ISTE 422
### 10 December 2018

## Features added to Application:
* Refactored FileConversion classes to be generic; can read and parse from either an EDGE file or an XML file
	- Allows for Developers to create SQL scripts to create new databases without the use of EdgeDiagrammer

* Refactored Table, Field and Connector classes to also be generic
	- Functionality remains the same regardless of file type being parsed and SQL script type being generated

* Added another CreateDDL class that generates an MSSQL script
	- Allows for developers to create scripts for both DBMS given that there exists some differences in the encoding of the datatypes, primarily between MySQL's BOOLEAN datatype and MSSQL's BIT datatype

## Features that still need fixing/reworking:
* Application still requires you to save SQL scripts in the directory running the installation
* Reoccuring bug that does not recognize the Output Definition Files in the installation directory
* Application is able to read Tables for XML files, but is unable to assign the Attributes
	- Error occurs when trying to assign Attributes that belong to multiple tables


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
