#!/bin/bash

set -xeu

cd source-code/
# ./mvnw package
mvn -DproxySet=true -DproxyHost=proxy.ext.ray.com -DproxyPort=80 package