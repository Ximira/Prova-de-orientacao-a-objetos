package pooprova2;

public class RG {
    private String numero;
    private String digito;
    private String emissor;
    private String dataEmissao;
    private final Pessoa pessoa;

    public RG(
            String numero,
            String digito,
            String emissor,
            String dataEmissao,
            Pessoa pessoa) {
        this.numero = numero;
        this.digito = digito;
        this.emissor = emissor;
        this.dataEmissao = dataEmissao;
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

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
}
