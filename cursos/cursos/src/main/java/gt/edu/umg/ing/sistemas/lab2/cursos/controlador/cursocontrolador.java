
package gt.edu.umg.ing.sistemas.lab2.cursos.controlador;

import gt.edu.umg.ing.sistemas.lab2.cursos.modelo.curso;
import gt.edu.umg.ing.sistemas.lab2.cursos.servicio.cursoservicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class cursocontrolador {
    @Autowired
    private cursoservicio cursoservicio;
    
    @GetMapping("/buscarcursos")
    public List<curso> buscarTodos(){
        return this.cursoservicio.retornocursos();
    }
    
    @PostMapping("/insertarcurso")
    public curso crear(@RequestBody (required = true) curso c1){
        return this.cursoservicio.insertarcurso(c1);
    }
    
}
