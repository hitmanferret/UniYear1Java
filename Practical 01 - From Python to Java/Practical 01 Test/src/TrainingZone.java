import java.util.Scanner;

public class TrainingZone{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = keyboard.nextInt();
        System.out.print("Enter training heartrate: ");
        int heartrate = keyboard.nextInt();

        double maximum_heartrate = (208 - (0.7*age));

        if (heartrate >= 0.9*maximum_heartrate){
            System.out.println("Your training zone is Interval training");
        }else if (heartrate < (0.9*maximum_heartrate) && (heartrate >= (0.7*maximum_heartrate))){
            System.out.println("Your training zone is Threshold training");
        }else if (heartrate < (0.7*maximum_heartrate) && (heartrate >= (0.5*maximum_heartrate))){
            System.out.println("Your training zone is Aerobic training");
        }else{
            System.out.println("Your training zone is Couch potato");
        }
        keyboard.close();
    }
}