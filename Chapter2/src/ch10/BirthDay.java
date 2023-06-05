package ch10;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	
	private boolean isDayValid;
	private boolean isMonthValid;
	private boolean isYearValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(day<1 || day>31) {
			isDayValid = false;
		} else {
			isDayValid = true;
			this.day = day;
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month>12) {
			isMonthValid = false;
		} else {
			isMonthValid = true;
			this.month = month;
		}		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>2023) {
			isYearValid = false;
		} else {
			isYearValid = true;
			this.year = year;
		}
		this.year = year;
	}
	
	public void showDate() {
		if(isDayValid && isMonthValid && isYearValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일");
		} else {
			System.out.println("유효하지 않은 날짜입니다");
		}
	}
	
	
}
