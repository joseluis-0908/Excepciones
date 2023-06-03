package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class testExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error tipo OperacionExcepcion: ");
            System.out.println(" ===== " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Operacionexcepcion : ");
            //e.printStackTrace(System.out);
            System.out.println("El error es: " + e.getMessage());
        } // utilizamos finally como una palabra reservada para representar que se represente este bloque de finally
        // Finally lo utilizamos para cerrar recursos 
        // ejemplo sitenemos abierta una conexion a una base de datos o documento
        //de esta forma finally podelmos utilizar para cerrar cualquier recurso
        finally {
            System.out.println("Se realizo la division entre cero: ");
        }
        System.out.println("La division es: " + resultado);

    }

}
