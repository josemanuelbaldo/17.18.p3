class Punto{
	int x, y;
}
// En un fichero puedo tener varias clase pero solo una publica, cuyo nombre debe
// coincidir con el nombre del fichero. El resto son de ambito de paquete.
public class principal2 {
	public static void main(String [] args){
		Punto p1, p2;
		p1 = new Punto();
		p2 = new Punto();
		
		p1.x = 3;
		p2.x = 5;
		
		Punto p3 = p1;
		
		p3.y = 5;
		
		p3 = p2;
		p3.y = 10;
		
		System.out.println(p1.x + ", " + p1.y + ", " + p2.x + ", " + p2.y);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		int x, y;
		x = 3;
		y = x;
		y = 9;
		System.out.println(x + ", " + y);// 3 9
	}
}
