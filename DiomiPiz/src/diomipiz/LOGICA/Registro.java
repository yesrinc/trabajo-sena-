
package diomipiz.LOGICA;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//mapeo 
@Entity
public class Registro implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    private String Nombre;
    private String Apellido;
    private int Identificacion;
    private String Correo;
    private long Telefono;
    private String Usuario;
    private String Contrasena;

    public Registro() {
    }

    public Registro(int id, String Nombre, String Apellido, int Identificacion, String Correo, long Telefono, String Usuario, String Contrasena) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Identificacion = Identificacion;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public long  getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    
}
