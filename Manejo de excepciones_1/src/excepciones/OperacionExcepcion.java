package excepciones;

/**
 *
 * @author JOSE
 */
//utilizo excepciones de tipo RunttimeException para que limpien mas nuestro codigo
public class OperacionExcepcion extends RuntimeException {

    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }

}
