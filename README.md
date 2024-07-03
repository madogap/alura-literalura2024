<h1>Curso Literalura</h1>

  <h2>Descrição do Projeto</h2>
    <p>
        O projeto Curso Literalura é uma aplicação desenvolvida em Java utilizando o framework Spring Boot 3. 
        O objetivo deste projeto é consumir dados da API do Gutendex, que fornece informações sobre livros e autores, 
        e armazenar essas informações em um banco de dados PostgreSQL. A aplicação permite realizar diversas operações, 
        como busca de livros por título, listagem de livros e autores registrados, listagem de autores vivos em determinado ano, 
        listagem de livros por idioma, exibição dos top 10 livros mais baixados, busca de autores por nome e cálculo da média de downloads por autor.
    </p>

  <h2>Funcionalidades</h2>
    <ul>
        <li>Buscar Livro pelo Título: Permite buscar um novo livro pelo título na API do Gutendex e salvá-lo no banco de dados.</li>
        <li>Listar Livros Registrados: Exibe todos os livros que estão registrados no banco de dados.</li>
        <li>Listar Autores Registrados: Exibe todos os autores que estão registrados no banco de dados.</li>
        <li>Listar Autores Vivos em Determinado Ano: Permite buscar e listar autores que estavam vivos em um determinado ano.</li>
        <li>Listar Livros em Determinado Idioma: Exibe todos os livros cadastrados em um idioma específico.</li>
        <li>Top 10 Livros: Mostra os 10 livros mais baixados registrados no banco de dados.</li>
        <li>Buscar Autores por Nome: Permite buscar autores por nome no banco de dados.</li>
        <li>Média de Downloads por Autor: Calcula e exibe a média de downloads dos livros de um autor específico.</li>
    </ul>

  <h2>Estrutura do Projeto</h2>

 <h3>Modelos</h3>
    <ul>
        <li><strong>Autor:</strong> Representa a entidade de Autor, com atributos como nome, data de nascimento, data de falecimento e lista de livros.</li>
        <li><strong>Livro:</strong> Representa a entidade de Livro, com atributos como nome, idioma, quantidade de downloads e autor.</li>
        <li><strong>DadosAutor:</strong> Record que mapeia os dados do autor recebidos da API do Gutendex.</li>
        <li><strong>DadosLivro:</strong> Record que mapeia os dados do livro recebidos da API do Gutendex.</li>
    </ul>

  <h3>Repositórios</h3>
    <ul>
        <li><strong>AutorRepository:</strong> Interface que estende JpaRepository para realizar operações de CRUD e consultas personalizadas na entidade Autor.</li>
        <li><strong>LivroRepository:</strong> Interface que estende JpaRepository para realizar operações de CRUD e consultas personalizadas na entidade Livro.</li>
    </ul>

 <h3>Serviços</h3>
    <ul>
        <li><strong>ConsumoApi:</strong> Classe responsável por consumir a API do Gutendex.</li>
        <li><strong>DadosConverter:</strong> Classe responsável por converter os dados recebidos da API para os modelos utilizados na aplicação.</li>
    </ul>

   <h3>Principal</h3>
    <ul>
        <li><strong>Principal:</strong> Classe principal que contém o menu de opções e as funcionalidades da aplicação.</li>
    </ul>

   <h2>Configuração do Ambiente</h2>
    <h3>Pré-requisitos</h3>
    <ul>
        <li>Java 17</li>
        <li>Maven</li>
        <li>PostgreSQL</li>
    </ul>

  <h3>Configuração do Banco de Dados</h3>
    <p>Configure o arquivo <code>application.properties</code> com as seguintes informações:</p>
    <pre><code>spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver
hibernate.dialect=org.hibernate.dialect.HSQLDialect

