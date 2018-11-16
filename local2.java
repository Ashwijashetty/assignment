package date_example;
	

	import java.time.LocalDate;
	import java.time.Month;
	import java.time.Period;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;


public class local2 {

		public static void main(String[] args) {
			DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("enter date in dd/mm/yyyy format ");
			String input =scanner.nextLine();
			LocalDate enteredDate=LocalDate.parse(input,formatter);
			System.out.println(enteredDate);
			scanner.close();
		
		
		/*LocalDate currentdate=LocalDate.now();
		Period diff=enteredDate.until(currentdate);
		System.out.println("Years : "+diff.getYears());
		System.out.println("Months : "+diff.getMonths());
		System.out.println("Days : "+diff.getDays());
	*/}
	}

