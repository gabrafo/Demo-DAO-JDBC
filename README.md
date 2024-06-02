# Projeto de Demonstração de DAO em JDBC usando MySQL

Este projeto é uma demonstração de como usar o padrão DAO (Data Access Object) com JDBC para realizar operações CRUD (Create, Read, Update, Delete) nas tabelas `department` e `seller`. A tabela `seller` está relacionada à tabela `department`, demonstrando também como lidar com relacionamentos entre tabelas.

## Estrutura do Projeto

- **src/main/java**: Contém o código-fonte Java.
  - **dao**: Contém as interfaces DAO.
    - `DepartmentDAO.java`
    - `SellerDAO.java`
  - **impl**: Contém as implementações DAO.
    - `DepartmentDAOJDBC.java`
    - `SellerDAOJDBC.java`
  - **model**: Contém as classes de modelo.
    - `Department.java`
    - `Seller.java`
  - **db**: Contém as classes de configuração e utilitários para a conexão com o banco de dados.
    - `DB.java`
    - `DBException.java`
  - **application**: Contém a classe principal e de execução do projeto.
    - `Program.java`
- **resources**: Contém os arquivos de configuração, como o arquivo de propriedades do banco de dados.
  - `db.properties`

## Dependências

O projeto utiliza JDBC para conectar ao MySQL. Certifique-se de ter o driver JDBC do MySQL no seu classpath. Você pode adicionar a dependência no seu `pom.xml` se estiver usando Maven:

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.25</version>
</dependency>
```

## Configuração do Banco de Dados

1.  Crie um banco de dados MySQL e as tabelas department e seller usando o seguinte script SQL:

``` sql
CREATE DATABASE demo_dao;

USE demo_dao;

CREATE TABLE department (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50) NOT NULL
);

CREATE TABLE seller (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    BirthDate DATE,
    BaseSalary DOUBLE,
    DepartmentId INT,
    FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);
```
2. Configure a conexão com o banco de dados no arquivo db.properties:

```properties
db.url=jdbc:mysql://localhost:3306/demo_dao
db.user=root
db.password=password
```

## Executando o Projeto

1. Clone este repositório para sua máquina local.
2. Abra o projeto em sua IDE de preferência.
3. Configure as dependências do projeto (se necessário).
4. Certifique-se de que o banco de dados MySQL está em execução e acessível.
5. Execute a classe Program.java para ver a demonstração das operações CRUD.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias ou correções.
