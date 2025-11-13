

public class Main{
	public static void main(String[] args){
		
		
		if(args.length == 0) {
			System.out.println("Please, Enter a String");
			return;
		}
		
		String str = args[0];
		int length = str.length();
		String rev = "";
		int upperCount = 0;
		int lowerCount = 0;
		
		//Reverse
		System.out.println("Characters in reverse order: ");
		for(int i=length-1; i>=0; i--){
			System.out.println(str.charAt(i));
			rev += str.charAt(i);
		}
		
		
		System.out.print("\n\n");
		System.out.print("\n\n");
		System.out.println("-----Character with their position-----");
		for(int i=0; i<length; i++){
			char ch = str.charAt(i);
			System.out.println("Character "+ch+" is at Position "+(i+1));
			
			if(Character.isUpperCase(ch)) upperCount++;
			if(Character.isLowerCase(ch)) lowerCount++;
		}
		
		System.out.print("\n\n");
		if(str.equals(rev)){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		System.out.print("\n\n");
		System.out.print("Total Uppercase letters:= "+upperCount);
		System.out.print("\nTotal LowerCase letters:= "+lowerCount);
		
	}
}