package br.com.etec.marcela.cursoapi.repository;
import br.com.etec.marcela.cursoapi.model.Cidade;
import br.com.etec.marcela.cursoapi.repository.cidade.CidadeRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>, CidadeRepositoryQuery {
}
