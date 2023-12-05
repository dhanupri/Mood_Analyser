import java.util.Scanner;

public class Mood_Analayser {
    String analyseMood(String message){

        if(message.equals("Happy")){
            return "Happy";
        }
        if(message.equals("Sad")){
            return "Sad";
        }
        return "unknown";

    }
    public static void main(String[] args){

        Mood_Analayser mood_analayser=new Mood_Analayser();
        Scanner sc=new Scanner(System.in);
        String mood =mood_analayser.analyseMood(sc.nextLine());

        System.out.println("The mood is:"+mood);



    }
}
