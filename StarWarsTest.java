package lucasfilms;

//Clase principal para ejecutar el programa
//------------------------------------------


public class StarWarsTest {
 public static void main(String[] args) {
     Jedi luke = new Jedi("Luke Skywalker", "Humano", "Verde");
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
