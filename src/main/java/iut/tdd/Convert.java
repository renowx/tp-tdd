package iut.tdd;

public class Convert {

	public static String[] tab = new String[] { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };

	public static String[] tab2 = new String[] { "zéro", "un", "deux", "trois",
			"quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze",
			"douze", "treize", "quatorze", "quinze", "seize" };

	public static String[] tab3 = new String[] { "10", "20", "30", "40", "50",
			"60", "70", "80", "90" };
	public static String[] tab4 = new String[] { "dix", "vingt", "trente",
			"quarante", "cinquante", "soixante" };

	
	
	public static String num2text(String input) {
		String pot = null;
		int num = Integer.parseInt(input);
		if (num <= 16) {
			for (int i = 0; i < tab.length; i++) {
				if (input == tab[i]) {
					pot = tab2[i];
				}
			}
		}
		if (num > 16) {
			if (input.substring(0,1).equals("1")) {
				pot = "dix-" + tab2[num - 10];
			} else {
				pot = input.substring(0,1);
			}
		} 
		return pot;
	}

	public static String text2num(String input) {
		return null;
	}

}