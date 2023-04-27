package br.com.etec.marcela.cursoapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.etec.marcela.cursoapi.model.Aluno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long>{

}
