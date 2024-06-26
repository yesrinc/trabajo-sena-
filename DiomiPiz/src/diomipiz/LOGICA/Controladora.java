
package diomipiz.LOGICA;

import diomipiz.Persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();


    public void guardar(String nombre, String apellido, String numeroid, 
            String correo, String telefono, String usuario, String contrasena) {
    
            Registro registro = new Registro();
            registro.setNombre(nombre);
            registro.setApellido(apellido);
            // Convertir numeroid a int si es necesario
            int identificacion = (int) Long.parseLong(numeroid.trim());
            registro.setIdentificacion(identificacion);
            registro.setCorreo(correo);
             // Convertir telefono a int si es necesario
            int telefonoInt = (int) Long.parseLong(telefono.trim());
            registro.setTelefono(telefonoInt);
            registro.setUsuario(usuario);
            registro.setContrasena(contrasena);
            
            controlPersis.guardar(registro);
            
    } 

    public void guardar(String codigoProducto, String nombreproducto, String precio, String cantidad) {
       
        Inventario inventario = new Inventario();
        inventario.setNombreproducto(nombreproducto);
        // Convertir codigoProducto a int si es necesario
        int codigoProductoInt = Integer.parseInt(codigoProducto.trim());
        inventario.setCodigoProducto(codigoProductoInt);
        
        // Convertir precio a double si es necesario
        int precioDouble = Integer.parseInt(precio.trim());
        inventario.setPrecio(precioDouble);
        inventario.setCatidad(cantidad);
    
        controlPersis.guardar(inventario);

    }

    public void eliminar(String codigoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
  
}
 
