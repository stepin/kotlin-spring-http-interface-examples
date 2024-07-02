#!/usr/bin/env bash
set -eEuo pipefail
cd "$(dirname "$0")"

# http://localhost:8080/swagger-ui.html
curl -fv http://localhost:8080/v3/api-docs | jq . > ../specs/simple.json

# https://httpbin.org/
curl -fv https://httpbin.org/spec.json > ../specs/httpbin.json

# https://petstore.swagger.io/
curl -fv https://petstore.swagger.io/v2/swagger.json > ../specs/petstore.json
