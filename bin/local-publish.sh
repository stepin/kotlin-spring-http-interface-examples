#!/usr/bin/env bash
set -eEuo pipefail
cd "$(dirname "$0")"

cd ../clients

set -x

cd simple
./gradlew build
./gradlew publishToMavenLocal

cd ../petstore
./gradlew build
./gradlew publishToMavenLocal

cd ../httpbin
./gradlew build
./gradlew publishToMavenLocal
