import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,c,r,rev=0;

        System.out.println("enter any number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0 ){
            r = n % 10;
            System.out.print(r);
            rev=rev*10+r;
            n = n / 10;
            }
        if(rev==c){
            System.out.println("its palindrome");}
            else{
            System.out.println("not palindrome");
            }
        }
    }

