# Projeto CCMP0284

## Descrição

Projeto realizado durante a cadeira optativa Desenvolvimento Full Cycle.

## Estrutura do Projeto

O projeto é desenvolvido utilizando Java com Spring Boot no backend e React com Vite no frontend. Abaixo está a estrutura básica do projeto:

```plaintext
├── backend
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── br
│   │   │   │       └── com
│   │   │   │           └── primeshoes
│   │   │   │               └── api
│   │   │   │                   └── [pacotes e classes principais]
│   │   │   └── resources
│   │   │       ├── application.properties
│   │   │       └── [outros recursos como arquivos de configuração]
│   │   └── test
│   │       ├── java
│   │       │   └── br
│   │       │       └── com
│   │       │           └── primeshoes
│   │       │               └── api
│   │       │                   └── [testes unitários]
│   │       └── resources
│   │           └── [recursos para testes]
│   ├── pom.xml
│   └── [outros arquivos do backend]
├── frontend
│   ├── src
│   │   ├── components
│   │   ├── pages
│   │   ├── App.jsx
│   │   └── [outros arquivos do React]
│   ├── public
│   ├── vite.config.js
│   └── package.json
├── README.md
```

## Requisitos

- Java 24
- [Maven](https://maven.apache.org/) instalado
- Node.js 21+ e npm
- [Postman](https://www.postman.com/) para testes de API

## Dependências

### Backend

- Spring Boot 3.4.4
- Flyway Migration
- MySQL Driver
- Lombok

### Frontend

- React 19+
- Vite
  - Tailwind CSS
  - flowbite-react
  - react-router-dom

## Como Executar

### Backend

1. Navegue até o diretório `backend`.
2. Execute o comando:

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend

1. Navegue até o diretório `frontend`.
2. Instale as dependências:

   ```sh
   npm install
   ```

3. Execute o projeto:

   ```sh
   npm run dev
   ```

## Configurações de Banco de Dados

Certifique-se de configurar o banco de dados MySQL no arquivo `application.properties` localizado em `backend/src/main/resources`. Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/suabd
spring.datasource.username=seuusuario
spring.datasource.password=suasenha
spring.jpa.hibernate.ddl-auto=update
spring.flyway.enabled=true
```

## Observações

- Certifique-se de que o MySQL esteja em execução antes de iniciar o backend.
- Utilize o Postman para testar os endpoints do backend.
