import java.util.Random;

public class EmployeeWages {
	public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		CalculateDailyWages();
}

public static void CalculateDailyWages()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	int RatePerHour = 20;
	int FullDayHour = 8;
	int TotalWages = 0;
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
		TotalWages = RatePerHour * FullDayHour;
		System.out.println("Daily Wages  : "+ TotalWages);
		
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
}

} 

