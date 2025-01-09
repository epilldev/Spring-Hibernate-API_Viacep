## 🛠️ Passo a Passo: Integração da API ViaCEP com Spring Boot usando Feign (Somente Back-End)

---

### 🛠️ 1. Instalar o Spring Tool Suite (STS)

O **Spring Tool Suite (STS)** é uma IDE especializada para desenvolver aplicações Spring Boot.

#### 🔹 Passo a Passo:
1. Acesse o site oficial:  
   [Spring Tool Suite](https://spring.io/tools).
   
2. Baixe a versão compatível com o seu sistema operacional:
   - Windows, macOS ou Linux.

3. Extraia o arquivo baixado (caso seja um arquivo `.zip` ou `.tar.gz`).

4. Execute o arquivo:  
   - Windows: **`STS.exe`**.  
   - macOS/Linux: Abra o terminal, navegue até a pasta e execute `./STS`.

5. Configure o Workspace:  
   - Escolha uma pasta para ser o local de trabalho (Workspace).  
   - Clique em **OK** para abrir o STS.

6. Instale Plugins (se necessário):  
   - Vá em **Help > Eclipse Marketplace** e instale extensões adicionais caso precise.

---

### 🛠️ 2. Instalar o Postman para Testes

O **Postman** é uma ferramenta amplamente usada para testar APIs REST.

#### 🔹 Passo a Passo:
1. Acesse o site oficial:  
   [Postman](https://www.postman.com/).

2. Baixe o instalador compatível com seu sistema operacional:
   - Windows, macOS ou Linux.

3. Instale o Postman:
   - **Windows**: Dê um duplo clique no arquivo `.exe` e siga as instruções.  
   - **macOS**: Arraste o ícone do Postman para a pasta de aplicativos.  
   - **Linux**: Extraia o arquivo baixado e execute o script `./Postman`.

4. Crie uma conta (opcional):  
   - Abra o Postman e crie uma conta gratuita para salvar suas coleções de requisições.

5. Verifique se o Postman está funcionando:
   - Abra o Postman e clique em **New Request**.  
   - Insira a URL de teste (exemplo: `https://jsonplaceholder.typicode.com/posts`).  
   - Clique em **Send** para testar a requisição.

---

### Próximos Passos: Configurar a Integração da API ViaCEP com Spring Boot

1. **Criar o Projeto Spring Boot:**
   - Abra o STS e crie um novo projeto Spring Boot com as dependências:  
     - **Spring Web**  
     - **OpenFeign**  

2. **Configurar o Feign Client para ViaCEP:**
   - Adicione as configurações necessárias para consumir a API ViaCEP no arquivo `application.properties`.  

3. **Criar uma Interface Feign Client:**
   - Configure a interface Feign para se conectar ao endpoint da API ViaCEP.

4. **Testar no Postman:**
   - Configure uma requisição no Postman para verificar o retorno da API implementada.

--- 

Se precisar de ajuda com algum desses passos, é só perguntar! 🚀
