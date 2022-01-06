import java.util.Scanner;

class Prime{
    public static void main(String[] args){
        int num, i, flag=0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        for(i=2; i<num; i++){
            if (num%i == 0){
                flag = 1;
                break;
            }   
        }

        if(flag == 0){
            System.out.println(num + " is a prime number");
        } else{
            System.out.println(num + " is not a prime number");
        }
    }
}