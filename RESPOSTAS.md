# Respostas — Sistema de Emprestimo da Biblioteca

Nome completo: ______Evandro Gabriel Campos de Azevedo___________  RA: ______________

> Preencha **todos** os campos. Campo vazio é campo não avaliado.
> Não apague os títulos nem os rótulos em negrito: a correção procura por eles.

---

# Etapa 1 — Diagnóstico

## Problema 1 — a conversão do acervo central

**Em que consiste o problema, e o que acontece quando o sistema cresce:**

R: O princiapl problema acontece em o método da classe reconhecer apena letras maisculas, acumular mais de uma função especifica, instaciar diretamente uma classe concreta e não estar preparada para receber outra base de consulta tendo que reescrever o código modicando talvez em mais lugares.

**Princípio SOLID violado:**

R: Principio OCP, SRP e DIP;

**Classes afetadas (pelo nome):**
CatalogoExemplares
AcervoLegadoWS

**Que outra dependência indevida essas classes têm em relação ao
acervo central, e por que ela é um problema:**
R: Posição de colunas, se amanhã mudar quebra a lógica atual de consulta;
Mudanças de letra também podem ocasionar quebra de lógica;
A classe instacia o acervo, tendo acesso a tudo;


## Problema 2 — o ciclo de vida de Emprestimo

**Em que consiste o problema, e o que acontece quando o sistema cresce:**


**Princípio SOLID violado:**


**Classes afetadas (pelo nome):**


---

# Etapa 4 — Justificativa

## Padrão aplicado ao Problema 1

**O problema que ele resolve (descreva antes de nomear o padrão):**


**Nome do padrão:**


**Alternativa descartada e por que ela não resolveria por completo:**


## Padrão aplicado ao Problema 2

**O problema que ele resolve (descreva antes de nomear o padrão):**


**Nome do padrão:**


**Alternativa descartada e por que ela não resolveria por completo:**
