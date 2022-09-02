import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,c,r,s=0,arm=0;
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        c=n;
        while(n>0) {
            r = n % 10;
            s = r * r * r;
            //System.out.println(s);
            n = n / 10;
            arm = arm + s;
        }
            System.out.println(arm);
        if(arm==c) {
            System.out.println("num is armstrong");
        }
        else {
            System.out.println("not armstrong");
        }

    }
}
