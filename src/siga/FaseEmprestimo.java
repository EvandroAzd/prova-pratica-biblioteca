package siga;

/**
 * STATE: cada fase do ciclo de vida e uma subclasse.
 * Por padrao toda operacao e recusada; cada fase sobrescreve apenas as
 * transicoes que permite e devolve a fase seguinte.
 */
public abstract class FaseEmprestimo {

    private final String nome;

    protected FaseEmprestimo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public FaseEmprestimo emprestar() {
        throw recusar("emprestar");
    }

    public FaseEmprestimo restituir() {
        throw recusar("restituir");
    }

    public FaseEmprestimo anular() {
        throw recusar("anular");
    }

    private IllegalStateException recusar(String operacao) {
        return new IllegalStateException(
                "Nao e possivel " + operacao + " em " + nome + ".");
    }
}