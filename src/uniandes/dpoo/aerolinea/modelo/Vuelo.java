package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {
	private String fecha;
    private Ruta ruta;
    private Avion avion;
    private boolean realizado = false;

    public Vuelo(String fecha, Ruta ruta, Avion avion) {
        this.fecha = fecha;
        this.ruta = ruta;
        this.avion = avion;
    }

	public String getFecha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getRuta() {
		// TODO Auto-generated method stub
		return null;
	}
	private List<Tiquete> tiquetes = new ArrayList<>();

	public List<Tiquete> getTiquetes() {
		return this.tiquetes;
	}


	public void addTiquete(Tiquete tiquete) {
	    tiquetes.add(tiquete);
	}
	public void agregarTiquete(Tiquete tiquete) {
	    if (this.tiquetes == null) {
	        this.tiquetes = new ArrayList<>();
	    }
	    this.tiquetes.add(tiquete);
	}

	public void agregarTiquete(uniandes.dpoo.aerolinea.tiquetes.Tiquete tiquete) {
		
		
	}
	public void setRealizado(boolean realizado) {
	    this.realizado = realizado;
	}

}
