import java.util.Scanner;

public class OrderCost{

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many kilograms of bananas do you want? ");
        int kilograms = keyboard.nextInt();
        
        double cost = (kilograms * 3) + 4.99;
        double total;

        if (cost > 50.00){
            total = (cost - 1.50);           
        }else{
            total = cost;
        }

        System.out.println("Your order total is: £" + total);

        keyboard.close();
    }
}