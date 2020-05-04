import java.util.Scanner;

public class SumInt{
    public static void main(String[] args){
        int current_number = 1;
        int total = 0;
        Scanner keyboard = new Scanner(System.in);
        while (current_number != 0){
            System.out.print("Enter an integer: ");
            int number = keyboard.nextInt();

        if (number == 0){
            current_number = 0;
        }else{
            total += number;
        }
        }
        keyboard.close();
        System.out.println("Total of integers = " + total);
    }
}