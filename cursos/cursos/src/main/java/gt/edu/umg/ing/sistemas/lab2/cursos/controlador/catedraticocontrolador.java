
package gt.edu.umg.ing.sistemas.lab2.cursos.controlador;

import gt.edu.umg.ing.sistemas.lab2.cursos.modelo.catedratico;
import gt.edu.umg.ing.sistemas.lab2.cursos.servicio.catedraticoservicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/catedratico")
public class catedraticocontrolador {
     @Autowired
    private catedraticoservicio catedraticoservicio;
    
    @GetMapping("/buscarcatedraticos")
    public List<catedratico> buscarTodos(){
        return this.catedraticoservicio.retornocatedratico();
    }
    
    @PostMapping("ingresarcatedraticos")
    public catedratico registrar(@RequestBody (required = true) catedratico c1){
        return this.catedraticoservicio.ingresocatedratico(c1);
    }
}
