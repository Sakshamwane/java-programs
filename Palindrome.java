import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        int n, temp, rev = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        temp = n;

        while(n>0){
            r = n%10;
            rev = (rev*10) + r;
            n = n/10;
        }

        if (rev == temp){
            System.out.println(temp + " is a palindrome number");
        } else{
            System.out.println(temp + " is not a palindrome number");
        }
    }
}