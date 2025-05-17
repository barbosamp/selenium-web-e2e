#language: pt
#enconding: UTF-8
#version: 1.0

Funcionalidade: Cadastro de usuários

  @cadastro @smoketest
  Cenario: Validar cadastro de usuário com sucesso
    Dado que o cliente esteja na tela de login
    E acesso a tela de cadastro de usuário
    Quando preencho os campos de cadastro com dados válidos
    Então devo visualizar a tela de login
