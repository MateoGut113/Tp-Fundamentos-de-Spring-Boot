# Trabajo Práctico - Fundamentos de Spring Boot

## 📝 Descripción del proyecto
Este proyecto es una aplicación de consola desarrollada con **Java y Spring Boot** que permite gestionar tareas con distintos niveles de prioridad.\
Incluye funcionalidades como agregar tareas, marcar tareas como completadas, filtrar tareas pendientes o completadas, y mostrar estadísticas generales.\
A su vez, simula una base de datos en memoria para facilitar pruebas y poder ver los cambios ocasionados.\
Está diseñado para funcionar con perfiles configurables (`dev` y `prod`) los cuales decidirán el máximo de tareas permitido a guardar en la base de datos
y un permiso para mostrar estadísticas generales.

### 📝 Contenido clase Application
- En el método run(...), implementar el siguiente flujo:
  1. Mostrar mensaje de bienvenida (usando MensajeService)
  2. Mostrar la configuración actual
  3. Listar todas las tareas iniciales
  4. Agregar una nueva tarea
  5. Listar tareas pendientes
  6. Marcar una tarea como completada
  7. Mostrar estadísticas
  8. Listar tareas completadas
  9. Mostrar mensaje de despedida

## ⚙️ Tecnologías utilizadas (Java, Spring Boot, Maven)
- **Java 17**
- **Spring Boot 3.5.7**
- **Maven**
- **Lombok** (Utilizado para simplificar getters/setters)

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

![Captura de pantalla - DEV 1ro.png](capturas/Captura%20de%20pantalla%20-%20DEV%201ro.png)

![Captura de pantalla - DEV 2do.png](capturas/Captura%20de%20pantalla%20-%20DEV%202do.png)

**Capturas de consola con perfil prod:**

![Captura de pantalla - PROD 1ro.png](capturas/Captura%20de%20pantalla%20-%20PROD%201ro.png)

![Captura de pantalla - PROD 2do.png](capturas/Captura%20de%20pantalla%20-%20PROD%202do.png)

## 💭 Conclusiones personales sobre lo aprendido
En lo personal este trabajo práctico me ayudó a afianzar los conceptos de **Spring Boot**, visto en las actividades.
Aprendí a **configurar perfiles** para cambiar el comportamiento de la aplicación sin tocar el código
y la simulación de una base de datos en memoria, al igual que en tp anteriores, ayuda a comprender el ciclo de vida de los objetos.\
También aprendí a gestionar dependencias con **Maven**, ya que este es mi primer trabajo utilizándolo.\
Finalmente lo considero una buena primer experienza para dar un vistazo a como funcionan las aplicaciones reales.

## 👤 Tu nombre y legajo
**Nombre:** Mateo Gutierrez\
**Comision:** 3k10\
**Legajo:** 48855
