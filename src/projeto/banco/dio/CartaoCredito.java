package projeto.banco.dio;

public abstract class CartaoCredito extends Conta{

    private String nome;

    public CartaoCredito(Cliente cliente) {
        super(cliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
