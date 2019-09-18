package ucionica;

public class Laptop {
	
	private Polaznik polaznik;
	private String marka;

public Laptop (String marka) {
	this.marka=marka;
	polaznik=null;
}
public String getMarka() {
	return marka;
}
public Polaznik getPolaznik() {
	return polaznik;
}
public void setPolaznik(Polaznik polaznik) {
	this.polaznik=polaznik;
}
public void reset(Polaznik polaznik) {
	polaznik=null;
}
public String ispisi() {
	String s;
	if(polaznik==null) {
		s="Nema korisnika";
	}
	else {
		s=polaznik.ispisi();
	}
	return marka +"{"+s+"}";
	}
	
}


