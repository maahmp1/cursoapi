package br.com.etec.marcela.cursoapi.resources;


import br.com.etec.marcela.cursoapi.model.Cidade;
import br.com.etec.marcela.cursoapi.repository.CidadeRepository;
import br.com.etec.marcela.cursoapi.repository.filter.CidadeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")

public class CidadeResources {

    @Autowired
    private CidadeRepository cidadeRepository;

    @GetMapping()
    public Page<Cidade> pesquisar(CidadeFilter cidadeFilter, Pageable pageable){
        return cidadeRepository.Filtrar(cidadeFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Cidade> listarTodasCidades(){

        return cidadeRepository.findAll();
    }


}
