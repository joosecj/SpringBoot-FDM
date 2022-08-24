<h1>DESAFIO: CRUD de clientes</h1>

**Você deverá entregar um projeto Spring Boot contendo um CRUD completo de web services REST para
acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:**

##

- **Busca paginada de recursos**
- **Busca de recurso por id**
- **Inserir novo recurso**
- **Atualizar recurso**
- **Deletar recurso**

##

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar
Maven como gerenciador de dependência, e Java como linguagem.

##

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da
entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no
diagrama):

##

![Exemplo1](https://i.imgur.com/T9xKmH3.png)

##

Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS (não é para
usar dados sem significado como “Nome 1”, “Nome 2”, etc.).

##

**Seu projeto deverá tratar as seguintes exceções:**

1.  Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
2.  Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As regras de validação são:

   - **Nome: não pode ser vazio**
- **Data de nascimento: não pode ser data futura (dica: use @PastOrPresent)**

##

### Testes manuais no Postman:

**Busca de cliente por id:**

- ***GET /clients/1***

##

**Busca paginada de clientes:**

- ***GET /clients?page=0&size=6&sort=name***

##

**Inserção de novo cliente:**

- ***POST /clients***

`{`
`"name": "Maria Silva",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20",
"children": 2
}`

##

**Atualização de cliente:**

- ***PUT /clients/1***

`{`
`"name": "Maria Silvaaa",`
`"cpf": "12345678901",`
`"income": 6500.0,`
`"birthDate": "1994-07-20",`
`"children": 2`
`}`

##

**Deleção de cliente:**

- ***DELETE /clients/1***

##

## Realização

[DevSuperior - Escola de programação](https://devsuperior.com.br/)

[![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/devsuperior.ig) ![DevSuperior no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)