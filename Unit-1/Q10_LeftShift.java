public class Q10_LeftShift {
    public static void main(String[] args) {
        /*Q10. Write a java program to display powers of 2 i.e. 2,4,8,16 etc up to 
1024 using bitwise operators  */

        for(int i=1; i<=10; i++){
            int value = 1 << i;    // 1 << i ==> 1*(2^i)
            System.out.println(value);
        }
    }
}
