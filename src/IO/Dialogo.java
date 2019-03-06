package IO;

/**
 *
 * @author Angel
 */
abstract class Dialogo implements IMetodosComunes{
    
    @Override
    public void mostrar(String msg) { // Se sobreescribe en las subclases
    }

    enum Tipo {
        CONSOLA, // se selecciona por donde se mostrara la informacion
        VENTANA
    }
    
    static public Dialogo crearDialogo(Tipo tipo) { // Se crea un objeto del Tipo deseado y se devuelve
        Dialogo dialogoCreado;
        switch (tipo) {
            // creamos un dialogo de consola
            case CONSOLA:
                dialogoCreado = new ConsDialogo();
                break;
            // creamos un dialogo de ventana
            case VENTANA:
                dialogoCreado = new VentanaDialogo();
                break;
            default:
                dialogoCreado = null;
        }
        
        return dialogoCreado;

    }
    
}
