package iut.tdd;

public class Convert {

	public static String[] tab = new String[] { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10", "20", "30", "40", "50", "60", "70", "80",
			"90" };
	public static String[] tab2 = new String[] { "zéro", "un", "deux", "trois",
			"quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "vingt",
			"trente", "quarante", "cinquante", "soixante", "soixante-dix",
			"quatre-vingt", "quatre-vingt-dix" };

	public static String num2text(String input) {
		String pot = null;
		for (int i = 0; i < tab.length; i++) {
			if (input == tab[i]) {
				pot = tab2[i];
			}
		}
		return pot;
	}

	public static String text2num(String input) {
		return null;
	}

}