package siga;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorAcervoLegado implements FonteDeExemplares {

    private static final int COLUNA_CODIGO = 0;
    private static final int COLUNA_DESCRICAO = 1;
    private static final int COLUNA_SITUACAO = 2;

    private final AcervoLegadoWS legado;

    public AdaptadorAcervoLegado(AcervoLegadoWS legado) {
        this.legado = legado;
    }

    @Override
    public List<Exemplar> listarExemplares() {
        List<Exemplar> exemplares = new ArrayList<>();
        for (String[] linha : legado.consultarExemplares()) {
            Exemplar item = new Exemplar(linha[COLUNA_CODIGO], linha[COLUNA_DESCRICAO]);
            // trata "D" e "d": o sistema de origem as vezes manda minuscula
            item.setDisponivel("D".equalsIgnoreCase(linha[COLUNA_SITUACAO]));
            exemplares.add(item);
        }
        return exemplares;
    }
}