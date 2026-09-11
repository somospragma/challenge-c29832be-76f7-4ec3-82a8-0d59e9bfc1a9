# Implementación de TDD en un sistema de gestión de pedidos

Necesitamos mejorar la calidad del software de un sistema de gestión de pedidos mediante la aplicación de TDD (Desarrollo Guiado por Pruebas) y el ciclo rojo-verde-refactorización. El objetivo es garantizar que el software sea robusto, mantenible y se ajuste a los requisitos del negocio.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Mejora de la calidad del software mediante TDD y el ciclo rojo-verde-refactor |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de requerimientos y escritura de pruebas

**Objetivo:** Definir los requerimientos del sistema y escribir pruebas unitarias que fallarán inicialmente.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los requerimientos del sistema de gestión de pedidos.
- Escribe pruebas unitarias para cada requerimiento que inicialmente deben fallar.

**Entregable:** Pruebas unitarias escritas y fallidas.

<details>
<summary>Pistas de conocimiento</summary>

- Las pruebas deben cubrir los principales casos de uso del sistema.
- Cada prueba debe representar un requisito claro y específico.

</details>

### Fase 2: Implementación del código para pasar las pruebas

**Objetivo:** Implementar el código necesario para que las pruebas unitarias pasen.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Escribe el código necesario para que las pruebas unitarias pasen.
- Asegúrate de que el código sea simple y cumpla con los requisitos.

**Entregable:** Código implementado que hace pasar las pruebas unitarias.

<details>
<summary>Pistas de conocimiento</summary>

- El código debe ser simple y cumplir con los requisitos.
- Evita sobre-ingeniería en esta fase.

</details>

### Fase 3: Refactorización del código

**Objetivo:** Refactorizar el código para mejorar su calidad y mantenibilidad.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Refactoriza el código implementado para mejorar su calidad y mantenibilidad.
- Asegúrate de que las pruebas unitarias sigan pasando después de la refactorización.

**Entregable:** Código refactorizado que mantiene las pruebas unitarias pasando.

<details>
<summary>Pistas de conocimiento</summary>

- Identifica áreas del código que pueden ser mejoradas.
- Aplica principios de diseño limpio durante la refactorización.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es TDD y cómo se aplica en el desarrollo de software?
- **paraQueSirve**: ¿Para qué sirve el ciclo rojo-verde-refactor en el desarrollo de software?
- **comoSeUsa**: ¿Cómo se escriben pruebas unitarias efectivas en TDD?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar TDD y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la refactorización del código en el contexto de TDD?

## Criterios de Evaluacion

- Definición de requerimientos y escritura de pruebas unitarias fallidas.
- Implementación de código que hace pasar las pruebas unitarias.
- Refactorización del código manteniendo las pruebas unitarias pasando.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
