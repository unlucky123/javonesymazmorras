package dragonesymazmorras;

public class Personaje {

	private String nombre;
	private int nivel;
	private Inventario inventario;
	private int puntosVida;
	
	

	public Personaje(String nombre, int nivel, int puntosVida, Inventario inventario) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
		this.inventario = new Inventario();
	}
}
