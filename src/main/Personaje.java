package lucasfilms;

/**
 * Clase base abstracta que representa a un personaje en el universo de Star Wars.
 * <p>
 * Esta clase implementa la interfaz {@link SerGalactico} y establece la estructura
 * esencial para todos los personajes en la saga..
 * </p>
 *
 * @author 
 * @version 1.0
 */
public abstract class Personaje implements SerGalactico {
    
    /**
     * Nombre del personaje.
     */
    protected String nombre;
    
    /**
     * Especie del personaje.
     */
    protected String especie;
    
    /**
     * Afiliación a la que pertenece el personaje (por ejemplo, Jedi, Sith, Cazarrecompensas, etc.).
     */
    protected String afiliacion;

    /**
     * Construye una nueva instancia de {@code Personaje} con los atributos especificados.
     * <p>
     * Este constructor inicializa los atributos básicos del personaje: nombre, especie
     * y afiliación.
     * </p>
     *
     * @param nombre      El nombre del personaje.
     * @param especie     La especie del personaje.
     * @param afiliacion  La afiliación del personaje, que puede ser "Jedi", "Sith",
     *                    "Cazarrecompensas", etc.
     */
    public Personaje(String nombre, String especie, String afiliacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.afiliacion = afiliacion;
    }

    /**
     * Define la habilidad especial que cada subclase de Personaje debe implementar.
     * <p>
     * Este método es abstracto y obliga a las clases derivadas a proporcionar una
     * implementación concreta que simule el uso de su habilidad especial.
     * </p>
     */
    public abstract void usarHabilidadEspecial();

    /**
     * Muestra la información básica del personaje en la consola.
     * <p>
     * Este método imprime en consola el nombre, la especie y la afiliación del personaje,
     * ofreciendo una visión general de su identidad en el universo.
     * </p>
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Afiliación: " + afiliacion);
    }
}
