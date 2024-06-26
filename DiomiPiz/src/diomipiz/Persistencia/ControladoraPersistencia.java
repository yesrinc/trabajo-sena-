package diomipiz.Persistencia;

import diomipiz.LOGICA.Inventario;
import diomipiz.LOGICA.Registro;

public class ControladoraPersistencia {
      
    InventarioJpaController inventarioJpa = new InventarioJpaController();
    RegistroJpaController registroJpa = new RegistroJpaController();

    public void guardar(Registro registro) {
        registroJpa.create(registro);
    }

    public void guardar(Inventario inventario) {
       inventarioJpa.create(inventario);
    }

    
    
}

