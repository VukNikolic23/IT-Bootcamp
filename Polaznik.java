package ucionica;

public class Polaznik {

	public static int UID=0;
	
	public String ime;
	public String prezime;
	public int id;
	
	public Polaznik (String ime, String prezime) {
		this.ime=ime;
		this.prezime=prezime;
		this.id=++UID;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getId () {
		return id;
	}
	public static int getUID(){
		return UID;
	}
	public String ispisi() {
		return ime+" "+prezime+"{"+id+"}";
	}
}
