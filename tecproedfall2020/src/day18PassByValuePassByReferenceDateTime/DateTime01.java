package day18PassByValuePassByReferenceDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {
		
		//Date
		LocalDate currentDate01 = LocalDate.now();
		System.out.println(currentDate01);
		
		
		System.out.println(currentDate01.plusDays(3));
		System.out.println(currentDate01);
		System.out.println(currentDate01.plusMonths(4));
		System.out.println(currentDate01.plusYears(2));
		
		System.out.println(currentDate01.minusDays(5));
		
		//Time
		LocalTime currentTime01 = LocalTime.now();
		System.out.println(currentTime01);
		System.out.println(currentTime01.plusHours(2).plusMinutes(34));
		
		//Date and Time
		LocalDateTime currentDateTime01 = LocalDateTime.now();
		System.out.println(currentDateTime01);
		
		//how to update date format
		LocalDate currentDate02 = LocalDate.now();
		System.out.println(currentDate02);
		
		
		DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf02.format(currentDate02));
		System.out.println(dtf02.format(currentDate02.plusDays(11)));
		
		//how to update time format
		LocalTime currentTime02 = LocalTime.now();
		System.out.println(currentTime01);
		
		DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf03.format(currentTime02.plusHours(3)));
		
		DateTimeFormatter dtf04 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf04.format(currentTime02));
		
		//how to get local time of any city or country
		LocalTime localtime = LocalTime.now((ZoneId.of("Turkey")));
		System.out.println(localtime);
		LocalTime localtime2 = LocalTime.now((ZoneId.of("Europe/Moscow")));
		System.out.println(localtime2);
	
		
		
		
		
		
		

	}

}
