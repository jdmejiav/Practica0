#!/bin/bash

javac -d ../run Main.java;
cd ../run;
java Main;
rm *.class;
cd ../src;

