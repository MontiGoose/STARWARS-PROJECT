package lucasfilms;

/**
 * @author George Lucas
 * @version 1.0
 */
public class StarWarsTest {

    /**
     * Método principal que inicia la ejecución del programa.
     * <p>
     * Se crean instancias de diferentes personajes (Jedi, Sith y Cazarrecompensas) y se invocan
     * sus respectivos métodos para mostrar información, utilizar habilidades especiales y realizar acciones
     * características de cada uno.
     * </p>
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Jedi luke = new Jedi("Luke Skywalker", "Humano", "Verde", "Iai");
        Sith vader = new Sith("Darth Vader", "Humano", "Estrujar con la Fuerza");
        Cazarrecompensas boba = new Cazarrecompensas("Boba Fett", "Mandaloriano", "Bláster EE-3");

        System.out.println("Información de los personajes:\n");

        luke.mostrarInfo();
        luke.usarHabilidadEspecial();
        luke.meditar();
        luke.hablarFraseIconica();
        luke.realizarAccion();

        System.out.println("\n");

        vader.mostrarInfo();
        vader.usarHabilidadEspecial();
        vader.corromper();
        vader.hablarFraseIconica();
        vader.realizarAccion();

        System.out.println("\n");

        boba.mostrarInfo();
        boba.usarHabilidadEspecial();
        boba.capturarObjetivo();
        boba.hablarFraseIconica();
        boba.realizarAccion();
    }
}

