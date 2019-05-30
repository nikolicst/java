
public class Student {
		
	private String brojIndeksa;
	private int godinaUpisa;
	private String ime;
	private String prezime;
	private Datum datumRodjenja;
	
		
//	Student st1;
//	Student st2;
//	Student st3;
//	Student st4;
//	Student st5;
//	Student studenti[];
	
//	Student [] studenti = {st1, st2, st3};
	
	public Student(String brojIndeksa, int godinaUpisa, String ime, String prezime, Datum datumRodjenja) {
		this.brojIndeksa = brojIndeksa;
		this.godinaUpisa = godinaUpisa;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;

	}
	
	public Student(Student s) {
		this(s.brojIndeksa, s.godinaUpisa, s.ime, s.prezime, s.datumRodjenja);
	}


	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public Datum getDatumRodjenja() {
		return datumRodjenja;
	}
	
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void setDatumRodjenja(Datum datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	
	public String toString() {
		return "Broj indeksa: " + brojIndeksa + ", godina upisa: " + godinaUpisa + ", ime: " + ime + ", prezime: " + prezime + ", datum rodjenja: " + datumRodjenja;
	}
	
	public boolean jednako(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			
			return this.brojIndeksa.equals(student.brojIndeksa);
		}
		else return false;
	}
	
	
	}


