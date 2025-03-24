package dragonesymazmorras;

public class Ladron extends Personaje {
    private boolean invisible;  

    
    public Ladron(String nombre, int nivel, int puntosVida, Inventario inventario) {
        super(nombre, nivel, puntosVida, inventario);  
        this.invisible = false;  
    }

    // mtodo para robar
    public void robar() {
        if (invisible) {
            System.out.println(getNombre() + " roba sin ser detectado, es invisible");
        } else {
            System.out.println(getNombre() + " roba, pero puede ser detectado");
        }
    }

    // metodo para cambiar el estado de invisibilidad
    public void hacerseInvisible() {
        invisible = !invisible;  // cambia el estado de invisibilidad
        if (invisible) {
            System.out.println(getNombre() + " ahora es invisible");
        } else {
            System.out.println(getNombre() + " ya no es invisible");
        }
    }

    // metodo para verificar es invisible
    public boolean estaInvisible() {
        return invisible;
    }
}
