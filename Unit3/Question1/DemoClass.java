import P.PackClass;
import java.util.Scanner;

public class DemoClass{
	public static void main(String[] args){
		PackClass pc = new PackClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:= ");
		int a =  sc.nextInt();
		System.out.print("Enter a number:= ");
		int b =  sc.nextInt();
		System.out.print("Enter a number:= ");
		int c =  sc.nextInt();
		
		int max = pc.findMax(a,b,c);
		System.out.print("Maximum Number is  "+max);
		sc.close();
	}
}