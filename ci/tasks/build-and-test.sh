#!/bin/bash

set -xeu

echo $PWD

cd source-code/

mvn --settings ./settings.xml test package

cd ..