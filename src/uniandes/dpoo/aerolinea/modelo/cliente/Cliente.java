package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;


import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


public abstract class Cliente {
    private String identificador;
	
	private List<Tiquete> tiquetes = new ArrayList<>();

	

    public Cliente(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    // Asumiendo que existen las clases Tiquete y Vuelo
    public void agregarTiquete(Tiquete tiquete){
    	if (this.tiquetes == null) {
            this.tiquetes = new ArrayList<>();
        }
        this.tiquetes.add(tiquete);
    }
    
    public void calcularValorTotalTiquetes(){
        int total = 0;
        for (Tiquete tiquete : tiquetes) {
            total += tiquete.getTarifaInt();
        }
        // Store or return the total as needed
    }
    public void usarTiquetes(Vuelo vuelo){
        for (Tiquete tiquete : tiquetes) {
            if (tiquete.getVuelo().equals(vuelo)) {
                tiquete.marcarComoUsado();
            }
        }
    }

	public abstract String getTipoCliente();

	public void agregarTiquete(uniandes.dpoo.aerolinea.modelo.Tiquete tiquete) {
		
		
	}
	
	
}
