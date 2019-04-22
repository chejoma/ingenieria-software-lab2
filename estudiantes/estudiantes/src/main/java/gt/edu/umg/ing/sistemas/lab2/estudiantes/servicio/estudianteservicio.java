/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ing.sistemas.lab2.estudiantes.servicio;

import gt.edu.umg.ing.sistemas.lab2.estudiantes.dao.estudianterepository;
import gt.edu.umg.ing.sistemas.lab2.estudiantes.modelo.estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class estudianteservicio {
      @Autowired
    private estudianterepository estudiante;
    
    public List<estudiante> retornoestudiante(){
        return (List<estudiante>) this.estudiante.findAll();
    }
    
    public estudiante insertar(estudiante e1){
        return this.estudiante.save(e1);
    }
}
