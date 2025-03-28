package lucasfilms;

//Clase que representa a un Jedi
//-------------------------------

class Jedi extends Personaje {
 private String colorSable;

 public Jedi(String nombre, String especie, String colorSable) {
     super(nombre, especie, "Jedi");
     this.colorSable = colorSable;
 }

 @Override
 public void usarHabilidadEspecial() {
     System.out.println(nombre + " usa la Fuerza para mover objetos.");
 }

 public void meditar() {
     System.out.println(nombre + " está meditando para fortalecer su conexión con la Fuerza.");
 }

 @Override
 public void hablarFraseIconica() {
     System.out.println(nombre + ": \"Que la Fuerza te acompañe.\"");
 }

 @Override
 public void realizarAccion() {
     System.out.println(nombre + " enciende su sable láser de color " + colorSable + ".");
 }
}