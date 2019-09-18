package DomaciKlasa;

public class Knjige {

private String naziv;
private String autor;
private String str;
private int godina;



public Knjige (String naziv, String autor, String str) {
	this.naziv=naziv;
	this.autor=autor;
	this.str=str;
}
public String getNaziv() {
	return naziv;
}
public String getAutor() {
	return autor;
}
public String getStr() {
	return str;
}
public int getGodina() {
	return godina;
}
public void setGodina(int godina) {
	this.godina=godina;
}

}
