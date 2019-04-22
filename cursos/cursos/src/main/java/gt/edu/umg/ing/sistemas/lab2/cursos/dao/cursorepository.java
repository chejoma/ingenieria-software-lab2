
package gt.edu.umg.ing.sistemas.lab2.cursos.dao;


import gt.edu.umg.ing.sistemas.lab2.cursos.modelo.curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface cursorepository extends CrudRepository<curso,Long>{
    
}
