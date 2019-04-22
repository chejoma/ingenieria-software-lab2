
package gt.edu.umg.ing.sistemas.lab2.cursos.servicio;

import gt.edu.umg.ing.sistemas.lab2.cursos.dao.cursorepository;
import gt.edu.umg.ing.sistemas.lab2.cursos.modelo.curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cursoservicio {
    
     @Autowired
    private cursorepository curso;
    
    public List<curso> retornocursos(){
        return (List<curso>) this.curso.findAll();
    }
    
    public curso insertarcurso(curso c1){
        return this.curso.save(c1);
    }
}
