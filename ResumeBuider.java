import java.util.Scanner;

public class ResumeBuider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you  full Name    :  ");
        String Name = scanner.nextLine();
        System.out.println("Enter you Email Address :  ");
        String Email = scanner.nextLine();
        System.out.println("Enter your phone number :  ");
        String Phone = scanner.nextLine();
        System.out.println("Enter your address      :  ");
        String addrss = scanner.nextLine();
        System.out.println("Enter your professional title : ");
        String Title = scanner.nextLine();
        System.out.println("Enter your summary statement  : ");
        String Summary = scanner.nextLine();

        System.out.println("\n resume");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("Name    :  " + Name);
        System.out.println("Email   : " + Email);
        System.out.println("Phone   :  " + Phone);
        System.out.println("Address :  " + addrss);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("professional  Title : "  + Title );
        System.out.println("Summary :  " + Summary );


    }
}