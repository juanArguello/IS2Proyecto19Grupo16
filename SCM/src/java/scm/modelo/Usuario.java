
package scm.modelo;

import java.io.Serializable;

/**
 *
 * @author Juan Carlos Arguello
 * @version 1.0
 */
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nombre;
    private String apellido;
    private char esCliente;
    private String email;
    private String nombreUsuario;
    private String contrasenha;
    private String nombreEmpresa;
    private String descripcion;
    private String telefono;
    private int idRol;

    public Usuario() {
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(int id, String nombre, String apellido, char esCliente, String email, String nombreUsuario, String contrasenha, String nombreEmpresa, String descripcion, String telefono, int idRol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esCliente = esCliente;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.idRol = idRol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getEsCliente() {
        return esCliente;
    }

    public void setEsCliente(char esCliente) {
        this.esCliente = esCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
    
}
