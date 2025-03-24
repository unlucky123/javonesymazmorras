package dragonesymazmorras;

public class javonesymazmorras {
    public static void main(String[] args) {
        // crear inventarios
        Inventario inventarioGuerrero = new Inventario();
        Inventario inventarioMago = new Inventario();
        Inventario inventarioLadron = new Inventario();

        // crear personajes
        Guerrero guerrero = new Guerrero("Conan", 10, 150, inventarioGuerrero);
        Mago mago = new Mago("Merlin", 8, 100, inventarioMago, 50, 10);
        Ladron ladron = new Ladron("Rico", 5, 80, inventarioLadron);

        // crear objetos de equipamiento
        Equipamiento espada = new Equipamiento("Espada", "arma");
        Equipamiento escudo = new Equipamiento("Escudo", "armadura");
        
        // agregar equipamiento al inventario
        inventarioGuerrero.agregarEquipamiento(espada);
        inventarioGuerrero.agregarEquipamiento(escudo);
        
        // mostrar inventario
        System.out.println("inventario del guerrero:");
        inventarioGuerrero.mostrarInventario();

        // mostrar el estado inicial de los personajes
        System.out.println(guerrero.getNombre() + " tiene " + guerrero.getPuntosVida() + " puntos de vida.");
        System.out.println(mago.getNombre() + " tiene " + mago.getMana() + " de mana.");
        System.out.println(ladron.getNombre() + " tiene " + ladron.getPuntosVida() + " puntos de vida.");
        
        // el Guerrero protege al Mago
        guerrero.proteger(mago);
        if (guerrero.estaProtegiendo() != null) {
    		System.out.println(guerrero.getNombre() + " esta protegiendo a " + guerrero.estaProtegiendo().getNombre());
	} else {
    		System.out.println("nadie esta siendo protegido.");
	}

        // el guerrero recibe daño mientras protege al mago
        guerrero.bajarVida(40);

        // el mago lanza un hechizo
        mago.lanzarHechizo(10);

        // el mago recarga mana
        mago.recargarMana(20);

        // el ladron roba
        ladron.robar();

        // el ladron se hace invisible
        ladron.hacerseInvisible();
        ladron.robar();

        // el Guerrero deja de proteger al Mago
        guerrero.dejarDeProteger();
    }
}
