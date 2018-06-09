import java.util.Scanner;

class Fib{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Enter the no. of elements you want");
        int n = reader.nextInt();
        reader.close();
        if (n == 1) {
            System.out.println(a);
        }
        else if (n == 2) {
            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println(a);
            System.out.println(b);
            while ((n-2) != 0) {
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
                n--;    
            }
            
        }
    }
}