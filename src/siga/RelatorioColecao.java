package siga;

import java.util.List;

/**
 * Depende apenas da abstracao FonteDeExemplares.
 * A conversao do formato legado nao e mais feita aqui.
 */
public class RelatorioColecao {

    private final FonteDeExemplares fonte;

    public RelatorioColecao(FonteDeExemplares fonte) {
        this.fonte = fonte;
    }

    public List<Exemplar> listarTodos() {
        return fonte.listarExemplares();
    }

    public void imprimir() {
        System.out.println("   Situacao segundo o relatorio:");
        for (Exemplar item : listarTodos()) {
            System.out.println("     " + item + " - "
                    + (item.isDisponivel() ? "disponivel" : "baixado"));
        }
    }
}