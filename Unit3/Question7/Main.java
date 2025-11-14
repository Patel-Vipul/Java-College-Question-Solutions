public class Main{
	public static void main(String[] args){
		
		String str = "Hello, Good Morning";
		
		System.out.println("Original String:= "+str);
		System.out.println("Length of the Original String:= "+str.length());
		
		StringBuffer sb = new StringBuffer(str);
		int start = str.indexOf("Morning");
		int end = start+ "Morning".length();
		
		sb.replace(start,end,"Evenging");
		String updatedStr = sb.toString();
		
		System.out.println("-------------------");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println("Updated String:= "+updatedStr);
		System.out.println("Length of the Updated string:= "+updatedStr.length());
		
		
	}
}