package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {
		// Given
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", Convert.num2text("1"));
	}

	@Test
	public void test_num2text_deux() {
		Assert.assertEquals("deux", Convert.num2text("2"));
	}

	@Test
	public void test_num2text_trois() {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}

	@Test
	public void test_num2text_quatre() {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}

	@Test
	public void test_num2text_cinq() {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}

	@Test
	public void test_num2text_six() {
		Assert.assertEquals("six", Convert.num2text("6"));
	}

	@Test
	public void test_num2text_sept() {
		Assert.assertEquals("sept", Convert.num2text("7"));
	}

	@Test
	public void test_num2text_huit() {
		Assert.assertEquals("huit", Convert.num2text("8"));
	}

	@Test
	public void test_num2text_neuf() {
		Assert.assertEquals("neuf", Convert.num2text("9"));
	}
}
