import java.util.*;

public class Division {
	
	public static void main(String Args[]){
	
		int num1 = 0;
		int num2 = 0;
		int quo;
		int flag = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		try{
		num1 = scan.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Did not input a valid number");
			flag += 1;
		}
		
		if(flag != 1){
		System.out.println("Enter the second number:");
		try{
		num2 = scan.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Did not input a valid number");
			flag += 1;
		}
		}
		
		if(flag != 1){
		try{
			quo = num1/num2;
			System.out.println("The quotient is " + quo);
			System.out.println("Program closed properly");
		}
		catch (ArithmeticException e){
			System.out.println("Can not divide by zero");
			System.out.println("Progam closed because there was incorrect format for one of the arguments");
		}
		}
		else{
			System.out.println("Progam closed because there was incorrect format for one of the arguments");
		}
		
		scan.close();
		
	}
}