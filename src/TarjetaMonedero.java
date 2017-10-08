public class TarjetaMonedero {
	private int saldo;
	// constructor por defecto (sin parametros)
	// que inicializa el saldo a 0.
	public TarjetaMonedero(){
		saldo = 0;
	}
	
	// constructor a partir de un saldo inicial
	// de forma que si el saldo no es mayor que 10 se inicializara
	// a 10
	public TarjetaMonedero(int s){
		if(s > 10){
			saldo = s;
		}
		else{
			saldo = 10;
		}
	}
	// metodo getSaldo que devuelve el saldo
	public int getSaldo(){
		return saldo;
	}
	// metodo addSaldo que recibe un saldo y lo añade al saldo actual
	// solo si ese saldo es mayor que 0.
	public void addSaldo(int s){
		if(s > 0){
			saldo = saldo + s;
		}
	}
	// metodo subSaldo que recibe un saldo y lo quita del saldo actual
	// devuelve la cantidad quitada, si la cantidad a quitar es mayor
	// que el saldo actual, el saldo quedara a 0.
	public int subSaldo(int s){
		int sacada;
		if(s >= saldo){
			sacada = saldo;
			saldo = 0;
		}
		else{
			saldo = saldo - s;
			sacada = s;
		}
		return sacada;
	}
}

// davidrodriguezf98@gmail.com

