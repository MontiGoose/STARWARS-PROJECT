package lucasfilms;

//Clase base que representa un personaje en Star Wars
//----------------------------------------------------

abstract class Personaje implements SerGalactico {
 protected String nombre;
 protected String especie;
 protected String afiliacion; // Jedi, Sith, Cazarrecompensas, etc.

 public Personaje(String nombre, String especie, String afiliacion) {
     this.nombre = nombre;
     this.especie = especie;
     this.afiliacion = afiliacion;
 }

 public abstract void usarHabilidadEspecial(); // Método abstracto

 @Override
 public void mostrarInfo() {
     System.out.println("Nombre: " + nombre);
     System.out.println("Especie: " + especie);
     System.out.println("Afiliación: " + afiliacion);
 }
}

