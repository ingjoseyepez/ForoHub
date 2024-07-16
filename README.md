
# Foro Hub API

Foro Hub API es una aplicación Java Spring Boot que permite la gestión de autenticación y CRUD de tópicos en un foro. 
La aplicación incluye autenticación con JWT y manejo de tópicos mediante endpoints REST.

## Características
### Funcionalidades principales:
- Autenticación de usuarios.
- Creación de tópicos.
- Actualización de tópicos.
- Eliminación de tópicos.
- Listado de tópicos ordenados por fecha de creación.


## Tecnologías Utilizadas 

- **Lenguaje de Programación:** Java
- **Framework:** Spring Boot
- **Base de Datos:** Spring Data JPA con Hibernate
- **Seguridad:** JWT y Spring Security
- **Documentación:** Springdoc OpenAPI


## Requisitos 
- **Java 8 o superior**
- **Maven para gestionar las dependencias**


## Instrucciones de Uso 

1. Clona o descarga este repositorio.

2. Abre el proyecto en tu IDE favorito que soporte Java.

3. Configura las propiedades necesarias en application.properties, incluyendo el api.security.secret para JWT.

4. Ejecuta la aplicación utilizando el archivo ForoHubApplication.java.

5. La aplicación expone los siguientes endpoints.

## Endpoints
## Autenticación
- **POST /login:** Autentica un usuario y devuelve un token JWT.

## Tópicos
- **POST /topico:** Crea un nuevo tópico.
- **GET /topico:** Lista los tópicos ordenados por fecha de creación.
- **GET /topico/{id}:** Obtiene los detalles de un tópico específico.
- **PUT /topico/{id}:** Actualiza un tópico existente.
- **DELETE /topico/{id}:** Elimina un tópico.


## Desarrollado por
- Jose Yepez

