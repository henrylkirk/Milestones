# Milestones

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