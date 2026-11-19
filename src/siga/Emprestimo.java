package siga;

/**
 * Ciclo de vida delegado as classes de fase (padrao State).
 * As regras de transicao estao em FaseReservado, FaseEmprestado e
 * FaseEncerrado.
 *
 *   RESERVADO  --emprestar-->  EMPRESTADO
 *   RESERVADO  --anular-->     ENCERRADO
 *   EMPRESTADO --restituir-->  ENCERRADO
 *   ENCERRADO e final.
 */
public class Emprestimo {

    private final Leitor solicitante;
    private final Exemplar item;
    private FaseEmprestimo fase;

    public Emprestimo(Leitor solicitante, Exemplar item) {
        this.solicitante = solicitante;
        this.item = item;
        this.fase = new FaseReservado();
    }

    public String getSituacao() {
        return fase.getNome();
    }

    public void emprestar() {
        fase = fase.emprestar();
    }

    public void restituir() {
        fase = fase.restituir();
    }

    public void anular() {
        fase = fase.anular();
    }

    public Leitor getSolicitante() {
        return solicitante;
    }

    public Exemplar getExemplar() {
        return item;
    }
}