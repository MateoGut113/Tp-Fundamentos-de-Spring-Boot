# Trabajo Práctico - Fundamentos de Spring Boot

## 📝 Descripción del proyecto
Este proyecto es una aplicación de consola desarrollada con **Java y Spring Boot** que permite gestionar tareas con distintos niveles de prioridad.
Incluye funcionalidades como agregar tareas, marcar tareas como completadas, filtrar tareas pendientes o completadas, y mostrar estadísticas generales.
Está diseñado para funcionar con perfiles configurables (`dev` y `prod`) y simula una base de datos en memoria para facilitar pruebas y aprendizaje.

## ⚙️ Tecnologías utilizadas (Java, Spring Boot, Maven)
- **Java 17**
- **Spring Boot 3.5.7**
- **Maven**
- **Lombok** (opcional, utilizado para simplificar getters/setters)

## 🚀 Instrucciones para clonar y ejecutar el proyecto
1. Clonar el repositorio:

   ```bash
   git clone https://github.com/MateoGut113/Tp-Fundamentos-de-Spring-Boot.git
   cd Tp-Fundamentos-de-Spring-Boot

2. Ejecutar el proyecto con Maven:

    ```bash
    mvn spring-boot:run

O directamente desde el IDE ejecutando la clase `TareasApplication`.

## 🔧 Cómo cambiar entre profiles (dev/prod)
Spring Boot permite configurar distintos entornos mediante perfiles. En este proyecto se usan dos:

- dev: Para desarrollo, con límite bajo de tareas y estadísticas activadas.

- prod: Para producción, con mayor capacidad y estadísticas desactivadas.

**Pasos para activar un perfil:**

1. Editar el archivo application.properties:

En el caso de usar el perfil dev, colocar:
```
spring.profiles.active=dev
```

En el caso de usar el perfil prod, colocar:
```
spring.profiles.active=prod
```

## 📸 Capturas de pantalla de la consola con ambos profiles
**Capturas de consola con perfil dev:**

![Captura de patalla - DEV 1ro.png](capturas/Captura%20de%20pantalla%20-%20DEV%201ro.png)

![Captura de pantalla - DEV 2do.png](capturas/Captura%20de%20pantalla%20-%20DEV%202do.png)

**Capturas de consola con perfil prod:**

![Captura de pantalla - PROD 1ro.png](capturas/Captura%20de%20pantalla%20-%20PROD%201ro.png)

![Captura de pantalla - PROD 2do.png](capturas/Captura%20de%20pantalla%20-%20PROD%202do.png)

## 💭 Conclusiones personales sobre lo aprendido

## 👤 Tu nombre y legajo
**Nombre:** Mateo Gutierrez\
**Comision:** 3k10\
**Legajo:** 48855
