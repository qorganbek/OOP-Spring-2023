import java.util.Scanner;
public class Main {

    static boolean isPrime(int number){
        if (number == 0 || number == 1){
            return  false;
        }
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);
        int number = MyScan.nextInt();

        if(isPrime(number)){
            System.out.println("This number is prime");
            return;
        }
        System.out.println("This number is not prime");

    }
}
