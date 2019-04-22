
package gt.edu.umg.ing.sistemas.lab2.cursos.servicio;

import gt.edu.umg.ing.sistemas.lab2.cursos.dao.catedraticorepository;
import gt.edu.umg.ing.sistemas.lab2.cursos.modelo.catedratico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class catedraticoservicio {
      @Autowired
    private catedraticorepository catedratico;
    
    public List<catedratico> retornocatedratico(){
        return (List<catedratico>) this.catedratico.findAll();
    }
    
    public catedratico ingresocatedratico(catedratico c1){
        return this.catedratico.save(c1);
    }
}
