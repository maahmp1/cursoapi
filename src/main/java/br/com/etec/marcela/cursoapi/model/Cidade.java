package br.com.etec.marcela.cursoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer Id;
    private String nomecidade;
    private String uf;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Id.equals(cidade.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Aluno> getAlunoscidade() {
        return alunoscidade;
    }

    public void setAlunoscidade(List<Aluno> alunoscidade) {
        this.alunoscidade = alunoscidade;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "cidade")
    private List<Aluno> alunoscidade = new ArrayList<>();



}
