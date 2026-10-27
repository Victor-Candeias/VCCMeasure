# VCC Measure — Codespaces

1. Abrir o repositório no GitHub e selecionar **Code > Codespaces > Create codespace on branch**.
2. Escolher a branch `chore/codespaces-android-bootstrap` até o PR ser integrado.
3. A primeira criação instala o SDK Android e prepara o Gradle Wrapper.
4. No terminal: `./gradlew :app:assembleDebug`.
5. APK: `app/build/outputs/apk/debug/app-debug.apk`.

O Codespace permite compilar e testar unidades, mas a medição com sensores físicos e ARCore precisa de um telemóvel Android real. Transferir o APK para o dispositivo para verificar a régua, aceleração e AR.

## Estado inicial
Inclui um esqueleto Compose e cartões informativos; as ferramentas ainda não estão implementadas. Consulte as Issues do repositório para planear as funcionalidades.
