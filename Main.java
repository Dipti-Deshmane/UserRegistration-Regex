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
        System.out.println("Please enter Last name FirstName: ");
        boolean isValidLastName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",sc.nextLine());
        if(isValidLastName==false){
            System.out.println("Please enter valid LastName");
        }
        System.out.println("Please enter email id: ");
        boolean isValidEmailId = Pattern.matches("^[a-z]{0,40}[@]{1}[a-z]{0,15}[.]{1}[a-z]{5}",sc.nextLine());
        if(isValidEmailId==false){
            System.out.println("Please enter valid email id");
        }


    }
}