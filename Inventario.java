package dragonesymazmorras;

import java.util.ArrayList;

public class Inventario {
	 
	    private ArrayList<Equipamiento> equipamiento;

	    public Inventario() {
	        this.equipamiento = new ArrayList<>();
	    }

	    public void agregarEquipamiento(Equipamiento equipamiento) {
	        this.equipamiento.add(equipamiento);
	    }

	    public void mostrarInventario() {
	        System.out.println("Inventario:");
	        for (Equipamiento e : equipamiento) {
	            System.out.println(e.getNombre() + " - " + e.getTipo());
	        }
	}

}
