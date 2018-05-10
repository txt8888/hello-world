#!/bin/bash

set -xeu

cd source-code/

mvn --settings ./settings.xml -Dmaven.test.skip=true package