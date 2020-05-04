import java.util.ArrayList;

// public class TextUtils{
//     public static void main(String[] args){
//         String text = "Hello I am a piece of text";
//         ArrayList<String> result = split(text);
//         System.out.println(result);
//     }
//         public static ArrayList<String> split(String text) {
//             String new_string = "";
//             ArrayList<String> string_array = new ArrayList<String>(0);
//             for (int i = 0, n = text.length() ; i < n ; i++){
//                 if (text.charAt(i) != ' '){
//                     new_string += text.charAt(i);
//                 }else{
//                     string_array.add(new_string);
//                     new_string = "";
//                 }
//             }
//             string_array.add(new_string);
//             return string_array;
//     }
// }

public class TextUtils{
    public static void main(String[] args){
        String text = "Hello, I! am!? a,.? piece of? text.,";
        String seperators = ",.!? ";
        ArrayList<String> result = split(text, seperators);
        System.out.println(result);
    }
        public static ArrayList<String> split(String text, String seperators) {
            String new_string = "";
            ArrayList<String> string_array = new ArrayList<String>(0);
            for (int i = 0, n = text.length() ; i < n ; i++){
                if (seperators.contains(String.valueOf(text.charAt(i))) && new_string != ""){
                    string_array.add(new_string);
                    new_string = "";
                }else{
                    if (new_string == "" && seperators.contains(String.valueOf(text.charAt(i)))){
                    }else{
                        new_string += text.charAt(i);
                    }
                }
            }
            if (new_string != ""){
                string_array.add(new_string);
            }
            return string_array;
    }
}