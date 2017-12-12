package fr.simplifia.input.locale;


import java.util.Locale;
import org.junit.Test;

import static org.testng.Assert.*;


public class LocaleExtractorTest {
	
	@Test
	public void testToLocale() throws Exception {
		assertEquals(Locale.FRENCH, LocaleExtractor.toLocale("fr"));
	}

	@Test 
	public void testToLocaleEn() throws Exception {
		assertEquals(Locale.ENGLISH, LocaleExtractor.toLocale("en"));

	}

	@Test(expected = NullPointerException.class)
	public void testToLocaleNull() throws Exception {
		LocaleExtractor.toLocale(null);
	}

	@Test(expected = fr.simplifia.input.exception.InputException.class)
	public void testToLocaleNEmpty() throws Exception {
		assertEquals(null, LocaleExtractor.toLocale(""));
	}



 
}