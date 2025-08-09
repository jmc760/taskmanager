# Sistema de Gestión de Tareas (Task Manager)

## Objetivo

Desarrollar un sistema de gestión de tareas colaborativo que permita a los usuarios organizar, asignar y dar seguimiento al progreso de sus proyectos. El objetivo principal es construir una solución robusta y escalable que sirva como base para futuras expansiones.

## Requisitos Funcionales

### 1. Gestión de Usuarios y Proyectos

- Los usuarios deben poder registrarse, iniciar sesión y gestionar sus perfiles.
- Un usuario autenticado debe poder crear y listar sus propios proyectos.
- Debe ser posible asignar otros usuarios a un proyecto.

### 2. Gestión de Tareas

- Dentro de un proyecto, los usuarios deben poder crear, editar y eliminar tareas.
- Cada tarea debe tener un título, una descripción, una fecha de vencimiento y un estado (ej. "Por Hacer", "En Progreso", "Completada").
- Debe ser posible asignar una tarea a un usuario específico que forme parte del proyecto.

### 3. API RESTful

- La aplicación debe exponer una API RESTful bien definida para todas las funcionalidades mencionadas.
- La API debe estar protegida mediante un mecanismo de autenticación seguro, utilizando JSON Web Tokens (JWT) para la autorización.

### 4. Frontend Minimalista

- Se requiere una interfaz de usuario básica que consuma la API para demostrar la funcionalidad del sistema.
- La interfaz debe permitir la autenticación de usuarios, la creación de proyectos y la visualización/gestión de las tareas dentro de un proyecto.

## Requisitos Técnicos

### Backend

- **Lenguaje:** Java 21.
- **Framework:** Spring Boot 3.
- **Persistencia:** Spring Data JPA con Hibernate.
- **Base de Datos:** H2 para el desarrollo local, con la capacidad de usar PostgreSQL en un entorno de producción.
- **Testing:** JUnit 5, Mockito y, si es posible, Testcontainers para las pruebas de integración.
- **Construcción:** Maven.

### Frontend

- **Framework:** React con Vite y TypeScript.
- **Ruteo:** React Router DOM.
- **Gestión de estado:** Context API o Redux Toolkit (opcional, si el tiempo lo permite).

### Despliegue y CI/CD

- **Contenedorización:** Se debe proporcionar un Dockerfile para empaquetar la aplicación de Spring Boot. Se recomienda usar Docker Compose para orquestar el backend, la base de datos y el frontend.
- **Automatización:** Configurar un pipeline de CI/CD en GitHub Actions que compile el proyecto, ejecute los tests y construya las imágenes de Docker.

## Entregables

1. **Código Fuente Completo:** Un repositorio de GitHub bien estructurado con el código fuente del backend y del frontend.

2. **Documentación (README.md):** Un archivo README.md completo que incluya:
    - Una descripción detallada del proyecto y las tecnologías utilizadas.
    - Instrucciones claras para la configuración y ejecución local (usando Docker Compose).
    - Una guía de la API REST, incluyendo los endpoints, verbos HTTP y ejemplos de peticiones.
    - Capturas de pantalla o un breve video del frontend en funcionamiento.

3. **Demostración:** La capacidad de mostrar la aplicación en funcionamiento, ya sea localmente a través de Docker o, idealmente, desplegada en un servicio de hosting.

## Plazo Estimado

2 a 3 días hábiles.
