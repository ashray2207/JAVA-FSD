import java.util.Scanner;
public class pract3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a , b;
        System.out.println("ENTER TWO NUMBERS:");
        a= scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("Enter operation to perform:");
        System.out.println("1. ADDITION\n2. SUBTRACTION\n3. MULTIPLICATION\n4. DIVISION\n");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Addition is:"+(a+b));
                break;
            case 2:
                System.out.println("Subtraction is:"+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is:"+(a*b));
                break;
            case 4:
                System.out.println("division is:"+(a/b));
                break;
            default:
                System.out.println("Invalid choice!!!!!");
                break;
        }
    }