import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first Name: ");
   boolean isValidFirstName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",sc.nextLine());
        if(isValidFirstName==false){
            System.out.println("Please enter valid name-First name should starts with Capitl and has minimum 3 characters");
        }
        System.out.println("Please enter Last name: ");
        boolean isValidLastName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",sc.nextLine());
        if(isValidLastName==false){
            System.out.println("Please enter valid LastName - Last name should starts with Cap and has minimum 3 characters");
        }
        System.out.println("Please enter email id: ");
        boolean isValidEmailId = Pattern.matches("^[a-z]{0,40}[@]{1}[a-z]{0,15}[.]{1}[a-z]{5}",sc.nextLine());
        if(isValidEmailId==false){
            System.out.println("Please enter valid email id");
        }
        System.out.println("Please enter mobile number: ");
        boolean isValidMblNumber = Pattern.matches("^[0-9]{2}\s[0-9]{10}",sc.nextLine());
        if(isValidMblNumber==false){
            System.out.println("Please enter valid mobile number - E.g. 91 9919819801 - Country code, space and 10 digit number");
        }



    }
}