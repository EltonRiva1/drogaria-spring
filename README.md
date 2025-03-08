# Drogaria Spring

![Badge](https://img.shields.io/badge/Status-%20Concluído-green) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.2-brightgreen)

Um sistema de gestão de drogaria desenvolvido com Spring Boot e tecnologias modernas para facilitar o gerenciamento de produtos e vendas.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.2** (Spring MVC e Spring Data JPA)
- **Hibernate**
- **MySQL**
- **Maven**

## 📌 Funcionalidade

- 🛒 **Gerenciamento de categoria de produtos** (CRUD completo)

## 🎯 Como Executar o Projeto

### 📌 Pré-requisitos
Antes de iniciar, você precisará ter instalado:
- Java 8+
- Maven
- MySQL

### 🔧 Passos para execução
1. Clone o repositório:
   ```sh
   git clone https://github.com/EltonRiva1/drogaria-spring.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd drogaria-spring
   ```
3. Configure o banco de dados no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/drogaria-spring?useTimezone=true&serverTimezone=UTC
   spring.datasource.username=root
   spring.datasource.password=root
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Compile e execute o projeto:
   ```sh
   mvn spring-boot:run
   ```
5. Acesse no navegador:
   ```
   http://localhost:8080
   ```

## 🛠️ Contribuindo
1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature-minha-feature`)
3. Commit suas alterações (`git commit -m 'Adicionando nova funcionalidade'`)
4. Faça um push para a branch (`git push origin feature-minha-feature`)
5. Abra um Pull Request

---

🔹 Desenvolvido por [Elton Riva](https://github.com/EltonRiva1) 🚀

