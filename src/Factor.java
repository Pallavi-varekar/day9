import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter the number");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
