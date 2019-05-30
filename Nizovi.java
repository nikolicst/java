

public class Nizovi {

	
	Student st1 = new Student("100", 2018, "Petar", "Petrovic", Datum.primiDatum("01.01.2001."));
	Student st2 = new Student("101", 2019, "Marija", "Maric", Datum.primiDatum("03.05.2000."));
	Student st3 = new Student("102", 2018, "Lazar", "Lazic", Datum.primiDatum("13.05.2001."));
	Student st4 = new Student("103", 2018, "Jelena", "Jelic", Datum.primiDatum("27.08.2000."));
	Student st5 = new Student("104", 2019, "Petar", "Lazic", Datum.primiDatum("22.07.2001."));
	
	
	Predmet is1 = new Predmet(10, "Matematika 1");
	Predmet is2 = new Predmet(20, "Matematika 2");
	Predmet is3 = new Predmet(11, "Fizika");
	Predmet is4 = new Predmet(12, "Mehanika 1");
	Predmet is5 = new Predmet(21, "Masinski elementi");

	Student[] studenti = { st1, st2, st3, st4, st5 };

	Predmet[] ispiti = { is1, is2, is3, is4, is5 };

	public void stampajStudente() {
		System.out.println("==========SPISAK STUDENATA==================");
		for (int i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i]);
		}

	}

	public void stampajIspite() {
		System.out.println("==========SPISAK ISPITA=================");
		for (int i = 0; i < ispiti.length; i++) {
			System.out.println(ispiti[i]);
		}
	}

	public String nadjiStudentaPoBrojuIndeksa(String brojIndeksa) {
		
		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i].getBrojIndeksa().equals(brojIndeksa)) {
				return brojIndeksa;
			}  
			}
		return null;
		}
	}


