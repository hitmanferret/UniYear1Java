import java.util.Scanner;

public class ToBinary{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a binary string to be converted to decimal: ");
        String binary_str = keyboard.next();
        int result = ToBinary.toBase10(binary_str);
        System.out.println(result);
        keyboard.close();
    }
    public static int toBase10(String binary){
        int string_length = binary.length();
        int decimal = 0;
        int count = string_length - 1;
        char b1 = '1';
        for (int i = 0, n = (string_length) ; i < n ; i++) {
            if (binary.charAt(i) == b1){
                decimal += Math.pow(2, count);
            }
            count -= 1;
        }
        return decimal;
    }
}