#!/bin/bash

set -xeu

cd source-code/
# ./mvnw package
# mvn -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true -Dhttp.proxyHost=proxy.ext.ray.com -Dhttp.proxyPort=80 -DproxySet=true -DproxyHost=proxy.ext.ray.com -DproxyPort=80 package



mvn --settings ./settings.xml package