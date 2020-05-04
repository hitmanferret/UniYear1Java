import java.util.Scanner;

// public class Sentences{

//     public static void main(String[] args){

//         Scanner keyboard = new Scanner(System.in);
//         System.out.print("Enter a sentence without punctuation: ");
//         String sentence = keyboard.nextLine();

//         sentence = sentence.replaceAll("\\s","");

//         System.out.println(sentence);

//         keyboard.close();
//     }
// }


public class Sentences{

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence without punctuation: ");
        String sentence = keyboard.nextLine();
        
        String letter = "";
        String new_sentence = "";
        for(int i = 0, n = sentence.length() ; i < n ; i++) { 
            char c = sentence.charAt(i);
            if (i == 0){
                c = Character.toTitleCase(c);
            }
            if (c == ' '){
                c = sentence.charAt(i + 1);
                c = Character.toUpperCase(c);
                new_sentence += c;
            }else{
                new_sentence += c;
            }
        }
        sentence = sentence.replaceAll("\\s","");

        System.out.println(new_sentence);

        keyboard.close();
    }
}