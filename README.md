# API REST - Spring Boot + PostgreSQL

API RESTful construida con Spring Boot y PostgreSQL para la gestión de recursos.

## Tecnologías

- **Java 21**
- **Spring Boot 3.5.6**
  - Spring Data JPA
  - Spring Web
  - Hibernate
- **PostgreSQL 17**
- **Docker** para contenedores
- **Maven** para gestión de dependencias

## Requisitos Previos

- Java 21 o superior
- Docker y Docker Compose
- Maven 3.x
- IDE (IntelliJ IDEA recomendado)

## Configuración

### Base de Datos

La aplicación utiliza PostgreSQL corriendo en Docker. Para iniciar la base de datos:
```bash
docker-compose up -d
