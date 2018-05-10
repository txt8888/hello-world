#!/bin/bash

set -xeu

cd source-code/

mvn --settings ./settings.xml -Dmaven.test.skip=true package

cd ..

cp source-code/target/ray-app.jar build-output/.
cp source-code/manifests/manifest-development.yml build-output/.

ls -lR build-output