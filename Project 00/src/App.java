import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int temporary;
        Scanner input = new Scanner(System.in);
        // Input Handling:
        System.out.println("Enter 3 whole numbers:");
        int smallest = input.nextInt();
        int middle = input.nextInt();
        int biggest = input.nextInt();
        System.out.println("--------------------------------");
        input.close();
        // Logic:
        if (smallest > middle) {
            temporary = smallest;
            smallest = middle;
            middle = temporary;            
        }
        if (smallest > biggest) {
            temporary = smallest;
            smallest = biggest;
            biggest = temporary;
        } // Here, we have the smallest value in the 'smallest' vriable.
        if (middle > biggest) {
            temporary = middle;
            middle = biggest;
            biggest = temporary;
        }
        // Resul Printing:
        System.out.println("Your numbers in ascending order:");
        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(biggest);
    }
}
