#!/bin/bash

echo "Running Service with active profile: $ENVIRONMENT"

exec \
    java \
    -jar \
    -Dspring.profiles.active="$ENVIRONMENT" \
    /app/service.jar
