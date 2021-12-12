package HW9.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import HW9.main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(5,calculator.add(2, 3) );	}

	@ParameterizedTest
	@CsvSource({"2,3", "4,5", "2,43"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		int var=calculator.add(valueOne, valueTwo);
		assertEquals(var,calculator.add(valueOne,valueTwo));	
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(-1,calculator.sub(2, 3) );	}
	
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(6,calculator.multiply(2, 3) );	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(2,calculator.divide(4, 2) );	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
assertt
	}
}