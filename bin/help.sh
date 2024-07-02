#!/usr/bin/env bash
set -eEuo pipefail
cd "$(dirname "$0")"

docker run --rm stepin/openapi-generator-cli config-help -g kotlin
