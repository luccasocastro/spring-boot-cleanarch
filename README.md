<h1 align="center">
  TODO List
</h1>

<p align="center">
 <img src="https://img.shields.io/badge/Tipo-Aprendizado-blue" alt="Aprendizado" />
</p>

API de cadastro de usuários utilizando Clean Architecture

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [H2 Database](https://www.h2database.com/html/download.html)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- Clean Architecture
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/spring-boot-cleanarch-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer a requisição HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Usuário 
```
$ http POST :8080/users username="User 1" password="12345678" email="user@mail.com"

{
    "email": "user@mail.com",
    "username": "User 1"
}

```