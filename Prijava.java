
public class Prijava {

	private int sifraIspita;
	private String brojIndeksa;
	private String datumPolaganja;
	private int ocena;
	
	public Prijava (int sifraIspita, String brojIndeksa, String datumPolaganja, int ocena) {
		this.sifraIspita = sifraIspita;
		this.brojIndeksa = brojIndeksa;
		this.datumPolaganja = datumPolaganja;
		this.ocena = ocena;
	}
	
	public Prijava(Prijava p) {
		this(p.sifraIspita, p.brojIndeksa, p.datumPolaganja, p.ocena);
	}
	
	public int getSifraIspita() {
		return sifraIspita;
	}

	public void setSifraIspita(int sifraIspita) {
		this.sifraIspita = sifraIspita;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getDatumPolaganja() {
		return datumPolaganja;
	}

	public void setDatumPolaganja(String datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}
	
	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String toString() {
		return "Prijava ispita za predmet sa sifrom: " + sifraIspita + "\t" + "Broj indeksa studenta: " + brojIndeksa + "\t" + "Datum polaganja ispita: " + datumPolaganja + "\t" + "Ocena na ispitu: " + ocena + "\n";
	}
}
