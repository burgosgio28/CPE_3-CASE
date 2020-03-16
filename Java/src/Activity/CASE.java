package Activity;


import java.util.Scanner;

class CASE {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		System.out.println("	CASE");
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Enter year: ");
		int yr = input.nextInt();
		
		System.out.println(" ");
		System.out.print("Enter Month: ");
		int m = input.nextInt();

		System.out.println(" ");
		System.out.println("Sunday:0-Saturday:6");
		System.out.print("Enter first day: ");
		int day = input.nextInt();

		{
			String monthN=" ";
			int numDays=0;
			switch (m)
			{
			case 1:
				monthN="January ";
				numDays=31;
				break;
			case 2:
				monthN="February ";
				if ((yr%4 == 0 && yr%100 != 0) || yr%400 == 0 )
					numDays=29;
				else numDays=28;
				break;
			case 3:
				monthN="March ";
				numDays=31;
				break;
			case 4:
				monthN="April ";
				numDays=30;
				break;
			case 5:
				monthN="May ";
				numDays=31;
				break;
			case 6:
				monthN="June ";
				numDays=30;
				break;
			case 7:
				monthN="July ";
				numDays=31;
				break;
			case 8:
				monthN="August ";
				numDays=31;
				break;
			case 9:
				monthN="September ";
				numDays=30;
				break;
			case 10:
				monthN="October ";
				numDays=31;
				break;
			case 11:
				monthN="November ";
				numDays=30;
				break;
			case 12:
				monthN="December ";
				numDays=31;
				break;
		}
		
			System.out.println(" ");
			System.out.println("             " + monthN + yr);		
			System.out.println("_______________________________________");
			System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			for (int sp=1; sp<=day; sp++)
					System.out.print("      ");
			for (int p=1; p<=numDays; p++)
			{	
				if (day%7==0 && day!=0)
					System.out.println();
				System.out.printf("%3d   ", p);
				day+=1;
			}
			day%=7;
			
		}
	}

}
