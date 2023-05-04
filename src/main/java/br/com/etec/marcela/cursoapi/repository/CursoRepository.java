package br.com.etec.marcela.cursoapi.repository;

import br.com.etec.marcela.cursoapi.model.Curso;
import br.com.etec.marcela.cursoapi.repository.curso.CursoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.etec.marcela.cursoapi.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>, CursoRepositoryQuery {
}
