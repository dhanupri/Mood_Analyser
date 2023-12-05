import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;
class InvalidException extends Exception{
    InvalidException(MoodAnalysisError message){
        super(message.getMsg());
    }
}
enum MoodAnalysisError{
    NULL("mood can't be null or empty"),
    ;

    public String msg;


    MoodAnalysisError(String s) {
        this.msg=s;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

public class Mood_Analayser extends Exception {

    String message;
    //default constructor
    Mood_Analayser(){
        this.message="";

    }

    //constructor with parameter
    Mood_Analayser(String message){
        this.message=message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String analyseMood() {

            if(message.toLowerCase().contains("sad")){
                return "SAD";
            }
            if(message.equals("I am in Any Mood")){
                return "HAPPY";
            }
            if(message.toLowerCase().contains("happy")){
                return "HAPPY";
            }


        return "unknown";

    }
    public static void Validate(String message1) throws InvalidException{

        if(message1.toLowerCase().equals("null") || message1.length()==0){
            throw new InvalidException(MoodAnalysisError.NULL);

        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String sentence=sc.nextLine();

        try{
            Validate(sentence);


        //default constructor
        Mood_Analayser mood_analayser1=new Mood_Analayser();
        mood_analayser1.setMessage(sentence);
        String result_mood=mood_analayser1.analyseMood();
        System.out.println("The mood is :"+result_mood);


        //Constructor with parameters
        Mood_Analayser mood_analayser=new Mood_Analayser(sentence);


        String mood =mood_analayser.analyseMood();

        System.out.println("The mood is :"+mood);
        } catch (InvalidException e) {
          System.err.println("ERROR:"+e.getMessage());


        }



    }
}
