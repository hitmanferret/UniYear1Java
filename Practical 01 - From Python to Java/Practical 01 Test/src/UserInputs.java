import java.util.Scanner;

public class UserInputs{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = keyboard.nextInt();

        System.out.println("Integer entered is: "
                            + number);
        keyboard.close();
    }
}