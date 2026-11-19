package siga;

/**
 * RESERVADO --emprestar--> EMPRESTADO
 * RESERVADO --anular-->    ENCERRADO
 */
public class FaseReservado extends FaseEmprestimo {

    public FaseReservado() {
        super("RESERVADO");
    }

    @Override
    public FaseEmprestimo emprestar() {
        return new FaseEmprestado();
    }

    @Override
    public FaseEmprestimo anular() {
        return new FaseEncerrado();
    }
}