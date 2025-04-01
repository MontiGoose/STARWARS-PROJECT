package lucasfilms;

/**
 * Clase que representa a un cazarrecompensas en el universo de Lucasfilms.
 * <p>
 * Esta clase extiende de {@link Personaje} y añade atributos y funcionalidades
 * específicas para los cazadores de recompensas.
 * </p>
 *
 * @author 
 * @version 1.0
 */
public class Cazarrecompensas extends Personaje {

    /**
     * Arma favorita utilizada por este cazarrecompensas.
     */
    private String armaFavorita;
    
    /**
     * Estilo de esgrima que domina el cazarrecompensas..
     */
    protected String estiloEsgrima;
    
    /**
     * Crea una nueva instancia de {@code Cazarrecompensas} con los detalles especificados.
     * <p>
     * Inicializa el nombre y la especie heredados de {@link Personaje} y establece su rol
     * como "Cazarrecompensas". También asigna la arma favorita que más utiliza en combate.
     * </p>
     *
     * @param nombre       El nombre del personaje, heredado de la clase {@code Personaje}.
     * @param especie      La especie del personaje, también heredado de la clase {@code Personaje}.
     * @param armaFavorita El arma más utilizada por el cazarrecompensas.
     */
    public Cazarrecompensas(String nombre, String especie, String armaFavorita) {
        super(nombre, especie, "Cazarrecompensas");
        this.armaFavorita = armaFavorita;
    }
    
    /**
     * Permite al cazarrecompensas usar su habilidad especial..
     * <p>
     * Al invocar este método se imprime en consola un mensaje que indica que el 
     * cazarrecompensas rastrea a su objetivo con una precisión única.
     * </p>
     */
    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " rastrea a su objetivo con precisión.");
    }
    
    /**
     * Captura a un objetivo.
     * <p>
     * Este método simula la acción de la captura del objetivo e imprime un mensaje indicando 
     * que el cazarrecompensas ha logrado inmovilizar a su presa, congelándola en carbonita.
     * </p>
     */
    public void capturarObjetivo() {
        System.out.println(nombre + " captura a su objetivo y lo congela en carbonita.");
    }
    
    /**
     * Hace que el cazarrecompensas pronuncie su frase icónica.
     * <p>
     * Al llamar a este método, se imprime en consola una frase característica que define la 
     * identidad y el carácter del cazarrecompensas.
     * </p>
     */
    @Override
    public void hablarFraseIconica() {
        System.out.println(nombre + ": \"Soy solo un hombre haciendo su trabajo.\"");
    }
    
    /**
     * Realiza la acción de disparar.
     * <p>
     * Este método imprime un mensaje en consola en el que se comunica que el personaje
     * dispara utilizando su arma favorita.
     * </p>
     */
    @Override
    public void realizarAccion() {
        System.out.println(nombre + " dispara con su " + armaFavorita + ".");
    }

}
