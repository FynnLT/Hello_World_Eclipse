package HW9.main;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		
		
		
		if (number%5==0 && number%7!=0) {
			return "Fizz";
		}
		else if (number%3==0 && number%7!=0) {
			return "buzz";
		}
		else if (number%5==0 && number%7==0) {
			return "Fizzbuzz";
		}
		else return "";
	}
}