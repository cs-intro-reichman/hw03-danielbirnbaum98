/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar
{	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int sundayFirst = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) 
	{
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    int givenYear = Integer.parseInt(args[0]);
	    
	    while (year < givenYear)
	    {
	    	advance();
	    }
	    while (year < (givenYear + 1))
	    {
	    System.out.print(dayOfMonth + "/" + month + "/" + year);
	 		if (dayOfWeek == 1)
	 		{
	 			System.out.print(" Sunday");
	 		}
	 		debugDaysCounter++;
	 		System.out.println();
	 		advance();	
	    }
	   }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() 
	 {
		if (dayOfMonth < nDaysInMonth(month, year)) 
		{
			dayOfMonth++;
		}
		else 
		{
			dayOfMonth = 1;
			if (month < 12)
			{
				month++;
			}
			else 
			{
				month = 1;
				year ++;
			}
		}
		dayOfWeek ++;
		if (dayOfWeek == 8)
		{
			dayOfWeek = 1;
		}
		if (dayOfWeek == 1 && dayOfMonth == 1)
		{
			sundayFirst++;
		}
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) 
	{
	    Boolean isLeapYear = false;
	    if ((year % 400) == 0 || (((year % 4) == 0) && ((year % 100) != 0)))
	    {
	    	isLeapYear = true;
	    }
		return isLeapYear;
	}
		 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) 
	{
		int numOfDays = 0; 
		switch (month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numOfDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			numOfDays = 30;
			break;
		default:
			numOfDays = 28;
			break;
		}
		if (numOfDays == 28 && (isLeapYear(year)))
		{
			numOfDays = 29;
		}
		return numOfDays;
	}
}
