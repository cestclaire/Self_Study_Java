package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1 : Week.SUNDAY; break;
			
		switch(week) {
			case 2 : Week.MONDAY; break;
			
		switch(week) {
			case 3 : Week.TUESDAY; break;
			
		switch(week) {
			case 4 : Week.WEDNESDAY; break;
			
		switch(week) {
			case 5 : Week.THURSDAY; break;
			
		switch(week) {
			case 6 : Week.FRIDAY; break;
			
		switch(week) {
			case 7 : Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
