
import java.util.Scanner;

public class GlavniMeni {

	Nizovi ni = new Nizovi();
	ListaPrijava lp = new ListaPrijava();

	public void pravljenjeGlavnogMenija() {
		String izbor;
		String unos;

		do {

			System.out.println("============================================");
			System.out.println("Izaberite neku od opcija");
			System.out.println("1. Izbor pregleda podataka");
			System.out.println("2. Unos nove prijave");
			System.out.println("3. Izmena podataka");
			System.out.println("0. Kraj");
			System.out.println("============================================");
			System.out.println("Vas izbor: ");

			Scanner scanner = new Scanner(System.in);
			izbor = scanner.next();

			switch (izbor) {
			case "1":

				meniIzbor(null);
				break;

			case "2":
				Scanner scanner8 = new Scanner(System.in);
				boolean polozio = false;
				System.out.println("Unesite sifru predmeta:");
				int sifraIspita = scanner8.nextInt();
				System.out.println("Unesite broj indeksa:");
				String brojIndeksa = scanner8.next();
				for (Prijava current : lp.getPrijavljivanje()) {
					if ((brojIndeksa.equals(current.getBrojIndeksa())) && (sifraIspita == (current.getSifraIspita()))
							&& current.getOcena() > 5) {
						polozio = true;
						System.out.println("============================================");
						System.out.println("========NIJE MOGUCE UNETI PRIJAVU!!!========");
						System.out.println("==Student sa unetim brojem indeksa je vec===");
						System.out.println(
								"===polozio taj ispit dana " + current.getDatumPolaganja().toString() + ", sa ===");
						System.out.println("==============ocenom: " + current.getOcena() + " ====================");
						System.out.println("============================================");
						break;
					}
				}
				if (polozio == false) {
				System.out.println("Unesite datum polaganja ispita (u formatu DD.MM.GGGG.):");
				String datumPolaganja = scanner8.next();
				System.out.println("Unesite ocenu (ocena mora biti izmedju 5 i 10):");
				int ocena = scanner8.nextInt();
				if ((ocena >= 5) && (ocena <= 10)) {
					Prijava p = new Prijava(sifraIspita, brojIndeksa, datumPolaganja, ocena);
					lp.dodajPrijavu(p);

					System.out.println("============================================");
					System.out.println("Uneli ste sledecu prijavu ispita:");
					lp.stampajPrijave(p);
					System.out.println("============================================");
					break;
				} else {
					System.out.println("============================================");
					System.out.println("=====NISTE UNELI ODGOVARAJUCU OCENU!!!======");
					System.out.println("============================================");
					break;
				}
					}
				
				
				break;
				

			case "3":
				meniIzmena(null);
				break;

			case "0":
				System.out.println("===============KRAJ=========================");
				break;

			default:
				System.out.println("Niste uneli odgovarajucu opciju!");
				break;
			}
		} while (!izbor.equals("0"));
	}

	void meniIzbor(String izbor2) {
		do {
			System.out.println("============================================");
			System.out.println("Izaberite zeljeni pregled");
			System.out.println("a - Pregled svih predmeta");
			System.out.println("b - Pregled svih studenata");
			System.out.println("c - Pregled svih prijava za trazenog studenata");
			System.out.println("d - Spisak studenata koji su polozili ispit");
			System.out.println("e - Povratak u glavni meni");
			System.out.println("============================================");
			System.out.println("Vas izbor: ");

			Scanner scanner2 = new Scanner(System.in);
			izbor2 = scanner2.next();

			switch (izbor2) {
			case "a":
				ni.stampajIspite();
				break;

			case "b":
				ni.stampajStudente();
				break;

			case "c": {
				String s2;
				System.out.println("Unesite broj indeksa:");
				Scanner scanner3 = new Scanner(System.in);
				s2 = scanner3.next();
				int i = 0;
				for (Prijava current : lp.getPrijavljivanje()) {
					if (s2.equals(current.getBrojIndeksa())) {
						lp.stampajPrijave(current);
						i++;
					}
				}
				if (i == 0) {
					System.out.println("Nema zabelezenih prijava za uneti broj indeksa!");
				}
			}
				break;

			case "d": {
				int s3;
				System.out.println("Unesite sifru ispita:");
				Scanner scanner4 = new Scanner(System.in);
				s3 = scanner4.nextInt();
				int i = 0;
				for (Prijava current : lp.getPrijavljivanje()) {
					if (s3 == current.getSifraIspita() && current.getOcena()>5) {
						lp.stampajPrijave(current);
						i++;
					}
				}
				if (i == 0) {
					System.out.println("Nema zabelezenih prijava za unetu sifru predmeta!");
				}
			}
				break;

			case "e":
				System.out.println("========POVRATAK U GLAVNI MENI==============");
				break;
			default:
				System.out.println("Niste uneli odgovarajucu opciju!");
				break;
			}
			break;
		} while (izbor2 != "e");

	}

	void meniIzmena(String izbor3) {

		do {

			System.out.println("============================================");
			System.out.println("Izaberite zeljenu opciju:");
			System.out.println("a - Izmena podataka o studentu");
			System.out.println("b - Povratak u glavni meni");
			System.out.println("============================================");
			System.out.println("Vas izbor: ");

			Scanner scanner2 = new Scanner(System.in);
			izbor3 = scanner2.next();

			switch (izbor3) {

			case "a":

				Scanner scanner5 = new Scanner(System.in);
				Scanner scanner6 = new Scanner(System.in);
				String s5;
				int s6;
				System.out.println("Unesite broj indeksa:");
				s5 = scanner5.next();
				int j = 0;
				for (int i = 0; i < ni.studenti.length; i++) {
					if (s5.equals(ni.studenti[i].getBrojIndeksa())) {

						System.out.println("Trenutni podaci o studentu sa unetim brojem indeksa:");
						System.out.println(ni.studenti[i].toString());
						System.out.println("============================================");

						System.out.println("Unesite izmenjeno ime:");
						s5 = scanner5.next();
						ni.studenti[i].setIme(s5);

						System.out.println("Unesite izmenjeno prezime:");
						s5 = scanner5.next();
						ni.studenti[i].setPrezime(s5);

						System.out.println("Unesite izmenjenu godinu upisa:");
						s6 = scanner6.nextInt();

						System.out.println("Unesite izmenjeni datum rodjenja u formatu dd.mm.gggg. :");
						s5 = scanner5.next();
						if (Datum.primiDatum(s5)==null) {
							System.out.println("Datum rodjenja nije izmenjen!");
							System.out.println("============================================");
							System.out.println("==IZMENA IZVRSENA IZUZEV DATUMA RODJENJA!===");
							System.out.println("============================================");
							System.out.println("Novi podaci o studentu sa unetim brojem indeksa:");
							System.out.println(ni.studenti[i].toString());
							System.out.println("============================================");
							
						} else {
						ni.studenti[i].setDatumRodjenja(Datum.primiDatum(s5));
						
						System.out.println("============================================");
						System.out.println("IZMENA IZVRSENA!");
						System.out.println("============================================");
						System.out.println("Novi podaci o studentu sa unetim brojem indeksa:");
						System.out.println(ni.studenti[i].toString());
						System.out.println("============================================");
						}
						j++;
					}

				}

				if (j == 0) {
					System.out.println("Ne postoji student sa datim brojem indeksa!");
				}
				break;

			case "b":
				System.out.println("========POVRATAK U GLAVNI MENI==============");
				break;
			default:
				System.out.println("Niste uneli odgovarajucu opciju!");
				break;
			}
			break;
		} while (izbor3 != "b");

	}
}
