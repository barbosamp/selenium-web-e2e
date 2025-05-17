#language: pt
#enconding: UTF-8
#version: 1.0

Funcionalidade: Login
  Com essa funcionalidade iremos realizar o login de um usuário cadastrado na aplicação

  Como um usuário cadastrado
  Eu preciso inserir dados cadastrais
  Para o login ser efetuado com sucesso

  Contexto: Entrar na tela de login
    Dado que o cliente esteja na tela de login

  @smokeTest @loginAplicacao
  Cenário: Validar o login na aplicação
    Quando inserir os dados do usuário
      | email               | senha     |
      | automacao@etech.dev | Etech@123 |
    Então devo visualizar o campo "E.Tech"