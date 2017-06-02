/*
    Ronald Theodoro Nascimento Silva
    Thamara Barbosa de Melo Campos

    4º ADS manha
*/

package pooprova2;

public class Endereco {
    private String cep;
    private int numero;
    private String complemento;
    private final Pessoa pessoa;

    public Endereco(String cep, int numero, String complemento, Pessoa pessoa) {
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.pessoa = pessoa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
