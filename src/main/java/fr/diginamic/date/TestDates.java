package fr.diginamic.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TestDates {

	
	
	public static void main(String[] args) {
		
		//Date
		Date date = new Date(119,10,20, 23, 30, 59);
		System.out.println(date);
		
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formattage.format(date));
		
		Date date2 = new Date();
		System.out.println(formattage.format(date2));
		
		//calendar
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.HOUR_OF_DAY, 23);
		c1.set(Calendar.MINUTE, 30);
		c1.set(Calendar.SECOND, 59);
		
		Date date3 = c1.getTime();

		SimpleDateFormat formattage2 = new SimpleDateFormat("dd/MM/yyyy ");
		
		System.out.println(formattage2.format(date3));
		System.out.println(formattage.format(date3));

		Calendar c2 = Calendar.getInstance();
		Date date4 = c2.getTime();
		
		SimpleDateFormat formattage3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(formattage3.format(date4));
	}

}
