#!/bin/bash

set -xeu

cd source-code/
#bash ./mvnw test
mvn -DproxySet=true -DproxyHost=proxy.ext.ray.com -DproxyPort=80 test