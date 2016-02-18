import java.util.*;
public class Scanerpractice
{
    static Scanner key = new Scanner(System.in);
    public static void manin(String[] args) {
        System.out.println("Do you want to take a quick survey.(3 is yes 2 is no)");
        int y = key.nextInt();
        
            if(y >= 3) {
            System.out.println("Great let's get started!");
        }
            else if(y <= 2) {
            System.out.println("Too bad u doin it. ;)");
        }
        String r = key.nextLine();
        System.out.println("Tell me you name.");
        String z = key.nextLine();
        System.out.println("Tell me your age.");
        String b = key.nextLine();
        System.out.println("Tell me your height.");
        double c = key.nextDouble();
        
        System.out.println("Your name is " + z + ", your age is " + b + ", your height is " + c);
        System.out.println("THX for your personal info. ;)");
        System.out.println("JK");
        System.out.println("Or am I");
        System.out.println("Da Da Da");
        System.out.println(z);
        System.out.println("I'm watching you");
        System.out.println("JK");
        System.out.println(";)");
}
}