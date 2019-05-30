

public class Datum {

	private int dan;
	private int mesec;
	private int godina;

	public Datum(int dan, int mesec, int godina) {
		this.dan = dan;
		this.mesec = mesec;
		this.godina = godina;
	}

	public Datum(final Datum d) {
		this(d.dan, d.mesec, d.godina);
	}

	public static int prestupna(int godina) {
		if (godina % 400 == 0 || godina % 4 == 0 && godina % 100 != 0)
			return 1;
		return 0;
	}

	public static int daniUmesecu(int mesec, int godina) {
		switch (mesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return 28 + prestupna(godina);
		default:
			return 0;
		}
	}

	public static boolean validan(int g, int d, int m) {
		return g > 1900 && (m >= 1 && m <= 12) && (d >= 1 && d <= daniUmesecu(m, g));
	}

	public static Datum primiDatum(String datumS) {
		if (datumS.length() != 11) {
			System.out.println("Pogresna duzina unosa datuma");
			return null;
		}
		if (datumS.charAt(2) != '.' || datumS.charAt(5) != '.' || datumS.charAt(10) != '.') {
			System.out.println("Neispravan format unosa");
			return null;
		}

		int dan = 0;
		int mesec = 0;
		int godina = 0;
		try {
			dan = Integer.parseInt(datumS.substring(0, 2));
			mesec = Integer.parseInt(datumS.substring(3, 5));
			godina = Integer.parseInt(datumS.substring(6, 10));
		} catch (NumberFormatException e) {
			System.out.println("Neispravan format unosa");
			return null;
		}
		if (Datum.validan(godina, dan, mesec))
			return new Datum(dan, mesec, godina);
		else {
			System.out.println("Neispravna vrednost dana, meseca ili godine");
			return null;
		}
	}

//	public boolean pre(final Datum d) {
//		return godina < d.godina || (godina == d.godina && (mesec < d.mesec || (mesec == d.mesec && dan < d.dan)));
//	}

	public int getDan() {
		return dan;
	}

	public int getMesec() {
		return mesec;
	}

	public int getGodina() {
		return godina;
	}

	public String toString() {
		String danS = (dan < 10) ? "0" + dan : "" + dan;
		String mesecS = (mesec < 10) ? "0" + mesec : "" + mesec;
		return danS + "." + mesecS + "." + godina + ".";
	}
}
