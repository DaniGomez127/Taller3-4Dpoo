package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Tiquete;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public abstract class Cliente {
    private String identificador;

    public Cliente(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    // Asumiendo que existen las clases Tiquete y Vuelo
    public abstract void agregarTiquete(Tiquete tiquete);
    public abstract void calcularValorTotalTiquetes();
    public abstract void usarTiquetes(Vuelo vuelo);

	public abstract String getTipoCliente();
	
	
}
