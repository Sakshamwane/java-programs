import java.util.Scanner;
class PrimeNumbersInAGivenRange{

    public static void main(String[] args){
        int start, end;
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();

        for (int i = start; i<=end; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        for (int i = num-1; i>=2; i--){
            if (num%i==0){
                return false;
            }
        }
    return true;}
}