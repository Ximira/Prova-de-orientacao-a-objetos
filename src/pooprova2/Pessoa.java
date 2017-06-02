package pooprova2;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private final RG rg;
    private final CPF cpf;
    private Conta[] contas;
    private Endereco[] endereco;

    public Pessoa(
            String nome,
            String sobrenome,
            RG rg,
            CPF cpf,
            Endereco[] endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public Pessoa(
            String nome,
            String sobrenome,
            RG rg,
            CPF cpf,
            Conta[] contas,
            Endereco[] endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
        this.contas = contas;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Conta[] getContas() {
        return contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    public Endereco[] getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco[] endereco) {
        this.endereco = endereco;
    }
}
