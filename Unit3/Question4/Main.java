import SUMPACKAGE.*;
import MULPACKAGE.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter a number: ");
		int b = sc.nextInt();
		
		Sum s = new Sum();
		Mul m = new Mul();
		
		s.setData(a,b);
		System.out.println("Sum := "+s.calData());
		
		m.setData(a,b);
		System.out.println("Product:= "+m.calcData());

	}
}