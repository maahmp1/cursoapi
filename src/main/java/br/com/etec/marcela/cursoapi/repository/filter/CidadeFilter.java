package br.com.etec.marcela.cursoapi.repository.filter;

public class CidadeFilter {
    private String uf;
    private String nomecidade;


    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }


    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


}
