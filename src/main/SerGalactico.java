package lucasfilms;

/**
 * Interfaz que define las características comunes a todos los seres galácticos en el universo de Star Wars.
 * <p>
 * Esta interfaz especifica los métodos que cualquier clase representativa de un ser galáctico deberá implementar.
 * Esto incluye la capacidad de mostrar información básica, pronunciar una frase icónica y realizar una acción
 * característica.
 * </p>
 *
 * @author 
 * @version 1.0
 */
public interface SerGalactico {
    /**
     * Muestra la información básica del ser galáctico, tales como nombre, especie o afiliación.
     */
    void mostrarInfo();

    /**
     * Permite al ser galáctico pronunciar su frase icónica.
     * <p>
     * Este método debe imprimir o retornar una frase característica que identifique y defina
     * la esencia del personaje.
     * </p>
     */
    void hablarFraseIconica();

    /**
     * Realiza una acción característica del ser galáctico.
     * <p>
     * El método puede representar acciones diversas dependiendo del tipo de ser galáctico, como
     * activar una habilidad, usar un arma o ejecutar un movimiento propio.
     * </p>
     */
    void realizarAccion();
}
