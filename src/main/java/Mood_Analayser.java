import java.util.Locale;
import java.util.Scanner;

public class Mood_Analayser {
    String analyseMood(String message){

            if(message.toLowerCase().contains("sad")){
                return "SAD";
            }
            if(message.equals("I am in Any Mood")){
                return "HAPPY";
            }


        return "unknown";

    }
    public static void main(String[] args){

        Mood_Analayser mood_analayser=new Mood_Analayser();
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();

        String mood =mood_analayser.analyseMood(sentence);

        System.out.println("The mood is:"+mood);



    }
}
