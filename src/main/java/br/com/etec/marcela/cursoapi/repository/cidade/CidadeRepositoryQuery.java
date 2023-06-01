package br.com.etec.marcela.cursoapi.repository.cidade;

import br.com.etec.marcela.cursoapi.model.Cidade;

import br.com.etec.marcela.cursoapi.repository.filter.CidadeFilter;
import br.com.etec.marcela.cursoapi.repository.filter.CursoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CidadeRepositoryQuery {

        public Page<Cidade> Filtrar(CidadeFilter cidadeFilter, Pageable pageable);

}
