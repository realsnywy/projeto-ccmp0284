# Projeto CCMP0284

## Descrição

Projeto realizado durante a cadeira optativa Desenvolvimento Full Cycle.

## Estrutura do Projeto

O projeto é desenvolvido em Java utilizando Spring Boot. Abaixo está a estrutura básica do projeto:

```plaintext
├── src
│   ├── main
│   │   ├── java
│   │   │   └── br
│   │   │       └── com
│   │   │           └── primeshoes
│   │   │               └── api
│   │   │                   └── [pacotes e classes principais]
│   │   └── resources
│   │       ├── application.properties
│   │       └── [outros recursos como arquivos de configuração]
│   └── test
│       ├── java
│       │   └── br
│       │       └── com
│       │           └── primeshoes
│       │               └── api
│       │                   └── [testes unitários]
│       └── resources
│           └── [recursos para testes]
├── pom.xml
├── README.md
```

## Requisitos

- Java 24
- [Maven](https://maven.apache.org/) instalado

## Dependências

- Spring Boot 3.4.4
- Flyway Migration
- MySQL Driver
- Lombok

## Como Executar

1. Navegue até o diretório raiz do projeto.
2. Execute o comando:

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## Configurações de Banco de Dados

Certifique-se de configurar o banco de dados MySQL no arquivo `application.properties` localizado em `src/main/resources`. Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/suabd
spring.datasource.username=seuusuario
spring.datasource.password=suasenha
spring.jpa.hibernate.ddl-auto=update
spring.flyway.enabled=true
```
