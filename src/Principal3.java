class Punto2{
	int x;
	int y;
	// constructores
	// NOMBRE_CLASE(PARAMETROS)
	Punto2(int vx, int vy){
		this.x = vx;	// x e y son del objeto implicito
		this.y = vy;
		// patata = 3;
	}
	Punto2(){
		this.x = 10;
		this.y = 10;
	} 
}


public class Principal3 {
	public static void main(String [] args){
		Punto2 p1, p2;
		
		p1 = new Punto2(3, 4);
		p2 = new Punto2();
		
		System.out.println(p1.x + ", " + p1.y);
		System.out.println(p2.x + ", " + p2.y);
		
		
	}
}
