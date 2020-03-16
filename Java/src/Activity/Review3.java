package Activity;

import java.util.Scanner;

class Review3 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		int a,b,c;
		double d,sum=0,n;
		
		//Display ad UI
		
		System.out.println(" ");
		System.out.println(" 		REVIEW 3 ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("		Enter  Number");
		System.out.print("	A=  ");
		a=input.nextInt();
		System.out.print("	B= ");
		b=input.nextInt();
		System.out.print("	C= ");
		c=input.nextInt();
		System.out.print("	D= ");
		d=input.nextDouble();
		
		//LOOP
		while (d>=1)
		{
			//Sum and Quotient
			//rule conditions
			sum= a+b+c;
			n=sum%d;
			
			//Display Output
			if (d<2) 
			{
			
				System.out.println(" ");
				System.out.print("	The number Entered D=" + d);
				System.out.println(" is Invalid");
				System.out.println(" ");
				System.out.println("	Therefore the Program is Terminated");
			
			}
			
				System.out.println(" ");
				System.out.println("	The sum of A,B,C = " + sum);
				System.out.println(" ");
				System.out.println("	The Quotient D is= " + d);
				System.out.println(" ");
				System.out.println("	The remainder of the Quotient is= " + n);
			
		
			break;	
		}
		
	}

}
