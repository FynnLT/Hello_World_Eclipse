package HW9.main;

public class Calendar {

	public int year;

	public Calendar(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		return (this.year > 0 && this.year % 4 == 0) && (this.year % 100 != 0 || this.year % 400 == 0);
	}
}