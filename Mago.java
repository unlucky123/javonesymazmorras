package dragonesymazmorras;

public class Mago extends Personaje {
	private int mana;
	public Mago(String nombre, int nivel, int puntosVida, Inventario inventario) {
		super(nombre, nivel, puntosVida, inventario);
		this.mana = mana;
	}
	//metodo par alanzar un hechizo
	public void lanzarHechizo(int cosotoMana) {

	}
	//metodo para recargar el mana
	public void recargarMana(int cantidad) {
		
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
