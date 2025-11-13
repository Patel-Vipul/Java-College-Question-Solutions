public class Q4_Array {
   public static void main(String[] args) {
       /*rite program to create an array of company name and another 
array of price quoted by the company. Fetch the company name 
who has quoted the lowest amount. */

    String companyName[] = {"Tata", "Reliance", "Adidev", "Suzuki", "Honda", "Hero"};
    int price[] = {800,3000,5999,1000, 900, 4500};

    int lowest = price[0];
    int index = 0;

    // for(int i=0; i<price.length; i++){
    //     for(int j=1; j<price.length; j++){
    //         if(lowest>price[j]){
    //             lowest = price[j];
    //             index = j;
    //         }
    //     }
    // }

    for(int i=1; i<price.length; i++){
        if(lowest>price[i]){
            lowest = price[i];
            index = i;
    }
    }

    System.out.println("Company that quoted the lowest price:= "+companyName[index]);
    System.out.println("The lowest Price:= "+lowest);
   } 
}
