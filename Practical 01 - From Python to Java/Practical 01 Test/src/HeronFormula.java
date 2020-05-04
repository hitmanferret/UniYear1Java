import java.lang.Math;
import java.util.Scanner;

public class HeronFormula{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter length of side A: ");
        double side_a = keyboard.nextInt();
        System.out.print("Enter length of side B: ");
        double side_b = keyboard.nextInt();
        System.out.print("Enter length of side C: ");
        double side_c = keyboard.nextInt();

        double formula_s = (side_a + side_b + side_c)/2;

        // System.out.println("Triangle semi perimeter is: " + formula_s);

        double area = Math.sqrt((formula_s*((formula_s - side_a)*(formula_s - side_b)*(formula_s - side_c))));

        System.out.println("Triangle area is: " + area);

        keyboard.close();
    }
}