import java.util.ArrayList;

public class ListaPrijava {
	private ArrayList<Prijava> prijavljivanje;

	public ArrayList<Prijava> getPrijavljivanje() {
		return prijavljivanje;
	}

	public void setPrijavljivanje(ArrayList<Prijava> prijavljivanje) {
		this.prijavljivanje = prijavljivanje;
	}
	

	public ListaPrijava() {
		prijavljivanje = new ArrayList<>();
	}
	
	public ListaPrijava(Prijava prijava) {
		prijavljivanje = new ArrayList<>();
	}

	public void dodajPrijavu(Prijava p) {
		prijavljivanje.add(p);
	}

	public void stampajPrijave() {
		System.out.print(prijavljivanje);
	}
	
	public void stampajPrijave(Prijava p) {
		System.out.print(p);
	}

//	public boolean contains(String string) {
//		return false;
//	}
	
//	public String izvuciBrojIndeksa(Prijava prijava) {
//		String bi = prijava.getBrojIndeksa();
//		return bi;
//	}
}
