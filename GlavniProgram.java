package fakultet;

public class GlavniProgram {

	public static void main(String[] args) {
		Student s= new Student("Vuk","Nikolic",1996,4,8.5);
		Student s1= new Student("Marko","Markovic",1998,2,7.5);
		Student s2= new Student("Petar","Nikolic",1999,1,9.5);
		Profesor p= new Profesor("Petar","Matic",1965,"profesor");
		Profesor p1= new Profesor("Nenad", "Matic", 1965,"profesor");
		p1.setIme("Nenad");
		p1.setPrezime("Matic");
		p.addPredmet("Mata");
		p.addPredmet("Fizika");
		p1.addPredmet("Likovno");
		p1.addPredmet("Fizicko");
		System.out.println(p1.isp());
		
		
		
	}

}
