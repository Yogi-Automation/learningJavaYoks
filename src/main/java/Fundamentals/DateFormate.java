package Fundamentals;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormate {
public static void main(String[] args) {
	System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString());
	System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM.yyyyss")));
	String str = "asdfgt";
	 str.substring(0, str.length() - 4);
	System.out.println(str);
	Date cutoffDate = new Date(new Date().getTime() - 250000000);
	System.out.println(cutoffDate);
	}
}
