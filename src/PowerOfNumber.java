import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n,p,result=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        System.out.println("enter the power");
        p=sc.nextInt();
        for(int i=1; i<=p; i++){
            result=n*result;
        }
        System.out.println("power of the number"+result);
    }
}
