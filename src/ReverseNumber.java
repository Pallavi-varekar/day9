import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n,r;
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("reverse number: ");
        while(n>0){
            r=n%10;
            System.out.print(r);

            n=n/10;
        }
    }
}
