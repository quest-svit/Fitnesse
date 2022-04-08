#!/bin/bash

mkdir target

#Compiling code
javac -d target code/*.java

# Compiling Fixtures
javac -d target fixtures/*.java

# Creating jar for application code
jar -cvf target/calulator-1.0.0.jar target/code

# Creating jar for fixtures
jar -cvf target/calulator-fixture-1.0.0.jar target/fixtures

#Starting Fitnesse
java -jar fitnesse-standalone.jar -p 7000
