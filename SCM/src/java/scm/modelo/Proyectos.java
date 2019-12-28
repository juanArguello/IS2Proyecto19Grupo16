
package scm.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Juan Carlos Arguello Ortiz
 * @version 1.0
 */
public class Proyectos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String codigo;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinEstimada;
    private String anhoProyecto;
    private String estado;

    public Proyectos() {
    }

    public Proyectos(String codigo) {
        this.codigo = codigo;
    }

    public Proyectos(String codigo, String nombre, Date fechaInicio, Date fechaFinEstimada, String anhoProyecto, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
        this.anhoProyecto = anhoProyecto;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(Date fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    public String getAnhoProyecto() {
        return anhoProyecto;
    }

    public void setAnhoProyecto(String anhoProyecto) {
        this.anhoProyecto = anhoProyecto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
