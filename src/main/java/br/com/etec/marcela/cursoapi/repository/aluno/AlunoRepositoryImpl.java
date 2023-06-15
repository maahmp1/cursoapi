package br.com.etec.marcela.cursoapi.repository.aluno;

import br.com.etec.marcela.cursoapi.model.Aluno;
import br.com.etec.marcela.cursoapi.model.Cidade;
import br.com.etec.marcela.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.marcela.cursoapi.repository.projections.AlunoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class AlunoRepositoryImpl implements AlunoRepositoryQuery{
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<AlunoDto> filtrar(AlunoFilter alunoFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<AlunoDto> criteria = builder.createQuery(AlunoDto.class);
        Root<Aluno> root =criteria.from(Aluno.class);

        criteria.select(builder.construct(AlunoDto.class
        , root.get("id")
        , root.get("nomealuno")
        , root.get("cidade").get("nomecidade")
        , root.get ("cidade").get ("uf")
        , root.get ("curso").get ("nomecurso")
        ));

       // Predicate[] predicates = criarRestricoes(alunoFilter, builder, root);
       // criteria.where(predicates);
        //criteria.orderBy(builder.asc(root.get("nomealuno")));

        //TypedQuery<AlunoDto> query = manager.createQuery(criteria);
        //adicionarRestricoesDePaginacao(query, pageable);


        //private void adicionarRestricoesdePaginacao(TypedQuery< Cidade > query, Pageable pageable) {
            //int paginaAtual = pageable.getPageNumber();;
            //int totalRegistrosPorPagina = pageable.getPageSize();
           // int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

         //   query.setFirstResult(primeiroRegistroDaPagina);
       //     query.setMaxResults(totalRegistrosPorPagina);
     //   }



        return null;
    }
}
