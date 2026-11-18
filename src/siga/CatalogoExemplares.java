package siga;

import java.util.ArrayList;
import java.util.List;

/**
 * Depende apenas da abstracao FonteDeExemplares.
 * Nao conhece mais o formato do acervo central.
 */
public class CatalogoExemplares {

    private final FonteDeExemplares fonte;

    public CatalogoExemplares(FonteDeExemplares fonte) {
        this.fonte = fonte;
    }

    public List<Exemplar> listarDisponiveis() {
        List<Exemplar> disponiveis = new ArrayList<>();
        for (Exemplar item : fonte.listarExemplares()) {
            if (item.isDisponivel()) {
                disponiveis.add(item);
            }
        }
        return disponiveis;
    }
}