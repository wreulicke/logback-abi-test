#!/usr/bin/env bash
javac -d logback-1.2/classes logback-1.2/*.java
javac -d logback-1.4/classes logback-1.4/*.java
javac -cp logback-1.2/classes -d armeria-logback/classes armeria-logback/*.java
javac -cp logback-1.4/classes:armeria-logback/classes -d test/classes test/*.java
java -cp logback-1.4/classes:armeria-logback/classes:test/classes test.Test