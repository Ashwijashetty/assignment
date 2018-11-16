package date_example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utildate3 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter date");
	String dt=scanner.nextLine();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	try {
		Date date=sdf.parse(dt);
		System.out.println(date);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
