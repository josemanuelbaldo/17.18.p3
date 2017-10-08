class Monedero {
	private int saldo; // positivo siempre
	public Monedero(int s){
		if(s >= 0){
			saldo = s;
		}
		else{
			saldo = 0;
		}
	}
	public Monedero(Monedero m){
		saldo = m.saldo;
	}
	public int getSaldo(){
		return saldo;
	}
	public void setSaldo(int s){
		if(s >= 0){
			saldo = s;
		}
	}
}
public class Principal4{
	public static void main(String [] args){
		// Monedero m = new Monedero(); El constructor que JAVA proporciona por defecto
		// desaparece en cuanto definamos un constructor.
		
		Monedero m = new Monedero(10); // m.saldo = 10
		
		// no podemos acceder a los miembros privados desde fuera de la clase
		// m.saldo = -12; // uso incorrecto de la clase.
		Monedero m2 = new Monedero(-12); // m2.saldo = 0
		// System.out.println(m.saldo);
		// m.saldo = 10;
		System.out.println(m.getSaldo());
		m.setSaldo(34);
		System.out.println(m.getSaldo());
		Monedero m3 = new Monedero(m);
		System.out.println(m3.getSaldo()); // 34
	}
}


