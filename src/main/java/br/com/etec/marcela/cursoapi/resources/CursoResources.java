package br.com.etec.marcela.cursoapi.resources;

import br.com.etec.marcela.cursoapi.model.Curso;
import br.com.etec.marcela.cursoapi.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoResources {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/todos")
    public List<Curso> listarTodosCursos() {

     return cursoRepository.findAll();
    }
}
