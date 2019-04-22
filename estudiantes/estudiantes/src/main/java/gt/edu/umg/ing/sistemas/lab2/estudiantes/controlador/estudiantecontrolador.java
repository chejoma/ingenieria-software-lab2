
package gt.edu.umg.ing.sistemas.lab2.estudiantes.controlador;

import gt.edu.umg.ing.sistemas.lab2.estudiantes.modelo.estudiante;
import gt.edu.umg.ing.sistemas.lab2.estudiantes.servicio.estudianteservicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

  @RestController
@RequestMapping("/estudiante")
public class estudiantecontrolador {
      @Autowired
    private estudianteservicio estudianteservicio;
    
    @GetMapping("/buscarTodos")
    public List<estudiante> buscarTodos(){
        return this.estudianteservicio.retornoestudiante();
    }
    
    @PostMapping("/registrar")
    public estudiante registrar(@RequestBody (required = true) estudiante e1){
        return this.estudianteservicio.insertar(e1);
    }
  
}
