package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
	
	private String titula;
	private List <String> predmeti;
	public Profesor(String ime, String prezime,int godRodjenja, String titula) {
		super(ime, prezime, godRodjenja);
		predmeti = new ArrayList <>();
		this.titula=titula;	
	}
	
	public String getTitula() {
		return titula;
	}
	public List<String> getPredmeti() {
		return predmeti;
	}
	
	public void addPredmet(String predmet) {
		predmeti.add(predmet);
	}

	public boolean removePredmet(String predmet) {
		return predmeti.remove(predmet);
	}
	public String isp() {
		return ime+" "+prezime+" "+godRodjenja+" "+" je "+titula+" koji drzi predmete"+predmeti;
	}
}
