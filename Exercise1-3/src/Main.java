import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

       int beforeSwappingx1 = x;
       int beforeSwappingy1 = y;

       System.out.println("Before Swapping : x:" + beforeSwappingx1 + "       " + "y:" + beforeSwappingy1);

       int temp = x;
       x = y;
       y = temp;

        System.out.println("After Swapping : x:" + x + "       " + "y:" + y );
        

    }
}