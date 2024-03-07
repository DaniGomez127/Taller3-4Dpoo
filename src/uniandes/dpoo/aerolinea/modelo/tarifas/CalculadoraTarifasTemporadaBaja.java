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
    	int costoBase = 0;
        if (cliente.getTipoCliente().equals("Natural")) {
            costoBase = COSTO_POR_KM_NATURAL * calcularDistanciaVuelo(vuelo.getRuta());
        } else if (cliente.getTipoCliente().equals("Corporativo")) {
            costoBase = COSTO_POR_KM_CORPORATIVO * calcularDistanciaVuelo(vuelo.getRuta());
        }
        return costoBase;
       
    }

    @Override
    protected double calcularPorcentajeDescuento(Cliente cliente) {
    	double porcentajeDescuento = 0;
    	if (cliente.getTipoCliente().equals("Pequeña")) {
            porcentajeDescuento = DESCUENTO_PEQ;
        } else if (cliente.getTipoCliente().equals("Mediana")) {
            porcentajeDescuento = DESCUENTO_MEDIANAS;
        } else if (cliente.getTipoCliente().equals("Grande")) {
            porcentajeDescuento = DESCUENTO_GRANDES;
        }
        return porcentajeDescuento;
    }

    @Override
    protected int calcularDistanciaVuelo(Object object) {
		return 0;
        
    }

    @Override
    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
    	int costoBase = calcularCostoBase(vuelo, cliente);
        double porcentajeDescuento = calcularPorcentajeDescuento(cliente);
        int distanciaVuelo = calcularDistanciaVuelo(vuelo.getRuta());
        
       
        double costoConDescuento = costoBase * (1 - porcentajeDescuento / 100);
        
      
        int costoTotal = (int) (distanciaVuelo * COSTO_POR_KM_NATURAL + costoConDescuento);
        
        return costoTotal;
        
    }

	@Override
	protected int calcularDistanciaVuelo(Ruta ruta) {
	
		return 0;
	}
}
