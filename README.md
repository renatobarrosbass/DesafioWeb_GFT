# Projeto de Automação de Testes com Selenium e Cucumber

Este projeto é um exemplo de automação de testes utilizando Selenium WebDriver e Cucumber. O objetivo é preencher um formulário no site Cat API e verificar se a API Key foi enviada para o email informado.

## Estrutura do Projeto

O framework criado utiliza a seguinte abstração: dividimos o projeto em pastas, criando dentro da pasta principal - `src` - a pasta `java`, que por default pelo tipo do projeto também gera a pasta `resources`.

Dentro da pasta `java` guardamos as lógicas utilizadas, subdivididas conforme:

- **util**: Guarda classes de utilização geral no projeto.
- **run**: Guarda a classe `RunnerTest` responsável por configurar o projeto e permitir que execute os testes via Cucumber.
- **actions**: Guarda as lógicas das ações executadas nos steps definidos no teste.
- **steps**: Deve ter um nome igual ao da feature que será o guia de execução dos cenários de testes, e nesta pasta guardamos os passos descritos em Gherkin na feature.
- **page**: Guarda os localizadores dos elementos necessários aos testes.

Na pasta principal `main`, temos a pasta `resources`, responsável por guardar os arquivos `.feature` que descrevem os cenários do projeto vistos como necessários.

## Pré-requisitos
Java JDK 8 ou superior
Maven
IntelliJ IDEA (ou outra IDE de sua preferência)

## Configuração do Ambiente
Clone o repositório para a sua máquina local:
git clone https://github.com/seu-usuario/seu-repositorio.git
Navegue até o diretório do projeto:
cd meu-projeto

## Instale as dependências do projeto utilizando o Maven:
mvn clean install
Funcionalidades

## Descrição de Negócio
Foi utilizado o mesmo website que usei nos testes de API. Um site que permite estudos de front-end web responsivo, e que para conceder acesso necessita de um cadastro do usuário, para a obtenção de um token pessoal. Foi este o cenário automatizado via web:

## Passos descritos como necessários
Acessar o site Cat API no navegador.
Preencher o formulário com email, descrição do aplicativo e selecionar o projeto pessoal.
Tirar uma screenshot do resultado e salvar na pasta Evidencias.
Contribuição
Se você quiser contribuir com este projeto, por favor, faça um fork do repositório e envie um pull request com suas alterações.

## Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

### Estrutura do Projeto
<img width="960" alt="DesafioWebGFT" src="https://github.com/renatobarrosbass/DesafioWeb_GFT/assets/14953996/59eb5a40-4c89-4a36-a49d-109c6dfe228e">
