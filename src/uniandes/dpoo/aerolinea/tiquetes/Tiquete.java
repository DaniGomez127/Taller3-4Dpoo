package uniandes.dpoo.aerolinea.tiquetes;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
    private boolean tarifa;
    private Vuelo vuelo;
    private Cliente clienteComprador;
    private int tarifaInt;
    public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifaInt) {
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.clienteComprador = clienteComprador;
        this.tarifaInt = tarifaInt;
        this.tarifa = tarifaInt > 0;
	
	}

	public String getCodigo() {
        return codigo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Cliente getCliente() {
        return clienteComprador;
    }

    public int getTarifaInt() {
        return tarifaInt;
    }

    public void marcarComoUsado() {
        this.tarifa = false;
    }

    public boolean esUsado() {
        return !tarifa;
    }

}
