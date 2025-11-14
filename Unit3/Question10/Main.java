import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:= ");
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.print("Capacity before append:= "+sb.capacity());
		
		System.out.print("\nEnter another String:= ");
		String str2 = sc.nextLine();
		
		sb.append(str2);
		
		System.out.println("Capacity after append:= "+sb.capacity());
		System.out.println("Final String= "+sb);
		
		
	}
}