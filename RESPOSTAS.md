# Respostas — Sistema de Emprestimo da Biblioteca

Nome completo: ______Evandro Gabriel Campos de Azevedo___________  RA: ______________

> Preencha **todos** os campos. Campo vazio é campo não avaliado.
> Não apague os títulos nem os rótulos em negrito: a correção procura por eles.

---

# Etapa 1 — Diagnóstico

## Problema 1 — a conversão do acervo central

**Em que consiste o problema, e o que acontece quando o sistema cresce:**

O princiapl problema acontece em o método da classe reconhecer apena letras maisculas, acumular mais de uma função especifica, instaciar diretamente uma classe concreta e não estar preparada para receber outra base de consulta tendo que reescrever o código modicando talvez em mais lugares.

**Princípio SOLID violado:**

SRP: CatalogoExemplares e RelatorioColecao têm, além da sua responsabilidade (filtrar disponíveis / montar o relatório), a responsabilidade de interpretar o formato do serviço legado;

**Classes afetadas (pelo nome):**
CatalogoExemplares e RelatorioColecao (que duplicam a conversão e dependem de AcervoLegadoWS); AcervoLegadoWS é a origem do formato, mas não pode ser alterada.

**Que outra dependência indevida essas classes têm em relação ao
acervo central, e por que ela é um problema:**
R: Posição de colunas, se amanhã mudar quebra a lógica atual de consulta;
Mudanças de letra também podem ocasionar quebra de lógica;
A classe instacia o acervo, tendo acesso a tudo;


## Problema 2 — o ciclo de vida de Emprestimo

**Em que consiste o problema, e o que acontece quando o sistema cresce:**

Como a situação é texto, um erro de digitação (por exemplo "EMPRESTDO") compila e só aparece em execução. Quando o sistema crescer, cada novo estado (por exemplo ATRASADO ou RENOVADO) ou nova operação vai exigir abrir e alterar todos os métodos existentes, acumulando if/else e aumentando o risco de quebrar transições que já funcionavam.

**Princípio SOLID violado:**

OCP: A classe não está fechada para modificação: para estender o ciclo de vida com um novo estado é obrigatório modificar o código já existente de todos os métodos públicos.

**Classes afetadas (pelo nome):**

Emprestimo

---

# Etapa 4 — Justificativa

## Padrão aplicado ao Problema 1

**O problema que ele resolve (descreva antes de nomear o padrão):**

O sistema precisa usar um componente externo cuja interface (uma matriz `String[][]` com a situação em letra) é incompatível com a que as classes do sistema esperam (`List<Exemplar>`), e esse componente não pode ser alterado. A solução foi criar uma interface própria do sistema, `FonteDeExemplares`, com o método `listarExemplares()`, e uma classe `AdaptadorAcervoLegado` que implementa essa interface, guarda um `AcervoLegadoWS` e faz a tradução de um formato para o outro. Assim a conversão existe em um único lugar (o adaptador, já tratando maiúscula e minúscula), e `CatalogoExemplares` e `RelatorioColecao` passam a depender apenas da interface, sem nenhuma referência a `AcervoLegadoWS`. A ligação entre as peças é feita só na montagem, no `Main`.

**Nome do padrão:**


**Alternativa descartada e por que ela não resolveria por completo:**


## Padrão aplicado ao Problema 2

**O problema que ele resolve (descreva antes de nomear o padrão):**


**Nome do padrão:**


**Alternativa descartada e por que ela não resolveria por completo:**
