import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:= ");
		int num = sc.nextInt();
		
		System.out.println("Original Number:= "+num);
		System.out.println("Binary Format:= "+Integer.toBinaryString(num));
		System.out.println("Octal Format:= "+Integer.toOctalString(num));
		
	}
}