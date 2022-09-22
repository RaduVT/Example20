import java.util.Scanner;

public class Example20 {
    public static void main(String[] args){
        double year;
        System.out.println("Enter a year:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        year = inputValue.nextDouble();

         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
         } else {
             System.out.println(year+ " leap year");
         }
    }
}
