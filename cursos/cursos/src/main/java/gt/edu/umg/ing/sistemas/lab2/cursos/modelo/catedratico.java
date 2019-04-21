
package gt.edu.umg.ing.sistemas.lab2.cursos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catedratico")
public class catedratico {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;  
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "codigo_catedratico")
    private String codigo_catedratico;

    public catedratico() {
    }

    public catedratico(String nombres, String apellidos, String codigo_catedratico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo_catedratico = codigo_catedratico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo_catedratico() {
        return codigo_catedratico;
    }

    public void setCodigo_catedratico(String codigo_catedratico) {
        this.codigo_catedratico = codigo_catedratico;
    }
    
}
