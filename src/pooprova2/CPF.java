/*
    Ronald Theodoro Nascimento Silva
    Thamara Barbosa de Melo Campos

    4º ADS manha
*/

package pooprova2;

public class CPF {
    private String numero;
    private String digito;
    private final Pessoa pessoa;

    public CPF(String numero, String digito, Pessoa pessoa) {
        this.numero = numero;
        this.digito = digito;
        this.pessoa = pessoa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
}
