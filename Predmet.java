public class Predmet {

	private int sifraIspita;
	private String ispit;

	public Predmet(int sifraIspita, String ispit) {
		this.sifraIspita = sifraIspita;
		this.ispit = ispit;
	}

	public Predmet(Predmet i) {
		this(i.sifraIspita, i.ispit);
	}

	public String getIspit() {
		return ispit;
	}

	public int getSifraIspita() {
		return sifraIspita;
	}

	public String toString() {
		return "Sifra ispita: " + sifraIspita + ", naziv ispita: " + ispit;
	}
}
