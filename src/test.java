import java.util.Scanner;

public class test {
    static int sum;
    public static void main(String[] args) {
        int a, b;
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter value of A: ");
        a=obj1.nextInt();
        Scanner obj2= new Scanner(System.in);
        System.out.println("Enter value of B: ");
        b=obj2.nextInt();
        sum=a+b;
        System.out.println("Sum ="+sum);
        System.out.println("Test");

    }
}
