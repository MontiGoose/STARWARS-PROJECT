package lucasfilms;

/**
 * Clase que representa a un Sith en el universo de Star Wars.
 * <p>
 * Esta clase extiende de {@link Personaje} y define atributos y comportamientos
 * propios de un Sith.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Sith extends Personaje {

    /**
     * Poder oscuro que utiliza el Sith para atacar.
     */
    private String poderOscuro;

    /**
     * Construye una nueva instancia de {@code Sith} con los atributos especificados.
     * <p>
     * Inicializa el nombre y la especie mediante el constructor de la superclase {@link Personaje},
     * estableciendo además la afiliación como "Sith" y definiendo el poder oscuro característico
     * del personaje.
     * </p>
     *
     * @param nombre      El nombre del Sith.
     * @param especie     La especie del Sith.
     * @param poderOscuro El poder oscuro utilizado para atacar.
     */
    public Sith(String nombre, String especie, String poderOscuro) {
        super(nombre, especie, "Sith");
        this.poderOscuro = poderOscuro;
    }

    /**
     * Permite al Sith usar su habilidad especial.
     * <p>
     * Este método simula el uso del poder oscuro para atacar, imprimiendo un mensaje en consola
     * que describe la acción.
     * </p>
     */
    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " usa " + poderOscuro + " para atacar.");
    }

    /**
     * Simula la acción de corromper a un personaje.
     * <p>
     * Este método imprime un mensaje en consola indicando que el Sith intenta atraer a alguien hacia el Lado Oscuro.
     * </p>
     */
    public void corromper() {
        System.out.println(nombre + " intenta atraer a alguien al Lado Oscuro.");
    }

    /**
     * Hace que el Sith pronuncie su frase icónica.
     * <p>
     * Al invocar este método, se imprime en consola una frase característica que refleja el misterio y el poder
     * del Lado Oscuro.
     * </p>
     */
    @Override
    public void hablarFraseIconica() {
        System.out.println(nombre + ": \"Si conocieras el poder del Lado Oscuro...\"");
    }

    /**
     * Realiza una acción característica del Sith.
     * <p>
     * Este método simula el lanzamiento de un rayo Sith, imprimiendo un mensaje en consola que describe la acción.
     * </p>
     */
    @Override
    public void realizarAccion() {
        System.out.println(nombre + " lanza un rayo Sith.");
    }
}
