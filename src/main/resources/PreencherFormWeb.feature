#language: pt

Funcionalidade: Testar abertura do site Cat API e configurar seu acesso pessoal

  @PreencherDadosCatApi
  Cenário: Abrir o site Cat API e criar seu token de acesso
    Dado que acesso o site Cat API no browser
    Quando informo email, app description, combo personal project
    Entao verifico API Key enviada para o email informado