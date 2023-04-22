import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        System.out.println("----------\nPERFECT\n----------");
        System.out.println("Enter a Number : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt() , a=1;
        for (int i = 2; i <n; i++) {
            if (n%i==0) {
                a=a+i;
            }
        }
        if (n==a) {
            System.out.println(n+" is perfect");
        } else {
            System.out.println(n+" is not perfect");
        }
    }
    
}
