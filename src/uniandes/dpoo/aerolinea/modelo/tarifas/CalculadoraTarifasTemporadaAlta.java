package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {
    private static final int COSTO_POR_KM = 1000;

    @Override
    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
        // Implementación específica de la temporada alta
    }

    @Override
    protected double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
        // Implementación específica de la temporada alta
    }

    @Override
    protected int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
        // Implementación específica de la temporada alta
    }

    @Override
    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 0;
        // Implementación específica de la temporada alta
    }
}
