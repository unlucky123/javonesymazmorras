package dragonesymazmorras;

public class Guerrero extends Personaje {
    private boolean protegiendo;  
    private Personaje compañeroProtegido;  

    // Constructor
    public Guerrero(String nombre, int nivel, int puntosVida, Inventario inventario) {
        super(nombre, nivel, puntosVida, inventario);  
        this.protegiendo = false;  
        this.compañeroProtegido = null;  
    }

    // metodo para proteger a otro personaje
    public void proteger(Personaje compañero) {
        if (this.protegiendo) {
            System.out.println(getNombre() + " ya está protegiendo a alguien.");
        } else {
            this.protegiendo = true;
            this.compañeroProtegido = compañero;
            System.out.println(getNombre() + " está protegiendo a " + compañero.getNombre());
        }
    }

    // metodo para dejar de proteger a un compa
    public void dejarDeProteger() {
        if (this.protegiendo) {
            System.out.println(getNombre() + " ha dejado de proteger a " + compañeroProtegido.getNombre());
            this.protegiendo = false;
            this.compañeroProtegido = null;
        } else {
            System.out.println(getNombre() + " no está protegiendo a nadie.");
        }
    }

    // metodo para reducir los puntos de vida
    @Override
    public void bajarVida(int vida) {
        if (this.protegiendo && compañeroProtegido != null) {
            System.out.println(getNombre() + " está protegiendo a " + compañeroProtegido.getNombre() + ", reduciendo el daño.");
            
            compañeroProtegido.bajarVida(vida / 2);
        } else {
            super.bajarVida(vida);
        }
    }

    public Personaje estaProtegiendo() {
        if (this.protegiendo) {
    return compañeroProtegido;
} else {
    return null;
}
    }
}
