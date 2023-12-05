import java.util.Scanner;
class InvalidException extends Exception{
    InvalidException(String message){
        super(message);
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

            if(message.equals("I am in Sad Mood")){
                return "SAD";
            }
            if(message.equals("I am in Any Mood")){
                return "HAPPY";
            }
            if(message.equals("I am in Happy Mood")){
                return "HAPPY";
            }


        return "unknown";

    }
    public static void Validate(String message1) throws InvalidException{

        if(message1.toLowerCase().equals("null") || message1.length()==0){
            throw new InvalidException("User input can't be Null or Empty");

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
            System.err.println("Error"+e.getMessage());

        }



    }
}
