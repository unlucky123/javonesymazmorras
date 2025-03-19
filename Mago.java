package dragonesymazmorras;

public class Mago extends Personaje {
	private int mana;
	private int costoMana;
	public Mago(String nombre, int nivel, int puntosVida, Inventario inventario, int mana, int costoMana) {
		super(nombre, nivel, puntosVida, inventario);
		this.mana = mana;
		this.costoMana = costoMana;
	}
	//metodo para lanzar un hechizo
	public void lanzarHechizo(int cosotoMana) {
		if (mana >=costoMana){
			mana-=costoMana;
			System.out.println(nombre + "ha usado un hechizo")
		}
		else{
			System.out.println("Te falta Mana!!!!")
		}
	}
	//metodo para recargar el mana
	public void recargarMana(int cantidad) {
		if (cantidad > 0) {
            mana += cantidad;
            System.out.println(nombre + " recarga " + cantidad + " puntos de mana.");
        } else {
            System.out.println("La cantidad de recarga debe ser positiva.");
        }
	}
	//metodo para que el mana no pueda estar en numeros negativos
	public void setMana(int mana){
		if(mana >=0){
			this.mana = mana;
		}
		else{
			system.out.println("El mana no puede estar en numeros negativos")
		}
	}
	//metodo para ver el mana que tiene
	public int getMana() {
		return mana;
	}


	



}
