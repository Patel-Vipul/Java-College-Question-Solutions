import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String:= ");
		String str1 = sc.nextLine(); 
		
		boolean isExit = false;
		
		while(!isExit){
			
			System.out.println("--------Menu--------");
			System.out.println("Enter '1' to Display the original string");
			System.out.println("Enter '2' to Display the string in uppercase");
			System.out.println("Enter '3' to Display the string in lowercase");
			System.out.println("Enter '4' to Check the equality with other string");
			System.out.println("Enter '5' to get a substring from given string");
			System.out.println("Enter '6' to Exit");
			
			System.out.print("Enter your choice:= ");
			byte choice = sc.nextByte();
			
			switch(choice){
				case 1:
				System.out.println("Original String:= "+str1);
				break;
				
				case 2:
				System.out.println("String in Uppercase:= "+str1.toUpperCase());
				break;
				
				case 3:
				System.out.println("String in Lowercase:= "+str1.toLowerCase());
				break;
				
				case 4:
				
				System.out.print("Enter another string:= ");
	
				String str2 = sc.nextLine();
				str2 = sc.nextLine();
				System.out.println();
				if(str1.equals(str2)) System.out.println("Both String are Equal");
				else System.out.println("Both String are different");
				break;
				
				case 5:
				System.out.print("Enter Starting Index:= ");
				int start = sc.nextInt();
				System.out.print("Enter Ending Index:= ");
				int end = sc.nextInt();
				if(start<0 || end>str1.length() || start>=end) System.out.println("Invlaid Range!");
				else System.out.println("New Substring:= " + str1.substring(start,end));
				break;
				
				case 6:
				System.out.println("Thank You!");
				isExit = true;
				break;
				
				default:
				System.out.println("Invalid Choice");
				
			}
			
			
		}
		
		
	}
}