import java.util.Scanner;

public class ignoreCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Any Name: ");
        String name = sc.next();
        
        if(name.equalsIgnoreCase("Aiman")){
            System.out.println("Name Entered Is " + name);
        }
    }
}
