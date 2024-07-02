#!/usr/bin/env bash
set -eEuo pipefail
cd "$(dirname "$0")"

cd ..

rm -rf clients
mkdir -p clients


echo Simple
docker run --rm -v ${PWD}:/local stepin/openapi-generator-cli generate \
    -i /local/specs/simple.json \
    -g kotlin \
    --library=jvm-spring-http-interface \
    --additional-properties groupId=name.stepin \
    --additional-properties artifactId=simple-client \
    --additional-properties artifactVersion=0.2.0 \
    --additional-properties packageName=name.stepin.client.simple \
    --additional-properties useSpringBoot3=true \
    --additional-properties useCoroutines=true \
    --additional-properties serializationLibrary=jackson \
    --additional-properties omitInfrastructureClasses=true \
    --additional-properties enablePostProcessFile=true \
    --additional-properties enumPropertyNaming=UPPERCASE \
    --global-property apiTests=false,modelTests=false \
    -o /local/clients/simple
chmod +x ./clients/simple/gradlew

echo petstore
docker run --rm -v ${PWD}:/local stepin/openapi-generator-cli generate \
    -i /local/specs/petstore.json \
    -g kotlin \
    --library=jvm-spring-http-interface \
    --additional-properties groupId=name.stepin \
    --additional-properties artifactId=petstore-client \
    --additional-properties artifactVersion=0.2.0 \
    --additional-properties packageName=name.stepin.client.petstore \
    --additional-properties useSpringBoot3=true \
    --additional-properties useCoroutines=true \
    --additional-properties serializationLibrary=jackson \
    --additional-properties omitInfrastructureClasses=true \
    --additional-properties enablePostProcessFile=true \
    --additional-properties enumPropertyNaming=UPPERCASE \
    --global-property apiTests=false,modelTests=false \
    -o /local/clients/petstore
chmod +x ./clients/petstore/gradlew
echo

echo httpbin
docker run --rm -v ${PWD}:/local stepin/openapi-generator-cli generate \
    -i /local/specs/httpbin.json \
    --skip-validate-spec \
    -g kotlin \
    --library=jvm-spring-http-interface \
    --additional-properties groupId=name.stepin \
    --additional-properties artifactId=httpbin-client \
    --additional-properties artifactVersion=0.2.0 \
    --additional-properties packageName=name.stepin.client.httpbin \
    --additional-properties useSpringBoot3=true \
    --additional-properties useCoroutines=true \
    --additional-properties serializationLibrary=jackson \
    --additional-properties omitInfrastructureClasses=true \
    --additional-properties enablePostProcessFile=true \
    --additional-properties enumPropertyNaming=UPPERCASE \
    --global-property apiTests=false,modelTests=false \
    -o /local/clients/httpbin
chmod +x ./clients/httpbin/gradlew
