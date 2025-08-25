# Proyecto Pipeline con Spring Boot

Este proyecto es un ejemplo de cómo implementar el **Patrón Pipeline** usando **Spring Boot** y **Maven**.

---

## 📌 Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

- [Java JDK 17](https://adoptium.net/) o superior  
- [Apache Maven](https://maven.apache.org/)  
- Un IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/) o [Eclipse](https://www.eclipse.org/downloads/)

---

## 📌 Objetivos del proyecto

- Practicar el uso de **Java Streams**.
- Aplicar el **patrón pipeline** para procesar datos.
- Implementar buenas prácticas de programación funcional en Java.

---

## ⚙️ Configuración del entorno

### 1. Verificar instalación de Java

Ejecuta en la terminal:

```bash
java -version

openjdk version "17.0.x" ...
```

### 2. Verificar instalación de Maven

```bash
mvn -version

```
## Deberia salir algo como esto: 
```bash
Apache Maven 3.9.x
Java version: 17
```


### 3. Variables de entorno

Asegúrate de que las rutas estén configuradas:

`JAVA_HOME` → debe apuntar al directorio de instalación del JDK 17

`PATH` → debe incluir `JAVA_HOME/bin` y el binario de Maven

Ejemplo en Windows (PowerShell):

```bash
setx JAVA_HOME "C:\Program Files\Java\jdk-17"
setx PATH "%PATH%;%JAVA_HOME%\bin;C:\apache-maven-3.9.6\bin"
```

Ejemplo en Linux/Mac (bash/zsh):

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk
export PATH=$JAVA_HOME/bin:$PATH
```
## ▶️ Ejecutar el proyecto

Clonar el repositorio:

```bash
git clone https://github.com/usuario/proyecto_pipeline.git
cd proyecto_pipeline
```

Compilar y ejecutar:

```bash
mvn spring-boot:run
```

## 📡 Endpoints disponibles

Una vez que la aplicación esté corriendo, puedes probar el endpoint:

```bash
GET http://localhost:8080/process?input=HolaMundo
```

Respuesta esperada:

```bash
{
  "original": "HolaMundo",
  "processed": "HOLA_MUNDO"
}
```

📂 Estructura del proyecto
```bash
proyecto_pipeline/
│── src/
│   ├── main/
│   │   ├── java/com/example/pipeline/
│   │   │   ├── PipelineApplication.java      # Clase principal
│   │   │   ├── controller/
│   │   │   │   └── PipelineController.java   # REST Controller
│   │   │   ├── pipeline/
│   │   │   │   ├── Pipeline.java             # Interfaz del pipeline
│   │   │   │   ├── UppercaseStep.java        # Paso 1: convierte a mayúsculas
│   │   │   │   └── AddSuffixStep.java        # Paso 2: agrega sufijo
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/example/pipeline/
│           └── PipelineApplicationTests.java
│
│── pom.xml
│── README.md
```
🛠 Tecnologías usadas

- Java 17
- Spring Boot 3.5.x
- Maven 3.9.x






