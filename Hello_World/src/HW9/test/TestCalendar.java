package HW9.test;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import HW9.main.Calendar;

class TestCalendar {
	
	Calendar c1;

	@ParameterizedTest
	@ValueSource(ints= {1624,1948,2004,2008})
	public void Should_return_true(int year) {
		c1 = new Calendar(year);
		assertTrue(c1.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints= {1625,1949,2005,2021})
	public void Should_return_false(int year) {
		c1 = new Calendar(year);
		assertFalse(c1.isLeapYear());	}

	@ParameterizedTest
	@ValueSource(ints = {1932,2005,2008,2013,2020,2021})
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar c= new GregorianCalendar();
		assertTrue(c.isLeapYear(year));
		
	
		
	}

	// Create a new method for boundary testing
	@ParameterizedTest
	@ValueSource(ints = {-1,1900,2100,2200,0})
	public void Should_return_boundaries(int year) {
		c1 = new Calendar(year);
		assertFalse(c1.isLeapYear());
	}
}