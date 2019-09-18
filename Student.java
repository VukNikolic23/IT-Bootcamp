package fakultet;

public class Student extends Covek {
public static int index;
	
	private int brInd;
	private int godStudija;
	private double prosek;
	
	public Student(String ime, String prezime,int godRodjenja,int godStudija, double prosek ) {
		super(ime, prezime,godRodjenja);
		this.godStudija=godStudija;
		this.prosek=prosek;
		brInd=++index;
	}
	public int getGodStudija() {
		return godStudija;
	}
	public double getProsek() {
		return prosek;
	}
	public int getBrInd() {
		return brInd;
	}
	public static int getIndex() {
		return index;
	}
	public String ispisi() {
		return " je student "+godStudija+"godine studija sa prosekom "+prosek;
	}
}
