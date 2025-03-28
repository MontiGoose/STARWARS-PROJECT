package lucasfilms;

//Clase que representa a un Sith
//-------------------------------


class Sith extends Personaje {
 private String poderOscuro;

 public Sith(String nombre, String especie, String poderOscuro) {
     super(nombre, especie, "Sith");
     this.poderOscuro = poderOscuro;
 }

 @Override
 public void usarHabilidadEspecial() {
     System.out.println(nombre + " usa " + poderOscuro + " para atacar.");
 }

 public void corromper() {
     System.out.println(nombre + " intenta atraer a alguien al Lado Oscuro.");
 }

 @Override
 public void hablarFraseIconica() {
     System.out.println(nombre + ": \"Si conocieras el poder del Lado Oscuro...\"");
 }

 @Override
 public void realizarAccion() {
     System.out.println(nombre + " lanza un rayo Sith.");
 }
}
