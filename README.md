# 📌 API REST de Consulta de Endereços com ViaCEP e OpenFeign

Projeto Back-End desenvolvido com Spring Boot para integração com a API pública ViaCEP utilizando Spring Cloud OpenFeign.

---

## 🚀 Tecnologias Utilizadas

* Java 11
* Spring Boot 2.7.18
* Spring Cloud OpenFeign
* Spring Web
* Spring Data JPA
* Hibernate
* Bean Validation (`javax.validation`)
* Maven
* MySQL
* Postman
* Spring Tool Suite (STS)

---

## 📌 Funcionalidades

* Cadastro de usuários
* Cadastro de endereços
* Consulta de CEP via API ViaCEP
* Integração REST utilizando OpenFeign
* Persistência com JPA/Hibernate
* Validação de requisições
* Arquitetura em camadas

---

## 🛠️ Passo a Passo: Integração da API ViaCEP com Spring Boot usando Feign (Somente Back-End)

---

### 🛠️ 1. Instalar o Spring Tool Suite (STS)

O **Spring Tool Suite (STS)** é uma IDE especializada para desenvolver aplicações Spring Boot.

#### 🔹 Passo a Passo:

1. Acesse o site oficial:
   [Spring Tool Suite](https://spring.io/tools)

2. Baixe a versão compatível com o seu sistema operacional:

   * Windows
   * macOS
   * Linux

3. Extraia o arquivo baixado (caso seja `.zip` ou `.tar.gz`).

4. Execute o arquivo:

   * Windows: `STS.exe`
   * macOS/Linux: execute `./STS`

5. Configure o Workspace:

   * Escolha uma pasta para o ambiente de trabalho.
   * Clique em **OK**.

6. Instale plugins adicionais (opcional):

   * Vá em:

     ```text
     Help > Eclipse Marketplace
     ```

---

### 🛠️ 2. Instalar o Postman para Testes

O **Postman** é utilizado para testar APIs REST.

#### 🔹 Passo a Passo:

1. Acesse o site oficial:
   [Postman](https://www.postman.com/)

2. Baixe o instalador do seu sistema operacional.

3. Instale o Postman:

   * Windows: execute o `.exe`
   * macOS: arraste para Applications
   * Linux: execute `./Postman`

4. Crie uma conta (opcional).

5. Teste uma requisição:

   * URL:

     ```text
     https://jsonplaceholder.typicode.com/posts
     ```
   * Clique em **Send**

---

## ⚙️ Próximos Passos: Configuração da Integração ViaCEP

### 1. Criar o Projeto Spring Boot

Adicionar as dependências:

* Spring Web
* Spring Data JPA
* OpenFeign
* Validation

---

### 2. Configurar o OpenFeign

Criar a interface Feign Client para consumo da API ViaCEP.

Exemplo:

```java
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    Endereco buscarCep(@PathVariable String cep);
}
```

---

### 3. Configurar Banco de Dados

Definir configurações do MySQL no arquivo:

```text
application.properties
```

---

### 4. Executar a Aplicação

Executar a aplicação Spring Boot pela IDE ou via Maven:

```bash
mvn spring-boot:run
```

---

### 5. Testar Endpoints no Postman

Exemplo de requisição:

```http
POST /usuarios
```

Body:

```json
{
  "nome": "Felipe",
  "email": "felipe@email.com",
  "cpf": "12345678900",
  "dataNascimento": "2000-10-20"
}
```

---

## 🏗️ Arquitetura da Aplicação

O projeto segue arquitetura em camadas:

```text
Controller
   ↓
Service
   ↓
Repository
   ↓
Banco de Dados
```

Integração externa:

```text
Service
   ↓
OpenFeign Client
   ↓
API ViaCEP
```

---

## 📚 Objetivo do Projeto

Projeto desenvolvido com foco em aprendizado de:

* APIs REST
* Arquitetura em camadas
* Integração com APIs externas
* Spring Boot
* OpenFeign
* JPA/Hibernate
* Boas práticas de desenvolvimento Back-End

---

