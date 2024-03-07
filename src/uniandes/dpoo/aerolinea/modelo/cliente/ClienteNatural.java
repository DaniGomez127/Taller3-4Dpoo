package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Tiquete;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class ClienteNatural extends Cliente {
    public static final String NATURAL = "Natural";

    private String nombre;

    public ClienteNatural(String identificador, String nombre) {
        super(identificador);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void agregarTiquete(Tiquete tiquete) {
        // Lógica para agregar un tiquete
    	
    }

    @Override
    public void calcularValorTotalTiquetes() {
        // Lógica para calcular el valor total de los tiquetes
    }

    @Override
    public void usarTiquetes(Vuelo vuelo) {
        // Lógica para usar tiquetes
    }

	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return "Natural";
	}
}


