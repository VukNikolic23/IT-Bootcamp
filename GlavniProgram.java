package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		Polaznik p1= new Polaznik ("Vuk", "Nikolic");
		Laptop l1= new Laptop("Acer");
		l1.setPolaznik(p1);
		System.out.println(p1.ispisi());
		Polaznik pom=l1.getPolaznik();
		System.out.println(l1.getMarka()+" "+pom.ispisi());
		l1.reset(p1);
		Polaznik p2= new Polaznik ("Marko", "Markovic");
		l1.setPolaznik(p2);
		System.out.println(l1.ispisi());
		
	}

}
