package ufc;

public class ufcMain {

	public static void main(String[] args) {
		lutador l[] = new lutador[6];
		
		l[0] = new lutador("Pretty boy", "franca",31, 11, 2, 5, 1.76, 98.9);
		l[1] = new lutador("Pssssss", "aaaa",131, 11, 123, 42, 1.76, 98.9);
		l[2] = new lutador("Big Smoke", "Estados Unidos", 35, 20, 3, 7, 1.90, 120.5);
		l[3] = new lutador("Speedy Gonzales", "México", 28, 15, 4, 2, 1.70, 60.2);
		l[4] = new lutador("The Rock", "Estados Unidos", 48, 30, 2, 10, 1.96, 115.0);
		l[5] = new lutador("Ninja", "Japão", 29, 18, 6, 1, 1.78, 70.0);
		
		System.out.println("ante da luta\n");
		l[0].apresentar();
		l[0].status();
		
		luta ring1 = new luta();
		ring1.marcarLuta(l[0], l[1]);
		ring1.lutar();
		
		System.out.println("DEPOIS da luta");
		l[0].status();
		l[1].status();
		
		
	}

}
