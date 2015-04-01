package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {

	// test des chiffres
	@Test
	public void test_num2text_chiffre() {
		Assert.assertEquals("zéro", Convert.num2text("0"));
		Assert.assertEquals("un", Convert.num2text("1"));
		Assert.assertEquals("deux", Convert.num2text("2"));
		Assert.assertEquals("trois", Convert.num2text("3"));
		Assert.assertEquals("quatre", Convert.num2text("4"));
		Assert.assertEquals("cinq", Convert.num2text("5"));
		Assert.assertEquals("six", Convert.num2text("6"));
		Assert.assertEquals("sept", Convert.num2text("7"));
		Assert.assertEquals("huit", Convert.num2text("8"));
		Assert.assertEquals("neuf", Convert.num2text("9"));
	}

	// test des dizaines
	@Test
	public void test_num2text_dizaine() {
		Assert.assertEquals("dix", Convert.num2text("10"));
		Assert.assertEquals("onze", Convert.num2text("11"));
		Assert.assertEquals("douze", Convert.num2text("12"));
		Assert.assertEquals("treize", Convert.num2text("13"));
		Assert.assertEquals("quatorze", Convert.num2text("14"));
		Assert.assertEquals("quinze", Convert.num2text("15"));
		Assert.assertEquals("seize", Convert.num2text("16"));
	}

}
