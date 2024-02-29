# ---Banco Nacional---

## Categorias

Descrição dos endpoints de categoria

- `GET` /categorias: lista todas as categorias do sistema
- `POST` /categorias: cadastra uma categoria
- `GET` /categorias/{id}: retorna uma categoria específica
- `DELETE` /categorias/{id}: apaga a categoria especificada
- `PUT` /categorias/{id}: atualizar os dados da categoria

### Exemplo de JSON
```js
{
    "id": long,
    "nome": "string",
    "icone": "string" 
}
```

### Códigos de retorno
|codigo| significado
|-|-
|200 | dados retornados com sucesso
|201 | criado com sucesso
|204 | apagado com sucesso
|400 | dados inválidos
|404 | não encontrado


