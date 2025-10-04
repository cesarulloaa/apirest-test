# 🚀 API REST - Spring Boot + PostgreSQL

API RESTful desarrollada con **Spring Boot** y **PostgreSQL** para la gestión de recursos.  
El proyecto sigue una arquitectura limpia y modular, utilizando **JPA/Hibernate** para la persistencia y **Docker** para el despliegue de contenedores.

---

## 🧩 Tecnologías Utilizadas

- ☕ **Java 21**  
- 🌱 **Spring Boot 3.5.6**  
- 🧰 **Spring Data JPA**  
- 🌐 **Spring Web**  
- 🧱 **Hibernate ORM**  
- 🐘 **PostgreSQL 17**  
- 🐳 **Docker & Docker Compose**  
- 📦 **Maven** para gestión de dependencias  

---

## ⚙️ Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- [Java 21+](https://adoptium.net/)  
- [Maven 3.x](https://maven.apache.org/download.cgi)  
- [Docker y Docker Compose](https://www.docker.com/get-started)  
- IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/) o [VS Code](https://code.visualstudio.com/)

---

## 🗄️ Configuración de la Base de Datos

La aplicación utiliza una base de datos **PostgreSQL** dentro de un contenedor Docker.

Para iniciar la base de datos, ejecuta:

```bash
docker-compose up -d
