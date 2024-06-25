# Medical Management API

Este projeto foi desenvolvido durante o programa [One - Oracle Next Education](https://www.oracle.com/br/education/oracle-next-education/) em parceria com a [Alura](https://www.alura.com.br/). O módulo `Spring Boot 3: desenvolva uma API Rest em Java` tem como objetivo criar uma API para gerenciamento de médicos e pacientes.

## Tecnologias Utilizadas:

### Backend
- <a href="https://www.java.com/pt-BR/">Java</a><img align="center" alt="Java" height="20" width="30" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">

- <a href="https://spring.io/projects/spring-boot">Spring Boot</a><img align="center" alt="Spring Boot" height="20" width="30" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">

### Banco de Dados
- <a href="https://www.mysql.com/">MySQL</a><img align="center" alt="MySQL" height="20" width="30" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg">

## Configuração do Projeto:

Para configurar o projeto localmente, siga os passos abaixo:

1. Clone o repositório:
```bash
$ git clone git@github.com:igopereira1/spring-medical-management.git
```

2. Se tiver o MySQL instalado, crie um banco de dados `medicalmanagement_api` e defina as variáveis de ambiente no terminal:
```bash
$ export DB_HOST = localhost
$ export DB_PORT = 3306
$ export DB_NAME = medicalmanagement_api
$ export DB_USER = `seu_usuario`
$ export DB_PASSWORD = `sua_senha`
```

3. Para verificar se as variáveis de ambiente foram definidas corretamente, execute o comando abaixo:
```bash
$ echo $DB_HOST $DB_PORT $DB_NAME $DB_USER $DB_PASSWORD
```

4. Se não houver o MySQL instalado, crie um container com o comando abaixo. Aqui já será criado um banco de dados `medicalmanagement_api`;
```bash
$ docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=[sua-senha] -e MYSQL_DATABASE=medicalmanagement_api -p 3306:3306 -d mysql
```

5. Defina as variáveis de ambiente:
```bash
$ export DB_HOST = localhost
$ export DB_PORT = 3306
$ export DB_NAME = medicalmanagement_api
$ export DB_USER = `seu_usuario`
$ export DB_PASSWORD = `sua_senha`
```

6. Execute o projeto
```bash
$ ./mvnw spring-boot:run
```