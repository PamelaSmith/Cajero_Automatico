import java.util.HashMap;
import java.util.Map;
// Esta clase contiene operaciones de TarjCredito

public class Mapa
{
	//creando map para poder usar los tipos de tarjetas, sus claves y demas.
	public static Map<String, TarjCredito> TodasTarjetas = new HashMap<String, TarjCredito>();

	public static void CMapa() 
	{

		TodasTarjetas.put("789456-123", new TarjCredito("9999", "Maestro"));
		TodasTarjetas.put("587895-456", new TarjCredito("5555", "MasterCard"));
		TodasTarjetas.put("987452-789", new TarjCredito("4444", "American Express"));
		TodasTarjetas.put("689547-201", new TarjCredito("2222", "Visa"));
		//Aqui interte los datos, el .put es para añadir
	}

}
