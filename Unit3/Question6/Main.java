import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		boolean hasDigit = false;
		int digitCount = 0;
		
		System.out.print("Enter a String:= ");
		String str = sc.nextLine();
		
		if(str.length()<5){
			System.out.println("Invalid: String must be atleast 5 Characters!");
			return;
		}
		
		for(int i=0; i<str.length(); i++){
			if(Character.isDigit(str.charAt(i))){
				hasDigit = true;
				digitCount++;
			}
		}
		
		System.out.println("-------------------");
		if(hasDigit && digitCount<str.length()) System.out.println("Valid String:= "+str);
		else System.out.println("Invalid: String must contain atleast one digit and atleast one character!");
		
		sc.close();
	}
}