<h1 align="center">Automação Web</h1>
<h1 align="center">
    <a href="https://www.oracle.com/java/technologies/downloads/#java24">🔗 Java</a>
    <a href="https://www.selenium.dev/">🔗 Selenium</a>
    <a href="http://cucumber.io/">🔗 Cucumber</a>
    <a href="https://junit.org/junit5/">🔗 jUnit</a>
    <a href="https://github.com/DiUS/java-faker">🔗 Faker</a>

</h1>
<p align="center">🚀 Projeto de automação de testes web no app de filmes utilizando Gherkin e Cucumber.</p>


## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 24: Necessário para executar o projeto Java](https://www.oracle.com/java/technologies/downloads/#java24)
- [Maven 3.6.3: Necessário para realizar o build do projeto Java](https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)

*Não Esqueça de configurar as variáveis de ambiente para execução.
- [Tutorial para configuração das variáveis](https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26#:~:text=Bom%2C%20mas%20o%20que%20s%C3%A3o,arquivos%20necess%C3%A1rios%2C%20inclusive%20os%20bin%C3%A1rios.)
- [IntelliJ: Para desenvolvimento do projeto](https://www.jetbrains.com/pt-br/idea/)

*Instale também os plugins Gherkin e Cucumber for Java.

- [Git: Para versionamento e clone do projeto]( https://github.com/barbosamp/appium-mobile-e2e.git)

## Execução via IDE

```bash
                                                                    
├───src                                               
│   ├───main                                          
│   │   ├───java                                      
│   │   │   └───dev.etech.automation                                    
│   │   │       └───web                               
│   │   │           └───common                        
│   │   │           ├───configuration       - Classe de configurações de execução         
│   │   │           ├───enums               - Configure aqui seus dispositivos para execução
│   │   │           ├───interfaces      
│   └───test                                          
│       ├───java                                      
│       │   └───dev.etech.automation                                    
│       │       └───web                               
│       │           └───runTest   - Classe de execução dos testes.          
|       |           └───funcs     - Interações com a tela.
|       |           └───pages               - Mapeamento de elementos
|       |           └───steps               - Steps de testes cucumber
│       └───resources                                 
│           └───features  - Cenários de Teste no formato Gherkin
```

O arquivo que deve ser executado encontra-se:
```bash
# src/test/java/dev/runTest/RunTest.java

# Utilizar a tag para rodar os cénarios que deseja.
# Exemplo:
tags = {"@smokeTest"})

```

#### [IntelliJ] Para executar o projeto basta clicar com o botão direito do mouse -> Run 'RunTest'

## Actions
Para esse projeti foi utilizado configuração de GithubActions, onde a cada nova interação com a branch master, os testes são executados e o relatório do allure é atualizado no githubpages. 
- URL modelo:
https://barbosamp.github.io/selenium-web-e2e/3/index.html#