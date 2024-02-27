package uniandes.dpoo.aerolinea.exceptions;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.Ruta;
/**
 * Esta clase se usa para anunciar que se intentó vender un tiquete para un vuelo que ya está lleno
 */
@SuppressWarnings("serial")
public class VueloSobrevendidoException extends Exception
{

	private Vuelo vuelo;

	public VueloSobrevendidoException(Vuelo vuelo) {
        super("El vuelo " + vuelo.toString() + " está sobrevendido.");
        this.vuelo = vuelo;
    }

    @Override
    public String getMessage() {
        return "Vuelo sobrevendido: " + vuelo.toString();
    }
}
