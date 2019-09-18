package fakultet;

public class Covek {

	public String ime;
	public String prezime;
	public int godRodjenja;
	
	public Covek(String ime, String prezime,int godRodjenja) {
		this.godRodjenja=godRodjenja;
	}
	public Covek(String ime2, String prezime2) {
		// TODO Auto-generated constructor stub
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime=ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime=prezime;
	}
	public String ispis() {
		return ime+" "+prezime+" ["+godRodjenja+"]";
	}
	
}
