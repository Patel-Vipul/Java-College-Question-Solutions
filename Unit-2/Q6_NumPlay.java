


class NumberData {

    int numbers[] = new int[5];

    public NumberData(int numbers[]) {
        this.numbers = numbers;
    }

}

class NumPlay extends NumberData {

    public NumPlay(int numbers[]) {
        super(numbers); //calls the parent constructor
    }

    //display 
    void displayNumbers() {
        System.out.print("Numbers are := ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    //sum
    int sum() {
        int s = 0;
        for (int n : numbers) {
            s += n;
        }
        return s;
    }

    //average
    float average() {
        int a = sum();
        return (float)a / numbers.length;

    }

    //maximum
    int maximum(){
        int max = numbers[0];
        for(int n: numbers){
            if(n>max){
                max = n;
            }
        }
        return max;
    }

    //Minimum
    int minimum(){
        int min = numbers[0];
        for(int n: numbers){
            if(n<min){
                min = n;
            }
        }
        return min;
    }


}

public class Q6_NumPlay {

    public static void main(String[] args) {
        /*
         * Create a class called NumberData that accept any array of the five 
            numbers. Create a sub class called Numplay which provides 
            methods for followings: 
            1. Display numbers entered. 
            2. Sum of the number. 
            3. Average of the numbers. 
            4. Maximum of the numbers. 
            5. Minimum of the numbers. 
            Create a class that provides menu for above methods. Give choice 
            from the command-line argument. 
         */

         int numbers[] = new int[5];

         for(int i=0; i<5; i++){
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Plase Enter 5 Value");
            }
         }

         NumPlay np = new NumPlay(numbers);
         int choice = Integer.parseInt(args[5]);

       
            // System.out.println("Enter 1 to display all the numbers");
            // System.out.println("Enter 2 to find the sum of all numbers");
            // System.out.println("Enter 3 to find the average of all numbers");
            // System.out.println("Enter 4 to find the Maximum of all numbers");
            // System.out.println("Enter 5 to find the Minimum of all numbers");

            switch (choice) {
                case 1:
                np.displayNumbers();
                break;

                case 2:
                System.out.println("Sum:= "+np.sum());
                break;

                case 3:
                System.out.println("Average:= "+np.average());;
                break;

                case 4:
                System.out.println("Maximum:= "+np.maximum());;
                break;

                case 5:
                System.out.println("Minimum:= "+np.minimum());;
                break;

                default:
                System.out.println("Invalid Choice");
            }
    

    }
}
