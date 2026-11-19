package siga;

/**
 * EMPRESTADO --restituir--> ENCERRADO
 */
public class FaseEmprestado extends FaseEmprestimo {

    public FaseEmprestado() {
        super("EMPRESTADO");
    }

    @Override
    public FaseEmprestimo restituir() {
        return new FaseEncerrado();
    }
}