spring.jpa.show-sql=false
spring.jpa.format-sql=true
spring.jpa.hibernate.ddl-auto=update
</code></pre>

 <p>Substitua <code>${DB_HOST}</code>, <code>${DB_NAME}</code>, <code>${DB_USER}</code> e <code>${DB_PASSWORD}</code> pelos valores apropriados para o seu ambiente.</p>

  <h3>Dependências do Maven</h3>
    <p>As principais dependências do projeto são:</p>
    <ul>
        <li>Spring Boot Starter Data JPA</li>
        <li>Spring Boot Starter Web</li>
        <li>PostgreSQL Driver</li>
        <li>Lombok</li>
        <li>Jackson Databind</li>
    </ul>

   <h2>Executando a Aplicação</h2>
    <p>Para executar a aplicação, siga os passos abaixo:</p>
    <ol>
        <li>Clone o repositório:
            <pre><code>git clone https://github.com/madogap/alura-literalura2024.git</code></pre>
        </li>
        <li>Navegue até o diretório do projeto:
            <pre><code>cd projeto-literalura</code></pre>
        </li>
        <li>Compile e execute a aplicação utilizando o Maven:
            <pre><code>mvn spring-boot:run</code></pre>
        </li>
    </ol>
    <p>A aplicação estará disponível e pronta para uso. Use o menu de opções para interagir com as funcionalidades disponíveis.</p>

   <h2>Contribuições</h2>
    <p>Sinta-se à vontade para contribuir com este projeto. Para contribuir, faça um fork do repositório, crie um branch para suas alterações e envie um pull request.</p>

   <h2>Licença</h2>
    <p>Este projeto está licenciado sob a licença MIT. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>


 <h2>Criando o Projeto com Spring Initializr</h2>
    <p>Siga os passos abaixo para criar o projeto usando o Spring Initializr:</p>
    <ol>
        <li>Acesse o site <a href="https://start.spring.io/">Spring Initializr</a>.</li>
        <li>Configure as opções do projeto:
            <ul>
                <li><strong>Project:</strong> Maven Project</li>
                <li><strong>Language:</strong> Java</li>
                <li><strong>Spring Boot:</strong> 3.0.0</li>
                <li><strong>Project Metadata:</strong>
                    <ul>
                        <li><strong>Group:</strong> com.exemplo</li>
                        <li><strong>Artifact:</strong> curso-literalura</li>
                        <li><strong>Name:</strong> Curso Literalura</li>
                        <li><strong>Description:</strong> Projeto para consumir a API do Gutendex e armazenar dados no PostgreSQL</li>
                        <li><strong>Package Name:</strong> com.exemplo.cursoliteralura</li>
                        <li><strong>Packaging:</strong> Jar</li>
                        <li><strong>Java:</strong> 17</li>
                    </ul>
                </li>
                <li>Adicione as dependências necessárias:
                    <ul>
                        <li>Spring Web</li>
                        <li>Spring Data JPA</li>
                        <li>PostgreSQL Driver</li>
                        <li>Lombok</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>Clique em <strong>Generate</strong> para baixar o projeto.</li>
        <li>Extraia o projeto baixado em um diretório de sua escolha.</li>
    </ol>

   <h2>Fazendo o Clone do Projeto</h2>
    <p>Siga os passos abaixo para fazer o clone do projeto:</p>
    <ol>
        <li>Abra um terminal.</li>
        <li>Navegue até o diretório onde deseja clonar o projeto.</li>
        <li>Execute o comando:
            <pre><code>git clone https://github.com/usuario/projeto-literalura.git</code></pre>
        </li>
        <li>Navegue até o diretório do projeto clonado:
            <pre><code>cd projeto-literalura</code></pre>
        </li>
    </ol>

   <h2>Executando a Aplicação</h2>
    <p>Para executar a aplicação, siga os passos abaixo:</p>
    <ol>
        <li>Compile e execute a aplicação utilizando o Maven:
            <pre><code>mvn spring-boot:run</code></pre>
        </li>
    </ol>
    <p>A aplicação estará disponível e pronta para uso. Use o menu de opções para interagir com as funcionalidades disponíveis.</p>

  <h2>Contribuições</h2>
    <p>Sinta-se à vontade para contribuir com este projeto. Para contribuir, faça um fork do repositório, crie um branch para suas alterações e envie um pull request.</p>

   <h2>Licença</h2>
    <p>Este projeto está licenciado sob a licença MIT. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>


