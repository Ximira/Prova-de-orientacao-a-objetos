/*
    Ronald Theodoro Nascimento Silva
    Thamara Barbosa de Melo Campos

    4º ADS manha
*/

package pooprova2;

public class Conta implements iConta {
    private int agencia;
    private int numconta;
    private final Pessoa pessoa;

    public Conta(int agencia, int numconta, Pessoa pessoa) {
        this.agencia = agencia;
        this.numconta = numconta;
        this.pessoa = pessoa;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }
    
    @Override
    public void getInfoConta() {
        System.out.println(
            "Conta(agencia=" + agencia + ", numconta=" + numconta + ")");
    }

    @Override
    public void getInfoCliente() {
        System.out.println("Conta(pessoa=" + pessoa.getNome() + ")");
    }
}
