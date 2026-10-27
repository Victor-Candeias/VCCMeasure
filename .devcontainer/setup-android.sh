#!/usr/bin/env bash
set -euo pipefail
export ANDROID_HOME="${ANDROID_HOME:-/opt/android-sdk}"
export ANDROID_SDK_ROOT="$ANDROID_HOME"
if [ ! -f gradle/wrapper/gradle-wrapper.jar ]; then
  echo "Generating Gradle wrapper 8.10.2..."
  gradle wrapper --gradle-version 8.10.2 --distribution-type bin
fi
chmod +x gradlew
printf 'sdk.dir=%s\n' "$ANDROID_HOME" > local.properties
java -version
echo "Android SDK: $ANDROID_HOME"
./gradlew --version
