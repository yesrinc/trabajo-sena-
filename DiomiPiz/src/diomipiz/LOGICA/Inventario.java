package diomipiz.LOGICA;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventario implements Serializable {
    //mapeo para la conexion de 
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id ;
    private int CodigoProducto;
    private String Nombreproducto;
    private int precio;
    private String catidad;

    public Inventario() {
    }

    public Inventario(int id, int CodigoProducto, String Nombreproducto, int precio, String catidad) {
        this.id = id;
        this.CodigoProducto = CodigoProducto;
        this.Nombreproducto = Nombreproducto;
        this.precio = precio;
        this.catidad = catidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public String getNombreproducto() {
        return Nombreproducto;
    }

    public void setNombreproducto(String Nombreproducto) {
        this.Nombreproducto = Nombreproducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCatidad() {
        return catidad;
    }

    public void setCatidad(String catidad) {
        this.catidad = catidad;
    }
    
    
}
