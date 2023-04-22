import java.util.*;
public class G_C_D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("----------\nG C D\n----------");
        System.out.println("Enter 2 numbeer");
        int n1=sc.nextInt(),n2=sc.nextInt(),gcd=1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1%i==0 && n2%i==0)
                gcd=i;  
        }
        System.out.println(gcd);
    }
    
}
