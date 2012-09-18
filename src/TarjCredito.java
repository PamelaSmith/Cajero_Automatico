//Creando la clase que va a contener la clave, el balance y tipo de tarjeta (TarjetaT)
public class TarjCredito {
	String Clave;
	float Balance;
	String TarjetaT;

	public TarjCredito (String Clave, String TarjetaT){
		this.Clave = Clave;
		this.Balance = 25000.00f;
		this.TarjetaT = TarjetaT;

	}
	//Hice otro constructor por si m epiden 3 parametros
	public TarjCredito (String Clave, float BalanceD, String TarjetaT){
		this.Clave = Clave;
		this.Balance = BalanceD;
		this.TarjetaT = TarjetaT;

	}
}
