import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first Name: ");
   boolean isValidFirstName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",sc.nextLine());
        if(isValidFirstName==false){
            System.out.println("Please enter valid name");
        }


    }
}