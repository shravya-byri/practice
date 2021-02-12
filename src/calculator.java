import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter operation");
        String operation = input.nextLine();
        System.out.println("operation is: " + operation);
        while (!operation.equals("exit")) {
  // Read user input
             //int a;
             int a = input.nextInt();
             int b = input.nextInt();
             switch (operation){
                 case "a":
                     System.out.println(a+b);
                     break;
                 case "s":
                     System.out.println(a-b);
                     break;
                 case "m":
                     System.out.println(a*b);
                     break;
                 case "d":
                     System.out.println("quotient is " + a/b + " and remainder is " + a%b);
                     break;
             }
             System.out.print("new line");
            System.out.println("Enter operation");
            operation = input.next();
            System.out.println("operation1 is: " + operation);
        }
    }
}

