/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ing.sistemas.lab2.estudiantes.dao;

import gt.edu.umg.ing.sistemas.lab2.estudiantes.modelo.estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estudianterepository extends CrudRepository<estudiante,Long>{
    
}
