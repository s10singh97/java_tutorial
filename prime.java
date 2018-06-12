import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("PRIME NUMBER FINDER\n======================================");
        System.out.println("Enter a number");
        int n = reader.nextInt();
        int c = 0;
        for (int i = 1; i <= n/2; i++){
            if (n%i == 0){
                c++;
            }
        }
        if (c > 1){
            System.out.println(n + " is not a Prime Number");
        }
        else{
            System.out.println(n + " is a Prime Number");
        }
    }
}