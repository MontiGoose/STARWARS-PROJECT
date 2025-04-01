package lucasfilms;

/**
 * Clase que representa a un Jedi dentro del universo de Lucasfilms.
 * <p>
 * Esta clase hereda de {@link Personaje} y define propiedades y comportamientos propios
 * de un Jedi.
 *
 * @author 
 * @version 1.0
 */
public class Jedi extends Personaje {

    /**
     * Color del sable láser que utiliza el Jedi..
     */
    private String colorSable;

    /**
     * Estilo de esgrima que domina el Jedi.
     */
    protected String estiloEsgrima;

    /**
     * Construye una nueva instancia de {@code Jedi} con los atributos especificados.
     * <p>
     * Inicializa el nombre y la especie a través de la superclase {@link Personaje} y define
     * el rol del personaje como "Jedi". Además, establece el color del sable láser y el estilo
     * de esgrima característico.
     * </p>
     *
     * @param nombre        El nombre del Jedi, heredado de la clase {@code Personaje}.
     * @param especie       La especie del Jedi, también heredada de la clase {@code Personaje}.
     * @param colorSable    El color del sable láser que utiliza el Jedi.
     * @param estiloEsgrima El estilo de esgrima que el Jedi domina.
     */
    public Jedi(String nombre, String especie, String colorSable, String estiloEsgrima) {
        super(nombre, especie, "Jedi");
        this.colorSable = colorSable;
        this.estiloEsgrima = estiloEsgrima;
    }

    /**
     * Habilita al Jedi a utilizar su habilidad especial.
     * <p>
     * Este método simula el uso de la Fuerza para mover objetos, representando
     * uno de los rasgos característicos de un Jedi.
     * </p>
     */
    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " usa la Fuerza para mover objetos.");
    }

    /**
     * Permite al Jedi meditar para fortalecer su conexión con la Fuerza.
     * <p>
     * La meditación es fundamental para que un Jedi mantenga y profundice su
     * vínculo con la Fuerza, mejorando sus habilidades.
     * </p>
     */
    public void meditar() {
        System.out.println(nombre + " está meditando para fortalecer su conexión con la Fuerza.");
    }

    /**
     * Hace que el Jedi pronuncie su frase icónica.
     * <p>
     * Al llamar a este método, se imprime en consola una frase característica que
     * representa la sabiduría y el legado de un Jedi.
     * </p>
     */
    @Override
    public void hablarFraseIconica() {
        System.out.println(nombre + ": \"Que la Fuerza te acompañe.\"");
    }

    /**
     * Realiza una acción específica de encendido del sable láser.
     * <p>
     * Este método imprime un mensaje que simula el encendido del sable láser del Jedi,
     * utilizando el color definido para este arma.
     * </p>
     */
    @Override
    public void realizarAccion() {
        System.out.println(nombre + " enciende su sable láser de color " + colorSable + ".");
    }

    /**
     * Elogia el dominio del estilo de esgrima del Jedi.
     * <p>
     * Este método resalta y reconoce la habilidad del Jedi en el combate, haciendo
     * alarde de su formación y destreza en el manejo del sable.
     * </p>
     */
    public void elogioEsgrima() {
        System.out.println("Le han entrenado bien, su dominio del " + estiloEsgrima + " es formidable.");
    }
}
