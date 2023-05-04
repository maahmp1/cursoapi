package br.com.etec.marcela.cursoapi.repository.curso;

import br.com.etec.marcela.cursoapi.model.Curso;
import br.com.etec.marcela.cursoapi.repository.filter.CursoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CursoRepositoryQuery {

    public Page<Curso> Filtrar(CursoFilter cursoFilter, Pageable pageable);
}
