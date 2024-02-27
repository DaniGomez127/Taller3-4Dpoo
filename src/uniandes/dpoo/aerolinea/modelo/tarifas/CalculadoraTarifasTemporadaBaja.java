package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
    private static final int COSTO_POR_KM_NATURAL = 600;
    private static final int COSTO_POR_KM_CORPORATIVO = 900;
    private static final double DESCUENTO_MEDIANAS = 0.1;
    private static final double DESCUENTO_PEQ = 0.02;
    private static final double DESCUENTO_GRANDES = 0.2;

    @Override
    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
       
    }

    @Override
    protected double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
        
    }

    @Override
    protected int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
        
    }

    @Override
    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 0;
        
    }
}
