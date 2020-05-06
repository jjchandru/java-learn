package com.xyzbank.model;

import java.time.format.DateTimeFormatter;

public class DateConstants {

	public static DateTimeFormatter INPUT_DATE_FORMAT = 
			DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");

	public static DateTimeFormatter STATEMENT_DATE_FORMAT = 
			DateTimeFormatter.ofPattern("dd MMM yy HH:mm");

}
