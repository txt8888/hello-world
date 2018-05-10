#!/bin/bash

set -xeu

cd source-code/

mvn --settings ./settings.xml -Dmaven.test.skip=true package
cp target/ray-app.jar build-output/.
cp manifests/manifest-development.yml build-output/.
ls -lR build-output