package ejemplo002;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.util.Formatter;

public class CrearArchivoTexto {

    // agrega registros al archivo
    public static void agregarRegistros(String valor) {
        try {
            Formatter salida = new Formatter("data/salidaInformacion.txt");
            salida.format("%s\n", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    } // fin método agregarRegistros
    
} // fin de la clase CrearArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su  *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o   *
 * con la documentaci�n contenida en estos libros. Los autores y el       * 
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes*
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                        *
 *************************************************************************/
