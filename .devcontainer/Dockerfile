FROM mcr.microsoft.com/devcontainers/java:1-17-bookworm

RUN apt-get update && apt-get install -y --no-install-recommends \
    unzip wget curl git lib32stdc++6 lib32z1 && \
    rm -rf /var/lib/apt/lists/*

ENV ANDROID_HOME=/opt/android-sdk \
    ANDROID_SDK_ROOT=/opt/android-sdk \
    GRADLE_HOME=/opt/gradle \
    PATH=/opt/gradle/bin:/opt/android-sdk/cmdline-tools/latest/bin:/opt/android-sdk/platform-tools:$PATH

RUN mkdir -p /opt/android-sdk/cmdline-tools /opt/gradle && \
    wget -q https://dl.google.com/android/repository/commandlinetools-linux-11076708_latest.zip -O /tmp/android.zip && \
    unzip -q /tmp/android.zip -d /tmp/android-tools && \
    mv /tmp/android-tools/cmdline-tools /opt/android-sdk/cmdline-tools/latest && \
    rm -rf /tmp/android-tools /tmp/android.zip && \
    wget -q https://services.gradle.org/distributions/gradle-8.10.2-bin.zip -O /tmp/gradle.zip && \
    unzip -q /tmp/gradle.zip -d /opt && \
    mv /opt/gradle-8.10.2/* /opt/gradle/ && \
    rm -rf /opt/gradle-8.10.2 /tmp/gradle.zip && \
    yes | sdkmanager --licenses > /dev/null && \
    sdkmanager "platform-tools" "platforms;android-35" "build-tools;35.0.0" && \
    chown -R vscode:vscode /opt/android-sdk /opt/gradle
