package br.com.impacta.lab;

public class PessoaFisica implements Pessoa{

    private String documento;
    private String tipo;

    public PessoaFisica(String documento, String tipo){
        this.documento = documento;
        this.tipo = tipo;
    };

    @Override
    public String falarDocumento() {
        return documento;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
