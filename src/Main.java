import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Value start: ");
        int n1 = scanner.nextInt();
        System.out.print("Value stop: ");
        int n2 = scanner.nextInt();

        System.out.print("Distance between prime numbers: ");
        int d = scanner.nextInt();

        afiseazaPerechiPrime(n1, n2, d);

    }

    private static void afiseazaPerechiPrime(int n1, int n2, int d){
        n1 = n1<2 ? 2 : n1;

        for(int i=n1; i<=n2-d; i++){
            if(isPrime(i) && isPrime(i+d))
                System.out.println(i+" - "+(i+d));
        }
    }

    private static boolean isPrime(int n){
            if (n%2==0) return false;
            for(int i=3;i*i<=n;i+=2) {
                if(n%i==0)
                    return false;
            }
            return true;
    }
}
