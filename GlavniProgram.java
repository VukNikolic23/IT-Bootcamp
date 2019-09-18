package DomaciKlasa;

public class GlavniProgram {

	public static void main(String[] args) {
		Knjige k=new Knjige("Labud","Petar Petrovic","100str");
		Knjige k1=new Knjige("Koza","Nemanja Nesic","150str");
		Knjige k2=new Knjige ("Coban","Ivan Lazarevic","170str");
		k.setGodina(1950);
		k1.setGodina(1960);
		k2.setGodina(1985);
		System.out.println(k.getNaziv()+" "+k.getAutor()+" "+k.getStr()+" "+k.getGodina());
		System.out.println(k1.getNaziv()+" "+k1.getAutor()+" "+k1.getStr()+" "+k1.getGodina());
		System.out.println(k2.getNaziv()+" "+k2.getAutor()+" "+k2.getStr()+" "+k2.getGodina());

	
	}

}
