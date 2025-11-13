public class Q5_RightAngle {
    public static void main(String[] args) {
         /*
          * Write a program to calculate the hypotenuse of right angled 
triangle when other sides 
of the triangle are given. (Hypotenuse = square root (x*x + Y *Y)) 
          */

        float height = 5.0f;
        float base = 4.0f;


        double hypotenuse = Math.floor(Math.sqrt(height*height + base*base));

        System.out.println("Hypotesnue of the right-nagled-triangle is "+hypotenuse);
    }
}
